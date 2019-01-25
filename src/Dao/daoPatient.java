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
public class daoPatient {
    private Statement St;
    Connection Con = new Connexion().seConnecter();

    public void Create(Patient P) {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, P.getIdP());
            st.setString(2, P.getIdR());
            st.setString(3, P.getIdD());
            st.setString(4, P.getNom());
            st.setString(5, P.getPrenom());
            st.setString(6, P.getCin());
            st.setString(7, P.getSexe());
            st.setDate(8, P.getDate_naissance());
            st.setDate(9, P.getDate_creation());
            st.setString(10, P.getTél());
            st.setString(11, P.getEmail());
            st.setString(12, P.getType_sang());
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public ResultSet Read(String idP)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select * from patient where id_patients="+idP);
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
      public ResultSet ReadD(String idD)//hatim
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select ID_PATIENT,NOM,PRENOM,SEXE,TELEPHONE from patient where id_Dentiste='"+idD+"'");
            System.out.println("affichage default");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
        public ResultSet Filtrer(String idD)//hatim
    {    
        ResultSet Rs=null;
        try {
            String Res = idD+"%";
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select ID_PATIENT,NOM,PRENOM,SEXE,TELEPHONE from patient where Nom like '"+Res+"' or Prenom like '"+Res+"' ");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
           public ResultSet Nombrepat() //hatim
           {
        ResultSet Resultat = null;
        try {
            St = Con.createStatement();
            String D="12";
            Resultat = St.executeQuery("select count(*) from patient where id_dentiste='" + D + "'");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Resultat;
    }
    public ResultSet ReadAll()
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select id_patient,nom,prenom,telephone,id_dentiste from patient ")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
      public ResultSet ReadPatientForDentiste(String id)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select cin,date_naissance,email,type_de_sang,sexe,telephone from patient where id_patient='"+id+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    public void Update(Patient P)
    {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("update Patient set id_dentiste=?,Nom=?,Prenom=?,telephone=?,email=? where id_patient=?");
            st.setString(6, P.getIdP());
            //st.setString(2, P.getIdR());
            st.setString(1, P.getIdD());
            st.setString(2, P.getNom());
            st.setString(3, P.getPrenom());
            //st.setString(6, P.getCin());
            //st.setString(7, P.getSexe());
           // st.setDate(8, P.getDate_naissance());
           // st.setDate(9, P.getDate_creation());
            st.setString(4, P.getTél());
            st.setString(5, P.getEmail());
            //st.setString(12, P.getType_sang());
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    

    public void Delete(String idP) {
        Statement st;
        try {
            st = Con.createStatement();
            st.execute("delete from patient where id_patient= " + idP);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
