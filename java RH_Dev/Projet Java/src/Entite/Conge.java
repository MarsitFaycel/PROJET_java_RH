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
public class Conge {
    private int idConge;
    private int soldeConge;
    private String dateDebut;
    private String dateFin;
    public int GRH_idGRH;

    public Conge(int soldeConge, String dateDebut, String dateFin, int GRH_idGRH) {
        this.soldeConge = soldeConge;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.GRH_idGRH = GRH_idGRH;
    }

    public int getIdConge() {
        return idConge;
    }

    public int getSoldeConge() {
        return soldeConge;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public int getGRH_idGRH() {
        return GRH_idGRH;
    }

    public void setIdConge(int idConge) {
        this.idConge = idConge;
    }

    public void setSoldeConge(int soldeConge) {
        this.soldeConge = soldeConge;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public void setGRH_idGRH(int GRH_idGRH) {
        this.GRH_idGRH = GRH_idGRH;
    }
    
    
}

