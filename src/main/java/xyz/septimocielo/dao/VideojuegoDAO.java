package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Videojuego;

public interface VideojuegoDAO extends JpaRepository<Videojuego, Integer> {

}
