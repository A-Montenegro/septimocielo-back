package xyz.septimocielo.model.pelicula;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.pelicula.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
