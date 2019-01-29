/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Metier.RendezVous;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toshiba
 */
public class daoRendezVous {
    Connection Con = new Connexion().seConnecter();

    public void Create(RendezVous RDV) {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("insert into Rendez_vous values(?,?,?,?,?)");
            st.setString(1, RDV.getId_R());
            st.setString(2, RDV.getId_P());
            st.setDate(3, RDV.getDate_rdv());
            st.setString(4, RDV.getHeure_rdv());
            st.setBoolean(5, RDV.isAnnulé());
            
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public ResultSet Read(String idP, Date daterdv, Date heurerdv)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select * from Rendez_vous where id_patient="+idP+" and daterv="+daterdv+" and heure="+heurerdv);
            
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
            Rs=st.executeQuery("select heure, p.nom, p.prenom, d.nom, annulation from Rendez_vous R, patient P, dentiste D "
                    + "where P.id_patient= R.Id_patient and p.id_dentiste=d.id_employe ")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    
    public ResultSet ReadD(String Dentiste)
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select heure, p.nom, p.prenom, d.nom, annulation from Rendez_vous R, patient P, dentiste D "
                    + "where P.id_patient= R.Id_patient and p.id_dentiste=d.id_employe and d.nom='"+Dentiste+"'")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    public ResultSet ReadJ(Date d) 
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select heure, p.nom, p.prenom, d.nom, annulation from Rendez_vous R, patient P, dentiste D where P.id_patient= R.Id_patient and p.id_dentiste=d.ID_EMPLOYE"
                    + " and R.DateRV='"+d+"'")  ;
            
        } catch (SQLException ex) {
            System.out.println("Prob here");
        }
        return Rs;
    }
    public ResultSet ReadM(int m) 
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select heure, p.nom, p.prenom, d.nom, annulation from Rendez_vous R, patient P, dentiste D where P.id_patient= R.Id_patient and p.id_dentiste=d.ID_EMPLOYE"
                    + " and YEAR(R.DateRV)=YEAR(SYSDATE()) and MONTH(R.DateRV)='"+m+"'")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    public ResultSet ReadToday() 
    {    
        ResultSet Rs=null;
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select heure, p.nom, p.prenom, d.nom, annulation from Rendez_vous R, patient P, dentiste D where P.id_patient= R.Id_patient and p.id_dentiste=d.ID_employe and R.daterv=DATE(SYSDATE())")  ;
            
        } catch (SQLException ex) {
            Logger.getLogger(daoPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
    public int ReadNbRDV()
    {    
        ResultSet Rs=null;
        int Nb=0;
        
        try {
            Statement st=Con.createStatement();
            Rs=st.executeQuery("select COUNT(*) from Rendez_vous where daterv=DATE(SYSDATE())");
            while (Rs.next()) {
            Nb= Rs.getInt(1);
        }
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
        }
        return Nb-1;
    }
    
    public void Update(String Nom, String Prenom, Date date, String heure)
    {
        PreparedStatement st;
        try {
            st = Con.prepareStatement("update Rendez_vous set Daterv=?,heure=  where Nom=? ");
//
//            st.setString(1, );
//            st.setString(2, );
//            st.setDate(3, );
//            st.setString(4, );
            
            st.execute();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Delete(String idP, Date daterdv, Date heurerdv) {
        Statement st;
        try {
            st = Con.createStatement();
            st.execute("delete from Rendez_vous where id_patient="+idP+" and daterv="+daterdv+" and heure="+heurerdv);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
