package xyz.septimocielo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.septimocielo.model.libro.Libro;
import xyz.septimocielo.services.LibroService;

import java.util.List;

@RestController
@RequestMapping(value = "/libro")
public class LibroController {

    @Autowired
    private LibroService LibroService;

    @GetMapping("/libros")
    public List<Libro> findAll(){
        return LibroService.findAll();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Libro getOne(@PathVariable("id") Long id){
        Libro Libro = LibroService.getOne(id);
        return Libro;
    }
}
