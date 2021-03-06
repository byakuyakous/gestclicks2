/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.DaoCertificat;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hatim
 */
public class DCertificat extends javax.swing.JFrame {
    String idp;
    String Nom;
    String IdD="12";
    DaoCertificat Certificat = new DaoCertificat();
    
    /**
     * Creates new form DCertificat
     */
    public DCertificat() {
        initComponents();
    }
     public DCertificat(String id,String nom) {
        this();
        this.setLocationRelativeTo(null);
        idp=id;
        Nom=nom;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exitpanel = new javax.swing.JPanel();
        ExitPanel = new javax.swing.JLabel();
        Reducepanel = new javax.swing.JPanel();
        ExitPanel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextCertif = new javax.swing.JTextArea();
        Valider2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Reinitialiser = new javax.swing.JPanel();
        Reset = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 129, 162));

        Exitpanel.setBackground(new java.awt.Color(51, 129, 162));
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nouveau Certificat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(Reducepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reducepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(Exitpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Rédigez le certificat : ");

        TextCertif.setColumns(20);
        TextCertif.setRows(5);
        jScrollPane1.setViewportView(TextCertif);

        Valider2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Valider2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Valider2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Valider2MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Valider");

        javax.swing.GroupLayout Valider2Layout = new javax.swing.GroupLayout(Valider2);
        Valider2.setLayout(Valider2Layout);
        Valider2Layout.setHorizontalGroup(
            Valider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Valider2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        Valider2Layout.setVerticalGroup(
            Valider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Valider2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        Reinitialiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReinitialiserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReinitialiserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReinitialiserMouseExited(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Reset.setText("Reinitialiser");

        javax.swing.GroupLayout ReinitialiserLayout = new javax.swing.GroupLayout(Reinitialiser);
        Reinitialiser.setLayout(ReinitialiserLayout);
        ReinitialiserLayout.setHorizontalGroup(
            ReinitialiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReinitialiserLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Reset)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        ReinitialiserLayout.setVerticalGroup(
            ReinitialiserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReinitialiserLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(Reset)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Valider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Reinitialiser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        //this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_ReducepanelMouseClicked

    private void ReducepanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReducepanelMouseEntered
        // TODO add your handling code here:
        Reducepanel.setBackground(new Color(58,67,94));
    }//GEN-LAST:event_ReducepanelMouseEntered

    private void ReducepanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReducepanelMouseExited
        // TODO add your handling code here:
        Reducepanel.setBackground(new Color(51,129,162));
    }//GEN-LAST:event_ReducepanelMouseExited

    private void Valider2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valider2MouseClicked
         //inserer ordonnance dans la table
            String Ord =TextCertif.getText();
            java.sql.Date Date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            Certificat.Create(idp,IdD, Date, Ord);
        Document doc= new Document();
        doc.setPageSize(PageSize.A6);
       
        try {
           
            
            LocalDateTime DateA = LocalDateTime.now();
            String pdfname="Certificat"+Nom+(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(DateA))+".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(pdfname));
            doc.open();
            String imageFile = "rsz_images.png"; 
            Image img = Image.getInstance(imageFile);
            img.setSpacingBefore(-10f);
            doc.add(img);
            
            Paragraph P = new Paragraph();
            P.setSpacingBefore(-38f);
            P.setFont(FontFactory.getFont(FontFactory.COURIER,10,Font.NORMAL,BaseColor.BLACK));
            LocalDateTime DateN = LocalDateTime.now();
            P.add((DateTimeFormatter.ofPattern("MM-dd-yyyy H:m:s").format(DateN)));
            P.setAlignment(Element.ALIGN_RIGHT);
            P.setSpacingAfter(30f);
            doc.add(P);
            
            Paragraph P1 = new Paragraph();
            P1.setFont(FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLACK));
            P1.add("Certificat Medical");
            P1.setAlignment(Element.ALIGN_CENTER);
            doc.add(P1);
            
            Paragraph P2 = new Paragraph();
            P2.setSpacingBefore(35f);
            P2.setFont(FontFactory.getFont(FontFactory.TIMES,10,Font.NORMAL,BaseColor.BLACK));
            P2.add(TextCertif.getText().toString());
            P2.setAlignment(Element.ALIGN_JUSTIFIED);
            P2.setSpacingAfter(35f);
            doc.add(P2);
            
            String Signature ="rsz_1stamp3.jpg"; 
            Image img1 = Image.getInstance(Signature);
            img1.setAlignment(Element.ALIGN_RIGHT);
            doc.add(img1);
            doc.close();
            JOptionPane.showMessageDialog(null, "Certificat generée avec succés");
            //Affichage du certificat en pdf
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "
                    +"C:\\Users\\hatim\\OneDrive\\S1\\JAVA\\TDs\\projet 2018\\gestclicks2\\"+pdfname) ;
            dispose();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
         catch (IOException ex) {
             System.err.println(ex.getMessage());
        }   catch (DocumentException ex) {
                Logger.getLogger(DOrdonance.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Valider2MouseClicked

    private void Valider2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valider2MouseEntered
        Valider2.setBackground(new Color(91,161,73));
    }//GEN-LAST:event_Valider2MouseEntered

    private void Valider2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Valider2MouseExited
        Valider2.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_Valider2MouseExited

    private void ReinitialiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReinitialiserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinitialiserMouseClicked

    private void ReinitialiserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReinitialiserMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinitialiserMouseEntered

    private void ReinitialiserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReinitialiserMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinitialiserMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DCertificat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCertificat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCertificat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCertificat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DCertificat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitPanel;
    private javax.swing.JLabel ExitPanel1;
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JPanel Reducepanel;
    private javax.swing.JPanel Reinitialiser;
    private javax.swing.JLabel Reset;
    private javax.swing.JTextArea TextCertif;
    private javax.swing.JPanel Valider2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
