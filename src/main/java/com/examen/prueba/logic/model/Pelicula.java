package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pelicula")
@NamedQueries( {
    @NamedQuery(name = "findAll", query = "SELECT p FROM Pelicula p")
})
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPelicula")
    private int idPelicula;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    @Basic(optional = false)
    @Column(name = "duracion")
    private String duracion;

    @Basic(optional = false)
    @Column(name = "clasificacion")
    private String clasificacion;

    @Basic(optional = false)
    @Column(name = "idioma")
    private String idioma;

    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;

    @Basic(optional = false)
    @Column(name = "formato")
    private String formato;

    @Basic(optional = false)
    @Column(name = "sinopsis")
    private String sinopsis;

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
