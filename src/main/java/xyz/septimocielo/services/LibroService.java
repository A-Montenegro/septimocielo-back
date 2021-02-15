package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.septimocielo.dao.LibroDAO;
import xyz.septimocielo.model.Libro;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroDAO LibroDAO;

    public Libro getOne(Long id){
        return LibroDAO.findById(id).get();
    }

    public List<Libro> findAll(){

        return LibroDAO.findAll();
    }
}
