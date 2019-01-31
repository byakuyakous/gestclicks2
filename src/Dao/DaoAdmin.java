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
 * @author Yashida
 */
public class DaoAdmin {
    private Connection Con;
    private Statement St;
    private Connexion dao;
    
 
    public DaoAdmin() {
        dao=new Connexion();
        Con= dao.seConnecter();
    }
    
    public void Ajouter(String ID_EMPLOYE, String LOGIN, String CIN, String NOM, String PRENOM, String SEXE, String ADRESSE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE,Date DATE_EMBAUCHE)
    {
        try{
            PreparedStatement pst = Con.prepareStatement("insert into administrateur values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ID_EMPLOYE);
            pst.setString(2, LOGIN);
            pst.setString(3, CIN);
            pst.setString(4, NOM);
            pst.setString(5, PRENOM);
            pst.setString(6, SEXE);
            pst.setString(7, ADRESSE);
            pst.setString(8, TELEPHONE);
            pst.setString(9, EMAIL);
            pst.setDate(10, DATE_NAISSANCE);
            pst.setDate(11, DATE_EMBAUCHE);
            pst.executeUpdate();
            System.out.println("Requete executée avec succes ! ");
        }
        catch(SQLException ex){
            System.err.println("Requete Ajouter erronnée !! "+ ex.getMessage());
        }
    }
    
    public ResultSet Afficher(){
        ResultSet Res=null;
        try
        {
            St = Con.createStatement();
            Res=St.executeQuery("Select * from administrateur;");
            System.out.println("Affichage des administrateurs :  ");         
        }
        catch (SQLException ex) 
        {
            System.err.println("Requete afficher erronnée !! "+ ex.getMessage());
        }
        return Res;
    }
    
    public void Supprimer(String id)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("delete from administrateur where ID_ADMIN=?");
        pst.setString(1, id);
        pst.executeUpdate();
        System.out.println("Suppression de l'admin effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("supprimer l'admin a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public void Modifier(String ID_EMPLOYE, String CIN, String NOM, String PRENOM, String SEXE, String ADRESSE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("update administrateur set CIN=? , NOM=? , PRENOM=? , SEXE=? , ADRESSE=? , TELEPHONE=? , EMAIL=? , DATE_NAISSANCE=? where ID_ADMIN=?");
            pst.setString(1, CIN);
            pst.setString(2, NOM);
            pst.setString(3, PRENOM);
            pst.setString(4, SEXE);
            pst.setString(5, ADRESSE); 
            pst.setString(6, TELEPHONE);
            pst.setString(7, EMAIL);
            pst.setDate(8, DATE_NAISSANCE);
            pst.setString(9, ID_EMPLOYE);
        
        pst.executeUpdate();
        System.out.println("Mise a jour effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("MAJ a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public ResultSet Afficher_by_ID(String id){
        ResultSet Res=null;
        try{
            PreparedStatement Pst = Con.prepareStatement("select * from administrateur where ID_ADMIN=?");
            Pst.setString(1,id);
            Res = Pst.executeQuery();
            System.out.println("Affichage de l'administrateur numero : "+ id +": ");
             
        }
        catch(SQLException ex){
            System.err.println("Afficher_by_ID a generé des erreurs !! "+ ex.getMessage());
        }
     return Res;
    }
    
}
