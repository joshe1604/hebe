/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hebe.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author joshe
 */
@Embeddable
public class TpasswordPK implements Serializable{
   
    private static final long serialVersionUID = 1L;
       
    @Column(name = "cusuario", nullable = false)
    private String cusuario;
        
    @Column(name = "spassword", nullable = false)
    private Long spassword;

    
    public TpasswordPK() {
    }

    public TpasswordPK(String cusuario, Long spassword) {
        this.cusuario = cusuario;
        this.spassword = spassword;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.cusuario);
        hash = 17 * hash + Objects.hashCode(this.spassword);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TpasswordPK other = (TpasswordPK) obj;
        if (!Objects.equals(this.cusuario, other.cusuario)) {
            return false;
        }
        if (!Objects.equals(this.spassword, other.spassword)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TpasswordPK{" + "cusuario=" + cusuario + ", spassword=" + spassword + '}';
    }
        
    
    
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
     * @return the spassword
     */
    public Long getSpassword() {
        return spassword;
    }

    /**
     * @param spassword the spassword to set
     */
    public void setSpassword(Long spassword) {
        this.spassword = spassword;
    }
 
  
}
