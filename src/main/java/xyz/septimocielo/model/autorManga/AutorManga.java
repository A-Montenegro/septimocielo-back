package xyz.septimocielo.model.autorManga;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autor_manga")
@Getter
@Setter
@NoArgsConstructor
public class AutorManga {
    @Id
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
}