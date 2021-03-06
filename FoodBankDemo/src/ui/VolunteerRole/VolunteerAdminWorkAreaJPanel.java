package ui.VolunteerRole;

import Business.EcoSystem;
import Business.Enterprise.VolunteerEnterprise;
import Business.Organization.Volunteer.VolunteerOrganization;
import Business.Profile.VolunteerDirectory;
import Business.UserAccount.UserAccount;
import ui.ShelterArrangerRole.ManageApplicationJPanel;
import ui.ShelterArrangerRole.ManageProfileJPanel;
import ui.ShelterArrangerRole.ManageResourceJPanel;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yibin
 */
public class VolunteerAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private VolunteerEnterprise enterprise;
    private VolunteerDirectory profileDirectory;


    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public VolunteerAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, VolunteerOrganization organization, VolunteerEnterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = business;
        this.enterprise = enterprise;
        this.profileDirectory = enterprise.getVolunteerdirectory();
        valueLabel.setText(account.getUsername());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */







    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePersonBtn = new javax.swing.JButton();
        manageApplicationBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageAssignemntBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volunteer Arrangerment Work Area");

        managePersonBtn.setBackground(new java.awt.Color(122, 72, 221));
        managePersonBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        managePersonBtn.setForeground(new java.awt.Color(255, 255, 255));
        managePersonBtn.setText("Manage Volunteer");
        managePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonBtnActionPerformed(evt);
            }
        });

        manageApplicationBtn.setBackground(new java.awt.Color(122, 72, 221));
        manageApplicationBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageApplicationBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageApplicationBtn.setText("Manage Application");
        manageApplicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageApplicationBtnActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Volunteer Center :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));

        manageAssignemntBtn.setBackground(new java.awt.Color(122, 72, 221));
        manageAssignemntBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageAssignemntBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageAssignemntBtn.setText("Manage Assignment");
        manageAssignemntBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAssignemntBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(enterpriseLabel)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageApplicationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(managePersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageAssignemntBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(manageApplicationBtn)
                .addGap(25, 25, 25)
                .addComponent(managePersonBtn)
                .addGap(18, 18, 18)
                .addComponent(manageAssignemntBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonBtnActionPerformed

        ManageVolunteerProfileJPanel manageprofile = new ManageVolunteerProfileJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add(manageprofile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonBtnActionPerformed

    private void manageApplicationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageApplicationBtnActionPerformed

        ManageAssignmentJPanel manageorder = new ManageAssignmentJPanel(userProcessContainer, account, enterprise,ecosystem);
        userProcessContainer.add(manageorder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageApplicationBtnActionPerformed

    private void manageAssignemntBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAssignemntBtnActionPerformed
//        ManageResourceJPanel manageresource = new ManageResourceJPanel(userProcessContainer, account, enterprise);
//        userProcessContainer.add(manageresource);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAssignemntBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageApplicationBtn;
    private javax.swing.JButton manageAssignemntBtn;
    private javax.swing.JButton managePersonBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
