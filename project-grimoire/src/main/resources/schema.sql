drop table if exists spell;

create table spell(
    id_spell bigint auto_increment not null,
    name varchar(120) not null,
    description varchar(600) not null,
    higher_levels varchar(300) null,
    range varchar(120) not null,
    components varchar(10) not null,
    material varchar(300) null,
    ritual boolean not null,
    duration varchar(120) not null,
    concentration boolean not null,
    casting_time varchar(120) not null,
    spell_level int not null,
    magic_school varchar(120) not null,
    classes varchar(255) not null,
    primary key (id_spell));