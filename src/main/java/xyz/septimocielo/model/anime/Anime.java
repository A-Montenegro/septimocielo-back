package xyz.septimocielo.model.anime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "anime")
public class Anime {

    @Id
    private Long id;

    private String nombre;
    private String descripcion;
    private BigDecimal numeroCapitulos;
    private BigDecimal minutosDuracion;
    private Date fechaSalida;
    private boolean esSalida;

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

    public BigDecimal getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(BigDecimal numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public BigDecimal getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(BigDecimal minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isEsSalida() {
        return esSalida;
    }

    public void setEsSalida(boolean esSalida) {
        this.esSalida = esSalida;
    }
}
