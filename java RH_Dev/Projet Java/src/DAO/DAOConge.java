/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entite.Conge;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author OmaR
 */
public class DAOConge {
    
     public void ajouterConge(Conge conge){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            
            String sql="insert into conge (soldeConge,dateDebut,dateFin,GRH_idGRH) values('"+conge.getSoldeConge()+"','"+conge.getDateDebut()+"','"+conge.getDateFin()+"','"+conge.getGRH_idGRH()+"')";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            ResultSet res=ps.getGeneratedKeys();
            if(res.next()){
                int id=res.getInt(1);
                conge.setIdConge(id);
            }
            
            
            res.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        
        
    }
     public  void afficherConge(){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from conge ");
            while (res.next()) {                
               System.out.printf(" %s \t %s \t%s \t%s \t%s \t\n", res.getInt(2),res.getInt(3),res.getString(4),res.getString(5),res.getInt(6));

            }
            
            
            res.close();
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }
      
    public  void supprimerConge(Conge conge){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            
            /*delete*/
            
            String sql="delete from conge  where idConge='"+conge.getIdConge()+"' ";
            //int row=statement.executeUpdate(sql);
            statement.executeUpdate(sql);
            
            
           
            
            /*affichage*/
            //ResultSet res= statement.executeQuery("select * from conge ");
            
            
        
           
            
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }


    public void updateConge(Conge conge){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
               
                 
            /*update*/
           String sql="update conge set  soldeConge='"+conge.getSoldeConge()+"',dateDebut='"+conge.getDateDebut()+"',dateFin='"+conge.getDateFin()+"',GRH_idGRH='"+conge.getGRH_idGRH()+"' where idConge='"+conge.getIdConge()+"'";
            int row=statement.executeUpdate(sql);
                    
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from conge ");
            while (res.next()) {                
                System.out.printf(" %s \t %s \t%s \t%s \t%s \t\n", res.getInt(1),res.getInt(2),res.getString(3),res.getString(4),res.getInt(5));

            }
            
            
        
           
            
            res.close();
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }
  }
