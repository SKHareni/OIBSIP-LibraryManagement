package libman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException; 
/*s
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**s
 *
 * @author skhar
 */
public class welcome extends javax.swing.JFrame {
 

    /**
     * Creates new form admin
     */
    public welcome() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        loadvalue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pbar.setBackground(new java.awt.Color(255, 51, 51));
        pbar.setBorderPainted(false);
        pbar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        getContentPane().add(pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1570, 40));

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lib.png")); // NOI18N
        jLabel1.setText("APPLE books");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 90));

        loading.setBackground(new java.awt.Color(255, 255, 255));
        loading.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading....");
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 388, 55));

        loadvalue.setBackground(new java.awt.Color(255, 255, 255));
        loadvalue.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        loadvalue.setForeground(new java.awt.Color(255, 255, 255));
        loadvalue.setText("0%");
        getContentPane().add(loadvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 710, 60, 55));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Desk wallpaper\\lovebook1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1900, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InstantiationException, UnsupportedLookAndFeelException {
        
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
              if("Nimbus".equals(info.getName()))
              {
                  try {
                      javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  } catch (IllegalAccessException ex) {
                      java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  break;
              }
            }
        }
        catch (ClassNotFoundException ex)
        {
          java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
        welcome a=new welcome();
        a.setVisible(true);

try{
for(int i=0;i<=100;i++)
{
 Thread.sleep(50);
 a.loadvalue.setText(i +"%");
if(i==10)
{ a.loading.setText("Turning on Modules...");
}
if(i==30)
{ a.loading.setText("Loading Modules...");
}
if(i==50)
{ a.loading.setText("Connecting to database...");
}
if(i==80)
{ a.loading.setText("Connection successful...");
}
if(i==90)
{ a.loading.setText("Launching E-Library Application...");
}
a.pbar.setValue(i);

}
a.dispose();
admin_user amn=new admin_user();
amn.setVisible(true);

}
catch(Exception e)
{ JOptionPane.showMessageDialog(null,e);
}

       

    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel loadvalue;
    private javax.swing.JProgressBar pbar;
    // End of variables declaration//GEN-END:variables
}
