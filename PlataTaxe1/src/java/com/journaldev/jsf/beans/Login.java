/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.jsf.beans;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import static jdk.nashorn.internal.objects.NativeFunction.function;
 
@ManagedBean
@SessionScoped

/**
 *
 * @author rox
 */
public class Login {
    private String nume;
    private String prenume;
    private String parola;
    private String rol;
    //private String output_msg;
 
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
    
    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol){
        this.rol = rol;
    }
    /*public String login(){
        if(nume.equals("nume") && parola.equals("parola")) {
            output_msg = "Autentificare reusita";
        }
        else if (nume.equals("") && parola.equals("")){
            output_msg="Va rugam introduceti toate datele";
        }
        else {
            output_msg="Datele introduse nu sunt corecte";
        }
        return output_msg;
    }
    
   
    public String UservalidOrnot() { 
 
       if(nume.equals("nume") && parola.equals("parola") && prenume.equals("prenume")){
           return "success";
       }  else {
           return "failure";
       }
    }
    public String goToPlataTaxe() {
        return "plata_taxe";
}
     public String goToAutentificare() {
       return "autentificare";
}*/

    
       
}
