package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Pelicula;

public interface PeliculaDAO extends JpaRepository<Pelicula, Long> {

}
