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

    Connection Con = new Connexion().seConnecter();
    Statement St;

    public void Create(Patient P) {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, P.getIdP());
            st.setString(2, P.getIdD());
            st.setString(3, P.getIdR());
            st.setString(4, P.getNom());
            st.setString(5, P.getPrenom());
            st.setString(6, P.getCin());
            st.setString(7, P.getSexe());
            st.setDate(8, P.getDate_naissance());
            st.setDate(13, P.getDate_creation());
            st.setString(9, P.getAdr());
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
            Rs=st.executeQuery("select * from patient where id_patient="+"'"+idP+"'");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
    }
     public ResultSet Readall2()
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select * from patient ");
            
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Rs;
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
    public void Update(String t,String e,String a,String id)
    {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("update patient set TELEPHONE=?,email=?,ADRESSE=? where ID_PATIENT=?");
           
            //st.setString(2, P.getIdR());
            st.setString(1, t);
            st.setString(2, e);
            st.setString(3, a);
            //st.setString(6, P.getCin());
            //st.setString(7, P.getSexe());
           // st.setDate(8, P.getDate_naissance());
           // st.setDate(9, P.getDate_creation());
            st.setString(4, id);
        
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
   public int count()
   {   ResultSet Rs;
   int r=0;
       Statement st;
        try {
            st = Con.createStatement();
             Rs=st.executeQuery("select count(*) from patient ")  ;
             Rs.next();
              r=Rs.getInt(1);
              
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
           
            
   }
    public String Dp()
{    String s=null;
        try {
            ResultSet Rs;
            Statement St=Con.createStatement();
            Rs=St.executeQuery("SELECT ID_DENTISTE from patient GROUP BY ID_DENTISTE having count(ID_PATIENT)<=all(select COUNT(ID_PATIENT) from patient GROUP By ID_DENTISTE )");
            if(Rs.next())
            s=Rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(DaoDentiste.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
   public String Dpatient(String id)
{    String s=null;
        try {
            ResultSet Rs;
            Statement St=Con.createStatement();
            Rs=St.executeQuery("select D.nom,D.prenom from dentiste D,patient P where D.id_dentiste=P.id_dentiste and P.id_patient="+"'"+id+"'");
            if(Rs.next())
            s=Rs.getString(1)+" "+Rs.getString(2);
        } catch (SQLException ex) {
            Logger.getLogger(DaoDentiste.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
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
               public ResultSet ReadInas(String idP)
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
    public ResultSet ReadAllInas()
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select cin,nom,prenom,telephone,nom,prenom from patient ")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    //lecture pour affichage Ajout RDV receptionniste 
    public ResultSet ReadShort()
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select cin,nom,prenom from patient ")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    public String ReadIDBYCIN(String CIN)
    {    
        ResultSet Rs=null;
        String ID="";
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select Id_patient from patient where CIN='"+CIN+"'");
            while (Rs.next()) {
            ID=Rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println("ID by cin patient in add rdv doesnt work");
        }
        return ID;
    }
   
   
    
    
}
