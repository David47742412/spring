package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cine")
@NamedQueries({
        @NamedQuery(name = "Cine.findAll", query = "SELECT c FROM Cine c"),
        @NamedQuery(name = "Cine.insert", query = "INSERT INTO Cine(razonSocial, nombre) VALUES(:razonSocial, :nombre)"),
        @NamedQuery(name = "Cine.findOne", query = "SELECT C FROM Cine C WHERE C.id = ?1")
})
public class Cine  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCine")
    private Integer idCine;
    @Basic(optional = false)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    public Cine(String razonSocial, String nombre) {
        super();
        this.setRazonSocial(razonSocial);
        this.setNombre(nombre);
    }

    public Cine() {

    }

    public Integer getIdCine() {
        return idCine;
    }

    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}