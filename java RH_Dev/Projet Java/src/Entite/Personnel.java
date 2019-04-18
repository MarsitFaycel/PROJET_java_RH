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
public class Personnel {
    
    public String login;
    public String mdp;
    public int id;
    public String nom;
    public String prenom;
    private String adresse;
    private int tel;
    private String email;

        
    
    public void SetMdp( String mdp)
    {
    this.mdp=mdp;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String getMdp()
    {
    return mdp;
    }
    
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Personnel(String login, String mdp, int id, String nom, String prenom, String adresse, int tel, String email) {
        this.login = login;
        this.mdp = mdp;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }
    public Personnel(String login, String mdp, String nom, String prenom, String adresse, int tel, String email) {
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }
    
    

    
    
}
