/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelkrim
 */
public class daoCompte2 {
     Connection Con = new Connexion().seConnecter();
     
     
 public boolean verifierCompte(String login,String pw)
   {   ResultSet Rs;
   boolean r=false;
       Statement st;
        try {
            st = Con.createStatement();
             Rs=st.executeQuery("select * from Compte where login="+"'"+login+"'"+"and MDP="+"'"+pw+"'")  ;
            
             if(Rs.next()) r=true;
              
              
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
           
            
   }
 public String verifierRole(String  login,String table)
 {
      ResultSet Rs;
   String r="false";
       Statement st;
       try {
            st = Con.createStatement();
             Rs=st.executeQuery("select * from "+table+" where login="+"'"+login+"'")  ;
       
             
             if(Rs.next())
                 r=Rs.getString(1);
            
            
              
              
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
 }
         
}