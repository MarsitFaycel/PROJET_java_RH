/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entite.Salaire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOSalaire {
    
     public int addSalaire(Salaire salaire){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into salaire(salaireBrut,salaireBase,prime,nbrHsup,Employe_idEmploye,Employe_Email_idEmail,Depence_idDepence,GRH_idGRH) values ('"+salaire.getSalaireBrut()+"','"+salaire.getSalaireBase()+"','"+salaire.getNbrHsup()+"','"+salaire.getPrime()+"',1,2,3,1)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        
        return res;
    }
     
    
    }

