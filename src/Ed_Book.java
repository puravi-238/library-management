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
public class Ed_Book extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ed_Author
     */
    public Ed_Book() {
        initComponents();
        pan2.setVisible(false);
        pan3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        pan2 = new javax.swing.JPanel();
        lb2 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pan3 = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        tf1 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        tf3 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf5 = new javax.swing.JLabel();
        tf6 = new javax.swing.JLabel();
        tf4 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("MEMBER EDIT FORM ");

        pan1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb1.setText("Book Name  :");

        cb1.setModel(new javax.swing.DefaultComboBoxModel());
        cb1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cb1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb1FocusLost(evt);
            }
        });

        bt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 153));
        bt1.setText("EDIT");
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

        bt2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 0, 153));
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

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan1Layout.createSequentialGroup()
                        .addComponent(bt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan1Layout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan1Layout.createSequentialGroup()
                        .addComponent(bt1)
                        .addContainerGap())))
        );

        pan2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb2.setText("Book No. :");

        cb2.setModel(new javax.swing.DefaultComboBoxModel());
        cb2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cb2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb2FocusLost(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(0, 0, 153));
        bt3.setText("EDIT");
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

        bt4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(0, 0, 153));
        bt4.setText("CLOSE");
        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt4MouseExited(evt);
            }
        });
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addComponent(bt3)
                        .addGap(217, 217, 217)
                        .addComponent(bt4))
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt3)
                    .addComponent(bt4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb3.setText("BOOK NO.     :");
        pan3.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb4.setText("BOOK NAME :");
        pan3.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, -1));

        bt5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(0, 0, 102));
        bt5.setText("SAVE");
        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt5MouseExited(evt);
            }
        });
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        pan3.add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        bt6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(0, 0, 102));
        bt6.setText("CLEAR");
        bt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt6MouseExited(evt);
            }
        });
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        pan3.add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        bt7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(0, 0, 102));
        bt7.setText("CLOSE");
        bt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt7MouseExited(evt);
            }
        });
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        pan3.add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        tf2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
        });
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });
        pan3.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 240, 30));

        lb5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb5.setText("AUTHOR No. :");
        pan3.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, -1));

        lb6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb6.setText("SHELF No. :");
        pan3.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, -1));

        lb7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb7.setText("PRICE :");
        pan3.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 70, -1));

        lb8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb8.setText("PUBLISHER No. :");
        pan3.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 180, -1));

        lb9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb9.setText("ALMIRAH No. :");
        pan3.add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 170, -1));

        tf1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf1.setOpaque(true);
        pan3.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 60, 30));

        lb10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb10.setText("STATUS  :");
        pan3.add(lb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, -1));

        lb11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb11.setText("WHITEOFF :");
        pan3.add(lb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 120, -1));

        tf3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf3.setOpaque(true);
        pan3.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 60, 30));

        tf7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf7FocusGained(evt);
            }
        });
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });
        tf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf7KeyTyped(evt);
            }
        });
        pan3.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 240, 30));

        tf8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf8FocusGained(evt);
            }
        });
        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });
        tf8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf8KeyTyped(evt);
            }
        });
        pan3.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 240, 30));

        tf9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tf9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf9FocusGained(evt);
            }
        });
        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });
        tf9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf9KeyTyped(evt);
            }
        });
        pan3.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 240, 30));

        tf5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf5.setOpaque(true);
        pan3.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 60, 30));

        tf6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf6.setOpaque(true);
        pan3.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 60, 30));

        tf4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tf4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tf4.setOpaque(true);
        pan3.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, 30));

        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nature7.jpg"))); // NOI18N
        pan3.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        jScrollPane1.setViewportView(pan3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb1FocusGained

        Connection con = null;
        ResultSet rs =  null;
        Statement st = null;
        String sql="";
        
        DefaultComboBoxModel dm = (DefaultComboBoxModel)cb1.getModel();
        
        try
        {
            try
            {
                  Class.forName("java.sql.Driver");
                  con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                  st = con.createStatement();
                  
                  sql = "select distinct bnm from book order by bnm";
                  rs = st.executeQuery(sql);
                  
                  dm.removeAllElements();
                  dm.addElement("--select--");
                  while(rs.next())
                       dm.addElement(rs.getString("bnm"));
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
    }//GEN-LAST:event_cb1FocusGained

    private void cb1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb1FocusLost
        /*Connection con = null;
        ResultSet rs =  null;
        Statement st = null;
        String sql="";
        int x=0;
        int n=0;
        
        try
        {
            try
            {
                  Class.forName("java.sql.Driver");
                  con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                  st = con.createStatement();
                  
                  sql = "select bno from book where bnm = '"+cb1.getSelectedItem()+"';";
                  rs = st.executeQuery(sql);

                  while(rs.next())
                  {
                       n = (int)rs.getObject("bno");
                       x++;
                  }
                  
                  if(x>1)
                      pan2.setVisible(true);
                  else
                  {
                       tf1.setText(n+"");
                       pan2.setVisible(false);
                  }
            }
            catch(Exception e)
            {
                  JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,"ERROR : "+e.getMessage());
        }*/
    }//GEN-LAST:event_cb1FocusLost

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
       this.dispose();
       new Main().setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseEntered
        bt1.setBackground(java.awt.Color.BLACK);
        bt1.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt1MouseEntered

    private void bt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseExited
        bt1.setBackground(java.awt.Color.WHITE);
        bt1.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt1MouseExited

    private void bt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseEntered
         bt2.setBackground(java.awt.Color.BLACK);
         bt2.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt2MouseEntered

    private void bt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseExited
        bt2.setBackground(java.awt.Color.WHITE);
        bt2.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt2MouseExited

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       
        Connection con = null;
        ResultSet rs =  null;
        Statement st = null;
        String sql="";
        int x=0;
        int n=0;
      
        try
        {
            try
            {
                  Class.forName("java.sql.Driver");
                  con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                  st = con.createStatement();
                  
                  sql = "select bno from book where bnm = '"+cb1.getSelectedItem()+"';";
                  rs = st.executeQuery(sql);
                  
                  while(rs.next())
                  {
                       n = (int)rs.getObject("bno");
                       x++;
                  }

                  if(x>1)
                  {
                      pan2.setVisible(true);
                  }
                  else
                  {
                      tf1.setText(n+"");
                      pan2.setVisible(false);
                      bt3.doClick();  
                  }
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
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void cb2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb2FocusGained
        if(pan2.isVisible() == false)
            return;
        
        Connection con = null;
        ResultSet rs =  null;
        Statement st = null;
        String sql="";
        
        DefaultComboBoxModel dm = (DefaultComboBoxModel) cb2.getModel();
        try
        {
            try
            {
                  Class.forName("java.sql.Driver");
                  con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                  st = con.createStatement();
                  
                  sql = "select bno from book where bnm = '"+cb1.getSelectedItem()+"';";
                  rs = st.executeQuery(sql);
                  
                  dm.removeAllElements();
                  dm.addElement("--select--");
                  while(rs.next())
                  {
                      dm.addElement(rs.getObject("bno"));
                  }
                        
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
           
    }//GEN-LAST:event_cb2FocusGained

    private void cb2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb2FocusLost
        tf1.setText(cb2.getSelectedItem()+"");
    }//GEN-LAST:event_cb2FocusLost

    private void bt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseEntered
        bt3.setBackground(java.awt.Color.BLACK);
        bt3.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt3MouseEntered

    private void bt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseExited
        bt3.setBackground(java.awt.Color.WHITE);
        bt3.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt3MouseExited

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
       pan3.setVisible(true);
       
       Connection con = null;
       ResultSet rs = null;
       Statement st = null ;
       String sql = "";
       
       try
       {
           try
           {
                  Class.forName("java.sql.Driver");
                  con = DriverManager.getConnection(Login.URL,Login.URS,Login.PAS);
                  st = con.createStatement();
                  
                  sql = "Select * from book where bno = "+tf1.getText()+";";
                  rs = st.executeQuery(sql);
                  
                  if(rs.next())
                  {
                        tf2.setText(rs.getObject(2)+"");
                        tf3.setText(rs.getObject(3)+"");
                        tf4.setText(rs.getObject(4)+"");   
                        tf5.setText(rs.getObject(5)+"");   
                        tf6.setText(rs.getObject(6)+"");  
                        tf7.setText(rs.getObject(7)+"");
                        tf8.setText(rs.getObject(8)+"");
                        tf9.setText(rs.getObject(9)+"");
                  }
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
       tf2.requestFocus();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseEntered
        bt4.setBackground(java.awt.Color.BLACK);
        bt4.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt4MouseEntered

    private void bt4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseExited
        bt4.setBackground(java.awt.Color.WHITE);
        bt4.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt4MouseExited

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseEntered
        bt5.setBackground(java.awt.Color.BLACK);
        bt5.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt5MouseEntered

    private void bt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseExited
        bt5.setBackground(java.awt.Color.WHITE);
        bt5.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt5MouseExited

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
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

                sql = "update book set bnm ='"+tf2.getText()+"' , price = "+
                        tf7.getText()+" , status = '"+tf8.getText()+
                        "', writeoff = '"+tf9.getText()+"' where bno = "+tf1.getText()+";";
                

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"BOOK EDITED!!");
                this.bt6.doClick();

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
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MouseEntered
        bt6.setBackground(java.awt.Color.BLACK);
        bt6.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt6MouseEntered

    private void bt6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MouseExited
        bt6.setBackground(java.awt.Color.WHITE);
        bt6.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt6MouseExited

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed

        tf2.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");

        tf2.requestFocus();
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MouseEntered
        bt7.setBackground(java.awt.Color.BLACK);
        bt7.setForeground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_bt7MouseEntered

    private void bt7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MouseExited
        bt7.setBackground(java.awt.Color.WHITE);
        bt7.setForeground(java.awt.Color.BLUE);
    }//GEN-LAST:event_bt7MouseExited

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_bt7ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf2.setText(En_Almirah.toTitleCase(tf2.getText()));
            tf7.requestFocus();
        }
    }//GEN-LAST:event_tf2KeyTyped

    private void tf7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf7KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf8.requestFocus();
        }
    }//GEN-LAST:event_tf7KeyTyped

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

    private void tf8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf8KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            tf9.requestFocus();
        }
    }//GEN-LAST:event_tf8KeyTyped

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void tf9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf9KeyTyped
        char ch = evt.getKeyChar();
        if(ch == '\n')
        {
            bt5.doClick();
        }
    }//GEN-LAST:event_tf9KeyTyped

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
        tf2.selectAll();
    }//GEN-LAST:event_tf2FocusGained

    private void tf7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf7FocusGained
         tf7.selectAll();
    }//GEN-LAST:event_tf7FocusGained

    private void tf8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf8FocusGained
        tf8.selectAll();
    }//GEN-LAST:event_tf8FocusGained

    private void tf9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf9FocusGained
        tf9.selectAll();
    }//GEN-LAST:event_tf9FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JLabel tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JLabel tf3;
    private javax.swing.JLabel tf4;
    private javax.swing.JLabel tf5;
    private javax.swing.JLabel tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}
