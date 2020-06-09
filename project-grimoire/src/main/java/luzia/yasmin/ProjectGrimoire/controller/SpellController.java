package luzia.yasmin.ProjectGrimoire.controller;

import luzia.yasmin.ProjectGrimoire.model.SpellEntity;
import luzia.yasmin.ProjectGrimoire.repository.SpellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yasmin L
 * @since 04/26/2020 - 3:55pm
 * @version 1.0
 */
@RestController
@RequestMapping("/spells")
public class SpellController {

    @Autowired
    private SpellRepository spellRepository;

    @GetMapping
    public ResponseEntity<List<SpellEntity>> findAll() {
        return new ResponseEntity<List<SpellEntity>>(
                (List<SpellEntity>) this.spellRepository.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<SpellEntity> findById(@PathVariable("id") long id) {
        if(this.spellRepository.findById(id).isPresent()) {
            return new ResponseEntity<SpellEntity>(
                    this.spellRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK
            );
        }
        return new ResponseEntity<SpellEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<SpellEntity> store(@RequestBody SpellEntity spellEntity) {
        return new ResponseEntity<SpellEntity>(
                this.spellRepository.save(spellEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<SpellEntity> update(@PathVariable("id") long id, @RequestBody SpellEntity spellEntity) throws Exception {
        if (id == 0 || !this.spellRepository.existsById(id)) {
            throw new Exception("The id does not exist or was not found.");
        }
        return new ResponseEntity<SpellEntity>(
                this.spellRepository.save(spellEntity),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<SpellEntity> delete(@PathVariable("id") long id) {
        this.spellRepository.deleteById(id);
        return new ResponseEntity<SpellEntity>(
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

}
