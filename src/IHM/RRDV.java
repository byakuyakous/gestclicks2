/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.DaoDentiste;
import Dao.daoRendezVous;
import Metier.RendezVousModele;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTabbedPane;

/**
 *
 * @author Toshiba
 */
public class RRDV extends javax.swing.JPanel {

    /**
     * Creates new form RRDV
     */
    
    public RRDV() {
        initComponents();
        DaoDentiste dao = new DaoDentiste();
        ResultSet r=dao.Lister();

        try {
            while (r.next()) {  
                ComboDentisteRDV.addItem(r.getString("Nom"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RRendezvous.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        //end ComboRDV
        Affichage();
        
    }
    public void Affichage()
    {
      //Date d = (Date) jDateChooser1.getDate();
      daoRendezVous daoRDV = new daoRendezVous();
      ResultSet RDVAffichage = daoRDV.ReadD();
      
//      TableRDVM.setModel(new RendezVousModele(RDVAffichage));
//     TableRDVJ.setModel(new RendezVousModele(RDVAffichage));
//      TableRDVD.setModel(new RendezVousModele(RDVAffichage));
      System.out.println("Done");
//      TableRDVP.setModel(new RendezVousModele(RDVAffichage));
 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Nouveau = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        OPIDpatient = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePatient = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        ParJour = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRDVJ = new javax.swing.JTable();
        DateRDVJ = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        ParMois = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableRDVM = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        ParDentiste = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ComboDentisteRDV = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableRDVD = new javax.swing.JTable();
        ParPatient = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        Nouveau.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("CIN du Patient ");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Type Opération");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chirurgie", " " }));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Heure Opération");

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel7.setText("Ajouter Rendez-vous");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablePatient.setAutoCreateRowSorter(true);
        TablePatient.setForeground(new java.awt.Color(102, 102, 102));
        TablePatient.setModel(new javax.swing.table.DefaultTableModel(
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
        TablePatient.setGridColor(new java.awt.Color(255, 255, 255));
        TablePatient.setSelectionBackground(new java.awt.Color(96, 112, 157));
        TablePatient.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablePatientPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(TablePatient);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Date Opération");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30" }));

        javax.swing.GroupLayout NouveauLayout = new javax.swing.GroupLayout(Nouveau);
        Nouveau.setLayout(NouveauLayout);
        NouveauLayout.setHorizontalGroup(
            NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NouveauLayout.createSequentialGroup()
                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(OPIDpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        NouveauLayout.setVerticalGroup(
            NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NouveauLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(NouveauLayout.createSequentialGroup()
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(OPIDpatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(NouveauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        TableRDVJ.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableRDVJPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(TableRDVJ);

        DateRDVJ.setDateFormatString("yyyy-MM-dd");

        jLabel1.setText("Date du rendez-vous:");

        javax.swing.GroupLayout ParJourLayout = new javax.swing.GroupLayout(ParJour);
        ParJour.setLayout(ParJourLayout);
        ParJourLayout.setHorizontalGroup(
            ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParJourLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParJourLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(DateRDVJ, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(544, 544, 544)))
                    .addContainerGap()))
        );
        ParJourLayout.setVerticalGroup(
            ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
            .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParJourLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(ParJourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DateRDVJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
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
        TableRDVM.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableRDVMPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(TableRDVM);

        jLabel2.setText("Date du rendez-vous:");

        javax.swing.GroupLayout ParMoisLayout = new javax.swing.GroupLayout(ParMois);
        ParMois.setLayout(ParMoisLayout);
        ParMoisLayout.setHorizontalGroup(
            ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParMoisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(ParMoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ParMoisLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Par mois", ParMois);

        ParDentiste.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Dentiste:");

        ComboDentisteRDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboDentisteRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDentisteRDVActionPerformed(evt);
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
        TableRDVD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableRDVDPropertyChange(evt);
            }
        });
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

        ParPatient.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CIN", "Nom", "Prenom"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Heure"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout ParPatientLayout = new javax.swing.GroupLayout(ParPatient);
        ParPatient.setLayout(ParPatientLayout);
        ParPatientLayout.setHorizontalGroup(
            ParPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParPatientLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ParPatientLayout.setVerticalGroup(
            ParPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParPatientLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(ParPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(ParPatientLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Par patient", ParPatient);

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

    private void ComboDentisteRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDentisteRDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDentisteRDVActionPerformed

    private void TableRDVMPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableRDVMPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_TableRDVMPropertyChange

    private void TableRDVJPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableRDVJPropertyChange
        /* int row = TableRDV.getSelectedRow();
        int column = TableRDV.getSelectedColumn();

        // resul is the new value to insert in the DB
        String resul = TableRDV.getValueAt(row, 5).toString();
        // id is the primary key of my DB
        String id = TableRDV.getValueAt(row, 0).toString();
        */
        //update(id, resul, column);
    }//GEN-LAST:event_TableRDVJPropertyChange

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        
    }//GEN-LAST:event_jPanel5MouseClicked

    private void TablePatientPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablePatientPropertyChange
        /* int row = TableRDV.getSelectedRow();
        int column = TableRDV.getSelectedColumn();

        // resul is the new value to insert in the DB
        String resul = TableRDV.getValueAt(row, 5).toString();
        // id is the primary key of my DB
        String id = TableRDV.getValueAt(row, 0).toString();
        */
        //update(id, resul, column);
    }//GEN-LAST:event_TablePatientPropertyChange

    private void TableRDVDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableRDVDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_TableRDVDPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDentisteRDV;
    private com.toedter.calendar.JDateChooser DateRDVJ;
    private javax.swing.JPanel Nouveau;
    private javax.swing.JTextField OPIDpatient;
    private javax.swing.JPanel ParDentiste;
    private javax.swing.JPanel ParJour;
    private javax.swing.JPanel ParMois;
    private javax.swing.JPanel ParPatient;
    private javax.swing.JTable TablePatient;
    private javax.swing.JTable TableRDVD;
    private javax.swing.JTable TableRDVJ;
    private javax.swing.JTable TableRDVM;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    

}

