
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 92333
 */
public class ShowDoctorRecords extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDoctor
     */
    public ShowDoctorRecords() {
        initComponents();
        tableset();
    }

    ResultSet rs;
    Connection con;
    PreparedStatement pst;
    public void tableset(){
        int c;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
            pst = con.prepareStatement("select * from DocRecord");
            rs =  pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i=0; i < c; i++)
                {
                  v2.add(rs.getString("Name"));
                  v2.add(rs.getString("PhoneNo"));
                  v2.add(rs.getString("Department"));
                  v2.add(rs.getString("Timing"));
                  v2.add(rs.getString("Salary"));
                  v2.add(rs.getString("Fee"));
                  v2.add(rs.getString("DateOfCreation"));
                  v2.add(rs.getString("Status"));
                }
                 dtm.addRow(v2);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ShowDoctorRecords.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Timing = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        numberfield = new javax.swing.JTextField();
        departmentfield = new javax.swing.JTextField();
        timingfield = new javax.swing.JTextField();
        salaryfield = new javax.swing.JTextField();
        feefield = new javax.swing.JTextField();
        dateofcreationfield = new javax.swing.JTextField();
        statusbox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        rfee = new javax.swing.JRadioButton();
        rsalary = new javax.swing.JRadioButton();
        rpercentage = new javax.swing.JRadioButton();
        ramount = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        percentagefield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        amountfield = new javax.swing.JTextField();
        updatebutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "PhoneNo", "Department", "Timing", "Salary", "Fee", "DateOfCreation", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 868, 157));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 200, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PhoneNo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, -1));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        Timing.setBackground(new java.awt.Color(51, 51, 51));
        Timing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Timing.setForeground(new java.awt.Color(255, 255, 255));
        Timing.setText("Timing");
        jPanel1.add(Timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 427, 90, 40));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 301, 70, -1));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fee");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 341, -1, -1));

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DateOfCreation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 389, -1, -1));

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 438, -1, -1));

        namefield.setBackground(new java.awt.Color(51, 51, 51));
        namefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namefield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 298, 165, -1));

        numberfield.setBackground(new java.awt.Color(51, 51, 51));
        numberfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(numberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 338, 165, -1));

        departmentfield.setBackground(new java.awt.Color(51, 51, 51));
        departmentfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        departmentfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(departmentfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 389, 165, -1));

        timingfield.setBackground(new java.awt.Color(51, 51, 51));
        timingfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timingfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(timingfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 435, 165, -1));

        salaryfield.setBackground(new java.awt.Color(51, 51, 51));
        salaryfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salaryfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(salaryfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 298, 162, -1));

        feefield.setBackground(new java.awt.Color(51, 51, 51));
        feefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feefield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(feefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 338, 162, -1));

        dateofcreationfield.setBackground(new java.awt.Color(51, 51, 51));
        dateofcreationfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateofcreationfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateofcreationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 386, 162, -1));

        statusbox.setBackground(new java.awt.Color(51, 51, 51));
        statusbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusbox.setForeground(new java.awt.Color(255, 255, 255));
        statusbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active ", "Inactive" }));
        jPanel1.add(statusbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 435, 162, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Choose what you want to increase");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 507, 250, 30));

        rfee.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rfee);
        rfee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rfee.setForeground(new java.awt.Color(255, 255, 255));
        rfee.setText("Fee");
        rfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfeeActionPerformed(evt);
            }
        });
        jPanel1.add(rfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 505, -1, 40));

        rsalary.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rsalary);
        rsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rsalary.setForeground(new java.awt.Color(255, 255, 255));
        rsalary.setText("Salary");
        jPanel1.add(rsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, 30));

        rpercentage.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rpercentage);
        rpercentage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rpercentage.setForeground(new java.awt.Color(255, 255, 255));
        rpercentage.setText("Percentage");
        rpercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpercentageActionPerformed(evt);
            }
        });
        jPanel1.add(rpercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, -1, -1));

        ramount.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(ramount);
        ramount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ramount.setForeground(new java.awt.Color(255, 255, 255));
        ramount.setText("Amount");
        ramount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramountActionPerformed(evt);
            }
        });
        jPanel1.add(ramount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Increase By:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 20));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Percentage by:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        percentagefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentagefieldActionPerformed(evt);
            }
        });
        jPanel1.add(percentagefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 620, 120, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amount by:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, -1, -1));
        jPanel1.add(amountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 144, -1));

        updatebutton.setBackground(new java.awt.Color(51, 51, 51));
        updatebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 115, 38));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 105, 36));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rpercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpercentageActionPerformed
       ramount.setSelected(false);
       rpercentage.setSelected(true);
       amountfield.setEnabled(false);
       percentagefield.setEnabled(true);
       percentagefield.setEditable(true);

       amountfield.setText("");
    }//GEN-LAST:event_rpercentageActionPerformed

    private void ramountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramountActionPerformed
    
      
        ramount.setSelected(true);
        rpercentage.setSelected(false);
       
        amountfield.setEnabled(true);
        amountfield.setEditable(true);
        
        percentagefield.setEnabled(false);
        percentagefield.setText("");
        
      
    }//GEN-LAST:event_ramountActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
         
       String name = namefield.getText();       
       String phone = numberfield.getText();
       String department = departmentfield.getText();
       String timing  = timingfield.getText();
      
       String salaryadditionalamount = null;
       String feeadditionalamount = null;
       int updatedsalary = Integer.parseInt(salaryfield.getText());
       int updatedfees = Integer.parseInt(feefield.getText());
       if (rsalary.isSelected())
       {
            if (rpercentage.isSelected())
            {
                    int getPercentage = Integer.parseInt(percentagefield.getText());
                    int calPercentage = updatedsalary/100 * getPercentage + updatedsalary;
                    salaryadditionalamount = String.valueOf(calPercentage);
                    salaryfield.setText(salaryadditionalamount);
            }
            else if(ramount.isSelected())
            {
                    int getAmt = Integer.parseInt(amountfield.getText());
                    int calAmt = updatedsalary + getAmt;
                    salaryadditionalamount = String.valueOf(calAmt);
                    salaryfield.setText(salaryadditionalamount);
            }
       }
       
       else if (rfee.isSelected())
       {
                if (rpercentage.isSelected())
                {
                    int getPercentage = Integer.parseInt(percentagefield.getText());
                    int calPercentage = updatedfees/100 * getPercentage + updatedfees;
                    feeadditionalamount = String.valueOf(calPercentage);
                    feefield.setText(feeadditionalamount);
                }
            else if(ramount.isSelected())
            {
                    int getAmt = Integer.parseInt(amountfield.getText());
                    int calAmt = updatedfees + getAmt;
                    feeadditionalamount = String.valueOf(calAmt);
                    feefield.setText(feeadditionalamount);
            }
       } 
         String salary = salaryfield.getText();
         String fee = feefield.getText();
         String status = statusbox.getSelectedItem().toString();
         String  date = dateofcreationfield.getText();
         try{
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
              
            pst = con.prepareStatement("update DocRecord set PhoneNo=?,Department = ?, Timing = ?, Salary=?, Fee = ?, DateOfCreation=?,Status = ? where Name= ?");
           
            pst.setString(1,phone);
            pst.setString(2,department);
            pst.setString(3,timing);
            pst.setString(4,salary);
            pst.setString(5,fee);
            pst.setString(6,date);
            pst.setString(7,status);
            pst.setString(8,name);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated");
            tableset();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void rfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfeeActionPerformed

    }//GEN-LAST:event_rfeeActionPerformed

    private void percentagefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentagefieldActionPerformed
       
    }//GEN-LAST:event_percentagefieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new AdminPage().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        namefield.setText(model.getValueAt(selectedIndex, 0).toString());
        numberfield.setText(model.getValueAt(selectedIndex, 1).toString());
        departmentfield.setText(model.getValueAt(selectedIndex, 2).toString());
        timingfield.setText(model.getValueAt(selectedIndex, 3).toString());
        salaryfield.setText(model.getValueAt(selectedIndex, 4).toString());
        feefield.setText(model.getValueAt(selectedIndex, 5).toString());
        dateofcreationfield.setText(model.getValueAt(selectedIndex, 6).toString());
        statusbox.setSelectedItem(model.getValueAt(selectedIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowDoctorRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowDoctorRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowDoctorRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowDoctorRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowDoctorRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timing;
    private javax.swing.JTextField amountfield;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField dateofcreationfield;
    private javax.swing.JTextField departmentfield;
    private javax.swing.JTextField feefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField numberfield;
    private javax.swing.JTextField percentagefield;
    private javax.swing.JRadioButton ramount;
    private javax.swing.JRadioButton rfee;
    private javax.swing.JRadioButton rpercentage;
    private javax.swing.JRadioButton rsalary;
    private javax.swing.JTextField salaryfield;
    private javax.swing.JComboBox statusbox;
    private javax.swing.JTextField timingfield;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
