/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table_project;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class Table_2 extends javax.swing.JFrame {

    /**
     * Creates new form Table_2
     */
    public Table_2() {
        initComponents();
        loading();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mkTable = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        t2 = new javax.swing.JComboBox<>();
        b4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 102, 100, -1));

        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 102, 100, -1));

        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 184, 70, -1));

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 184, 70, -1));

        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 184, 70, -1));

        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t7KeyTyped(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 70, -1));

        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 70, -1));

        t9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t9KeyTyped(evt);
            }
        });
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, 70, -1));

        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t10KeyTyped(evt);
            }
        });
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 255, 70, -1));

        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t11KeyTyped(evt);
            }
        });
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 255, 70, -1));

        t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t12KeyTyped(evt);
            }
        });
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 255, 70, -1));

        jLabel1.setBackground(new java.awt.Color(57, 161, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 0, 53));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 0, 53));
        jLabel2.setText("Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1182, 103, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 0, 53));
        jLabel3.setText("Arbic");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 182, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 0, 53));
        jLabel4.setText("Math");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 182, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 0, 53));
        jLabel5.setText("English");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 182, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 0, 53));
        jLabel6.setText("Geography");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 0, 53));
        jLabel7.setText("History");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 0, 53));
        jLabel8.setText("physics");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, -1, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(20, 0, 53));
        jLabel9.setText("chemistry");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 253, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 0, 53));
        jLabel10.setText("Biology");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 253, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(20, 0, 53));
        jLabel11.setText("German");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1036, 253, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel12.setText("Marks");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 11, -1, -1));

        mkTable.setBackground(new java.awt.Color(20, 0, 53));
        mkTable.setForeground(new java.awt.Color(255, 255, 255));
        mkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Grade", "Code", "Arbic", "Math", "English", "Geograpy", "History", "Physic", "Chemistry", "Biology", "German"
            }
        ));
        mkTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mkTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mkTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1650, -1));

        b1.setBackground(new java.awt.Color(20, 0, 53));
        b1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Add");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 322, 100, -1));

        b2.setBackground(new java.awt.Color(20, 0, 53));
        b2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Update");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 322, 100, -1));

        b3.setBackground(new java.awt.Color(20, 0, 53));
        b3.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Remove");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 322, 100, -1));

        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Grade\t", "Second Grade", "Third Grade" }));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 102, -1, -1));

        b4.setBackground(new java.awt.Color(20, 0, 53));
        b4.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("Clear");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1142, 322, 100, -1));

        jLabel13.setBackground(new java.awt.Color(57, 161, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(20, 0, 53));
        jLabel13.setText("Grade");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 103, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\Works\\Programming\\Java\\Table_2 project\\icons8-macos-close-32.png")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon("D:\\Works\\Programming\\Java\\Table_2 project\\icons8-macos-minimize-32.png")); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 10, -1, -1));

        jLabel14.setBackground(new java.awt.Color(57, 161, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\Works\\Programming\\Java\\Table_2 project\\mkTable-new.jpg")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -19, 1680, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
            DefaultTableModel model=(DefaultTableModel) mkTable.getModel();
        model.addRow(new Object[]{t1.getText(),t2.getSelectedItem().toString(),t3.getText(),t4.getText(),
            t5.getText(),t6.getText(),t7.getText(),t8.getText(),t9.getText(),t10.getText(),t11.getText(),t12.getText()});
        clear();
        saving();
    }//GEN-LAST:event_b1MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
         DefaultTableModel smodel=(DefaultTableModel) mkTable.getModel();
         smodel.removeRow(mkTable.getSelectedRow());
         clear();
         saving();
    }//GEN-LAST:event_b3MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
         DefaultTableModel smodel=(DefaultTableModel) mkTable.getModel();
         smodel.setValueAt(t1.getText(), mkTable.getSelectedRow(), 0);
         smodel.setValueAt(t2.getSelectedItem().toString(), mkTable.getSelectedRow(), 1);
         smodel.setValueAt(t3.getText(), mkTable.getSelectedRow(), 2);
         smodel.setValueAt(t4.getText(), mkTable.getSelectedRow(), 3);
         smodel.setValueAt(t5.getText(), mkTable.getSelectedRow(), 4);
         smodel.setValueAt(t6.getText(), mkTable.getSelectedRow(), 5);
         smodel.setValueAt(t7.getText(), mkTable.getSelectedRow(), 6);
         smodel.setValueAt(t8.getText(), mkTable.getSelectedRow(), 7);
         smodel.setValueAt(t9.getText(), mkTable.getSelectedRow(), 8);
         smodel.setValueAt(t10.getText(), mkTable.getSelectedRow(), 9);
         smodel.setValueAt(t11.getText(), mkTable.getSelectedRow(), 10);
         smodel.setValueAt(t12.getText(), mkTable.getSelectedRow(), 11);
         clear();
         saving();
    }//GEN-LAST:event_b2MouseClicked

    private void mkTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkTableMouseClicked
        // TODO add your handling code here:
          DefaultTableModel smodel=(DefaultTableModel) mkTable.getModel();
         t1.setText(smodel.getValueAt(mkTable.getSelectedRow(), 0).toString());
         t2.setSelectedItem(smodel.getValueAt(mkTable.getSelectedRow(),1).toString());
         t3.setText(smodel.getValueAt(mkTable.getSelectedRow(), 2).toString());
         t4.setText(smodel.getValueAt(mkTable.getSelectedRow(),3).toString());
         t5.setText(smodel.getValueAt(mkTable.getSelectedRow(), 4).toString());
         t6.setText(smodel.getValueAt(mkTable.getSelectedRow(),5).toString());
         t7.setText(smodel.getValueAt(mkTable.getSelectedRow(), 6).toString());
         t8.setText(smodel.getValueAt(mkTable.getSelectedRow(),7).toString());
         t9.setText(smodel.getValueAt(mkTable.getSelectedRow(), 8).toString());
         t10.setText(smodel.getValueAt(mkTable.getSelectedRow(),9).toString());
         t11.setText(smodel.getValueAt(mkTable.getSelectedRow(), 10).toString());
         t12.setText(smodel.getValueAt(mkTable.getSelectedRow(),11).toString());

    }//GEN-LAST:event_mkTableMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_b4MouseClicked

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
        b1.setForeground(Color.green);
    }//GEN-LAST:event_b1MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        // TODO add your handling code here:
        b2.setForeground(Color.green);
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        // TODO add your handling code here:
        b3.setForeground(Color.green);
    }//GEN-LAST:event_b3MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        // TODO add your handling code here:
        b4.setForeground(Color.white);
    }//GEN-LAST:event_b4MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        // TODO add your handling code here:
        b4.setForeground(Color.green);
    }//GEN-LAST:event_b4MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        // TODO add your handling code here:
        b1.setForeground(Color.white);
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        // TODO add your handling code here:
        b2.setForeground(Color.white);
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        // TODO add your handling code here:
        b3.setForeground(Color.white);
    }//GEN-LAST:event_b3MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.setState(Login_table.ICONIFIED);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t4KeyTyped

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t5KeyTyped

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t6KeyTyped

    private void t7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t7KeyTyped

    private void t8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t8KeyTyped

    private void t9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t9KeyTyped

    private void t10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t10KeyTyped

    private void t11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t11KeyTyped

    private void t12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t12KeyTyped
        // TODO add your handling code here:
            char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_t12KeyTyped

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
            java.util.logging.Logger.getLogger(Table_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_2().setVisible(true);
            }
        });
    }
    public void clear(){
        t1.setText("");
        t2.setSelectedItem("First grade");
        t3.setText("");
        t4.setText("");   
        t5.setText(""); 
        t6.setText(""); 
        t7.setText(""); 
        t8.setText(""); 
        t9.setText(""); 
        t10.setText(""); 
        t11.setText(""); 
        t12.setText(""); 
}
    public void saving() {
    try{
    File file=new File(".\\src\\mkTable.txt");
if(!file.exists()){
file.createNewFile() ;
}
    
    FileWriter fw =new FileWriter(file.getAbsoluteFile()) ;
    BufferedWriter bw = new BufferedWriter(fw);
    
    for(int i = 0 ;i < mkTable.getRowCount();i++){
    for(int j = 0 ;j < mkTable.getColumnCount();j++){
        bw.write((String)mkTable.getModel().getValueAt(i , j)+"!@#");
    }
    bw.write("\n");
    }
    bw.close();
    fw.close();
    
    
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
public void loading(){

    String line;
BufferedReader reader;
    try{       
        reader = new BufferedReader(new FileReader(".\\src\\mkTable.txt"));
        DefaultTableModel model=(DefaultTableModel) mkTable.getModel();
        while((line = reader.readLine()) != null) 
        {
           model.addRow(line.split("!@#")); 
        }
        reader.close();
     }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Error");
e.printStackTrace();

    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mkTable;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
