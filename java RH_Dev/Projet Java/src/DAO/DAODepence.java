/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entite.Depence;
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
public class DAODepence {
     public void ajouterDepence(Depence depence){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            
            String sql="insert into depence(mois,Societe_idSociete) values('"+depence.getMois()+"','"+depence.getSociete_idSociete()+"')";
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.execute();
            ResultSet res=ps.getGeneratedKeys();
            if(res.next()){
                int id=res.getInt(1);
                depence.setIdDepence(id);
            }
            
            
            res.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        
        
    }
     public  void afficherDepence(){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from depence ");
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
      
    public  void supprimerDepence(Depence depence){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            
            /*delete*/
            
            String sql="delete from depence  where idDepence='"+depence.getIdDepence()+"' ";
            //int row=statement.executeUpdate(sql);
            statement.executeUpdate(sql);
 
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }


    public void updateDepance(Depence depence){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
               
                 
            /*update*/
           String sql="update depence set mois='"+depence.getMois()+"',Societe_idSociete='"+depence.getSociete_idSociete()+"' where idDepence='"+depence.getIdDepence()+"'";
           int row=statement.executeUpdate(sql);
                    
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from depence ");
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
