package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.septimocielo.model.libro.LibroRepository;
import xyz.septimocielo.model.libro.Libro;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public Libro getOne(Long id){
        return libroRepository.findById(id).get();
    }

    public List<Libro> findAll(){

        return libroRepository.findAll();
    }
}
