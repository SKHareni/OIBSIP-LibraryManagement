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
public class issuebook extends javax.swing.JFrame {

    
    public issuebook() {
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
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        logout = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        fine = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        issued = new com.toedter.calendar.JDateChooser();
        dued = new com.toedter.calendar.JDateChooser();
        deg = new javax.swing.JComboBox<>();
        cor = new javax.swing.JComboBox<>();
        bookname = new javax.swing.JTextField();
        searchbkname = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fetch1 = new javax.swing.JButton();
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

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\reader.png")); // NOI18N
        jToggleButton2.setText("ADD READER");
        jToggleButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton3.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton3.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\stack.png")); // NOI18N
        jToggleButton3.setText("ADD BOOK");
        jToggleButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
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

        fine.setBackground(new java.awt.Color(255, 255, 153));
        fine.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        fine.setForeground(new java.awt.Color(0, 0, 0));
        fine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/administrative-fine (1).png"))); // NOI18N
        fine.setText("FINE DETAILS");
        fine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        fine.setOpaque(true);
        fine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fineMouseClicked(evt);
            }
        });
        fine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fine, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 1090));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("BOOK ISSUE DETAILS");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 30));

        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("BOOK ID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, -1));

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ISSUE DATE");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, -1));

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DUE DATE");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 130, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ISSUE BOOK");
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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("READER ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 150, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 220, 40));

        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("BOOKNAME");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, -1));
        jPanel3.add(issued, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 220, 30));
        jPanel3.add(dued, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 220, 30));

        deg.setBackground(new java.awt.Color(51, 51, 51));
        deg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENG", "NOVEL", "ENGG", "DES", "MAT", "SCI", "COM", "OTHERS", " " }));
        deg.setToolTipText("");
        deg.setBorder(null);
        jPanel3.add(deg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 30));

        cor.setBackground(new java.awt.Color(51, 51, 51));
        cor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200" }));
        cor.setToolTipText("");
        cor.setBorder(null);
        jPanel3.add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 90, 30));

        bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booknameActionPerformed(evt);
            }
        });
        jPanel3.add(bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 220, 40));

        searchbkname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libman/icons8-search-24.png"))); // NOI18N
        searchbkname.setText("jButton3");
        searchbkname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbknameMouseClicked(evt);
            }
        });
        jPanel3.add(searchbkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 40, -1));

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
                "BOOK", "BOOKPRE", "BOOKID", "CATEGORY", "AUTHOR", "YEAR"
            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 640, 310));

        fetch1.setBackground(new java.awt.Color(153, 255, 255));
        fetch1.setForeground(new java.awt.Color(0, 0, 0));
        fetch1.setText("FETCH");
        fetch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fetch1MouseClicked(evt);
            }
        });
        jPanel1.add(fetch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 120, -1, -1));

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
 addstudent  stu=new addstudent();
stu.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
  adminhome add= new adminhome();
  add.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String url = "jdbc:mysql://localhost:3306/lib";
        String username = "root";
        String password = "";
      
       SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String reader1 = user.getText();
        String bookpre = deg.getSelectedItem().toString();
        String bookid= cor.getSelectedItem().toString();
       String type = bookname.getText();
        String issue2=dFormat.format(issued.getDate());
       String due2=dFormat.format(dued.getDate());
     
       
          
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                   
                 var st = con.createStatement();   
                 String sql="select bookpre,bookid from book where bookpre='"+bookpre+"' and bookid='"+bookid+"'";
              java.sql.ResultSet rs = st.executeQuery(sql);   
                
                 String sql1= "select * from register where readerid='"+reader1+"'";
                 java.sql.ResultSet rs1=st.executeQuery(sql1);
                 java.util.Date issue=issued.getDate();
                 java.util.Date due=dued.getDate();
        
                 long issue1=(issue.getTime()/(1000*60*60*24));
                 long due1=(due.getTime()/(1000*60*60*24));
                 if(issue1 > due1)
                {
                     JOptionPane.showMessageDialog(rootPane, "ENTER A VALID DUE DATE !", "Error", HEIGHT);
                }
                
               else if(!rs1.next())
                 {
                           JOptionPane.showMessageDialog(this,"READER-ID NOT FOUND!");      
                 }
                 else
                 {
                     
          
        String sql2="INSERT INTO issue (readerid,bookpre,boookid,bname,issue,due,access) values (?,?,?,?,?,?,?)";
                
        try (Connection connection = DriverManager.getConnection(url, username, password);
                java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql2)) {
               
                String access="ADMIN";
                // Set parameters for the prepared statement
                preparedStatement.setString(1, reader1);
                preparedStatement.setString(2, bookpre);
                preparedStatement.setString(3, bookid);
                preparedStatement.setString(4, type);
                preparedStatement.setString(5, issue2);
                preparedStatement.setString(6,  due2);
                preparedStatement.setString(7,  access);
                

                // Execute the insertion
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data.");
                }

            } catch (SQLException e) {
                System.err.println("Error connecting/inserting data: " + e.getMessage());
                e.printStackTrace();
            }
                 JOptionPane.showMessageDialog(this,"BOOK ISSUED SUCCESSFULLY!");
                 }
                     
           
                 
       }
       catch(Exception e)
       {
System.err.println("Error connecting/inserting data: " + e.getMessage());
                e.printStackTrace();
       }
                   
                         
       

     
        
       
      
        
        
     
                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
 addbook bk= new addbook();
  bk.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
returnbook rb=new returnbook();
rb.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void fetch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fetch1MouseClicked
      
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 
                 String sql="select * from book ";
                 java.sql.ResultSet rs = st.executeQuery(sql);
                 while(rs.next())
                  {
                      String reader =rs.getString("bname");
                      String degree =rs.getString("bookpre");
                      String course =rs.getString("bookid");
                      String type =rs.getString("categ");
                      String phone =rs.getString("author");
                      String email =rs.getString("year");
                      
                      
                      String tbData[]={reader,degree,course,type,phone,email};
                      DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
                  
                      tblModel.addRow(tbData);
                  }
                 
                        
                     con.close();   
        }
            catch (Exception e){
                
                System.out.println(e.getMessage());
            };
    }//GEN-LAST:event_fetch1MouseClicked

    private void fineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fineMouseClicked
    finedetails fd=new finedetails();
    fd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_fineMouseClicked

    private void fineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fineActionPerformed

    private void booknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booknameActionPerformed

    private void searchbknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbknameMouseClicked
        String url = "jdbc:mysql://localhost:3306/lib";
        String username = "root";
        String password = "";
       
        String bookpre = deg.getSelectedItem().toString();
        String bookid= cor.getSelectedItem().toString();
        String sql="select bname from book where bookpre='"+bookpre+"' and bookid='"+bookid+"'";
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","");
                        
                 var st = con.createStatement();   
                 
                 
                 java.sql.ResultSet rs = st.executeQuery(sql);
           if(rs.next()){
                     String type=rs.getString("bname");
                     bookname.setText(type);
                     
                     JOptionPane.showMessageDialog(rootPane, "BOOK FOUND");
                     }
                 
                 else{
                         
                 
                     JOptionPane.showMessageDialog(rootPane, "BOOK NOT FOUND", "Error", HEIGHT);
                 
                     }  
        }
        catch(Exception e){
                
                System.out.println(e.getMessage());
            };
           
             int i= jTable1.getSelectedRow();
 TableModel model=jTable1.getModel();
 bookname.setText(model.getValueAt(i,0).toString());
 deg.setSelectedItem(model.getValueAt(i,1).toString());
  cor.setSelectedItem(model.getValueAt(i,2).toString());
                    
    }//GEN-LAST:event_searchbknameMouseClicked

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
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issuebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookname;
    private javax.swing.JComboBox<String> cor;
    private javax.swing.JComboBox<String> deg;
    private com.toedter.calendar.JDateChooser dued;
    private javax.swing.JButton fetch1;
    private javax.swing.JToggleButton fine;
    private com.toedter.calendar.JDateChooser issued;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton logout;
    private javax.swing.JButton searchbkname;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private static class rs1 {

        public rs1() {
        }
    }
}
