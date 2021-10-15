package xyz.septimocielo.model.videojuego;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "videojuego")
@Getter
@Setter
@NoArgsConstructor
public class Videojuego {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private Date fechaSalida;
}
