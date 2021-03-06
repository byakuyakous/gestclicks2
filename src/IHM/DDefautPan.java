/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.daoPatient;
import Metier.PatientDentisteModel;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author hatim
 */
public class DDefautPan extends javax.swing.JPanel {
    daoPatient Patient = new daoPatient();
    String IdD="12";
    /**
     * Creates new form DDefaut
     */
    public DDefautPan() {
        initComponents();
        Affichage();
        nbrPatients();
        Filtrer();
    
       
    }
      public void Affichage() {
        ResultSet Res = Patient.ReadD(IdD);
        MesPatients.setModel(new PatientDentisteModel(Res));
    }
      public void nbrPatients(){
       try {
            ResultSet nbrOp = Patient.Nombrepat();
            nbrOp.next();
             this.nbrOp.setText(nbrOp.getString(1));
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
      }
    public void Filtrer()
    {
        RechercherP.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                System.out.println(RechercherP.getText());
                if(RechercherP.getText()== null){
                   Affichage();
                }
                else{   
                    ResultSet res = Patient.Filtrer(RechercherP.getText());
                    MesPatients.setModel(new PatientDentisteModel(res));
                     
                }
            }
        });
    }  
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcceuilPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MesPatients = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RechercherP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nbrOp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        AcceuilPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        MesPatients.setForeground(new java.awt.Color(102, 102, 102));
        MesPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"zegg", "geg", "nl", "no", null},
                {"p", "inp", "innp", "p", null},
                {"pio", "pin", "pin", "pin", null},
                {"p", "in", "pin", "pi", null},
                {"in", "pin", "pi", "nn", null},
                {"pin", "pi", "np", "in", null},
                {"pin", "p", "in", "pin", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prenom", "Dentiste", "Title 5"
            }
        ));
        MesPatients.setGridColor(new java.awt.Color(255, 255, 255));
        MesPatients.setSelectionBackground(new java.awt.Color(96, 112, 157));
        MesPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MesPatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MesPatients);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Nombre de patients : ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/lp.png"))); // NOI18N

        RechercherP.setForeground(new java.awt.Color(204, 204, 204));
        RechercherP.setText(" Rechercher...");
        RechercherP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RechercherP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RechercherPFocusGained(evt);
            }
        });
        RechercherP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Mes Patients");

        nbrOp.setText("12");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NB : Veuillez double cliquer sur le patient pour declancher l'affichage complet et options");

        javax.swing.GroupLayout AcceuilPanelLayout = new javax.swing.GroupLayout(AcceuilPanel);
        AcceuilPanel.setLayout(AcceuilPanelLayout);
        AcceuilPanelLayout.setHorizontalGroup(
            AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcceuilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(AcceuilPanelLayout.createSequentialGroup()
                        .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AcceuilPanelLayout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(AcceuilPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RechercherP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nbrOp))))
                .addGap(18, 18, 18))
            .addGroup(AcceuilPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AcceuilPanelLayout.setVerticalGroup(
            AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcceuilPanelLayout.createSequentialGroup()
                .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AcceuilPanelLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nbrOp))
                        .addGap(32, 32, 32)
                        .addGroup(AcceuilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RechercherP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(AcceuilPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AcceuilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AcceuilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RechercherPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RechercherPFocusGained
        if(RechercherP.getText().equals(" Rechercher...")){
        RechercherP.setText(null);
        RechercherP.setForeground(Color.BLACK);}
    }//GEN-LAST:event_RechercherPFocusGained

    private void RechercherPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercherPActionPerformed

    private void MesPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MesPatientsMouseClicked
       
        if (evt.getClickCount() == 2) {

            int row = MesPatients.getSelectedRow();
            if (row != -1) {
                String Id =MesPatients.getValueAt(row, 0).toString();
                String Nom = MesPatients.getValueAt(row, 1).toString();
                String Prenom = MesPatients.getValueAt(row, 2).toString();
                new DAffichagePatients(Nom,Prenom,Id).setVisible(true);
            }
        }
    }//GEN-LAST:event_MesPatientsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AcceuilPanel;
    private javax.swing.JTable MesPatients;
    private javax.swing.JTextField RechercherP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nbrOp;
    // End of variables declaration//GEN-END:variables
}
