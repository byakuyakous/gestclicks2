/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.mysql.jdbc.StringUtils;
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
        dao = new Connexion();
        Con = dao.seConnecter();
    }

    public void Ajouter(String LOGIN, String ID_ADMIN, String MDP) {
        try {
            PreparedStatement pst = Con.prepareStatement("insert into compte values(?,?,?)");
            pst.setString(1, LOGIN);
            pst.setString(2, ID_ADMIN);
            pst.setString(3, MDP);
            pst.executeUpdate();
            System.out.println("Requete executée avec succes ! ");
        } catch (SQLException ex) {
            System.err.println("Requete Ajouter erronnée !! " + ex.getMessage());
        }
    }

    public ResultSet Afficher() {
        ResultSet Res = null;
        try {
            St = Con.createStatement();
            Res = St.executeQuery("Select * from compte;");
            System.out.println("Affichage des compte :  ");
        } catch (SQLException ex) {
            System.err.println("Requete afficher erronnée !!!!!! " + ex.getMessage());
        }
        return Res;
    }

    public String TypeEmploye(String Id) {
        ResultSet Res = null;
        String R;
        try {

            St = Con.createStatement();
            Res = St.executeQuery("Select * from Dentiste where ID_DENTISTE='" + Id + "'");
            if (Res.next()) {
                return "Dentiste";
            }

            Res = St.executeQuery("Select * from administrateur where ID_ADMIN='" + Id + "'");
            if (Res.next()) {
                return "Administrateur";
            }
            Res = St.executeQuery("Select * from receptioniste where ID_RECEPTIONNISTE='" + Id + "'");
            if (Res.next()) {
                return "Receptionniste";
            }
            return "Not Found !";
        } catch (SQLException ex) {
            System.err.println("Requete afficher erronnée !! " + ex.getMessage());
        }
        return Res.toString();
    }

    public String ReturnIdEmploye(String LOGIN) {
        ResultSet Res = null;
        try {
            St = Con.createStatement();
            Res = St.executeQuery("Select ID_DENTISTE from Dentiste where Login='" + LOGIN + "' UNION Select ID_ADMIN from administrateur where Login='" + LOGIN + "' UNION Select ID_RECEPTIONNISTE from receptioniste where Login='" + LOGIN + "'");
            Res.next();
            System.out.println("4");
            System.out.println(Res.toString());
        } catch (SQLException ex) {
            System.err.println("Requete afficher erronnée !! " + ex.getMessage());
        }
        return Res.toString();
    }

    public ResultSet AfficherListeCompte() {
        ResultSet Res = null;
        try {
            St = Con.createStatement();
            Res = St.executeQuery("Select NOM,PRENOM,c.LOGIN,MDP,c.ID_ADMIN from administrateur a , compte c where a.LOGIN=c.LOGIN " + "UNION Select NOM,PRENOM,c.LOGIN,MDP,ID_ADMIN from dentiste d , compte c where d.LOGIN=c.LOGIN " + "UNION Select NOM,PRENOM,c.LOGIN,MDP,ID_ADMIN from receptioniste r , compte c where r.LOGIN=c.LOGIN ;");
            System.out.println("Affichage des compte :  ");
        } catch (SQLException ex) {
            System.err.println("Requete afficher erronnée pppp " + ex.getMessage());
        }
        return Res;
    }

    public void Supprimer(String LOGIN) {
        try {
            PreparedStatement pst = Con.prepareStatement("delete from compte where LOGIN=?");
            pst.setString(1, LOGIN);
            pst.executeUpdate();
            System.out.println("Suppression du compte effectuée avec succes!  ");
        } catch (SQLException ex) {
            System.err.println("supprimer le compte a generé des erreurs !! " + ex.getMessage());
        }
    }

    public void Modifier(String LOGIN, String MDP) {
        try {
            PreparedStatement pst = Con.prepareStatement("update compte set MDP=? where LOGIN=?");
            pst.setString(1, MDP);
            pst.setString(2, LOGIN);

            pst.executeUpdate();
            System.out.println("Mise a jour effectuée avec succes!  ");
        } catch (SQLException ex) {
            System.err.println("MAJ a generé des erreurs !! " + ex.getMessage());
        }
    }

    public ResultSet Afficher_by_ID(String LOGIN) {
        ResultSet Res = null;
        try {
            PreparedStatement Pst = Con.prepareStatement("select * from compte where LOGIN=?");
            Pst.setString(1, LOGIN);
            Res = Pst.executeQuery();
            System.out.println("Affichage du compte dont le login est : " + LOGIN + ": ");
        } catch (SQLException ex) {
            System.err.println("Afficher_by_ID a generé des erreurs !! " + ex.getMessage());
        }
        return Res;
    }

}
