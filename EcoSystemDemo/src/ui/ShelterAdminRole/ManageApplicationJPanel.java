/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ShelterAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Profile.ProfileDirectory;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibin
 */
public class ManageApplicationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private ShelterDirectory shelterDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;

    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageApplicationJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, ShelterDirectory shelterDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.shelterDirectory = ecosystem.getShelterDirectory();
        this.profileDirectory = ecosystem.getProfileDirectory();
        this.orderDirectory = ecosystem.getOrderDirectory();
        populateTable();
        populateShelterCombo();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);

        for (Order order : ecosystem.getOrderDirectory().getOrderDirectory()) {
            if (account.getEmployee().getName().equals(order.getShelter().getShelterName())) {
                Object[] row = new Object[5];
                row[0] = order;
                row[1] = order.getMessage();
                row[2] = order.getCoordinator().getName();
                row[3] = order.getTotalQty();
                row[4] = order.getOrderStatus();

                dtm.addRow(row);
            }
        }
    }

    private void populateShelterCombo() {
        boxdel.removeAllItems();
        boxdel.addItem("  ");
        for (DeliveryMan del : ecosystem.getDeliveryManDirectory().getDeliveryManDirectory()) {
            //System.out.println("res" + res);
            boxdel.addItem(del.getName());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnCompleted = new javax.swing.JButton();
        btnAccepted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        boxdel = new javax.swing.JComboBox<>();
        assigndelman = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deny = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 33, 89));

        tblOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Message", "Reciever", "Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        btnCompleted.setBackground(new java.awt.Color(122, 72, 221));
        btnCompleted.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(255, 255, 255));
        btnCompleted.setText("Complete");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnAccepted.setBackground(new java.awt.Color(122, 72, 221));
        btnAccepted.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAccepted.setForeground(new java.awt.Color(255, 255, 255));
        btnAccepted.setText("Accept");
        btnAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Application");

        btnBack.setBackground(new java.awt.Color(122, 72, 221));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        boxdel.setBackground(new java.awt.Color(122, 72, 221));
        boxdel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxdel.setForeground(new java.awt.Color(255, 255, 255));
        boxdel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdelActionPerformed(evt);
            }
        });

        assigndelman.setBackground(new java.awt.Color(122, 72, 221));
        assigndelman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assigndelman.setForeground(new java.awt.Color(255, 255, 255));
        assigndelman.setText("Assign Delivery Man");
        assigndelman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigndelmanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Assign Delivery Man");

        deny.setBackground(new java.awt.Color(122, 72, 221));
        deny.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deny.setForeground(new java.awt.Color(255, 255, 255));
        deny.setText("Cancel");
        deny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(122, 72, 221));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1)
                        .addGap(176, 176, 176)
                        .addComponent(refresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(boxdel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(assigndelman))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccepted)
                            .addComponent(deny)
                            .addComponent(btnCompleted))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccepted)
                        .addGap(30, 30, 30)
                        .addComponent(deny)
                        .addGap(27, 27, 27)
                        .addComponent(btnCompleted)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxdel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assigndelman))
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        if (order.getOrderStatus().equals("Order Accepted")) {
            order.setOrderStatus("Order Ready for Pick up");
            order.setAssign(true);
        } else if (order.getOrderStatus().equals("Order Placed")) {
            JOptionPane.showMessageDialog(null, "Order is should be accepted first");
            return;
        } else if (order.getOrderStatus().equals("Order Cancled")) {
            JOptionPane.showMessageDialog(null, "Order is cancled");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Order is already ready for pick up");
            return;
        }

        populateTable();
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptedActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        if (order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        } else if (order.getOrderStatus().equals("Order Cancled")) {
            JOptionPane.showMessageDialog(null, "Order is cancled");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }

        populateTable();

    }//GEN-LAST:event_btnAcceptedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxdelActionPerformed

    private void assigndelmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigndelmanActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrder.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        String delmanname = boxdel.getSelectedItem().toString();
        if (order.getOrderStatus().equals("Order Ready for Pick up")) {
            order.setDeliveryMan(delmanname);
            order.setOrderStatus("Order Assigned");
            JOptionPane.showMessageDialog(null, "Order assigned");
        } else if (order.getOrderStatus().equals("Order Assigned")) {
            JOptionPane.showMessageDialog(null, "Order Already Assigned");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Please Accept Order First!");
            return;
        }
        populateTable();
    }//GEN-LAST:event_assigndelmanActionPerformed

    private void denyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Are You Sure To Cancel? Order Cannot Be Restore After Cancelation.", "Warning", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
                order.setOrderStatus("Order Cancled");
                order.setAssign(true);

                populateTable();

                JOptionPane.showMessageDialog(null, "Order Cancled");
            } else {
                return;
            }

        }

    }//GEN-LAST:event_denyActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assigndelman;
    private javax.swing.JComboBox<String> boxdel;
    private javax.swing.JButton btnAccepted;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton deny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables

}