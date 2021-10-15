package xyz.septimocielo.model.plataformaVideojuego;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "plataforma_videojuego")
@Getter
@Setter
@NoArgsConstructor
public class PlataformaVideojuego {

    @Id
    private Long id;

    private String nombre;
    private Date fechaLanzamiento;
}
