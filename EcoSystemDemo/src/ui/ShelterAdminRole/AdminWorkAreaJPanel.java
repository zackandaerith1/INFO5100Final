package ui.ShelterAdminRole;

import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.OrderDirectory;
import Business.Profile.ProfileDirectory;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yibin
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private CoordinatorDirectory customerDirectory;
    private ShelterDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem,
            CoordinatorDirectory customerDirectory, ShelterDirectory restaurantDirectory,
            DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCoordinatorDirectory();
        this.restaurantDirectory = ecosystem.getShelterDirectory();
        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        this.profileDirectory = ecosystem.getProfileDirectory();
        this.orderDirectory = ecosystem.getOrderDirectory();
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
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant Admin Work Area");

        manageEmployeeJButton.setBackground(new java.awt.Color(122, 72, 221));
        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setBackground(new java.awt.Color(122, 72, 221));
        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Restaurant :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmployeeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(154, Short.MAX_VALUE))
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
                .addComponent(manageOrganizationJButton)
                .addGap(25, 25, 25)
                .addComponent(manageEmployeeJButton)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageProfileJPanel manageprofile = new ManageProfileJPanel(userProcessContainer, account, ecosystem, restaurantDirectory, profileDirectory);
        userProcessContainer.add(manageprofile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrderJPanel manageorder = new ManageOrderJPanel(userProcessContainer, account, ecosystem, restaurantDirectory, profileDirectory, orderDirectory);
        userProcessContainer.add(manageorder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
