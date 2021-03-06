/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.DaoCertificat;
import Metier.CertificatModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hatim
 */
public class DCertificatsPan extends javax.swing.JPanel {
    DaoCertificat C = new DaoCertificat();
    String IdD="12";
    
    /**
     * Creates new form DCertificatsPan
     */
    public DCertificatsPan() {
        initComponents();
        Afficher();
        NombreCertificat();
    }
        public void Afficher(){
            
        ResultSet Res = C.Read(IdD);
        Certificats.setModel(new CertificatModel(Res));
        
    }
         public void NombreCertificat()
    {
        
        try {
            ResultSet nbrOp = C.NombreCertif(IdD);
            nbrOp.next();
             this.nbrOp.setText(nbrOp.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(DOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        Certificats = new javax.swing.JTable();
        nbrOp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        Certificats.setAutoCreateRowSorter(true);
        Certificats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Certificats.setGridColor(new java.awt.Color(255, 255, 255));
        Certificats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CertificatsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Certificats);

        nbrOp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nbrOp.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de certificats attribués : ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Mes Certificats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nbrOp))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel2)))
                        .addGap(0, 317, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrOp)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CertificatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CertificatsMouseClicked
            try{
        if (evt.getClickCount() == 2) {
            int row = Certificats.getSelectedRow();
            if (row != -1) {
               String Nom = Certificats.getValueAt(row, 0).toString();
               String date = Certificats.getValueAt(row,2).toString();
               String pdfname="Certificat"+Nom+date+".pdf";
               System.out.println(pdfname);
               Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "
                    +"C:\\Users\\hatim\\OneDrive\\S1\\JAVA\\TDs\\projet 2018\\gestclicks2\\"+pdfname) ;
               System.out.println("done");
            }
        }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_CertificatsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Certificats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nbrOp;
    // End of variables declaration//GEN-END:variables
}
