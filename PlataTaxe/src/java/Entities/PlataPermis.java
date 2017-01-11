/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rox
 */
@Entity
@Table(name = "PlataPermis")
public class PlataPermis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Column(name="nume")
    private String nume;
    
    @Column(name="prenume")
    private String prenume;

    
    @Column(name="CNP")
    private String cnp;
    
    @Column(name="oras_natal")
    private String oras_natal;
    
        
    @Column(name="judet_natal")
    private String judet_natal;
    
    @Column(name="zi_nastere")
    private String zi_nastere;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getOras_natal() {
        return oras_natal;
    }

    public void setOras_natal(String oras_natal) {
        this.oras_natal = oras_natal;
    }

    public String getJudet_natal() {
        return judet_natal;
    }

    public void setJudet_natal(String judet_natal) {
        this.judet_natal = judet_natal;
    }

    public String getZi_nastere() {
        return zi_nastere;
    }

    public void setZi_nastere(String zi_nastere) {
        this.zi_nastere = zi_nastere;
    }

    public String getLuna_nastere() {
        return luna_nastere;
    }

    public void setLuna_nastere(String luna_nastere) {
        this.luna_nastere = luna_nastere;
    }

    public String getAn_nastere() {
        return an_nastere;
    }

    public void setAn_nastere(String an_nastere) {
        this.an_nastere = an_nastere;
    }
    
    @Column(name="luna_nastere")
    private String luna_nastere;
    
    @Column(name="an_nastere")
    private String an_nastere;
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlataPermis)) {
            return false;
        }
        PlataPermis other = (PlataPermis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PlataPermis[ id=" + id + " ]";
    }
    
}
