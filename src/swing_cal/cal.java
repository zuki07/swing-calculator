/*

 */
package swing_cal;

import java.util.ArrayList;

/**
 *
 * @author wildzuk
 */
public class cal extends javax.swing.JFrame {

    /**
     * Creates new form cal
     */
    public cal() {
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
        top_display = new javax.swing.JLabel();
        bottom_display = new javax.swing.JLabel();
        num_6 = new javax.swing.JButton();
        num_0 = new javax.swing.JButton();
        num_7 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        num_8 = new javax.swing.JButton();
        num_9 = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        num_1 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        num_2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        num_3 = new javax.swing.JButton();
        pos_neg = new javax.swing.JButton();
        num_4 = new javax.swing.JButton();
        dec = new javax.swing.JButton();
        num_5 = new javax.swing.JButton();
        equals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 500));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        top_display.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        top_display.setForeground(new java.awt.Color(25, 255, 25));
        top_display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        bottom_display.setBackground(new java.awt.Color(0, 0, 0));
        bottom_display.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bottom_display.setForeground(new java.awt.Color(25, 255, 25));
        bottom_display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bottom_display.setText("0");

        num_6.setBackground(new java.awt.Color(25, 255, 25));
        num_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_6.setText("6");
        num_6.setBorderPainted(false);
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_6ActionPerformed(evt);
            }
        });

        num_0.setBackground(new java.awt.Color(25, 255, 25));
        num_0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_0.setText("0");
        num_0.setBorderPainted(false);
        num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_0ActionPerformed(evt);
            }
        });

        num_7.setBackground(new java.awt.Color(25, 255, 25));
        num_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_7.setText("7");
        num_7.setBorderPainted(false);
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_7ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(25, 255, 25));
        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("C");
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        num_8.setBackground(new java.awt.Color(25, 255, 25));
        num_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_8.setText("8");
        num_8.setBorderPainted(false);
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_8ActionPerformed(evt);
            }
        });

        num_9.setBackground(new java.awt.Color(25, 255, 25));
        num_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_9.setText("9");
        num_9.setBorderPainted(false);
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_9ActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(25, 255, 25));
        div.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        div.setText("/");
        div.setBorderPainted(false);
        div.setMaximumSize(new java.awt.Dimension(45, 31));
        div.setMinimumSize(new java.awt.Dimension(45, 31));
        div.setPreferredSize(new java.awt.Dimension(45, 31));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mult.setBackground(new java.awt.Color(25, 255, 25));
        mult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mult.setText("X");
        mult.setBorderPainted(false);
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        num_1.setBackground(new java.awt.Color(25, 255, 25));
        num_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_1.setText("1");
        num_1.setBorderPainted(false);
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_1ActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(25, 255, 25));
        minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus.setText("-");
        minus.setBorderPainted(false);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        num_2.setBackground(new java.awt.Color(25, 255, 25));
        num_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_2.setText("2");
        num_2.setBorderPainted(false);
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_2ActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(25, 255, 25));
        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("+");
        add.setBorderPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        num_3.setBackground(new java.awt.Color(25, 255, 25));
        num_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_3.setText("3");
        num_3.setBorderPainted(false);
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_3ActionPerformed(evt);
            }
        });

        pos_neg.setBackground(new java.awt.Color(25, 255, 25));
        pos_neg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pos_neg.setText("+/-");
        pos_neg.setBorderPainted(false);
        pos_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_negActionPerformed(evt);
            }
        });

        num_4.setBackground(new java.awt.Color(25, 255, 25));
        num_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_4.setText("4");
        num_4.setBorderPainted(false);
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_4ActionPerformed(evt);
            }
        });

        dec.setBackground(new java.awt.Color(25, 255, 25));
        dec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dec.setText(".");
        dec.setBorderPainted(false);
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decActionPerformed(evt);
            }
        });

        num_5.setBackground(new java.awt.Color(25, 255, 25));
        num_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        num_5.setText("5");
        num_5.setBorderPainted(false);
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_5ActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(25, 255, 25));
        equals.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        equals.setText("=");
        equals.setBorderPainted(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(num_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(num_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pos_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(num_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(num_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bottom_display, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top_display, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(top_display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom_display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(num_0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

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

    ArrayList bottom_list= new ArrayList();
    ArrayList top_list=new ArrayList();
    
    private String toString(ArrayList a_list){
        String str="";
        for(int index=0; index<a_list.size(); index++){
            str=str+a_list.get(index).toString();
        }
        return str;
    }
    
    private void num_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_1ActionPerformed
        bottom_list.add("1");
        String str=toString(bottom_list);
        bottom_display.setText(str);
    }//GEN-LAST:event_num_1ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divActionPerformed

    private void pos_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_negActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pos_negActionPerformed

    private void num_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_0ActionPerformed

    private void num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_2ActionPerformed

    private void num_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_4ActionPerformed

    private void num_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_3ActionPerformed

    private void num_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_5ActionPerformed

    private void num_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_6ActionPerformed

    private void num_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_7ActionPerformed

    private void num_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_8ActionPerformed

    private void num_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_9ActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minusActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String str=bottom_display.getText();
        top_list.clear();
        top_list.add(str);
        top_list.add("+");
        top_display.setText(toString(top_list));
        bottom_display.setText(toString(bottom_list));
        bottom_list.clear();
        System.out.println(top_list);
    }//GEN-LAST:event_addActionPerformed

    private void decActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decActionPerformed
        bottom_list.add(".");
        String str=toString(bottom_list);
        bottom_display.setText(str);
    }//GEN-LAST:event_decActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        top_list.add(bottom_display.getText());
        top_list.add("=");
        top_display.setText(toString(top_list));
        double total=0;
        for(Object ob:top_list){
            if(ob!="+" && ob!="="){
                double num=Double.parseDouble(ob.toString());
                total+=num;
            }
            else if(ob=="="){
                break;
            }
        }
        bottom_list.clear();
        bottom_list.add(total);
        bottom_display.setText(toString(bottom_list));
    }//GEN-LAST:event_equalsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        bottom_list.clear();
        top_list.clear();
        top_display.setText("");
        bottom_display.setText("0");
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel bottom_display;
    private javax.swing.JButton clear;
    private javax.swing.JButton dec;
    private javax.swing.JButton div;
    private javax.swing.JButton equals;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton mult;
    private javax.swing.JButton num_0;
    private javax.swing.JButton num_1;
    private javax.swing.JButton num_2;
    private javax.swing.JButton num_3;
    private javax.swing.JButton num_4;
    private javax.swing.JButton num_5;
    private javax.swing.JButton num_6;
    private javax.swing.JButton num_7;
    private javax.swing.JButton num_8;
    private javax.swing.JButton num_9;
    private javax.swing.JButton pos_neg;
    private javax.swing.JLabel top_display;
    // End of variables declaration//GEN-END:variables
}
