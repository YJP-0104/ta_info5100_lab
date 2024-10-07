/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author yashpatel
 */
public class ViewJPanel extends javax.swing.JPanel {

    ImageIcon profilepicture;
    /**
     * Creates new form FormJPanel
     */
    Patient p1;

    public ViewJPanel() {

        initComponents();
    }

    public ViewJPanel(Patient p1) {
        this.p1 = p1;

        initComponents();
        populateData();
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
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        PaitentTypeJ = new javax.swing.JLabel();
        jImageButton1 = new javax.swing.JButton();
        jSelectImage = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        FnameTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        PaintentTypejCombobox = new javax.swing.JComboBox<>();
        LnamejLabel = new javax.swing.JLabel();
        LnamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EmailjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AgejTextField = new javax.swing.JTextField();
        MessagejLabel = new javax.swing.JLabel();
        MessagejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DatejDateChooser1 = new com.toedter.calendar.JDateChooser();
        imgLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.setActionCommand("MALE");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.setActionCommand("FEMALE");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Others");
        jRadioButtonOthers.setActionCommand("OTHERS");

        PaitentTypeJ.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        PaitentTypeJ.setText("Paitent Type");

        jImageButton1.setText("Image");
        jImageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImageButton1ActionPerformed(evt);
            }
        });

        jSelectImage.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jSelectImage.setText("Select Image");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setText(" Registration");

        jLabelName.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabelName.setText("First Name:");

        FnameTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameTextFieldNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Gender:");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        PaintentTypejCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minor", "Major", "Serious", "ICU" }));

        LnamejLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        LnamejLabel.setText("Last Name:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Age:");

        MessagejLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        MessagejLabel.setText("Message:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Date Chooser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSelectImage)
                            .addComponent(jLabel1)
                            .addComponent(PaitentTypeJ)
                            .addComponent(LnamejLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(MessagejLabel)
                            .addComponent(jLabelName)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DatejDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FnameTextFieldName)
                                        .addComponent(jRadioButtonOthers)
                                        .addComponent(jRadioButtonFemale)
                                        .addComponent(jRadioButtonMale)
                                        .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LnamejTextField)
                                        .addComponent(EmailjTextField)
                                        .addComponent(AgejTextField)
                                        .addComponent(MessagejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jImageButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSubmit)
                            .addComponent(jLabelTitle))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitle)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(FnameTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LnamejLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(AgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MessagejLabel)
                    .addComponent(MessagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOthers)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSelectImage)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jImageButton1)
                                        .addGap(36, 36, 36)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButtonSubmit))
                                    .addComponent(DatejDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PaitentTypeJ))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FnameTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameTextFieldNameActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jImageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImageButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(70, 80,
                        Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    //                    imgLabel.setText(file.getSelectedFile().getAbsolutePath());
                    //                    this.userInfo.setPic(new ImageIcon(edited_image));
                    this.imgLabel.setIcon(new ImageIcon(edited_image));
                    this.profilepicture = new ImageIcon(edited_image);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctlycorrectly.", " Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jImageButton1ActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try {
            String Fname = this.FnameTextFieldName.getText();
            String Lname = this.LnamejTextField.getText();
            String Age = this.AgejTextField.getText();
            String Email = this.EmailjTextField.getText();
            String Message = this.MessagejTextField.getText();
            String paintentType = this.PaintentTypejCombobox.getSelectedItem().toString();
            Date Date = this.DatejDateChooser1.getDate();
            if (Fname.length() == 0) {
                throw new IllegalArgumentException("First Name is Not Filled");
            }
            if (Lname.length() == 0) {
                throw new IllegalArgumentException("Last Name is Not Filled");
            }
            if (Email.length() == 0) {
                throw new IllegalArgumentException("Email is Not Filled");
            }

            if (Message.length() == 0) {
                throw new IllegalArgumentException("Message is not provided");
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

            String gender;

            if (this.buttonGroupGender.getSelection() == null) {
                throw new IllegalArgumentException("Please Select Option");
            } else {
                gender = this.buttonGroupGender.getSelection().getActionCommand();
            }

            String displayMessage = Fname + " " + gender + " " + Email + " " + Message + " " + paintentType + " " + Age + " " + Date;

            JOptionPane.showMessageDialog(this, displayMessage, "Success", JOptionPane.INFORMATION_MESSAGE, this.profilepicture);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonSubmitActionPerformed

    public void populateData() {
        this.FnameTextFieldName.setText(p1.getName());
        this.LnamejTextField.setText(p1.getLname());
        this.AgejTextField.setText(p1.getAge());
        this.EmailjTextField.setText(p1.getEmail());
        this.MessagejTextField.setText(p1.getMessage());
        this.PaintentTypejCombobox.setSelectedItem(p1.getPaitientType());
        this.DatejDateChooser1.setDate(p1.getDate());
       
        this.imgLabel.setIcon(p1.getProfilePicture());
        
        String gender = p1.getGender();
        if (gender.equals("MALE")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
        } else if (gender.equals("FEMALE")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
        } else if (gender.equals("OTHERS")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonOthers.getModel(), true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgejTextField;
    private com.toedter.calendar.JDateChooser DatejDateChooser1;
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JTextField FnameTextFieldName;
    private javax.swing.JLabel LnamejLabel;
    private javax.swing.JTextField LnamejTextField;
    private javax.swing.JLabel MessagejLabel;
    private javax.swing.JTextField MessagejTextField;
    private javax.swing.JComboBox<String> PaintentTypejCombobox;
    private javax.swing.JLabel PaitentTypeJ;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jImageButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JLabel jSelectImage;
    // End of variables declaration//GEN-END:variables
}
