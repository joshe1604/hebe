/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hebe.model;

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
@Table(name = "usuario")
public class Tusuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private String idUsuario;
    @Column(name = "Domicilio")
    private boolean domicilio;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    public Tusuario() {
    }

    public Tusuario(String idUsuario, boolean domicilio) {
        this.idUsuario = idUsuario;
        this.domicilio = domicilio;
    }
    
}
