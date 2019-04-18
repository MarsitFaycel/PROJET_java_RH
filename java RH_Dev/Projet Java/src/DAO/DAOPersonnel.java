/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entite.Employe;
import Entite.Personnel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOPersonnel {
    
    public int addPersonnel(Personnel personnel){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into employe (login,mdp,nom,prenom,adresse,tel,email,Email_idEmail) values ('"+personnel.getLogin()+"','"+personnel.getMdp()+"','"+personnel.getNom()+"','"+personnel.getPrenom()+"','"+personnel.getAdresse()+"','"+personnel.getTel()+"','"+personnel.getEmail()+"',1)");
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        
        
        
        return res;
    
}
     
     public  void supprimerEmploye(int id){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            
            /*delete*/
            
            String sql;
            sql = "delete from employe where idEmploye='"+id+"' ";
            //int row=statement.executeUpdate(sql);
            statement.executeUpdate(sql);
 
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }

     
     public void updatePersonnel(Personnel personnel){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
               
                 
            /*update*/
           String sql="update employe set id='"+personnel.getId()+"','"+personnel.getNom()+"','"+personnel.getPrenom()+"','"+personnel.getAdresse()+"','"+personnel.getEmail()+"','"+personnel.getTel()+"','"+personnel.getMdp()+"','"+personnel.getLogin()+"'";
           int row=statement.executeUpdate(sql);
                    
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from employe ");
            while (res.next()) {                
                System.out.printf(" %s \t %s\n", res.getString(2),res.getInt(3));
            }

            res.close();
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }
     
    
    
}
