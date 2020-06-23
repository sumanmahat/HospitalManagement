/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author mahat
 */
public class Home extends javax.swing.JFrame {
    public int i=0;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Location = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Location.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/two arrow.png"))); // NOI18N
        btn_Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocationActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 70, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/add new patient.png"))); // NOI18N
        jButton2.setText("AddNew Patient");
        jButton2.setPreferredSize(new java.awt.Dimension(240, 59));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 101, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/add diag.png"))); // NOI18N
        jButton3.setText("Add Diagonisis");
        jButton3.setPreferredSize(new java.awt.Dimension(240, 59));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 166, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/rsz_history1.png"))); // NOI18N
        jButton4.setText("Full History of Patient");
        jButton4.setMaximumSize(new java.awt.Dimension(195, 59));
        jButton4.setMinimumSize(new java.awt.Dimension(195, 59));
        jButton4.setPreferredSize(new java.awt.Dimension(240, 59));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 236, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/rsz_update_details.png"))); // NOI18N
        jButton5.setText("Update Patient Record");
        jButton5.setPreferredSize(new java.awt.Dimension(240, 59));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 306, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/rsz_hospital_information.png"))); // NOI18N
        jButton6.setText("Hospital Information");
        jButton6.setPreferredSize(new java.awt.Dimension(240, 59));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 371, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/exit.png"))); // NOI18N
        jButton7.setText("Logout");
        jButton7.setPreferredSize(new java.awt.Dimension(240, 59));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 448, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagmentsystem/home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //logout
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close","select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocationActionPerformed
        // TODO add your handling code here:
        if(i == 0 ){
            jButton2.setLocation(90,30);
            jButton3.setLocation(333,30);
            jButton4.setLocation(576,30);
            jButton5.setLocation(819,30);
            jButton6.setLocation(1062,30);
            jButton7.setLocation(1062,89);
            i = 1;
            
        }else{
            jButton2.setLocation(10,107);
            jButton3.setLocation(10,184);
            jButton4.setLocation(10,261);
            jButton5.setLocation(10,338);
            jButton6.setLocation(10,415);
            jButton7.setLocation(10,490);
            i = 0;
        }
    }//GEN-LAST:event_btn_LocationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Add new patient record
        new AddNewPatient().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new AddDiagnosisInfo().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new FullHistoryPatient().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new UpdatePatientRecord().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Location;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
