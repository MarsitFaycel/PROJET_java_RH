/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OmaR
 */
public class DAOGRH {
    public int verifier(String login,String mdp){
        
        String url="jdbc:mysql://127.0.0.1/mydb";//verifier url
        ResultSet res;
        try {
            
            Connection con =DriverManager.getConnection(url,"root","");
            Statement stmt=con.createStatement();
            String sql;
            sql= "select mdp from grh where login='"+login+"'";
            res= stmt.executeQuery(sql);
             if (res.next()){
                 return 1;
             }
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        return 0;
        
        
        

        
    }
    
}
