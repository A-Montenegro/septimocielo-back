package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.septimocielo.dao.VideojuegoDAO;
import xyz.septimocielo.model.Videojuego;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoDAO videojuegoDAO;

    public Videojuego getOne(Long id){
        return videojuegoDAO.findById(id).get();
    }

    public List<Videojuego> findAll(){

        return videojuegoDAO.findAll();
    }
}
