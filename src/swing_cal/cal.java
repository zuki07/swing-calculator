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
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(750, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanel1.setFocusable(true);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top_display.setFont(new java.awt.Font("Elephant", 0, 30)); // NOI18N
        top_display.setForeground(new java.awt.Color(25, 255, 25));
        top_display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        top_display.setFocusable(false);
        jPanel1.add(top_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 20, 338, 40));

        bottom_display.setBackground(new java.awt.Color(0, 0, 0));
        bottom_display.setFont(new java.awt.Font("Elephant", 0, 30)); // NOI18N
        bottom_display.setForeground(new java.awt.Color(25, 255, 25));
        bottom_display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bottom_display.setText("0");
        bottom_display.setFocusable(false);
        bottom_display.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(bottom_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 70, 338, 40));

        num_6.setBackground(new java.awt.Color(0, 0, 0));
        num_6.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_6.setForeground(new java.awt.Color(25, 255, 25));
        num_6.setText("6");
        num_6.setBorderPainted(false);
        num_6.setFocusable(false);
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 166, 60, 40));

        num_0.setBackground(new java.awt.Color(0, 0, 0));
        num_0.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_0.setForeground(new java.awt.Color(25, 255, 25));
        num_0.setText("0");
        num_0.setBorderPainted(false);
        num_0.setFocusable(false);
        num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 258, 60, 40));

        num_7.setBackground(new java.awt.Color(0, 0, 0));
        num_7.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_7.setForeground(new java.awt.Color(25, 255, 25));
        num_7.setText("7");
        num_7.setBorderPainted(false);
        num_7.setFocusable(false);
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 120, 60, 40));

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(25, 255, 25));
        clear.setText("C");
        clear.setBorderPainted(false);
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 130, 40));

        num_8.setBackground(new java.awt.Color(0, 0, 0));
        num_8.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_8.setForeground(new java.awt.Color(25, 255, 25));
        num_8.setText("8");
        num_8.setBorderPainted(false);
        num_8.setFocusable(false);
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, 40));

        num_9.setBackground(new java.awt.Color(0, 0, 0));
        num_9.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_9.setForeground(new java.awt.Color(25, 255, 25));
        num_9.setText("9");
        num_9.setBorderPainted(false);
        num_9.setFocusable(false);
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 120, 60, 40));

        div.setBackground(new java.awt.Color(0, 0, 0));
        div.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        div.setForeground(new java.awt.Color(25, 255, 25));
        div.setText("/");
        div.setBorderPainted(false);
        div.setFocusable(false);
        div.setMaximumSize(new java.awt.Dimension(45, 31));
        div.setMinimumSize(new java.awt.Dimension(45, 31));
        div.setPreferredSize(new java.awt.Dimension(45, 31));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel1.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 212, 60, 40));

        mult.setBackground(new java.awt.Color(0, 0, 0));
        mult.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        mult.setForeground(new java.awt.Color(25, 255, 25));
        mult.setText("X");
        mult.setBorderPainted(false);
        mult.setFocusable(false);
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        jPanel1.add(mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 166, 60, 40));

        num_1.setBackground(new java.awt.Color(0, 0, 0));
        num_1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_1.setForeground(new java.awt.Color(25, 255, 25));
        num_1.setText("1");
        num_1.setBorderPainted(false);
        num_1.setFocusable(false);
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 212, 60, 40));

        minus.setBackground(new java.awt.Color(0, 0, 0));
        minus.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(25, 255, 25));
        minus.setText("-");
        minus.setBorderPainted(false);
        minus.setFocusable(false);
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 166, 60, 40));

        num_2.setBackground(new java.awt.Color(0, 0, 0));
        num_2.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_2.setForeground(new java.awt.Color(25, 255, 25));
        num_2.setText("2");
        num_2.setBorderPainted(false);
        num_2.setFocusable(false);
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 212, 60, 40));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(25, 255, 25));
        add.setText("+");
        add.setBorderPainted(false);
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 212, 60, 40));

        num_3.setBackground(new java.awt.Color(0, 0, 0));
        num_3.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_3.setForeground(new java.awt.Color(25, 255, 25));
        num_3.setText("3");
        num_3.setBorderPainted(false);
        num_3.setFocusable(false);
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 212, 60, 40));

        pos_neg.setBackground(new java.awt.Color(0, 0, 0));
        pos_neg.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        pos_neg.setForeground(new java.awt.Color(25, 255, 25));
        pos_neg.setText("+/-");
        pos_neg.setBorderPainted(false);
        pos_neg.setFocusable(false);
        pos_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_negActionPerformed(evt);
            }
        });
        jPanel1.add(pos_neg, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 258, 60, 40));

        num_4.setBackground(new java.awt.Color(0, 0, 0));
        num_4.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_4.setForeground(new java.awt.Color(25, 255, 25));
        num_4.setText("4");
        num_4.setBorderPainted(false);
        num_4.setFocusable(false);
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 166, 60, 40));

        dec.setBackground(new java.awt.Color(0, 0, 0));
        dec.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        dec.setForeground(new java.awt.Color(25, 255, 25));
        dec.setText(".");
        dec.setBorderPainted(false);
        dec.setFocusable(false);
        dec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 258, 60, 40));

        num_5.setBackground(new java.awt.Color(0, 0, 0));
        num_5.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        num_5.setForeground(new java.awt.Color(25, 255, 25));
        num_5.setText("5");
        num_5.setBorderPainted(false);
        num_5.setFocusable(false);
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 166, 60, 40));

        equals.setBackground(new java.awt.Color(0, 0, 0));
        equals.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(25, 255, 25));
        equals.setText("=");
        equals.setBorderPainted(false);
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        jPanel1.add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 258, 130, 41));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing_cal/background.jpg"))); // NOI18N
        background.setFocusable(false);
        background.setMaximumSize(getPreferredSize());
        background.setMinimumSize(getPreferredSize());
        background.setOpaque(true);
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList bottom_list= new ArrayList();
    ArrayList top_list=new ArrayList();
    
    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        equals();
    }//GEN-LAST:event_equalsActionPerformed

    private void pos_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_negActionPerformed
        if(bottom_display.getText().startsWith("-")){
            bottom_display.setText(bottom_display.getText().substring(1));
        }
        else{
            bottom_display.setText("-"+bottom_display.getText());
        }
    }//GEN-LAST:event_pos_negActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(top_list.size()<2){
            commandOperator("+");
        }
        else if (top_list.size()>1){
            equals();
            bottom_list.clear();
            top_list.clear();
            top_list.add(bottom_display.getText());
            top_list.add("+");
            top_display.setText(toString(top_list));
        }
    }//GEN-LAST:event_addActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(top_list.size()<2){
            commandOperator("-");
        }
        else if (top_list.size()>1){
            equals();
            bottom_list.clear();
            top_list.clear();
            top_list.add(bottom_display.getText());
            top_list.add("-");
            top_display.setText(toString(top_list));
        }
    }//GEN-LAST:event_minusActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        if(top_list.size()<2){
            commandOperator("*");
        }
        else if (top_list.size()>1){
            equals();
            bottom_list.clear();
            top_list.clear();
            top_list.add(bottom_display.getText());
            top_list.add("*");
            top_display.setText(toString(top_list));
        }
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if(top_list.size()<2){
            commandOperator("/");
        }
        else if (top_list.size()>1){
            equals();
            bottom_list.clear();
            top_list.clear();
            top_list.add(bottom_display.getText());
            top_list.add("/");
            top_display.setText(toString(top_list));
        }
    }//GEN-LAST:event_divActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        bottom_list.clear();
        top_list.clear();
        top_display.setText("");
        bottom_display.setText("0");
    }//GEN-LAST:event_clearActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        Object button_pressed=evt.getSource();      //get full source of button event
        String str=button_pressed.toString();
        String[] split = str.split(",");            //split string at commas and append to string array
//        int count=0;
//        for(String st:split){
//            System.out.println(st);
//        }
//        System.out.println(split[25]);
        switch (split[25]){                         //at index 25 is  the value of button text
            case "text=1":
                todoCommand("1");
                break;
            case "text=2":
                todoCommand("2");
                break;
            case "text=3":
                todoCommand("3");
                break;
            case "text=4":
                todoCommand("4");
                break;
            case "text=5":
                todoCommand("5");
                break;    
            case "text=6":
                todoCommand("6");
                break; 
            case "text=7":
                todoCommand("7");
                break;    
            case "text=8":
                todoCommand("8");
                break;    
            case "text=9":
                todoCommand("9");
                break;    
            case "text=0":
                todoCommand("0");
                break;  
            case "text=.":
                todoCommand(".");
        }
        
    }//GEN-LAST:event_numActionPerformed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        int key=evt.getKeyChar();
//        System.out.println(key);
        switch(key){
            case 48:
                num_0.doClick();
                break;
            case 49:
                num_1.doClick();
                break;
            case 50:
                num_2.doClick();
                break;
            case 51:
                num_3.doClick();
                break;
            case 52:
                num_4.doClick();
                break;
            case 53:
                num_5.doClick();
                break;
            case 54:
                num_6.doClick();
                break;
            case 55:
                num_7.doClick();
                break;
            case 56:
                num_8.doClick();
                break;
            case 57:
                num_9.doClick();
                break;
            case 43:
                add.doClick();
                break;
            case 45:
                minus.doClick();
                break;
            case 42:
                mult.doClick();
                break;
            case 47:
                div.doClick();
                break;
            case 10:
                equals.doClick();
                break;
            case 99:
                clear.doClick();
                break;
        }
    }//GEN-LAST:event_jPanel1KeyReleased

    private void commandOperator(String comm){
        String str=bottom_display.getText();
        top_list.clear();
        top_list.add(str);
        top_list.add(comm);
        top_display.setText(toString(top_list));
        bottom_display.setText(toString(bottom_list));
        bottom_list.clear();
    }
    
    private void todoCommand(String command_str){
        bottom_list.add(command_str);
        String str=toString(bottom_list);
        bottom_display.setText(str);
    }
    
    private void equals(){
        top_list.add(bottom_display.getText());
        top_list.add("=");
        top_display.setText(toString(top_list));
        double total=Double.parseDouble(top_list.get(0).toString());
        OUTER:
        for (int index = 1; index<top_list.size(); index++) {
            switch (top_list.get(index).toString()) {
                case "+":
                    total+=Double.parseDouble(top_list.get(index+1).toString());
                    break;
                case "-":
                    total-=Double.parseDouble(top_list.get(index+1).toString());
                    break;
                case "*":
                    total*=Double.parseDouble(top_list.get(index+1).toString());
                    break;
                case "/":
                    total/=Double.parseDouble(top_list.get(index+1).toString());
                    break;
                case "=":
                    break OUTER;
                default:
                    break;
            }
        }
        bottom_list.clear();
        bottom_list.add(total);
        bottom_display.setText(toString(bottom_list));
    }
    
    private String toString(ArrayList a_list){
        String str="";
        for(int index=0; index<a_list.size(); index++){
            str=str+a_list.get(index).toString();
        }
        return str;
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
    private javax.swing.JLabel background;
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


