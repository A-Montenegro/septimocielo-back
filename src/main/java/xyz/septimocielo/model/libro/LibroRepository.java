package xyz.septimocielo.model.libro;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.libro.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
