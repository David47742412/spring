package com.examen.prueba.logic.repository;

import com.examen.prueba.logic.model.Cine;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CineRepository extends JpaRepository<Cine, Integer> {
    @Query(name = "Cine.findAll")
    List<Cine> findAll();

    @Modifying
    @Transactional
    @Query(name = "Cine.insert")
    void insert(@Param("razonSocial") String razonSocial, @Param("nombre") String nombre);
}
