/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import Business.Enterprise.ShelterEnteriprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Organization.Shelter.ArrangementOrganization;
import Business.Profile.Profile;
import Business.Profile.ProfileDirectory;
import Business.Profile.Volunteer;
import Business.Profile.VolunteerDirectory;
import Business.Shelter.Shelter;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import ui.ShelterArrangerRole.ModifyProfileJPanel;

/**
 *
 * @author yibin
 */
public class ManageVolunteerProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
//    private EcoSystem ecosystem;
    private VolunteerEnterprise enterprise;
    private VolunteerDirectory profileDirectory;


    public ManageVolunteerProfileJPanel(JPanel userProcessContainer, UserAccount account,  VolunteerEnterprise enterprise) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.profileDirectory = enterprise.getVolunteerdirectory();

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblProfile.getModel();
        dtm.setRowCount(0);
        for (Volunteer profile : profileDirectory.getVolunteerDirectory()) { 
                Object[] row = new Object[11];
                row[0] = profile;
                row[1] = profile.getId();
                row[2] = profile.getFirstname();
                row[3] = profile.getLastname();
                row[4] = profile.getGender();
                row[5] = profile.getAge();
                row[6] = profile.getBirth();
                row[7] = profile.getPhone();
                row[8] = profile.getAddress();
                row[9] = profile.getEmail();
                row[10] = profile.getComment();
                dtm.addRow(row);
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        photoComponent = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        btnUpload = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(233, 230, 225));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        tblProfile.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tblProfile.setForeground(new java.awt.Color(43, 71, 92));
        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "First Name", "Last Name", "Gender", "Age", "Birth Day", "Phone Number", "Home Address", "Email Address", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfile);
        if (tblProfile.getColumnModel().getColumnCount() > 0) {
            tblProfile.getColumnModel().getColumn(0).setMinWidth(0);
            tblProfile.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProfile.getColumnModel().getColumn(0).setMaxWidth(0);
        }


        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register Volunteer");


        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("First Name:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(94, 138, 117));
        btnAdd.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(43, 71, 92));
        btnAdd.setText("Add Record");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(94, 138, 117));
        btnBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(43, 71, 92));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(94, 138, 117));
        delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(43, 71, 92));
        delete.setText("Delete Record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(94, 138, 117));
        viewBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(43, 71, 92));
        viewBtn.setText("View/Update Record");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 71, 92));
        jLabel5.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 71, 92));
        jLabel6.setText("Phone Number:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(43, 71, 92));
        jLabel7.setText("Birth Day:");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(43, 71, 92));
        jLabel8.setText("Gender:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 71, 92));
        jLabel9.setText("Home Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(43, 71, 92));
        jLabel10.setText("Email Address:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(43, 71, 92));
        jLabel11.setText("Comment:");

        txtComment.setColumns(20);
        txtComment.setRows(5);
        jScrollPane2.setViewportView(txtComment);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);


        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Volunteer List");


        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 71, 92));
        jLabel12.setText("Upload Picture:");

        btnChoose.setBackground(new java.awt.Color(94, 138, 117));
        btnChoose.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnChoose.setForeground(new java.awt.Color(43, 71, 92));
        btnChoose.setText("Take Picture");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        photoComponent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        photoComponent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFilePath.setForeground(new java.awt.Color(54, 33, 89));
        txtFilePath.setToolTipText("");

        radioMale.setBackground(new java.awt.Color(94, 138, 117));
        buttonGroup1.add(radioMale);
        radioMale.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        radioMale.setForeground(new java.awt.Color(43, 71, 92));
        radioMale.setText("Male");

        radioFemale.setBackground(new java.awt.Color(94, 138, 117));
        buttonGroup1.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(43, 71, 92));
        radioFemale.setText("Female");

        radioOther.setBackground(new java.awt.Color(94, 138, 117));
        buttonGroup1.add(radioOther);
        radioOther.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        radioOther.setForeground(new java.awt.Color(43, 71, 92));
        radioOther.setText("Other");

        btnUpload.setBackground(new java.awt.Color(94, 138, 117));
        btnUpload.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(43, 71, 92));
        btnUpload.setText("Upload Picture");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(btnChoose)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpload))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(photoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioMale)
                        .addGap(18, 18, 18)
                        .addComponent(radioFemale)
                        .addGap(18, 18, 18)
                        .addComponent(radioOther)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(viewBtn)
                        .addGap(93, 93, 93)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(viewBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(radioMale)
                                    .addComponent(radioFemale)
                                    .addComponent(radioOther)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(btnChoose)
                    .addComponent(btnUpload))
                .addGap(18, 18, 18)
                .addComponent(photoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAdd))
                .addGap(48, 48, 48))
            .addComponent(jSeparator1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || buttonGroup1.getSelection() == null
                || txtPhone.getText().isEmpty() || jDateChooser.getDate() == null || txtAddress.getText().isEmpty()
                || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty(except Comment)", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Data format check needed
        String firstname = txtFirstName.getText();
        String lastname = txtLastName.getText();
        String gender = "";
        if (radioMale.isSelected() == true) {
            gender = "Male";
        } else if (radioFemale.isSelected() == true) {
            gender = "Female";
        } else if (radioOther.isSelected() == true) {
            gender = "Other";
        }

        String shelter = account.getEmployee().getName();
        String phone = txtPhone.getText();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy");
        String birth = dateformat.format(jDateChooser.getDate());
        int year = jDateChooser.getDate().getYear() + 1900;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentyear - year;
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String comment = txtComment.getText();
        String imagePath = txtFilePath.getText();

        Random random = new Random();
        int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
        String id = String.valueOf(randNumber);

        profileDirectory.newItem(id, firstname, lastname, gender, age, phone, birth, address, email, comment, imagePath);

        populateTable();

        txtFirstName.setText("");
        txtLastName.setText("");
        buttonGroup1.clearSelection();

        txtPhone.setText("");
        jDateChooser.setCalendar(null);
        txtAddress.setText("");
        txtEmail.setText("");
        txtComment.setText("");
        photoComponent.setIcon(null);
        JOptionPane.showMessageDialog(null, "Information Added!");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Volunteer profile = (Volunteer) tblProfile.getValueAt(selectedRow, 0);
        profileDirectory.removeProfile(profile);
        populateTable();
    }//GEN-LAST:event_deleteActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        try {
            int selectedRow = tblProfile.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Volunteer profile = (Volunteer) tblProfile.getValueAt(selectedRow, 0);
            ModifyVolunteerProfileJPanel modifyProfile = new ModifyVolunteerProfileJPanel(userProcessContainer, account, enterprise, profileDirectory, profile);
            userProcessContainer.add("ModifyProfileJPanel", modifyProfile);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (Exception ex) {
            Logger.getLogger(ManageVolunteerProfileJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed

        // coding for webcam and taking a picture
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);
        JButton button = new JButton("Capture");
        panel.add(button);

        JFrame window = new JFrame("Test webcam panel");
        window.add(panel);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        window.pack();
        window.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // get image
                BufferedImage image = webcam.getImage();
                String firstname = txtFirstName.getText();
                String lastname = txtLastName.getText();

                try {
                    // save image to PNG file
                    ImageIO.write(image, "PNG", new File(firstname + " " + lastname + ".png"));
                } catch (IOException ex) {
                    Logger.getLogger(ManageVolunteerProfileJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                //load image from folder
                JFileChooser chooser = new JFileChooser("C:\\Users\\yibin\\Documents\\GitHub\\INFO5100Final\\EcoSystemDemo");
                FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
                chooser.addChoosableFileFilter(fnef);
                int showOpenDialogue = chooser.showOpenDialog(null);
                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File f = chooser.getSelectedFile();
                    String filename = f.getAbsolutePath();
                    txtFilePath.setText(filename);
                    JOptionPane.showMessageDialog(null, "Image Uploaded!");

                    ImageIcon ii = new ImageIcon(filename);

                    Image imagetaken = ii.getImage().getScaledInstance(photoComponent.getWidth(), photoComponent.getHeight(), Image.SCALE_SMOOTH);
                    photoComponent.setIcon(new ImageIcon(imagetaken));
                }
                webcam.close();
            }
        });

    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed

    }//GEN-LAST:event_btnUploadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnUpload;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel photoComponent;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtFilePath;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

}
