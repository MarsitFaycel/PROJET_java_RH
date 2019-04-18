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
public class Facture {
    private int  idFacture;
    private String date;
    private float montant;
    private String societe;
    private int etat;
    private String dateLimite;
    public int GRH_idGRH;
    public int Depence_idDepence;

    public Facture(String date, float montant, String societe, int etat, String dateLimite) {
        this.date = date;
        this.montant = montant;
        this.societe = societe;
        this.etat = etat;
        this.dateLimite = dateLimite;
    }

    public Facture(String date, float montant, String societe, int etat, String dateLimite, int GRH_idGRH, int Depence_idDepence) {
        this.date = date;
        this.montant = montant;
        this.societe = societe;
        this.etat = etat;
        this.dateLimite = dateLimite;
        this.GRH_idGRH = GRH_idGRH;
        this.Depence_idDepence = Depence_idDepence;
    }
    
    
    

    public int getIdFacture() {
        return idFacture;
    }

    public String getDate() {
        return date;
    }

    public float getMontant() {
        return montant;
    }

    public String getSociete() {
        return societe;
    }

    public int getEtat() {
        return etat;
    }

    public String getDateLimite() {
        return dateLimite;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setDateLimite(String dateLimite) {
        this.dateLimite = dateLimite;
    }

    public int getGRH_idGRH() {
        return GRH_idGRH;
    }

    public int getDepence_idDepence() {
        return Depence_idDepence;
    }

    public void setGRH_idGRH(int GRH_idGRH) {
        this.GRH_idGRH = GRH_idGRH;
    }

    public void setDepence_idDepence(int Depence_idDepence) {
        this.Depence_idDepence = Depence_idDepence;
    }
    
    
}
