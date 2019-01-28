package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hatim
 */
public class daoOperation {

    private Statement St;
    private Connection Con;

    public daoOperation() {
        Con = new Connexion().seConnecter();

    }

    public void Ajouter(String patient,String dentiste, String type, Date date, String remarque) {
        try {
            PreparedStatement Pst = Con.prepareStatement("insert into operer values(?,?,?,?,?)");
            Pst.setString(1,patient);
            Pst.setString(2,dentiste);
            Pst.setString(3,type);
            Pst.setDate(4,date);
            Pst.setString(5,remarque);
            Pst.executeUpdate();
            System.out.println("L'operation a bien ete ajoutée !  ");
        } catch (SQLException ex) {
            System.err.println("la requete ajouter operation a generer des erreures ! " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur d'ajout ","Avertissement", 0);
        }

    }

    public ResultSet Afficher(String iddentiste) {
        ResultSet Resultat = null;
        try {
            St = Con.createStatement();
            Resultat = St.executeQuery("select P.nom,O.id_patient,O.typeop,O.dateop,O.remarques "
                    + "from operer O,patient P where P.id_patient=O.id_patient and O.id_dentiste="+iddentiste);
            System.out.println("Affichage des operations : ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Resultat;
    }

    public ResultSet AfficherById(String id) {
        ResultSet Resultat = null;
        try {
            St = Con.createStatement();
            Resultat = St.executeQuery("select typeop,dateop,remarques from operer where id_patient='" + id + "'");
        } catch (SQLException ex) {
            System.err.println("==>" + ex.getMessage());
        }
        return Resultat;
    }
    public ResultSet Filtrer(String id) {
        ResultSet Resultat = null;
        try {
            String Like = id + "%";
            St = Con.createStatement();
            Resultat = St.executeQuery("select P.nom,O.id_patient,O.typeop,O.dateop,O.remarques "
                    + "from operer O , patient P"
                    + " where typeop like '" + Like + "'and P.id_patient=O.id_patient");
            
        } catch (SQLException ex) {
            System.err.println("==>" + ex.getMessage());
        }
        return Resultat;
    }

    public ResultSet NombreOp(String idD) {
        ResultSet Resultat = null;
        try {
            St = Con.createStatement();
            Resultat = St.executeQuery("select count(*) from operer where id_dentiste="+idD);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Resultat;
    }

    public void Supprimer(String idp, String idd) {
        try {
            PreparedStatement Pst = Con.prepareStatement("delete from operer where id_dentiste=? and id_patient=?");
            Pst.setString(1, idd);
            Pst.setString(2, idp);
            Pst.executeUpdate();
            System.out.println("L'operation a bien ete supprimé !");
        } catch (SQLException ex) {
            System.err.println("la requete supprimer operation a generé des erreures ! " + ex.getMessage());
        }
    }

    public void Modifier(String TYPE_OP, String REMARQUE, String Id_patient,String Date) {
        try {
            PreparedStatement pst = Con.prepareStatement("update operer set TYPEOP=?, REMARQUES=? where id_patient=? and dateop=?");
            pst.setString(1, TYPE_OP);
            pst.setString(2, REMARQUE);
            pst.setString(3, Id_patient);
            pst.setString(4, Date);
            pst.executeUpdate();
            System.out.println("Mise a jour effectuée avec succes!  ");
        } catch (SQLException ex) {
            System.err.println("MAJ a generé des erreurs !! " + ex.getMessage());
             JOptionPane.showMessageDialog(null, "Erreur lors de la mise a jour ","Avertissement", 0);
        }
    }

}
