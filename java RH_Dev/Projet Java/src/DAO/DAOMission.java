/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entite.Mission;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOMission {
     public int addMission( Mission mission){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into mission (nom,dateDebut,DateFin,nomClient,valeur,Employe_idEmploye,Employe_Email_idEmail,Revenu_idRevenu,GRH_idGRH) values('"+mission.getNom()+"','"+mission.getDateDebut()+"','"+mission.getDateFin()+"','"+mission.getNomClient()+"','"+mission.getValeur()+"',1,1,1,1)");
            
        } catch (SQLException ey) {
            System.out.println(ey.getMessage());
            }
        
        return res;
    }
     
      public  void supprimerMission(Mission mission){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection c;
            c = DriverManager.getConnection(url, "root","");
            /*delete*/
            try (Statement statement = c.createStatement()) {
                /*delete*/
                
                String sql="delete from facture  where idMission='"+mission.getIdMission()+"' ";
                //int row=statement.executeUpdate(sql);
                statement.executeUpdate(sql);
            }
            c.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
     }
      
      public  void afficherMission(){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection c =DriverManager.getConnection(url, "root","");
            Statement statement;
            statement = c.createStatement();
            
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from mission ");
            while (res.next()) {                
                System.out.printf(" %s \t %s\n", res.getString(2),res.getInt(3));
            }
            res.close();
            statement.close();
            c.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }
      
        public void updateMission(Mission mission){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            try (Connection con = DriverManager.getConnection(url, "root",""); Statement statement = con.createStatement()) {
                
                
                /*update*/
                String sql= "update mission set nom = '"+mission.getNom()+"','"+mission.getDateDebut()+"','"+mission.getDateFin()+"', '"+mission.getNomClient()+"' where idMission='"+mission.getIdMission()+"'";
                int row=statement.executeUpdate(sql);
                
                
                try ( /*affichage*/ ResultSet res = statement.executeQuery("select * from mission ")) {
                    while (res.next()) {
                        System.out.printf(" %s \t %s\n", res.getString(2),res.getInt(3));
                    }
                }
            }
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
}
}