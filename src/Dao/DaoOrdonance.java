/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hatim
 */

public class DaoOrdonance {
    Connection Conn=new Connexion().seConnecter();
    
     public void Create(String idD,String idP,Date D,String des) {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("insert into donner_ord values(?,?,?,?)");
            st.setString(1, idD);
            st.setString(2, idP);
            st.setDate(3, D);
            st.setString(4, des);
            st.execute();
            System.out.println("Ordonance succes !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
       public ResultSet Read(String idA)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select * from donner_ord where id_dentiste="+idA);
            
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
            Rs=st.executeQuery("select * from donner_ord ")  ;
            
        } catch (SQLException ex) {
           System.err.println(ex.getMessage());
        }
        return Rs;
    }

    
    
}