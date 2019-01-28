/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Metier.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelkrim
 */
public class daoAllérgie {
    Connection Conn=new Connexion().seConnecter();
    
     public void Create(String id,String type,String d) {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("insert into allergie values(?,?,?)");
            st.setString(1, id);
            st.setString(2, type);
            st.setString(3, d);
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
       public ResultSet Read(String idA)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select * from allergie where id_allergie="+idA);
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
       public ResultSet ReadAll()
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select * from allergie ")  ;
            
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        return Rs;
    }
    public void Delete(String idA) {
        Statement st;
        try {
            st = Conn.createStatement();
            st.execute("delete from Allergie where id_allergie= " + idA);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
     public void Update(String id,String type,String d)
    {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("update allergie set id_allergie=?,type=?,degre=? where id_allergie=?");
          st.setString(1, id);
            st.setString(2, type);
            st.setString(3, d);
            st.setString(4, id);
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
     public ResultSet PatientAllergie(String id)
     {
          ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select avoir_allergie.DESIGNATION,allergie.Description,avoir_allergie.degre from avoir_allergie,allergie where ID_PATIENT="+"'"+id+"' and avoir_allergie.DESIGNATION=allergie.DESIGNATION");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
     }
 
  public void insertPatienAllergie(String a,String id,String Degre)
   {
       PreparedStatement st;
       
            try {
                st=Conn.prepareStatement("insert into avoir_allergie values (?,?,?)");
                 st.setString(1, id);
                st.setString(2, a);
                st.setString(3, Degre);
                st.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(daoAntécédant.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    
    
    
}
