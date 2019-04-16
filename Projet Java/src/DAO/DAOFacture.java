/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entite.Facture;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOFacture {
    
    public int addFacture(Facture facture){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into facture(date,montant,societe,etat,dateLimite,GRH_idGRH,Depence_idDepence) values ('"+facture.getDate()+"','"+facture.getMontant()+"','"+facture.getSociete()+"','"+facture.getEtat()+"','"+facture.getDateLimite()+"',1,5)") ;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        
        return res;
        
    }
    public  void supprimerFacture(Facture facture){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            
            /*delete*/
            
            String sql="delete from facture  where IdFacture='"+facture.getIdFacture()+"' ";
            //int row=statement.executeUpdate(sql);
            statement.executeUpdate(sql);
 
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
       
    }
    
    
    
    
}
