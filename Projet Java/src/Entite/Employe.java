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
public class Employe extends Personnel {
    public String loginEmp;
    public String mdpEmp;

    public Employe(String loginEmp, String mdpEmp, String login, String mdp, int id, String nom, String prenom, String adresse, int tel, String email) {
        super(login, mdp, id, nom, prenom, adresse, tel, email);
        this.loginEmp = loginEmp;
        this.mdpEmp = mdpEmp;
    }

    

    
    public String getLoginEmp() {
        return loginEmp;
    }

    public String getMdpEmp() {
        return mdpEmp;
    }

    public void setLoginEmp(String loginEmp) {
        this.loginEmp = loginEmp;
    }

    public void setMdpEmp(String mdpEmp) {
        this.mdpEmp = mdpEmp;
    }
    
    
}
