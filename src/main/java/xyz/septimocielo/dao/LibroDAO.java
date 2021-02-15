package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Libro;

public interface LibroDAO extends JpaRepository<Libro, Long> {

}
