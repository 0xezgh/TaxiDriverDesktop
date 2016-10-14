/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui.client;

import edu.esprit.DAO.classes.CommentaireDAO;
import edu.esprit.DAO.classes.OffreDAO;
import edu.esprit.entities.Client;
import edu.esprit.entities.Commentaire;
import edu.esprit.entities.Offre;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amina jebari
 */
public class ConsulterOffre_1 extends javax.swing.JFrame {
 private String log;
 private String pwd;
  private int idClient;

    
    public ConsulterOffre_1() {
        initComponents();
    }
    
   public ConsulterOffre_1(String log ,String pwd,int idClient) {
        initComponents();
        this.log=log;
        this.pwd=pwd;
         this.idClient= idClient;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOffre = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TAjoutCommentaire = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCommentaire = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblOffre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "numéro de l'offre", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOffre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOffreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOffre);
        if (tblOffre.getColumnModel().getColumnCount() > 0) {
            tblOffre.getColumnModel().getColumn(0).setResizable(false);
            tblOffre.getColumnModel().getColumn(1).setResizable(false);
            tblOffre.getColumnModel().getColumn(2).setResizable(false);
            tblOffre.getColumnModel().getColumn(3).setResizable(false);
        }

        TAjoutCommentaire.setColumns(20);
        TAjoutCommentaire.setRows(5);
        jScrollPane5.setViewportView(TAjoutCommentaire);

        tblCommentaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "sujet", "contenu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCommentaire);

        jButton1.setText("Ajouter un commentaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("consulter l'agence selectionnée");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("passer une réclamation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setLabel("retour");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void UpdateModelCommentaire()
    {
          DefaultTableModel modelCommentaire = (DefaultTableModel) tblCommentaire.getModel();
          DefaultTableModel modelOffre = (DefaultTableModel) tblOffre.getModel();

     try
     {
        CommentaireDAO com=CommentaireDAO.getInstance();
        ResultSet listCommentaire;
      int idOffre =  Integer.parseInt((modelOffre.getValueAt(tblOffre.getSelectedRow(),0)).toString());
       listCommentaire   = com.DisplayAllCommentairesByoffre(idOffre);
             
        tblCommentaire.setModel(DbUtils.resultSetToTableModel(listCommentaire));
     }
     catch (Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
              
     }

    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                 UpdateModelOffre();
                


    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        DefaultTableModel model = (DefaultTableModel) tblOffre.getModel();
        int idAgence=Integer.parseInt(model.getValueAt(tblOffre.getSelectedRow(),0).toString());
        PasserReclamation page=new PasserReclamation(idAgence, idClient,log,pwd);
        page.setVisible(true);
        this.setVisible(false);
        }
        catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Veuillez selectionner une Agence" );
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        DefaultTableModel model = (DefaultTableModel) tblOffre.getModel();
        int idOffre=Integer.parseInt(model.getValueAt(tblOffre.getSelectedRow(),0).toString());
        int idAgence=OffreDAO.getInstance().findAgenceByIdOffre(idOffre);

        AcceuilAgenceClient1 page=new AcceuilAgenceClient1(idAgence, idClient,log,pwd);
        page.setVisible(true);
        this.setVisible(false);
        } 
        catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Veuillez selectionner une Agence" );
        }
        catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{
            DefaultTableModel modelOffre = (DefaultTableModel) tblOffre.getModel();
            Offre offre =new Offre();

            int idOffre=Integer.parseInt(modelOffre.getValueAt(tblOffre.getSelectedRow(),0).toString());
            offre.setIdOffre(idOffre);
            Client client=new Client();
            client.setIdClient(idClient);

            Commentaire comm= new Commentaire();
            comm.setClient(client);
            comm.setContenu(TAjoutCommentaire.getText());
            comm.setOffre(offre);

            CommentaireDAO.getInstance().insertCommentaire2(comm);

            UpdateModelCommentaire();
            }
            catch(ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Veuillez selectionner une Agence" );
            }
            catch (Exception e) {
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblOffreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOffreMouseClicked
        UpdateModelCommentaire();
    }//GEN-LAST:event_tblOffreMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
          AccueilClient page=new AccueilClient(log,pwd);
        page.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed
  public void setIdClient(int id) {
        this.idClient = id;
    }
 
 
   
  
     private void UpdateModelOffre()
    {
          DefaultTableModel modelOffre = (DefaultTableModel) tblOffre.getModel();
        
     try
     {
         OffreDAO offre=OffreDAO.getInstance();
        ResultSet listOffre;
             listOffre   = offre.DisplayAllOffresTypeResultSet();
             
        tblOffre.setModel(DbUtils.resultSetToTableModel(listOffre));
     }
     catch (Exception e)
     {
         JOptionPane.showMessageDialog(null, e);
              
     }

    }
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
            java.util.logging.Logger.getLogger(ConsulterOffre_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulterOffre_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulterOffre_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TAjoutCommentaire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblCommentaire;
    private javax.swing.JTable tblOffre;
    // End of variables declaration//GEN-END:variables

    
}