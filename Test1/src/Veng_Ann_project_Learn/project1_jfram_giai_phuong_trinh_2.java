/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veng_Ann_project_Learn;
import javax.swing.JOptionPane;
public class project1_jfram_giai_phuong_trinh_2 extends javax.swing.JFrame {

    /**
     * Creates new form project_1_jfram
     */
    public project1_jfram_giai_phuong_trinh_2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Tinh = new javax.swing.JButton();
        jTextField_A = new javax.swing.JTextField();
        jTextField_B = new javax.swing.JTextField();
        jTextField_c = new javax.swing.JTextField();
        jButton_lam_lai = new javax.swing.JButton();
        jTextField_Delta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_x2 = new javax.swing.JTextField();
        jTextField_X1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhap A");

        jLabel2.setText("Nhap C");

        jLabel3.setText("Nhap B");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giai Phuong trinh bac 2");

        jButton_Tinh.setText("Tinh");
        jButton_Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TinhActionPerformed(evt);
            }
        });

        jTextField_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AActionPerformed(evt);
            }
        });

        jButton_lam_lai.setText("Lam lai");
        jButton_lam_lai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lam_laiActionPerformed(evt);
            }
        });

        jTextField_Delta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DeltaActionPerformed(evt);
            }
        });

        jLabel5.setText("Delta");

        jLabel6.setText("X1");

        jLabel7.setText("X2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_c)
                            .addComponent(jTextField_B)
                            .addComponent(jTextField_A)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_lam_lai))
                            .addComponent(jTextField_Delta, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_x2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jTextField_X1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_lam_lai)
                    .addComponent(jButton_Tinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Delta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AActionPerformed

    private void jButton_lam_laiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lam_laiActionPerformed
        jTextField_A.setText("");
        jTextField_B.setText("");
        jTextField_c.setText("");
        jTextField_Delta.setText("");
        jTextField_X1.setText("");
        jTextField_x2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_lam_laiActionPerformed
    public boolean vilidateForm()
    {
        if(jTextField_A.getText().isEmpty() || 
                jTextField_B.getText().isEmpty() ||
                jTextField_c.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
    private void jButton_TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TinhActionPerformed
    if(!vilidateForm())
    {
        JOptionPane.showMessageDialog(this, "Ban chua nhap gia tri vao!!");
    }
    else
    {
        double a = Double.parseDouble(jTextField_A.getText());
        double b = Double.parseDouble(jTextField_B.getText());
        double c = Double.parseDouble(jTextField_c.getText());
        double delta = b*b - 4*a*c;
        if(delta < 0)
        {
            jTextField_Delta.setText("Delta: "+ delta+"<0"+"Phuong trinh vo nghiem!!");
            jTextField_X1.setText("");
            jTextField_x2.setText("");
        }
        else if(delta==0)
        {
            jTextField_Delta.setText("Delta: "+delta+"=0"+"phuong trinh co nghiem x1=x2");
            jTextField_X1.setText(""+(-b/2*a));
            jTextField_x2.setText(""+(-b/2*a));
        }
        else if(delta>0)
        {
        jTextField_Delta.setText("Delta:"+delta);
        jTextField_X1.setText("X1= "+(-b+Math.sqrt(delta))/2*a);
        jTextField_x2.setText("X2="+(-b-Math.sqrt(delta))/2*a);
        }
        
        
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton_TinhActionPerformed

    private void jTextField_DeltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DeltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DeltaActionPerformed

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
            java.util.logging.Logger.getLogger(project1_jfram_giai_phuong_trinh_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project1_jfram_giai_phuong_trinh_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project1_jfram_giai_phuong_trinh_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project1_jfram_giai_phuong_trinh_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project1_jfram_giai_phuong_trinh_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Tinh;
    private javax.swing.JButton jButton_lam_lai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_A;
    private javax.swing.JTextField jTextField_B;
    private javax.swing.JTextField jTextField_Delta;
    private javax.swing.JTextField jTextField_X1;
    private javax.swing.JTextField jTextField_c;
    private javax.swing.JTextField jTextField_x2;
    // End of variables declaration//GEN-END:variables
}
