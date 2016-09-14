
package help4travelling;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectarBD extends javax.swing.JFrame {

    public ConectarBD() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_mostrar_registros3 = new javax.swing.JLabel();
        lbl_errorBD = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_conectarBD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_mostrar_registros2 = new javax.swing.JLabel();
        txt_conectarBD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mostrar_registros3.setBackground(new java.awt.Color(25, 25, 25));
        lbl_mostrar_registros3.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lbl_mostrar_registros3.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mostrar_registros3.setFocusable(false);
        lbl_mostrar_registros3.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros3.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 690, 10));

        lbl_errorBD.setBackground(java.awt.Color.white);
        lbl_errorBD.setFont(new java.awt.Font("DejaVu Sans Mono", 3, 14)); // NOI18N
        lbl_errorBD.setForeground(new java.awt.Color(204, 0, 0));
        lbl_errorBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_errorBD.setText("ERROR AL CONECTAR CON BASE DE DATOS!");
        lbl_errorBD.setFocusable(false);
        lbl_errorBD.setOpaque(true);
        lbl_errorBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_errorBDMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_errorBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 320, 30));
        lbl_errorBD.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.darkGray);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DIRECCIÓN IP");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 30));

        btn_conectarBD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_conectarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/right-arrow.png"))); // NOI18N
        btn_conectarBD.setText("jLabel2");
        btn_conectarBD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_conectarBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_conectarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_conectarBDMouseClicked(evt);
            }
        });
        getContentPane().add(btn_conectarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 175, 38, 38));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setFocusable(false);
        jLabel4.setIconTextGap(8);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 690, 100));

        lbl_mostrar_registros2.setBackground(new java.awt.Color(1, 82, 158));
        lbl_mostrar_registros2.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        lbl_mostrar_registros2.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mostrar_registros2.setText("CONECTAR CON BASE DE DATOS");
        lbl_mostrar_registros2.setFocusable(false);
        lbl_mostrar_registros2.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros2.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        txt_conectarBD.setBackground(new java.awt.Color(41, 41, 41));
        txt_conectarBD.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txt_conectarBD.setForeground(new java.awt.Color(255, 255, 255));
        txt_conectarBD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_conectarBD.setText("192.168.10.132");
        txt_conectarBD.setBorder(null);
        txt_conectarBD.setSelectionColor(new java.awt.Color(51, 51, 51));
        txt_conectarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_conectarBDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_conectarBDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_conectarBDMouseExited(evt);
            }
        });
        txt_conectarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_conectarBDActionPerformed(evt);
            }
        });
        txt_conectarBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_conectarBDKeyPressed(evt);
            }
        });
        getContentPane().add(txt_conectarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 130, 692, 40));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 690, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_conectarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_conectarBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_conectarBDActionPerformed

    private void btn_conectarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conectarBDMouseClicked
        if(!txt_conectarBD.getText().isEmpty()){
            ManejadorSQL.GetInstance().init(txt_conectarBD.getText());
            Connection conex = ManejadorSQL.GetInstance().getConex();
            if( conex != null){
                try {
                    conex.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                }
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true);
                dispose();              
            }else{
                lbl_errorBD.setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_conectarBDMouseClicked

    private void txt_conectarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_conectarBDMouseClicked
        lbl_errorBD.setVisible(false);
    }//GEN-LAST:event_txt_conectarBDMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        lbl_errorBD.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void lbl_errorBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_errorBDMouseClicked
        lbl_errorBD.setVisible(false);
    }//GEN-LAST:event_lbl_errorBDMouseClicked

    private void txt_conectarBDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_conectarBDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!txt_conectarBD.getText().isEmpty()){
            ManejadorSQL.GetInstance().init(txt_conectarBD.getText());
            Connection conex = ManejadorSQL.GetInstance().getConex();
            if( conex != null){
                try {
                    conex.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
                }
                MenuPrincipal mp = new MenuPrincipal();
                mp.setVisible(true);
                dispose();              
            }else{
                lbl_errorBD.setVisible(true);
            }
            }
            else{
            
            }
        }
    }//GEN-LAST:event_txt_conectarBDKeyPressed

    private void txt_conectarBDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_conectarBDMouseEntered
        txt_conectarBD.setBackground(new Color(31,31,31));
    }//GEN-LAST:event_txt_conectarBDMouseEntered

    private void txt_conectarBDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_conectarBDMouseExited
        txt_conectarBD.setBackground(new Color(41,41,41));
    }//GEN-LAST:event_txt_conectarBDMouseExited

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
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConectarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConectarBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_conectarBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_errorBD;
    private javax.swing.JLabel lbl_mostrar_registros2;
    private javax.swing.JLabel lbl_mostrar_registros3;
    private javax.swing.JTextField txt_conectarBD;
    // End of variables declaration//GEN-END:variables
}
