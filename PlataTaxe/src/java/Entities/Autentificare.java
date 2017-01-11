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
@Table(name = "Autentificare")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autentificare.findAll", query = "SELECT a FROM Autentificare a")
    , @NamedQuery(name = "Autentificare.findById", query = "SELECT a FROM Autentificare a WHERE a.id = :id")
    , @NamedQuery(name = "Autentificare.findByNume", query = "SELECT a FROM Autentificare a WHERE a.nume = :nume")
    , @NamedQuery(name = "Autentificare.findByPrenume", query = "SELECT a FROM Autentificare a WHERE a.prenume = :prenume")
    , @NamedQuery(name = "Autentificare.findByParola", query = "SELECT a FROM Autentificare a WHERE a.parola = :parola")
    , @NamedQuery(name = "Autentificare.findByCnp", query = "SELECT a FROM Autentificare a WHERE a.cnp = :cnp")
    , @NamedQuery(name = "Autentificare.findByNumecard", query = "SELECT a FROM Autentificare a WHERE a.nume_card = :nume_card")
    , @NamedQuery(name = "Autentificare.findByNumarcard", query = "SELECT a FROM Autentificare a WHERE a.numar_card = :numar_card")
    , @NamedQuery(name = "Autentificare.findByLunaexpirare", query = "SELECT a FROM Autentificare a WHERE a.luna_expirare = :luna_expirare")
    , @NamedQuery(name = "Autentificare.findByAnexpirare", query = "SELECT a FROM Autentificare a WHERE a.an_expirare = :an_expirare")
    , @NamedQuery(name = "Autentificare.findByCvc", query = "SELECT a FROM Autentificare a WHERE a.cvc = :cvc")})
public class Autentificare implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    //@NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    
    @Size(max = 30)
    @Column(name = "parola")
    private String parola;
    
    @Size(max = 13)
    @Column(name = "CNP")
    private String cnp;

    @Size(max = 30)
    @Column(name = "nume")
    private String nume;
    
    @Size(max = 30)
    @Column(name = "prenume")
    private String prenume;
    
    @Size(max = 30)
    @Column(name = "nume_card")
    private String nume_card;
    
    @Size(max = 30)
    @Column(name = "numar_card")
    private String numar_card;
    
    @Size(max = 30)
    @Column(name = "luna_expirare")
    private String luna_expirare;
    
    @Size(max = 30)
    @Column(name = "an_expirare")
    private String an_expirare;

    public String getNume_card() {
        return nume_card;
    }

    public void setNume_card(String nume_card) {
        this.nume_card = nume_card;
    }

    public String getNumar_card() {
        return numar_card;
    }

    public void setNumar_card(String numar_card) {
        this.numar_card = numar_card;
    }

    public String getLuna_expirare() {
        return luna_expirare;
    }

    public void setLuna_expirare(String luna_expirare) {
        this.luna_expirare = luna_expirare;
    }

    public String getAn_expirare() {
        return an_expirare;
    }

    public void setAn_expirare(String an_expirare) {
        this.an_expirare = an_expirare;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
    
    @Size(max = 30)
    @Column(name = "cvc")
    private String cvc;
    

    public Autentificare() {
    }

    public Autentificare(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
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
        if (!(object instanceof Autentificare)) {
            return false;
        }
        Autentificare other = (Autentificare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;

    }
    @Override
    public String toString() {
        return "Entities.Autentificare[ id=" + id + " ]";
    }

   
    
    
}
