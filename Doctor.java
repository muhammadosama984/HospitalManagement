
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    private String name, phone, department, timing, salary, fees, status, datecreated, doctor;

    public Doctor() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdname = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtdepartment = new javax.swing.JComboBox();
        txtsalary = new javax.swing.JTextField();
        txtfees = new javax.swing.JTextField();
        DayComboBox = new javax.swing.JComboBox();
        timebox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        timebox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        errorfield = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 29, 260, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 102, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Timing");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 279, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salary");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 369, 110, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fees");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 420, 90, -1));

        txtdname.setBackground(new java.awt.Color(51, 51, 51));
        txtdname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtdname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 109, 442, -1));

        txtphoneno.setBackground(new java.awt.Color(51, 51, 51));
        txtphoneno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtphoneno.setForeground(new java.awt.Color(255, 255, 255));
        txtphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenoActionPerformed(evt);
            }
        });
        jPanel1.add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 172, 442, -1));

        txtdepartment.setBackground(new java.awt.Color(51, 51, 51));
        txtdepartment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdepartment.setForeground(new java.awt.Color(255, 255, 255));
        txtdepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Cardiology", "ENT", "Oncology", "Neurology", "Hematology" }));
        jPanel1.add(txtdepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 225, 444, -1));

        txtsalary.setBackground(new java.awt.Color(51, 51, 51));
        txtsalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsalary.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 369, 444, -1));

        txtfees.setBackground(new java.awt.Color(51, 51, 51));
        txtfees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfees.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 417, 444, -1));

        DayComboBox.setBackground(new java.awt.Color(51, 51, 51));
        DayComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DayComboBox.setForeground(new java.awt.Color(255, 255, 255));
        DayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SelectDay", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Mon/Tue", "Mon/Wed", "Mon/Thurs", "Mon/Fri", "Mon/Sat", "Tue/Wed", "Tue/Thurs", "Tue/Fri", "Tue/Sat", "Wed/Thurs", "Wed/Fri", "Wed/Sat", "Thurs/Fri", "Thurs/Sat", "Fri/Sat", "Mon/Tue/Wed", "Mon/Tue/Thurs", "Mon/Tue/Fri", "Mon/Tue/Sat", "Mon/Wed/Thurs", "Mon/Wed/Fri", "Mon/Wed/Sat", "Mon/Thurs/Fri", "Mon/Thurs/Sat", "Mon/Fri/Sat", "Tue/Wed/Thurs", "Tue/Wed/Fri", "Tue/Wed/Sat", "Tue/Thurs/Fri", "Tue/Thurs/Sat", "Tue/Fri/Sat", "Wed/Thurs/Fri", "Wed/Thurs/Sat", "Wed/Fri/Sat", "Thurs/Fri/Sat", "Everyday ", " " }));
        jPanel1.add(DayComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 276, 139, 30));

        timebox.setBackground(new java.awt.Color(51, 51, 51));
        timebox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timebox.setForeground(new java.awt.Color(255, 255, 255));
        timebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SelectStartTime", "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm", "9 pm" }));
        jPanel1.add(timebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 276, 132, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 282, 15, -1));

        timebox2.setBackground(new java.awt.Color(51, 51, 51));
        timebox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timebox2.setForeground(new java.awt.Color(255, 255, 255));
        timebox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SelectEndTime", "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm", "9 pm" }));
        jPanel1.add(timebox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 276, 123, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 113, 38));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 115, 38));

        errorfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        errorfield.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(errorfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 319, 565, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public String getTiming() {
        return timing;
    }

    public String getSalary() {
        return salary;
    }

    public String getFees() {
        return fees;
    }

    public String setdatecreation(String datecreation) {
        return this.datecreated = datecreation;
    }

    public String getdatecreation() {
        return this.datecreated;
    }

    public String setstatus(String status) {
        return this.status = "Active";
    }

    public String getstatus() {
        return this.status;
    }

    public String setDoctor(String drname) {
        return this.doctor = drname;
    }

    public String getDoctor() {
        return this.doctor;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean same = false;
        Doctor doctor = new Doctor();
        name = txtdname.getText();
        doctor.setName("Dr " + name);
        phone = txtphoneno.getText();
        doctor.setPhone(phone);
        department = txtdepartment.getSelectedItem().toString();
        doctor.setDepartment(department);
     /*  do{
             if(timebox.getSelectedItem().toString().equals(timebox2.getSelectedItem().toString()))
         {  
             same  = true;
            errorfield.setText("Error: Starting time and Ending time cannot be same");
         }
               else {same = false; errorfield.setText("");}
        } while(same);*/
        timing = (DayComboBox.getSelectedItem().toString()+"  "+timebox.getSelectedItem().toString()+ "-" + timebox2.getSelectedItem().toString());
        doctor.setTiming(timing);
        salary =  txtsalary.getText();
        doctor.setSalary(salary);
        fees = txtfees.getText();
        doctor.setFees(fees);
        status = "Active";
        doctor.setstatus(status);
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        datecreated = (year + "/" + month + "/" + day +" "+ hour + ":" + minute + ":" + second) ;
        doctor.setdatecreation(datecreated);
        
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
            pst = con.prepareStatement("insert into DocRecord(Name,PhoneNo,Department,Timing,Salary,Fee,DateOfCreation,Status)values(?,?,?,?,?,?,?,?)");
            pst.setString(1,doctor.getName());
            pst.setString(2,doctor.getPhone());
            pst.setString(3,doctor.getDepartment());
            pst.setString(4,doctor.getTiming());
            pst.setString(5,doctor.getSalary());
            pst.setString(6,doctor.getFees());
            pst.setString(7,doctor.getdatecreation());
            pst.setString(8,doctor.getstatus());
          
          if(timebox.getSelectedItem().toString().equals(timebox2.getSelectedItem().toString()))
         {  
            errorfield.setText("Error: Starting time and Ending time cannot be same");
         }
               else 
          {
              errorfield.setText("");
               pst.executeUpdate();
              JOptionPane.showMessageDialog(this,"Doctor Added! Now register its account");
              new Register(doctor).setVisible(true);
              this.setVisible(false);
          }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DayComboBox;
    private javax.swing.JLabel errorfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox timebox;
    private javax.swing.JComboBox timebox2;
    private javax.swing.JComboBox txtdepartment;
    private javax.swing.JTextField txtdname;
    private javax.swing.JTextField txtfees;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
