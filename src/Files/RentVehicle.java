package Files;

import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RentVehicle extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public RentVehicle() {
        con = Allconnection.Allconnection();
        initComponents();
        getCustomerId();

        searchDriver();
        searchVehicle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        amountCharged = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        progressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleHiredComboBox = new javax.swing.JComboBox();
        hireDate = new com.toedter.calendar.JDateChooser();
        returnDate = new com.toedter.calendar.JDateChooser();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        vehicleImage = new javax.swing.JLabel();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        driverImage = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        driverLabel = new javax.swing.JLabel();
        yesRadio = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        driverAssignedComboBox = new javax.swing.JComboBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        noRadio = new javax.swing.JRadioButton();
        idNumberCombo = new javax.swing.JComboBox();
        customerName = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Assign vehicles to Customers"));

        jButton1.setText("PROCESS RECEIPT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Vehicle to Hire");

        jLabel2.setText("ID Number");

        jLabel3.setText("Customer Name");

        jLabel9.setText("Hired From:");

        jLabel11.setText("Amount Charged");

        amountCharged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountChargedKeyReleased(evt);
            }
        });

        jLabel7.setText("To:");

        jButton2.setText("CHECK VEHICLE AVAILABILITY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        progressLabel.setText("jLabel6");
        jDesktopPane3.add(progressLabel);
        progressLabel.setBounds(10, 9, 140, 90);

        vehicleHiredComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select-" }));
        vehicleHiredComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleHiredComboBoxMouseClicked(evt);
            }
        });
        vehicleHiredComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleHiredComboBoxActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(vehicleHiredComboBox);

        vehicleImage.setText("jLabel3");
        jDesktopPane4.add(vehicleImage);
        vehicleImage.setBounds(10, 10, 320, 150);

        driverImage.setText("jLabel4");
        jDesktopPane5.add(driverImage);
        driverImage.setBounds(10, 10, 260, 140);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Need Driver"));

        driverLabel.setText("Driver Assigned");

        yesRadio.setText("Yes");
        yesRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesRadioMouseClicked(evt);
            }
        });

        driverAssignedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT" }));
        driverAssignedComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                driverAssignedComboBoxMouseClicked(evt);
            }
        });
        driverAssignedComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverAssignedComboBoxActionPerformed(evt);
            }
        });
        jScrollPane3.setViewportView(driverAssignedComboBox);

        noRadio.setText("No");
        noRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noRadioMouseClicked(evt);
            }
        });
        jDesktopPane1.add(noRadio);
        noRadio.setBounds(10, 10, 50, 30);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(yesRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(driverLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(yesRadio))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(driverLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jDesktopPane2.add(jPanel4);
        jPanel4.setBounds(10, 10, 340, 124);

        idNumberCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT-" }));
        idNumberCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberComboActionPerformed(evt);
            }
        });

        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(181, 181, 181))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(amountCharged, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jButton8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDesktopPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(71, 71, 71)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idNumberCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerName)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idNumberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jDesktopPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDesktopPane5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDesktopPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(105, 105, 105)))
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(amountCharged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AssignVehicle();
      PrinterJob job = PrinterJob.getPrinterJob();
            boolean ok = job.printDialog();
      if(ok)
      {
          try{
              job.print();
          } catch(PrinterException e)
          {
              JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
          }
      }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amountChargedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountChargedKeyReleased
        //checkField(amountCharged);        // TODO add your handling code here:
    }//GEN-LAST:event_amountChargedKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        progressLabel.setVisible(true);
        new Thread() {
            public void run() {
                int p = 0;
                while (p < 80) {
                    progressLabel.setText("Checking...");
                    p++;
                    try {
                        sleep(20);
                    } catch (Exception e) {
                    }
                }
                new VehicleReport().setVisible(true);
                progressLabel.setVisible(false);
            }
        }.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vehicleHiredComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleHiredComboBoxMouseClicked

    }//GEN-LAST:event_vehicleHiredComboBoxMouseClicked

    private void vehicleHiredComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleHiredComboBoxActionPerformed
        String search = vehicleHiredComboBox.getSelectedItem().toString();
        String query = "SELECT * FROM `vehicle` WHERE `Reg_No` LIKE '" + search + "'";

        try {
            ps = con.prepareStatement(query);
            rs = Allconnection.st.executeQuery(query);
            while (rs.next()) {
                vehicleHiredComboBox.setSelectedItem(String.valueOf(rs.getString("Reg_No")));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_vehicleHiredComboBoxActionPerformed

    private void yesRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesRadioMouseClicked
        jScrollPane3.setVisible(true);
        driverAssignedComboBox.setVisible(true);
        driverLabel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_yesRadioMouseClicked

    private void driverAssignedComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_driverAssignedComboBoxMouseClicked

    }//GEN-LAST:event_driverAssignedComboBoxMouseClicked

    private void driverAssignedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverAssignedComboBoxActionPerformed

    }//GEN-LAST:event_driverAssignedComboBoxActionPerformed

    private void noRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noRadioMouseClicked
        jScrollPane3.setVisible(false);
        driverAssignedComboBox.setVisible(false);
        driverLabel.setVisible(false);
    }//GEN-LAST:event_noRadioMouseClicked

    private void idNumberComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNumberComboActionPerformed
        String search = idNumberCombo.getSelectedItem().toString();
        String query = "select * from `hire`.`customer` WHERE Id_No='" + search + "'";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                customerName.setText(String.valueOf(rs.getString(3)));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_idNumberComboActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        new Clerk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountCharged;
    private javax.swing.JTextField customerName;
    private javax.swing.JComboBox driverAssignedComboBox;
    private javax.swing.JLabel driverImage;
    private javax.swing.JLabel driverLabel;
    private com.toedter.calendar.JDateChooser hireDate;
    private javax.swing.JComboBox idNumberCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JLabel progressLabel;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JComboBox vehicleHiredComboBox;
    private javax.swing.JLabel vehicleImage;
    private javax.swing.JRadioButton yesRadio;
    // End of variables declaration//GEN-END:variables
private void getCustomerId() {

        String Query = "SELECT * FROM `hire`.`customer` WHERE status='To Hire'";
        try {
            ps = con.prepareStatement(Query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String Id_No = String.valueOf(rs.getString("Id_No"));
                idNumberCombo.addItem(Id_No);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void searchDriver() {
        String query = "select * from `hire`.`driver` WHERE status='Free'";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = String.valueOf(rs.getString("Name"));
                driverAssignedComboBox.addItem(name);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    private void searchVehicle() {
        String query = "select * from `hire`.`vehicle`WHERE status='Free'";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String reg = String.valueOf(rs.getString("Reg_No"));
                vehicleHiredComboBox.addItem(reg);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

   
    private void hireVehicle() {
        String vehicle = "Hired";
        String query = "UPDATE `hire`.`vehicle` SET status='" + vehicle + "' WHERE Reg_No='"
                + vehicleHiredComboBox.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void updateDriverStatus() {
        String driver = "Assigned Vehicle";
        String query = "UPDATE `hire`.`driver` SET status='" + driver + "' WHERE Name='"
                + driverAssignedComboBox.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    public void updateCustomerStatus() {
        String cust = "Hired";
        String query = "UPDATE `hire`.`customer` SET status='" + cust + "' WHERE Id_No='"
                + idNumberCombo.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    public String chooseDriver() {
        String driver_assigned = null;
        if (yesRadio.isSelected()) {
            driver_assigned = driverAssignedComboBox.getSelectedItem().toString();
        } else if (noRadio.isSelected()) {
            driver_assigned = "No Driver";
        }
        return driver_assigned;

    }

    private JTextField setHireDate(JDateChooser jDateChooser) {
        return ((JTextField) hireDate.getDateEditor().getUiComponent());

    }

    private JTextField setReturnDate(JDateChooser jDateChooser) {
        return ((JTextField) returnDate.getDateEditor().getUiComponent());

    }

    public void insert() {
        String query = "INSERT INTO `hire`.`rented` (`Id_No`, `Customer_Name`,`Reg_No`, `Date_hired`, `Date_returned`, `Amount_charged`, `Driver_assigned`)  VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, idNumberCombo.getSelectedItem().toString());
            ps.setString(2, customerName.getText());
            ps.setString(3, vehicleHiredComboBox.getSelectedItem().toString());
            ps.setString(4, setHireDate(hireDate).getText());
            ps.setString(5, setReturnDate(returnDate).getText());
            ps.setInt(6, Integer.parseInt(amountCharged.getText()));
            ps.setString(7, chooseDriver());
            ps.executeUpdate();
            clear();
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void AssignVehicle() {
        if (idNumberCombo.getSelectedItem().toString().equals("")
                && customerName.getText().equals("")
                && !yesRadio.isSelected()
                && !noRadio.isSelected()
                && vehicleHiredComboBox.getSelectedIndex() == 0
                && setHireDate(hireDate).getText().equals("")
                && setReturnDate(returnDate).getText().equals("")
                && amountCharged.getText().equals("")
                && driverAssignedComboBox.getSelectedIndex() == 0) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "You Must enter all Fields", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            hireVehicle();
            updateDriverStatus();
            updateCustomerStatus();
            insert();
        
        }
    }

    private void clear() {
        idNumberCombo.setSelectedIndex(0);;
        customerName.setText("");
        vehicleHiredComboBox.setSelectedIndex(0);
        setHireDate(hireDate).setText("");
        setReturnDate(hireDate).setText("");
        driverAssignedComboBox.setSelectedIndex(0);
        amountCharged.setText("");
    }

    public int print(Graphics g, PageFormat pf, int page) {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }
        
Graphics2D g2d = (Graphics2D)g;
g2d.translate(pf.getImageableX(), pf.getImageableY());
new RentVehicle().printAll(g);
return PAGE_EXISTS;
        
    }
}
