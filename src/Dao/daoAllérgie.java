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
           public ResultSet Readpatientallergies(String idA)//
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select A.Designation,AA.degre from allergie A,avoir_allergie AA "
                    + "where AA.id_patient='"+idA+"' and A.Designation=AA.Designation");
            
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
    
    
}