package xyz.septimocielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import xyz.septimocielo.model.videojuego.Videojuego;
import xyz.septimocielo.services.videojuego.VideojuegoService;

import java.util.List;

@RestController
@RequestMapping(value = "/videojuego")
public class VideojuegoController {

    @Autowired
    private VideojuegoService videojuegoService;

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Videojuego> findAll(){
        return videojuegoService.findAll();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Videojuego getOne(@PathVariable("id") Long id){
        Videojuego videojuego = videojuegoService.getOne(id);
        return videojuego;
    }
}
