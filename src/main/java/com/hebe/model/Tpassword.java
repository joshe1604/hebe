/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hebe.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joshe
 */
@Entity
@Table(name = "tpassword")
public class Tpassword implements Serializable {
 
    private static final long serialVersionUID = 1L;
       
    @EmbeddedId
    private TpasswordPK id;
    
    @Column(name = "clave")
    private String clave;
        
    @Column(name = "estado")
    private String estado;
    
    
    @Column(name = "palabraref")
    private String palabraref;
        
    
    @Column(name = "fdesde")
    private Timestamp fdesde;
    
    @Column(name = "fhasta")
    private Timestamp fhasta;
       
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

    
    
    public Tpassword(TpasswordPK id, String clave, String estado, String palabraref, Timestamp fdesde, Timestamp fhasta) {
        this.id = id;
        this.clave = clave;
        this.estado = estado;
        this.palabraref = palabraref;
        this.fdesde = fdesde;
        this.fhasta = fhasta;
    }

     public Tpassword(String activo, String cusuariocreacion, Timestamp fcreacion, String cusuariomodificacion, Timestamp fmodificacion) {
        this.activo = activo;
        this.cusuariocreacion = cusuariocreacion;
        this.fcreacion = fcreacion;
        this.cusuariomodificacion = cusuariomodificacion;
        this.fmodificacion = fmodificacion;
    }

    
    public Tpassword() {
    }
    
     /**
     * @return the id
     */
    public TpasswordPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(TpasswordPK id) {
        this.id = id;
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

   
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPalabraref() {
        return palabraref;
    }

    public void setPalabraref(String palabraref) {
        this.palabraref = palabraref;
    }

    public Timestamp getFdesde() {
        return fdesde;
    }

    public void setFdesde(Timestamp fdesde) {
        this.fdesde = fdesde;
    }

    public Timestamp getFhasta() {
        return fhasta;
    }

    public void setFhasta(Timestamp fhasta) {
        this.fhasta = fhasta;
    }
    
}
