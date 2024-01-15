package libman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author skhar
 */
public class admin_user extends javax.swing.JFrame {


    /**
     * Creates new form admin
     */
    public admin_user() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        useraccess = new javax.swing.JLabel();
        adminaccess = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.darkGray));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("HIELLO! WELCOME....");

        useraccess.setBackground(new java.awt.Color(255, 204, 153));
        useraccess.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        useraccess.setForeground(new java.awt.Color(0, 0, 0));
        useraccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/user.png"))); // NOI18N
        useraccess.setText("USER ACCESS");
        useraccess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.gray));
        useraccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        useraccess.setOpaque(true);
        useraccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraccessMouseClicked(evt);
            }
        });

        adminaccess.setBackground(new java.awt.Color(255, 204, 102));
        adminaccess.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        adminaccess.setForeground(new java.awt.Color(0, 0, 0));
        adminaccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/setting.png"))); // NOI18N
        adminaccess.setText("ADMIN ACCESS");
        adminaccess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.gray));
        adminaccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminaccess.setOpaque(true);
        adminaccess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminaccessMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 0));
        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lib.png")); // NOI18N
        jLabel7.setText("Readers Retreat");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(useraccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminaccess, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel8)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useraccess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(adminaccess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 510, 340));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LIBRARY MANAGEMENT ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("\"   Books Are Uniquely Portable Magic  !  \" ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lib.png")); // NOI18N
        jLabel1.setText("Readers Retreat");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useraccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraccessMouseClicked
       user u=new user();
       u.setVisible(true);
       admin_user au=new admin_user();
       
       au.dispose();
    }//GEN-LAST:event_useraccessMouseClicked

    private void adminaccessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminaccessMouseClicked
       admin add=new admin();
       add.setVisible(true);
       admin_user au=new admin_user();
       au.dispose();
      
               
    }//GEN-LAST:event_adminaccessMouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new admin_user().setVisible(true);
        });

    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminaccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel useraccess;
    // End of variables declaration//GEN-END:variables
}
