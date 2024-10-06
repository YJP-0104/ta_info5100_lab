/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author yashpatel
 */
public class FormJPanel extends javax.swing.JPanel {

    ImageIcon profilepicture;
    JPanel BottonJPanel;

    /**
     * Creates new form FormJPanel
     * @param BottonJPanel
     */
    public FormJPanel(JPanel BottonJPanel) {
        this.BottonJPanel = BottonJPanel;
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
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        PaitentTypeJ = new javax.swing.JLabel();
        jImageButton1 = new javax.swing.JButton();
        jSelectImage = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        PaintentTypejCombobox = new javax.swing.JComboBox<>();
        imgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LnamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EmailjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AgejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MessagejTextField = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 255, 102));

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

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Message:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSubmit)
                            .addComponent(jLabelTitle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSelectImage)
                                    .addComponent(jLabel1)
                                    .addComponent(PaitentTypeJ))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonMale)
                                    .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonFemale)
                                    .addComponent(jRadioButtonOthers)
                                    .addComponent(jImageButton1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LnamejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MessagejTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitle)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MessagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaitentTypeJ)
                    .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonOthers)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jImageButton1)
                    .addComponent(jSelectImage))
                .addGap(18, 18, 18)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButtonSubmit)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

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
                Image edited_image = img.getScaledInstance(60, 80,
                        Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    //                    imgLabel.setText(file.getSelectedFile().getAbsolutePath());
                    //                    this.userInfo.setPic(new ImageIcon(edited_image));
                    this.imgLabel.setIcon(new ImageIcon(edited_image));
                    this.profilepicture = new ImageIcon(edited_image);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctlycorrectly.", " Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jImageButton1ActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        try {
            String Fname = this.jTextFieldName.getText();
            String Lname = this.LnamejTextField.getText();

            String Email = this.EmailjTextField.getText();
            String Message = this.MessagejTextField.getText();
            String Age = this.AgejTextField.getText();
            String paintentType = this.PaintentTypejCombobox.getSelectedItem().toString();
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
            
            
            String displayMessage = Fname + " " + gender + " " + Email + " " + Message + " " + paintentType + " " + Age;

            JOptionPane.showMessageDialog(this, displayMessage, "Success", HEIGHT, this.profilepicture);

            Patient p1 = new Patient();
            p1.setName(Fname);
            p1.setLname(Lname);
            p1.setAge(Age);
            p1.setEmail(Email);
            p1.setMessage(Message);
            p1.setGender(gender);
            p1.setPaitientType(paintentType);
            p1.setProfilePicture(profilepicture);

            ViewJPanel newViewJPanel = new ViewJPanel(p1);
            this.BottonJPanel.add(newViewJPanel);
            CardLayout layout = (CardLayout) this.BottonJPanel.getLayout();
            layout.next(BottonJPanel);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButtonSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgejTextField;
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JTextField LnamejTextField;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JLabel jSelectImage;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}