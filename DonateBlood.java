
import javax.swing.JOptionPane;


public class DonateBlood extends javax.swing.JFrame {

    Patient patient;
    public DonateBlood() {
        initComponents();
    }
      
    public DonateBlood(Patient patient) {
        initComponents();
       this.patient = patient; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bloodbox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        RadioButton4 = new javax.swing.JRadioButton();
        RadioButton5 = new javax.swing.JRadioButton();
        RadioButton6 = new javax.swing.JRadioButton();
        RadioButton7 = new javax.swing.JRadioButton();
        RadioButton8 = new javax.swing.JRadioButton();
        RadioButton10 = new javax.swing.JRadioButton();
        RadioButton11 = new javax.swing.JRadioButton();
        RadioButton9 = new javax.swing.JRadioButton();
        RadioButton12 = new javax.swing.JRadioButton();
        message = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Blood Group");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 107, 200, -1));

        Bloodbox.setBackground(new java.awt.Color(51, 51, 51));
        Bloodbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bloodbox.setForeground(new java.awt.Color(255, 255, 255));
        Bloodbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(Bloodbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 107, 162, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Q: Have you ever donated blood before?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 350, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Q: Are you atleast 17 years old? ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 147, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Q: Is your weight atleast  110 pounds?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Q: Are you taing any medicines?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 340, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Q: Have you been diagoned with anything serious issue for 6 months or so? ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Q: Is you blood pressure, tempertaure and pulse is fine?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 92, 33));

        submitbutton.setBackground(new java.awt.Color(51, 51, 51));
        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitbutton.setForeground(new java.awt.Color(255, 255, 255));
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(submitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 130, 33));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blood Bank");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, -1));

        RadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(RadioButton1);
        RadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton1.setText("Yes, my age is above 17 years");
        RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(RadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        RadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(RadioButton2);
        RadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton2.setText("No, i am under 17");
        jPanel1.add(RadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        RadioButton3.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(RadioButton3);
        RadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton3.setText("Yes");
        jPanel1.add(RadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        RadioButton4.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(RadioButton4);
        RadioButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton4.setText("No");
        jPanel1.add(RadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        RadioButton5.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup3.add(RadioButton5);
        RadioButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton5.setText("Yes");
        jPanel1.add(RadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        RadioButton6.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup3.add(RadioButton6);
        RadioButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton6.setText("No");
        jPanel1.add(RadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        RadioButton7.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup4.add(RadioButton7);
        RadioButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton7.setText("Yes");
        jPanel1.add(RadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        RadioButton8.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup4.add(RadioButton8);
        RadioButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton8.setText("No");
        jPanel1.add(RadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        RadioButton10.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup5.add(RadioButton10);
        RadioButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton10.setText("No");
        jPanel1.add(RadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        RadioButton11.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup6.add(RadioButton11);
        RadioButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton11.setText("Yes");
        jPanel1.add(RadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        RadioButton9.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup5.add(RadioButton9);
        RadioButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton9.setText("Yes");
        jPanel1.add(RadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        RadioButton12.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup6.add(RadioButton12);
        RadioButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        RadioButton12.setText("No");
        jPanel1.add(RadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 593, 610, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\92333\\Desktop\\bacteria-1832824_1280.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new BloodBank(this.patient).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
    
       if(RadioButton2.isSelected() || RadioButton4.isSelected() || RadioButton7.isSelected() || RadioButton9.isSelected()  ||  RadioButton12.isSelected())
       {
         message.setText("Sorry! You are not eligible to donate blood");   
       
       }
       else 
       {
         JOptionPane.showMessageDialog(this,"You can donate blood");  
          message.setText("");
       }
       
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonateBlood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonateBlood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Bloodbox;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton10;
    private javax.swing.JRadioButton RadioButton11;
    private javax.swing.JRadioButton RadioButton12;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JRadioButton RadioButton4;
    private javax.swing.JRadioButton RadioButton5;
    private javax.swing.JRadioButton RadioButton6;
    private javax.swing.JRadioButton RadioButton7;
    private javax.swing.JRadioButton RadioButton8;
    private javax.swing.JRadioButton RadioButton9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel message;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}
