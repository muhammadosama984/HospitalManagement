
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


public class Neurology extends javax.swing.JFrame {

    Patient patient;
   
    public Neurology() {
        initComponents();
       
    }
      public Neurology(Patient patient) {
        initComponents();
        this.patient = patient;
        tableupdate();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

   
    public void tableupdate(){
        String u = "Neurology";
        String s = "Active";
        int c;
        
            try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\92333\\Documents\\HospitalManagementSystem.accdb");
             pst = con.prepareStatement("select * from DocRecord Where Department='"+u+"' and Status = '"+s+"'");
             rs = pst.executeQuery();
             ResultSetMetaData rsd = rs.getMetaData();
             c = rsd.getColumnCount();
             DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
             dft.setRowCount(0);
              
             while (rs.next()){
                  Vector v2 = new Vector();
                  for (int i= 0;i<= c ;i++){
                     v2.add(rs.getString("Name"));
                     v2.add(rs.getString("Timing"));
                     v2.add(rs.getString("Fee"));
                  }
                  dft.addRow(v2);
            } 
             
             } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Neurology.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        confirmbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Neurology");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 280, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "Timing", "Fees"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 611, -1));

        confirmbutton.setBackground(new java.awt.Color(51, 51, 51));
        confirmbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmbutton.setForeground(new java.awt.Color(255, 255, 255));
        confirmbutton.setText("Confirm Appointment");
        confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 240, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 640));

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

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
     int amount= 0;
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     int selectedIndex = jTable1.getSelectedRow();
     String doctor = model.getValueAt(selectedIndex, 0).toString();
     String timing = model.getValueAt(selectedIndex, 1).toString();
     this.patient.setdoctor(doctor);
     this.patient.setappointment("Dr " + doctor + " " + timing);
     amount =  amount + Integer.parseInt(model.getValueAt(selectedIndex, 2).toString());
     this.patient.setpayment(amount);
     JOptionPane.showMessageDialog(this,"You selection has been confirmed");
    }//GEN-LAST:event_confirmbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new AppointmentPage(this.patient).setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Neurology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Neurology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Neurology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Neurology.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Neurology().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
