package com.examen.prueba.logic.repository;

import com.examen.prueba.logic.model.Funciones;
import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionesRepository extends JpaRepository<Funciones, Integer> {

    @Query(name = "")
    List<Funciones> findAll();

    @Query(name = "Funciones.insert")
    void insert(String horaInicio, String horaFin, String precio, Sala sala, Pelicula pelicula);
}
