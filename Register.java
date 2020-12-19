
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
  
   String name, phone, department, timing, salary, fees;
   Doctor doctor;
   Register register;
   public Register() {
      initComponents();
    }
   public Register(Doctor doctor) {
     initComponents();
     this.doctor = doctor;
    }
     
    Connection con;
    PreparedStatement pst;
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtutype = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtcpassword = new javax.swing.JPasswordField();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        txtutype.setBackground(new java.awt.Color(51, 51, 51));
        txtutype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtutype.setForeground(new java.awt.Color(255, 255, 255));
        txtutype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Administration" }));
        jPanel1.add(txtutype, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 156, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 90, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, 40));

        txtuname.setBackground(new java.awt.Color(51, 51, 51));
        txtuname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtuname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 156, -1));

        txtcpassword.setBackground(new java.awt.Color(51, 51, 51));
        txtcpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcpassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtcpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 156, -1));

        txtpassword.setBackground(new java.awt.Color(51, 51, 51));
        txtpassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 156, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 401, 120, 40));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 110, 40));

        Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Message.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 360, 30));

        Warning.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(Warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 301, 287, 21));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String type = txtutype.getSelectedItem().toString();
        String username = txtuname.getText();
        String password = txtpassword.getText();
        String confirmpassword = txtcpassword.getText();
        new Register();
        try {   
            if(type.equalsIgnoreCase("doctor")){
                  if (password.equals(confirmpassword)){
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                     con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
                     pst = con.prepareStatement("insert into DocAccount(Name,Username,Password)values(?,?,?)");
                     pst.setString(1,this.doctor.getName());
                     pst.setString(2,username);
                     pst.setString(3,password);
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this,"Account Registered");
                      new AdminPage().setVisible(true);
                     this.setVisible(false);
                     txtutype.setSelectedIndex(-1);
                     txtuname.setText("");
                     txtpassword.setText("");
                     txtcpassword.setText("");
                  }  else {
                     Message.setText("Password Not Matched");
                  } 
            } else if(type.equalsIgnoreCase("administration")){
                 if (password.equals(confirmpassword)){
                     Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                     con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
                     pst = con.prepareStatement("insert into AdminAccounts(Username,Password)values(?,?)");
                     pst.setString(1,username);
                     pst.setString(2,password);
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this,"Account Registered");
                     new AdminPage().setVisible(true);
                     this.setVisible(false);
                     txtutype.setSelectedIndex(-1);
                     txtuname.setText("");
                     txtpassword.setText("");
                     txtcpassword.setText("");
                  }  else {
                     Message.setText("Password Not Matched");
                  } 
            }  

        } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        doctor.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JLabel Warning;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcpassword;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    private javax.swing.JComboBox txtutype;
    // End of variables declaration//GEN-END:variables
}
