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
public class Revenue {
    private int idREvenue;
    private float somme;
    private String mois;

    public Revenue(float somme, String mois) {
        this.somme = somme;
        this.mois = mois;
    }

    public int getIdREvenue() {
        return idREvenue;
    }

    public float getSomme() {
        return somme;
    }

    public String getMois() {
        return mois;
    }

    public void setIdREvenue(int idREvenue) {
        this.idREvenue = idREvenue;
    }

    public void setSomme(float somme) {
        this.somme = somme;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }
    
}
