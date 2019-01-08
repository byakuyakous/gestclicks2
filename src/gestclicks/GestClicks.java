/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestclicks;
import Dao.*;
import Metier.Patient;
import Metier.Réceptionniste;
import java.sql.Date;

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
        
        P = new Patient("1","2","3","aaa","bbbb","4444","f",Date.valueOf("1888-04-08"),new Date(144444),"0555","aeaz","A+");
       daoPatient R=new daoPatient();
       R.Delete("1");
        
    }
    
}
