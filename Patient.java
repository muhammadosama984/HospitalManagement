
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 92333
 */
public class Patient extends javax.swing.JFrame {
    private String name = null;
    private int phoneno = 0;
    private String dateofbirth = null;
    private String MedicalRecordNumber = null;
    private String appointment  = null;
    private String vaccine = null;
    private String pharma = null;
    private String radiology = null;
    private String labtest = null;
    private String surgery = null;
    private int payment = 0;
    private String doctor = null;
    
    public Patient() {
        initComponents();
    }
   
     public void setName(String name){
     /*  if(name == null){
            this.name = null;
        }
         else */
          this.name = name;
      
    }    
    public String getName(){
        return this.name;
    }
    public void setDate(String dateofbirth){
       if(dateofbirth == null){
            this.dateofbirth = null;
        }
        else  this.dateofbirth = dateofbirth;
      
    }
    public String getDate(){
        return this.dateofbirth;
    }
    public void setNumber(int phoneno){
      if(phoneno == 0){
        this.phoneno = 0;   
       }
       else   this.phoneno = phoneno ;
     
    }
    public int getNumber(){
        return this.phoneno;
    }
    public void setmedicalrecordno(String MedicalRecordNumber){
       if(MedicalRecordNumber == null){
         this.MedicalRecordNumber = null;
     }   
        else this.MedicalRecordNumber = MedicalRecordNumber;
      
    }
    public String getmedicalrecordno(){
        return this.MedicalRecordNumber;
    }
    
    public void setPharma(String pharma){
        if(pharma == null){
            this.pharma = null;
        }
        else  this.pharma = pharma;
    }
    public String getPharma(){
    return this.pharma;
    }
    public void setSurgery(String surgery){
        if(surgery == null){
            this.surgery = null;
        }
        else  this.surgery = surgery;
  
    }
    public String getSurgery(){
      return  this.surgery;
    }
    public void setLab(String labtest){
        if(labtest == null){
            this.labtest = null;
        }
        else  this.labtest = labtest; 
   
    }
    public String getLab(){
       return this.labtest;
    }
    public void setRadiology(String radiology){
       if(radiology == null){
            this.radiology = null;
        }
        else  this.radiology = radiology;
      
    }
    public String getRadiology(){
       return  this.radiology;
    }
    public void setappointment(String appointment){
      /*if(appointment == null){
            this.appointment = null;
        }
   else */ this.appointment = appointment;
   
    }
    public String getappointment(){
        return this.appointment;
    }
    public void setpayment(int payment){
       if(payment == 0){
        this.payment = 0;   
       }
       else  this.payment += payment;
    }
    public int getpayment(){
        return this.payment;
    }
    public void setdoctor(String doctor){
     /*  if(doctor == null){
            this.doctor = null;
        }
   else */ this.doctor = doctor;
   
    }
    public String getdoctor(){
        return this.doctor;
    }
    public void setVaccine(String vaccine){
     /* if(vaccine == null){
            this.vaccine = null;
        }
       else */this.vaccine = vaccine;
     
    }
    public String getVaccine(){
        return this.vaccine;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        numberfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        birthdatechooser = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 136, 110, 22));

        namefield.setBackground(new java.awt.Color(51, 51, 51));
        namefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namefield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 136, 169, -1));

        numberfield.setBackground(new java.awt.Color(51, 51, 51));
        numberfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numberfield.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(numberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 246, 169, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 244, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Services");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 370, 150, 40));

        birthdatechooser.setBackground(new java.awt.Color(255, 255, 255));
        birthdatechooser.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(birthdatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 194, 169, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

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
     Patient patient = new Patient();
    
     int random1, random2, random3;
     random1 = (int) (Math.random()*999);
     random2 = (int) (Math.random()*100);
     random3 = (int) (Math.random()*999);
     MedicalRecordNumber = (random1 + "-" + random2 + "-" + random3);
     patient.setmedicalrecordno(MedicalRecordNumber);
     patient.setName(namefield.getText());  
     SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
     dateofbirth =  date.format(birthdatechooser.getDate());
     patient.setDate(dateofbirth);
     patient.setNumber(Integer.parseInt(numberfield.getText()));
 
     new Services(patient).setVisible(true);
     this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser birthdatechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField numberfield;
    // End of variables declaration//GEN-END:variables


  
}
