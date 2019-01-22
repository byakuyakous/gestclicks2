

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
 * @author hatim
 */
public class daoOperation {
    
    private Statement St;
    private Connection Con;
    
     public daoOperation()
    {
        Con=new Connexion().seConnecter();
        
    }
    public void Ajouter(String dentiste, String patient,String type,Date date,String remarque) 
    {
            try{  
        PreparedStatement Pst = Con.prepareStatement("insert into operer values(?,?,?,?,?)");
        Pst.setString(1, dentiste);
        Pst.setString(2, patient);
        Pst.setString(3, type);
        Pst.setDate(4, date);
        Pst.setString(5, remarque);
        Pst.executeUpdate();
        System.out.println("L'operation a bien ete ajoutée !  ");
        } catch (SQLException ex) {
            System.err.println("la requete ajouter operation a generer des erreures ! " + ex.getMessage());
        }   
      
    }
    public ResultSet Afficher() {
        ResultSet Resultat = null;
        try {

            St = Con.createStatement();
            Resultat = St.executeQuery("select * from operer");
            System.out.println("Affichage des operations : ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }   
      return Resultat;
    }
    
              public void AfficherById(String id) 
    {
            try
              { 
                ResultSet Resultat;
                St=Con.createStatement();
                Resultat=St.executeQuery("select * from operer where id_employe="+id);
                System.out.println("Affichage : ");
                if(Resultat.next())
                {
                    System.out.println(Resultat.getString(1)+" "+ Resultat.getString(2)+" "+ Resultat.getString(3)+" "
                    + Resultat.getDate(4)+" "+Resultat.getString(5));
                }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }   
      
    }
    
    
        public void Supprimer(String idp, String idd)
        {
            try
            {
              PreparedStatement Pst = Con.prepareStatement("delete from operer where id_dentiste=? and id_patient=?");
              Pst.setString(1,idd);
              Pst.setString(2,idp);
              Pst.executeUpdate();
              System.out.println("L'operation a bien ete supprimé !");
            }
            catch (SQLException ex) {
            System.err.println("la requete supprimer operation a generé des erreures ! " + ex.getMessage());
        }
        }
   
}
