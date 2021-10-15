package xyz.septimocielo.services.libro;

import xyz.septimocielo.model.libro.Libro;

import java.util.List;

public interface LibroService {
    public Libro getOne(Long id);
    public List<Libro> findAll();
}
