package libman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author skhar
 */
public class register extends javax.swing.JFrame {


    /**
     * Creates new form admin
     */
    public register() {
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
        phno = new javax.swing.JTextField();
        show = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passw = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        typee = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        eemail = new javax.swing.JTextField();
        bb = new javax.swing.JCheckBox();
        regno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.darkGray));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("USER REGISTRATION");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("E-MAIL");

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PASSWORD");

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("CANCEL");

        login.setBackground(new java.awt.Color(204, 255, 204));
        login.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("REGISTER");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });

        show.setForeground(new java.awt.Color(0, 0, 0));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PROFESSION");

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("USERNAME");

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("MOBILE");

        passw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwActionPerformed(evt);
            }
        });

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        typee.setBackground(new java.awt.Color(51, 51, 51));
        typee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STUDENT", "PROFESSOR", "SCHOLAR", "FACULTY", "PUBLIC", "ENGINEER" }));
        typee.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 2, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Already registered? Login here");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        eemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eemailActionPerformed(evt);
            }
        });

        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });

        regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(clear)
                        .addGap(79, 79, 79)
                        .addComponent(login)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(289, 289, 289)
                                .addComponent(show))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typee, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 27, Short.MAX_VALUE)))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(passw, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bb)
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typee, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(login))
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(417, Short.MAX_VALUE)
                    .addComponent(passw, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 540, 550));

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/lib.png"))); // NOI18N
        jLabel1.setText("READERS Retreat");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
       
     String url = "jdbc:mysql://localhost:3306/lib";
        String username = "root";
        String password = "";

        String username1 = uname.getText();
        String prof = typee.getSelectedItem().toString();
      
        String phone= phno.getText();
        String email= eemail.getText();
        String password1=passw.getText();
        String rid=regno.getText();
        if(username1.isEmpty() || prof.isEmpty() || phone.isEmpty() || email.isEmpty() || password1.isEmpty() )
        {
            JOptionPane.showMessageDialog(this,"WARNING! FILL ALL FIELDS!","ERROR",JOptionPane.ERROR_MESSAGE);
        }

        else{
            String PATTERN="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            Pattern patt=Pattern.compile(PATTERN);
            Matcher match=patt.matcher(eemail.getText());
            if(!match.matches())
            {
             JOptionPane.showMessageDialog(this,"CHECK EMAILID","ERROR",JOptionPane.ERROR_MESSAGE);   
                
            }
            else if(phone.length()>10)
            {
             JOptionPane.showMessageDialog(this,"CHECK PHONE NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);   
            }
            
         
            else{
            // SQL query for insertion
            String insertQuery = "INSERT INTO usereg (username,type,phone,email,password,readerid) VALUES (?,?,?, ?,?,?)";

            // Establish a database connection
            try (Connection connection = DriverManager.getConnection(url, username, password);
                java.sql.PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

                // Set parameters for the prepared statement
                preparedStatement.setString(1, username1);
                preparedStatement.setString(2, prof);
                preparedStatement.setString(3, phone);
                preparedStatement.setString(4,  email);
                 preparedStatement.setString(5,  password1);
                  preparedStatement.setString(6,  rid);
                

                // Execute the insertion
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null," USER REGISTERED !");
               
       
                    
                
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }

            } catch (SQLException e) {
                System.err.println("Error connecting/inserting data: " + e.getMessage());
                e.printStackTrace();
            }  }} 
    }//GEN-LAST:event_loginMouseClicked
    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnoActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_phnoActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
    char[] passwordChars = passw.getPassword();
    String adminpass = new String(passwordChars);
    passw.setEchoChar(show.isSelected() ? '\0' : '*');
              
    }//GEN-LAST:event_showActionPerformed

    private void passwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
   user u=new user();
   u.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    user u=new user();
    u.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void eemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eemailActionPerformed
  private void generateStudentID() {
        // Customize this method to generate a unique student ID
        
    }
  
    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
       if (bb.isSelected()) {
                    generateSerialNumber();
                } else {
                  regno.setText("--");
                }
    
    }//GEN-LAST:event_bbActionPerformed

    private void regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regnoActionPerformed
private void generateSerialNumber() {
    int serialNumberCounter = 500;
        int serialNumber = serialNumberCounter++;
        regno.setText("UR" + serialNumber);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new register().setVisible(true);
        });

    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bb;
    private javax.swing.JButton clear;
    private javax.swing.JTextField eemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passw;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField regno;
    private javax.swing.JCheckBox show;
    private javax.swing.JComboBox<String> typee;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
