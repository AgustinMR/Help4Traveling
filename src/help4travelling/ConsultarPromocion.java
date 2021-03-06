/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Agustin
 */
public class ConsultarPromocion extends javax.swing.JFrame {
    DefaultListModel<String> list2 = new DefaultListModel<>();
    DefaultListModel<String> list3 = new DefaultListModel<>();
    private IControladorArticulo ICArticulo = Factory.GetInstance().getIControladorArticulo();
    /**
     * Creates new form AltaUsuario
     */
    public ConsultarPromocion() {
        initComponents();
    }

    private Image ScaledImage(Image img, int w, int h){
        BufferedImage resizedImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h,null);
        g2.dispose();
        return resizedImage;
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
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        cmb_consultar_promociones = new javax.swing.JComboBox<>();
        jLabel164 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        list_servs = new javax.swing.JList<>();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        lbl_prov = new javax.swing.JLabel();
        lbl_precioP = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbl_nom = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
        setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
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

        jLabel151.setBackground(java.awt.Color.darkGray);
        jLabel151.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel151.setForeground(java.awt.Color.darkGray);
        jLabel151.setText("Servicios asociados");
        getContentPane().add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel152.setBackground(java.awt.Color.darkGray);
        jLabel152.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel152.setForeground(java.awt.Color.darkGray);
        jLabel152.setText("PROMOCIONES");
        getContentPane().add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel163.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel163.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel163.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 620, 43, 43));

        cmb_consultar_promociones.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        cmb_consultar_promociones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_consultar_promociones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_consultar_promocionesItemStateChanged(evt);
            }
        });
        getContentPane().add(cmb_consultar_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 250, -1));

        jLabel164.setBackground(java.awt.Color.darkGray);
        jLabel164.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel164.setForeground(java.awt.Color.darkGray);
        jLabel164.setText("Proveedor:");
        getContentPane().add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        list_servs.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        list_servs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_servsMouseClicked(evt);
            }
        });
        list_servs.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_servsValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(list_servs);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 240, 370));

        jLabel165.setBackground(java.awt.Color.darkGray);
        jLabel165.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel165.setForeground(java.awt.Color.darkGray);
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 30, 20));

        jLabel166.setBackground(java.awt.Color.darkGray);
        jLabel166.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel166.setForeground(java.awt.Color.darkGray);
        jLabel166.setText("Precio total");
        getContentPane().add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel167.setBackground(java.awt.Color.darkGray);
        jLabel167.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel167.setForeground(java.awt.Color.darkGray);
        jLabel167.setText("Descuento");
        getContentPane().add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel168.setBackground(java.awt.Color.darkGray);
        jLabel168.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel168.setForeground(java.awt.Color.darkGray);
        jLabel168.setText("%");
        getContentPane().add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel170.setBackground(java.awt.Color.darkGray);
        jLabel170.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel170.setForeground(java.awt.Color.darkGray);
        jLabel170.setText("Ciudad Destino");
        getContentPane().add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel171.setBackground(java.awt.Color.darkGray);
        jLabel171.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel171.setForeground(java.awt.Color.darkGray);
        jLabel171.setText("Descripcion");
        getContentPane().add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel172.setBackground(java.awt.Color.darkGray);
        jLabel172.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel172.setForeground(java.awt.Color.darkGray);
        jLabel172.setText("Imagenes");
        getContentPane().add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel173.setBackground(java.awt.Color.darkGray);
        jLabel173.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel173.setForeground(java.awt.Color.darkGray);
        jLabel173.setText("Nombre");
        getContentPane().add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel174.setBackground(java.awt.Color.darkGray);
        jLabel174.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel174.setForeground(java.awt.Color.darkGray);
        jLabel174.setText("Ciudad Origen");
        getContentPane().add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel176.setBackground(new java.awt.Color(255, 255, 255));
        jLabel176.setOpaque(true);
        getContentPane().add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 230, 130));

        jLabel207.setBackground(new java.awt.Color(255, 255, 255));
        jLabel207.setOpaque(true);
        getContentPane().add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 220, 130));

        jLabel208.setBackground(new java.awt.Color(255, 255, 255));
        jLabel208.setOpaque(true);
        getContentPane().add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 220, 130));
        getContentPane().add(lbl_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(lbl_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(lbl_precioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(lbl_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));
        getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel169.setBackground(java.awt.Color.darkGray);
        jLabel169.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel169.setForeground(java.awt.Color.darkGray);
        jLabel169.setText("Nombre");
        getContentPane().add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel175.setBackground(java.awt.Color.darkGray);
        jLabel175.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel175.setForeground(java.awt.Color.darkGray);
        jLabel175.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel175.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 570, 130));

        jLabel177.setBackground(java.awt.Color.darkGray);
        jLabel177.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel177.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 250, 20));

        jLabel178.setBackground(java.awt.Color.darkGray);
        jLabel178.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel178.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 250, 20));

        jLabel179.setBackground(java.awt.Color.darkGray);
        jLabel179.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel179.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 20));

        jLabel180.setBackground(java.awt.Color.darkGray);
        jLabel180.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel180.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 250, 20));

        jLabel181.setBackground(java.awt.Color.darkGray);
        jLabel181.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel181.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 250, 20));

        jLabel182.setBackground(java.awt.Color.darkGray);
        jLabel182.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel182.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 250, 20));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 110, 1230, 590));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ver información de promoción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel163MouseClicked

    private void cmb_consultar_promocionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_consultar_promocionesItemStateChanged
        String nickP, nombreA;
        if(!cmb_consultar_promociones.getSelectedItem().toString().trim().isEmpty()){
            nickP = cmb_consultar_promociones.getSelectedItem().toString().substring(0, cmb_consultar_promociones.getSelectedItem().toString().lastIndexOf(","));
            nombreA = cmb_consultar_promociones.getSelectedItem().toString().substring(cmb_consultar_promociones.getSelectedItem().toString().lastIndexOf(",")+2);
            DtPromocion prom = ManejadorSQL.GetInstance().devolverPromocion(nickP, nombreA);
            jLabel178.setText(nickP);
            jLabel177.setText(nombreA);
            jLabel165.setText(""+prom.GetDescuento());
            jLabel179.setText(""+prom.GetPrecio());
            DefaultListModel lm = new DefaultListModel();
            for(int x = 0; x < prom.GetServicios().size(); x++){
                lm.addElement(prom.GetServicios().get(x));
            }
            list_servs.setModel(lm);

        }
    }//GEN-LAST:event_cmb_consultar_promocionesItemStateChanged

    private void list_servsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_servsMouseClicked
        
        if(!list_servs.getSelectedValue().isEmpty()){
            String nickP, nombreA;
            if(!cmb_consultar_promociones.getSelectedItem().toString().trim().isEmpty()){
                nickP = cmb_consultar_promociones.getSelectedItem().toString().substring(0, cmb_consultar_promociones.getSelectedItem().toString().lastIndexOf(","));
                nombreA = list_servs.getSelectedValue();
                DtServicio ret = ICArticulo.datosServicio(nombreA, nickP);
                jLabel180.setText(ret.getNombre());
                jLabel181.setText(ret.getCiudadOrigen());
                jLabel182.setText(ret.getCiudadDestino());
                jLabel175.setText(ret.getDescripcion());

                jLabel176.setIcon(null);
                if(ManejadorSQL.GetInstance().selectImgServicio("imagen1", nickP, nombreA) != null){
                    Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen1", nickP, nombreA)).getImage();
                    ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel176.getWidth(),jLabel176.getHeight()));
                    jLabel176.setIcon(icon);
                }

                jLabel208.setIcon(null);
                if(ManejadorSQL.GetInstance().selectImgServicio("imagen2", nickP, nombreA) != null){
                    Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen2", nickP, nombreA)).getImage();
                    ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel208.getWidth(),jLabel208.getHeight()));
                    jLabel208.setIcon(icon);
                }

                jLabel207.setIcon(null);
                if(ManejadorSQL.GetInstance().selectImgServicio("imagen3", nickP, nombreA) != null){
                    Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen3", nickP, nombreA)).getImage();
                    ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel207.getWidth(),jLabel207.getHeight()));
                    jLabel207.setIcon(icon);
                }
            }
        }
    }//GEN-LAST:event_list_servsMouseClicked

    private void list_servsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_servsValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_list_servsValueChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                ArrayList<DtPromocion> promos = ICArticulo.listarPromociones();
        DefaultComboBoxModel listModel = new DefaultComboBoxModel();
        for(int x = 0; x < promos.size(); x++){
            listModel.addElement(promos.get(x).getNickProv() + ", " + promos.get(x).GetNombre());
        }
        cmb_consultar_promociones.setModel(listModel);
        
        list2.clear();
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
            java.util.logging.Logger.getLogger(ConsultarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarPromocion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_consultar_promociones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JLabel lbl_precioP;
    private javax.swing.JLabel lbl_prov;
    private javax.swing.JList<String> list_servs;
    // End of variables declaration//GEN-END:variables
}
