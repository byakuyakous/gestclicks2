/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.sql.Date;

/**
 *
 * @author Abdelkrim
 */
public class Patient {
    String idP;
    String idR;
    String idD;
    String nom;
    String prenom;
    String cin;
    String sexe;
    Date date_naissance;
    Date date_creation;
    String tél;
    String email;
    String type_sang;

    public Patient(String idP, String idR, String idD, String nom, String prenom, String cin, String sexe, Date date_naissance, Date date_creation, String tél, String email, String type_sang) {
        this.idP = idP;
        this.idR = idR;
        this.idD = idD;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.sexe = sexe;
        this.date_naissance = date_naissance;
        this.date_creation = date_creation;
        this.tél = tél;
        this.email = email;
        this.type_sang = type_sang;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public String getIdR() {
        return idR;
    }

    public void setIdR(String idR) {
        this.idR = idR;
    }

    public String getIdD() {
        return idD;
    }

    public void setIdD(String idD) {
        this.idD = idD;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public String getTél() {
        return tél;
    }

    public void setTél(String tél) {
        this.tél = tél;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType_sang() {
        return type_sang;
    }

    public void setType_sang(String type_sang) {
        this.type_sang = type_sang;
    }
    
}
