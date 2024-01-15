/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libman;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
public class userreturn extends javax.swing.JFrame {


    public userreturn() {
        initComponents();
    }
ResultSet rs;

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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        idate = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        ddate = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        retstatus = new javax.swing.JCheckBox();
        xxx = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        butsea = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

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
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\reader.png")); // NOI18N
        jToggleButton2.setText("STATISTIC");
        jToggleButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(26, 26, 26))
            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1090));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("RETURN BOOK  DETAILS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 30));

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("BOOK ID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, -1));

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ISSUE DATE");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 130, -1));

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DUE DATE");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 130, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("RETURN BOOK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("READER ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, -1));

        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });
        jPanel3.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 190, 40));

        idate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idateActionPerformed(evt);
            }
        });
        jPanel3.add(idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 220, 40));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 200, 100, 40));

        ddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddateActionPerformed(evt);
            }
        });
        jPanel3.add(ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 220, 40));

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 210, 40));

        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });
        jPanel3.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 40));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/icons8-search-24.png"))); // NOI18N
        search.setText("jLabel5");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 30, -1));

        retstatus.setForeground(new java.awt.Color(0, 0, 0));
        retstatus.setText("RETURN STATUS");
        retstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retstatusActionPerformed(evt);
            }
        });
        jPanel3.add(retstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        xxx.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        xxx.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(xxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, 30));

        jLabel17.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("STATUS");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 130, 30));

        butsea.setText("search");
        butsea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butseaMouseClicked(evt);
            }
        });
        jPanel3.add(butsea, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 510, 560));

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

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "READERID", "BOOKPRE", "BOOKID", "TYPE", "ISSUE", "DUE"
            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 640, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1940, 1090));

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
 addstudent  stu=new addstudent();
stu.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
  adminhome add= new adminhome();
  add.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
      
        

     
        
       
      
        
        
     
                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String url = "jdbc:mysql://localhost:3306/lib";
        String username = "root";
        String password = "";
      
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String reader1 = user1.getText();
        String bookpre = pre.getText();
        String bookid= id.getText();
        
        String issue=idate.getText();
        String due=ddate.getText();
        String status=xxx.getText();
        String sql2="INSERT INTO returnbk (readerid,bookpre,bookid,issue,due,status) values (?,?,?,?,?,?)";
        
       
        try (Connection connection = DriverManager.getConnection(url, username, password);
                java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql2)) {

                // Set parameters for the prepared statement
                preparedStatement.setString(1, reader1);
                preparedStatement.setString(2, bookpre);
                preparedStatement.setString(3, bookid);
                preparedStatement.setString(4, issue);
                preparedStatement.setString(5,  due);
                preparedStatement.setString(6,  status);
                

                // Execute the insertion
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {

         
                         JOptionPane.showMessageDialog(this,"BOOK RETURNED SUCCESSFULLY!");
          
                
                    System.out.println("Data inserted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this,"BOOK NOT RETURNED ");
          
                    System.out.println("Failed to insert data.");
                }

            } catch (SQLException e) {
                System.err.println("Error connecting/inserting data: " + e.getMessage());
                e.printStackTrace();
            }

     
        
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
userreturn rb=new userreturn();
rb.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void idateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idateActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void ddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddateActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        userside i=new userside();
        i.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
    
        
        int i= jTable1.getSelectedRow();
 TableModel model=jTable1.getModel();
 user1.setText(model.getValueAt(i,0).toString());
 pre.setText(model.getValueAt(i,1).toString());
  id.setText(model.getValueAt(i,2).toString());
   idate.setText(model.getValueAt(i,4).toString());
    ddate.setText(model.getValueAt(i,5).toString());
         // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void retstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retstatusActionPerformed
    if(retstatus.isSelected()) 
    {
       xxx.setText("RETURNED");
    }
    else
    {
        xxx.setText(" NOT RET");
    }
    }//GEN-LAST:event_retstatusActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
userside u=new userside();;
u.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
finedetails fn=new finedetails();
fn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void butseaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butseaMouseClicked
 try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 String reader1 = user1.getText();
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
                      DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
                  
                      tblModel.addRow(tbData);
                  }
                        
                     con.close();   
            }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };   
            





// TODO add your handling code here:
    }//GEN-LAST:event_butseaMouseClicked
    
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
            java.util.logging.Logger.getLogger(userreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userreturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new userreturn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butsea;
    private javax.swing.JTextField ddate;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton logout;
    private javax.swing.JTextField pre;
    private javax.swing.JCheckBox retstatus;
    private javax.swing.JLabel search;
    private javax.swing.JTextField user1;
    private javax.swing.JLabel xxx;
    // End of variables declaration//GEN-END:variables

    private static class JTable1 {

        public JTable1() {
        }
    }
}
