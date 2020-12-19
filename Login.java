
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

public class Login extends javax.swing.JFrame {
 
  String docname;

  DoctorPage dp;
  public Login() {
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
       public void setDocName(String docname){
        this.docname = docname;
    }
       public String getDocName(){
           return this.docname;
       } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        usertype = new javax.swing.JComboBox();
        loginbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserType");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 353, 253, 29));

        usernamefield.setBackground(new java.awt.Color(51, 51, 51));
        usernamefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 246, 180, -1));

        usertype.setBackground(new java.awt.Color(51, 51, 51));
        usertype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usertype.setForeground(new java.awt.Color(255, 255, 255));
        usertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Administration", "Doctor" }));
        jPanel1.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 193, 180, -1));

        loginbutton.setBackground(new java.awt.Color(51, 51, 51));
        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 415, 100, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 415, 100, 40));

        passwordfield.setBackground(new java.awt.Color(51, 51, 51));
        passwordfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 292, 180, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

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

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        Login login = new Login();
        boolean founddoc = false; 
        boolean foundadmin = false;
        String docname = null;
        String docuser = null;
        String docpass = null;     
        String adminuser = null;
        String adminpass = null;    
        int c;  
        String type = usertype.getSelectedItem().toString();
        String username = usernamefield.getText();
        String password = passwordfield.getText();
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
          
            if(type.equalsIgnoreCase("doctor"))
            {
                pst = con.prepareStatement("select * from DocAccount");
                rs =  pst.executeQuery();
                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();
                while(rs.next())
                {
                     for(int i=0; i < c; i++)
                     {    
                        docname = rs.getString("Name"); 
                        docuser = rs.getString("Username");
                        docpass = rs.getString("Password");             
                     }  
                      if(username.equals(docuser) && password.equals(docpass))
                     {
                        JOptionPane.showMessageDialog(this,"Login Successfully");
                         login.setDocName(docname);
                         usertype.setSelectedIndex(-1);
                         usernamefield.setText("");
                         passwordfield.setText("");
                         founddoc = true;
                      }
                    else 
                     {
                         message.setText("Account Not Exist");
                     }
                }
            }
            else if(type.equalsIgnoreCase("administration"))
            {
               pst = con.prepareStatement("select * from AdminAccounts");
                rs =  pst.executeQuery();
                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();
                while(rs.next())
                {
                   for(int i=0; i < c; i++)
                  {
                      adminuser = rs.getString("Username");
                      adminpass = rs.getString("Password");
                  } 
                     if(username.equals(adminuser) && password.equals(adminpass))
                     {
                        JOptionPane.showMessageDialog(this,"Login Successfully");
                        usertype.setSelectedIndex(-1);
                        usernamefield.setText("");
                        passwordfield.setText("");
                        foundadmin = true;
                     }
                     else
                     {
                         message.setText("Account Not Exist");
                     }
                 }
              }

             if(founddoc == true)
             {
                new DoctorPage(login).setVisible(true);
                this.setVisible(false);
             }
             if(foundadmin == true)
             {
                new AdminPage().setVisible(true);
                this.setVisible(false);
             }
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new StartingPage().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JComboBox usertype;
    // End of variables declaration//GEN-END:variables
}
