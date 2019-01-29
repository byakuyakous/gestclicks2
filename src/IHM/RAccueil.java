/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.daoRendezVous;
import Metier.RendezVousModele;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTable;


/**
 *
 * @author Toshiba
 */
public class RAccueil extends javax.swing.JPanel  {

    /**
     * Creates new form RAccueil
     */
    public RAccueil() {
        initComponents();
        //this is to display Date and Time 
        showDate();
        
        //this is to Display number of patients in the day
        DisplayNbPatient();
        
        //to Display la file d'attente
        Affichage();
    }
    void DisplayNbPatient(){
            daoRendezVous daoRDV = new daoRendezVous();
            
            int Nb = (int)daoRDV.ReadNbRDV();
            System.out.println(Nb);
            NbPatientLabel.setText(String.valueOf(Nb));
        }
        
        void showDate(){
            Date d= new Date();
            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
            DateLabel.setText(s.format(d));
        }
        public void Affichage()
        {
          daoRendezVous daoRDV = new daoRendezVous();
          ResultSet RDVAffichage = daoRDV.ReadToday();
          TableRDV.setModel(new RendezVousModele(RDVAffichage));

        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        NbPatientLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRDV = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Rendez-vous du jour");

        jLabel2.setText("Date du jour :");

        jLabel3.setText("Nombre de patients:");

        TableRDV.setAutoCreateRowSorter(true);
        TableRDV.setForeground(new java.awt.Color(102, 102, 102));
        TableRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Heure", "Nom", "Prenom", "Dentiste", "Annulé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableRDV.setGridColor(new java.awt.Color(255, 255, 255));
        TableRDV.setSelectionBackground(new java.awt.Color(96, 112, 157));
        jScrollPane1.setViewportView(TableRDV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(NbPatientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NbPatientLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel NbPatientLabel;
    private javax.swing.JTable TableRDV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
