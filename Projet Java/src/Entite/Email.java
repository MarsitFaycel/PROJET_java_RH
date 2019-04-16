/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author OmaR
 */
public class Email {

    private int idEmail;
    private String adresseSource;
    private String adresseDest;
    private String contenu;
    private String date;

    public Email(String adresseSource, String adresseDest, String contenu, String date) {
        this.adresseSource = adresseSource;
        this.adresseDest = adresseDest;
        this.contenu = contenu;
        this.date = date;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public String getAdresseSource() {
        return adresseSource;
    }

    public String getAdresseDest() {
        return adresseDest;
    }

    public String getContenu() {
        return contenu;
    }

    public String getDate() {
        return date;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public void setAdresseSource(String adresseSource) {
        this.adresseSource = adresseSource;
    }

    public void setAdresseDest(String adresseDest) {
        this.adresseDest = adresseDest;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
 
    
}
