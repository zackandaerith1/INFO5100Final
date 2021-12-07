/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CoordinatorRole;

import Business.Coordinator.Coordinator;
import Business.Coordinator.CoordinatorDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
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
    private MenuDirectory menuDirectory;

    ArrayList<Person> personList = new ActivatableArrayList<>();

    public CoordinatorAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem,
            CoordinatorDirectory coordinatorDirectory, ShelterDirectory shelterDirectory,
            DeliveryManDirectory deliveryManDirectory, ProfileDirectory profileDirectory, OrderDirectory orderDirectory, MenuDirectory menuDirectory) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.coordinatorDirectory = ecosystem.getCoordinatorDirectory();
        this.shelterDirectory = ecosystem.getShelterDirectory();
        this.profileDirectory = ecosystem.getProfileDirectory();
        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        this.orderDirectory = ecosystem.getOrderDirectory();
        this.menuDirectory = ecosystem.getMenuDirectory();

        valueLabel.setText(account.getUsername());
        populateApplicationTable();
        populateShelterCombo();

    }

    public void populatePersonTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPerson.getModel();
        dtm.setRowCount(0);
        String shelterName = dropboxShelter.getSelectedItem().toString();
        Shelter shelter = ecosystem.getShelterDirectory().getShelter(shelterName);
        for (Profile profile : ecosystem.getProfileDirectory().getProfileDirectory()) {
            if (shelter.getShelterName().equals(profile.getShelterName())) {
                Object[] row = new Object[9];
                row[0] = profile;
                row[1] = profile.getId();
                row[2] = profile.getFirstname();
                row[3] = profile.getLastname();
                row[4] = profile.getGender();
                row[5] = profile.getBirth();
                row[6] = profile.getPhone();
                row[7] = profile.getAddress();
                row[8] = profile.getEmail();
                dtm.addRow(row);
            }
        }
    }

    public void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblItem.getModel();
        dtm.setRowCount(0);
        String shelterName = dropboxShelter.getSelectedItem().toString();
        Shelter shelter = ecosystem.getShelterDirectory().getShelter(shelterName);
        for (Menu menu : menuDirectory.getMenuDirectory()) {
            if (menu.getShelterName().equals(shelterName)) {
                Object[] row = new Object[5];
                row[0] = menu;
                row[1] = menu.getId();
                row[2] = menu.getItemName();
                row[3] = menu.getUnit();
                row[4] = menu.getQty();
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

    void populateApplicationTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblApplication.getModel();
        dtm.setRowCount(0);
        for (Person person : personList) {
            Object[] row = new Object[9];
            row[0] = person;
            row[1] = person.getId();
            row[2] = person.getFirstname();
            row[3] = person.getLastname();
            row[4] = person.getGender();
            row[5] = person.getBirth();
            row[6] = person.getPhone();
            row[7] = person.getAddress();
            row[8] = person.getEmail();

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
        tblPerson = new javax.swing.JTable();
        dropboxShelter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        btnMenuShow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblApplication = new javax.swing.JTable();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalAgeJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        orderHistoryJButton = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(54, 33, 89));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Coordinator:");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblPerson.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "First Name", "Last Name", "Gender", "Birth Day", "Phone", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPerson);
        if (tblPerson.getColumnModel().getColumnCount() > 0) {
            tblPerson.getColumnModel().getColumn(0).setMinWidth(0);
            tblPerson.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPerson.getColumnModel().getColumn(0).setMaxWidth(0);
            tblPerson.getColumnModel().getColumn(7).setResizable(false);
            tblPerson.getColumnModel().getColumn(8).setResizable(false);
        }

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
        btnMenuShow.setText("Show Person List & Item List");
        btnMenuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuShowActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblApplication.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblApplication.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblApplication);

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
        jLabel4.setText("Application List");

        orderHistoryJButton.setBackground(new java.awt.Color(122, 72, 221));
        orderHistoryJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderHistoryJButton.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryJButton.setText("View Order History");
        orderHistoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryJButtonActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(122, 72, 221));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search Person");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblItem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
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
                "", "ID", "Item Name", "Unit", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setMinWidth(0);
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItem.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Person List");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item List");

        add1.setBackground(new java.awt.Color(122, 72, 221));
        add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("Add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
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
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(confirm))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderHistoryJButton))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuShow))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(add)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropboxShelter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuShow))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add1)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orderHistoryJButton)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(jLabel3)
                    .addComponent(totalAgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, add1, btnMenuShow, btnSearch, confirm, dropboxShelter, jLabel1, jLabel3, orderHistoryJButton, totalAgeJTextField, txtQuantity, txtSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void dropboxShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxShelterActionPerformed

    }//GEN-LAST:event_dropboxShelterActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        Random random = new Random();
        int randNumber = random.nextInt(200000 - 100000 + 1) + 100000;
        int rowcount = tblApplication.getRowCount();
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

            DefaultTableModel cartModel = (DefaultTableModel) tblApplication.getModel();
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
        populatePersonTable();
        populateItemTable();
    }//GEN-LAST:event_btnMenuShowActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        int selectedRow = tblPerson.getSelectedRow();
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
            Profile profile = (Profile) tblPerson.getValueAt(selectedRow, 0);
//            int qty = Integer.parseInt(txtQuantity.getText());
            Person person = new Person(profile.getId(), profile.getFirstname(), profile.getLastname(), profile.getGender(), profile.getAge(), profile.getPhone(), profile.getBirth(), profile.getAddress(), profile.getEmail(), profile.getComment(), profile.getImagePath());
            personList.add(person);
            populateApplicationTable();
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

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton btnMenuShow;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton confirm;
    private javax.swing.JComboBox<String> dropboxShelter;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton orderHistoryJButton;
    private javax.swing.JTable tblApplication;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField totalAgeJTextField;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
