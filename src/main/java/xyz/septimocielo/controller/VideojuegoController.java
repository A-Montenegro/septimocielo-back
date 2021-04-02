package xyz.septimocielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.septimocielo.model.videojuego.Videojuego;
import xyz.septimocielo.services.VideojuegoService;

import java.util.List;

@RestController
@RequestMapping(value = "/videojuego")
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;

    @GetMapping("/videojuegos")
    public List<Videojuego> findAll(){
        return videojuegoService.findAll();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Videojuego getOne(@PathVariable("id") Long id){
        Videojuego videojuego = videojuegoService.getOne(id);
        return videojuego;
    }
}
