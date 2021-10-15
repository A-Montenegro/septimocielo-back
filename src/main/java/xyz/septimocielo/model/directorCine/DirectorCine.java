package xyz.septimocielo.model.directorCine;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="director_cine")
@Getter
@Setter
@NoArgsConstructor
public class DirectorCine {
    @Id
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
}