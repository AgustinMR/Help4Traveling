/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Agustin
 */
public class IngresarServicio extends javax.swing.JFrame {
    File fileServicio1;
    File fileServicio2;
    File fileServicio3;
    DefaultListModel<String> list2 = new DefaultListModel<>();
    DefaultListModel<String> list3 = new DefaultListModel<>();
    private IControladorArticulo ICArticulo;
    private IControladorCategoria ICCategoria;
    private IControladorUsuario ICUsuario;
    /**
     * Creates new form AltaUsuario
     */
    public IngresarServicio() {
        initComponents();
        ICArticulo = Factory.GetInstance().getIControladorArticulo();
        ICCategoria = Factory.GetInstance().getIControladorCategoria();
        ICUsuario = Factory.GetInstance().getIControladorUsuario();
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
        jLabel96 = new javax.swing.JLabel();
        txt_precioS = new javax.swing.JTextField();
        lab_destinoS = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbl_imagen3 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        cmb_proveedorS = new javax.swing.JComboBox<>();
        lab_origenS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcionS = new javax.swing.JTextPane();
        lbl_precio = new javax.swing.JLabel();
        txt_nombreS = new javax.swing.JTextField();
        cmb_destinoS = new javax.swing.JComboBox<>();
        cmb_origenS = new javax.swing.JComboBox<>();
        chek_destinoS = new java.awt.Checkbox();
        jScrollPane18 = new javax.swing.JScrollPane();
        lis_categoria = new javax.swing.JList<>();
        jScrollPane19 = new javax.swing.JScrollPane();
        lis_categoriaS = new javax.swing.JList<>();
        jLabel103 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbl_imagen2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lbl_imagen1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab_origenS1 = new javax.swing.JLabel();
        lab_origenS2 = new javax.swing.JLabel();
        lab_origenS3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
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

        jLabel96.setBackground(java.awt.Color.darkGray);
        jLabel96.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel96.setForeground(java.awt.Color.darkGray);
        jLabel96.setText("Nombre");
        getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 20));

        txt_precioS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_precioS.setText("0");
        txt_precioS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioSActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 120, -1));

        lab_destinoS.setBackground(java.awt.Color.darkGray);
        lab_destinoS.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lab_destinoS.setForeground(java.awt.Color.darkGray);
        lab_destinoS.setText("Ciudad Destino");
        getContentPane().add(lab_destinoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 20));

        jLabel98.setBackground(java.awt.Color.darkGray);
        jLabel98.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel98.setForeground(java.awt.Color.darkGray);
        jLabel98.setText("Descripcion");
        getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, 20));

        jLabel99.setBackground(java.awt.Color.darkGray);
        jLabel99.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel99.setForeground(java.awt.Color.darkGray);
        jLabel99.setText("CATEGORIAS SELECCIONADAS");
        getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jButton2.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton2.setText("Imagen 3");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));
        getContentPane().add(lbl_imagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel72.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel72.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel72.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 43, 43));

        cmb_proveedorS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmb_proveedorS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 240, -1));

        lab_origenS.setBackground(java.awt.Color.darkGray);
        lab_origenS.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lab_origenS.setForeground(java.awt.Color.darkGray);
        lab_origenS.setText("Ciudad Origen");
        getContentPane().add(lab_origenS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 120, -1));

        txt_descripcionS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txt_descripcionS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 500, 140));

        lbl_precio.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        lbl_precio.setText("Precio");
        getContentPane().add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        txt_nombreS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(txt_nombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 240, -1));

        cmb_destinoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmb_destinoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 240, 20));

        cmb_origenS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmb_origenS, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 240, 20));

        chek_destinoS.setBackground(java.awt.Color.white);
        chek_destinoS.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        chek_destinoS.setLabel("Ingresar destino");
        chek_destinoS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chek_destinoSMouseClicked(evt);
            }
        });
        chek_destinoS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chek_destinoSItemStateChanged(evt);
            }
        });
        getContentPane().add(chek_destinoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, -1, -1));

        jScrollPane18.setViewportView(lis_categoria);

        getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 530));

        lis_categoriaS.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lis_categoriaSValueChanged(evt);
            }
        });
        jScrollPane19.setViewportView(lis_categoriaS);

        getContentPane().add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 230, 530));

        jLabel103.setBackground(java.awt.Color.darkGray);
        jLabel103.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel103.setForeground(java.awt.Color.darkGray);
        jLabel103.setText("Proveedor");
        getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ingreso de servicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, -1, -1));

        jLabel107.setBackground(java.awt.Color.darkGray);
        jLabel107.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel107.setForeground(java.awt.Color.darkGray);
        jLabel107.setText("CATEGORIAS DISPONIBLES");
        getContentPane().add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/back.png"))); // NOI18N
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 36, 36));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/next.png"))); // NOI18N
        jLabel47.setText("jLabel47");
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 36, 36));
        getContentPane().add(lbl_imagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jButton3.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton3.setText("Imagen 1");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));
        getContentPane().add(lbl_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jButton6.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton6.setText("Imagen 2");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        lab_origenS1.setBackground(java.awt.Color.darkGray);
        lab_origenS1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lab_origenS1.setForeground(new java.awt.Color(0, 102, 204));
        getContentPane().add(lab_origenS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 500, 30));

        lab_origenS2.setBackground(java.awt.Color.darkGray);
        lab_origenS2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lab_origenS2.setForeground(new java.awt.Color(0, 102, 204));
        getContentPane().add(lab_origenS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 500, 30));

        lab_origenS3.setBackground(java.awt.Color.darkGray);
        lab_origenS3.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lab_origenS3.setForeground(new java.awt.Color(0, 102, 204));
        getContentPane().add(lab_origenS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 500, 30));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1218, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_precioSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioSActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        fileServicio3 = fc.getSelectedFile();
        String ruta = fileServicio3.getAbsolutePath();
        lab_origenS1.setText(ruta);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:u
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        // TODO add your handling code here:
        if(txt_nombreS.getText().isEmpty() || txt_descripcionS.getText().isEmpty() || list2.size()==0 ){
            JOptionPane.showMessageDialog(null, "Ingrese campos, verifique y vuelva a intentar.","Campos sin completar",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(chek_destinoS.getState()){
                //ciudadD
                ArrayList<String> cats = new ArrayList<String>();
                for(int i=0;i < lis_categoriaS.getModel().getSize();i++){
                    cats.add(lis_categoriaS.getModel().getElementAt(i));
                }
                DtServicio Serv = new DtServicio(txt_nombreS.getText().trim(),cmb_proveedorS.getSelectedItem().toString().trim(),Float.valueOf(txt_precioS.getText().trim()),txt_descripcionS.getText().trim(),cats,cmb_origenS.getSelectedItem().toString().trim(),cmb_destinoS.getSelectedItem().toString().trim());
                if(!ICArticulo.insertarServicio(Serv))
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el servicio.","Error",JOptionPane.WARNING_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(null, "Servicio Ingresado");
                    if(lbl_imagen1.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio1, "imagen1", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(lbl_imagen2.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio2, "imagen2", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(lbl_imagen3.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio3, "imagen3", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                //(String nombre, String nickProv, float precio, String descripcion, ArrayList<String> categorias, String ciudadOrigen, String ciudadDestino)
            }
            else{
                //ciudadO
                ArrayList<String> cats = new ArrayList<String>();
                for(int i=0;i<list2.size();i++){
                    cats.add(list2.getElementAt(i));
                }
                DtServicio Serv = new DtServicio(txt_nombreS.getText().trim(),cmb_proveedorS.getSelectedItem().toString().trim(),Float.valueOf(txt_precioS.getText().trim()),txt_descripcionS.getText().trim(),cats,cmb_origenS.getSelectedItem().toString().trim(),null);;
                if(!ICArticulo.insertarServicio(Serv))
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el servicio.","Error",JOptionPane.WARNING_MESSAGE);
                else{
                    JOptionPane.showMessageDialog(null, "Servicio Ingresado");
                    if(lbl_imagen1.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio1, "imagen1", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(lbl_imagen2.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio2, "imagen2", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(lbl_imagen3.getIcon() != null){
                        try {
                            ManejadorSQL.GetInstance().insertImgServicio(fileServicio3, "imagen3", Serv.getNickProveedor(), Serv.getNombre());
                        }
                        catch (FileNotFoundException ex) {
                            Logger.getLogger(Help4Travelling.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }

        txt_nombreS.setText("");
        txt_precioS.setText("");
        txt_descripcionS.setText("");
        list2.clear();
    }//GEN-LAST:event_jLabel72MouseClicked

    private void chek_destinoSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chek_destinoSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chek_destinoSMouseClicked

    private void chek_destinoSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chek_destinoSItemStateChanged
        if (chek_destinoS.getState()){
            lab_destinoS.setVisible(true);
            cmb_destinoS.setVisible(true);
        }
        else{
            lab_destinoS.setVisible(false);
            cmb_destinoS.setVisible(false);
        }
    }//GEN-LAST:event_chek_destinoSItemStateChanged

    private void lis_categoriaSValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lis_categoriaSValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lis_categoriaSValueChanged

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        if(lis_categoriaS.getSelectedValue() != null){
            int index = lis_categoriaS.getSelectedIndex();
            list2.remove(index);
        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        //DefaultMutableTreeNode Arbol = (DefaultMutableTreeNode)tree_servicios2.getLastSelectedPathComponent();
        //String sel = (String) Arbol.getUserObject();
        //list2.addElement(lis_categoria.getSelectedValue());

        if(!list2.contains(lis_categoria.getSelectedValue())){
            list2.addElement(lis_categoria.getSelectedValue());
            lis_categoriaS.setModel(list2);
        }
        /*
        String [] element = new String[5];
        element[0]=sel;
        lis_categoria.setListData(element);*/
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        fileServicio2 = fc.getSelectedFile();
        String ruta = fileServicio2.getAbsolutePath();
        lab_origenS2.setText(ruta);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        fileServicio1 = fc.getSelectedFile();
        String ruta = fileServicio1.getAbsolutePath();
        lab_origenS3.setText(ruta);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        list2.clear();
        //txt_descripcionS.setText(""); 
        txt_descripcionS.setText("");
        txt_nombreS.setText("");
        txt_precioS.setText("");
        txt_precioS.setText("");
        //qwe
        lab_destinoS.setVisible(false);
        cmb_destinoS.setVisible(false);
        chek_destinoS.setState(false);
        //Seteo el combo cmb_proveedorS
        cmb_proveedorS.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
        cmb_origenS.setModel(new DefaultComboBoxModel(ICArticulo.listaDeCiudades().toArray()));
        cmb_destinoS.setModel(new DefaultComboBoxModel(ICArticulo.listaDeCiudades().toArray()));
        
        ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();
        DefaultListModel<String> list = new DefaultListModel<>();
        
        
        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            list.addElement(categorias.get(i).getNombre());
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }    /*  
        //HashMap<String, DefaultMutableTreeNode> tree2 = new HashMap();
        tree2.put("todas", tree2);
        for (int j = 0; j < max+1; j++){
            for (DtCategoria categoria : categorias) {
                if(j == categoria.getNivel()){
                    DefaultMutableTreeNode cat = new DefaultMutableTreeNode();
                    cat.setUserObject(categoria.getNombre());
                    for(String name : tree2.keySet()){
                        if(name.equals(categoria.getNombrePadre()))
                            tree2.get(name).add(cat);
                    }
                    //tree.add(cat);
                    tree2.put(categoria.getNombre(), cat);
                }
            }
        }
        
        //DefaultTreeModel modeloTree = new DefaultTreeModel(tree);
        //*/
        
        
        lis_categoria.setModel(list);
        
        //tree_servicios2.setModel(modeloTree);
        
        //listar categorias!
        //devuelve arry list dtcategoria
        /*ArrayList<DtCategoria> listdtcat = new ArrayList();
        listdtcat = ICCategoria.listarCategorias();
        ArrayList<String> lista = new ArrayList(); 
        listdtcat.forEach(i -> lista.add(((DtCategoria)i).getNombre()));*/
        //lista posse la lista de los nombres de la categorias
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
            java.util.logging.Logger.getLogger(IngresarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new IngresarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox chek_destinoS;
    private javax.swing.JComboBox<String> cmb_destinoS;
    private javax.swing.JComboBox<String> cmb_origenS;
    private javax.swing.JComboBox<String> cmb_proveedorS;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JLabel lab_destinoS;
    private javax.swing.JLabel lab_origenS;
    private javax.swing.JLabel lab_origenS1;
    private javax.swing.JLabel lab_origenS2;
    private javax.swing.JLabel lab_origenS3;
    private javax.swing.JLabel lbl_imagen1;
    private javax.swing.JLabel lbl_imagen2;
    private javax.swing.JLabel lbl_imagen3;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JList<String> lis_categoria;
    private javax.swing.JList<String> lis_categoriaS;
    private javax.swing.JTextPane txt_descripcionS;
    private javax.swing.JTextField txt_nombreS;
    private javax.swing.JTextField txt_precioS;
    // End of variables declaration//GEN-END:variables
}