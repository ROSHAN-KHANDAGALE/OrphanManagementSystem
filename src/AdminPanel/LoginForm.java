package AdminPanel;

import UserInterface.MainMenuInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MainMenuB = new javax.swing.JButton();
        OrphanPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserL = new javax.swing.JLabel();
        PassL = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        LoginB = new javax.swing.JButton();
        RegisterB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ForgotPassB = new javax.swing.JButton();
        ExitB = new javax.swing.JButton();
        ShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenuB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MainMenuB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/home.png"))); // NOI18N
        MainMenuB.setText("Menu");
        MainMenuB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBActionPerformed(evt);
            }
        });
        MainPanel.add(MainMenuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        OrphanPanel.setBackground(new java.awt.Color(255, 255, 255));
        OrphanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORPHAN MANAGEMENT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        jLabel1.setText("ADMINs LOGIN");

        UserL.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        UserL.setText("Username");

        PassL.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        PassL.setText("Password");

        Username.setFont(new java.awt.Font("Goudy Old Style", 0, 18)); // NOI18N

        Pass.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N

        LoginB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LoginB.setText("LOGIN");
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        RegisterB.setBackground(new java.awt.Color(255, 255, 255));
        RegisterB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        RegisterB.setForeground(new java.awt.Color(0, 51, 255));
        RegisterB.setText("Register");
        RegisterB.setBorder(null);
        RegisterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("Didn't have Account?");

        ForgotPassB.setBackground(new java.awt.Color(255, 255, 255));
        ForgotPassB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ForgotPassB.setForeground(new java.awt.Color(255, 51, 51));
        ForgotPassB.setText("Forgot Password?");
        ForgotPassB.setBorder(null);
        ForgotPassB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPassBActionPerformed(evt);
            }
        });

        ExitB.setBackground(new java.awt.Color(255, 255, 255));
        ExitB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ExitB.setForeground(new java.awt.Color(255, 0, 0));
        ExitB.setText("EXIT");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });

        ShowPass.setBackground(new java.awt.Color(255, 255, 255));
        ShowPass.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        ShowPass.setText("Show Password");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrphanPanelLayout = new javax.swing.GroupLayout(OrphanPanel);
        OrphanPanel.setLayout(OrphanPanelLayout);
        OrphanPanelLayout.setHorizontalGroup(
            OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrphanPanelLayout.createSequentialGroup()
                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrphanPanelLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(ForgotPassB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitB))
                    .addGroup(OrphanPanelLayout.createSequentialGroup()
                        .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrphanPanelLayout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1))
                            .addGroup(OrphanPanelLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LoginB)
                                    .addComponent(jLabel4))
                                .addGap(4, 4, 4)
                                .addComponent(RegisterB))
                            .addGroup(OrphanPanelLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UserL)
                                    .addComponent(PassL))
                                .addGap(72, 72, 72)
                                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(OrphanPanelLayout.createSequentialGroup()
                                        .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ShowPass, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))))
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        OrphanPanelLayout.setVerticalGroup(
            OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrphanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OrphanPanelLayout.createSequentialGroup()
                        .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserL)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PassL))
                    .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ShowPass)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginB)
                .addGap(18, 18, 18)
                .addGroup(OrphanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(RegisterB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ForgotPassB)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrphanPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitB)
                .addContainerGap())
        );

        MainPanel.add(OrphanPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 650, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/orphan","root","Root@123");
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM Orphan.UserCredentials where Auser = ? and Password = ?");
            pst.setString(1, Username.getText());
            pst.setString(2, Pass.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane,"WELCOME "+Username.getText());
                DashBoard dash = new DashBoard();
                dash.setVisible(true);
                dispose();
            } else {
            JOptionPane.showMessageDialog(null,"WRONG USERNAME/ PASSWORD");
            }
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(rootPane, "INVALID USERNAME/ PASSWORD .....");
        }
    }//GEN-LAST:event_LoginBActionPerformed

    private void RegisterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBActionPerformed
        AdminRegister reg = new AdminRegister();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterBActionPerformed

    private void MainMenuBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBActionPerformed
        MainMenuInterface menu = new MainMenuInterface();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_MainMenuBActionPerformed

    private void ForgotPassBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPassBActionPerformed
        ForgotPass forgot = new ForgotPass();
        forgot.setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgotPassBActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Exit?", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitBActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
        if(ShowPass.isSelected()){
            Pass.setEchoChar((char)0);
        } else {
            Pass.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitB;
    private javax.swing.JButton ForgotPassB;
    private javax.swing.JButton LoginB;
    private javax.swing.JButton MainMenuB;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel OrphanPanel;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel PassL;
    private javax.swing.JButton RegisterB;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel UserL;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
