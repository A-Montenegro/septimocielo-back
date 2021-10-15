package xyz.septimocielo.model.libro;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "libro")
@Getter
@Setter
@NoArgsConstructor
public class Libro {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal numeroPaginas;
    private Date fechaSalida;
}
