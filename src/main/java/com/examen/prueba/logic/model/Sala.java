package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "sala")
@NamedQueries({

})
public class Sala implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSala")
    private Integer idSala;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    @Basic(optional = false)
    @Column(name = "capacidad")
    private int capacidad;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSede")
    private Sede sede;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sala")
    private List<Funciones> funciones;

}
