package com.examen.prueba.logic.repository;

import com.examen.prueba.logic.model.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    @Query(name = "Categoria.findAll")
    List<Categoria> findAll();

    @Query(name = "Categoria.findOne")
    Categoria findOne(int id);

}
