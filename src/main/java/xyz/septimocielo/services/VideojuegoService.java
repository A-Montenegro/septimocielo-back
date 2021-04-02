package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.septimocielo.model.videojuego.VideojuegoRepository;
import xyz.septimocielo.model.videojuego.Videojuego;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    public Videojuego getOne(Long id){
        return videojuegoRepository.findById(id).get();
    }

    public List<Videojuego> findAll(){

        return videojuegoRepository.findAll();
    }
}
