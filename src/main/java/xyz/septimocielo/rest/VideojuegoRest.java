package xyz.septimocielo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.septimocielo.model.Videojuego;
import xyz.septimocielo.dao.VideojuegoDAO;

import java.util.List;

@RestController
@RequestMapping(value = "/videojuego")
public class VideojuegoRest {

    @Autowired
    private VideojuegoDAO videojuegoDAO;

    @GetMapping("/videojuegos")
    public List<Videojuego> findAll(){
        return videojuegoDAO.findAll();
    }

    @GetMapping("/{id}")
    public Videojuego getOne(@PathVariable("id") Long id){
        return videojuegoDAO.getOne(id);
    }
}
