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
public class admin extends javax.swing.JFrame {


    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        show = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logoback = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.darkGray));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/setting.png"))); // NOI18N
        jLabel8.setText("ADMIN LOGIN");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/setting.png"))); // NOI18N
        jLabel5.setText("ADMIN");

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/lock.png"))); // NOI18N
        jLabel6.setText("PASSWORD");

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("CANCEL");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        login.setBackground(new java.awt.Color(204, 255, 204));
        login.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        show.setForeground(new java.awt.Color(0, 0, 0));
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/eye.png"))); // NOI18N
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel8)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(show))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(login))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 540, 350));

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

        logoback.setBackground(new java.awt.Color(102, 102, 0));
        logoback.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        logoback.setForeground(new java.awt.Color(0, 0, 0));
        logoback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/lib.png"))); // NOI18N
        logoback.setText("READERS Retreat");
        logoback.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logoback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoback.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        logoback.setFocusable(false);
        logoback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoback.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logoback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logobackMouseClicked(evt);
            }
        });
        getContentPane().add(logoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
       
        
    String DB_URL = "jdbc:mysql://localhost:3306/lib";
    String DB_USER = "root";
    String DB_PASSWORD = "";

    String adminname=jTextField1.getText();
    char[] passwordChars = jPasswordField1.getPassword();
    String adminpass = new String(passwordChars);
    String query = "SELECT * FROM admin WHERE adminname=? AND adminpass=?";
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) 
    {
            
                preparedStatement.setString(1, adminname);
                preparedStatement.setString(2, adminpass); // In a real application, you should hash the password before comparing
    }
    catch (SQLException e)
    {
            e.printStackTrace();
     }
        
    if(adminname.isEmpty() || adminpass.isEmpty())
    {
      JOptionPane.showMessageDialog(null," FILL MISSING FIELD");
    }
    else if(adminname.equals("admin")  && adminpass.equals("admin123")) //username and password checking
    {
      JOptionPane.showMessageDialog(null," ADMIN LOGGED IN >>>>");
      
      adminhome addh= new adminhome(); //moving to the next page adminhomepage
      addh.setVisible(true);
      admin a= new admin();
      a.dispose();  
    }
    else
    {
      JOptionPane.showMessageDialog(null," UNAUTHORIZED ACCESS >>>>");
        
    }
    
    }//GEN-LAST:event_loginMouseClicked
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
    char[] passwordChars = jPasswordField1.getPassword();
    String adminpass = new String(passwordChars);
    jPasswordField1.setEchoChar(show.isSelected() ? '\0' : '*');
              
    }//GEN-LAST:event_showActionPerformed

    private void logobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logobackMouseClicked
      admin_user au=new admin_user();
      au.setVisible(true);
      admin admin=new admin();
      admin.dispose();
    }//GEN-LAST:event_logobackMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
    jTextField1.setText("");
    jPasswordField1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new admin().setVisible(true);
        });

    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    private javax.swing.JLabel logoback;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
