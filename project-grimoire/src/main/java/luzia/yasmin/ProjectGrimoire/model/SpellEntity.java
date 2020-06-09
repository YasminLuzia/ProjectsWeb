package luzia.yasmin.ProjectGrimoire.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Yasmin L
 * @since 04/26/2020 - 3:42pm
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString
@Entity
@Table(name = "spell")
public class SpellEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_spell")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "higher_levels")
    private String higher_levels;

    @Column(name = "range")
    private String range;

    @Column(name = "components")
    private String components;

    @Column(name = "material")
    private String material;

    @Column(name = "ritual")
    private boolean ritual;

    @Column(name = "duration")
    private String duration;

    @Column(name = "concentration")
    private boolean concentration;

    @Column(name = "casting_time")
    private String casting_time;

    @Column(name = "spell_level")
    private int spell_level;

    @Column(name = "magic_school")
    private String magic_school;

    @Column(name = "classes")
    private String classes;

}
