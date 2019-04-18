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
public class Mission {
    
    private int idMission;
    public String nom;
    public String dateDebut;
    public String dateFin;
    public String nomClient;
    public float valeur;
    public int  Employe_idEmploye;
    public int  Employe_Email_idEmail;
    public int Revenu_idRevenu;
    public int GRH_idGRH;

    public Mission(String nom, String dateDebut, String deteFin, String nomClient, float valeur, int Employe_idEmploye, int Employe_Email_idEmail, int Revenu_idRevenu, int GRH_idGRH) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = deteFin;
        this.nomClient = nomClient;
        this.valeur = valeur;
        this.Employe_idEmploye = Employe_idEmploye;
        this.Employe_Email_idEmail = Employe_Email_idEmail;
        this.Revenu_idRevenu = Revenu_idRevenu;
        this.GRH_idGRH = GRH_idGRH;
    }

    public int getIdMission() {
        return idMission;
    }

    public String getNom() {
        return nom;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public String getNomClient() {
        return nomClient;
    }

    public float getValeur() {
        return valeur;
    }

    public int getEmploye_idEmploye() {
        return Employe_idEmploye;
    }

    public int getEmploye_Email_idEmail() {
        return Employe_Email_idEmail;
    }

    public int getRevenu_idRevenu() {
        return Revenu_idRevenu;
    }

    public int getGRH_idGRH() {
        return GRH_idGRH;
    }

    public void setIdMission(int idMission) {
        this.idMission = idMission;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public void setEmploye_idEmploye(int Employe_idEmploye) {
        this.Employe_idEmploye = Employe_idEmploye;
    }

    public void setEmploye_Email_idEmail(int Employe_Email_idEmail) {
        this.Employe_Email_idEmail = Employe_Email_idEmail;
    }

    public void setRevenu_idRevenu(int Revenu_idRevenu) {
        this.Revenu_idRevenu = Revenu_idRevenu;
    }

    public void setGRH_idGRH(int GRH_idGRH) {
        this.GRH_idGRH = GRH_idGRH;
    }

    public String getDeteFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
