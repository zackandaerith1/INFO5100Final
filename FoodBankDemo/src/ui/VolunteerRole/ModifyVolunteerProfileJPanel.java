/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import Business.Enterprise.ShelterEnteriprise;
import Business.Enterprise.VolunteerEnterprise;
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
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import ui.ShelterArrangerRole.*;

/**
 *
 * @author yibin
 */
public class ModifyVolunteerProfileJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
//    private EcoSystem ecosystem;
    private VolunteerEnterprise enterprise;
    private ShelterDirectory shelterDirectory;
    private VolunteerDirectory profileDirectory;
    private Shelter shelter;
    private Volunteer profile;

    public ModifyVolunteerProfileJPanel(JPanel userProcessContainer, UserAccount account, VolunteerEnterprise enterprise, VolunteerDirectory profiledirectory, Volunteer profile) throws ParseException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.profileDirectory = enterprise.getVolunteerdirectory();
        this.profile = profile;
        txtID.setText(profile.getId());
        txtFirstName.setText(profile.getFirstname());
        txtLastName.setText(profile.getLastname());
        txtGender.setText(profile.getGender());
        txtPhone.setText(profile.getPhone());
        String birthdate = profile.getBirth();
        Date date = new SimpleDateFormat("MM-dd-yyyy").parse(birthdate);
        jDateChooser.setDate(date);
        txtAddress.setText(profile.getAddress());
        txtEmail.setText(profile.getEmail());
        txtComment.setText(profile.getComment());
        ImageIcon ii = new ImageIcon(profile.getImagePath());
        Image imagetaken = ii.getImage().getScaledInstance(320, 180, Image.SCALE_SMOOTH);
        photoComponent.setIcon(new ImageIcon(imagetaken));
        txtID.setEnabled(false);
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtGender.setEnabled(false);
        jDateChooser.setEnabled(false);

    }

    private ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(241, 283, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        photoComponent = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("First Name:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(94, 138, 117));
        btnUpdate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(43, 71, 92));
        btnUpdate.setText("Update Record");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
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

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(43, 71, 92));
        jLabel12.setText("Upload Picture:");

        btnChoose.setBackground(new java.awt.Color(94, 138, 117));
        btnChoose.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnChoose.setForeground(new java.awt.Color(43, 71, 92));
        btnChoose.setText("Update Picture");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        photoComponent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        photoComponent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFilePath.setBackground(new java.awt.Color(54, 33, 89));
        txtFilePath.setForeground(new java.awt.Color(54, 33, 89));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Person Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(btnChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(photoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(248, 248, 248)
                    .addComponent(jLabel1)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel3, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(btnChoose))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel1)
                    .addContainerGap(846, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Not null check
        if (txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtGender.getText().isEmpty()
                || txtPhone.getText().isEmpty() || jDateChooser.getDate() == null || txtAddress.getText().isEmpty()
                || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty(except Comment)", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Data format check needed
        int reply = JOptionPane.showConfirmDialog(null, "Are You Sure To Update Info?", "Warning", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            String phone = txtPhone.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String comment = txtComment.getText();
            String imagePath = txtFilePath.getText();
            profile.setPhone(phone);
            profile.setAddress(address);
            profile.setEmail(email);
            profile.setComment(comment);
            profile.setImagePath(imagePath);

            JOptionPane.showMessageDialog(null, "Information Updated!");
        } else {
            return;
        }

        txtFirstName.setText("");
        txtLastName.setText("");
        txtGender.setText("");
        txtPhone.setText("");
        jDateChooser.setCalendar(null);
        txtAddress.setText("");
        txtEmail.setText("");
        txtComment.setText("");
        userProcessContainer.remove(this);

        //Auto back page
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProfileJPanel managecust = (ManageProfileJPanel) component;
        managecust.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProfileJPanel managecust = (ManageProfileJPanel) component;
        managecust.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

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
                    Logger.getLogger(ManageProfileJPanel.class.getName()).log(Level.SEVERE, null, ex);
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

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel photoComponent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtFilePath;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
