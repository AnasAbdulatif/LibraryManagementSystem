/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author إبراهيم عبداللطيف
 */

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIRigester extends javax.swing.JFrame {

    /**
     * Creates new form GUIRigester
     */
    public GUIRigester() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        EmailV = new javax.swing.JTextField();
        jButton1Login = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2ReserveRoom = new javax.swing.JButton();
        UsernameV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PasswordV = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        PhoneV = new javax.swing.JTextField();
        AddressV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2Min1 = new javax.swing.JLabel();
        jLabel3Close1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail :");

        EmailV.setBackground(new java.awt.Color(153, 153, 153));
        EmailV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailVActionPerformed(evt);
            }
        });

        jButton1Login.setBackground(new java.awt.Color(255, 0, 51));
        jButton1Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Login.setText("Cancel");
        jButton1Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1LoginMouseClicked(evt);
            }
        });
        jButton1Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LoginActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");

        jButton2ReserveRoom.setBackground(new java.awt.Color(0, 153, 255));
        jButton2ReserveRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2ReserveRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButton2ReserveRoom.setText("Sign UP");
        jButton2ReserveRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2ReserveRoomMouseClicked(evt);
            }
        });
        jButton2ReserveRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ReserveRoomActionPerformed(evt);
            }
        });

        UsernameV.setBackground(new java.awt.Color(153, 153, 153));
        UsernameV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UsernameV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameVActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name:");

        PasswordV.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone :");

        PhoneV.setBackground(new java.awt.Color(153, 153, 153));
        PhoneV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneVActionPerformed(evt);
            }
        });

        AddressV.setBackground(new java.awt.Color(153, 153, 153));
        AddressV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressVActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addComponent(UsernameV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton1Login, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2ReserveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailV)
                            .addComponent(PhoneV, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(AddressV, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(PasswordV))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EmailV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(AddressV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2ReserveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rigester");

        jLabel2Min1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2Min1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2Min1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Min1.setText("-");
        jLabel2Min1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2Min1MouseClicked(evt);
            }
        });

        jLabel3Close1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3Close1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3Close1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3Close1.setText("X");
        jLabel3Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3Close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3Close1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2Min1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3Close1)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel2Min1)
                    .addComponent(jLabel3Close1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailVActionPerformed

    private void jButton1LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1LoginMouseClicked

    }//GEN-LAST:event_jButton1LoginMouseClicked

    private void jButton1LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1LoginActionPerformed

    private void jButton2ReserveRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2ReserveRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ReserveRoomMouseClicked

    private void jButton2ReserveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ReserveRoomActionPerformed

       char[] PasswordText = PasswordV.getPassword();
        String Password = new String(PasswordText);
        String Name = UsernameV.getText();
        String Email =EmailV.getText();
        String Address=AddressV.getText();
        String Phone=PhoneV.getText();
        Control.Rigester(new  Account( Password,  Name,  Email,  Address,  Phone));
    }//GEN-LAST:event_jButton2ReserveRoomActionPerformed

    private void UsernameVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameVActionPerformed

    private void jLabel2Min1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2Min1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2Min1MouseClicked

    private void jLabel3Close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3Close1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel3Close1MouseClicked

    private void PhoneVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneVActionPerformed

    private void AddressVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressVActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRigester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRigester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRigester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRigester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRigester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressV;
    private javax.swing.JTextField EmailV;
    private javax.swing.JPasswordField PasswordV;
    private javax.swing.JTextField PhoneV;
    private javax.swing.JTextField UsernameV;
    private javax.swing.JButton jButton1Login;
    private javax.swing.JButton jButton2ReserveRoom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Min1;
    private javax.swing.JLabel jLabel3Close1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}