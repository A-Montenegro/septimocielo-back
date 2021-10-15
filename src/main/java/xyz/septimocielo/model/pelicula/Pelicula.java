package xyz.septimocielo.model.pelicula;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pelicula")
@Getter
@Setter
@NoArgsConstructor
public class Pelicula {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private Long plataformaId;
    private Date fechaSalida;
}
