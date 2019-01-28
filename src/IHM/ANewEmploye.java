/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.DaoAdmin;
import Dao.DaoCompte;
import Dao.DaoDentiste;
import Dao.DaoReceptionniste;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Yashida
 */
public class ANewEmploye extends javax.swing.JPanel {

    DaoAdmin DAdmin = new DaoAdmin();
    DaoReceptionniste DRecep = new DaoReceptionniste();
    DaoDentiste DDent = new DaoDentiste();
    DaoCompte DCompte = new DaoCompte();
    
    /**
     * Creates new form ANewEmploye
     */
    public ANewEmploye() {
        initComponents();
    }
    
    public void AjouterAdmin(String ID_EMPLOYE, String LOGIN, String CIN, String NOM, String PRENOM, String SEXE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE,Date DATE__D_EMBAUCHE,String ID_ADMIN,String MDP)
    {
        DCompte.Ajouter(LOGIN, ID_ADMIN, MDP);
        DAdmin.Ajouter(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE);
    }
   public void AjouterDentiste(String ID_EMPLOYE, String LOGIN, String CIN, String NOM, String PRENOM, String SEXE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE,Date DATE__D_EMBAUCHE,String ID_ADMIN,String MDP)
    {
        DCompte.Ajouter(LOGIN, ID_ADMIN, MDP);
        DDent.Ajouter(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE);
    } 
   public void AjouterReceptionniste(String ID_EMPLOYE, String LOGIN, String CIN, String NOM, String PRENOM, String SEXE, String TELEPHONE, String EMAIL, Date DATE_NAISSANCE,Date DATE__D_EMBAUCHE,String ID_ADMIN,String MDP)
    {
        DCompte.Ajouter(LOGIN, ID_ADMIN, MDP);
        DRecep.Ajouter(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE);
    } 
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelReinit = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMdp2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        panelValider = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtMdp = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCin = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextField();
        txtSexe = new javax.swing.JComboBox<>();
        jComboBoxChoixEmploye2 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdresse = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        panelReinit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelReinit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelReinit.setPreferredSize(new java.awt.Dimension(120, 30));
        panelReinit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelReinitMouseClicked(evt);
            }
        });

        jLabel24.setText("       Rénitialiser");

        javax.swing.GroupLayout panelReinitLayout = new javax.swing.GroupLayout(panelReinit);
        panelReinit.setLayout(panelReinitLayout);
        panelReinitLayout.setHorizontalGroup(
            panelReinitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReinitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        panelReinitLayout.setVerticalGroup(
            panelReinitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Veuillez remplir ce formulaire ");

        jLabel16.setText("                   Telephone :");

        jLabel25.setText("                         Sexe :");

        jLabel17.setText("                             Nom :");

        jLabel26.setText("    Date de Naissance :");

        panelValider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelValider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelValider.setPreferredSize(new java.awt.Dimension(120, 30));
        panelValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelValiderMouseClicked(evt);
            }
        });

        jLabel18.setText("Valider");

        javax.swing.GroupLayout panelValiderLayout = new javax.swing.GroupLayout(panelValider);
        panelValider.setLayout(panelValiderLayout);
        panelValiderLayout.setHorizontalGroup(
            panelValiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValiderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelValiderLayout.setVerticalGroup(
            panelValiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jLabel19.setText("                         Login :");

        txtCin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCinActionPerformed(evt);
            }
        });

        jLabel20.setText("                      Prénom :");

        txtPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreActionPerformed(evt);
            }
        });

        jLabel21.setText("                      E-mail :");

        txtLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogActionPerformed(evt);
            }
        });

        txtSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));
        txtSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexeActionPerformed(evt);
            }
        });

        jComboBoxChoixEmploye2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrateurs", "Dentistes", "Réceptionnistes" }));
        jComboBoxChoixEmploye2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChoixEmploye2ActionPerformed(evt);
            }
        });

        jLabel23.setText("                  Confirmer :");

        jLabel14.setText("               Mot de Passe :");

        jLabel15.setText("                           CIN :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        txtAdresse.setColumns(20);
        txtAdresse.setRows(5);
        jScrollPane1.setViewportView(txtAdresse);

        jLabel1.setText("             Adresse :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtNom)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(jComboBoxChoixEmploye2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(panelValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(panelReinit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChoixEmploye2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLog, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelReinit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCinActionPerformed

    private void txtLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogActionPerformed

    private void txtSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexeActionPerformed

    }//GEN-LAST:event_txtSexeActionPerformed

    private void jComboBoxChoixEmploye2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChoixEmploye2ActionPerformed

    }//GEN-LAST:event_jComboBoxChoixEmploye2ActionPerformed

    private void panelValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelValiderMouseClicked
       int reponse = JOptionPane.showConfirmDialog(null, "confirmar ? ", "avis", JOptionPane.YES_NO_OPTION);
       if (reponse==JOptionPane.YES_OPTION) {
        Random rand = new Random();
        int i = rand.nextInt(5000);
        String ID_EMPLOYE = String.valueOf(i) ;
        String LOGIN = txtLog.getText() ;
        String CIN = txtCin.getText() ;
        String NOM = txtNom.getText() ;
        String PRENOM= txtTel.getText() ;
        String SEXE= (String) txtSexe.getSelectedItem() ;
        String TELEPHONE= txtPre.getText() ;
        String EMAIL= txtEmail.getText() ;
        Date DATE_NAISSANCE= Date.valueOf("1888-04-08") ;
        java.sql.Date DATE__D_EMBAUCHE = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        String ID_ADMIN= "idAmin" ;  
        String MDP= txtMdp.getText() ;
    
    String S = (String)jComboBoxChoixEmploye2.getSelectedItem();
        if (S=="Dentistes") AjouterDentiste(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE, ID_ADMIN, MDP);
        if (S=="Réceptionnistes")  AjouterReceptionniste(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE, ID_ADMIN, MDP);
        if (S=="Administrateurs") AjouterAdmin(ID_EMPLOYE, LOGIN, CIN, NOM, PRENOM, SEXE, TELEPHONE, EMAIL, DATE_NAISSANCE, DATE__D_EMBAUCHE, ID_ADMIN, MDP);
       }    
    }//GEN-LAST:event_panelValiderMouseClicked

    private void panelReinitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReinitMouseClicked
        // TODO add your handling code here:
        txtEmail.setText("");
    }//GEN-LAST:event_panelReinitMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxChoixEmploye2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelReinit;
    private javax.swing.JPanel panelValider;
    private javax.swing.JTextArea txtAdresse;
    private javax.swing.JTextField txtCin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLog;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtMdp2;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPre;
    private javax.swing.JComboBox<String> txtSexe;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
