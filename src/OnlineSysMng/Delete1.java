/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineSysMng;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author romi
 */
public class Delete1 extends javax.swing.JFrame {

    /**
     * Creates new form Delete1
     */
    public Delete1() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jbtnbck = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Welcome = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Lab_Detail = new javax.swing.JPanel();
        jtxtLabNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Lab_Assistant = new javax.swing.JPanel();
        jtxtLabAss = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Not_Working = new javax.swing.JPanel();
        jtxtSysNo = new javax.swing.JTextField();
        jtxtLabNo2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Orders = new javax.swing.JPanel();
        jtxtOrder = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Supplier = new javax.swing.JPanel();
        jtxtSupplier = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel2.setFont(new java.awt.Font("Chiller", 0, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ELETE");

        jButton1.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 0));
        jButton1.setText("Orders");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 0));
        jButton2.setText("Not Working");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 0));
        jButton3.setText("Lab Details");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 0));
        jButton4.setText("Supplier");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 255, 0));
        jButton5.setText("Lab Assistant");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jbtnbck.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        jbtnbck.setText("BACK");
        jbtnbck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        jbtnbck.setContentAreaFilled(false);
        jbtnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbckActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Chiller", 0, 200)); // NOI18N
        jLabel13.setText("D");

        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnbck, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jbtnbck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jPanel2.setLayout(new java.awt.CardLayout());

        Welcome.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Welcome.add(jLabel15);
        jLabel15.setBounds(0, 0, 1210, 870);

        jPanel2.add(Welcome, "card2");

        Lab_Detail.setLayout(null);

        jtxtLabNo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtLabNo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtLabNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtLabNoMouseClicked(evt);
            }
        });
        jtxtLabNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLabNoActionPerformed(evt);
            }
        });
        Lab_Detail.add(jtxtLabNo);
        jtxtLabNo.setBounds(150, 320, 550, 50);

        jLabel1.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Lab_No");
        Lab_Detail.add(jLabel1);
        jLabel1.setBounds(40, 320, 100, 60);

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jButton6.setText("Delete");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Lab_Detail.add(jButton6);
        jButton6.setBounds(150, 400, 150, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Lab_Detail.add(jLabel3);
        jLabel3.setBounds(0, 0, 1210, 870);

        jPanel2.add(Lab_Detail, "card2");

        Lab_Assistant.setLayout(null);

        jtxtLabAss.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtLabAss.setForeground(new java.awt.Color(153, 153, 153));
        jtxtLabAss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtLabAssMouseClicked(evt);
            }
        });
        jtxtLabAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLabAssActionPerformed(evt);
            }
        });
        Lab_Assistant.add(jtxtLabAss);
        jtxtLabAss.setBounds(200, 350, 550, 50);

        jLabel4.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Assistant_Id");
        Lab_Assistant.add(jLabel4);
        jLabel4.setBounds(20, 350, 170, 60);

        jButton7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jButton7.setText("Delete");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Lab_Assistant.add(jButton7);
        jButton7.setBounds(160, 430, 150, 50);

        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Lab_Assistant.add(jLabel5);
        jLabel5.setBounds(0, 0, 1210, 870);

        jPanel2.add(Lab_Assistant, "card2");

        Not_Working.setLayout(null);

        jtxtSysNo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtSysNo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtSysNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtSysNoMouseClicked(evt);
            }
        });
        jtxtSysNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSysNoActionPerformed(evt);
            }
        });
        Not_Working.add(jtxtSysNo);
        jtxtSysNo.setBounds(150, 390, 550, 50);

        jtxtLabNo2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtLabNo2.setForeground(new java.awt.Color(153, 153, 153));
        jtxtLabNo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtLabNo2MouseClicked(evt);
            }
        });
        jtxtLabNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLabNo2ActionPerformed(evt);
            }
        });
        Not_Working.add(jtxtLabNo2);
        jtxtLabNo2.setBounds(150, 320, 550, 50);

        jLabel7.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("System No");
        Not_Working.add(jLabel7);
        jLabel7.setBounds(11, 390, 129, 60);

        jLabel9.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Lab_No");
        Not_Working.add(jLabel9);
        jLabel9.setBounds(40, 320, 100, 60);

        jButton8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jButton8.setText("Delete");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Not_Working.add(jButton8);
        jButton8.setBounds(150, 470, 150, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Not_Working.add(jLabel8);
        jLabel8.setBounds(0, 0, 1210, 870);

        jPanel2.add(Not_Working, "card2");

        Orders.setLayout(null);

        jtxtOrder.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtOrder.setForeground(new java.awt.Color(153, 153, 153));
        jtxtOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtOrderMouseClicked(evt);
            }
        });
        jtxtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtOrderActionPerformed(evt);
            }
        });
        Orders.add(jtxtOrder);
        jtxtOrder.setBounds(150, 320, 550, 50);

        jLabel10.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Order Id");
        Orders.add(jLabel10);
        jLabel10.setBounds(30, 320, 110, 60);

        jButton9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jButton9.setText("Delete");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Orders.add(jButton9);
        jButton9.setBounds(150, 400, 150, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Orders.add(jLabel11);
        jLabel11.setBounds(0, 0, 1210, 870);

        jPanel2.add(Orders, "card2");

        Supplier.setLayout(null);

        jtxtSupplier.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jtxtSupplier.setForeground(new java.awt.Color(153, 153, 153));
        jtxtSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtSupplierMouseClicked(evt);
            }
        });
        jtxtSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSupplierActionPerformed(evt);
            }
        });
        Supplier.add(jtxtSupplier);
        jtxtSupplier.setBounds(170, 330, 550, 50);

        jLabel6.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Supplier Id");
        Supplier.add(jLabel6);
        jLabel6.setBounds(20, 330, 140, 60);

        jButton10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 30)); // NOI18N
        jButton10.setText("Delete");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Supplier.add(jButton10);
        jButton10.setBounds(170, 400, 200, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OnlineSysMng/maxresdefault2.jpg"))); // NOI18N
        Supplier.add(jLabel12);
        jLabel12.setBounds(0, 0, 1210, 870);

        jPanel2.add(Supplier, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1555, 930));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jtxtOrder.setText("Enter Order Id here...");
        jPanel2.removeAll();
        jPanel2.add(Orders);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jtxtLabNo2.setText("Enter Lab No here...");
        jtxtSysNo.setText("Enter System No here...");
        jPanel2.removeAll();
        jPanel2.add(Not_Working);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jtxtLabNo.setText("Enter Lab No here...");
        jPanel2.removeAll();
        jPanel2.add(Lab_Detail);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtxtSupplier.setText("Enter Supplier Id here...");
        jPanel2.removeAll();
        jPanel2.add(Supplier);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtxtLabNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLabNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLabNoActionPerformed

    private void jtxtLabAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLabAssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLabAssActionPerformed

    private void jtxtSysNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSysNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSysNoActionPerformed

    private void jtxtLabNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLabNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLabNo2ActionPerformed

    private void jtxtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtOrderActionPerformed

    private void jtxtSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSupplierActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jtxtLabAss.setText("Enter Assistant Id here...");
        jPanel2.removeAll();
        jPanel2.add(Lab_Assistant);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!jtxtLabNo.getText().equals(""))
        {
            try {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("DELETE FROM New_lab1 WHERE LAB_NO = ?");
                int id=Integer.parseInt(jtxtLabNo.getText());
                ps.setInt(1,id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Lab Deleted!!!...");
            } catch (SQLException ex) {
                Logger.getLogger(Delete1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Lab Not Deleted!!!...");
            }

        }else{
            JOptionPane.showMessageDialog(null,"Lab Not Deleted!!!...");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jtxtLabAss.getText()!=null)
        {
            try {
                Connection con=getConnection();
                PreparedStatement ps;
                ps = con.prepareStatement("DELETE FROM Lab_Assistant WHERE Lab_Assistant_Id = ?");
                int id1=Integer.parseInt(jtxtLabAss.getText());
                ps.setInt(1, id1);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Lab Assistant Deleted!!!...");
            } catch (SQLException ex) {
                Logger.getLogger(Delete1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Lab Assistant Not Deleted!!!...");
            }
        }else{
            JOptionPane.showMessageDialog(null,"1Lab Not Deleted!!!...");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(jtxtLabNo2.getText()!=null)
        {
            try {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("DELETE FROM Not_Working WHERE LAB_NO = ? AND System_No = ?");
                int id1=Integer.parseInt(jtxtLabNo2.getText());
                int id2=Integer.parseInt(jtxtSysNo.getText());
                ps.setInt(1, id1);
                ps.setInt(2, id2);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Lab Assistant Deleted!!!...");
            } catch (SQLException ex) {
                Logger.getLogger(Delete1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Lab Assistant Not Deleted!!!...");
            }
        }else{
            JOptionPane.showMessageDialog(null,"1Lab Not Deleted!!!...");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jtxtOrder.getText()!=null)
        {
            try {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("DELETE FROM Orders WHERE Order_Id = ?");
                int id=Integer.parseInt(jtxtSupplier.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Order Deleted!!!...");
            } catch (SQLException ex) {
                Logger.getLogger(Delete1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Order Not Deleted!!!...");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Order Not Deleted!!!...");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(jtxtSupplier.getText()!=null)
        {
            try {
                Connection con=getConnection();
                PreparedStatement ps=con.prepareStatement("DELETE FROM Supplier WHERE Supplier_Id = ?");
                int id=Integer.parseInt(jtxtSupplier.getText());
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Supplier Deleted!!!...");
            } catch (SQLException ex) {
                Logger.getLogger(Delete1.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Supplier Not Deleted!!!...");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Supplier Not Deleted!!!...");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jtxtLabNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtLabNoMouseClicked
        jtxtLabNo.setText(null);
    }//GEN-LAST:event_jtxtLabNoMouseClicked

    private void jtxtLabAssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtLabAssMouseClicked
        jtxtLabAss.setText(null);
    }//GEN-LAST:event_jtxtLabAssMouseClicked

    private void jtxtLabNo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtLabNo2MouseClicked
        jtxtLabNo2.setText(null);
    }//GEN-LAST:event_jtxtLabNo2MouseClicked

    private void jtxtSysNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtSysNoMouseClicked
        jtxtSysNo.setText(null);
    }//GEN-LAST:event_jtxtSysNoMouseClicked

    private void jtxtOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtOrderMouseClicked
        jtxtOrder.setText(null);
    }//GEN-LAST:event_jtxtOrderMouseClicked

    private void jtxtSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtSupplierMouseClicked
        jtxtSupplier.setText(null);
    }//GEN-LAST:event_jtxtSupplierMouseClicked

    private void jbtnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbckActionPerformed
        systemExit();
        this.hide();
        MainPage1 mp1=new MainPage1();
        mp1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnbckActionPerformed

    public Connection getConnection()
    {
        
        Connection con=null;
        try { 
            con=DriverManager.getConnection("jdbc:mysql://localhost/system_mgmnt","root","");
            JOptionPane.showMessageDialog(null,"Connected");
            return con;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainPage1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Not Connected");
            return null;
        }
        
    }
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
            java.util.logging.Logger.getLogger(Delete1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lab_Assistant;
    private javax.swing.JPanel Lab_Detail;
    private javax.swing.JPanel Not_Working;
    private javax.swing.JPanel Orders;
    private javax.swing.JPanel Supplier;
    private javax.swing.JPanel Welcome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnbck;
    private javax.swing.JTextField jtxtLabAss;
    private javax.swing.JTextField jtxtLabNo;
    private javax.swing.JTextField jtxtLabNo2;
    private javax.swing.JTextField jtxtOrder;
    private javax.swing.JTextField jtxtSupplier;
    private javax.swing.JTextField jtxtSysNo;
    // End of variables declaration//GEN-END:variables
private void systemExit()
    {
        WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
