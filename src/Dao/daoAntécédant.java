/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

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
public class daoAntécédant {
        Connection Conn=new Connexion().seConnecter();
         public void Create(String id,String designation,String desc) {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("insert into antecedant values(?,?,?)");
            st.setString(1, id);
            st.setString(2, designation);
            st.setString(3, desc);
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
            Rs=st.executeQuery("select * from allergie where id_antecedant="+idA);
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
          public ResultSet ReadpatientAntecedant(String idA)//hatim
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select A.Designation,A.Description from Antecedant A,avoir_antecedant AA where AA.id_patient='"+idA+"'and A.Designation=AA.Designation");   
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
            Rs=st.executeQuery("select * from antecedant ")  ;
            
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        return Rs;
    }
 public void Delete(String idA) {
        Statement st;
        try {
            st = Conn.createStatement();
            st.execute("delete from antecedant where id_antecedant= " + idA);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
  public void Update(String id,String designation,String desc)
    {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("update allergie set id_antecedant=?,designation=?,description=? where id_antecedant=?");
          st.setString(1, id);
            st.setString(2, designation);
            st.setString(3, desc);
            st.setString(4, id);
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
   public ResultSet PatientAntecedant(String id)
     {
          ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select avoir_antecedant.DESIGNATION,antecedant.Description from avoir_antecedant,antecedant where ID_PATIENT="+"'"+id+"'"+"and avoir_antecedant.DESIGNATION=antecedant.DESIGNATION");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
     }
   public void insertPatienAntecedant(String a,String id)
   {
       PreparedStatement st;
       
            try {
                st=Conn.prepareStatement("insert into avoir_antecedant values (?,?)");
                 st.setString(1, id);
                st.setString(2, a);
                st.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(daoAntécédant.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
          
    
}
