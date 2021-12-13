/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AccountRole;

import Business.Enterprise.FundingEnterprise;
import Business.Organization.Funding.AccountOrganization;
import Business.Profile.Donator;
import Business.Profile.DonatorDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodbankToFundingWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author zhengfang
 */
public class AccountWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AccountOrganization organization;
    private FundingEnterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form AccountWorkAreaJPanel
     */
    public AccountWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AccountOrganization organization, FundingEnterprise enterprise) {

        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        valueLabel1.setText(String.valueOf(organization.getDlist().Totalamount()));
        populateDonatorTable();
        populateRequestTable();
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
        workRequestJTable = new javax.swing.JTable();
        ApproverequestJButton = new javax.swing.JButton();
        refreshDonatorJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btndenyrequest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshTestJButton1 = new javax.swing.JButton();
        btnaddDonator = new javax.swing.JButton();
        btnupdateDonator = new javax.swing.JButton();
        btnDeleteDonator = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 230, 225));

        workRequestJTable.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(43, 71, 92));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Amount", "Sender", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        ApproverequestJButton.setBackground(new java.awt.Color(94, 138, 117));
        ApproverequestJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ApproverequestJButton.setForeground(new java.awt.Color(43, 71, 92));
        ApproverequestJButton.setText("Accept request");
        ApproverequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproverequestJButtonActionPerformed(evt);
            }
        });

        refreshDonatorJButton.setBackground(new java.awt.Color(94, 138, 117));
        refreshDonatorJButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        refreshDonatorJButton.setForeground(new java.awt.Color(43, 71, 92));
        refreshDonatorJButton.setText("Refresh");
        refreshDonatorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDonatorJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(43, 71, 92));
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(43, 71, 92));
        valueLabel.setText("<value>");

        btndenyrequest.setBackground(new java.awt.Color(94, 138, 117));
        btndenyrequest.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btndenyrequest.setForeground(new java.awt.Color(43, 71, 92));
        btndenyrequest.setText("Process Request");
        btndenyrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenyrequestActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(43, 71, 92));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Phone", "Date", "Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        refreshTestJButton1.setBackground(new java.awt.Color(94, 138, 117));
        refreshTestJButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        refreshTestJButton1.setForeground(new java.awt.Color(43, 71, 92));
        refreshTestJButton1.setText("Refresh");
        refreshTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButton1ActionPerformed(evt);
            }
        });

        btnaddDonator.setBackground(new java.awt.Color(94, 138, 117));
        btnaddDonator.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnaddDonator.setForeground(new java.awt.Color(43, 71, 92));
        btnaddDonator.setText("Add Donator");
        btnaddDonator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddDonatorActionPerformed(evt);
            }
        });

        btnupdateDonator.setBackground(new java.awt.Color(94, 138, 117));
        btnupdateDonator.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnupdateDonator.setForeground(new java.awt.Color(43, 71, 92));
        btnupdateDonator.setText("Update Donator");
        btnupdateDonator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateDonatorActionPerformed(evt);
            }
        });

        btnDeleteDonator.setBackground(new java.awt.Color(94, 138, 117));
        btnDeleteDonator.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        btnDeleteDonator.setForeground(new java.awt.Color(43, 71, 92));
        btnDeleteDonator.setText("Delete Donator");
        btnDeleteDonator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDonatorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 71, 92));
        jLabel1.setText("Fitst Name:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 71, 92));
        jLabel2.setText("Telephone: ");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 71, 92));
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 71, 92));
        jLabel4.setText("Amount:");

        valueLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(43, 71, 92));
        valueLabel1.setText("<value>");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 71, 92));
        jLabel5.setText("Total $:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(refreshDonatorJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnaddDonator)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(btnupdateDonator))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtlname)
                                            .addComponent(txtfname)
                                            .addComponent(txtphone)
                                            .addComponent(txtamount, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(52, 52, 52)
                                .addComponent(btnDeleteDonator)))
                        .addGap(18, 18, 18)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ApproverequestJButton)
                                .addGap(62, 62, 62)
                                .addComponent(btndenyrequest))
                            .addComponent(refreshTestJButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshDonatorJButton)
                            .addComponent(refreshTestJButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApproverequestJButton)
                    .addComponent(btndenyrequest))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddDonator)
                    .addComponent(btnupdateDonator)
                    .addComponent(btnDeleteDonator))
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApproverequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproverequestJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        FoodbankToFundingWorkRequest request = (FoodbankToFundingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateRequestTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
//        layout.next(userProcessContainer);

    }//GEN-LAST:event_ApproverequestJButtonActionPerformed

    private void refreshDonatorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDonatorJButtonActionPerformed
        populateDonatorTable();

    }//GEN-LAST:event_refreshDonatorJButtonActionPerformed

    private void refreshTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButton1ActionPerformed
        // TODO add your handling code here:

        populateRequestTable();

        int total = 0;

        for (Donator order : organization.getDlist().getDonatorlist()) {

            total = +order.getAmount();
        }
        for (FoodbankToFundingWorkRequest request : organization.getWorkQueue().getFoodbankToFundingworkrequestlist()) {
            if (request.getStatus().equals("Completed")) {
                total = -request.getAmount();
            }
        }

        valueLabel1.setText(String.valueOf(total));

    }//GEN-LAST:event_refreshTestJButton1ActionPerformed

    private void btnaddDonatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddDonatorActionPerformed
        // TODO add your handling code here:
        if (txtamount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Amount Fields cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int amount = Integer.parseInt(txtamount.getText());
        Donator d = new Donator(amount);
        d.setFname(txtfname.getText());
        d.setLname(txtlname.getText());
        d.setPhone(Integer.parseInt(txtphone.getText()));
        d.setDate(new Date());

        DonatorDirectory dlist = organization.getDlist();
        dlist.getDonatorlist().add(d);

        txtfname.setText("");
        txtlname.setText("");
        txtphone.setText("");
        txtamount.setText("");

        populateDonatorTable();
    }//GEN-LAST:event_btnaddDonatorActionPerformed

    private void btnupdateDonatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateDonatorActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Donator d = (Donator) jTable1.getValueAt(selectedRow, 0);
            d.setFname(txtfname.getName());
            d.setLname(txtlname.getName());
            d.setDate(new Date());
            d.setAmount(Integer.parseInt(txtamount.getText()));
            d.setPhone(Integer.parseInt(txtphone.getText()));

            txtfname.setText("");
            txtlname.setText("");
            txtphone.setText("");
            txtamount.setText("");

            populateDonatorTable();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnupdateDonatorActionPerformed

    private void btnDeleteDonatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDonatorActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Donator d = (Donator) jTable1.getValueAt(selectedRow, 0);
            organization.getDlist().getDonatorlist().remove(d);

            populateDonatorTable();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteDonatorActionPerformed

    private void btndenyrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndenyrequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        FoodbankToFundingWorkRequest request = (FoodbankToFundingWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btndenyrequestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproverequestJButton;
    private javax.swing.JButton btnDeleteDonator;
    private javax.swing.JButton btnaddDonator;
    private javax.swing.JButton btndenyrequest;
    private javax.swing.JButton btnupdateDonator;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshDonatorJButton;
    private javax.swing.JButton refreshTestJButton1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (FoodbankToFundingWorkRequest request : organization.getWorkQueue().getFoodbankToFundingworkrequestlist()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getStatus();
            row[3] = request.getMessage();

            model.addRow(row);
        }
    }

    private void populateDonatorTable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        jTable1.setDefaultRenderer(Object.class, new TableCellRenderer() {
            private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
            public final Color VERY_LIGHT_RED = new Color(255, 99, 71);
            public final Color LIGHT_BLUE = new Color(135, 206, 250);

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (isSelected) {
                    c.setBackground(LIGHT_BLUE);
                } else {
                    if (row % 2 == 0) {
                        c.setBackground(Color.WHITE);

                    } else {
                        c.setBackground(Color.LIGHT_GRAY);
                    }
                }

                //Add below code here
                if (table.getColumnModel().getColumn(column).getIdentifier().equals("Application Status")) {//Here `Status` is column name
                    if (value.toString().equals("Application Rejected")) {//Here `OK` is the value of row

                        c.setBackground(VERY_LIGHT_RED);
                    }
                }
                return c;
            }

        });

        for (Donator order : organization.getDlist().getDonatorlist()) {

            Object[] row = new Object[5];
            row[0] = order;
            row[1] = order.getLname();
            row[2] = order.getPhone();
            row[3] = order.getDate().toString();
            row[4] = order.getAmount();

            dtm.addRow(row);

        }
        valueLabel1.setText(String.valueOf(organization.getDlist().Totalamount()));
    }
}
