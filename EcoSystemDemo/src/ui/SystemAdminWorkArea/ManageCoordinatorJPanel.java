/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.Coordinator.Coordinator;
import Business.Coordinator.CoordinatorDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibin
 */
public class ManageCoordinatorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem ecosystem;
    private CoordinatorDirectory coordinatorDirectory;
    private UserAccountDirectory userAccountDirectory;

    /**
     * Creates new form ManageCoordinator
     */
    public ManageCoordinatorJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CoordinatorDirectory coordinatorDirectory, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.coordinatorDirectory = ecosystem.getCoordinatorDirectory();
        this.userAccountDirectory = userAccountDirectory;
        populateTable();

    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) viewtbl.getModel();
        dtm.setRowCount(0);
        for (Coordinator coordinator : ecosystem.getCoordinatorDirectory().getCoordinatorDirectory()) {
            Object[] row = new Object[7];
            row[0] = coordinator;
            row[1] = coordinator.getShelter();
            row[2] = ecosystem.getUserAccountDirectory().getUserAccountList().get(1);
            row[3] = coordinator.getName();
            row[4] = coordinator.getEmail();
            row[5] = coordinator.getHomeAddress();
            row[6] = coordinator.getPhoneNumber();

            dtm.addRow(row);
        }
    }

    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) viewtbl.getModel();
        dtm.setRowCount(0);
        for (Coordinator coordinator : ecosystem.getCoordinatorDirectory().getCoordinatorDirectory()) {
            Object[] row = new Object[6];
            row[0] = coordinator;
            row[1] = ecosystem.getUserAccountDirectory().getUserAccountList().get(1);
            row[2] = coordinator.getName();
            row[3] = coordinator.getEmail();
            row[4] = coordinator.getHomeAddress();
            row[5] = coordinator.getPhoneNumber();

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewtbl = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Coordinator");

        viewtbl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        viewtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Shelter Name", "Account", "Coordinator Name", "Email Address", "Address", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewtbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(viewtbl);
        if (viewtbl.getColumnModel().getColumnCount() > 0) {
            viewtbl.getColumnModel().getColumn(0).setMinWidth(0);
            viewtbl.getColumnModel().getColumn(0).setPreferredWidth(0);
            viewtbl.getColumnModel().getColumn(0).setMaxWidth(0);
            viewtbl.getColumnModel().getColumn(2).setMinWidth(0);
            viewtbl.getColumnModel().getColumn(2).setPreferredWidth(0);
            viewtbl.getColumnModel().getColumn(2).setMaxWidth(0);
            viewtbl.getColumnModel().getColumn(3).setPreferredWidth(30);
            viewtbl.getColumnModel().getColumn(4).setPreferredWidth(30);
            viewtbl.getColumnModel().getColumn(5).setPreferredWidth(40);
            viewtbl.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        btnModify.setBackground(new java.awt.Color(122, 72, 221));
        btnModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Modify Coordinator");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(122, 72, 221));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Coordinator");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(122, 72, 221));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Coordinator");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(122, 72, 221));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnModify)
                        .addGap(37, 37, 37)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Coordinator coordinator = (Coordinator) viewtbl.getValueAt(selectedRow, 0);
        ModifyCoordinatorJPanel modifyCoordinator = new ModifyCoordinatorJPanel(userProcessContainer, ecosystem, coordinatorDirectory, coordinator);
        userProcessContainer.add("ModifyCoordinatorsJPanel", modifyCoordinator);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCoordinatorJPanel createCoordinator = new CreateCoordinatorJPanel(userProcessContainer, ecosystem, coordinatorDirectory);
        userProcessContainer.add("CreateCoordinatorsJPanel", createCoordinator);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewtbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Coordinator coordinator = (Coordinator) viewtbl.getValueAt(selectedRow, 0);
        coordinatorDirectory.removeCoordinator(coordinator);
        UserAccount useraccount = (UserAccount) viewtbl.getValueAt(selectedRow, 1);
        userAccountDirectory.removeAccount(useraccount);
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewtbl;
    // End of variables declaration//GEN-END:variables
}
