package xyz.septimocielo.model.autorLibro;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autor_libro")
@Getter
@Setter
@NoArgsConstructor
public class AutorLibro {
    @Id
    private Long id;

    private String nombre;
    private String apellido1;
    private String apellido2;
}
