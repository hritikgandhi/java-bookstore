/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal_assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hritik Gandhi
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    Connection con;
    Statement st;
    ResultSet rs;
    public LoginPage() {
        initComponents();
        connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        userinput = new javax.swing.JTextField();
        b = new javax.swing.JButton();
        passlable = new javax.swing.JLabel();
        usernamlable = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        passinpt = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(getPreferredSize());

        userinput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userinput.setToolTipText("");
        userinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userinputActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(153, 153, 255));
        b.setText("Login");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bKeyPressed(evt);
            }
        });

        passlable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passlable.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passlable.setText("Password:");
        passlable.setName(""); // NOI18N

        usernamlable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernamlable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamlable.setLabelFor(userinput);
        usernamlable.setText("Username:");

        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("Singapore International School || Bookstore");

        Logo.setFont(new java.awt.Font("Californian FB", 0, 36)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 0, 0));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internal_assesment/sis-logo.png"))); // NOI18N

        passinpt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passinpt.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernamlable)
                                    .addComponent(passlable, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passinpt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userinput, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Logo)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernamlable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passlable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passinpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(footer)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void connect()
    {
       try
       {
       
       con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Hritik Gandhi\\OneDrive\\Netbeans\\Internal_Assesment\\db1.accdb");       
       st = con.createStatement();
       }
       catch(Exception ex)
       {
           
       }
    }
    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        try
            {
                String user = userinput.getText().trim();
                String pass = passinpt.getText().trim();
                String sql = "select user,pass from Login where username = '"+user+"'and pass = '"+pass+"'";
                rs = st.executeQuery(sql);
                
                int count =0;
                while(rs.next())
                {
                    count = count +1;
                }
                if(count == 1)
                {
                    JOptionPane.showMessageDialog(null,"User Found");                    
                    MainUI.main();
                    
                    setVisible(false);
                    dispose();
                    
                  
                }
                else if(count == 0)
                {
                    JOptionPane.showMessageDialog(null,"Username or Password Incorrect","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex)            
            {
                
            }
    }//GEN-LAST:event_bActionPerformed

    private void bKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyPressed
       
    }//GEN-LAST:event_bKeyPressed

    private void userinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userinputActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new LoginPage();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    public javax.swing.JButton b;
    private javax.swing.JLabel footer;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPasswordField passinpt;
    private javax.swing.JLabel passlable;
    public javax.swing.JTextField userinput;
    private javax.swing.JLabel usernamlable;
    // End of variables declaration//GEN-END:variables
}