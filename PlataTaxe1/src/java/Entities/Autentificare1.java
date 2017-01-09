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
@Table(name = "Autentificare1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autentificare1.findAll", query = "SELECT a FROM Autentificare1 a")
    , @NamedQuery(name = "Autentificare1.findById", query = "SELECT a FROM Autentificare1 a WHERE a.id = :id")
    , @NamedQuery(name = "Autentificare1.findByNume", query = "SELECT a FROM Autentificare1 a WHERE a.nume = :nume")
    , @NamedQuery(name = "Autentificare1.findByPrenume", query = "SELECT a FROM Autentificare1 a WHERE a.prenume = :prenume")
    , @NamedQuery(name = "Autentificare1.findByParola", query = "SELECT a FROM Autentificare1 a WHERE a.parola = :parola")
    , @NamedQuery(name = "Autentificare1.findByCnp", query = "SELECT a FROM Autentificare1 a WHERE a.cnp = :cnp")})
public class Autentificare1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nume")
    private String nume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Prenume")
    private String prenume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Parola")
    private String parola;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "CNP")
    private String cnp;

    public Autentificare1() {
    }

    public Autentificare1(Integer id) {
        this.id = id;
    }

    public Autentificare1(Integer id, String nume, String prenume, String parola, String cnp) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.parola = parola;
        this.cnp = cnp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
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
        if (!(object instanceof Autentificare1)) {
            return false;
        }
        Autentificare1 other = (Autentificare1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Autentificare1[ id=" + id + " ]";
    }
    
}
