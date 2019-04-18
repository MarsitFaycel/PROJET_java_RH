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
public class Societe {
    private int idSociete;
    private String nom;
    private float capitale;
    private float benefice;

    public Societe(String nom, float capitale, float benefice) {
        this.nom = nom;
        this.capitale = capitale;
        this.benefice = benefice;
    }

    public int getIdSociete() {
        return idSociete;
    }

    public String getNom() {
        return nom;
    }

    public float getCapitale() {
        return capitale;
    }

    public float getBenefice() {
        return benefice;
    }

    public void setIdSociete(int idSociete) {
        this.idSociete = idSociete;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapitale(float capitale) {
        this.capitale = capitale;
    }

    public void setBenefice(float benefice) {
        this.benefice = benefice;
    }
    

}
