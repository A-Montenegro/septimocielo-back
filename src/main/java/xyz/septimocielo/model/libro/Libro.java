package xyz.septimocielo.model.libro;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal numeroPaginas;
    private Date fechaSalida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(BigDecimal numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}
