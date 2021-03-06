/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Agustin
 */
public class ConsultarReserva extends javax.swing.JFrame {
    private IControladorReserva ICReserva;
    DefaultListModel<String> list2 = new DefaultListModel<>();
    DefaultListModel<String> list3 = new DefaultListModel<>();
    private int idReserva;
    /**
     * Creates new form AltaUsuario
     */
    public ConsultarReserva() {
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
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        cmb_reservasI = new javax.swing.JComboBox<>();
        txt_cantidadR = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        lbl_ffin = new javax.swing.JLabel();
        lbl_finicio = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        lbl_cantidadR1 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txt_creacionR = new javax.swing.JLabel();
        txt_estadoR = new javax.swing.JLabel();
        txt_precioR = new javax.swing.JLabel();
        txt_finicio = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        txt_ffin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_reservasR = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel141.setBackground(java.awt.Color.darkGray);
        jLabel141.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel141.setForeground(java.awt.Color.darkGray);
        jLabel141.setText("Estado");
        getContentPane().add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel142.setBackground(java.awt.Color.darkGray);
        jLabel142.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel142.setForeground(java.awt.Color.darkGray);
        jLabel142.setText("RESERVAS");
        getContentPane().add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel143.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel143.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel143.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel143.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 43, 43));

        cmb_reservasI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_reservasI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_reservasIItemStateChanged(evt);
            }
        });
        cmb_reservasI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_reservasIMouseClicked(evt);
            }
        });
        getContentPane().add(cmb_reservasI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 270, 20));

        txt_cantidadR.setBackground(java.awt.Color.darkGray);
        txt_cantidadR.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_cantidadR.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_cantidadR, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 200, 20));

        jLabel147.setBackground(java.awt.Color.darkGray);
        jLabel147.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel147.setForeground(java.awt.Color.darkGray);
        jLabel147.setText("Servicios y promociones asociados");
        getContentPane().add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));

        lbl_ffin.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_ffin.setText("Fecha fin");
        getContentPane().add(lbl_ffin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        lbl_finicio.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_finicio.setText("Fecha inicio");
        getContentPane().add(lbl_finicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        jLabel221.setBackground(java.awt.Color.darkGray);
        jLabel221.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel221.setForeground(java.awt.Color.darkGray);
        jLabel221.setText("Precio total");
        getContentPane().add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lbl_cantidadR1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_cantidadR1.setText("Cantidad");
        getContentPane().add(lbl_cantidadR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        jLabel146.setBackground(java.awt.Color.darkGray);
        jLabel146.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel146.setForeground(java.awt.Color.darkGray);
        jLabel146.setText("Fecha de Creacion");
        getContentPane().add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txt_creacionR.setBackground(java.awt.Color.darkGray);
        txt_creacionR.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_creacionR.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_creacionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 20));

        txt_estadoR.setBackground(java.awt.Color.darkGray);
        txt_estadoR.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_estadoR.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_estadoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, 20));

        txt_precioR.setBackground(java.awt.Color.darkGray);
        txt_precioR.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_precioR.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_precioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 20));

        txt_finicio.setBackground(java.awt.Color.darkGray);
        txt_finicio.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_finicio.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_finicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 200, 20));

        jLabel152.setBackground(java.awt.Color.darkGray);
        jLabel152.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        jLabel152.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 200, 20));

        txt_ffin.setBackground(java.awt.Color.darkGray);
        txt_ffin.setFont(new java.awt.Font("Liberation Sans", 2, 16)); // NOI18N
        txt_ffin.setForeground(java.awt.Color.darkGray);
        getContentPane().add(txt_ffin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 200, 20));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ver información de reserva");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        jList_reservasR.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jList_reservasR.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_reservasRValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList_reservasR);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 260, 370));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1218, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel143MouseClicked

    private void cmb_reservasIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_reservasIItemStateChanged
        // TODO add your handling code here:
        //asd
        list2.clear();
        DtReserva dtRes = ICReserva.ObtenerDatosReserva(Integer.parseInt(cmb_reservasI.getSelectedItem().toString()));
        String fecha = Integer.toString(dtRes.GetFecha().getDia()) + "/" + Integer.toString(dtRes.GetFecha().getMes()) + "/" + Integer.toString(dtRes.GetFecha().getAnio());
        txt_creacionR.setText(fecha);
        txt_precioR.setText(Float.toString(dtRes.getPrecio()));
        txt_estadoR.setText(dtRes.GetEstado().toString());
        List<DtInfoReserva> infoRes = dtRes.GetInfoReservas();

        List<String> lnomser = new ArrayList<String>();
        infoRes.forEach(i -> lnomser.add(i.GetNombreArticulo()));

        //DefaultListModel<String> list2 = new DefaultListModel<>();

        Iterator it = lnomser.listIterator();
        int i = 0;
        //list2.addElement(lnomser.get(0));
        lnomser.forEach(k -> list2.addElement(k) );
        /*while(it.hasNext()){

            list2.addElement(lnomser.get(i));
            i++;
        }*/

        /*ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();
        DefaultListModel<String> list = new DefaultListModel<>();

        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            list.addElement(categorias.get(i).getNombre());
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }*/    /*

        */
        /* for (int i = 0; i==lnomser.size(); i++){

            list2.addElement(lnomser.get(i));
        }*/
        jList_reservasR.setModel(list2);
        this.idReserva=Integer.parseInt(cmb_reservasI.getSelectedItem().toString());
    }//GEN-LAST:event_cmb_reservasIItemStateChanged

    private void cmb_reservasIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_reservasIMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_reservasIMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //rty
        //Carga las Id de Reservas
        ArrayList<DtReserva> arrres = ICReserva.listarReservas();
        List<String> idReservas = new ArrayList<String>();
        arrres.forEach(i -> idReservas.add(Integer.toString(i.GetId()))); 
        cmb_reservasI.setModel(new DefaultComboBoxModel(idReservas.toArray()));
        txt_creacionR.setText("");
        txt_precioR.setText("");
        txt_estadoR.setText("");
        txt_cantidadR.setText("");
        txt_finicio.setText("");
        txt_ffin.setText("");
        jList_reservasR.clearSelection();
    }//GEN-LAST:event_formWindowOpened

    private void jList_reservasRValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_reservasRValueChanged
        DtReserva dtRes = ICReserva.ObtenerDatosReserva(this.idReserva);
        String nomart = jList_reservasR.getSelectedValue();
        List<DtInfoReserva> lir = new ArrayList<DtInfoReserva>(dtRes.GetInfoReservas());
        for(DtInfoReserva i: lir){
            if(i.GetNombreArticulo().equals(nomart)){
                txt_cantidadR.setText(Integer.toString(i.GetCantidad()));
                txt_finicio.setText(Integer.toString(i.GetFechaIni().getDia()) + "/" + Integer.toString(i.GetFechaIni().getMes()) + "/" + Integer.toString(i.GetFechaIni().getAnio()));
                txt_ffin.setText(Integer.toString(i.GetFechaFin().getDia()) + "/" + Integer.toString(i.GetFechaFin().getMes()) + "/" + Integer.toString(i.GetFechaFin().getAnio()));
            }
        }
    }//GEN-LAST:event_jList_reservasRValueChanged

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
            java.util.logging.Logger.getLogger(ConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_reservasI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList_reservasR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidadR1;
    private javax.swing.JLabel lbl_ffin;
    private javax.swing.JLabel lbl_finicio;
    private javax.swing.JLabel txt_cantidadR;
    private javax.swing.JLabel txt_creacionR;
    private javax.swing.JLabel txt_estadoR;
    private javax.swing.JLabel txt_ffin;
    private javax.swing.JLabel txt_finicio;
    private javax.swing.JLabel txt_precioR;
    // End of variables declaration//GEN-END:variables
}
