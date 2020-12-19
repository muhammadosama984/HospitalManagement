
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


 public class Checkout extends javax.swing.JFrame {
    Checkout checkout;
    Patient patient;
    Connection con;
    PreparedStatement pst;
    JTextFieldDateEditor dtEditor;
   
    public Checkout() {
        initComponents();
        
    }
    public Checkout(Patient patient) {
        initComponents();
        initEditor();
        this.patient = patient;
       
    }
       private void initEditor()
      {
        dtEditor = (JTextFieldDateEditor) expirydatechooser.getDateEditor();
        dtEditor.setEnabled(false);
        cardfield.setEnabled(false);
        nameoncardfield.setEnabled(false);
        cvvfield.setEnabled(false);
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        billlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typebox = new javax.swing.JComboBox();
        checkoutbutton = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        cardfield = new javax.swing.JTextField();
        nameoncardfield = new javax.swing.JTextField();
        cvvfield = new javax.swing.JTextField();
        expirydatechooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        NameOnCard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check Out");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 29, 250, -1));

        billlabel.setBackground(new java.awt.Color(51, 51, 51));
        billlabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        billlabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(billlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 113, 510, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose payment method");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 186, 240, -1));

        typebox.setBackground(new java.awt.Color(51, 51, 51));
        typebox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        typebox.setForeground(new java.awt.Color(255, 255, 255));
        typebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Cash", "Card", "Cheque", " " }));
        typebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeboxActionPerformed(evt);
            }
        });
        jPanel1.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 186, 165, -1));

        checkoutbutton.setBackground(new java.awt.Color(51, 51, 51));
        checkoutbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutbutton.setText("Check Out");
        checkoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(checkoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 442, 150, 39));

        message.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 333, 181, 16));

        cardfield.setEditable(false);
        cardfield.setBackground(new java.awt.Color(51, 51, 51));
        cardfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cardfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 232, 165, -1));

        nameoncardfield.setEditable(false);
        nameoncardfield.setBackground(new java.awt.Color(51, 51, 51));
        nameoncardfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameoncardfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nameoncardfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 272, 165, -1));

        cvvfield.setEditable(false);
        cvvfield.setBackground(new java.awt.Color(51, 51, 51));
        cvvfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvvfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cvvfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 356, 165, -1));

        expirydatechooser.setBackground(new java.awt.Color(255, 255, 255));
        expirydatechooser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(expirydatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 304, 165, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Card No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 235, 80, -1));

        NameOnCard.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameOnCard.setForeground(new java.awt.Color(255, 255, 255));
        NameOnCard.setText("Name On Card");
        jPanel1.add(NameOnCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 270, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Expiration Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 302, 150, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CVV");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 356, 40, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 520));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        billlabel.setText("Your total bill is " + Integer.toString(this.patient.getpayment()));
        
    }//GEN-LAST:event_formWindowOpened

    private void checkoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbuttonActionPerformed
     new Checkout();
     try { 
  
    
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
      if(typebox.getSelectedItem() == "Card")
      {     
            String type = typebox.getSelectedItem().toString();
              String nameoncard = nameoncardfield.getText();
            int cardnumber = Integer.parseInt(cardfield.getText());
            int cvv = Integer.parseInt(cvvfield.getText());
            SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
            String expirydate =  date.format(expirydatechooser.getDate());
            String url = "insert into PatientRecords(MedicalRecordNo,Name,Birthdate,PhoneNo,DoctorName,Appointment,LabTest,Surgery,Vaccination,Radiology,Pharmaceutical,TotalPayment,PaymentMethod,CardNumber,NameOnCard,ExpirationDate,CVV)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";       
            pst = con.prepareStatement(url);
            pst.setString(1,this.patient.getmedicalrecordno());
            pst.setString(2,this.patient.getName());
            pst.setString(3,this.patient.getDate());
            pst.setInt(4,this.patient.getNumber());
            pst.setString(5,this.patient.getdoctor());  
            pst.setString(6,this.patient.getappointment());  
            pst.setString(7,this.patient.getLab());
            pst.setString(8,this.patient.getSurgery());
            pst.setString(9,this.patient.getVaccine());
            pst.setString(10,this.patient.getRadiology());
            pst.setString(11,this.patient.getPharma());
            pst.setInt(12,this.patient.getpayment());
            pst.setString(13,type);
            pst.setInt(14,cardnumber);
            pst.setString(15,nameoncard);
            pst.setString(16,expirydate);
            pst.setInt(17,cvv);
            pst.executeUpdate();
      } 
      else if(typebox.getSelectedItem() == "Cash" || typebox.getSelectedItem() == "Cheque")
      {
            String url = "insert into PatientRecords(MedicalRecordNo,Name,Birthdate,PhoneNo,DoctorName,Appointment,LabTest,Surgery,Vaccination,Radiology,Pharmaceutical,TotalPayment)values(?,?,?,?,?,?,?,?,?,?,?,?)";       
            pst = con.prepareStatement(url);
            pst.setString(1,this.patient.getmedicalrecordno());
            pst.setString(2,this.patient.getName());
            pst.setString(3,this.patient.getDate());
            pst.setInt(4,this.patient.getNumber());
            pst.setString(5,this.patient.getdoctor());  
            pst.setString(6,this.patient.getappointment());  
            pst.setString(7,this.patient.getLab());
            pst.setString(8,this.patient.getSurgery());
            pst.setString(9,this.patient.getVaccine());
            pst.setString(10,this.patient.getRadiology());
            pst.setString(11,this.patient.getPharma());
            pst.setInt(12,this.patient.getpayment());
            pst.executeUpdate();
      }    
            JOptionPane.showMessageDialog(this,"THANK YOU! DO VISIT AGAIN :)");
            new StartingPage().setVisible(true);
            this.setVisible(false);
        
        } catch ( ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_checkoutbuttonActionPerformed

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
      if(typebox.getSelectedItem() == "Cash" || typebox.getSelectedItem() == "Cheque")
      {
            dtEditor.setEnabled(false);
            cardfield.setEnabled(false);
            nameoncardfield.setEnabled(false);
            cvvfield.setEnabled(false);
      }
    }//GEN-LAST:event_typeboxActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameOnCard;
    private javax.swing.JLabel billlabel;
    private javax.swing.JTextField cardfield;
    private javax.swing.JButton checkoutbutton;
    private javax.swing.JTextField cvvfield;
    private com.toedter.calendar.JDateChooser expirydatechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JTextField nameoncardfield;
    private javax.swing.JComboBox typebox;
    // End of variables declaration//GEN-END:variables

 
   
}
