/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
public class En_Author extends javax.swing.JInternalFrame {

    /**
     * Creates new form En_Shelf
     */
    public En_Author() {
        initComponents();
        cal_Auno();
        
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
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();

        setTitle("Author Enteries");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setText("AUTHOR NO.     :");
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 160, -1));

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb2.setText("AUTHOR NAME :");
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 160, -1));

        bt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 102));
        bt1.setText("SAVE");
        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt1MouseExited(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        bt2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 0, 102));
        bt2.setText("CLEAR");
        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt2MouseExited(evt);
            }
        });
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        bt3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(0, 0, 102));
        bt3.setText("CLOSE");
        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt3MouseExited(evt);
            }
        });
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel1.add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        tf2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 240, 30));

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb3.setText("e-mail :");
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 70, -1));

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb4.setText("twitter :");
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 70, -1));

        tf3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });
        jPanel1.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 240, 30));

        tf4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf4KeyTyped(evt);
            }
        });
        jPanel1.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 240, 30));

        tf1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf1.setOpaque(true);
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 60, 30));

        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nature7.jpg"))); // NOI18N
        jPanel1.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cal_Auno()
    {
          Connection con = null;
          Statement st = null;
          ResultSet rs =  null;
          String sql = "";
          
          try
          {
               try
               { 
                     Class.forName("java.sql.Driver");
                     con= DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                     st = con.createStatement();
                     
                     sql = "select max(auno) as mx from author ;";
                     rs = st.executeQuery(sql);
                     
                     if(rs.next())
                         tf1.setText(rs.getInt("mx")+1+"");
                     else
                         tf1.setText("1");
               }
               catch(Exception e)
               {
                     JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
               }
          }
          catch(Exception e)
          {
                 JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
          }
    }
    private void bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseEntered
        bt1.setBackground(java.awt.Color.BLACK);
        bt1.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt1MouseEntered

    private void bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseExited
        bt1.setBackground(java.awt.Color.WHITE);
        bt1.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt1MouseExited

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        Connection con = null;
        Statement st = null ;
        String sql = "";

        try
        {
            try
            {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                st = con.createStatement();

                sql = "insert into author values("+tf1.getText()+",'"+tf2.getText()
                        +"','"+tf3.getText()+"','"+tf4.getText()+"');";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"AUTHOR ADDED!!");
                this.bt2.doClick();

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
            }
            finally
            {
                if(!con.isClosed())
                    con.close();
                if(!st.isClosed())
                    st.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseEntered
        bt2.setBackground(java.awt.Color.BLACK);
        bt2.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt2MouseEntered

    private void bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseExited
        bt2.setBackground(java.awt.Color.WHITE);
        bt2.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt2MouseExited

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        cal_Auno();
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf2.requestFocus();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseEntered
        bt3.setBackground(java.awt.Color.BLACK);
        bt3.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt3MouseEntered

    private void bt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseExited
        bt3.setBackground(java.awt.Color.WHITE);
        bt3.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt3MouseExited

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_bt3ActionPerformed

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf2.setText(En_Almirah.toTitleCase(tf2.getText()));
            tf3.requestFocus();
        }          
    }//GEN-LAST:event_tf2KeyTyped

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf3.setText(tf3.getText().toLowerCase());
            tf4.requestFocus();
        }     
    }//GEN-LAST:event_tf3KeyTyped

    private void tf4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf4KeyTyped
       char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf4.setText(tf4.getText().toLowerCase());
            bt1.doClick();
        }   
    }//GEN-LAST:event_tf4KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
