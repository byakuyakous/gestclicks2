/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.DaoCompte;
import Dao.DaoAdmin;
import Dao.DaoReceptionniste;
import Dao.DaoDentiste;
import Metier.CompteModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Yashida
 */
public class AListeEmployes extends javax.swing.JPanel {

    DaoCompte DCompte = new DaoCompte();
    DaoAdmin DAdmin = new DaoAdmin();
    DaoReceptionniste DRecep = new DaoReceptionniste();
    DaoDentiste DDent = new DaoDentiste();
    AModifierEmploye panelModif;
    
    public AListeEmployes() {
        initComponents();
        AffichageAdmin();
    }
    
          
    public void AffichageAdmin() {
        ResultSet Rs = DAdmin.Afficher();
        tableEmploye.setModel(new CompteModel(Rs));   
    }
    public void AffichageReceptionniste() {
        ResultSet Rs = DRecep.Afficher();
        tableEmploye.setModel(new CompteModel(Rs));   
    }
    public void AffichageDentiste() {
        ResultSet Rs = DDent.Afficher();
        tableEmploye.setModel(new CompteModel(Rs));   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmploye = new javax.swing.JTable();
        jComboBoxChoixEmploye = new javax.swing.JComboBox<>();
        panelSupprimer = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelActualiser = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelSearch = new javax.swing.JLabel();
        txtRecherche = new javax.swing.JTextField();

        tableEmploye.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "CIN", "Login", "Sexe", "Adresse", "Date de Naissance", "Téléphone", "E-mail", "Date d'embauche"
            }
        ));
        tableEmploye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmploye);
        if (tableEmploye.getColumnModel().getColumnCount() > 0) {
            tableEmploye.getColumnModel().getColumn(5).setResizable(false);
            tableEmploye.getColumnModel().getColumn(6).setResizable(false);
        }

        jComboBoxChoixEmploye.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrateurs", "Dentistes", "Réceptionnistes" }));
        jComboBoxChoixEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChoixEmployeActionPerformed(evt);
            }
        });

        panelSupprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSupprimer.setPreferredSize(new java.awt.Dimension(120, 30));
        panelSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSupprimerMouseClicked(evt);
            }
        });

        jLabel24.setText("Supprimer");

        javax.swing.GroupLayout panelSupprimerLayout = new javax.swing.GroupLayout(panelSupprimer);
        panelSupprimer.setLayout(panelSupprimerLayout);
        panelSupprimerLayout.setHorizontalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSupprimerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSupprimerLayout.setVerticalGroup(
            panelSupprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        panelActualiser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelActualiser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelActualiser.setPreferredSize(new java.awt.Dimension(120, 30));
        panelActualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelActualiserMouseClicked(evt);
            }
        });

        jLabel25.setText("Actualiser");

        javax.swing.GroupLayout panelActualiserLayout = new javax.swing.GroupLayout(panelActualiser);
        panelActualiser.setLayout(panelActualiserLayout);
        panelActualiserLayout.setHorizontalGroup(
            panelActualiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualiserLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelActualiserLayout.setVerticalGroup(
            panelActualiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Liste des Employés");

        labelSearch.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/lp.png"))); // NOI18N

        txtRecherche.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(panelActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jComboBoxChoixEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(txtRecherche, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSearch)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxChoixEmploye)
                        .addComponent(jLabel22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxChoixEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChoixEmployeActionPerformed
        // if var = receptionneist faire afficher recep ...
        String type = (String)jComboBoxChoixEmploye.getSelectedItem();
        if (type=="Dentistes") AffichageDentiste();
        if (type=="Réceptionnistes") AffichageReceptionniste();
        if (type=="Administrateurs") AffichageAdmin();
    }//GEN-LAST:event_jComboBoxChoixEmployeActionPerformed

    private void panelSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSupprimerMouseClicked
        int reponse = JOptionPane.showConfirmDialog(null, "êtes-vous sûr de vouloir continuer", "Confirmation de suppression", JOptionPane.YES_NO_OPTION);
       if (reponse==JOptionPane.YES_OPTION){
        int row = tableEmploye.getSelectedRow();
        if (row != -1) {String ID_EMPLOYE=tableEmploye.getValueAt(row, 0).toString();
                        String LOGIN=tableEmploye.getValueAt(row, 1).toString();
            String type = (String)jComboBoxChoixEmploye.getSelectedItem();
             if (type=="Dentistes") {  DDent.Supprimer(ID_EMPLOYE); 
                                    DCompte.Supprimer(LOGIN);
                                    AffichageDentiste();
             }
             if (type=="Réceptionnistes") { DRecep.Supprimer(ID_EMPLOYE);
                                         DCompte.Supprimer(LOGIN);
                                         AffichageReceptionniste();}
             if (type=="Administrateurs") { DAdmin.Supprimer(ID_EMPLOYE);
                                         DCompte.Supprimer(LOGIN);
                                         AffichageAdmin();}
            }
       }
    }//GEN-LAST:event_panelSupprimerMouseClicked

    private void tableEmployeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeMouseClicked

        if (evt.getClickCount() == 2) {  
            String type = (String)jComboBoxChoixEmploye.getSelectedItem();
                  int row = tableEmploye.getSelectedRow();
                    if (row != -1) { 
                    String ID_EMPLOYE=tableEmploye.getValueAt(row, 0).toString();
                    panelModif=new AModifierEmploye(type,ID_EMPLOYE);  
                    panelModif.setVisible(true);                    
                    } 
                    
        }
    }//GEN-LAST:event_tableEmployeMouseClicked

    private void panelActualiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelActualiserMouseClicked
        // TODO add your handling code here:
         String type = (String)jComboBoxChoixEmploye.getSelectedItem();
        if (type=="Dentistes") AffichageDentiste();
        if (type=="Réceptionnistes") AffichageReceptionniste();
        if (type=="Administrateurs") AffichageAdmin();
    }//GEN-LAST:event_panelActualiserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxChoixEmploye;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JPanel panelActualiser;
    private javax.swing.JPanel panelSupprimer;
    private javax.swing.JTable tableEmploye;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables
}