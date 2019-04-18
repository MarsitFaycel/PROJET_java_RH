/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entite.Email;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOEmail {
      public int addEmail(Email email){
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        int res =0;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            res=stmt.executeUpdate("insert into Email(adresseSource,adresseDest,contenu,date) values ('"+email.getAdresseDest()+"','"+email.getAdresseSource()+"','"+email.getContenu()+"','"+email.getDate()+"')");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            }
        
        return res;
    }
    
       public  void supprimerEmail(Email email){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
            
            /*delete*/
            
            String sql="delete from email  where idEmail='"+email.getIdEmail()+"' ";
            //int row=statement.executeUpdate(sql);
            statement.executeUpdate(sql);
            statement.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }
    }
    
       public  void afficherEmail(){
        try {
            String url="jdbc:mysql://127.0.0.1/mydb";//--->connection
            Connection con =DriverManager.getConnection(url, "root","");
            Statement statement=con.createStatement();
            
           
            /*affichage*/
            ResultSet res= statement.executeQuery("select * from email ");
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
