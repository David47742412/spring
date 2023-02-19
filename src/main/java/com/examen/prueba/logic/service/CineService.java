package com.examen.prueba.logic.service;

import com.examen.prueba.logic.model.Cine;
import com.examen.prueba.logic.repository.CineRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CineService {

    private final CineRepository repository;

    public CineService(CineRepository repository) {
        this.repository = repository;
    }

    public List<Cine> findAll() {
        return this.repository.findAll();
    }

    public void insert(String razonSocial, String nombre) {
        this.repository.insert(razonSocial, nombre);
    }

}
