package Files;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReturnVehicle extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ReturnVehicle() {
        con = Allconnection.Allconnection();
        initComponents();
        getCustomer();
        searchVehicle();
        searchDriver();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        customerNameCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        noFineRadio = new javax.swing.JRadioButton();
        fineCharged = new javax.swing.JTextField();
        fineRadio = new javax.swing.JRadioButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        problemLabel = new javax.swing.JLabel();
        goodRadio = new javax.swing.JRadioButton();
        badRadio = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        problemTextArea = new javax.swing.JTextArea();
        hiredVehicleCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        receivingStaff = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmddriver = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nn.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Receive Hired Vehicles"));

        customerNameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT-" }));
        customerNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameComboActionPerformed(evt);
            }
        });

        jLabel2.setText("Vehicle Hired");

        jLabel4.setText("Receiving Staff");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fine Charged"));

        noFineRadio.setText("No Fine");
        noFineRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noFineRadioMouseClicked(evt);
            }
        });

        fineCharged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fineChargedKeyReleased(evt);
            }
        });

        fineRadio.setText("Fine");
        fineRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fineRadioMouseClicked(evt);
            }
        });
        fineRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fineCharged)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fineRadio)
                        .addGap(23, 23, 23)
                        .addComponent(noFineRadio)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noFineRadio)
                    .addComponent(fineRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fineCharged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane2.add(jPanel2);
        jPanel2.setBounds(20, 10, 161, 100);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Condition of the Returned Vehicle"));

        problemLabel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        problemLabel.setText("(Please write the problem)");

        goodRadio.setText("Good");
        goodRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goodRadioMouseClicked(evt);
            }
        });

        badRadio.setText("Bad");
        badRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                badRadioMouseClicked(evt);
            }
        });

        problemTextArea.setColumns(20);
        problemTextArea.setRows(5);
        jScrollPane2.setViewportView(problemTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(goodRadio)
                        .addGap(53, 53, 53)
                        .addComponent(badRadio))
                    .addComponent(problemLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(badRadio)
                    .addComponent(goodRadio))
                .addGap(18, 18, 18)
                .addComponent(problemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel3);
        jPanel3.setBounds(10, 10, 260, 203);

        hiredVehicleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT-" }));
        hiredVehicleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiredVehicleComboActionPerformed(evt);
            }
        });

        jButton1.setText("FREE VEHICLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name");

        jLabel5.setText("Driver");

        cmddriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT-" }));

        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(customerNameCombo, 0, 158, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(21, 21, 21)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hiredVehicleCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(receivingStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(cmddriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hiredVehicleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(receivingStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmddriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameComboActionPerformed

    }//GEN-LAST:event_customerNameComboActionPerformed

    private void noFineRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noFineRadioMouseClicked
        fineCharged.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_noFineRadioMouseClicked

    private void fineChargedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fineChargedKeyReleased
        // checkField(fineCharged);        // TODO add your handling code here:
    }//GEN-LAST:event_fineChargedKeyReleased

    private void fineRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fineRadioMouseClicked
        fineCharged.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_fineRadioMouseClicked

    private void fineRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineRadioActionPerformed

    private void goodRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goodRadioMouseClicked
        problemLabel.setVisible(false);
    }//GEN-LAST:event_goodRadioMouseClicked

    private void badRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badRadioMouseClicked
        problemLabel.setVisible(true);
    }//GEN-LAST:event_badRadioMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getVehicle();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hiredVehicleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiredVehicleComboActionPerformed


    }//GEN-LAST:event_hiredVehicleComboActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        new Clerk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton badRadio;
    private javax.swing.JComboBox cmddriver;
    private javax.swing.JComboBox customerNameCombo;
    private javax.swing.JTextField fineCharged;
    private javax.swing.JRadioButton fineRadio;
    private javax.swing.JRadioButton goodRadio;
    private javax.swing.JComboBox hiredVehicleCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton noFineRadio;
    private javax.swing.JLabel problemLabel;
    private javax.swing.JTextArea problemTextArea;
    private javax.swing.JTextField receivingStaff;
    // End of variables declaration//GEN-END:variables
  private void FreeVehicle() {
        String query = "UPDATE `hire`.`vehicle` SET status='Free' WHERE Reg_No='" 
                + hiredVehicleCombo.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
  private void FreeDriver() {
        String query = "UPDATE `hire`.`driver` SET status='Free' WHERE Name='" 
                +cmddriver.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
 private void FreeCustomer() {
        String query = "UPDATE `hire`.`customer` SET status='To Hire' WHERE Last_name='" 
                +customerNameCombo.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    private String getVehicleCondition() {
        String condition = null;
        if (goodRadio.isSelected()) {
            condition = "Good";
        } else if (badRadio.isSelected()) {
            condition = problemTextArea.getText();
        }
        return condition;
    }

    private String getFine() {
        String condition = null;
        if (fineRadio.isSelected()) {
            condition = fineCharged.getText();
        } else if (noFineRadio.isSelected()) {
            condition = "No Fine";
        }
        return condition;
    }

    private void returnVehicle() {
        String query = "INSERT INTO `hire`.`returned` (`Customer_name`, `Vehicle_returned`,`Receiving_staff`, `Vehicle_Condition`, `FINE`)  VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, customerNameCombo.getSelectedItem().toString());
            ps.setString(2, hiredVehicleCombo.getSelectedItem().toString());
            ps.setString(3, receivingStaff.getText());
            ps.setString(4, getVehicleCondition());
            ps.setString(5, getFine());
            ps.executeUpdate();
            clear();
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clear() {
        customerNameCombo.setSelectedIndex(0);
        hiredVehicleCombo.setSelectedIndex(0);
        receivingStaff.setText("");
        problemTextArea.setText("");
        fineCharged.setText("");
        cmddriver.setSelectedIndex(0);
    }

    public void getVehicle() {
        if (customerNameCombo.getSelectedIndex() == 0
                && hiredVehicleCombo.getSelectedIndex() == 0
                && !goodRadio.isSelected() && !badRadio.isSelected()
                && !fineRadio.isSelected() && !noFineRadio.isSelected()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "You Must Enter All Fields", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            FreeVehicle();
            FreeDriver();
            FreeCustomer();
            returnVehicle();
        }
    }

    private void searchVehicle() {
        String query = "select * from `hire`.`vehicle` WHERE status='Hired'";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String reg = String.valueOf(rs.getString("Reg_No"));
                hiredVehicleCombo.addItem(reg);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
private void searchDriver() {
        String query = "select * from `hire`.`driver` WHERE status='Assigned Vehicle'";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = String.valueOf(rs.getString("Name"));
                cmddriver.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
    public void getCustomer() {

        try {
            ps = con.prepareStatement("SELECT * FROM `hire`.`customer` WHERE status= 'Hired'");
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = String.valueOf(rs.getString("Last_name"));
                customerNameCombo.addItem(name);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
