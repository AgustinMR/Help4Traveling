/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Agustin
 */
public class ActualizarEstado extends javax.swing.JFrame {
    private IControladorReserva ICReserva;
    /**
     * Creates new form AltaUsuario
     */
    public ActualizarEstado() {
        initComponents();
        ICReserva = Factory.GetInstance().getIControladorReserva();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        lbl_estadoActual = new javax.swing.JLabel();
        cmb_estadoSel = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_reservas = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
        setMaximumSize(new java.awt.Dimension(1218, 707));
        setMinimumSize(new java.awt.Dimension(1218, 707));
        setResizable(false);
        setSize(new java.awt.Dimension(1218, 707));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1220, 10));

        jLabel139.setBackground(java.awt.Color.darkGray);
        jLabel139.setFont(new java.awt.Font("Liberation Mono", 0, 16)); // NOI18N
        jLabel139.setForeground(java.awt.Color.darkGray);
        jLabel139.setText("RESERVAS");
        getContentPane().add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        lbl_estadoActual.setBackground(java.awt.Color.darkGray);
        lbl_estadoActual.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lbl_estadoActual.setForeground(java.awt.Color.darkGray);
        getContentPane().add(lbl_estadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, 20));

        cmb_estadoSel.setBackground(java.awt.Color.lightGray);
        cmb_estadoSel.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        cmb_estadoSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrada", "Cancelada", "Pagada", "Facturada" }));
        getContentPane().add(cmb_estadoSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 180, -1));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/error.png"))); // NOI18N
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, 42, 42));

        jScrollPane6.setAutoscrolls(true);

        table_reservas.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        table_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nickname Usuario", "Id Reserva"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_reservas.setToolTipText("");
        table_reservas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reservasMouseClicked(evt);
            }
        });
        table_reservas.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                table_reservasCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane6.setViewportView(table_reservas);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, 540));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel50.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 43, 43));

        jLabel221.setBackground(java.awt.Color.darkGray);
        jLabel221.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel221.setForeground(java.awt.Color.darkGray);
        jLabel221.setText("Estado nuevo");
        getContentPane().add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel222.setBackground(java.awt.Color.darkGray);
        jLabel222.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel222.setForeground(java.awt.Color.darkGray);
        jLabel222.setText("Estado actual");
        getContentPane().add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1218, 600));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Actualización estado de reserva");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void table_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reservasMouseClicked
        int i = table_reservas.getSelectedRow();
        TableModel md = table_reservas.getModel();
        int idSel = (int)md.getValueAt(i, 1);
        DtReserva actual = ICReserva.ObtenerDatosReserva(idSel);
        lbl_estadoActual.setText(actual.GetEstado().toString());
    }//GEN-LAST:event_table_reservasMouseClicked

    private void table_reservasCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_table_reservasCaretPositionChanged

    }//GEN-LAST:event_table_reservasCaretPositionChanged

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        int i = table_reservas.getSelectedRow();
        TableModel md = table_reservas.getModel();
        int idSel = (int)md.getValueAt(i, 1);

        Estado nuevo = null;
        if(cmb_estadoSel.getSelectedItem().equals("Registrada"))
            ICReserva.actualizarEstado(nuevo.Registrada, idSel);
        else if(cmb_estadoSel.getSelectedItem().equals("Cancelada"))
            ICReserva.actualizarEstado(nuevo.Cancelada, idSel);
        else if(cmb_estadoSel.getSelectedItem().equals("Pagada"))
            ICReserva.actualizarEstado(nuevo.Pagada, idSel);
        else if(cmb_estadoSel.getSelectedItem().equals("Facturada"))
            ICReserva.actualizarEstado(nuevo.Facturada, idSel);
        
        JOptionPane.showMessageDialog(null, "Reserva actualizada correctamente!");
    }//GEN-LAST:event_jLabel50MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArrayList<DtReserva> r = ICReserva.listarReservas();
        DefaultTableModel tm = (DefaultTableModel)table_reservas.getModel();
        Object[] row = new Object[2];
        for(int x = 0; x < r.size(); x++){
            if(r.get(x).GetEstado() == Estado.Registrada){
                row[0] = r.get(x).GetCliente();
                row[1] = r.get(x).GetId();
                tm.addRow(row);
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ActualizarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estadoSel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_estadoActual;
    private javax.swing.JTable table_reservas;
    // End of variables declaration//GEN-END:variables
}
