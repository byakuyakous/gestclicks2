/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelkrim
 */
public class Connexion {
 public Connection seConnecter()
    {Connection Conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok ! ");
            Conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Gestclick","root","");
            System.out.println("Connexion etablie ! ");       
        } 
        catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } 
        catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        return Conn;
    }
      

}
