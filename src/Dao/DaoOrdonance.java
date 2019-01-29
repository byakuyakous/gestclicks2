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
import javax.swing.JOptionPane;

/**
 *
 * @author hatim
 */

public class DaoOrdonance {
    Connection Conn=new Connexion().seConnecter();
    Statement St;
    
     public void Create(String idP,String idD,Date D,String des) {
        PreparedStatement st;
        try {
            st = Conn.prepareStatement("insert into donner_ord values(?,?,?,?)");
            st.setString(1,idP);
            st.setString(2,idD);
            st.setDate(3, D);
            st.setString(4, des);
            st.execute();
            System.out.println("Ordonance succes !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Champ deja existant","Avertissement", 0);
        }
    }
       public ResultSet Read(String idA)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Conn.createStatement();
            Rs=st.executeQuery("select P.nom,P.prenom,O.dateord  from donner_ord O,patient P where P.id_patient=O.id_patient and O.id_dentiste="+idA );
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
         public ResultSet NombreOrd(String idD) {
        ResultSet Resultat = null;
        try {
            St = Conn.createStatement();
            Resultat = St.executeQuery("select count(*) from donner_ord where id_dentiste="+idD);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Resultat;
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