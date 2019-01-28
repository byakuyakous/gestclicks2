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
public class DaoCompte {
    private Connection Con;
    private Statement St;
    private Connexion dao;
    
 
    public DaoCompte() {
        dao=new Connexion();
        Con= dao.seConnecter();
    }
    
    public void Ajouter(String LOGIN, String ID_ADMIN, String MDP)
    {
        try{
            PreparedStatement pst = Con.prepareStatement("insert into compte values(?,?,?)");
            pst.setString(1, LOGIN);
            pst.setString(2, ID_ADMIN);
            pst.setString(3, MDP);
            pst.executeUpdate();
            System.out.println("Requete executée avec succes ! ");
        }
        catch(SQLException ex){
            System.err.println("Requete Ajouter erronnée !! "+ ex.getMessage());
        }
    }
    
    public  ResultSet Afficher(){
        ResultSet Res=null;
        try
        {
            St = Con.createStatement();
            Res=St.executeQuery("Select * from compte;");
            System.out.println("Affichage des compte :  ");
//            while(Res.next())
//            {
//                System.out.println(Res.getString(1)+" "+Res.getString(2)+" "+Res.getString(3));
//            }
        }
        catch (SQLException ex) 
        {
            System.err.println("Requete afficher erronnée !! "+ ex.getMessage());
        }
        return Res;
    }
//    public  String TypeEmploye(String Id){
//        ResultSet Res=null;
//        try
//        {
//            PreparedStatement pst = Con.prepareStatement("Select ID_EMPLOYE from Dentiste where Login='?'\n" +
//                                                         "UNION Select ID_EMPLOYE from administrateur where Login='?'\n" +
//                                                        "UNION Select ID_EMPLOYE from receptionniste where Login='?'\n;"
//);
//            pst.setString(1, LOGIN);
//            pst.setString(2, LOGIN);
//            pst.setString(3, LOGIN);
//            pst.executeUpdate();
//            System.out.println("ReturnIdEmploye: ");
//        }
    public  String ReturnIdEmploye(String LOGIN){
        ResultSet Res=null;
        try
        {
            PreparedStatement pst = Con.prepareStatement("Select ID_EMPLOYE from Dentiste where Login='?'\n" +
                                                         "UNION Select ID_EMPLOYE from administrateur where Login='?'\n" +
                                                        "UNION Select ID_EMPLOYE from receptionniste where Login='?'\n;"
);
            pst.setString(1, LOGIN);
            pst.setString(2, LOGIN);
            pst.setString(3, LOGIN);
            pst.executeUpdate();
            System.out.println("ReturnIdEmploye: ");
        }
        catch (SQLException ex) 
        {
            System.err.println("Requete afficher erronnée !! "+ ex.getMessage());
        }
        return Res.toString();
    }
    
    
    public  ResultSet AfficherListeCompte(){
        ResultSet Res=null;
        try
        {
            St = Con.createStatement();
            Res=St.executeQuery("Select NOM,PRENOM,c.LOGIN,MDP,ID_ADMIN from administrateur a , compte c where a.LOGIN=c.LOGIN\n" +
                                "UNION Select NOM,PRENOM,c.LOGIN,MDP,ID_ADMIN from dentiste d , compte c where d.LOGIN=c.LOGIN\n" +
                                "UNION Select NOM,PRENOM,c.LOGIN,MDP,ID_ADMIN from receptionniste r , compte c where r.LOGIN=c.LOGIN ;");
            System.out.println("Affichage des compte :  ");
//            while(Res.next())
//            {
//                System.out.println(Res.getString(1)+" "+Res.getString(2)+" "+Res.getString(3));
//            }
        }
        catch (SQLException ex) 
        {
            System.err.println("Requete afficher erronnée !! "+ ex.getMessage());
        }
        return Res;
    }
    
    public void Supprimer(String LOGIN)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("delete from compte where LOGIN=?");
        pst.setString(1, LOGIN);
        pst.executeUpdate();
        System.out.println("Suppression effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("supprimer a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public void Modifier(String LOGIN, String ID_ADMIN, String MDP)
    {
        try
        {
        PreparedStatement pst = Con.prepareStatement("update compte set ID_ADMIN=?, MDP=? where LOGIN=?");
            pst.setString(1, ID_ADMIN);
            pst.setString(2, MDP);
            pst.setString(3, LOGIN);
        
        pst.executeUpdate();
        System.out.println("Mise a jour effectuée avec succes!  ");
        }
        catch(SQLException ex)
        {
             System.err.println("MAJ a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
    public void Afficher_by_ID(String LOGIN){
        ResultSet Res;
        try{
            PreparedStatement Pst = Con.prepareStatement("select * from compte where LOGIN=?");
            Pst.setString(1,LOGIN);
            Res = Pst.executeQuery();
            System.out.println("Affichage du compte dont le login est : "+ LOGIN +": ");
            if(Res.next())
            {
                System.out.println(Res.getString(1)+" "+Res.getString(2)+" "+Res.getString(3));
            }    
        }
        catch(SQLException ex){
            System.err.println("Afficher_by_ID a generé des erreurs !! "+ ex.getMessage());
        }
    }
    
}