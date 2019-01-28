/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Dao.daoPatient;

import Metier.PatientModele;
import static com.sun.javafx.fxml.expression.Expression.set;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.reflect.Array.set;
import java.sql.ResultSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static org.apache.poi.xssf.usermodel.helpers.XSSFIgnoredErrorHelper.set;


/**
 *
 * @author Abdelkrim
 */
public class RPatient extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistePanel1
     */
    public RPatient() {
        initComponents();
        AfficherTPatients();
        
    }

    public void AfficherTPatients()
    {
        ResultSet res=new daoPatient().ReadAll();
        PatientTable.setModel(new PatientModele(res));
    }
   
    public void writeExcel()
    {
       XSSFWorkbook wb=new XSSFWorkbook();
       XSSFSheet ws=wb.createSheet();
       TreeMap<String,Object[]> data=new TreeMap<>();
       PatientModele pm=new PatientModele(new daoPatient().ReadAll());
       data.put("-1",new Object[]{pm.getColumnName(0),pm.getColumnName(1),pm.getColumnName(2),pm.getColumnName(3)});
       for(int i=0;i<pm.getRowCount();i++)
       {
           data.put(Integer.toString(i),new Object[]{pm.getValueAt(i,0).toString(),pm.getValueAt(i,1).toString(),pm.getValueAt(i,2).toString(),pm.getValueAt(i,3).toString()});
           
       }
       Set<String> ids=data.keySet();
       XSSFRow row;
       int rowid=0;
       for(String key:ids)
       {
           row=ws.createRow(rowid++);
           Object[] values=data.get(key);
           int cellid=0;
           for(Object o:values)
           {
               XSSFCell cell=row.createCell(cellid++);
               cell.setCellValue(o.toString());
               
           }
       }
        try {
            FileOutputStream fos=new FileOutputStream(new File("D:\\EXCEL\\Affichage.xlsx"));
            wb.write(fos);
            fos.close();
        } catch (FileNotFoundException ex) {
           System.out.println(ex);
        } catch (IOException ex) {
              System.out.println(ex);
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
        PatientTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        GestPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        GestPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextRechercher = new javax.swing.JTextField();
        GestPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        GestPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "  ID_Patient", "  Nom", "  Prenom", "  Téléphone", "  Dentiste"
            }
        ));
        PatientTable.setGridColor(new java.awt.Color(255, 255, 255));
        PatientTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        PatientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PatientTable);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        GestPanel.setBackground(new java.awt.Color(255, 255, 255));
        GestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/new-user (3).png"))); // NOI18N
        jLabel1.setText("Ajouter patient");

        javax.swing.GroupLayout GestPanelLayout = new javax.swing.GroupLayout(GestPanel);
        GestPanel.setLayout(GestPanelLayout);
        GestPanelLayout.setHorizontalGroup(
            GestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6))
        );
        GestPanelLayout.setVerticalGroup(
            GestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        title.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        title.setText("Gestion des patients");

        GestPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/lp.png"))); // NOI18N

        TextRechercher.setText(" ");
        TextRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRechercherActionPerformed(evt);
            }
        });
        TextRechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextRechercherKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout GestPanel1Layout = new javax.swing.GroupLayout(GestPanel1);
        GestPanel1.setLayout(GestPanel1Layout);
        GestPanel1Layout.setHorizontalGroup(
            GestPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        GestPanel1Layout.setVerticalGroup(
            GestPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GestPanel2.setBackground(new java.awt.Color(255, 255, 255));
        GestPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/icon (2).png"))); // NOI18N
        jLabel3.setText("Exporter");

        javax.swing.GroupLayout GestPanel2Layout = new javax.swing.GroupLayout(GestPanel2);
        GestPanel2.setLayout(GestPanel2Layout);
        GestPanel2Layout.setHorizontalGroup(
            GestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        GestPanel2Layout.setVerticalGroup(
            GestPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        GestPanel4.setBackground(new java.awt.Color(255, 255, 255));
        GestPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GestPanel4MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/refresh-page-option (1).png"))); // NOI18N
        jLabel5.setText("Actualiser");

        javax.swing.GroupLayout GestPanel4Layout = new javax.swing.GroupLayout(GestPanel4);
        GestPanel4.setLayout(GestPanel4Layout);
        GestPanel4Layout.setHorizontalGroup(
            GestPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        GestPanel4Layout.setVerticalGroup(
            GestPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(GestPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GestPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(119, 119, 119)))
                .addGap(6, 6, 6)
                .addComponent(GestPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(title)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GestPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(GestPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GestPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(GestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 768, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GestPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseEntered
        // TODO add your handling code here:
        GestPanel.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanelMouseEntered

    private void GestPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseExited
        // TODO add your handling code here:
         GestPanel.setBackground(Color.white);
    }//GEN-LAST:event_GestPanelMouseExited

    private void GestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanelMouseClicked
        // TODO add your handling code here:
        AjouterPatient add=new AjouterPatient();
        add.setVisible(true);
    }//GEN-LAST:event_GestPanelMouseClicked

    private void TextRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRechercherActionPerformed

    private void TextRechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextRechercherKeyReleased
        // TODO add your handling code here:
        String query=TextRechercher.getText();
         ResultSet res=new daoPatient().ReadAll();
        TableRowSorter<PatientModele> f=new TableRowSorter<PatientModele>(new PatientModele(res));
        PatientTable.setRowSorter(f);
        f.setRowFilter(RowFilter.regexFilter("(?i)"+query));
    }//GEN-LAST:event_TextRechercherKeyReleased

    private void PatientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientTableMouseClicked
        // TODO add your handling code here:
        PatientModele model=(PatientModele) PatientTable.getModel();
        int i=PatientTable.getSelectedRow();
        new AfficherPatient(model.getValueAt(i, 0).toString()).setVisible(true);
    }//GEN-LAST:event_PatientTableMouseClicked

    private void GestPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MouseClicked
        // TODO add your handling code here:
        writeExcel();
        
    }//GEN-LAST:event_GestPanel2MouseClicked

    private void GestPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MouseEntered
        // TODO add your handling code here: 
        GestPanel2.setBackground(new Color(96,112,157));
    }//GEN-LAST:event_GestPanel2MouseEntered

    private void GestPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel2MouseExited
        // TODO add your handling code here:
        GestPanel2.setBackground(Color.white);
    }//GEN-LAST:event_GestPanel2MouseExited

    private void GestPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel4MouseClicked
        // TODO add your handling code here:
       AfficherTPatients();
    }//GEN-LAST:event_GestPanel4MouseClicked

    private void GestPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_GestPanel4MouseEntered

    private void GestPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestPanel4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_GestPanel4MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GestPanel;
    private javax.swing.JPanel GestPanel1;
    private javax.swing.JPanel GestPanel2;
    private javax.swing.JPanel GestPanel3;
    private javax.swing.JPanel GestPanel4;
    private javax.swing.JTable PatientTable;
    private javax.swing.JTextField TextRechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
