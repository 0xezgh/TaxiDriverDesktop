/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui.responsableagence;

//import edu.esprit.gui.administrateur.*;
import edu.esprit.DAO.classes.ReclamationDAO;
import edu.esprit.adapters.ConsulterReclamations;
import edu.esprit.entities.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Houssem
 */
public class GestionReclamation extends javax.swing.JFrame {

     private String log;
 private String pwd;
  private int idResp;
  
    private List<Reclamation> listeReclamations;
    private static HistoriqueReclamation historiqueReclamationGUI; 
    private static GestionReclamation gestionReclamationGUI; 
    
    public GestionReclamation() {
        initComponents();
        historiqueReclamationGUI=new HistoriqueReclamation();
        gestionReclamationGUI=this;
        
        refresh();

    }
     public GestionReclamation(String login,String pwd,int idResp) {
       
      this.log=login;
        this.pwd=pwd;
       this.idResp=idResp;
    initComponents();
    
      historiqueReclamationGUI=new HistoriqueReclamation();
        gestionReclamationGUI=this;
        
        refresh();
    } 
    
    private void refresh(){
        listeReclamations=ReclamationDAO.getInstance().DisplayReclamationsConfirme(false);

        jTable1.setModel(new ConsulterReclamations(listeReclamations));
    }
    
    private Reclamation searchReclamationById(int id){
        for (Reclamation r : listeReclamations) {
            if(r.getIdReclamation()==id)
                return r;
        }
        return null;
    }

    public static HistoriqueReclamation getHistoriqueReclamationGUI() {
        return historiqueReclamationGUI;
    }

    public static GestionReclamation getGestionReclamationGUI() {
        return gestionReclamationGUI;
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenuReclamation = new javax.swing.JTextArea();
        confirmer = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        historiqueButton = new javax.swing.JButton();
        supprimerButton = new javax.swing.JButton();
        rechercheButton = new javax.swing.JButton();
        recherche = new javax.swing.JTextField();
        critereRecherche = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        contenuReclamation.setColumns(20);
        contenuReclamation.setRows(5);
        contenuReclamation.setEnabled(false);
        jScrollPane2.setViewportView(contenuReclamation);

        confirmer.setText("Confirmer");
        confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmerActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        historiqueButton.setText("Historique");
        historiqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiqueButtonActionPerformed(evt);
            }
        });

        supprimerButton.setText("Supprimer");
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        rechercheButton.setText("Recherche");
        rechercheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheButtonActionPerformed(evt);
            }
        });

        critereRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client", "Sujet", "Date"}));
        critereRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critereRechercheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(retourButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(historiqueButton)
                        .addGap(18, 18, 18)
                        .addComponent(Refresh)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(critereRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(supprimerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmer)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rechercheButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercheButton)
                    .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critereRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmer)
                    .addComponent(Refresh)
                    .addComponent(retourButton)
                    .addComponent(historiqueButton)
                    .addComponent(supprimerButton))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        refresh();
    }//GEN-LAST:event_RefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int idRec=Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString());
        Reclamation r=searchReclamationById(idRec);
        contenuReclamation.setText(r.getcontenu());
        
        switch (critereRecherche.getSelectedItem()+"") {
                case "Client":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    break;
                case "Sujet":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    break;
               
                default:
                    recherche.setText("Erreur");
                    break;
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void confirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerActionPerformed
        int idRec=Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString());
        ReclamationDAO rDAO=ReclamationDAO.getInstance();

        Reclamation r1=rDAO.findReclamationById(idRec);
        r1.setEtat(true);
        rDAO.updateReclamationRespAgence(r1);
        
        refresh();
        contenuReclamation.setText("");
    }//GEN-LAST:event_confirmerActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed

        AccueilRespAgence.getAccueilGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retourButtonActionPerformed

    private void supprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
        try {
            Reclamation r=new Reclamation();
            r.setIdReclamation(Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            ReclamationDAO.getInstance().deleteReclamation(r);
            refresh();
            contenuReclamation.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner une ligne" );
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

    private void historiqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiqueButtonActionPerformed
        historiqueReclamationGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_historiqueButtonActionPerformed

    private void rechercheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheButtonActionPerformed
        List<Reclamation> auxListe =new ArrayList<>();
        switch (critereRecherche.getSelectedItem()+"") {
                case "Client":
                    for (Reclamation listeReclamation1 : listeReclamations) {
                        if(listeReclamation1.getClient().getNom().equals(recherche.getText()))
                            auxListe.add(listeReclamation1);
                    }
                    jTable1.setModel(new ConsulterReclamations(auxListe));                    
                    break;
                case "Sujet":
                    for (Reclamation listeReclamation1 : listeReclamations) {
                        if(listeReclamation1.getsujetReclamation().equals(recherche.getText()))
                            auxListe.add(listeReclamation1);
                    }
                    jTable1.setModel(new ConsulterReclamations(auxListe));                    
                    break;
              
                default:
                    recherche.setText("Erreur");
                    break;
            }
    }//GEN-LAST:event_rechercheButtonActionPerformed

    private void critereRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critereRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_critereRechercheActionPerformed

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
            java.util.logging.Logger.getLogger(GestionReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionReclamation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new GestionReclamation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton confirmer;
    private javax.swing.JTextArea contenuReclamation;
    private javax.swing.JComboBox critereRecherche;
    private javax.swing.JButton historiqueButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField recherche;
    private javax.swing.JButton rechercheButton;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton supprimerButton;
    // End of variables declaration//GEN-END:variables
}
