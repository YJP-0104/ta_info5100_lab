/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
/**
 *
 * @author yashpatel
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        
        initComponents();
        FormJPanel newFormJPanel = new FormJPanel(BottonJPanel);
        this.BottonJPanel.add(newFormJPanel);
        CardLayout layout = (CardLayout) this.BottonJPanel.getLayout();
        layout.next(BottonJPanel);
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
        TopJPanel = new javax.swing.JPanel();
        FormjButton = new javax.swing.JButton();
        viewjButton = new javax.swing.JButton();
        BottonJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        FormjButton.setText("Form");
        FormjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormjButtonActionPerformed(evt);
            }
        });

        viewjButton.setText("View");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopJPanelLayout = new javax.swing.GroupLayout(TopJPanel);
        TopJPanel.setLayout(TopJPanelLayout);
        TopJPanelLayout.setHorizontalGroup(
            TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopJPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(FormjButton)
                .addGap(82, 82, 82)
                .addComponent(viewjButton)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        TopJPanelLayout.setVerticalGroup(
            TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopJPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(TopJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormjButton)
                    .addComponent(viewjButton))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(TopJPanel);

        BottonJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(BottonJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormjButtonActionPerformed

        FormJPanel newFormJPanel = new FormJPanel(BottonJPanel);
        this.BottonJPanel.add(newFormJPanel);
        CardLayout layout = (CardLayout) this.BottonJPanel.getLayout();
        layout.next(BottonJPanel);
    }//GEN-LAST:event_FormjButtonActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
        ViewJPanel newViewJPanel = new ViewJPanel();
        this.BottonJPanel.add(newViewJPanel);
        CardLayout layout = (CardLayout) this.BottonJPanel.getLayout();
        layout.next(BottonJPanel);
    }//GEN-LAST:event_viewjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottonJPanel;
    private javax.swing.JButton FormjButton;
    private javax.swing.JPanel TopJPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables
}