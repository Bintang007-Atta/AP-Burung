/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_app1;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author royan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gambar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbcreateacc = new javax.swing.JLabel();
        lbuname = new javax.swing.JLabel();
        lbpw = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btcreate1 = new javax.swing.JButton();
        logoburung1 = new javax.swing.JLabel();
        tfuname = new javax.swing.JTextField();
        tfpw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 246, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 730));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_app1/images/toko.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbcreateacc.setFont(new java.awt.Font("Montserrat SemiBold", 0, 30)); // NOI18N
        lbcreateacc.setForeground(new java.awt.Color(0, 140, 255));
        lbcreateacc.setText("Welcome Back");

        lbuname.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        lbuname.setText("Username");

        lbpw.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        lbpw.setText("Password");

        btnlogin.setBackground(new java.awt.Color(0, 140, 255));
        btnlogin.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login Now");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btcreate1.setBackground(new java.awt.Color(204, 204, 204));
        btcreate1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btcreate1.setForeground(new java.awt.Color(0, 140, 255));
        btcreate1.setText("Create Account");
        btcreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcreate1ActionPerformed(evt);
            }
        });

        logoburung1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_app1/images/icon burung.png"))); // NOI18N

        tfuname.setBackground(new java.awt.Color(206, 229, 242));
        tfuname.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        tfuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfunameActionPerformed(evt);
            }
        });

        tfpw.setBackground(new java.awt.Color(206, 229, 242));
        tfpw.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        tfpw.setPreferredSize(new java.awt.Dimension(7, 31));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(lbcreateacc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfuname, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addComponent(lbpw)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btcreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfpw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbuname))
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(logoburung1)
                    .addGap(229, 229, 229)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lbcreateacc)
                .addGap(47, 47, 47)
                .addComponent(lbuname)
                .addGap(18, 18, 18)
                .addComponent(tfuname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lbpw)
                .addGap(18, 18, 18)
                .addComponent(tfpw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(logoburung1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(608, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(gambar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/ap1_bukuwarung?useSSL=false";
        String user = "root";
        String pass = "";

        try {
            // open connection
            Class.forName("com.mysql.cj.jdbc.Driver"); // untuk connector versi 8
            Connection conn = DriverManager.getConnection(url, user, pass);

            String username = tfpw.getText();
            String password = tfpw.getText();

            Statement st = conn.createStatement();
            String sql = "select * from user where username='" + username + "' and password='" + password + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                if (tfuname.getText().equals(rs.getString("username")) && tfpw.getText().equals(rs.getString("password"))) {
                    dispose();
                    new Main().setVisible(true);
                } else {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Maaf, username atau password invalid!");
                tfpw.setText("");

            }

            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btcreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcreate1ActionPerformed
        // TODO add your handling code here:
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_btcreate1ActionPerformed

    private void tfunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfunameActionPerformed

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
    private javax.swing.JButton btcreate1;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel gambar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbcreateacc;
    private javax.swing.JLabel lbpw;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel logoburung1;
    private javax.swing.JPasswordField tfpw;
    private javax.swing.JTextField tfuname;
    // End of variables declaration//GEN-END:variables
}
