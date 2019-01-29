/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestclicks;
import Dao.*;
import Metier.Patient;

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
        // TODO code application logic here
        
        Patient P;
        
       DaoDentiste d=new DaoDentiste();
       d.Afficher();    
        
    }
    
}
