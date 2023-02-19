package com.examen.prueba.logic.service;

import com.examen.prueba.logic.model.Funciones;
import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.model.Sala;
import com.examen.prueba.logic.model.genericViewClass.GenericClass;
import com.examen.prueba.logic.repository.FuncionesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@Transactional
public class FuncionesService {

    private final FuncionesRepository repository;

    public FuncionesService(FuncionesRepository repository) {
        this.repository = repository;
    }

    public List<Funciones> findAll() {
        return this.repository.findAll();
    }

    public void insert(String horaInicio, String horaFin, String precio, Sala sala, Pelicula pelicula) {
        this.repository.insert(horaInicio, horaFin, precio, sala, pelicula);
    }

}
