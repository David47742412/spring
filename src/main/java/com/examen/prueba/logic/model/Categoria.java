package com.examen.prueba.logic.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "categoria")
@NamedQueries({

})
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;

    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;


    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria() {

    }

    public Categoria(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

}
