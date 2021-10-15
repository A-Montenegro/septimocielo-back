package xyz.septimocielo.services.videojuego;

import xyz.septimocielo.model.videojuego.Videojuego;

import java.util.List;

public interface VideojuegoService {
    public Videojuego getOne(Long id);
    public List<Videojuego> findAll();
}
