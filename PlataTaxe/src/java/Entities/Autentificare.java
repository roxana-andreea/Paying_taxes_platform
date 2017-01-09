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
@Table(name = "Autentificare")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autentificare.findAll", query = "SELECT a FROM Autentificare a")
    , @NamedQuery(name = "Autentificare.findById", query = "SELECT a FROM Autentificare a WHERE a.id = :id")
    , @NamedQuery(name = "Autentificare.findByNume", query = "SELECT a FROM Autentificare a WHERE a.nume = :nume")
    , @NamedQuery(name = "Autentificare.findByPrenume", query = "SELECT a FROM Autentificare a WHERE a.prenume = :prenume")
    , @NamedQuery(name = "Autentificare.findByParola", query = "SELECT a FROM Autentificare a WHERE a.parola = :parola")
    , @NamedQuery(name = "Autentificare.findByCnp", query = "SELECT a FROM Autentificare a WHERE a.cnp = :cnp")})
public class Autentificare implements Serializable {

    @Size(max = 30)
    @Column(name = "parola")
    private String parola;
    
    @Size(max = 13)
    @Column(name = "CNP")
    private String cnp;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 30)
    @Column(name = "nume")
    private String nume;
    @Size(max = 30)
    @Column(name = "prenume")
    private String prenume;
    @Size(max = 30)


    public Autentificare() {
    }

    public Autentificare(Integer id) {
        this.id = id;
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp =cnp;
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
/*
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
    }*/

    @Override
    public String toString() {
        return "Entities.Autentificare[ id=" + id + " ]";
    }

   
    
    
}
