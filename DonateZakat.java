
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 92333
 */
public class DonateZakat extends javax.swing.JFrame {

    public DonateZakat() {
        initComponents();
        initEditor();
    }
    String url;
    Connection con;
    PreparedStatement pst;
    Result rs;
    JTextFieldDateEditor  dtEditor;
    @SuppressWarnings("unchecked")
    
    private void initEditor(){
        dtEditor = (JTextFieldDateEditor) expirydatechooser.getDateEditor();
        dtEditor.setEnabled(false);
        cardfield.setEnabled(false);
        nameoncardfield.setEnabled(false);
        cvvfield.setEnabled(false);
    }
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        namefield = new javax.swing.JTextField();
        numberfield = new javax.swing.JTextField();
        cnicfield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        amountfield = new javax.swing.JTextField();
        typebox = new javax.swing.JComboBox();
        cardfield = new javax.swing.JTextField();
        nameoncardfield = new javax.swing.JTextField();
        expirydatechooser = new com.toedter.calendar.JDateChooser();
        cvvfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zakat");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 92, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PhoneNo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 139, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNIC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 193, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 238, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 282, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 327, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 367, 50, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Card No.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 417, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NameOnCard");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 451, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Expirateion date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 150, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CVV");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 547, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Donate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 601, -1, 40));

        namefield.setBackground(new java.awt.Color(51, 51, 51));
        namefield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namefield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 97, 205, -1));

        numberfield.setBackground(new java.awt.Color(51, 51, 51));
        numberfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(numberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 144, 205, -1));

        cnicfield.setBackground(new java.awt.Color(51, 51, 51));
        cnicfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cnicfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cnicfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 190, 205, -1));

        emailfield.setBackground(new java.awt.Color(51, 51, 51));
        emailfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emailfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 235, 205, -1));

        addressfield.setBackground(new java.awt.Color(51, 51, 51));
        addressfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addressfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 279, 205, -1));

        amountfield.setBackground(new java.awt.Color(51, 51, 51));
        amountfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amountfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(amountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 324, 205, -1));

        typebox.setBackground(new java.awt.Color(51, 51, 51));
        typebox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        typebox.setForeground(new java.awt.Color(255, 255, 255));
        typebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Cash", "Cheque", "Card", " " }));
        typebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeboxActionPerformed(evt);
            }
        });
        jPanel1.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 366, 205, -1));

        cardfield.setEditable(false);
        cardfield.setBackground(new java.awt.Color(51, 51, 51));
        cardfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cardfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 414, 205, -1));

        nameoncardfield.setEditable(false);
        nameoncardfield.setBackground(new java.awt.Color(51, 51, 51));
        nameoncardfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameoncardfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nameoncardfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 456, 205, -1));

        expirydatechooser.setBackground(new java.awt.Color(255, 255, 255));
        expirydatechooser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(expirydatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 501, 205, -1));

        cvvfield.setEditable(false);
        cvvfield.setBackground(new java.awt.Color(51, 51, 51));
        cvvfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cvvfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cvvfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 541, 205, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 100, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 680));

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

    private void typeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeboxActionPerformed
      if(typebox.getSelectedItem() == "Card")
      {
          cardfield.setEnabled(true);
          cardfield.setEditable(true);
          nameoncardfield.setEnabled(true);
          nameoncardfield.setEditable(true);
          dtEditor.setEnabled(true);
          dtEditor.setEditable(true);
          cvvfield.setEnabled(true);
           cvvfield.setEditable(true);
      }
      if(typebox.getSelectedItem() == "Cash" || typebox.getSelectedItem() == "Cheque"){
        dtEditor.setEnabled(false);
        cardfield.setEnabled(false);
        nameoncardfield.setEnabled(false);
        cvvfield.setEnabled(false);
      }
    }//GEN-LAST:event_typeboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String name= namefield.getText();
            int number = Integer.parseInt(numberfield.getText());
            int cnic = Integer.parseInt(cnicfield.getText());
            String email = emailfield.getText();
            String address = addressfield.getText();
            int amount = Integer.parseInt(amountfield.getText());
            String type = typebox.getSelectedItem().toString();
           
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
            if(typebox.getSelectedItem() == "Card")
            {
               int cardno = Integer.parseInt(cardfield.getText());
               String nameoncard = nameoncardfield.getText();
               SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
               String expirydate =  date.format(expirydatechooser.getDate());
               int cvv= Integer.parseInt(cvvfield.getText());
                url = "insert into ZakatDonors(FullName,PhoneNo,CNIC,Email,Address,Amount,Type,CardNumber,NameOnCard,ExpirationDate,CVV)values(?,?,?,?,?,?,?,?,?,?,?)";    
                pst = con.prepareStatement(url);
                pst.setString(1,name);
                pst.setInt(2,number);
                pst.setInt(3,cnic);
                pst.setString(4,email);
                pst.setString(5,address);
                pst.setInt(6,amount);
                pst.setString(7,type);
                pst.setInt(8,cardno);
                pst.setString(9,nameoncard);
                pst.setString(10,expirydate);
                pst.setInt(11,cvv);
                pst.executeUpdate();
            }
            else 
            {
                url = "insert into ZakatDonors(FullName,PhoneNo,CNIC,Email,Address,Amount,Type)values(?,?,?,?,?,?,?)";    
                pst = con.prepareStatement(url);
                pst.setString(1,name);
                pst.setInt(2,number);
                pst.setInt(3,cnic);
                pst.setString(4,email);
                pst.setString(5,address);
                pst.setInt(6,amount);
                pst.setString(7,type);
                pst.executeUpdate();
            }
               JOptionPane.showMessageDialog(this,"Thanks for Donation :)");
                namefield.setText("");
                numberfield.setText("");
                cnicfield.setText("");
                emailfield.setText("");
                addressfield.setText("");
                amountfield.setText("");
                typebox.setSelectedIndex(-1);
                cardfield.setText("");
                nameoncardfield.setText("");
                cvvfield.setText("");
                  new StartingPage().setVisible(true);
        
                this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DonateZakat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DonateZakat.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new StartingPage().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(DonateZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonateZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonateZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonateZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonateZakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressfield;
    private javax.swing.JTextField amountfield;
    private javax.swing.JTextField cardfield;
    private javax.swing.JTextField cnicfield;
    private javax.swing.JTextField cvvfield;
    private javax.swing.JTextField emailfield;
    private com.toedter.calendar.JDateChooser expirydatechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField nameoncardfield;
    private javax.swing.JTextField numberfield;
    private javax.swing.JComboBox typebox;
    // End of variables declaration//GEN-END:variables
}
