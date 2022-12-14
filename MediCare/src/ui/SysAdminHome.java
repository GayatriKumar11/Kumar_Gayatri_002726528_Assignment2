/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.PersonDirectory;

/**
 *
 * @author gayatrisk
 */
public class SysAdminHome extends javax.swing.JFrame {

    /**
     * Creates new form SysAdminHome
     */
    PersonDirectory directory;
    
    public SysAdminHome(PersonDirectory directory) {
        initComponents();
        this.directory = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlPanelC = new javax.swing.JPanel();
        lblDoctor = new javax.swing.JLabel();
        btnCreateD = new javax.swing.JButton();
        btnViewD = new javax.swing.JButton();
        lblPatient = new javax.swing.JLabel();
        btnCreateP = new javax.swing.JButton();
        btnViewP = new javax.swing.JButton();
        lblHospital = new javax.swing.JLabel();
        btnCreateHosp = new javax.swing.JButton();
        btnViewHosp = new javax.swing.JButton();
        btnViewE = new javax.swing.JButton();
        lblEncounter = new javax.swing.JLabel();
        btnCreateE = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        btnCreateCom = new javax.swing.JButton();
        btnViewCom = new javax.swing.JButton();
        lblHouse = new javax.swing.JLabel();
        btnViewH = new javax.swing.JButton();
        btnCreateH = new javax.swing.JButton();
        btnViewCity = new javax.swing.JButton();
        btnCreateCity = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblWelcomeHomeD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblDoctor.setText("Doctors");

        btnCreateD.setText("Create");

        btnViewD.setText("View");
        btnViewD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDActionPerformed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblPatient.setText("Patient");

        btnCreateP.setText("Create");

        btnViewP.setText("View");
        btnViewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPActionPerformed(evt);
            }
        });

        lblHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospital.setText("Hospital");

        btnCreateHosp.setText("Create");

        btnViewHosp.setText("View");
        btnViewHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospActionPerformed(evt);
            }
        });

        btnViewE.setText("View");
        btnViewE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEActionPerformed(evt);
            }
        });

        lblEncounter.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblEncounter.setText("Encounter");

        btnCreateE.setText("Create");

        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCommunity.setText("Community");

        btnCreateCom.setText("Create");

        btnViewCom.setText("View");
        btnViewCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewComActionPerformed(evt);
            }
        });

        lblHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHouse.setText("House");

        btnViewH.setText("View");
        btnViewH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHActionPerformed(evt);
            }
        });

        btnCreateH.setText("Create");

        btnViewCity.setText("View");
        btnViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCityActionPerformed(evt);
            }
        });

        btnCreateCity.setText("Create");

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCity.setText("City");

        javax.swing.GroupLayout ControlPanelCLayout = new javax.swing.GroupLayout(ControlPanelC);
        ControlPanelC.setLayout(ControlPanelCLayout);
        ControlPanelCLayout.setHorizontalGroup(
            ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelCLayout.createSequentialGroup()
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelCLayout.createSequentialGroup()
                        .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ControlPanelCLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblHouse))
                            .addGroup(ControlPanelCLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewH))
                            .addGroup(ControlPanelCLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewCity))
                            .addGroup(ControlPanelCLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblCity)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(btnCreateD)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnViewD))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(lblDoctor)
                                    .addGap(44, 44, 44)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(btnCreateCom)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnViewCom))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(lblCommunity)
                                    .addGap(35, 35, 35)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(lblEncounter)
                                    .addGap(39, 39, 39))
                                .addGroup(ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(btnCreateE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnViewE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(lblHospital)
                                    .addGap(49, 49, 49))
                                .addGroup(ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(btnCreateHosp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnViewHosp)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(btnCreateP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnViewP))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelCLayout.createSequentialGroup()
                                    .addComponent(lblPatient)
                                    .addGap(55, 55, 55))))))
                .addContainerGap())
        );
        ControlPanelCLayout.setVerticalGroup(
            ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelCLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateD)
                    .addComponent(btnViewD))
                .addGap(30, 30, 30)
                .addComponent(lblPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateP)
                    .addComponent(btnViewP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateHosp)
                    .addComponent(btnViewHosp))
                .addGap(34, 34, 34)
                .addComponent(lblEncounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateE)
                    .addComponent(btnViewE))
                .addGap(38, 38, 38)
                .addComponent(lblCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCom)
                    .addComponent(btnViewCom))
                .addGap(38, 38, 38)
                .addComponent(lblHouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateH)
                    .addComponent(btnViewH))
                .addGap(51, 51, 51)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ControlPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCity)
                    .addComponent(btnViewCity))
                .addGap(49, 49, 49))
        );

        jSplitPane1.setLeftComponent(ControlPanelC);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcomeHomeD.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWelcomeHomeD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeHomeD.setText("Welcome ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(lblWelcomeHomeD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblWelcomeHomeD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDActionPerformed

    private void btnViewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPActionPerformed

    private void btnViewHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewHospActionPerformed

    private void btnViewEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewEActionPerformed

    private void btnViewComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewComActionPerformed

    private void btnViewHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewHActionPerformed

    private void btnViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCityActionPerformed

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
            java.util.logging.Logger.getLogger(SysAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysAdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new SysAdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanelC;
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnCreateCom;
    private javax.swing.JButton btnCreateD;
    private javax.swing.JButton btnCreateE;
    private javax.swing.JButton btnCreateH;
    private javax.swing.JButton btnCreateHosp;
    private javax.swing.JButton btnCreateP;
    private javax.swing.JButton btnViewCity;
    private javax.swing.JButton btnViewCom;
    private javax.swing.JButton btnViewD;
    private javax.swing.JButton btnViewE;
    private javax.swing.JButton btnViewH;
    private javax.swing.JButton btnViewHosp;
    private javax.swing.JButton btnViewP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEncounter;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblWelcomeHomeD;
    // End of variables declaration//GEN-END:variables
}
