package luzia.yasmin.ProjectGrimoire.repository;

import luzia.yasmin.ProjectGrimoire.model.SpellEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yasmin L
 * @since 04/26/2020 - 3:40pm
 * @version 1.0
 */
@Repository
public interface SpellRepository extends CrudRepository<SpellEntity, Long> {

}
