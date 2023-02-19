package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Funciones")
@NamedQueries({
        @NamedQuery(name = "Funciones.findAll", query = "SELECT F FROM Funciones F"),
        @NamedQuery(name = "Funciones.insert",
                query = "INSERT INTO Funciones(horaInicio, horaFin, precio, sala, pelicula) " +
                "VALUES(:horarioInicio, :horarioFin, :precio, :sala, :pelicula)")
})
public class Funciones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFunciones")
    private Integer idFunciones;

    @Basic(optional = false)
    @Column(name = "horaInicio")
    private String horaInicio;

    @Basic(optional = false)
    @Column(name = "horaFin")
    private String horaFin;

    @Basic(optional = false)
    @Column(name = "precio")
    private String precio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSala")
    private Sala sala;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPelicula")
    private Pelicula pelicula;

    public Funciones(String horaInicio, String horaFin, String precio, Sala sala, Pelicula pelicula) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.precio = precio;
        this.sala = sala;
        this.pelicula = pelicula;
    }

    public Funciones() {

    }
}
