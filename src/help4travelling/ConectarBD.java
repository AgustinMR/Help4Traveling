
package help4travelling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectarBD extends javax.swing.JFrame {

    public ConectarBD() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btn_conectarBD = new javax.swing.JLabel();
        lbl_errorBD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_mostrar_registros2 = new javax.swing.JLabel();
        lbl_mostrar_registros3 = new javax.swing.JLabel();
        lbl_bienvenidoBD = new javax.swing.JLabel();
        txt_conectarBD = new javax.swing.JTextField();

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

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Direccion IP:");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 30));

        btn_conectarBD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_conectarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/right-arrow.png"))); // NOI18N
        btn_conectarBD.setText("jLabel2");
        btn_conectarBD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_conectarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_conectarBDMouseClicked(evt);
            }
        });
        getContentPane().add(btn_conectarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 136, 38, 38));

        lbl_errorBD.setBackground(new java.awt.Color(204, 204, 204));
        lbl_errorBD.setFont(new java.awt.Font("DejaVu Sans Mono", 2, 14)); // NOI18N
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
        getContentPane().add(lbl_errorBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 480, 30));
        lbl_errorBD.setVisible(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setFocusable(false);
        jLabel4.setIconTextGap(8);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 40, 78, 77));

        lbl_mostrar_registros2.setBackground(new java.awt.Color(1, 82, 158));
        lbl_mostrar_registros2.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lbl_mostrar_registros2.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mostrar_registros2.setText("CONECTAR CON BASE DE DATOS");
        lbl_mostrar_registros2.setFocusable(false);
        lbl_mostrar_registros2.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros2.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        lbl_mostrar_registros3.setBackground(new java.awt.Color(25, 25, 25));
        lbl_mostrar_registros3.setFont(new java.awt.Font("DejaVu Sans", 0, 15)); // NOI18N
        lbl_mostrar_registros3.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mostrar_registros3.setFocusable(false);
        lbl_mostrar_registros3.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros3.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 480, 10));

        lbl_bienvenidoBD.setBackground(new java.awt.Color(204, 204, 204));
        lbl_bienvenidoBD.setFont(new java.awt.Font("DejaVu Sans Mono", 2, 14)); // NOI18N
        lbl_bienvenidoBD.setForeground(new java.awt.Color(0, 153, 51));
        lbl_bienvenidoBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bienvenidoBD.setText("BIENVENIDO A HELP4TRAVELING!");
        lbl_bienvenidoBD.setFocusable(false);
        lbl_bienvenidoBD.setOpaque(true);
        getContentPane().add(lbl_bienvenidoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 30));
        getContentPane().remove(lbl_bienvenidoBD);
        getContentPane().add(lbl_bienvenidoBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 480, 30));
        lbl_bienvenidoBD.setVisible(false);

        txt_conectarBD.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        txt_conectarBD.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txt_conectarBD.setForeground(new java.awt.Color(0, 51, 153));
        txt_conectarBD.setText("localhost");
        txt_conectarBD.setBorder(null);
        txt_conectarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_conectarBDMouseClicked(evt);
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
        getContentPane().add(txt_conectarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 310, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_conectarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_conectarBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_conectarBDActionPerformed

    private void btn_conectarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conectarBDMouseClicked
        if(!txt_conectarBD.getText().isEmpty()){
            if(ManejadorSQL.GetInstance().init(txt_conectarBD.getText())){
                lbl_bienvenidoBD.setVisible(true);
                new Help4Travelling().setVisible(true);
                dispose();              
            }
            else{
                lbl_errorBD.setVisible(true);
            }
        }
        else{
            
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
       
    }//GEN-LAST:event_txt_conectarBDKeyPressed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_bienvenidoBD;
    private javax.swing.JLabel lbl_errorBD;
    private javax.swing.JLabel lbl_mostrar_registros2;
    private javax.swing.JLabel lbl_mostrar_registros3;
    private javax.swing.JTextField txt_conectarBD;
    // End of variables declaration//GEN-END:variables
}
