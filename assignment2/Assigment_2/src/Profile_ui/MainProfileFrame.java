/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Profile_ui;

import javax.swing.JOptionPane;

//         * @author yashpatel
//         */
public class MainProfileFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainProfileFrame
     */
    public MainProfileFrame() {
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jProfileTitle = new javax.swing.JLabel();
        jFirstName = new javax.swing.JLabel();
        jFnameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLastName = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jMaleRadioButton = new javax.swing.JRadioButton();
        jFemaleRadioButton = new javax.swing.JRadioButton();
        jNdRadioButton = new javax.swing.JRadioButton();
        jLnameTextField = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        jEmailTextField = new javax.swing.JTextField();
        jAge = new javax.swing.JLabel();
        jAgeTextField = new javax.swing.JTextField();
        jPhoneNumber = new javax.swing.JLabel();
        jPhoneNumberTextField = new javax.swing.JTextField();
        jSubmitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jProfileTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jProfileTitle.setText("Profile Registration");

        jFirstName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jFirstName.setText("First Name:");

        jFnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFnameTextFieldActionPerformed(evt);
            }
        });

        jLastName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLastName.setText("Last Name:");

        jGender.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jGender.setText("Gender:");

        buttonGroupGender.add(jMaleRadioButton);
        jMaleRadioButton.setText("Male");
        jMaleRadioButton.setActionCommand("MALE");
        jMaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jFemaleRadioButton);
        jFemaleRadioButton.setText("Female");
        jFemaleRadioButton.setActionCommand("FEMALE\n");
        jFemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jNdRadioButton);
        jNdRadioButton.setText("Not Disclose");
        jNdRadioButton.setActionCommand("NOT DISCLOSE");

        jEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jEmail.setText("Email:");

        jEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailTextFieldActionPerformed(evt);
            }
        });

        jAge.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jAge.setText("Age:");

        jPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jPhoneNumber.setText("Phone Number");

        jPhoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneNumberTextFieldActionPerformed(evt);
            }
        });

        jSubmitButton.setText("Submit");
        jSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitButtonActionPerformed(evt);
            }
        });

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel2)
                                                .addGap(82, 82, 82))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(61, 61, 61)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFemaleRadioButton)
                                            .addComponent(jMaleRadioButton)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jEmail)
                                            .addComponent(jAge)
                                            .addComponent(jPhoneNumber)
                                            .addComponent(jLabel1))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPhoneNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jAgeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jEmailTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFnameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLnameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jNdRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jProfileTitle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jSubmitButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jProfileTitle)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFirstName)
                    .addComponent(jFnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLastName)
                    .addComponent(jLnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGender)
                    .addComponent(jMaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jFemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNdRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEmail)
                    .addComponent(jEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAge)
                    .addComponent(jAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPhoneNumber)
                    .addComponent(jPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jSubmitButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFnameTextFieldActionPerformed

    private void jMaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaleRadioButtonActionPerformed

    private void jFemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFemaleRadioButtonActionPerformed

    private void jSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitButtonActionPerformed
        // TODO add your handling code here:

        try {
            String Fname = this.jFnameTextField.getText();
            String Lname = this.jLnameTextField.getText();
            String Email = this.jEmailTextField.getText();
            String Age = this.jAgeTextField.getText();
            String PhoneNumber = this.jPhoneNumberTextField.getText();
            if (Fname.length() == 0) {
                throw new IllegalArgumentException("First Name is Not Filled");
            }
            if (Lname.length() == 0) {
                throw new IllegalArgumentException("Last Name is Not Filled");
            }
            if (Email.length() == 0) {
                throw new IllegalArgumentException("Email is Not Filled");
            }

            String RegexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            if (!Email.matches(RegexEmail)) {
                throw new IllegalArgumentException("Email Format is Not Correct");
            }

            int valueAge;

            try {
                valueAge = Integer.parseInt(Age);
                if (valueAge < 0 || valueAge > 110) {
                    throw new IllegalArgumentException("Age is between 0 and 110.");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Age should be in number.");
            }

            String phoneRegex = "^\\d{10}$";
            if (!PhoneNumber.matches(phoneRegex)) {
                throw new IllegalArgumentException("Phone Number should be 10 digit and correct the format.");
            }

            if (PhoneNumber.length() == 0) {
                throw new IllegalArgumentException("Phone Number is Not Filled");
            }
            String gender;
            
            if (this.buttonGroupGender.getSelection() == null) {
                throw new IllegalArgumentException("Please Select Option");
            } else {
                gender = this.buttonGroupGender.getSelection().getActionCommand();
            }
//            JFileChooser file = new JFileChooser();
//            if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
//                try {
//                    BufferedImage img = ImageIO.read(file.getSelectedFile());
//                    Image edited_image = img.getScaledInstance(60, 80,
//                            Image.SCALE_SMOOTH);
//                    if (edited_image != null) {
//                        imgLabel.setText(file.getSelectedFile().getAbsolutePath());
//                        this.userInfo.setPic(new ImageIcon(edited_image));
//                    }
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(this, "Please upload image correctly
//correctly.", " Error - Incorrect image
//                    ", JOptionPane.ERROR_MESSAGE);
//ex.printStackTrace();
//                }
//            }

            String DisplayMessage = Fname + " " + Lname + "\n" + Email + "\n" + Age + "\n" + PhoneNumber + "\n" + gender;

            JOptionPane.showMessageDialog(this, DisplayMessage);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jSubmitButtonActionPerformed

    private void jEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailTextFieldActionPerformed

    private void jPhoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneNumberTextFieldActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
//         JFileChooser1 file = new JFileChooser();
//        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
//            try {
//                BufferedImage img = ImageIO.read(file.getSelectedFile());
//                Image edited_image = img.getScaledInstance(60, 80,
//                        Image.SCALE_SMOOTH);
//                if (edited_image != null) {
//                    imgLabel.setText(file.getSelectedFile().getAbsolutePath());
//                    this.userInfo.setPic(new ImageIcon(edited_image));
//                }
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(this, "Please upload image correctly
//correctly.", " Error - Incorrect image
//            
//        
//    ", JOptionPane.ERROR_MESSAGE);
//
//            }
//        }

    }//GEN-LAST:event_jFileChooser1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel jAge;
    private javax.swing.JTextField jAgeTextField;
    private javax.swing.JLabel jEmail;
    private javax.swing.JTextField jEmailTextField;
    private javax.swing.JRadioButton jFemaleRadioButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jFirstName;
    private javax.swing.JTextField jFnameTextField;
    private javax.swing.JLabel jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLastName;
    private javax.swing.JTextField jLnameTextField;
    private javax.swing.JRadioButton jMaleRadioButton;
    private javax.swing.JRadioButton jNdRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPhoneNumber;
    private javax.swing.JTextField jPhoneNumberTextField;
    private javax.swing.JLabel jProfileTitle;
    private javax.swing.JButton jSubmitButton;
    // End of variables declaration//GEN-END:variables
}
