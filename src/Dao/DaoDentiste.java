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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yashida
 */
public class DaoDentiste {
    private Connection Con;
    private Statement St;
    
 
    public DaoDentiste() {
        Con= new Connexion().seConnecter();
    }
    
    public void Ajouter(String ID_EMPLOYE, String LOGIN, String CIN, String NOM, String PRENOM, String SEXE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE,Date DATE__D_EMBAUCHE)
    {
        try{
            PreparedStatement pst = Con.prepareStatement("insert into dentiste values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ID_EMPLOYE);
            pst.setString(2, LOGIN);
            pst.setString(3, CIN);
            pst.setString(4, NOM);
            pst.setString(5, PRENOM);
            pst.setString(6, SEXE);
            pst.setString(7, TELEPHONE);
            pst.setString(8, EMAIL);
            pst.setDate(9, DATE_NAISSANCE);
            pst.setDate(10, DATE__D_EMBAUCHE);
            pst.executeUpdate();
            System.out.println("Requete executée avec succes ! ");
        }
        catch(SQLException ex){
            System.err.println("Requete Ajouter erronnée !! "+ ex.getMessage());
        }
    }
    
    public  void Afficher(){
        ResultSet Res=null;
        try
        {
            St = Con.createStatement();
            Res=St.executeQuery("Select * from dentiste");
              while(Res.next())
            {
                System.out.println(Res.getString(1)+" "+Res.getString(2)+" "+Res.getString(3)+" "+Res.getString(4)+
         " "+Res.getString(5)+" "+Res.getString(6)+" "+Res.getString(7)+" "+Res.getString(8)+" "+Res.getDate(9)+" "+Res.getDate(10));
            }
            
        }
        catch (SQLException ex) 
        {
            System.err.println("Requete afficher erronnée !! "+ ex.getMessage());
        }
        
    }
    
    public void Supprimer(String id)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("delete from dentiste where ID_EMPLOYE=?");
        pst.setString(1, id);
        pst.executeUpdate();
        System.out.println("Suppression effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("supprimer a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public void Modifier(String ID_EMPLOYE, String LOGIN, String TELEPHONE, String EMAIL)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("update dentiste set LOGIN=?, TELEPHONE=?, EMAIL=? where ID_EMPLOYE=?");
            pst.setString(1, LOGIN);
            pst.setString(2, TELEPHONE);
            pst.setString(3, EMAIL);
            pst.setString(4, ID_EMPLOYE);
        
        pst.executeUpdate();
        System.out.println("Mise a jour effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("MAJ a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public void Afficher_by_ID(String id){
        ResultSet Res;
        try{
            PreparedStatement Pst = Con.prepareStatement("select * from dentiste where ID_EMPLOYE=?");
            Pst.setString(1,id);
            Res = Pst.executeQuery();
            System.out.println("Affichage du dentiste numero : "+ id +": ");
            if(Res.next())
            {
                System.out.println(Res.getString(1)+" "+Res.getString(2)+" "+Res.getString(3)+" "+Res.getString(4)+" "+Res.getString(5)+" "+Res.getString(6)+" "+Res.getString(7)+" "+Res.getString(8)+" "+Res.getDate(9)+" "+Res.getDate(10));
            }    
        }
        catch(SQLException ex){
            System.err.println("Afficher_by_ID a generé des erreurs !! "+ ex.getMessage());
        }
    }
    public ResultSet dentisteNames()
    {ResultSet Rs=null;
        try {
            
            St=Con.createStatement();
            Rs=St.executeQuery("select nom,prenom from dentiste");
        } catch (SQLException ex) {
            Logger.getLogger(DaoDentiste.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Rs;
    }
     
}

