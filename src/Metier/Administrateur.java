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
public class Administrateur extends Employé {
    
    public Administrateur(String id, String login, String cin, String nom, String prenom, String sexe, String tél, String email, Date date_naissance, Date date_embauche) {
        super(id, login, cin, nom, prenom, sexe, tél, email, date_naissance, date_embauche);
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getIdE() {
        return idE;
    }

    public void setIdE(String idE) {
        this.idE = idE;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(Date date_embauche) {
        this.date_embauche = date_embauche;
    }
    
}
