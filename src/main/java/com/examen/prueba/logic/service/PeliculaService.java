package com.examen.prueba.logic.service;

import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.repository.PeliculaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PeliculaService  {

    public PeliculaService(PeliculaRepository repository) {
        this.repository = repository;
    }

    private final PeliculaRepository repository;

    public List<Pelicula> findAll() {
        return this.repository.findAll();
    }

    public Pelicula findByIdPelicula(Integer id) {
        return this.repository.findByIdPelicula(id);
    }

    public List<Pelicula> findByNombre(String nombre) {
        return this.repository.findByNombre(nombre);
    }

    public List<Pelicula> findByDuracion(String duracion) {
        return this.repository.findByDuracion(duracion);
    }

    public List<Pelicula> findByClasificacion(String clasificacion) {
        return this.repository.findByClasificacion(clasificacion);
    }

    public List<Pelicula> findByIdioma(String idioma) {
        return this.repository.findByIdioma(idioma);
    }

    public List<Pelicula> findByGenero(String genero) {
        return this.repository.findByGenero(genero);
    }

    public List<Pelicula> findByFormato(String formato) {
        return this.repository.findByFormato(formato);
    }

    public List<Pelicula> findBySinopsis(String sinopsis) {
        return this.repository.findBySinopsis(sinopsis);
    }

}
