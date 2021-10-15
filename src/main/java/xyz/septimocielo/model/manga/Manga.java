package xyz.septimocielo.model.manga;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "manga")
@Getter
@Setter
@NoArgsConstructor
public class Manga {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private Long plataformaId;
    private Date fechaSalida;
}
