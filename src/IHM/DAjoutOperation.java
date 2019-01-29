
package IHM;
import Dao.daoOperation;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hatim
 */
public class DAjoutOperation extends javax.swing.JFrame {
    daoOperation Operation = new daoOperation();
    DOperation D ;
    DAffichagePatients P;
    String idp;
    String IdD="D1";
    int xMouse;
    int yMouse;
    /**
     * Creates new form AjoutOperation
     */
    public DAjoutOperation() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public DAjoutOperation(DOperation Do) {
       this();
       D=Do;
    }
       public DAjoutOperation(DAffichagePatients Do,String id) {
       this();
       P=Do;
       idp=id;
    }
    public void Reinitialiser()
    {
        OPRemarques.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        Exitpanel = new javax.swing.JPanel();
        ExitPanel = new javax.swing.JLabel();
        Reducepanel = new javax.swing.JPanel();
        ExitPanel1 = new javax.swing.JLabel();
        NpLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OPRemarques = new javax.swing.JTextArea();
        Reinitialiser = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Valider = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        OPTypeop = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        TopPanel.setBackground(new java.awt.Color(51, 129, 162));
        TopPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopPanelMouseDragged(evt);
            }
        });
        TopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopPanelMousePressed(evt);
            }
        });

        Exitpanel.setBackground(new java.awt.Color(51, 129, 162));
        Exitpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exitpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitpanelMouseExited(evt);
            }
        });

        ExitPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/exit.png"))); // NOI18N
        ExitPanel.setText("   ");

        javax.swing.GroupLayout ExitpanelLayout = new javax.swing.GroupLayout(Exitpanel);
        Exitpanel.setLayout(ExitpanelLayout);
        ExitpanelLayout.setHorizontalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitpanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        ExitpanelLayout.setVerticalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        Reducepanel.setBackground(new java.awt.Color(51, 129, 162));
        Reducepanel.setPreferredSize(new java.awt.Dimension(44, 45));
        Reducepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReducepanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReducepanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReducepanelMouseExited(evt);
            }
        });

        ExitPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/reduce.png"))); // NOI18N
        ExitPanel1.setText("   ");

        javax.swing.GroupLayout ReducepanelLayout = new javax.swing.GroupLayout(Reducepanel);
        Reducepanel.setLayout(ReducepanelLayout);
        ReducepanelLayout.setHorizontalGroup(
            ReducepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReducepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        ReducepanelLayout.setVerticalGroup(
            ReducepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReducepanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ExitPanel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NpLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        NpLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NpLabel1.setText("Ajouter operation");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(NpLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reducepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reducepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(Exitpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NpLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Type Operation");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Remarques");

        OPRemarques.setColumns(20);
        OPRemarques.setRows(5);
        jScrollPane1.setViewportView(OPRemarques);

        Reinitialiser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reinitialiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReinitialiserMouseClicked(evt);
            }
        });

        jLabel6.setText("Reinitialiser");

        javax.swing.GroupLayout ReinitialiserLayout = new javax.swing.GroupLayout(Reinitialiser);
        Reinitialiser.setLayout(ReinitialiserLayout);
        ReinitialiserLayout.setHorizontalGroup(
            ReinitialiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReinitialiserLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );
        ReinitialiserLayout.setVerticalGroup(
            ReinitialiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReinitialiserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Valider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ValiderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ValiderMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Valider");

        javax.swing.GroupLayout ValiderLayout = new javax.swing.GroupLayout(Valider);
        Valider.setLayout(ValiderLayout);
        ValiderLayout.setHorizontalGroup(
            ValiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValiderLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        ValiderLayout.setVerticalGroup(
            ValiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValiderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OPTypeop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultation", "Carrie", "Chirurgie", "Detartrage", "Blanchissement", " ", " " }));
        OPTypeop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OPTypeop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPTypeopActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/dent3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(OPTypeop, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(OPTypeop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Valider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitpanelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitpanelMouseClicked

    private void ExitpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitpanelMouseEntered
        // TODO add your handling code here:
        Exitpanel.setBackground(Color.red);
    }//GEN-LAST:event_ExitpanelMouseEntered

    private void ExitpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitpanelMouseExited
        // TODO add your handling code here:
        Exitpanel.setBackground(new Color(51,129,162));
    }//GEN-LAST:event_ExitpanelMouseExited

    private void ReducepanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReducepanelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_ReducepanelMouseClicked

    private void ReducepanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReducepanelMouseEntered
        // TODO add your handling code here:
        Reducepanel.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_ReducepanelMouseEntered

    private void ReducepanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReducepanelMouseExited
        // TODO add your handling code here:
        Reducepanel.setBackground(new Color(51,129,162));
    }//GEN-LAST:event_ReducepanelMouseExited

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void ReinitialiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReinitialiserMouseClicked
      Reinitialiser();
        
    }//GEN-LAST:event_ReinitialiserMouseClicked

    private void ValiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseExited
       Valider.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_ValiderMouseExited

    private void ValiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseEntered
        Valider.setBackground(new Color(91,161,73));
    }//GEN-LAST:event_ValiderMouseEntered

    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
       
        ImageIcon img = new ImageIcon("/Imgs/certificats.png");
        int reponse = JOptionPane.showConfirmDialog(null, "Confirmer l'ajout ! ", "Avis", JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            java.sql.Date Date = new java.sql.Date(Calendar.getInstance().getTime().getTime()); 
            String typeoperation = OPTypeop.getSelectedItem().toString();
            String remarques = OPRemarques.getText().toString();
            Operation.Ajouter(idp,IdD, typeoperation, Date, remarques);
            Reinitialiser();
            dispose();
            P.AffichageOp(idp);  
        }
    }//GEN-LAST:event_ValiderMouseClicked

    private void OPTypeopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPTypeopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPTypeopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DAjoutOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAjoutOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAjoutOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAjoutOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DAjoutOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitPanel;
    private javax.swing.JLabel ExitPanel1;
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JLabel NpLabel1;
    private javax.swing.JTextArea OPRemarques;
    private javax.swing.JComboBox<String> OPTypeop;
    private javax.swing.JPanel Reducepanel;
    private javax.swing.JPanel Reinitialiser;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel Valider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
