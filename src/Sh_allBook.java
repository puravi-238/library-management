/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sh_allBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sh_allBook
     */
    public Sh_allBook() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pan1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        lb1 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb7 = new javax.swing.JRadioButton();
        rb8 = new javax.swing.JRadioButton();
        pan2 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        rb9 = new javax.swing.JRadioButton();
        rb10 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pan1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 204, 204));
        rb1.setSelected(true);
        rb1.setText("Bno");
        pan1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 24, 74, -1));

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 204, 204));
        lb1.setText("Sorting Order : ");
        pan1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 23, 134, 24));

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 204, 204));
        rb2.setText("Bname");
        pan1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 24, 74, -1));

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 204, 204));
        rb3.setText("Author no");
        pan1.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 24, 103, -1));

        buttonGroup1.add(rb4);
        rb4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb4.setForeground(new java.awt.Color(255, 204, 204));
        rb4.setText("Author name");
        pan1.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 24, 116, -1));

        buttonGroup1.add(rb5);
        rb5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb5.setForeground(new java.awt.Color(255, 204, 204));
        rb5.setText("Publisher no");
        pan1.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 49, -1, -1));

        buttonGroup1.add(rb6);
        rb6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb6.setForeground(new java.awt.Color(255, 204, 204));
        rb6.setText("Publisher name");
        pan1.add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 49, -1, -1));

        buttonGroup1.add(rb7);
        rb7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb7.setForeground(new java.awt.Color(255, 204, 204));
        rb7.setText("Member no");
        pan1.add(rb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 77, 103, -1));

        buttonGroup1.add(rb8);
        rb8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb8.setForeground(new java.awt.Color(255, 204, 204));
        rb8.setText("Member name");
        pan1.add(rb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 77, -1, -1));

        pan2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(0, 0, 51));
        lb2.setText(" Order : ");

        buttonGroup2.add(rb9);
        rb9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb9.setSelected(true);
        rb9.setText("Ascending");

        buttonGroup2.add(rb10);
        rb10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rb10.setText("Descending");

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rb9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(rb10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb9)
                        .addComponent(rb10)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pan1.add(pan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 120, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(240, 240, 240));

        tb.setBackground(new java.awt.Color(51, 51, 51));
        tb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tb.setForeground(new java.awt.Color(240, 240, 240));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BNo", "BName", "Author name", "Publisher Name", "Almirah Name", "Shelf No", "Price", "Status", "WriteOff"
            }
        ));
        jScrollPane1.setViewportView(tb);

        pan1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 190, 706, 268));

        bt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 51));
        bt1.setText("SHOW");
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
        bt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bt1KeyTyped(evt);
            }
        });
        pan1.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 120, -1, -1));

        bt2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 0, 51));
        bt2.setText("CLOSE");
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
        pan1.add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/0102_1024.jpg"))); // NOI18N
        pan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Object au_name(Object o)
    {
          int n = (int)o; 
          
          Connection con = null ;
          ResultSet rs = null ;
          Statement st = null ;
          String sql= "";
          String str= "";
          
          try 
          {
              try 
              {
                    Class.forName("java.sql.Driver");
                    con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                    st = con.createStatement();
                    
                    sql = "select aunm from author where auno = "+n+";";
                    rs = st.executeQuery(sql);
                    
                    if(rs.next())
                         str = rs.getString("aunm");
              }
              catch(Exception e)
              {
                     JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
              }
              finally
              {
                   if(!con.isClosed())
                       con.close();
                   if(!rs.isClosed())
                       rs.close();
                   if(!st.isClosed())
                       st.close();
              }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
          }
          
          return (Object)str;
    }

    private Object pub_name(Object o)
    {
          int n = (int)o; 
          
          Connection con = null ;
          ResultSet rs = null ;
          Statement st = null ;
          String sql= "";
          String str= "";
          
          try 
          {
              try 
              {
                    Class.forName("java.sql.Driver");
                    con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                    st = con.createStatement();
                    
                    sql = "select pubnm from publisher where pubno = "+n+";";
                    rs = st.executeQuery(sql);
                    
                    if(rs.next())
                         str = rs.getString("pubnm");
              }
              catch(Exception e)
              {
                     JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
              }
              finally
              {
                   if(!con.isClosed())
                       con.close();
                   if(!rs.isClosed())
                       rs.close();
                   if(!st.isClosed())
                       st.close();
              }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
          }
          
          return (Object)str;
    }
    
    private Object al_name(Object o)
    {
          int n = (int)o; 
          
          Connection con = null ;
          ResultSet rs = null ;
          Statement st = null ;
          String sql= "";
          String str= "";
          
          try 
          {
              try 
              {
                    Class.forName("java.sql.Driver");
                    con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                    st = con.createStatement();
                    
                    sql = "select alnm from almirah where alno = "+n+";";
                    rs = st.executeQuery(sql);
                    
                    if(rs.next())
                         str = rs.getString("alnm");
              }
              catch(Exception e)
              {
                     JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
              }
              finally
              {
                   if(!con.isClosed())
                       con.close();
                   if(!rs.isClosed())
                       rs.close();
                   if(!st.isClosed())
                       st.close();
              }
          }
          catch(Exception e)
          {
               JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
          }
          
          return (Object)str;
    }
    
    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
         Connection con = null;
         Statement st = null;
         ResultSet rs = null ;
         String sql = "";
         String sort = "order by ";
         String order = "asc";
         
         DefaultTableModel dm = (DefaultTableModel) tb.getModel();
         Object ob[]= new Object[9];
         
         try 
         {
             try 
             {
                    Class.forName("java.sql.Driver");
                    con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                    st = con.createStatement();
                    
                    if(rb1.isSelected())
                        sort+=" bno ";
                    else if(rb2.isSelected())
                        sort+=" bnm ";
                    else if(rb3.isSelected())
                        sort+=" auno ";
                    else if(rb4.isSelected())
                        sort+=" aunm ";
                    else if(rb5.isSelected())
                        sort+=" pubno ";
                    else if(rb6.isSelected())
                        sort+=" pubnm ";
                    else if(rb7.isSelected())
                        sort+=" mno ";
                    else if(rb8.isSelected())
                        sort+=" mnm ";
                    
                    if(rb9.isSelected())
                        ;
                    else if(rb10.isSelected())
                        order=" desc ";
                    
                    
                    sql = "select * from book "+sort+order+" ; ";
                    
                    rs = st.executeQuery(sql);
                    
                    dm.setRowCount(0);
                    while(rs.next())
                    {
                           ob[0] = rs.getObject(1);
                           ob[1] = rs.getObject(2);
                           ob[2] = au_name(rs.getObject(3));
                           ob[3] = pub_name(rs.getObject(4));
                           ob[4] = al_name(rs.getObject(5));
                           ob[5] = rs.getObject(6);
                           ob[6] = rs.getObject(7);
                           ob[7] = rs.getObject(8);
                           ob[8] = rs.getObject(9);
                           
                           dm.addRow(ob);
                    }
             }
             catch(Exception e)
             {
                   JOptionPane.showMessageDialog(null,"ERROR  : "+e.getMessage());
             }
             finally
              {
                   if(!con.isClosed())
                       con.close();
                   if(!rs.isClosed())
                       rs.close();
                   if(!st.isClosed())
                       st.close();
              }
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null,"ERROR  : "+e.getMessage());
         }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
       this.dispose();
       new Main().setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseEntered
        bt1.setForeground(Color.ORANGE);
        bt1.setBackground(Color.BLACK);
    }//GEN-LAST:event_bt1MouseEntered

    private void bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseExited
        bt1.setForeground(Color.BLUE);
        bt1.setBackground(Color.WHITE);
    }//GEN-LAST:event_bt1MouseExited

    private void bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseEntered
        bt2.setForeground(Color.ORANGE);
        bt2.setBackground(Color.BLACK);
    }//GEN-LAST:event_bt2MouseEntered

    private void bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseExited
        bt2.setForeground(Color.BLUE);
        bt2.setBackground(Color.WHITE);
    }//GEN-LAST:event_bt2MouseExited

    private void bt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt1KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
            bt1.doClick();
    }//GEN-LAST:event_bt1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JRadioButton rb7;
    private javax.swing.JRadioButton rb8;
    private javax.swing.JRadioButton rb9;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
