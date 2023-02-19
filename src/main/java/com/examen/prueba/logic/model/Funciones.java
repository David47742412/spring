package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "funciones")
@NamedQueries({
        @NamedQuery(name = "Funciones.findAll", query = "SELECT f FROM Funciones f"),
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

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "Pelicula")
    @Basic(optional = false)
    @Column(name = "pelicula")
    private Integer pelicula;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name ="sala")
    @Basic(optional = false)
    @Column(name = "sala")
    private Integer sala;

    public Funciones(String horaInicio, String horaFin, String precio, Integer sala, Integer pelicula) {
        super();
        this.setHoraInicio(horaInicio);
        this.setHoraFin(horaFin);
        this.setPrecio(precio);
        this.setSala(sala);
        this.setPelicula(pelicula);
    }

    public Funciones() {

    }

    public Integer getIdFunciones() {
        return idFunciones;
    }

    public void setIdFunciones(Integer idFunciones) {
        this.idFunciones = idFunciones;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getPelicula() {
        return pelicula;
    }

    public void setPelicula(Integer pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }
// public Pelicula getPelicula() {
//     return pelicula;
// }
//
// public void setPelicula(Pelicula pelicula) {
//     this.pelicula = pelicula;
// }
//
/*
    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

 */
}
