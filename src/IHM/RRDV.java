/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.RendezVousShortModele;
import Dao.*;
import Metier.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;


/**
 *
 * @author Toshiba
 */
public class RRDV extends javax.swing.JPanel implements ListSelectionListener{

    /**
     * Creates new form RRDV
     */
    DaoDentiste daoD = new DaoDentiste();
    daoRendezVous daoRDV = new daoRendezVous();
    daoPatient daoP = new daoPatient();
    public RRDV() {
        initComponents();
        
        //Affichage ComboDentiste dans RDV
        AffichageComboBox();
        
        //Affichage date du jour dans RDV du jour  //maybe should be in Affichage
        Calendar cal = Calendar.getInstance();
        DateRDVJ.setCalendar(cal);
        CINPatient.setEnabled(false);
        Affichage();
        
        //Modification du RDV
        ListSelectionModel selectionModel1 = TableRDVJ.getSelectionModel();
        selectionModel1.addListSelectionListener(this);
        ListSelectionModel selectionModel2 = RDVAjout.getSelectionModel();
        selectionModel2.addListSelectionListener(this);
    }
    public void AffichageComboBox(){
        ResultSet r=daoD.Lister();

        try {
            while (r.next()) {  
                ComboDentisteRDV.addItem(r.getString("Nom"));
            }
        } catch (SQLException ex) {
            
        }
    }
    public void Affichage()
    {
        //Affichage Dentiste
        ResultSet RDVAffichageD = daoRDV.ReadAll();
        TableRDVD.setModel(new RendezVousModele(RDVAffichageD));
        //Affichage Ajout 
        ResultSet RDVAffichageP = daoP.ReadShort();
        RDVAjout.setModel(new RendezVousShortModele(RDVAffichageP));
        //Affichage Jour
        Date d=new Date(DateRDVJ.getCalendar().getTime().getTime());
        System.out.println(d);
        ResultSet RDVAffichageJ = daoRDV.ReadJ(d);
        TableRDVJ.setModel(new RendezVousModele(RDVAffichageJ));


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Nouveau = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CINPatient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateOp = new com.toedter.calendar.JDateChooser();
        AjouterRDVBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ShortAjoutRDVTable = new javax.swing.JScrollPane();
        RDVAjout = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        HeureOP = new javax.swing.JComboBox<>();
        ParJour = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRDVJ = new javax.swing.JTable();
        DateRDVJ = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        ParMois = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableRDVM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        DateRDVM = new com.toedter.calendar.JMonthChooser();
        ParDentiste = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ComboDentisteRDV = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableRDVD = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Nouveau.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("CIN du Patient ");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Heure Opération");

        AjouterRDVBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AjouterRDVBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AjouterRDVBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterRDVBtnMouseClicked(evt);
            }
        });

        jLabel7.setText("Ajouter Rendez-vous");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout AjouterRDVBtnLayout = new javax.swing.GroupLayout(AjouterRDVBtn);
        AjouterRDVBtn.setLayout(AjouterRDVBtnLayout);
        AjouterRDVBtnLayout.setHorizontalGroup(
            AjouterRDVBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AjouterRDVBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );
        AjouterRDVBtnLayout.setVerticalGroup(
            AjouterRDVBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjouterRDVBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RDVAjout.setAutoCreateRowSorter(true);
        RDVAjout.setForeground(new java.awt.Color(102, 102, 102));
        RDVAjout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIN", "Nom", "Prenom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RDVAjout.setGridColor(new java.awt.Color(255, 255, 255));
        RDVAjout.setSelectionBackground(new java.awt.Color(96, 112, 157));
        RDVAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RDVAjoutMouseClicked(evt);
            }
        });
        ShortAjoutRDVTable.setViewportView(RDVAjout);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Date Opération");

        HeureOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30" }));

        javax.swing.GroupLayout NouveauLayout = new javax.swing.GroupLayout(Nouveau);
        Nouveau.setLayout(NouveauLayout);
        NouveauLayout.setHorizontalGroup(
            NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NouveauLayout.createSequentialGroup()
                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(AjouterRDVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NouveauLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CINPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(NouveauLayout.createSequentialGroup()
                                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(HeureOP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateOp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addGap(12, 12, 12)))))
                .addComponent(ShortAjoutRDVTable, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        NouveauLayout.setVerticalGroup(
            NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NouveauLayout.createSequentialGroup()
                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CINPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateOp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(HeureOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AjouterRDVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NouveauLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ShortAjoutRDVTable, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ajouter nouveau RDV", Nouveau);

        ParJour.setBackground(new java.awt.Color(255, 255, 255));
        ParJour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TableRDVJ.setAutoCreateRowSorter(true);
        TableRDVJ.setForeground(new java.awt.Color(102, 102, 102));
        TableRDVJ.setModel(new javax.swing.table.DefaultTableModel(
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
        TableRDVJ.setGridColor(new java.awt.Color(255, 255, 255));
        TableRDVJ.setSelectionBackground(new java.awt.Color(96, 112, 157));
        jScrollPane2.setViewportView(TableRDVJ);

        DateRDVJ.setDateFormatString("yyyy-MM-dd");
        DateRDVJ.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateRDVJPropertyChange(evt);
            }
        });

        jLabel1.setText("Date du rendez-vous:");

        javax.swing.GroupLayout ParJourLayout = new javax.swing.GroupLayout(ParJour);
        ParJour.setLayout(ParJourLayout);
        ParJourLayout.setHorizontalGroup(
            ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParJourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateRDVJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParJourLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        ParJourLayout.setVerticalGroup(
            ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParJourLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateRDVJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParJourLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Par jour", ParJour);

        ParMois.setBackground(new java.awt.Color(255, 255, 255));

        TableRDVM.setAutoCreateRowSorter(true);
        TableRDVM.setForeground(new java.awt.Color(102, 102, 102));
        TableRDVM.setModel(new javax.swing.table.DefaultTableModel(
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
        TableRDVM.setGridColor(new java.awt.Color(255, 255, 255));
        TableRDVM.setSelectionBackground(new java.awt.Color(96, 112, 157));
        jScrollPane3.setViewportView(TableRDVM);

        jLabel2.setText("Date du rendez-vous:");

        DateRDVM.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateRDVMPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout ParMoisLayout = new javax.swing.GroupLayout(ParMois);
        ParMois.setLayout(ParMoisLayout);
        ParMoisLayout.setHorizontalGroup(
            ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParMoisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateRDVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
            .addGroup(ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParMoisLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        ParMoisLayout.setVerticalGroup(
            ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParMoisLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateRDVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParMoisLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Par mois", ParMois);

        ParDentiste.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Dentiste:");

        ComboDentisteRDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tous les dentistes" }));
        ComboDentisteRDV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboDentisteRDVItemStateChanged(evt);
            }
        });

        TableRDVD.setAutoCreateRowSorter(true);
        TableRDVD.setForeground(new java.awt.Color(102, 102, 102));
        TableRDVD.setModel(new javax.swing.table.DefaultTableModel(
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
        TableRDVD.setGridColor(new java.awt.Color(255, 255, 255));
        TableRDVD.setSelectionBackground(new java.awt.Color(96, 112, 157));
        jScrollPane6.setViewportView(TableRDVD);

        javax.swing.GroupLayout ParDentisteLayout = new javax.swing.GroupLayout(ParDentiste);
        ParDentiste.setLayout(ParDentisteLayout);
        ParDentisteLayout.setHorizontalGroup(
            ParDentisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParDentisteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboDentisteRDV, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
            .addGroup(ParDentisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParDentisteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6)
                    .addContainerGap()))
        );
        ParDentisteLayout.setVerticalGroup(
            ParDentisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParDentisteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ParDentisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboDentisteRDV)
                    .addComponent(jLabel3))
                .addGap(296, 296, 296))
            .addGroup(ParDentisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParDentisteLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Par dentiste", ParDentiste);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Rendez-vous");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AjouterRDVBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterRDVBtnMouseClicked
        //Idrep
        //insert method to get itreceptionnist connected, in the mean time, it had a random value
        String Idrep = "626262";
               
        //Idpatient
        String Cin = CINPatient.getText();
        //insert method to get idp from cin
        String Idpatient =daoP.ReadIDBYCIN(Cin);
        Date Date = new Date(DateOp.getCalendar().getTime().getTime());
        String HeureOp = HeureOP.getSelectedItem().toString();
        RendezVous RDV = new RendezVous(Idrep, Idpatient, Date, HeureOp, true);
        daoRDV.Create(RDV);
        RestoreDefault();
        JOptionPane.showMessageDialog(this, "Ajout effectué !");
    }//GEN-LAST:event_AjouterRDVBtnMouseClicked

    public void RestoreDefault(){
        
        CINPatient.setText("");
        HeureOP.setSelectedIndex(0);
        DateOp.setCalendar(null);
    }
    private void ComboDentisteRDVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboDentisteRDVItemStateChanged

        ResultSet RDVAffichage;
        String s=ComboDentisteRDV.getSelectedItem().toString();
        
        if(s=="Tous les dentistes"){
           RDVAffichage = daoRDV.ReadAll();  
        }
        else{
           RDVAffichage = daoRDV.ReadD(s); 
        }
      TableRDVD.setModel(new RendezVousModele(RDVAffichage));

    }//GEN-LAST:event_ComboDentisteRDVItemStateChanged
    
    private void DateRDVJPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateRDVJPropertyChange
 
        ResultSet RDVAffichage;
        Date d=new Date(DateRDVJ.getCalendar().getTime().getTime());
        RDVAffichage = daoRDV.ReadJ(d); 
        TableRDVJ.setModel(new RendezVousModele(RDVAffichage));
        

    }//GEN-LAST:event_DateRDVJPropertyChange

    private void DateRDVMPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateRDVMPropertyChange
       ResultSet RDVAffichage;
        int m=DateRDVM.getMonth()+1;
        RDVAffichage = daoRDV.ReadM(m); 
        TableRDVM.setModel(new RendezVousModele(RDVAffichage));
    }//GEN-LAST:event_DateRDVMPropertyChange

    private void RDVAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RDVAjoutMouseClicked
        CINPatient.setText(RDVAjout.getValueAt(RDVAjout.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_RDVAjoutMouseClicked

    @Override
    public void valueChanged(ListSelectionEvent event) {  
        if(event.getSource() == TableRDVJ.getSelectionModel() && event.getValueIsAdjusting()){
            TableModel model = (TableModel)TableRDVJ.getModel();
            String Heure = model.getValueAt(TableRDVJ.getSelectedRow(), 0).toString();
            String Nom = model.getValueAt(TableRDVJ.getSelectedRow(), 1).toString();
            String Prenom = model.getValueAt(TableRDVJ.getSelectedRow(), 2).toString();
            Date Date = new Date(DateRDVJ.getCalendar().getTime().getTime());
            new RModificationRDV(Heure, Nom, Prenom, Date).setVisible(true);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AjouterRDVBtn;
    private javax.swing.JTextField CINPatient;
    private javax.swing.JComboBox<String> ComboDentisteRDV;
    private com.toedter.calendar.JDateChooser DateOp;
    private com.toedter.calendar.JDateChooser DateRDVJ;
    private com.toedter.calendar.JMonthChooser DateRDVM;
    private javax.swing.JComboBox<String> HeureOP;
    private javax.swing.JPanel Nouveau;
    private javax.swing.JPanel ParDentiste;
    private javax.swing.JPanel ParJour;
    private javax.swing.JPanel ParMois;
    private javax.swing.JTable RDVAjout;
    private javax.swing.JScrollPane ShortAjoutRDVTable;
    private javax.swing.JTable TableRDVD;
    private javax.swing.JTable TableRDVJ;
    private javax.swing.JTable TableRDVM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    

}

