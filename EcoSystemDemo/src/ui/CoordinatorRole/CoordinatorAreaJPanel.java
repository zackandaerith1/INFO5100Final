/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CoordinatorRole;

import Business.Coordinator.Coordinator;
import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Profile.Person;
import Business.Profile.Profile;
import Business.Profile.ProfileDirectory;
import Business.Shelter.Shelter;
import Business.Shelter.ShelterDirectory;
import Business.UserAccount.UserAccount;
import com.db4o.collections.ActivatableArrayList;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibin
 */
public class CoordinatorAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    private CoordinatorDirectory coordinatorDirectory;
    private ShelterDirectory shelterDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private ProfileDirectory profileDirectory;
    private OrderDirectory orderDirectory;
    private static int count = 1;

    ArrayList<Person> personList = new ActivatableArrayList<>();

    public CoordinatorAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem,
            CoordinatorDirectory coordinatorDirectory, ShelterDirectory shelterDirectory,
            DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.coordinatorDirectory = ecosystem.getCoordinatorDirectory();
        this.shelterDirectory = ecosystem.getShelterDirectory();
        this.profileDirectory = ecosystem.getProfileDirectory();
        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        this.orderDirectory = ecosystem.getOrderDirectory();
        valueLabel.setText(account.getUsername());
        populateCartTable();
        populateShelterCombo();

    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) itemtable.getModel();
        dtm.setRowCount(0);
        String shelterName = dropboxShelter.getSelectedItem().toString();
        Shelter shelter = ecosystem.getShelterDirectory().getShelter(shelterName);
        for (Profile profile : ecosystem.getProfileDirectory().getProfileDirectory()) {
            if (shelter.getShelterName().equals(profile.getShelterName())) {
                Object[] row = new Object[2];
                row[0] = profile;
                row[1] = profile.getAge();
                dtm.addRow(row);
            }
        }
    }

    public void populateShelterCombo() {
        dropboxShelter.removeAllItems();
        dropboxShelter.addItem("  ");
        for (Shelter res : ecosystem.getShelterDirectory().getShelterDirectory()) {
            dropboxShelter.addItem(res.getShelterName());
        }
    }

    void populateCartTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderTbl.getModel();
        dtm.setRowCount(0);
        for (Person person : personList) {
            Object[] row = new Object[3];
            row[0] = person.getFirstname();
            row[1] = person.getLastname();
            row[2] = person.getPhone();

            dtm.addRow(row);
        }
    }

    private void calTotalAge() {
        double total = 0.0;
        for (Person person : personList) {
            total = person.getAge() + total;
            totalAgeJTextField.setText(String.valueOf(total));
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        dropboxShelter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        btnMenuShow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderTbl = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalAgeJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        orderHistoryJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 33, 89));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Coordinator:");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));

        itemtable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemtable);

        dropboxShelter.setBackground(new java.awt.Color(122, 72, 221));
        dropboxShelter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dropboxShelter.setForeground(new java.awt.Color(255, 255, 255));
        dropboxShelter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dropboxShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxShelterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quantity");

        confirm.setBackground(new java.awt.Color(122, 72, 221));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Check Out");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        btnMenuShow.setBackground(new java.awt.Color(122, 72, 221));
        btnMenuShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMenuShow.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuShow.setText("Show Person List");
        btnMenuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuShowActionPerformed(evt);
            }
        });

        orderTbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Quantity", "TotalPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderTbl);

        add.setBackground(new java.awt.Color(122, 72, 221));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");

        totalAgeJTextField.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order List");

        orderHistoryJButton.setBackground(new java.awt.Color(122, 72, 221));
        orderHistoryJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderHistoryJButton.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryJButton.setText("View Order History");
        orderHistoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMenuShow)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderHistoryJButton))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenuShow)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderHistoryJButton)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add)
                    .addComponent(confirm)
                    .addComponent(jLabel3)
                    .addComponent(totalAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, btnMenuShow, confirm, jLabel1, jLabel3, totalAgeJTextField, txtQuantity});

    }// </editor-fold>//GEN-END:initComponents

    private void dropboxShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxShelterActionPerformed

    }//GEN-LAST:event_dropboxShelterActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        Random random = new Random();
        int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
        int rowcount = orderTbl.getRowCount();
        if (rowcount > 0) {
            String shelterName = dropboxShelter.getSelectedItem().toString();
            Shelter shelter = ecosystem.getShelterDirectory().getShelter(shelterName);
            Coordinator coordinator = ecosystem.getCoordinatorDirectory().getCoordinator(account.getEmployee().getName());
            String status = "Order Placed";

            Order order = ecosystem.getOrderDirectory().newOrder();
            order.setCoordinator(coordinator);
            order.setOrderId(String.valueOf(randNumber));
            order.setShelter(shelter);
            order.setOrderStatus(status);
            order.setAssign(false);

            double totalAge = 0.0;

            StringBuilder profileItems = new StringBuilder();
            for (Person person : personList) {
                totalAge = person.getAge() + totalAge;
                profileItems.append(" " + person.getFirstname() + ":" + ",");
            }
            order.setTotalprice(totalAge);

            JOptionPane.showMessageDialog(null, "Order Placed!");

            DefaultTableModel cartModel = (DefaultTableModel) orderTbl.getModel();
            cartModel.setRowCount(0);
            totalAgeJTextField.setText("");
            personList = new ActivatableArrayList<>();

        } else {
            JOptionPane.showMessageDialog(null, "Your list is empty", "warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_confirmActionPerformed

    private void btnMenuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuShowActionPerformed
        if (dropboxShelter.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a shelter");
            return;
        }
        populateTable();
    }//GEN-LAST:event_btnMenuShowActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        int selectedRow = itemtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter quantity");
            return;
        }

        if (!txtQuantity.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter digits only");
            return;
        }

        int quantity = Integer.parseInt(txtQuantity.getText());
        if (quantity > 0) {
            Profile profile = (Profile) itemtable.getValueAt(selectedRow, 0);
//            int qty = Integer.parseInt(txtQuantity.getText());
            Person person = new Person(profile.getId(), profile.getFirstname(), profile.getLastname(), profile.getGender(), profile.getAge(), profile.getPhone(), profile.getBirth(), profile.getAddress(), profile.getEmail(), profile.getComment(), profile.getImagePath());
            personList.add(person);
            populateCartTable();
            calTotalAge();

        }
        txtQuantity.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void orderHistoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryJButtonActionPerformed
        CoordinatorCommentJPanel ccjp = new CoordinatorCommentJPanel(userProcessContainer, account, ecosystem,
                coordinatorDirectory, shelterDirectory,
                deliveryManDirectory, profileDirectory, orderDirectory);
        userProcessContainer.add(ccjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderHistoryJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnMenuShow;
    private javax.swing.JButton confirm;
    private javax.swing.JComboBox<String> dropboxShelter;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable itemtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton orderHistoryJButton;
    private javax.swing.JTable orderTbl;
    private javax.swing.JTextField totalAgeJTextField;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
