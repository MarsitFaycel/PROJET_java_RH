/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entite.Societe;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOSociete {
	
     public int addSociete(Societe societe){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into societe(nom,capitale,benefice) values ('"+societe.getNom()+"','"+societe.getCapitale()+"','"+societe.getBenefice()+"')");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        
        return res;
    }
}
    

