/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import utility.DatabaseConnector;

/**
 *
 * @author yashpatel
 */
public class ViewJPanel extends javax.swing.JPanel {

    ImageIcon profilepicture;

    ArrayList<Patient> patients;
    Patient selectedPatient;
    /**
     * Creates new form FormJPanel
     */
    Patient p1;

    public ViewJPanel() {

        initComponents();
        populateTable();
        DisableAll();


    }

    public ViewJPanel(Patient p1) {
        this.p1 = p1;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LnameLabel = new javax.swing.JLabel();
        LnameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JToggleButton();
        SubmitButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

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
        jLabelName.setText("Name:");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Patient_Type", "Age", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        LnameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        LnameLabel.setText("Last Name");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Age");

        DeleteButton.setText("DELETE ROW");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setText("EDIT BUTTON");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSubmit)
                            .addComponent(jLabelTitle)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSelectImage)
                                    .addComponent(jLabel1))
                                .addGap(132, 132, 132)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonOthers)
                                    .addComponent(jImageButton1)
                                    .addComponent(jRadioButtonFemale)
                                    .addComponent(jRadioButtonMale)
                                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PaitentTypeJ)
                                .addGap(123, 123, 123)
                                .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnameLabel)
                                    .addComponent(jLabel2))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(DeleteButton)
                .addGap(45, 45, 45)
                .addComponent(EditButton)
                .addGap(35, 35, 35)
                .addComponent(SubmitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteButton)
                            .addComponent(EditButton)
                            .addComponent(SubmitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTitle)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LnameLabel)
                            .addComponent(LnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaintentTypejCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaitentTypeJ))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonOthers)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jImageButton1)
                            .addComponent(jSelectImage))
                        .addGap(18, 18, 18)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addComponent(jButtonSubmit)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            String Lname = this.LnameTextField.getText();
            String Age = this.AgeTextField.getText();
            String paintentType = this.PaintentTypejCombobox.getSelectedItem().toString();

            if (Fname.length() == 0) {
                throw new IllegalArgumentException("First Name is Not Filled");
            }
            if (Lname.length() == 0) {
                throw new IllegalArgumentException("Last Name is Not Filled");
            }
            if (this.PaintentTypejCombobox.getSelectedIndex() == -1) {
                throw new IllegalArgumentException("Please select a valid Patient Type.");
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

            String displayMessage = Fname + " " + Lname + gender + " " + paintentType + " " + Age;

            JOptionPane.showMessageDialog(this, displayMessage, "Success", JOptionPane.INFORMATION_MESSAGE, this.profilepicture);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.jTable1.getSelectedRow();
        try {
            this.selectedPatient = this.patients.get(selectedRowIndex);

            DatabaseConnector.deletePatient(selectedPatient);
            System.out.println("Record Deleted Successfully");
            populateTable();
        } catch (Exception E) {
            System.out.println("Unable To delete Patient" + E);

        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        
        enableAll();
        int selectedRowIndex = this.jTable1.getSelectedRow();
        this.selectedPatient = this.patients.get(selectedRowIndex);
        populateData();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
            // TODO add your handling code here:
            Patient updatePatient = new Patient();
            updatePatient.setName(this.jTextFieldName.getText());
            updatePatient.setLname(this.LnameTextField.getText());
            updatePatient.setAge(Integer.parseInt(this.AgeTextField.getText()));
            updatePatient.setGender(this.buttonGroupGender.getSelection().getActionCommand());
            updatePatient.setPaitientType(this.PaintentTypejCombobox.getSelectedItem().toString());
            try {
                DatabaseConnector.updatePatient(selectedPatient, updatePatient);
                System.out.println("Patient Detail Updated");
            }catch(Exception e) {
                System.out.println("Exception Occured" + e);
            }
            
    }//GEN-LAST:event_SubmitButtonActionPerformed

    public void populateTable() {
        this.patients = DatabaseConnector.getPatient();

        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
        for (Patient p1 : patients) {
            Object[] rows = new Object[6];
            rows[0] = p1.getId();
            rows[1] = p1.getName();
            rows[2] = p1.getGender();
            rows[3] = p1.getPaitientType();
            rows[4] = p1.getAge();
            rows[5] = p1.getLname();
            model.addRow(rows);

        }

    }

    public void enableAll() {
        this.jTextFieldName.setEnabled(true);
        this.LnameTextField.setEnabled(true);
        this.AgeTextField.setEnabled(true);
        this.jRadioButtonMale.setEnabled(true);
        this.jRadioButtonFemale.setEnabled(true);
        this.jRadioButtonOthers.setEnabled(true);
        this.PaintentTypejCombobox.setEnabled(true);
        this.SubmitButton.setVisible(true);
    }
    
    public void DisableAll() {
        this.jTextFieldName.setEnabled(false);
        this.LnameTextField.setEnabled(false);
        this.AgeTextField.setEnabled(false);
        this.jRadioButtonMale.setEnabled(false);
        this.jRadioButtonFemale.setEnabled(false);
        this.jRadioButtonOthers.setEnabled(false);
        this.PaintentTypejCombobox.setEnabled(false);
        this.SubmitButton.setVisible(false);
        
    }
    public void populateData() {
        this.jTextFieldName.setText(selectedPatient.getName());
        this.LnameTextField.setText(selectedPatient.getLname());
        this.AgeTextField.setText(String.valueOf(selectedPatient.getAge()));
        this.PaintentTypejCombobox.setSelectedItem(selectedPatient.getPaitientType());
        
        String gender = selectedPatient.getGender();
        if (gender.equals("MALE")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonMale.getModel(), true);
        } else if (gender.equals("FEMALE")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonFemale.getModel(), true);
        } else if (gender.equals("OTHERS")) {
            this.buttonGroupGender.setSelected(this.jRadioButtonOthers.getModel(), true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JToggleButton EditButton;
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JTextField LnameTextField;
    private javax.swing.JComboBox<String> PaintentTypejCombobox;
    private javax.swing.JLabel PaitentTypeJ;
    private javax.swing.JButton SubmitButton;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jImageButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSelectImage;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
