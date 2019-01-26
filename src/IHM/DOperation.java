/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.daoOperation;
import Metier.OperationModel;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author hatim
 */
public class DOperation extends javax.swing.JPanel {

    daoOperation Operation = new daoOperation();
    OperationModel O = new OperationModel();
    
    /**
     * Creates new form DOperation
     */
    public DOperation() {
        initComponents();
        Affichage(); 
        Filtrer(); 
        NombreOperation();
        timer();
    }

    public void Affichage() {
        ResultSet OpAffichage = Operation.Afficher();
        operationtable.setModel(new OperationModel(OpAffichage));

    }
    public void Filtrer()
    {
        Rechercher.getDocument().addDocumentListener(new DocumentListener() {
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
                
                if(Rechercher.getText()== null && Rechercher.getText().equals("Recherher...")){
                   Affichage();
                }
                else{   
                    ResultSet res = Operation.Filtrer(Rechercher.getText());
                    operationtable.setModel(new OperationModel(res));
                     
                }
            }
        });
    }
    public void NombreOperation()
    {
        
        try {
            ResultSet nbrOp = Operation.NombreOp("12");
            nbrOp.next();
             this.nbrOp.setText(nbrOp.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(DOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setPlaceholder()
    {
          Rechercher.setText("Recherher...");
        Rechercher.setForeground(new Color(240,240,240));
    }
     public void timer(){
        java.util.Timer timer = new Timer();
        //Set the schedule function
        timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // Magic here
                    Calendar cal=new GregorianCalendar(Locale.FRANCE);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        month++ ;
                        String jour = ""+day ;
                        String mois = ""+month;
        
                        if(day <10)
                        {
                          jour = "0"+day;
                        }
                        if (month <10)
                        {
                        mois = "0"+month;
                        }
        
       
                        Date.setText("Date : "+jour + "/" + mois + "/" + year );
        
                        int seconde = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int heure = cal.get(Calendar.HOUR);
                        String sec=""+seconde;
                        String min =""+minute;
                        String hour =""+heure;
                        if(seconde <10)
                        {
                          sec = "0"+seconde;
                        }
                        if(heure <10)
                        {
                          hour = "0"+hour;
                        }
                        if(minute <10)
                        {
                          min = "0"+minute;
                        }
                        
        
                        Time.setText("Time : " +hour+":"+min+":"+sec );
        
                        if (cal.get(Calendar.AM_PM)==Calendar.PM)
                        {
                            AmPm.setText("PM");
                        }
                        else{
                            AmPm.setText("AM");
                        }
                                }
                            },
                0, 1000);
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
        operationtable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Rechercher = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nbrOp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        AmPm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        operationtable.setForeground(new java.awt.Color(102, 102, 102));
        operationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"zegg", "geg", "nl", "no"},
                {"p", "inp", "innp", "p"},
                {"pio", "pin", "pin", "pin"},
                {"p", "in", "pin", "pi"},
                {"in", "pin", "pi", "nn"},
                {"pin", "pi", "np", "in"},
                {"pin", "p", "in", "pin"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dentiste", "Patient", "Type", "Date"
            }
        ));
        operationtable.setGridColor(new java.awt.Color(255, 255, 255));
        operationtable.setSelectionBackground(new java.awt.Color(96, 112, 157));
        operationtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operationtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(operationtable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Mes Opérations");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/lp.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        Rechercher.setForeground(new java.awt.Color(204, 204, 204));
        Rechercher.setText(" Recherche...");
        Rechercher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercherMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Nombre d'operations :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NB : Veuillez double cliquer sur l'operation pour modifier une operation");

        Date.setText("jLabel2");

        Time.setText("jLabel5");

        AmPm.setText("AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmPm)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbrOp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date)
                        .addComponent(Time)
                        .addComponent(AmPm))
                    .addComponent(nbrOp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercherMouseClicked
        Rechercher.setText(null);
        Rechercher.setForeground(Color.BLACK);
    }//GEN-LAST:event_RechercherMouseClicked

    private void operationtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operationtableMouseClicked

        if (evt.getClickCount() == 2) {

            int row = operationtable.getSelectedRow();
            if (row != -1) {
                String patient = operationtable.getValueAt(row, 0).toString();
                String Id = operationtable.getValueAt(row, 1).toString();
                String type = operationtable.getValueAt(row, 2).toString();
                String Date = operationtable.getValueAt(row, 3).toString();
                String remarque = operationtable.getValueAt(row, 4).toString();
                
                DOpModification DopModif = new DOpModification(patient,Id,type, remarque,Date, this);
                DopModif.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                DopModif.setVisible(true);
            }
        }


    }//GEN-LAST:event_operationtableMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String Rech = Rechercher.getText();
        ResultSet OpAffichage = Operation.AfficherById(Rech);
        operationtable.setModel(new OperationModel(OpAffichage));
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmPm;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField Rechercher;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nbrOp;
    private javax.swing.JTable operationtable;
    // End of variables declaration//GEN-END:variables

}
