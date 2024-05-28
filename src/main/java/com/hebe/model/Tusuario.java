/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hebe.model;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "tusuario")
public class Tusuario {
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "cusuario", nullable = false)
    private String cusuario;
    
    @Column(name = "alias")
    private String alias;
    
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "ctipousuario")
    private Long ctipousuario;
    
    @Column(name = "activo")
    private String activo;
    
    @Column(name = "cusuariocreacion")
    private String cusuariocreacion;
    
    @Column(name = "fcreacion")
    private Timestamp fcreacion;
    
    @Column(name = "cusuariomodificacion")
    private String cusuariomodificacion;
    
    @Column(name = "fmodificacion")
    private Timestamp fmodificacion;

    /**
     * @return the cusuario
     */
    public String getCusuario() {
        return cusuario;
    }

    /**
     * @param cusuario the cusuario to set
     */
    public void setCusuario(String cusuario) {
        this.cusuario = cusuario;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the activo
     */
    public String getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(String activo) {
        this.activo = activo;
    }

    /**
     * @return the cusuariocreacion
     */
    public String getCusuariocreacion() {
        return cusuariocreacion;
    }

    /**
     * @param cusuariocreacion the cusuariocreacion to set
     */
    public void setCusuariocreacion(String cusuariocreacion) {
        this.cusuariocreacion = cusuariocreacion;
    }

    /**
     * @return the fcreacion
     */
    public Timestamp getFcreacion() {
        return fcreacion;
    }

    /**
     * @param fcreacion the fcreacion to set
     */
    public void setFcreacion(Timestamp fcreacion) {
        this.fcreacion = fcreacion;
    }

    /**
     * @return the cusuariomodificacion
     */
    public String getCusuariomodificacion() {
        return cusuariomodificacion;
    }

    /**
     * @param cusuariomodificacion the cusuariomodificacion to set
     */
    public void setCusuariomodificacion(String cusuariomodificacion) {
        this.cusuariomodificacion = cusuariomodificacion;
    }

    /**
     * @return the fmodificacion
     */
    public Timestamp getFmodificacion() {
        return fmodificacion;
    }

    /**
     * @param fmodificacion the fmodificacion to set
     */
    public void setFmodificacion(Timestamp fmodificacion) {
        this.fmodificacion = fmodificacion;
    }

    /**
     * @return the ctipousuario
     */
    public Long getCtipousuario() {
        return ctipousuario;
    }

    /**
     * @param ctipousuario the ctipousuario to set
     */
    public void setCtipousuario(Long ctipousuario) {
        this.ctipousuario = ctipousuario;
    }
    
}
