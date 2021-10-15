package xyz.septimocielo.model.anime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "anime")
@Getter @Setter @NoArgsConstructor
public class Anime {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal numeroCapitulos;
    private BigDecimal minutosDuracion;
    private Date fechaSalida;
    private boolean esSalida;

}
