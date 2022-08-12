
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
public class GUIRoomReserve extends javax.swing.JFrame {

    /**
     * Creates new form GUIRoomReserve
     */
    public GUIRoomReserve() {
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
        jLabel5 = new javax.swing.JLabel();
        NumOfStudentsV = new javax.swing.JTextField();
        jButton1Login = new javax.swing.JButton();
        RoomNumV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2ReserveRoom = new javax.swing.JButton();
        TimeV = new javax.swing.JTextField();
        IdV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DurationV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
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
        jLabel4.setText("Number Of Students :");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Duration:");

        NumOfStudentsV.setBackground(new java.awt.Color(153, 153, 153));
        NumOfStudentsV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumOfStudentsV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumOfStudentsVActionPerformed(evt);
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

        RoomNumV.setBackground(new java.awt.Color(153, 153, 153));
        RoomNumV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RoomNumV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumVActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Room Letter:");

        jButton2ReserveRoom.setBackground(new java.awt.Color(0, 153, 255));
        jButton2ReserveRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2ReserveRoom.setForeground(new java.awt.Color(255, 255, 255));
        jButton2ReserveRoom.setText("Reserve");
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

        TimeV.setBackground(new java.awt.Color(153, 153, 153));
        TimeV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TimeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeVActionPerformed(evt);
            }
        });

        IdV.setBackground(new java.awt.Color(153, 153, 153));
        IdV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IdV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdVActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID :");

        DurationV.setBackground(new java.awt.Color(153, 153, 153));
        DurationV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DurationV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DurationVActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Time :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1Login, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RoomNumV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumOfStudentsV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DurationV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton2ReserveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumOfStudentsV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RoomNumV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DurationV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2ReserveRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Reservation");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
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
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void NumOfStudentsVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumOfStudentsVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumOfStudentsVActionPerformed

    private void jButton1LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1LoginMouseClicked

    }//GEN-LAST:event_jButton1LoginMouseClicked

    private void jButton1LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1LoginActionPerformed

    private void jButton2ReserveRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2ReserveRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ReserveRoomMouseClicked

    private void jButton2ReserveRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ReserveRoomActionPerformed

          String id = IdV.getText();
           String roomLetter = RoomNumV.getText();
        String numOfStudents = NumOfStudentsV.getText();
        String Time =TimeV.getText();
        String Duration=DurationV.getText();
          int Id = Integer.parseInt(id);
          int du = Integer.parseInt(Duration);
           int nop = Integer.parseInt(numOfStudents);
       
         
          
Control.makeAReservation(new RoomReservation(Id,roomLetter,nop,Time,du));

    }//GEN-LAST:event_jButton2ReserveRoomActionPerformed

    private void TimeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeVActionPerformed

    private void jLabel2Min1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2Min1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2Min1MouseClicked

    private void jLabel3Close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3Close1MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel3Close1MouseClicked

    private void IdVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdVActionPerformed

    private void DurationVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DurationVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DurationVActionPerformed

    private void RoomNumVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNumVActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRoomReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRoomReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRoomReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRoomReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRoomReserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DurationV;
    private javax.swing.JTextField IdV;
    private javax.swing.JTextField NumOfStudentsV;
    private javax.swing.JTextField RoomNumV;
    private javax.swing.JTextField TimeV;
    private javax.swing.JButton jButton1Login;
    private javax.swing.JButton jButton2ReserveRoom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Min1;
    private javax.swing.JLabel jLabel3Close1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
