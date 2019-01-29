/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import Dao.daoRendezVous;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author Toshiba
 */
public class RendezVous {

    private String id_R;
    private String id_P;
    private Date date_rdv;
    private String heure_rdv;
    private boolean annulé;
    
    public RendezVous(String id_R, String id_P, Date date_rdv, String heure_rdv, boolean annulé) {
        this.id_R = id_R;
        this.id_P = id_P;
        this.date_rdv = date_rdv;
        this.heure_rdv = heure_rdv;
        this.annulé = annulé;
    }
    

    public String getId_P() {
        return id_P;
    }

    public void setId_P(String id_P) {
        this.id_P = id_P;
    }

    public Date getDate_rdv() {
        return date_rdv;
    }

    public void setDate_rdv(Date date_rdv) {
        this.date_rdv = date_rdv;
    }

    public String getHeure_rdv() {
        return heure_rdv;
    }

    public void setHeure_rdv(String heure_rdv) {
        this.heure_rdv = heure_rdv;
    }

    public boolean isAnnulé() {
        return annulé;
    }

    public void setAnnulé(boolean annulé) {
        this.annulé = annulé;
    }


    public String getId_R() {
        return id_R;
    }

    public void setId_R(String id_R) {
        this.id_R = id_R;
    }
  
}
