/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestclicks;
import Dao.*;
import IHM.DOperation;
import Metier.Patient;
import Metier.Réceptionniste;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdelkrim
 */
public class GestClicks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
            daoOperation Operation = new daoOperation();
            ResultSet nbrOp = Operation.NombreOp();
            nbrOp.next();
            System.out.println(nbrOp.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(DOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
