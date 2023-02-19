package com.examen.prueba.logic.repository;

import com.examen.prueba.logic.model.Pelicula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Integer> {

    @Query(value = "SELECT p FROM Pelicula p")
    List<Pelicula> findAll();

    @Query(value = "SELECT p FROM Pelicula p WHERE p.idPelicula = ?1")
    Pelicula findByIdPelicula(Integer id);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.nombre = ?1")
    List<Pelicula> findByNombre(String nombre);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.duracion = ?1")
    List<Pelicula> findByDuracion(String duracion);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.clasificacion = ?1")
    List<Pelicula> findByClasificacion(String clasificacion);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.idioma = ?1")
    List<Pelicula> findByIdioma(String idioma);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.genero = ?1")
    List<Pelicula> findByGenero(String genero);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.formato = ?1")
    List<Pelicula> findByFormato(String formato);

    @Query(value = "SELECT p FROM Pelicula p WHERE p.sinopsis = ?1")
    List<Pelicula> findBySinopsis(String sinopsis);
}
