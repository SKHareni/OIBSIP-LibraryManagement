/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author skhar
 */
public class finedetails extends javax.swing.JFrame {

   
    public finedetails() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        logout = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        reader = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        readnm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btable = new javax.swing.JTable();
        FDdetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rtable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ftable = new javax.swing.JTable();
        BBdetails = new javax.swing.JButton();
        RBdetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\boook.png")); // NOI18N
        jToggleButton1.setText("ISSUE BOOK");
        jToggleButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\reader.png")); // NOI18N
        jToggleButton2.setText("STATISTIC");
        jToggleButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton4.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/return50.png"))); // NOI18N
        jToggleButton4.setText("RETURN BOOK");
        jToggleButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 102, 102));
        logout.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 0));
        logout.setText("LOGOUT");
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 0));
        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lib.png")); // NOI18N
        jLabel9.setText("READERS Retreat");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel9.setFocusable(false);
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1090));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("READER STATISTIC");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 30));

        reader.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        reader.setForeground(new java.awt.Color(0, 0, 0));
        reader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/reader.png"))); // NOI18N
        reader.setText("READER NAME");
        jPanel3.add(reader, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 260, -1));

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("READER ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 230, 40));

        readnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/icons8-search-24.png"))); // NOI18N
        readnm.setText("jLabel1");
        readnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readnmMouseClicked(evt);
            }
        });
        jPanel3.add(readnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 30, -1));

        btable.setBackground(new java.awt.Color(204, 255, 204));
        btable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "READERID", "BOOKPRE", "BOOKID", "BOOK", "ISSUE", "DUE", "STATUS"
            }
        ));
        btable.setEditingColumn(0);
        btable.setSelectionBackground(new java.awt.Color(102, 255, 255));
        btable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(btable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 640, 150));

        FDdetails.setBackground(new java.awt.Color(153, 255, 255));
        FDdetails.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        FDdetails.setForeground(new java.awt.Color(0, 0, 0));
        FDdetails.setText("FINE DETAILS");
        FDdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FDdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDdetailsActionPerformed(evt);
            }
        });
        jPanel3.add(FDdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 220, 50));

        rtable.setBackground(new java.awt.Color(255, 204, 204));
        rtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        rtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "READERID", "BOOKPRE", "BOOKID", "ISSUE", "DUE", "STATUS"
            }
        ));
        rtable.setEditingColumn(0);
        rtable.setSelectionBackground(new java.awt.Color(102, 255, 255));
        rtable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(rtable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 640, 150));

        ftable.setBackground(new java.awt.Color(204, 255, 255));
        ftable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ftable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "READERID", "BOOKPRE", "BOOKID", "DEFECT", "DUE", "RETURNED", "FINE"
            }
        ));
        ftable.setEditingColumn(0);
        ftable.setSelectionBackground(new java.awt.Color(102, 255, 255));
        ftable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(ftable);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 640, 150));

        BBdetails.setBackground(new java.awt.Color(153, 255, 153));
        BBdetails.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        BBdetails.setForeground(new java.awt.Color(0, 0, 0));
        BBdetails.setText("BORROWED BOOKS");
        BBdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBdetailsActionPerformed(evt);
            }
        });
        jPanel3.add(BBdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, 50));

        RBdetails.setBackground(new java.awt.Color(255, 153, 153));
        RBdetails.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        RBdetails.setForeground(new java.awt.Color(0, 0, 0));
        RBdetails.setText("RETURNED BOOKS");
        RBdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RBdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBdetailsActionPerformed(evt);
            }
        });
        jPanel3.add(RBdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 220, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 1200, 620));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LIBRARY MANAGEMENT ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("\"   Books Are Uniquely Portable Magic  !  \" ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 1090));

        jButton2.setText("jButton2");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 460, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
  admin_user add= new admin_user();
  add.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
returnbook rb=new returnbook();
rb.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void readnmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readnmMouseClicked
   try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 String reader1 = user.getText();
                 String sql= "select username from usereg where readerid= '" +reader1+"' ";
                 java.sql.ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    String username = rs.getString("username");

                    // Update the label with the retrieved username
                    reader.setText( username);
                } else {
                    JOptionPane.showMessageDialog(this, "User not found in the database", "Error", JOptionPane.ERROR_MESSAGE);
                }
                        
                     con.close();   
            }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };// TODO add your handling code here:
       
       
        

    }//GEN-LAST:event_readnmMouseClicked

    private void FDdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDdetailsActionPerformed
         try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 String reader1 = user.getText();
                 String sql= "select * from fine where readerid= '" +reader1+"' ";
                 java.sql.ResultSet rs = st.executeQuery(sql);
                  while(rs.next())
                  {
                      String reader =rs.getString("readerid");
                      String degree =rs.getString("bookpre");
                      String course =rs.getString("bookid");
                      String type =rs.getString("defect");
                      String phone =rs.getString("due");
                      String email =rs.getString("returnd");
                      String fine =rs.getString("fineamt");
                      
                      
                      String tbData[]={reader,degree,course,type,phone,email,fine};
                      DefaultTableModel tblModel= (DefaultTableModel)ftable.getModel();
                  
                      tblModel.addRow(tbData);
                  }
                        
                     con.close();   
            }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };// TODO add your handling code here:
    }//GEN-LAST:event_FDdetailsActionPerformed

    private void RBdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBdetailsActionPerformed
 try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 String reader1 = user.getText();
                 String sql= "select * from returnbk where readerid= '" +reader1+"' ";
                 java.sql.ResultSet rs = st.executeQuery(sql);
                  while(rs.next())
                  {
                      String reader =rs.getString("readerid");
                      String degree =rs.getString("bookpre");
                      String course =rs.getString("bookid");
                      String type =rs.getString("issue");
                      String phone =rs.getString("due");
                      String email =rs.getString("status");
                      
                      
                      String tbData[]={reader,degree,course,type,phone,email};
                      DefaultTableModel tblModel= (DefaultTableModel)rtable.getModel();
                  
                      tblModel.addRow(tbData);
                  }
                        
                     con.close();   
            }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };        // TODO add your handling code here:
    }//GEN-LAST:event_RBdetailsActionPerformed

    private void BBdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBdetailsActionPerformed
       try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 String reader1 = user.getText();
                 String sql= "select * from issue where readerid= '" +reader1+"' ";
                 java.sql.ResultSet rs = st.executeQuery(sql);
                  while(rs.next())
                  {
                      String reader =rs.getString("readerid");
                      String degree =rs.getString("bookpre");
                      String course =rs.getString("boookid");
                      String book=rs.getString("bname");
                      String type =rs.getString("issue");
                      String phone =rs.getString("due");
                      String email =rs.getString("access");
                      
                      
                      String tbData[]={reader,degree,course,book,type,phone,email};
                      DefaultTableModel tblModel= (DefaultTableModel)btable.getModel();
                  
                      tblModel.addRow(tbData);
                  }
                        
                     con.close();   
            }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };     // TODO add your handling code here:
    }//GEN-LAST:event_BBdetailsActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
userside s=new userside();
s.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
userreturn ur=new userreturn();
ur.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4MouseClicked

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
            java.util.logging.Logger.getLogger(finedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBdetails;
    private javax.swing.JButton FDdetails;
    private javax.swing.JButton RBdetails;
    private javax.swing.JTable btable;
    private javax.swing.JTable ftable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton logout;
    private javax.swing.JLabel reader;
    private javax.swing.JLabel readnm;
    private javax.swing.JTable rtable;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private static class rs1 {

        public rs1() {
        }
    }
}