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
public class Salaire {
    private int idSalaire;
    private float salaireBrut;
    private float salaireBase;
    private float prime;
    private float nbrHsup;
    public  int Employe_idEmploye;
    public  int Employe_Email_idEmail;
    public  int Depence_idDepence;
    public  int GRH_idGRH;

    public Salaire(float salaireBrut, float salaireBase, float prime, float nbrHsup, int Employe_idEmploye, int Employe_Email_idEmail, int Depence_idDepence, int GRH_idGRH) {
        this.salaireBrut = salaireBrut;
        this.salaireBase = salaireBase;
        this.prime = prime;
        this.nbrHsup = nbrHsup;
        this.Employe_idEmploye = Employe_idEmploye;
        this.Employe_Email_idEmail = Employe_Email_idEmail;
        this.Depence_idDepence = Depence_idDepence;
        this.GRH_idGRH = GRH_idGRH;
    }

    public int getIdSalaire() {
        return idSalaire;
    }

    public float getSalaireBrut() {
        return salaireBrut;
    }

    public float getSalaireBase() {
        return salaireBase;
    }

    public float getPrime() {
        return prime;
    }

    public float getNbrHsup() {
        return nbrHsup;
    }

    public int getEmploye_idEmploye() {
        return Employe_idEmploye;
    }

    public int getEmploye_Email_idEmail() {
        return Employe_Email_idEmail;
    }

    public int getDepence_idDepence() {
        return Depence_idDepence;
    }

    public int getGRH_idGRH() {
        return GRH_idGRH;
    }

    public void setIdSalaire(int idSalaire) {
        this.idSalaire = idSalaire;
    }

    public void setSalaireBrut(float salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public void setSalaireBase(float salaireBase) {
        this.salaireBase = salaireBase;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public void setNbrHsup(float nbrHsup) {
        this.nbrHsup = nbrHsup;
    }

    public void setEmploye_idEmploye(int Employe_idEmploye) {
        this.Employe_idEmploye = Employe_idEmploye;
    }

    public void setEmploye_Email_idEmail(int Employe_Email_idEmail) {
        this.Employe_Email_idEmail = Employe_Email_idEmail;
    }

    public void setDepence_idDepence(int Depence_idDepence) {
        this.Depence_idDepence = Depence_idDepence;
    }

    public void setGRH_idGRH(int GRH_idGRH) {
        this.GRH_idGRH = GRH_idGRH;
    }
    
    
    
}