package com.examen.prueba.logic.service;

import com.examen.prueba.logic.model.Categoria;
import com.examen.prueba.logic.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> findAll() {
        return this.repository.findAll();
    }

    public Categoria findOne(int id) {
        return this.repository.findOne(id);
    }

    public void insert(Categoria categoria) {
        this.repository.save(categoria);
    }

}
