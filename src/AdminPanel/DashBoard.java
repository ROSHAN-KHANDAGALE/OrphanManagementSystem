package AdminPanel;

import UserInterface.MainMenuInterface;
import DatabaseDetails.AdopteeDView;
import DatabaseDetails.OrphanDView;
import javax.swing.JOptionPane;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MianPanel = new javax.swing.JPanel();
        OrphanRegisteryB = new javax.swing.JButton();
        AdopteeRegisteryB = new javax.swing.JButton();
        OrphanDetailsB = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        LogoutB = new javax.swing.JButton();
        AdopteDetails = new javax.swing.JButton();
        OrphanRegisteryB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MianPanel.setBackground(new java.awt.Color(0, 51, 51));
        MianPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRATORs PANEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        OrphanRegisteryB.setBackground(new java.awt.Color(0, 51, 51));
        OrphanRegisteryB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OrphanRegisteryB.setForeground(new java.awt.Color(255, 255, 255));
        OrphanRegisteryB.setText("New Orphan Registery");
        OrphanRegisteryB.setBorder(null);
        OrphanRegisteryB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrphanRegisteryBActionPerformed(evt);
            }
        });

        AdopteeRegisteryB.setBackground(new java.awt.Color(0, 51, 51));
        AdopteeRegisteryB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AdopteeRegisteryB.setForeground(new java.awt.Color(255, 255, 255));
        AdopteeRegisteryB.setText("Adoptee Registery");
        AdopteeRegisteryB.setBorder(null);
        AdopteeRegisteryB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdopteeRegisteryBActionPerformed(evt);
            }
        });

        OrphanDetailsB.setBackground(new java.awt.Color(0, 51, 51));
        OrphanDetailsB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OrphanDetailsB.setForeground(new java.awt.Color(255, 255, 255));
        OrphanDetailsB.setText("Available Orphan Details");
        OrphanDetailsB.setBorder(null);
        OrphanDetailsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrphanDetailsBActionPerformed(evt);
            }
        });

        EXITB.setBackground(new java.awt.Color(153, 153, 153));
        EXITB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EXITB.setForeground(new java.awt.Color(255, 102, 0));
        EXITB.setText("BACK");
        EXITB.setBorder(null);
        EXITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBActionPerformed(evt);
            }
        });

        LogoutB.setBackground(new java.awt.Color(0, 51, 51));
        LogoutB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LogoutB.setForeground(new java.awt.Color(255, 204, 0));
        LogoutB.setText("LOGOUT");
        LogoutB.setBorder(null);
        LogoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBActionPerformed(evt);
            }
        });

        AdopteDetails.setBackground(new java.awt.Color(0, 51, 51));
        AdopteDetails.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AdopteDetails.setForeground(new java.awt.Color(255, 255, 255));
        AdopteDetails.setText("Adoptee Details");
        AdopteDetails.setBorder(null);
        AdopteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdopteDetailsActionPerformed(evt);
            }
        });

        OrphanRegisteryB1.setBackground(new java.awt.Color(255, 153, 51));
        OrphanRegisteryB1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OrphanRegisteryB1.setForeground(new java.awt.Color(255, 255, 255));
        OrphanRegisteryB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/home.png"))); // NOI18N
        OrphanRegisteryB1.setText("DASHBOARD");
        OrphanRegisteryB1.setBorder(null);
        OrphanRegisteryB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrphanRegisteryB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MianPanelLayout = new javax.swing.GroupLayout(MianPanel);
        MianPanel.setLayout(MianPanelLayout);
        MianPanelLayout.setHorizontalGroup(
            MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MianPanelLayout.createSequentialGroup()
                .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MianPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrphanDetailsB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdopteeRegisteryB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrphanRegisteryB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdopteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MianPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OrphanRegisteryB1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MianPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXITB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
        );
        MianPanelLayout.setVerticalGroup(
            MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MianPanelLayout.createSequentialGroup()
                .addComponent(OrphanRegisteryB1)
                .addGap(28, 28, 28)
                .addComponent(OrphanRegisteryB)
                .addGap(20, 20, 20)
                .addComponent(AdopteeRegisteryB)
                .addGap(19, 19, 19)
                .addComponent(OrphanDetailsB)
                .addGap(18, 18, 18)
                .addComponent(AdopteDetails)
                .addGap(49, 49, 49)
                .addComponent(LogoutB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EXITB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OrphanRegisteryBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrphanRegisteryBActionPerformed
        OrphanRegister res = new OrphanRegister();
        res.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrphanRegisteryBActionPerformed

    private void AdopteeRegisteryBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdopteeRegisteryBActionPerformed
        AdopteeRegistery ARes = new AdopteeRegistery();
        ARes.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdopteeRegisteryBActionPerformed

    private void OrphanDetailsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrphanDetailsBActionPerformed
        OrphanDView OView = new OrphanDView();
        OView.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrphanDetailsBActionPerformed

    private void EXITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Exit?", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_EXITBActionPerformed

    private void LogoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBActionPerformed
         if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To LOGOUT?", "LOGOUT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            LoginForm log = new LoginForm();
            log.setVisible(true);
            dispose();
         }
    }//GEN-LAST:event_LogoutBActionPerformed

    private void AdopteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdopteDetailsActionPerformed
        AdopteeDView AView = new AdopteeDView();
        AView.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdopteDetailsActionPerformed

    private void OrphanRegisteryB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrphanRegisteryB1ActionPerformed
        MainMenuInterface res = new MainMenuInterface();
        res.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrphanRegisteryB1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new DashBoard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdopteDetails;
    private javax.swing.JButton AdopteeRegisteryB;
    private javax.swing.JButton EXITB;
    private javax.swing.JButton LogoutB;
    private javax.swing.JPanel MianPanel;
    private javax.swing.JButton OrphanDetailsB;
    private javax.swing.JButton OrphanRegisteryB;
    private javax.swing.JButton OrphanRegisteryB1;
    // End of variables declaration//GEN-END:variables
}
