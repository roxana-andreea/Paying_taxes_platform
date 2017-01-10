/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rox
 */
@Entity
@Table(name = "PlataCI")
@XmlRootElement
public class PlataCI implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="nume")
    private String nume;
    
    @Column(name="prenume")
    private String prenume;
    
    @Column(name="prenume_tata")
    private String prenume_tata;
    
    @Column(name="prenume_mama")
    private String prenume_mama;
    
    @Column(name="CNP")
    private String cnp;
    
    @Column(name="oras_natal")
    private String oras_natal;
    
    @Column(name="judet_natal")
    private String judet_natal;
    
    @Column(name="zi_nastere")
    private String zi_nastere;
    
    @Column(name="luna_nastere")
    private String luna_nastere;
    
    @Column(name="an_nastere")
    private String an_nastere;
    
    @Column(name="oras_actual")
    private String oras_actual;
    
    @Column(name="judet_actual")
    private String judet_actual;
    
    @Column(name="strada")
    private String strada;
    
    @Column(name="nr_strada")
    private String nr_strada;
    
    @Column(name="bloc")
    private String bloc;
    
    @Column(name="scara")
    private String scara;
    
    @Column(name="etaj")
    private String etaj;
    
    @Column(name="apartament")
    private String apartament;

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

    public String getPrenume_tata() {
        return prenume_tata;
    }

    public void setPrenume_tata(String prenume_tata) {
        this.prenume_tata = prenume_tata;
    }

    public String getPrenume_mama() {
        return prenume_mama;
    }

    public void setPrenume_mama(String prenume_mama) {
        this.prenume_mama = prenume_mama;
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

    public String getOras_actual() {
        return oras_actual;
    }

    public void setOras_actual(String oras_actual) {
        this.oras_actual = oras_actual;
    }

    public String getJudet_actual() {
        return judet_actual;
    }

    public void setJudet_actual(String judet_actual) {
        this.judet_actual = judet_actual;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNr_strada() {
        return nr_strada;
    }

    public void setNr_strada(String nr_strada) {
        this.nr_strada = nr_strada;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getCetatenie() {
        return cetatenie;
    }

    public void setCetatenie(String cetatenie) {
        this.cetatenie = cetatenie;
    }
    
    @Column(name="cetatenie")
    private String cetatenie;
   
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
        if (!(object instanceof PlataCI)) {
            return false;
        }
        PlataCI other = (PlataCI) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PlataCI[ id=" + id + " ]";
    }
    
}
