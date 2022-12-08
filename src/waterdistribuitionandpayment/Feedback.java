/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterdistribuitionandpayment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form Feedback
     */
    public Feedback() {
        initComponents();
    }

    private JFrame frame;
    public Connection connection;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Show = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel01 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 75, 210));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 118, 25));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 75, 218));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thank you for providing us your feedback. ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, 480, -1));

        Show.setBackground(new java.awt.Color(0, 0, 0));
        Show.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 18)); // NOI18N
        Show.setForeground(new java.awt.Color(0, 102, 255));
        Show.setText("Check");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel1.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 100, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 630, 270, 29));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 75, 218));
        jLabel5.setText("Average Feedback You've Given");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 290, 33));

        Submit.setBackground(new java.awt.Color(0, 0, 0));
        Submit.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 102, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 270, 39));

        jTextField4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 16, 90));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 450, 58));

        jComboBox4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(102, 16, 90));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 121, 58));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 75, 218));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ratings of Price Rate of  Packages");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 350, 58));

        jTextField3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 16, 90));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 450, 58));

        jComboBox3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(102, 16, 90));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 124, 58));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 75, 218));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ratings of Delivery Efficiency");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 360, 58));

        jTextField2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 16, 90));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 450, 58));

        jComboBox2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(102, 16, 90));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 124, 58));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 75, 218));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ratings of  Payment Procedure");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 360, 58));

        jTextField1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 16, 90));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 450, 58));

        jComboBox1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 16, 90));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 124, 58));

        jLabel01.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel01.setForeground(new java.awt.Color(0, 75, 218));
        jLabel01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel01.setText("Employee Service");
        jPanel1.add(jLabel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 360, 58));

        jTextField6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 3, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 449, 58));

        jComboBox5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 2, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(102, 16, 90));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Package 1", "Package 2", "Package 3", "Package 8", "Package 9", "Package 10", "Package 11", "Package 12", "Package 13", "Package 14", "Package 15", "Package 17", "Package 18", "Package 19", "Package 20", "Package 21", "Package 22" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 124, 58));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 75, 210));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Select Package");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 360, 51));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Feedback Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 20, 351, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String SelectedValue1 = jComboBox1.getSelectedItem().toString();
        jTextField1.setText(SelectedValue1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String SelectedValue2 = jComboBox2.getSelectedItem().toString();
        jTextField2.setText(SelectedValue2);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String SelectedValue3 = jComboBox3.getSelectedItem().toString();
        jTextField3.setText(SelectedValue3);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        String SelectedValue4 = jComboBox4.getSelectedItem().toString();
        jTextField4.setText(SelectedValue4);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
           String SelectedValue5 = jComboBox5.getSelectedItem().toString();
           jTextField6.setText(SelectedValue5);        
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 Connection connection = DriverManager.getConnection(
                         "jdbc:sqlserver://localhost:1433;databaseName=Water;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT (Pay+Deliver+PriceRate+EmpService) as 'Average' FROM Feedback ");
            
            while (resultSet.next()) {
                 String Average = String.valueOf(resultSet.getFloat("Average")/4);
                 jTextField5.setText(Average);
                 System.out.println(""+Average);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ShowActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String description = jComboBox5.getSelectedItem().toString();
        String  pay = jComboBox2.getSelectedItem().toString();
        String deliver = jComboBox3.getSelectedItem().toString();
        String pricerate = jComboBox4.getSelectedItem().toString();
        String empservice = jComboBox1.getSelectedItem().toString();
      
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Water;selectMethod=cursor", "sa", "123456");
            
                PreparedStatement st;
                String query="INSERT INTO Feedback VALUES ('"+description+"',"+pay+","+deliver+",'"+pricerate+"','"+empservice+"')";
                Statement statement = connection.createStatement();
                ResultSet rs=statement.getConnection().prepareStatement(query).executeQuery();
                
                 connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        int count=0;
        double avg=0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Water;selectMethod=cursor", "sa", "123456");
            
                PreparedStatement st;
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT (Pay+Deliver+PriceRate+EmpService) as 'Average' FROM Feedback FULL JOIN Packages ON Feedback.Description=Packages.Description WHERE Feedback.Description='"+description+"'");
                
                
                while(resultSet.next()){
                    avg=avg+Double.parseDouble(resultSet.getString("Average"));
                    count++;
                }
                avg=avg/(4*count);
                 connection.close();
        } catch (Exception e) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, e);
        }
        
        try
          {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Water;selectMethod=cursor", "sa", "123456");
            String query = "update Packages set Feedback="+avg+" where Description = '"+description+"'";
           
            PreparedStatement pst = connection.prepareStatement(query);
            pst.executeUpdate();
            } catch(Exception e){
              JOptionPane.showMessageDialog (this, e.getMessage());	
          }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UserDashboard ud=new UserDashboard();
        ud.show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
