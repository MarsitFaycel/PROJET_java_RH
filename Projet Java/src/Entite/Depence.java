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
public class Depence {
    private int idDepence;
    private String mois;
  //  private float total; -- > fonction a faire !
    public int Societe_idSociete;

    public Depence(String mois, int Societe_idSociete) {
        this.mois = mois;
        this.Societe_idSociete = Societe_idSociete;
    }

    public void setIdDepence(int idDepence) {
        this.idDepence = idDepence;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public void setSociete_idSociete(int Societe_idSociete) {
        this.Societe_idSociete = Societe_idSociete;
    }

    public int getIdDepence() {
        return idDepence;
    }

    public String getMois() {
        return mois;
    }

    public int getSociete_idSociete() {
        return Societe_idSociete;
    }
    
    
    
}

