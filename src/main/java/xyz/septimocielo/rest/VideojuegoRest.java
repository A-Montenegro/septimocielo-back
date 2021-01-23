package xyz.septimocielo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.septimocielo.model.Videojuego;
import xyz.septimocielo.dao.VideojuegoDAO;

import java.util.List;

@RestController
public class VideojuegoRest {

    @Autowired
    private VideojuegoDAO videojuegoDAO;

    @GetMapping("/videojuegos")
    public List<Videojuego> videojuegos(){
        return videojuegoDAO.findAll();
    }
}
