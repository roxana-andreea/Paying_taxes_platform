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
@Table(name = "PlataInmatriculare")
public class PlataInmatriculare implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="tip_inmatriculare")
    private String tip_inmatriculare ;
    
    @Column(name="serie_sasiu")
    private String serie_sasiu;

    public String getTip_inmatriculare() {
        return tip_inmatriculare;
    }

    public void setTip_inmatriculare(String tip_inmatriculare) {
        this.tip_inmatriculare = tip_inmatriculare;
    }

    public String getSerie_sasiu() {
        return serie_sasiu;
    }

    public void setSerie_sasiu(String serie_sasiu) {
        this.serie_sasiu = serie_sasiu;
    }

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
    
    @Column(name="nume")
    private String nume;
    
    @Column(name="prenume")
    private String prenume;
    
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
        if (!(object instanceof PlataInmatriculare)) {
            return false;
        }
        PlataInmatriculare other = (PlataInmatriculare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.PlataInmatriculare[ id=" + id + " ]";
    }
    
}
