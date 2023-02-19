package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.function.Function;

@Entity
@Table(name = "pelicula")
@NamedQueries({
        @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p"),
        @NamedQuery(name = "Pelicula.findByIdPelicula", query="SELECT p FROM Pelicula p WHERE p.idPelicula = :idPelicula"),
        @NamedQuery(name = "Pelicula.findByNombre", query = "SELECT p FROM Pelicula p WHERE p.nombre = :nombre"),
        @NamedQuery(name = "Pelicula.findByDuracion", query = "SELECT p FROM Pelicula p WHERE p.duracion = :duracion"),
        @NamedQuery(name = "Pelicula.findByClasificacion", query = "SELECT p FROM Pelicula p WHERE p.clasificacion = :clasificacion"),
        @NamedQuery(name = "Pelicula.findByIdioma", query = "SELECT p FROM Pelicula p WHERE p.idioma = :idioma"),
        @NamedQuery(name = "Pelicula.findByGenero", query = "SELECT p FROM Pelicula p WHERE p.genero = :genero"),
        @NamedQuery(name = "Pelicula.findByFormato", query = "SELECT p FROM Pelicula p WHERE p.formato = :formato"),
        @NamedQuery(name = "Pelicula.findBySinopsis", query = "SELECT p FROM Pelicula p WHERE p.sinopsis = :sinopsis")
})
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPelicula")
    private Integer idPelicula;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula")
    private List<Funciones> funciones;

    public Pelicula() {

    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
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

    public Pelicula(String nombre, String duracion, String clasificacion, String idioma, String genero, String formato,
                    String sinopsis) {
        super();
        this.nombre = nombre;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.idioma = idioma;
        this.genero = genero;
        this.formato = formato;
        this.sinopsis = sinopsis;
    }

}
