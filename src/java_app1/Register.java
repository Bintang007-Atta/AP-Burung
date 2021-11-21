package java_app1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author royan
 */
public class Register extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stm = DB.stm;
    }
    private void clearregister(){
        tfuname.setText("");
        tfpw.setText("");
        tfstore.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gambar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbcreateacc = new javax.swing.JLabel();
        logoburung = new javax.swing.JLabel();
        lbstore = new javax.swing.JLabel();
        tfstore = new javax.swing.JTextField();
        lbuname = new javax.swing.JLabel();
        tfuname = new javax.swing.JTextField();
        lbpw = new javax.swing.JLabel();
        btcreate = new javax.swing.JButton();
        tfpw = new javax.swing.JPasswordField();
        btpindahmenulogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1380, 730));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_app1/images/toko.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(548, 822));

        lbcreateacc.setFont(new java.awt.Font("Montserrat SemiBold", 0, 30)); // NOI18N
        lbcreateacc.setForeground(new java.awt.Color(0, 140, 255));
        lbcreateacc.setText("Create Account");

        logoburung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_app1/images/icon burung.png"))); // NOI18N

        lbstore.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        lbstore.setText("Store's Name");

        tfstore.setBackground(new java.awt.Color(206, 229, 242));
        tfstore.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        tfstore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfstoreActionPerformed(evt);
            }
        });

        lbuname.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        lbuname.setText("Username");

        tfuname.setBackground(new java.awt.Color(206, 229, 242));
        tfuname.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        tfuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfunameActionPerformed(evt);
            }
        });

        lbpw.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        lbpw.setText("Password");

        btcreate.setBackground(new java.awt.Color(0, 140, 255));
        btcreate.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btcreate.setForeground(new java.awt.Color(255, 255, 255));
        btcreate.setText("Sign Up");
        btcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcreateActionPerformed(evt);
            }
        });

        tfpw.setBackground(new java.awt.Color(206, 229, 242));
        tfpw.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N

        btpindahmenulogin.setBackground(new java.awt.Color(0, 140, 255));
        btpindahmenulogin.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btpindahmenulogin.setForeground(new java.awt.Color(255, 255, 255));
        btpindahmenulogin.setText("Already Have Account?");
        btpindahmenulogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpindahmenuloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbuname)
                    .addComponent(lbpw)
                    .addComponent(lbstore)
                    .addComponent(btpindahmenulogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(btcreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfpw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addComponent(tfuname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfstore, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(logoburung))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lbcreateacc)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(logoburung, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcreateacc)
                .addGap(18, 18, 18)
                .addComponent(lbstore)
                .addGap(18, 18, 18)
                .addComponent(tfstore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbuname)
                .addGap(18, 18, 18)
                .addComponent(tfuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbpw)
                .addGap(18, 18, 18)
                .addComponent(tfpw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btcreate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btpindahmenulogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfunameActionPerformed

    private void tfstoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfstoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfstoreActionPerformed

    private void btcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcreateActionPerformed
        // TODO add your handling code here:
        String username = tfuname.getText();
        String password = tfpw.getText();
        String namatoko = tfstore.getText();
        if(!"".equals(username) & !"".equals(password) & !"".equals(namatoko)){
        try {
            stm.executeUpdate("INSERT INTO user VALUES('"+username+"', '"+password+"', '"+namatoko+"')");
            JOptionPane.showMessageDialog(null, "Data Berhasil Diinput");
            clearregister();
            
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Semua data harus diisi terlebih dahulu!");
        }
        
    }//GEN-LAST:event_btcreateActionPerformed

    private void btpindahmenuloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpindahmenuloginActionPerformed
        // TODO add your handling code here:
        Login menu = new Login();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpindahmenuloginActionPerformed

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
    private javax.swing.JButton btcreate;
    private javax.swing.JButton btpindahmenulogin;
    private javax.swing.JLabel gambar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbcreateacc;
    private javax.swing.JLabel lbpw;
    private javax.swing.JLabel lbstore;
    private javax.swing.JLabel lbuname;
    private javax.swing.JLabel logoburung;
    private javax.swing.JPasswordField tfpw;
    private javax.swing.JTextField tfstore;
    private javax.swing.JTextField tfuname;
    // End of variables declaration//GEN-END:variables
}
