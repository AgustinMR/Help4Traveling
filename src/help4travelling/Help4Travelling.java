package help4travelling;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Help4Travelling extends javax.swing.JFrame {
    DefaultListModel<String> list2 = new DefaultListModel<>();
    DefaultListModel<String> list3 = new DefaultListModel<>();
    private IControladorArticulo ICArticulo;
    private IControladorCategoria ICCategoria;
    private IControladorReserva ICReserva;
    private IControladorUsuario ICUsuario;
    private int idReserva;

    public Help4Travelling() {
        initComponents();
        ICArticulo = Factory.GetInstance().getIControladorArticulo();
        ICCategoria = Factory.GetInstance().getIControladorCategoria();
        ICReserva = Factory.GetInstance().getIControladorReserva();
        ICUsuario = Factory.GetInstance().getIControladorUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_mostrar_modificaciones = new javax.swing.JLabel();
        lbl_mostrar_eliminaciones = new javax.swing.JLabel();
        lbl_acercaDe = new javax.swing.JLabel();
        lbl_cerrar = new javax.swing.JLabel();
        lbl_mostrar_registros = new javax.swing.JLabel();
        lbl_mostrar_consultas = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_ingreso_usuarios = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txt_nickname = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        lbl_nombreEmpresa = new javax.swing.JLabel();
        txt_nombreEmpresa = new javax.swing.JTextField();
        txt_linkEmpresa = new javax.swing.JTextField();
        lbl_linkEmpresa = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        cmb_mes = new javax.swing.JComboBox<>();
        cmb_dia = new javax.swing.JComboBox<>();
        jLabel161 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        chk_cliente = new javax.swing.JRadioButton();
        chk_proveedor = new javax.swing.JRadioButton();
        cmb_anio_u = new javax.swing.JComboBox<>();
        lbl_mostrar_acercaDe = new javax.swing.JLabel();
        lbl_mostrar_cerrar = new javax.swing.JLabel();
        panel_izq = new javax.swing.JPanel();
        ingreso_reservas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ingreso_categorias = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ingreso_usuarios = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ingreso_servicios = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ingreso_promociones = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        panel_izq_acerca_de = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        panel_izq_eliminaciones = new javax.swing.JPanel();
        eliminacion_reservas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        panel_izq_actualizaciones = new javax.swing.JPanel();
        actualizacion_reservas = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        actualizacion_servicios = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        panel_izq_consultas = new javax.swing.JPanel();
        consultar_proveedores = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        consultar_clientes = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        consultar_servicios = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        consultar_promociones = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        consultar_reservas = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        panel_ingreso_categorias = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        lab_categoria = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        cmb_categoria = new javax.swing.JComboBox<>();
        chek_padre = new java.awt.Checkbox();
        panel_ingreso_promociones = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        cmb_ing_prom = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        lbl_precioN = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_serviciosInc = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        list_serviciosProv = new javax.swing.JList<>();
        lbl_precioProm = new javax.swing.JLabel();
        btn_rmP = new javax.swing.JLabel();
        btn_addP = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        panel_actualizar_servicio = new javax.swing.JPanel();
        img_actualizar_servicios = new javax.swing.JFileChooser();
        jLabel110 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        cmb_destino = new javax.swing.JComboBox<>();
        jLabel130 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_desc = new javax.swing.JTextPane();
        jLabel131 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        cmb_actualizar_servicio = new javax.swing.JComboBox<>();
        cmb_origen = new javax.swing.JComboBox<>();
        jLabel135 = new javax.swing.JLabel();
        txt_p = new javax.swing.JTextField();
        jLabel203 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel218 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        list_catServicio = new javax.swing.JList<>();
        btn_addP1 = new javax.swing.JLabel();
        btn_rmP1 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tree_actualizar_servicios = new javax.swing.JTree();
        panel_actualizar_reserva = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        lbl_estadoActual = new javax.swing.JLabel();
        cmb_estadoSel = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_reservas = new javax.swing.JTable();
        panel_eliminar_reserva = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel140 = new javax.swing.JLabel();
        panel_consultas_servicios = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tree_servicios = new javax.swing.JTree();
        jLabel153 = new javax.swing.JLabel();
        cmb_serviciosXcat = new javax.swing.JComboBox<>();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_desc1 = new javax.swing.JLabel();
        lbl_origen1 = new javax.swing.JLabel();
        lbl_destino1 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        lbl_proveedor1 = new javax.swing.JLabel();
        panel_consultas_promociones = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
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
        jLabel178 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        lbl_prov = new javax.swing.JLabel();
        lbl_precioP = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lbl_nom = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        panel_ingreso_reservas = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        cmb_cliente = new javax.swing.JComboBox<>();
        cmb_proveedor = new javax.swing.JComboBox<>();
        jLabel123 = new javax.swing.JLabel();
        cmb_promocion = new javax.swing.JComboBox<>();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        tex_precio = new javax.swing.JTextField();
        tex_precioU = new javax.swing.JTextField();
        cmb_servicio = new javax.swing.JComboBox<>();
        lab_cantidad1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_ingreso_reservas = new javax.swing.JTable();
        jLabel90 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        cmb_mes1 = new javax.swing.JComboBox<>();
        cmb_anio1 = new javax.swing.JComboBox<>();
        cmb_dia1 = new javax.swing.JComboBox<>();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        cmb_mes2 = new javax.swing.JComboBox<>();
        cmb_anio2 = new javax.swing.JComboBox<>();
        cmb_dia2 = new javax.swing.JComboBox<>();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        cmb_cantidad = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        lab_cantidad2 = new javax.swing.JLabel();
        lab_cantidad3 = new javax.swing.JLabel();
        tex_precioU1 = new javax.swing.JTextField();
        panel_ingreso_servicios = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        txt_precioS = new javax.swing.JTextField();
        lab_destinoS = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        cmb_proveedorS = new javax.swing.JComboBox<>();
        lab_origenS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcionS = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        java.util.List<String> listaCategoria = new ArrayList<String>();
        tree_servicios2 = new javax.swing.JTree();
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
        jLabel107 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        panel_consultas_reservas = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        cmb_reservasI = new javax.swing.JComboBox<>();
        jLabel145 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList_reservasR = new javax.swing.JList<>();
        lbl_ffin = new javax.swing.JLabel();
        lbl_finicio = new javax.swing.JLabel();
        txt_cantidadR = new javax.swing.JTextField();
        txt_finicio = new javax.swing.JTextField();
        txt_ffin = new javax.swing.JTextField();
        txt_creacionR = new javax.swing.JTextField();
        txt_precioR = new javax.swing.JTextField();
        txt_estadoR = new javax.swing.JTextField();
        jLabel221 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        lbl_cantidadR1 = new javax.swing.JLabel();
        panel_consultas_clientes = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        ListaCli = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        Articulo = new javax.swing.JList<>();
        jLabel214 = new javax.swing.JLabel();
        AnioCli = new javax.swing.JTextField();
        jLabel215 = new javax.swing.JLabel();
        NomCli = new javax.swing.JTextField();
        jLabel216 = new javax.swing.JLabel();
        ApeCli = new javax.swing.JTextField();
        DiaCli = new javax.swing.JTextField();
        MesCli = new javax.swing.JTextField();
        jLabel217 = new javax.swing.JLabel();
        EmailCli = new javax.swing.JTextField();
        jLabel219 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        PrecioCli = new javax.swing.JTextField();
        FCCli = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        ReservasCli = new javax.swing.JList<>();
        MesCli1 = new javax.swing.JTextField();
        panel_consultas_proveedores = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        cmb_proveedorP = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList_ServiciosP = new javax.swing.JList<>();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt_DescripcionP = new javax.swing.JTextPane();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        tex_anio = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        txt_NombreP = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        txt_ApellidoP = new javax.swing.JTextField();
        tex_dia = new javax.swing.JTextField();
        tex_mes = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        txt_emailP = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        txt_NombreEmpresaP = new javax.swing.JTextField();
        txt_LinkEmpresaP = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        tex_destino = new javax.swing.JTextField();
        tex_origen = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help4Travelling");
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1210, 680));
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 1500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 144, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setIconTextGap(8);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 5, 78, 77));

        jLabel2.setBackground(new java.awt.Color(255, 128, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 198, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-1.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setName("jLabel11"); // NOI18N
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 40));

        jLabel5.setBackground(new java.awt.Color(51, 54, 56));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1212, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-2.png"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setName("jLabel12"); // NOI18N
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-4.png"))); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setName("jLabel13"); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/notebook-3.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 40));

        lbl_mostrar_modificaciones.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_modificaciones.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_modificaciones.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_modificaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_modificaciones.setText("Modificaciones   ");
        lbl_mostrar_modificaciones.setName("lbl_mostrar_modificaciones"); // NOI18N
        lbl_mostrar_modificaciones.setOpaque(true);
        getContentPane().add(lbl_mostrar_modificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));
        lbl_mostrar_modificaciones.setVisible(false);

        lbl_mostrar_eliminaciones.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_eliminaciones.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_eliminaciones.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_eliminaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_eliminaciones.setText("Eliminaciones   ");
        lbl_mostrar_eliminaciones.setName("lbl_mostrar_eliminaciones"); // NOI18N
        lbl_mostrar_eliminaciones.setOpaque(true);
        getContentPane().add(lbl_mostrar_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 30));
        lbl_mostrar_eliminaciones.setVisible(false);

        lbl_acercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/info.png"))); // NOI18N
        lbl_acercaDe.setText("jLabel20");
        lbl_acercaDe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_acercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_acercaDe.setName("lbl_info"); // NOI18N
        lbl_acercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_acercaDeMouseExited(evt);
            }
        });
        getContentPane().add(lbl_acercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 605, 30, 30));

        lbl_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        lbl_cerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_cerrar.setName("lbl_salir"); // NOI18N
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
        });
        getContentPane().add(lbl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 643, 30, 30));

        lbl_mostrar_registros.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_registros.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_registros.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_registros.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_registros.setText("Registros   ");
        lbl_mostrar_registros.setName("lbl_mostrar_registros"); // NOI18N
        lbl_mostrar_registros.setVisible(false);
        lbl_mostrar_registros.setOpaque(true);
        getContentPane().add(lbl_mostrar_registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        lbl_mostrar_consultas.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_consultas.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_consultas.setForeground(new java.awt.Color(254, 254, 254));
        lbl_mostrar_consultas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_consultas.setText("Consultas   ");
        lbl_mostrar_consultas.setName("lbl_mostrar_consultas"); // NOI18N
        lbl_mostrar_consultas.setOpaque(true);
        getContentPane().add(lbl_mostrar_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, 30));
        lbl_mostrar_consultas.setVisible(false);

        lbl_menu.setBackground(new java.awt.Color(1, 82, 160));
        lbl_menu.setFont(new java.awt.Font("FreeSans", 0, 36)); // NOI18N
        lbl_menu.setForeground(java.awt.Color.white);
        lbl_menu.setText("                                           ");
        lbl_menu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_menu.setOpaque(true);
        getContentPane().add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 1120, 80));

        jLabel7.setBackground(new java.awt.Color(51, 54, 56));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 50, 590));

        panel_ingreso_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_ingreso_usuarios.setLayout(null);

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel81.setText("jLabel4");
        jLabel81.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel81.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81MouseClicked(evt);
            }
        });
        panel_ingreso_usuarios.add(jLabel81);
        jLabel81.setBounds(995, 5, 30, 30);

        jLabel82.setBackground(java.awt.Color.darkGray);
        jLabel82.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel82.setForeground(java.awt.Color.darkGray);
        jLabel82.setText("Fecha Nacimiento");
        panel_ingreso_usuarios.add(jLabel82);
        jLabel82.setBounds(30, 320, 130, 20);

        jLabel84.setBackground(new java.awt.Color(33, 33, 33));
        jLabel84.setOpaque(true);
        panel_ingreso_usuarios.add(jLabel84);
        jLabel84.setBounds(-2, 0, 1310, 40);

        jLabel85.setBackground(java.awt.Color.darkGray);
        jLabel85.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel85.setForeground(java.awt.Color.darkGray);
        jLabel85.setText("Imagen(opcional)");
        panel_ingreso_usuarios.add(jLabel85);
        jLabel85.setBounds(460, 150, 150, 40);

        txt_nickname.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nickname);
        txt_nickname.setBounds(170, 160, 270, 25);

        jLabel86.setBackground(java.awt.Color.darkGray);
        jLabel86.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel86.setForeground(java.awt.Color.darkGray);
        jLabel86.setText("Nombre");
        panel_ingreso_usuarios.add(jLabel86);
        jLabel86.setBounds(30, 210, 80, 20);

        txt_nombre.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nombre);
        txt_nombre.setBounds(170, 210, 270, 25);

        jLabel87.setBackground(java.awt.Color.darkGray);
        jLabel87.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel87.setForeground(java.awt.Color.darkGray);
        jLabel87.setText("Apellido");
        panel_ingreso_usuarios.add(jLabel87);
        jLabel87.setBounds(30, 260, 80, 20);

        txt_apellido.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_apellido);
        txt_apellido.setBounds(170, 260, 270, 25);

        jLabel88.setBackground(java.awt.Color.darkGray);
        jLabel88.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel88.setForeground(java.awt.Color.darkGray);
        jLabel88.setText("E-mail");
        panel_ingreso_usuarios.add(jLabel88);
        jLabel88.setBounds(30, 380, 50, 20);

        txt_email.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_email);
        txt_email.setBounds(170, 380, 270, 25);

        jLabel89.setBackground(java.awt.Color.darkGray);
        jLabel89.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel89.setForeground(java.awt.Color.darkGray);
        jLabel89.setText("¿Qué deseas ingresar?");
        panel_ingreso_usuarios.add(jLabel89);
        jLabel89.setBounds(20, 50, 190, 40);

        jButton1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_ingreso_usuarios.add(jButton1);
        jButton1.setBounds(590, 160, 150, 20);

        jLabel37.setText("Aqui se mostrara imagen");
        panel_ingreso_usuarios.add(jLabel37);
        jLabel37.setBounds(460, 200, 550, 300);

        lbl_nombreEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lbl_nombreEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_nombreEmpresa.setText("Nombre empresa");
        panel_ingreso_usuarios.add(lbl_nombreEmpresa);
        lbl_nombreEmpresa.setBounds(30, 430, 120, 20);
        lbl_nombreEmpresa.setVisible(false);

        txt_nombreEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_nombreEmpresa);
        txt_nombreEmpresa.setBounds(170, 430, 270, 25);
        txt_nombreEmpresa.setVisible(false);

        txt_linkEmpresa.setFont(new java.awt.Font("Nimbus Sans", 0, 14)); // NOI18N
        panel_ingreso_usuarios.add(txt_linkEmpresa);
        txt_linkEmpresa.setBounds(170, 480, 270, 25);
        txt_linkEmpresa.setVisible(false);

        lbl_linkEmpresa.setBackground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lbl_linkEmpresa.setForeground(java.awt.Color.darkGray);
        lbl_linkEmpresa.setText("Link empresa");
        panel_ingreso_usuarios.add(lbl_linkEmpresa);
        lbl_linkEmpresa.setBounds(30, 480, 100, 19);
        lbl_linkEmpresa.setVisible(false);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel71.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel71.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel71.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        jLabel71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel71KeyPressed(evt);
            }
        });
        panel_ingreso_usuarios.add(jLabel71);
        jLabel71.setBounds(980, 540, 45, 46);

        jLabel159.setBackground(java.awt.Color.darkGray);
        jLabel159.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel159.setForeground(java.awt.Color.darkGray);
        jLabel159.setText("año");
        panel_ingreso_usuarios.add(jLabel159);
        jLabel159.setBounds(390, 300, 30, 20);

        cmb_mes.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        panel_ingreso_usuarios.add(cmb_mes);
        cmb_mes.setBounds(270, 320, 70, 20);
        cmb_mes.removeAllItems();
        for(int x = 1; x <= 12; x++){
            cmb_mes.addItem(""+x);
        }

        cmb_dia.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_dia.setAutoscrolls(true);
        panel_ingreso_usuarios.add(cmb_dia);
        cmb_dia.setBounds(170, 320, 70, 20);
        cmb_dia.removeAllItems();
        for(int x = 1; x <= 31; x++){
            cmb_dia.addItem(""+x);
        }

        jLabel161.setBackground(java.awt.Color.darkGray);
        jLabel161.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel161.setForeground(java.awt.Color.darkGray);
        jLabel161.setText("Nickname");
        panel_ingreso_usuarios.add(jLabel161);
        jLabel161.setBounds(30, 160, 80, 20);

        jLabel209.setBackground(java.awt.Color.darkGray);
        jLabel209.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel209.setForeground(java.awt.Color.darkGray);
        jLabel209.setText("dia");
        panel_ingreso_usuarios.add(jLabel209);
        jLabel209.setBounds(190, 300, 30, 20);

        jLabel210.setBackground(java.awt.Color.darkGray);
        jLabel210.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel210.setForeground(java.awt.Color.darkGray);
        jLabel210.setText("/");
        panel_ingreso_usuarios.add(jLabel210);
        jLabel210.setBounds(350, 320, 10, 20);

        jLabel211.setBackground(java.awt.Color.darkGray);
        jLabel211.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel211.setForeground(java.awt.Color.darkGray);
        jLabel211.setText("mes");
        panel_ingreso_usuarios.add(jLabel211);
        jLabel211.setBounds(290, 300, 30, 20);

        jLabel212.setBackground(java.awt.Color.darkGray);
        jLabel212.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel212.setForeground(java.awt.Color.darkGray);
        jLabel212.setText("/");
        panel_ingreso_usuarios.add(jLabel212);
        jLabel212.setBounds(250, 320, 10, 20);

        chk_cliente.setBackground(java.awt.Color.white);
        buttonGroup1.add(chk_cliente);
        chk_cliente.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        chk_cliente.setSelected(true);
        chk_cliente.setText("Cliente");
        chk_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chk_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_clienteMouseClicked(evt);
            }
        });
        chk_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_clienteActionPerformed(evt);
            }
        });
        panel_ingreso_usuarios.add(chk_cliente);
        chk_cliente.setBounds(70, 90, 69, 23);

        chk_proveedor.setBackground(java.awt.Color.white);
        buttonGroup1.add(chk_proveedor);
        chk_proveedor.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        chk_proveedor.setText("Proveedor");
        chk_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chk_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_proveedorMouseClicked(evt);
            }
        });
        chk_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_proveedorActionPerformed(evt);
            }
        });
        panel_ingreso_usuarios.add(chk_proveedor);
        chk_proveedor.setBounds(170, 90, 100, 20);

        cmb_anio_u.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        panel_ingreso_usuarios.add(cmb_anio_u);
        cmb_anio_u.setBounds(365, 320, 70, 20);
        for(int x = 1950; x <= 2020; x++){
            cmb_anio_u.addItem(""+x);
        }

        getContentPane().add(panel_ingreso_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 150, 110));
        getContentPane().remove(panel_ingreso_usuarios);
        getContentPane().add(panel_ingreso_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_usuarios.setVisible(false);

        lbl_mostrar_acercaDe.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_acercaDe.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_acercaDe.setForeground(java.awt.Color.white);
        lbl_mostrar_acercaDe.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_acercaDe.setText("Acerca de   ");
        lbl_mostrar_acercaDe.setOpaque(true);
        getContentPane().add(lbl_mostrar_acercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 130, 30));
        lbl_mostrar_acercaDe.setVisible(false);

        lbl_mostrar_cerrar.setBackground(java.awt.Color.darkGray);
        lbl_mostrar_cerrar.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N
        lbl_mostrar_cerrar.setForeground(java.awt.Color.white);
        lbl_mostrar_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_mostrar_cerrar.setText("Salir   ");
        lbl_mostrar_cerrar.setOpaque(true);
        getContentPane().add(lbl_mostrar_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 130, 30));
        lbl_mostrar_cerrar.setVisible(false);

        panel_izq.setBackground(java.awt.Color.darkGray);
        panel_izq.setLayout(null);

        ingreso_reservas.setBackground(java.awt.Color.darkGray);
        ingreso_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_reservasMouseExited(evt);
            }
        });
        ingreso_reservas.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_reservas.add(jLabel15);
        jLabel15.setBounds(90, 35, 50, 50);

        jLabel20.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("RESERVAS");
        ingreso_reservas.add(jLabel20);
        jLabel20.setBounds(65, 80, 100, 40);

        panel_izq.add(ingreso_reservas);
        ingreso_reservas.setBounds(215, 40, 215, 150);

        ingreso_categorias.setBackground(java.awt.Color.darkGray);
        ingreso_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_categorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_categoriasMouseExited(evt);
            }
        });
        ingreso_categorias.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/list.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_categorias.add(jLabel10);
        jLabel10.setBounds(90, 30, 40, 50);

        jLabel18.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("CATEGORIAS");
        ingreso_categorias.add(jLabel18);
        jLabel18.setBounds(50, 80, 120, 40);

        panel_izq.add(ingreso_categorias);
        ingreso_categorias.setBounds(0, 340, 215, 150);

        ingreso_usuarios.setBackground(java.awt.Color.darkGray);
        ingreso_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_usuariosMouseEntered(evt);
            }
        });
        ingreso_usuarios.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/usuarios.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        ingreso_usuarios.add(jLabel19);
        jLabel19.setBounds(90, 40, 50, 50);

        jLabel8.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("USUARIOS");
        ingreso_usuarios.add(jLabel8);
        jLabel8.setBounds(65, 80, 100, 40);

        panel_izq.add(ingreso_usuarios);
        ingreso_usuarios.setBounds(75, 80, 140, 110);
        ingreso_usuarios.setBounds(0, 40, 215, 150);

        ingreso_servicios.setBackground(java.awt.Color.darkGray);
        ingreso_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_serviciosMouseExited(evt);
            }
        });
        ingreso_servicios.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_servicios.add(jLabel17);
        jLabel17.setBounds(90, 35, 50, 50);

        jLabel22.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("SERVICIOS");
        ingreso_servicios.add(jLabel22);
        jLabel22.setBounds(65, 80, 120, 40);

        panel_izq.add(ingreso_servicios);
        ingreso_servicios.setBounds(0, 190, 215, 150);

        ingreso_promociones.setBackground(java.awt.Color.darkGray);
        ingreso_promociones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingreso_promociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingreso_promocionesMouseExited(evt);
            }
        });
        ingreso_promociones.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/tag.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ingreso_promociones.add(jLabel21);
        jLabel21.setBounds(90, 30, 40, 60);

        jLabel16.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("PROMOCIONES");
        ingreso_promociones.add(jLabel16);
        jLabel16.setBounds(40, 80, 150, 40);

        panel_izq.add(ingreso_promociones);
        ingreso_promociones.setBounds(215, 190, 215, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusable(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel_izq.add(jLabel4);
        jLabel4.setBounds(395, 5, 30, 30);

        jLabel14.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Ingreso de...");
        panel_izq.add(jLabel14);
        jLabel14.setBounds(10, 0, 180, 40);

        jLabel30.setBackground(new java.awt.Color(33, 33, 33));
        jLabel30.setOpaque(true);
        panel_izq.add(jLabel30);
        jLabel30.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 170, 130));
        getContentPane().remove(panel_izq);
        getContentPane().add(panel_izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq.setVisible(false);

        panel_izq_acerca_de.setBackground(java.awt.Color.darkGray);
        panel_izq_acerca_de.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panel_izq_acerca_deComponentShown(evt);
            }
        });
        panel_izq_acerca_de.setLayout(null);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel33.setText("jLabel4");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        panel_izq_acerca_de.add(jLabel33);
        jLabel33.setBounds(395, 5, 30, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo.png"))); // NOI18N
        jLabel25.setText("jLabel25");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel_izq_acerca_de.add(jLabel25);
        jLabel25.setBounds(10, 47, 80, 80);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel41.setForeground(java.awt.Color.white);
        jLabel41.setText("Version 0.1");
        panel_izq_acerca_de.add(jLabel41);
        jLabel41.setBounds(270, 80, 90, 24);

        jLabel40.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel40.setForeground(java.awt.Color.gray);
        jLabel40.setText("Moretto Pedro");
        panel_izq_acerca_de.add(jLabel40);
        jLabel40.setBounds(30, 560, 460, 21);

        jLabel36.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel36.setForeground(java.awt.Color.white);
        jLabel36.setText("Help4Travelling");
        panel_izq_acerca_de.add(jLabel36);
        jLabel36.setBounds(110, 50, 290, 40);

        jLabel27.setBackground(new java.awt.Color(33, 33, 33));
        jLabel27.setOpaque(true);
        panel_izq_acerca_de.add(jLabel27);
        jLabel27.setBounds(0, 0, 430, 40);

        jLabel26.setBackground(new java.awt.Color(48, 48, 48));
        jLabel26.setOpaque(true);
        panel_izq_acerca_de.add(jLabel26);
        jLabel26.setBounds(100, 0, 330, 120);

        jLabel53.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel53.setForeground(java.awt.Color.gray);
        jLabel53.setText("Integrantes del grupo:");
        panel_izq_acerca_de.add(jLabel53);
        jLabel53.setBounds(10, 430, 460, 24);

        jLabel54.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel54.setForeground(java.awt.Color.gray);
        jLabel54.setText("Drago Enzo");
        panel_izq_acerca_de.add(jLabel54);
        jLabel54.setBounds(30, 480, 460, 21);

        jLabel55.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel55.setForeground(java.awt.Color.gray);
        jLabel55.setText("García José Ignacio");
        panel_izq_acerca_de.add(jLabel55);
        jLabel55.setBounds(30, 500, 460, 21);

        jLabel56.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel56.setForeground(java.awt.Color.gray);
        jLabel56.setText("Maidana Agustín");
        panel_izq_acerca_de.add(jLabel56);
        jLabel56.setBounds(30, 520, 460, 21);

        jLabel57.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel57.setForeground(java.awt.Color.gray);
        jLabel57.setText("Mancebo Alejandro");
        panel_izq_acerca_de.add(jLabel57);
        jLabel57.setBounds(30, 540, 460, 21);

        jLabel58.setFont(new java.awt.Font("FreeSans", 2, 15)); // NOI18N
        jLabel58.setForeground(java.awt.Color.gray);
        jLabel58.setText("Carballido Bruno");
        panel_izq_acerca_de.add(jLabel58);
        jLabel58.setBounds(30, 460, 460, 21);

        getContentPane().add(panel_izq_acerca_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 110, 160));
        getContentPane().remove(panel_izq_acerca_de);
        getContentPane().add(panel_izq_acerca_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_acerca_de.setVisible(false);

        panel_izq_eliminaciones.setBackground(java.awt.Color.darkGray);
        panel_izq_eliminaciones.setLayout(null);

        eliminacion_reservas.setBackground(java.awt.Color.darkGray);
        eliminacion_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminacion_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminacion_reservasMouseEntered(evt);
            }
        });
        eliminacion_reservas.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel23.setText("jLabel15");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eliminacion_reservas.add(jLabel23);
        jLabel23.setBounds(83, 37, 50, 50);

        jLabel24.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("RESERVAS");
        eliminacion_reservas.add(jLabel24);
        jLabel24.setBounds(60, 80, 100, 40);

        panel_izq_eliminaciones.add(eliminacion_reservas);
        eliminacion_reservas.setBounds(50, 70, 215, 150);
        eliminacion_reservas.setBounds(0, 40, 215, 150);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel34.setText("jLabel4");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        panel_izq_eliminaciones.add(jLabel34);
        jLabel34.setBounds(395, 5, 30, 30);

        jLabel35.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        jLabel35.setText("Eliminacion de...");
        panel_izq_eliminaciones.add(jLabel35);
        jLabel35.setBounds(10, 0, 210, 40);

        jLabel29.setBackground(new java.awt.Color(33, 33, 33));
        jLabel29.setOpaque(true);
        panel_izq_eliminaciones.add(jLabel29);
        jLabel29.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 160, 100));
        getContentPane().remove(panel_izq_eliminaciones);
        getContentPane().add(panel_izq_eliminaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_eliminaciones.setVisible(false);

        panel_izq_actualizaciones.setBackground(java.awt.Color.darkGray);
        panel_izq_actualizaciones.setLayout(null);

        actualizacion_reservas.setBackground(java.awt.Color.darkGray);
        actualizacion_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizacion_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizacion_reservasMouseExited(evt);
            }
        });
        actualizacion_reservas.setLayout(null);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel38.setText("jLabel15");
        jLabel38.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        actualizacion_reservas.add(jLabel38);
        jLabel38.setBounds(80, 35, 50, 50);

        jLabel39.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel39.setForeground(java.awt.Color.white);
        jLabel39.setText("ESTADO DE RESERVA");
        actualizacion_reservas.add(jLabel39);
        jLabel39.setBounds(13, 70, 200, 60);

        panel_izq_actualizaciones.add(actualizacion_reservas);
        actualizacion_reservas.setBounds(215, 40, 215, 150);

        actualizacion_servicios.setBackground(java.awt.Color.darkGray);
        actualizacion_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizacion_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizacion_serviciosMouseExited(evt);
            }
        });
        actualizacion_servicios.setLayout(null);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel44.setText("jLabel17");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        actualizacion_servicios.add(jLabel44);
        jLabel44.setBounds(90, 37, 50, 50);

        jLabel45.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel45.setForeground(java.awt.Color.white);
        jLabel45.setText("SERVICIOS");
        actualizacion_servicios.add(jLabel45);
        jLabel45.setBounds(63, 80, 100, 40);

        panel_izq_actualizaciones.add(actualizacion_servicios);
        actualizacion_servicios.setBounds(40, 130, 215, 150);
        actualizacion_servicios.setBounds(0, 40, 215, 150);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel48.setText("jLabel4");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        panel_izq_actualizaciones.add(jLabel48);
        jLabel48.setBounds(395, 5, 30, 30);

        jLabel49.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel49.setForeground(java.awt.Color.white);
        jLabel49.setText("Actualizacion de...");
        panel_izq_actualizaciones.add(jLabel49);
        jLabel49.setBounds(10, 0, 220, 40);

        jLabel28.setBackground(new java.awt.Color(33, 33, 33));
        jLabel28.setOpaque(true);
        panel_izq_actualizaciones.add(jLabel28);
        jLabel28.setBounds(0, 0, 430, 40);

        getContentPane().add(panel_izq_actualizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, 180));
        getContentPane().remove(panel_izq_actualizaciones);
        getContentPane().add(panel_izq_actualizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_actualizaciones.setVisible(false);

        panel_izq_consultas.setBackground(java.awt.Color.darkGray);
        panel_izq_consultas.setLayout(null);

        consultar_proveedores.setBackground(java.awt.Color.darkGray);
        consultar_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_proveedoresMouseExited(evt);
            }
        });
        consultar_proveedores.setLayout(null);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/proveedor.png"))); // NOI18N
        jLabel31.setText("jLabel15");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_proveedores.add(jLabel31);
        jLabel31.setBounds(77, 35, 80, 60);

        jLabel32.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel32.setForeground(java.awt.Color.white);
        jLabel32.setText("PROVEEDORES");
        consultar_proveedores.add(jLabel32);
        jLabel32.setBounds(40, 85, 140, 40);

        panel_izq_consultas.add(consultar_proveedores);
        consultar_proveedores.setBounds(215, 40, 215, 150);

        consultar_clientes.setBackground(java.awt.Color.darkGray);
        consultar_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_clientesMouseExited(evt);
            }
        });
        consultar_clientes.setLayout(null);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/clientes.png"))); // NOI18N
        jLabel60.setText("jLabel19");
        jLabel60.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_clientes.add(jLabel60);
        jLabel60.setBounds(80, 35, 70, 60);

        jLabel61.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel61.setForeground(java.awt.Color.white);
        jLabel61.setText("CLIENTES");
        consultar_clientes.add(jLabel61);
        jLabel61.setBounds(65, 85, 90, 40);

        panel_izq_consultas.add(consultar_clientes);
        consultar_clientes.setBounds(220, 360, 215, 150);
        consultar_clientes.setBounds(0, 40, 215, 150);

        consultar_servicios.setBackground(java.awt.Color.darkGray);
        consultar_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_serviciosMouseExited(evt);
            }
        });
        consultar_servicios.setLayout(null);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/serviciosYpromos.png"))); // NOI18N
        jLabel62.setText("jLabel17");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_servicios.add(jLabel62);
        jLabel62.setBounds(85, 43, 50, 50);

        jLabel63.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel63.setForeground(java.awt.Color.white);
        jLabel63.setText("SERVICIOS");
        consultar_servicios.add(jLabel63);
        jLabel63.setBounds(57, 85, 100, 40);

        panel_izq_consultas.add(consultar_servicios);
        consultar_servicios.setBounds(0, 190, 215, 150);

        consultar_promociones.setBackground(java.awt.Color.darkGray);
        consultar_promociones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_promociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_promocionesMouseExited(evt);
            }
        });
        consultar_promociones.setLayout(null);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/tag.png"))); // NOI18N
        jLabel64.setText("jLabel21");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_promociones.add(jLabel64);
        jLabel64.setBounds(93, 35, 40, 60);

        jLabel65.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel65.setForeground(java.awt.Color.white);
        jLabel65.setText("PROMOCIONES");
        consultar_promociones.add(jLabel65);
        jLabel65.setBounds(37, 85, 150, 40);

        panel_izq_consultas.add(consultar_promociones);
        consultar_promociones.setBounds(215, 190, 215, 150);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel66.setText("jLabel4");
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        panel_izq_consultas.add(jLabel66);
        jLabel66.setBounds(395, 5, 30, 30);

        jLabel67.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel67.setForeground(java.awt.Color.white);
        jLabel67.setText("Ver información de...");
        panel_izq_consultas.add(jLabel67);
        jLabel67.setBounds(10, 0, 230, 40);

        jLabel68.setBackground(new java.awt.Color(33, 33, 33));
        jLabel68.setOpaque(true);
        panel_izq_consultas.add(jLabel68);
        jLabel68.setBounds(0, 0, 500, 40);

        consultar_reservas.setBackground(java.awt.Color.darkGray);
        consultar_reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        consultar_reservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultar_reservasMouseExited(evt);
            }
        });
        consultar_reservas.setLayout(null);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/purchase-books.png"))); // NOI18N
        jLabel69.setText("jLabel15");
        jLabel69.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        consultar_reservas.add(jLabel69);
        jLabel69.setBounds(85, 40, 50, 50);

        jLabel70.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel70.setForeground(java.awt.Color.white);
        jLabel70.setText("RESERVAS");
        consultar_reservas.add(jLabel70);
        jLabel70.setBounds(60, 85, 100, 40);

        panel_izq_consultas.add(consultar_reservas);
        consultar_reservas.setBounds(0, 340, 215, 150);

        getContentPane().add(panel_izq_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 170, 120));
        getContentPane().remove(panel_izq_consultas);
        getContentPane().add(panel_izq_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 430, 590));
        panel_izq_consultas.setVisible(false);

        jLabel83.setBackground(new java.awt.Color(33, 33, 33));
        jLabel83.setOpaque(true);
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 590));

        panel_ingreso_categorias.setBackground(java.awt.Color.white);
        panel_ingreso_categorias.setLayout(null);

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel93.setText("jLabel4");
        jLabel93.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel93.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });
        panel_ingreso_categorias.add(jLabel93);
        jLabel93.setBounds(995, 5, 30, 30);

        jLabel100.setBackground(new java.awt.Color(33, 33, 33));
        jLabel100.setOpaque(true);
        panel_ingreso_categorias.add(jLabel100);
        jLabel100.setBounds(-2, 0, 1310, 40);

        jLabel104.setBackground(java.awt.Color.darkGray);
        jLabel104.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel104.setForeground(java.awt.Color.darkGray);
        jLabel104.setText("Nombre");
        panel_ingreso_categorias.add(jLabel104);
        jLabel104.setBounds(20, 50, 90, 50);
        panel_ingreso_categorias.add(txt_categoria);
        txt_categoria.setBounds(110, 60, 400, 30);

        lab_categoria.setBackground(java.awt.Color.darkGray);
        lab_categoria.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lab_categoria.setForeground(java.awt.Color.darkGray);
        lab_categoria.setText("Categoria Padre");
        panel_ingreso_categorias.add(lab_categoria);
        lab_categoria.setBounds(20, 130, 160, 40);
        lab_categoria.setVisible(false);

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel74.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel74.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel74.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        panel_ingreso_categorias.add(jLabel74);
        jLabel74.setBounds(970, 530, 45, 46);

        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoriaActionPerformed(evt);
            }
        });
        panel_ingreso_categorias.add(cmb_categoria);
        cmb_categoria.setBounds(160, 140, 350, 20);
        cmb_categoria.setVisible(false);

        chek_padre.setLabel("Asignar categoria padre");
        chek_padre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chek_padreMouseClicked(evt);
            }
        });
        chek_padre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chek_padreItemStateChanged(evt);
            }
        });
        panel_ingreso_categorias.add(chek_padre);
        chek_padre.setBounds(20, 100, 160, 20);

        getContentPane().add(panel_ingreso_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 140, 100));
        getContentPane().remove(panel_ingreso_categorias);
        getContentPane().add(panel_ingreso_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_categorias.setVisible(false);

        panel_ingreso_promociones.setBackground(java.awt.Color.white);
        panel_ingreso_promociones.setLayout(null);

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel101.setText("jLabel4");
        jLabel101.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });
        panel_ingreso_promociones.add(jLabel101);
        jLabel101.setBounds(1000, 2, 30, 30);

        jLabel105.setBackground(new java.awt.Color(33, 33, 33));
        jLabel105.setOpaque(true);
        panel_ingreso_promociones.add(jLabel105);
        jLabel105.setBounds(0, 0, 1310, 33);

        jLabel108.setBackground(java.awt.Color.darkGray);
        jLabel108.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel108.setForeground(java.awt.Color.darkGray);
        jLabel108.setText("Servicios a incluir:");
        panel_ingreso_promociones.add(jLabel108);
        jLabel108.setBounds(720, 50, 180, 20);

        jTextField15.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_ingreso_promociones.add(jTextField15);
        jTextField15.setBounds(90, 150, 60, 23);

        jLabel111.setBackground(java.awt.Color.darkGray);
        jLabel111.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel111.setForeground(java.awt.Color.darkGray);
        jLabel111.setText("Proveedor");
        panel_ingreso_promociones.add(jLabel111);
        jLabel111.setBounds(10, 50, 80, 20);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel75.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel75.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel75.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_ingreso_promociones.add(jLabel75);
        jLabel75.setBounds(950, 535, 45, 46);

        cmb_ing_prom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_ing_prom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_ing_promItemStateChanged(evt);
            }
        });
        panel_ingreso_promociones.add(cmb_ing_prom);
        cmb_ing_prom.setBounds(90, 50, 260, 20);

        jLabel115.setBackground(java.awt.Color.darkGray);
        jLabel115.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel115.setForeground(java.awt.Color.darkGray);
        jLabel115.setText("Servicios del proveedor:");
        panel_ingreso_promociones.add(jLabel115);
        jLabel115.setBounds(370, 50, 220, 20);

        jLabel116.setBackground(java.awt.Color.darkGray);
        jLabel116.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel116.setForeground(java.awt.Color.darkGray);
        jLabel116.setText("Nombre");
        panel_ingreso_promociones.add(jLabel116);
        jLabel116.setBounds(10, 110, 60, 20);

        jTextField16.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_ingreso_promociones.add(jTextField16);
        jTextField16.setBounds(90, 110, 260, 23);

        lbl_precioN.setBackground(java.awt.Color.darkGray);
        lbl_precioN.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precioN.setForeground(new java.awt.Color(204, 0, 0));
        panel_ingreso_promociones.add(lbl_precioN);
        lbl_precioN.setBounds(790, 450, 140, 20);

        jLabel118.setBackground(java.awt.Color.darkGray);
        jLabel118.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel118.setForeground(java.awt.Color.darkGray);
        jLabel118.setText("Descuento");
        panel_ingreso_promociones.add(jLabel118);
        jLabel118.setBounds(10, 150, 70, 20);

        jLabel119.setBackground(java.awt.Color.darkGray);
        jLabel119.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel119.setForeground(java.awt.Color.darkGray);
        jLabel119.setText("%");
        panel_ingreso_promociones.add(jLabel119);
        jLabel119.setBounds(160, 150, 20, 20);

        jScrollPane4.setViewportView(list_serviciosInc);

        panel_ingreso_promociones.add(jScrollPane4);
        jScrollPane4.setBounds(720, 80, 270, 420);

        jScrollPane9.setViewportView(list_serviciosProv);

        panel_ingreso_promociones.add(jScrollPane9);
        jScrollPane9.setBounds(370, 80, 270, 500);

        lbl_precioProm.setBackground(java.awt.Color.darkGray);
        lbl_precioProm.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        lbl_precioProm.setForeground(new java.awt.Color(204, 0, 0));
        panel_ingreso_promociones.add(lbl_precioProm);
        lbl_precioProm.setBounds(810, 550, 80, 20);

        btn_rmP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_rmP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/back.png"))); // NOI18N
        btn_rmP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_rmP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rmP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rmPMouseClicked(evt);
            }
        });
        panel_ingreso_promociones.add(btn_rmP);
        btn_rmP.setBounds(665, 220, 36, 36);

        btn_addP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_addP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/next.png"))); // NOI18N
        btn_addP.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_addP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addPMouseClicked(evt);
            }
        });
        panel_ingreso_promociones.add(btn_addP);
        btn_addP.setBounds(665, 160, 36, 36);

        jLabel192.setBackground(java.awt.Color.darkGray);
        jLabel192.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel192.setText("Precio total");
        panel_ingreso_promociones.add(jLabel192);
        jLabel192.setBounds(720, 550, 80, 20);

        jButton11.setBackground(java.awt.Color.white);
        jButton11.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButton11.setText("Limpiar");
        jButton11.setBorder(null);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        panel_ingreso_promociones.add(jButton11);
        jButton11.setBounds(720, 500, 80, 17);

        getContentPane().add(panel_ingreso_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 140, 110));
        getContentPane().remove(panel_ingreso_promociones);
        getContentPane().add(panel_ingreso_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_promociones.setVisible(false);

        panel_actualizar_servicio.setBackground(new java.awt.Color(255, 255, 255));
        panel_actualizar_servicio.setLayout(null);

        img_actualizar_servicios.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        img_actualizar_servicios.setApproveButtonText("Seleccionar");
        img_actualizar_servicios.setAutoscrolls(true);
        img_actualizar_servicios.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(102, 102, 102)));
        img_actualizar_servicios.setOpaque(true);
        panel_actualizar_servicio.add(img_actualizar_servicios);
        img_actualizar_servicios.setBounds(410, 70, 130, 100);
        getContentPane().remove(panel_actualizar_servicio);
        panel_actualizar_servicio.add(img_actualizar_servicios);
        img_actualizar_servicios.setBounds(0, 30, 1030, 560);
        img_actualizar_servicios.setVisible(false);

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel110.setText("jLabel4");
        jLabel110.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
        });
        panel_actualizar_servicio.add(jLabel110);
        jLabel110.setBounds(1000, 0, 30, 30);

        jLabel113.setBackground(new java.awt.Color(33, 33, 33));
        jLabel113.setOpaque(true);
        panel_actualizar_servicio.add(jLabel113);
        jLabel113.setBounds(-2, 0, 1310, 30);

        jLabel122.setBackground(java.awt.Color.darkGray);
        jLabel122.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel122.setForeground(java.awt.Color.darkGray);
        jLabel122.setText("- Destino");
        panel_actualizar_servicio.add(jLabel122);
        jLabel122.setBounds(30, 120, 60, 20);

        jLabel127.setBackground(java.awt.Color.darkGray);
        jLabel127.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel127.setForeground(java.awt.Color.darkGray);
        jLabel127.setText("Precio");
        panel_actualizar_servicio.add(jLabel127);
        jLabel127.setBounds(10, 157, 50, 20);

        jLabel128.setBackground(java.awt.Color.darkGray);
        jLabel128.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel128.setForeground(java.awt.Color.darkGray);
        jLabel128.setText("Imagenes");
        panel_actualizar_servicio.add(jLabel128);
        jLabel128.setBounds(10, 340, 70, 20);

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel77.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel77.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel77.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel77MouseClicked(evt);
            }
        });
        panel_actualizar_servicio.add(jLabel77);
        jLabel77.setBounds(983, 537, 45, 46);

        jLabel129.setBackground(java.awt.Color.darkGray);
        jLabel129.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel129.setForeground(java.awt.Color.darkGray);
        jLabel129.setText("Ciudad");
        panel_actualizar_servicio.add(jLabel129);
        jLabel129.setBounds(10, 70, 50, 20);

        cmb_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_actualizar_servicio.add(cmb_destino);
        cmb_destino.setBounds(100, 120, 300, 20);

        jLabel130.setBackground(java.awt.Color.darkGray);
        jLabel130.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel130.setForeground(java.awt.Color.darkGray);
        jLabel130.setText("- Origen");
        panel_actualizar_servicio.add(jLabel130);
        jLabel130.setBounds(30, 90, 52, 20);

        jScrollPane2.setViewportView(txt_desc);

        panel_actualizar_servicio.add(jScrollPane2);
        jScrollPane2.setBounds(10, 220, 520, 110);

        jLabel131.setBackground(java.awt.Color.darkGray);
        jLabel131.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel131.setForeground(java.awt.Color.darkGray);
        jLabel131.setText("Servicio");
        panel_actualizar_servicio.add(jLabel131);
        jLabel131.setBounds(10, 40, 60, 20);

        jLabel199.setBackground(java.awt.Color.gray);
        jLabel199.setText("Aqui se mostrara imagen");
        jLabel199.setOpaque(true);
        panel_actualizar_servicio.add(jLabel199);
        jLabel199.setBounds(10, 400, 310, 180);

        jButton12.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton12.setText("Seleccionar");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton12);
        jButton12.setBounds(10, 370, 120, 30);

        cmb_actualizar_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_actualizar_servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_actualizar_servicioItemStateChanged(evt);
            }
        });
        panel_actualizar_servicio.add(cmb_actualizar_servicio);
        cmb_actualizar_servicio.setBounds(70, 40, 330, 20);

        cmb_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_actualizar_servicio.add(cmb_origen);
        cmb_origen.setBounds(100, 90, 300, 20);

        jLabel135.setBackground(java.awt.Color.darkGray);
        jLabel135.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel135.setForeground(java.awt.Color.darkGray);
        jLabel135.setText("Descripcion");
        panel_actualizar_servicio.add(jLabel135);
        jLabel135.setBounds(10, 190, 80, 20);

        txt_p.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_actualizar_servicio.add(txt_p);
        txt_p.setBounds(60, 157, 100, 30);

        jLabel203.setBackground(java.awt.Color.gray);
        jLabel203.setText("Aqui se mostrara imagen");
        jLabel203.setOpaque(true);
        panel_actualizar_servicio.add(jLabel203);
        jLabel203.setBounds(330, 400, 310, 180);

        jButton14.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton14.setText("Seleccionar");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton14);
        jButton14.setBounds(330, 370, 120, 30);

        jLabel218.setBackground(java.awt.Color.gray);
        jLabel218.setText("Aqui se mostrara imagen");
        jLabel218.setOpaque(true);
        panel_actualizar_servicio.add(jLabel218);
        jLabel218.setBounds(650, 400, 310, 180);

        jButton15.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jButton15.setText("Seleccionar");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panel_actualizar_servicio.add(jButton15);
        jButton15.setBounds(650, 370, 120, 30);

        jScrollPane10.setViewportView(list_catServicio);

        panel_actualizar_servicio.add(jScrollPane10);
        jScrollPane10.setBounds(820, 70, 190, 260);

        btn_addP1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_addP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/next.png"))); // NOI18N
        btn_addP1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_addP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addP1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addP1MouseEntered(evt);
            }
        });
        panel_actualizar_servicio.add(btn_addP1);
        btn_addP1.setBounds(770, 100, 36, 36);

        btn_rmP1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_rmP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/back.png"))); // NOI18N
        btn_rmP1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_rmP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_rmP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rmP1MouseClicked(evt);
            }
        });
        panel_actualizar_servicio.add(btn_rmP1);
        btn_rmP1.setBounds(770, 150, 36, 36);

        jLabel117.setBackground(java.awt.Color.darkGray);
        jLabel117.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel117.setForeground(java.awt.Color.darkGray);
        jLabel117.setText("Categorias del servicio:");
        panel_actualizar_servicio.add(jLabel117);
        jLabel117.setBounds(820, 40, 210, 20);

        jLabel206.setBackground(java.awt.Color.darkGray);
        jLabel206.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel206.setForeground(java.awt.Color.darkGray);
        jLabel206.setText("Categorias disponibles:");
        panel_actualizar_servicio.add(jLabel206);
        jLabel206.setBounds(560, 40, 200, 20);

        jButton16.setBackground(java.awt.Color.white);
        jButton16.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jButton16.setText("Limpiar");
        jButton16.setBorder(null);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        panel_actualizar_servicio.add(jButton16);
        jButton16.setBounds(820, 330, 80, 20);

        tree_actualizar_servicios.setAutoscrolls(true);
        tree_actualizar_servicios.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                tree_actualizar_serviciosTreeExpanded(evt);
            }
        });
        tree_actualizar_servicios.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_actualizar_serviciosValueChanged(evt);
            }
        });
        jScrollPane14.setViewportView(tree_actualizar_servicios);

        panel_actualizar_servicio.add(jScrollPane14);
        jScrollPane14.setBounds(560, 70, 200, 260);

        getContentPane().add(panel_actualizar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, 140, 100));
        getContentPane().remove(panel_actualizar_servicio);
        getContentPane().add(panel_actualizar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_actualizar_servicio.setVisible(false);

        panel_actualizar_reserva.setBackground(java.awt.Color.white);
        panel_actualizar_reserva.setLayout(null);

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel114.setText("jLabel4");
        jLabel114.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel114.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });
        panel_actualizar_reserva.add(jLabel114);
        jLabel114.setBounds(995, 5, 30, 30);

        jLabel121.setBackground(new java.awt.Color(33, 33, 33));
        jLabel121.setOpaque(true);
        panel_actualizar_reserva.add(jLabel121);
        jLabel121.setBounds(-2, 0, 1310, 40);

        jLabel136.setBackground(java.awt.Color.darkGray);
        jLabel136.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel136.setForeground(java.awt.Color.darkGray);
        jLabel136.setText("Estado actual");
        panel_actualizar_reserva.add(jLabel136);
        jLabel136.setBounds(310, 80, 90, 20);

        jLabel139.setBackground(java.awt.Color.darkGray);
        jLabel139.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel139.setForeground(java.awt.Color.darkGray);
        jLabel139.setText("Reservas \"Registradas\"");
        panel_actualizar_reserva.add(jLabel139);
        jLabel139.setBounds(20, 50, 150, 19);

        jLabel220.setBackground(java.awt.Color.darkGray);
        jLabel220.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel220.setForeground(java.awt.Color.darkGray);
        jLabel220.setText("Seleccione estado Nuevo");
        panel_actualizar_reserva.add(jLabel220);
        jLabel220.setBounds(310, 150, 170, 20);

        lbl_estadoActual.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        panel_actualizar_reserva.add(lbl_estadoActual);
        lbl_estadoActual.setBounds(310, 110, 160, 0);

        cmb_estadoSel.setBackground(java.awt.Color.lightGray);
        cmb_estadoSel.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        cmb_estadoSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registrada", "Cancelada", "Pagada", "Facturada" }));
        cmb_estadoSel.setBorder(null);
        panel_actualizar_reserva.add(cmb_estadoSel);
        cmb_estadoSel.setBounds(310, 180, 160, 30);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel42.setText("jLabel42");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        panel_actualizar_reserva.add(jLabel42);
        jLabel42.setBounds(985, 545, 46, 46);

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

        panel_actualizar_reserva.add(jScrollPane6);
        jScrollPane6.setBounds(20, 80, 280, 500);

        getContentPane().add(panel_actualizar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 160, 110));
        getContentPane().remove(panel_actualizar_reserva);
        getContentPane().add(panel_actualizar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_actualizar_reserva.setVisible(false);

        panel_eliminar_reserva.setBackground(java.awt.Color.lightGray);
        panel_eliminar_reserva.setLayout(null);

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel132.setText("jLabel4");
        jLabel132.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel132.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel132MouseClicked(evt);
            }
        });
        panel_eliminar_reserva.add(jLabel132);
        jLabel132.setBounds(995, 5, 30, 30);

        jLabel133.setBackground(new java.awt.Color(33, 33, 33));
        jLabel133.setOpaque(true);
        panel_eliminar_reserva.add(jLabel133);
        jLabel133.setBounds(-2, 0, 1310, 40);

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel137.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel137.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel137.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel137.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel_eliminar_reserva.add(jLabel137);
        jLabel137.setBounds(970, 530, 45, 46);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_eliminar_reserva.add(jComboBox10);
        jComboBox10.setBounds(110, 60, 390, 20);

        jLabel140.setBackground(java.awt.Color.darkGray);
        jLabel140.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel140.setForeground(java.awt.Color.darkGray);
        jLabel140.setText("Reservas");
        panel_eliminar_reserva.add(jLabel140);
        jLabel140.setBounds(10, 50, 190, 40);

        getContentPane().add(panel_eliminar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 160, 110));
        getContentPane().remove(panel_eliminar_reserva);
        getContentPane().add(panel_eliminar_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_eliminar_reserva.setVisible(false);

        panel_consultas_servicios.setBackground(java.awt.Color.white);
        panel_consultas_servicios.setLayout(null);

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel144.setText("jLabel4");
        jLabel144.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel144.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });
        panel_consultas_servicios.add(jLabel144);
        jLabel144.setBounds(995, 5, 30, 30);

        jLabel146.setBackground(new java.awt.Color(33, 33, 33));
        jLabel146.setOpaque(true);
        panel_consultas_servicios.add(jLabel146);
        jLabel146.setBounds(-2, 0, 1310, 40);

        jLabel149.setBackground(java.awt.Color.darkGray);
        jLabel149.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel149.setForeground(java.awt.Color.darkGray);
        jLabel149.setText("Servicios por proveedor");
        panel_consultas_servicios.add(jLabel149);
        jLabel149.setBounds(290, 50, 160, 20);

        tree_servicios.setAutoscrolls(true);
        tree_servicios.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                tree_serviciosTreeExpanded(evt);
            }
        });
        tree_servicios.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_serviciosValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(tree_servicios);

        panel_consultas_servicios.add(jScrollPane5);
        jScrollPane5.setBounds(10, 80, 260, 500);

        jLabel153.setBackground(java.awt.Color.darkGray);
        jLabel153.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel153.setForeground(java.awt.Color.darkGray);
        jLabel153.setText("Servicios por categoria");
        panel_consultas_servicios.add(jLabel153);
        jLabel153.setBounds(10, 50, 150, 20);

        cmb_serviciosXcat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_serviciosXcatItemStateChanged(evt);
            }
        });
        cmb_serviciosXcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_serviciosXcatMouseClicked(evt);
            }
        });
        cmb_serviciosXcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_serviciosXcatActionPerformed(evt);
            }
        });
        panel_consultas_servicios.add(cmb_serviciosXcat);
        cmb_serviciosXcat.setBounds(460, 50, 350, 20);

        jLabel154.setBackground(java.awt.Color.darkGray);
        jLabel154.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel154.setForeground(java.awt.Color.darkGray);
        jLabel154.setText("- Destino");
        panel_consultas_servicios.add(jLabel154);
        jLabel154.setBounds(320, 240, 60, 20);

        jLabel155.setBackground(java.awt.Color.darkGray);
        jLabel155.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel155.setForeground(java.awt.Color.darkGray);
        jLabel155.setText("Descripcion");
        panel_consultas_servicios.add(jLabel155);
        jLabel155.setBounds(290, 270, 100, 20);

        jLabel156.setBackground(java.awt.Color.darkGray);
        jLabel156.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel156.setForeground(java.awt.Color.darkGray);
        jLabel156.setText("Imagenes");
        panel_consultas_servicios.add(jLabel156);
        jLabel156.setBounds(290, 410, 70, 20);

        jLabel157.setBackground(java.awt.Color.darkGray);
        jLabel157.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel157.setForeground(java.awt.Color.darkGray);
        jLabel157.setText("Nombre");
        panel_consultas_servicios.add(jLabel157);
        jLabel157.setBounds(290, 140, 60, 20);

        jLabel158.setBackground(java.awt.Color.darkGray);
        jLabel158.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel158.setForeground(java.awt.Color.darkGray);
        jLabel158.setText("- Origen");
        panel_consultas_servicios.add(jLabel158);
        jLabel158.setBounds(320, 200, 60, 20);

        jLabel160.setBackground(java.awt.Color.white);
        jLabel160.setText("Aqui se mostrara imagen");
        jLabel160.setOpaque(true);
        panel_consultas_servicios.add(jLabel160);
        jLabel160.setBounds(510, 440, 210, 140);

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel162.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel162.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel162.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel162.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel162.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel162MouseClicked(evt);
            }
        });
        panel_consultas_servicios.add(jLabel162);
        jLabel162.setBounds(980, 540, 45, 46);

        jLabel169.setBackground(java.awt.Color.darkGray);
        jLabel169.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel169.setForeground(java.awt.Color.darkGray);
        jLabel169.setText("Ciudad");
        panel_consultas_servicios.add(jLabel169);
        jLabel169.setBounds(290, 180, 60, 19);

        jLabel175.setBackground(java.awt.Color.white);
        jLabel175.setText("Aqui se mostrara imagen");
        jLabel175.setOpaque(true);
        panel_consultas_servicios.add(jLabel175);
        jLabel175.setBounds(730, 440, 210, 140);

        jLabel177.setBackground(new java.awt.Color(255, 255, 255));
        jLabel177.setText("Aqui se mostrara imagen");
        jLabel177.setOpaque(true);
        panel_consultas_servicios.add(jLabel177);
        jLabel177.setBounds(290, 440, 210, 140);

        lbl_nombre1.setBackground(java.awt.Color.lightGray);
        lbl_nombre1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_servicios.add(lbl_nombre1);
        lbl_nombre1.setBounds(350, 140, 360, 20);

        lbl_desc1.setBackground(java.awt.Color.lightGray);
        lbl_desc1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_desc1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panel_consultas_servicios.add(lbl_desc1);
        lbl_desc1.setBounds(290, 300, 640, 90);

        lbl_origen1.setBackground(java.awt.Color.lightGray);
        lbl_origen1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_servicios.add(lbl_origen1);
        lbl_origen1.setBounds(390, 200, 360, 20);

        lbl_destino1.setBackground(java.awt.Color.lightGray);
        lbl_destino1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_servicios.add(lbl_destino1);
        lbl_destino1.setBounds(390, 240, 360, 20);

        jLabel213.setBackground(java.awt.Color.darkGray);
        jLabel213.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel213.setForeground(java.awt.Color.darkGray);
        jLabel213.setText("Proveedor");
        panel_consultas_servicios.add(jLabel213);
        jLabel213.setBounds(290, 100, 90, 20);

        lbl_proveedor1.setBackground(java.awt.Color.lightGray);
        lbl_proveedor1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_servicios.add(lbl_proveedor1);
        lbl_proveedor1.setBounds(370, 100, 360, 20);

        getContentPane().add(panel_consultas_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 170, 90));
        getContentPane().remove(panel_consultas_servicios);
        getContentPane().add(panel_consultas_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_servicios.setVisible(false);

        panel_consultas_promociones.setBackground(new java.awt.Color(255, 255, 255));
        panel_consultas_promociones.setLayout(null);

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel148.setText("jLabel4");
        jLabel148.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel148.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel148.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel148MouseClicked(evt);
            }
        });
        panel_consultas_promociones.add(jLabel148);
        jLabel148.setBounds(1000, 0, 30, 30);

        jLabel150.setBackground(new java.awt.Color(33, 33, 33));
        jLabel150.setOpaque(true);
        panel_consultas_promociones.add(jLabel150);
        jLabel150.setBounds(-2, 0, 1310, 30);

        jLabel151.setBackground(java.awt.Color.darkGray);
        jLabel151.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel151.setForeground(java.awt.Color.darkGray);
        jLabel151.setText("Servicios asociados");
        panel_consultas_promociones.add(jLabel151);
        jLabel151.setBounds(10, 230, 130, 20);

        jLabel152.setBackground(java.awt.Color.darkGray);
        jLabel152.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel152.setForeground(java.awt.Color.darkGray);
        jLabel152.setText("Promociones por proveedor");
        panel_consultas_promociones.add(jLabel152);
        jLabel152.setBounds(10, 50, 350, 20);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel163.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel163.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel163.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel163.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });
        panel_consultas_promociones.add(jLabel163);
        jLabel163.setBounds(985, 530, 45, 46);

        cmb_consultar_promociones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_consultar_promociones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_consultar_promocionesItemStateChanged(evt);
            }
        });
        panel_consultas_promociones.add(cmb_consultar_promociones);
        cmb_consultar_promociones.setBounds(10, 80, 350, 20);

        jLabel164.setBackground(java.awt.Color.darkGray);
        jLabel164.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel164.setForeground(java.awt.Color.darkGray);
        jLabel164.setText("Proveedor:");
        panel_consultas_promociones.add(jLabel164);
        jLabel164.setBounds(10, 110, 80, 20);

        list_servs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(list_servs);

        panel_consultas_promociones.add(jScrollPane8);
        jScrollPane8.setBounds(10, 260, 350, 310);

        jLabel165.setBackground(java.awt.Color.darkGray);
        jLabel165.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel165.setForeground(java.awt.Color.darkGray);
        jLabel165.setText("Nombre");
        panel_consultas_promociones.add(jLabel165);
        jLabel165.setBounds(10, 140, 60, 20);

        jLabel166.setBackground(java.awt.Color.darkGray);
        jLabel166.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel166.setForeground(java.awt.Color.darkGray);
        jLabel166.setText("Precio total");
        panel_consultas_promociones.add(jLabel166);
        jLabel166.setBounds(10, 200, 80, 20);

        jLabel167.setBackground(java.awt.Color.darkGray);
        jLabel167.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel167.setForeground(java.awt.Color.darkGray);
        jLabel167.setText("Descuento");
        panel_consultas_promociones.add(jLabel167);
        jLabel167.setBounds(10, 170, 70, 20);

        jLabel168.setBackground(java.awt.Color.darkGray);
        jLabel168.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel168.setForeground(java.awt.Color.darkGray);
        jLabel168.setText("%");
        panel_consultas_promociones.add(jLabel168);
        jLabel168.setBounds(140, 170, 20, 20);

        jLabel170.setBackground(java.awt.Color.darkGray);
        jLabel170.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel170.setForeground(java.awt.Color.darkGray);
        jLabel170.setText("- Destino");
        panel_consultas_promociones.add(jLabel170);
        jLabel170.setBounds(400, 340, 60, 19);

        jLabel171.setBackground(java.awt.Color.darkGray);
        jLabel171.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel171.setForeground(java.awt.Color.darkGray);
        jLabel171.setText("Descripcion");
        panel_consultas_promociones.add(jLabel171);
        jLabel171.setBounds(380, 370, 90, 20);

        jLabel172.setBackground(java.awt.Color.darkGray);
        jLabel172.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel172.setForeground(java.awt.Color.darkGray);
        jLabel172.setText("Imagenes");
        panel_consultas_promociones.add(jLabel172);
        jLabel172.setBounds(380, 50, 70, 20);

        jLabel173.setBackground(java.awt.Color.darkGray);
        jLabel173.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel173.setForeground(java.awt.Color.darkGray);
        jLabel173.setText("Nombre");
        panel_consultas_promociones.add(jLabel173);
        jLabel173.setBounds(380, 260, 70, 19);

        jLabel174.setBackground(java.awt.Color.darkGray);
        jLabel174.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel174.setForeground(java.awt.Color.darkGray);
        jLabel174.setText("- Origen");
        panel_consultas_promociones.add(jLabel174);
        jLabel174.setBounds(400, 310, 60, 20);

        jLabel176.setBackground(java.awt.Color.gray);
        jLabel176.setText("Aqui se mostrara imagen");
        jLabel176.setOpaque(true);
        panel_consultas_promociones.add(jLabel176);
        jLabel176.setBounds(780, 80, 180, 140);

        jLabel178.setBackground(java.awt.Color.darkGray);
        jLabel178.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel178.setForeground(java.awt.Color.darkGray);
        jLabel178.setText("Ciudad");
        panel_consultas_promociones.add(jLabel178);
        jLabel178.setBounds(380, 290, 60, 20);

        jLabel207.setBackground(java.awt.Color.gray);
        jLabel207.setText("Aqui se mostrara imagen");
        jLabel207.setOpaque(true);
        panel_consultas_promociones.add(jLabel207);
        jLabel207.setBounds(380, 80, 180, 140);

        jLabel208.setBackground(java.awt.Color.gray);
        jLabel208.setText("Aqui se mostrara imagen");
        jLabel208.setOpaque(true);
        panel_consultas_promociones.add(jLabel208);
        jLabel208.setBounds(580, 80, 180, 140);
        panel_consultas_promociones.add(jLabel43);
        jLabel43.setBounds(130, 90, 0, 0);
        panel_consultas_promociones.add(lbl_desc);
        lbl_desc.setBounds(90, 170, 50, 20);
        panel_consultas_promociones.add(lbl_prov);
        lbl_prov.setBounds(90, 110, 260, 20);
        panel_consultas_promociones.add(lbl_precioP);
        lbl_precioP.setBounds(90, 200, 110, 20);
        panel_consultas_promociones.add(jLabel51);
        jLabel51.setBounds(380, 400, 560, 130);
        panel_consultas_promociones.add(lbl_nom);
        lbl_nom.setBounds(70, 140, 290, 20);
        panel_consultas_promociones.add(jLabel78);
        jLabel78.setBounds(440, 260, 290, 20);
        panel_consultas_promociones.add(jLabel80);
        jLabel80.setBounds(460, 310, 290, 20);
        panel_consultas_promociones.add(jLabel97);
        jLabel97.setBounds(470, 340, 290, 20);

        getContentPane().add(panel_consultas_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 160, 120));
        getContentPane().remove(panel_consultas_promociones);
        getContentPane().add(panel_consultas_promociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_promociones.setVisible(false);

        panel_ingreso_reservas.setBackground(java.awt.Color.white);
        panel_ingreso_reservas.setLayout(null);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel106.setText("jLabel4");
        jLabel106.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel106.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel106MouseClicked(evt);
            }
        });
        panel_ingreso_reservas.add(jLabel106);
        jLabel106.setBounds(995, 5, 30, 30);

        jLabel109.setBackground(new java.awt.Color(33, 33, 33));
        jLabel109.setOpaque(true);
        panel_ingreso_reservas.add(jLabel109);
        jLabel109.setBounds(-2, 0, 1310, 40);

        jLabel112.setBackground(java.awt.Color.darkGray);
        jLabel112.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jLabel112.setForeground(java.awt.Color.darkGray);
        jLabel112.setText("Precio total");
        panel_ingreso_reservas.add(jLabel112);
        jLabel112.setBounds(740, 510, 120, 20);

        jLabel120.setBackground(java.awt.Color.darkGray);
        jLabel120.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel120.setForeground(java.awt.Color.darkGray);
        jLabel120.setText("Cliente");
        panel_ingreso_reservas.add(jLabel120);
        jLabel120.setBounds(10, 50, 60, 20);

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel76.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel76.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel76.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
        });
        panel_ingreso_reservas.add(jLabel76);
        jLabel76.setBounds(980, 500, 45, 46);

        cmb_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_reservas.add(cmb_cliente);
        cmb_cliente.setBounds(10, 80, 340, 20);

        cmb_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_proveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_proveedorItemStateChanged(evt);
            }
        });
        panel_ingreso_reservas.add(cmb_proveedor);
        cmb_proveedor.setBounds(10, 150, 340, 20);

        jLabel123.setBackground(java.awt.Color.darkGray);
        jLabel123.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel123.setForeground(java.awt.Color.darkGray);
        jLabel123.setText("Proveedor");
        panel_ingreso_reservas.add(jLabel123);
        jLabel123.setBounds(10, 120, 90, 20);

        cmb_promocion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_promocion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_promocionMouseClicked(evt);
            }
        });
        panel_ingreso_reservas.add(cmb_promocion);
        cmb_promocion.setBounds(10, 290, 270, 20);
        cmb_promocion.setEnabled(false);

        jLabel125.setBackground(java.awt.Color.darkGray);
        jLabel125.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel125.setForeground(java.awt.Color.darkGray);
        jLabel125.setText("Servicios y promociones del proveedor");
        panel_ingreso_reservas.add(jLabel125);
        jLabel125.setBounds(10, 190, 260, 20);

        jLabel126.setBackground(java.awt.Color.darkGray);
        jLabel126.setFont(new java.awt.Font("FreeSans", 1, 16)); // NOI18N
        jLabel126.setForeground(java.awt.Color.darkGray);
        jLabel126.setText("Incluidos actualmente en la reserva");
        panel_ingreso_reservas.add(jLabel126);
        jLabel126.setBounds(360, 60, 310, 20);

        tex_precio.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        tex_precio.setForeground(new java.awt.Color(153, 0, 0));
        tex_precio.setBorder(null);
        tex_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_precioActionPerformed(evt);
            }
        });
        panel_ingreso_reservas.add(tex_precio);
        tex_precio.setBounds(850, 510, 100, 20);

        tex_precioU.setEditable(false);
        tex_precioU.setBackground(java.awt.Color.white);
        tex_precioU.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_precioU.setBorder(null);
        panel_ingreso_reservas.add(tex_precioU);
        tex_precioU.setBounds(200, 240, 69, 17);

        cmb_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_servicioItemStateChanged(evt);
            }
        });
        panel_ingreso_reservas.add(cmb_servicio);
        cmb_servicio.setBounds(10, 220, 270, 20);
        cmb_servicio.setEnabled(false);

        lab_cantidad1.setBackground(java.awt.Color.darkGray);
        lab_cantidad1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lab_cantidad1.setForeground(java.awt.Color.darkGray);
        lab_cantidad1.setText("Precio Unitario de la Prom.:");
        panel_ingreso_reservas.add(lab_cantidad1);
        lab_cantidad1.setBounds(20, 310, 180, 19);

        jButton4.setText("<--");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel_ingreso_reservas.add(jButton4);
        jButton4.setBounds(450, 500, 49, 23);

        jButton8.setText("Limpiar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel_ingreso_reservas.add(jButton8);
        jButton8.setBounds(360, 500, 80, 23);

        jButton5.setText("-->");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel_ingreso_reservas.add(jButton5);
        jButton5.setBounds(300, 220, 49, 23);

        table_ingreso_reservas.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        table_ingreso_reservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Nombre", "Nickname Proveedor", "FechaIni", "FechaFin", "Precio Uni", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(table_ingreso_reservas);

        panel_ingreso_reservas.add(jScrollPane7);
        jScrollPane7.setBounds(360, 90, 660, 402);

        jLabel90.setBackground(java.awt.Color.darkGray);
        jLabel90.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel90.setForeground(java.awt.Color.darkGray);
        jLabel90.setText("Fecha Inicio");
        panel_ingreso_reservas.add(jLabel90);
        jLabel90.setBounds(10, 410, 80, 20);

        jLabel225.setBackground(java.awt.Color.darkGray);
        jLabel225.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel225.setForeground(java.awt.Color.darkGray);
        jLabel225.setText("año");
        panel_ingreso_reservas.add(jLabel225);
        jLabel225.setBounds(300, 390, 30, 20);

        cmb_mes1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_mes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        panel_ingreso_reservas.add(cmb_mes1);
        cmb_mes1.setBounds(190, 410, 60, 20);
        cmb_mes.removeAllItems();
        for(int x = 1; x <= 12; x++){
            cmb_mes.addItem(""+x);
        }

        cmb_anio1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_anio1.setToolTipText("");
        panel_ingreso_reservas.add(cmb_anio1);
        cmb_anio1.setBounds(280, 410, 70, 20);
        for(int x = 2020; x >= 1950; x--){
            cmb_anio1.addItem(""+x);
        }

        cmb_dia1.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_dia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        cmb_dia1.setAutoscrolls(true);
        panel_ingreso_reservas.add(cmb_dia1);
        cmb_dia1.setBounds(100, 410, 60, 20);
        cmb_dia.removeAllItems();
        for(int x = 1; x <= 31; x++){
            cmb_dia.addItem(""+x);
        }

        jLabel226.setBackground(java.awt.Color.darkGray);
        jLabel226.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel226.setForeground(java.awt.Color.darkGray);
        jLabel226.setText("dia");
        panel_ingreso_reservas.add(jLabel226);
        jLabel226.setBounds(120, 390, 30, 20);

        jLabel227.setBackground(java.awt.Color.darkGray);
        jLabel227.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel227.setForeground(java.awt.Color.darkGray);
        jLabel227.setText("/");
        panel_ingreso_reservas.add(jLabel227);
        jLabel227.setBounds(260, 410, 10, 20);

        jLabel228.setBackground(java.awt.Color.darkGray);
        jLabel228.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel228.setForeground(java.awt.Color.darkGray);
        jLabel228.setText("mes");
        panel_ingreso_reservas.add(jLabel228);
        jLabel228.setBounds(210, 390, 30, 20);

        jLabel229.setBackground(java.awt.Color.darkGray);
        jLabel229.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel229.setForeground(java.awt.Color.darkGray);
        jLabel229.setText("/");
        panel_ingreso_reservas.add(jLabel229);
        jLabel229.setBounds(170, 410, 10, 20);

        jLabel91.setBackground(java.awt.Color.darkGray);
        jLabel91.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel91.setForeground(java.awt.Color.darkGray);
        jLabel91.setText("Fecha Fin");
        panel_ingreso_reservas.add(jLabel91);
        jLabel91.setBounds(10, 470, 70, 20);

        jLabel230.setBackground(java.awt.Color.darkGray);
        jLabel230.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel230.setForeground(java.awt.Color.darkGray);
        jLabel230.setText("año");
        panel_ingreso_reservas.add(jLabel230);
        jLabel230.setBounds(300, 450, 30, 20);

        cmb_mes2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_mes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        panel_ingreso_reservas.add(cmb_mes2);
        cmb_mes2.setBounds(190, 470, 60, 20);
        cmb_mes.removeAllItems();
        for(int x = 1; x <= 12; x++){
            cmb_mes.addItem(""+x);
        }

        cmb_anio2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_anio2.setToolTipText("");
        panel_ingreso_reservas.add(cmb_anio2);
        cmb_anio2.setBounds(280, 470, 70, 20);
        for(int x = 2020; x >= 1950; x--){
            cmb_anio2.addItem(""+x);
        }

        cmb_dia2.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        cmb_dia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        cmb_dia2.setAutoscrolls(true);
        panel_ingreso_reservas.add(cmb_dia2);
        cmb_dia2.setBounds(100, 470, 60, 20);
        cmb_dia.removeAllItems();
        for(int x = 1; x <= 31; x++){
            cmb_dia.addItem(""+x);
        }

        jLabel231.setBackground(java.awt.Color.darkGray);
        jLabel231.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel231.setForeground(java.awt.Color.darkGray);
        jLabel231.setText("dia");
        panel_ingreso_reservas.add(jLabel231);
        jLabel231.setBounds(130, 450, 30, 20);

        jLabel232.setBackground(java.awt.Color.darkGray);
        jLabel232.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel232.setForeground(java.awt.Color.darkGray);
        jLabel232.setText("/");
        panel_ingreso_reservas.add(jLabel232);
        jLabel232.setBounds(260, 470, 10, 20);

        jLabel233.setBackground(java.awt.Color.darkGray);
        jLabel233.setFont(new java.awt.Font("FreeSans", 1, 12)); // NOI18N
        jLabel233.setForeground(java.awt.Color.darkGray);
        jLabel233.setText("mes");
        panel_ingreso_reservas.add(jLabel233);
        jLabel233.setBounds(210, 450, 30, 20);

        jLabel234.setBackground(java.awt.Color.darkGray);
        jLabel234.setFont(new java.awt.Font("FreeSans", 1, 14)); // NOI18N
        jLabel234.setForeground(java.awt.Color.darkGray);
        jLabel234.setText("/");
        panel_ingreso_reservas.add(jLabel234);
        jLabel234.setBounds(170, 470, 10, 20);

        cmb_cantidad.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        cmb_cantidad.setAutoscrolls(true);
        panel_ingreso_reservas.add(cmb_cantidad);
        cmb_cantidad.setBounds(290, 350, 60, 20);
        for(int x = 1; x <= 1000; x++){
            cmb_cantidad.addItem(""+x+"");
        }

        jButton10.setText("-->");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panel_ingreso_reservas.add(jButton10);
        jButton10.setBounds(300, 290, 49, 23);

        lab_cantidad2.setBackground(java.awt.Color.darkGray);
        lab_cantidad2.setFont(new java.awt.Font("FreeSans", 1, 16)); // NOI18N
        lab_cantidad2.setForeground(new java.awt.Color(204, 51, 0));
        lab_cantidad2.setText("Cantidad:");
        panel_ingreso_reservas.add(lab_cantidad2);
        lab_cantidad2.setBounds(210, 350, 80, 21);

        lab_cantidad3.setBackground(java.awt.Color.darkGray);
        lab_cantidad3.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lab_cantidad3.setForeground(java.awt.Color.darkGray);
        lab_cantidad3.setText("Precio Unitario del Servicio:");
        panel_ingreso_reservas.add(lab_cantidad3);
        lab_cantidad3.setBounds(20, 240, 180, 19);

        tex_precioU1.setEditable(false);
        tex_precioU1.setBackground(java.awt.Color.white);
        tex_precioU1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_precioU1.setBorder(null);
        panel_ingreso_reservas.add(tex_precioU1);
        tex_precioU1.setBounds(200, 310, 69, 20);

        getContentPane().add(panel_ingreso_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 150, 100));
        getContentPane().remove(panel_ingreso_reservas);
        getContentPane().add(panel_ingreso_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_reservas.setVisible(false);

        panel_ingreso_servicios.setBackground(java.awt.Color.white);
        panel_ingreso_servicios.setLayout(null);

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel92.setText("jLabel4");
        jLabel92.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });
        panel_ingreso_servicios.add(jLabel92);
        jLabel92.setBounds(995, 0, 30, 30);

        jLabel94.setBackground(new java.awt.Color(33, 33, 33));
        jLabel94.setOpaque(true);
        panel_ingreso_servicios.add(jLabel94);
        jLabel94.setBounds(-2, 0, 1310, 30);

        jLabel95.setBackground(java.awt.Color.darkGray);
        jLabel95.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel95.setForeground(java.awt.Color.darkGray);
        jLabel95.setText("Imagen(opcional)");
        panel_ingreso_servicios.add(jLabel95);
        jLabel95.setBounds(470, 370, 120, 30);

        jLabel96.setBackground(java.awt.Color.darkGray);
        jLabel96.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel96.setForeground(java.awt.Color.darkGray);
        jLabel96.setText("Nombre");
        panel_ingreso_servicios.add(jLabel96);
        jLabel96.setBounds(470, 80, 80, 17);

        txt_precioS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_precioS.setText("0");
        txt_precioS.setBorder(null);
        panel_ingreso_servicios.add(txt_precioS);
        txt_precioS.setBounds(520, 120, 90, 23);

        lab_destinoS.setBackground(java.awt.Color.darkGray);
        lab_destinoS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lab_destinoS.setForeground(java.awt.Color.darkGray);
        lab_destinoS.setText("- Destino");
        panel_ingreso_servicios.add(lab_destinoS);
        lab_destinoS.setBounds(720, 190, 70, 17);

        jLabel98.setBackground(java.awt.Color.darkGray);
        jLabel98.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel98.setForeground(java.awt.Color.darkGray);
        jLabel98.setText("Descripcion");
        panel_ingreso_servicios.add(jLabel98);
        jLabel98.setBounds(470, 230, 100, 17);

        jLabel99.setBackground(java.awt.Color.darkGray);
        jLabel99.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel99.setForeground(java.awt.Color.darkGray);
        jLabel99.setText("Categorias seleccionadas");
        panel_ingreso_servicios.add(jLabel99);
        jLabel99.setBounds(270, 50, 180, 17);

        jButton2.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_ingreso_servicios.add(jButton2);
        jButton2.setBounds(590, 370, 140, 30);

        jLabel59.setText("Aqui se mostrara imagen");
        panel_ingreso_servicios.add(jLabel59);
        jLabel59.setBounds(470, 410, 220, 130);

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
        panel_ingreso_servicios.add(jLabel72);
        jLabel72.setBounds(985, 480, 45, 46);

        jLabel102.setBackground(java.awt.Color.darkGray);
        jLabel102.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel102.setForeground(java.awt.Color.darkGray);
        jLabel102.setText("Ciudad");
        panel_ingreso_servicios.add(jLabel102);
        jLabel102.setBounds(470, 160, 60, 17);

        cmb_proveedorS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_servicios.add(cmb_proveedorS);
        cmb_proveedorS.setBounds(560, 40, 250, 20);

        lab_origenS.setBackground(java.awt.Color.darkGray);
        lab_origenS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lab_origenS.setForeground(java.awt.Color.darkGray);
        lab_origenS.setText("- Origen");
        panel_ingreso_servicios.add(lab_origenS);
        lab_origenS.setBounds(490, 190, 80, 20);

        txt_descripcionS.setBorder(null);
        txt_descripcionS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(txt_descripcionS);

        panel_ingreso_servicios.add(jScrollPane1);
        jScrollPane1.setBounds(470, 260, 550, 100);

        tree_servicios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tree_servicios2MouseClicked(evt);
            }
        });
        tree_servicios2.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_servicios2ValueChanged(evt);
            }
        });
        jScrollPane16.setViewportView(tree_servicios2);

        panel_ingreso_servicios.add(jScrollPane16);
        jScrollPane16.setBounds(150, 710, 230, 130);

        lbl_precio.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_precio.setText("Precio");
        panel_ingreso_servicios.add(lbl_precio);
        lbl_precio.setBounds(470, 120, 70, 20);

        txt_nombreS.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_nombreS.setBorder(null);
        panel_ingreso_servicios.add(txt_nombreS);
        txt_nombreS.setBounds(540, 80, 250, 17);

        cmb_destinoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_servicios.add(cmb_destinoS);
        cmb_destinoS.setBounds(800, 190, 150, 20);

        cmb_origenS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panel_ingreso_servicios.add(cmb_origenS);
        cmb_origenS.setBounds(550, 190, 150, 20);

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
        panel_ingreso_servicios.add(chek_destinoS);
        chek_destinoS.setBounds(710, 150, 150, 19);

        jScrollPane18.setViewportView(lis_categoria);

        panel_ingreso_servicios.add(jScrollPane18);
        jScrollPane18.setBounds(20, 70, 180, 470);

        lis_categoriaS.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lis_categoriaSValueChanged(evt);
            }
        });
        jScrollPane19.setViewportView(lis_categoriaS);

        panel_ingreso_servicios.add(jScrollPane19);
        jScrollPane19.setBounds(270, 70, 180, 470);

        jLabel103.setBackground(java.awt.Color.darkGray);
        jLabel103.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel103.setForeground(java.awt.Color.darkGray);
        jLabel103.setText("Proveedor");
        panel_ingreso_servicios.add(jLabel103);
        jLabel103.setBounds(470, 40, 90, 17);

        jLabel107.setBackground(java.awt.Color.darkGray);
        jLabel107.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel107.setForeground(java.awt.Color.darkGray);
        jLabel107.setText("Categorias disponibles");
        panel_ingreso_servicios.add(jLabel107);
        jLabel107.setBounds(20, 50, 170, 17);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/back.png"))); // NOI18N
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        panel_ingreso_servicios.add(jLabel46);
        jLabel46.setBounds(220, 200, 36, 36);

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
        panel_ingreso_servicios.add(jLabel47);
        jLabel47.setBounds(220, 150, 36, 36);

        getContentPane().add(panel_ingreso_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 160, 110));
        getContentPane().remove(panel_ingreso_servicios);
        getContentPane().add(panel_ingreso_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_ingreso_servicios.setVisible(false);

        panel_consultas_reservas.setBackground(java.awt.Color.white);
        panel_consultas_reservas.setLayout(null);

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel134.setText("jLabel4");
        jLabel134.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel134.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel134MouseClicked(evt);
            }
        });
        panel_consultas_reservas.add(jLabel134);
        jLabel134.setBounds(995, 5, 30, 30);

        jLabel138.setBackground(new java.awt.Color(33, 33, 33));
        jLabel138.setOpaque(true);
        panel_consultas_reservas.add(jLabel138);
        jLabel138.setBounds(-2, 0, 1310, 40);

        jLabel141.setBackground(java.awt.Color.darkGray);
        jLabel141.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel141.setForeground(java.awt.Color.darkGray);
        jLabel141.setText("Estado");
        panel_consultas_reservas.add(jLabel141);
        jLabel141.setBounds(10, 180, 90, 19);

        jLabel142.setBackground(java.awt.Color.darkGray);
        jLabel142.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel142.setForeground(java.awt.Color.darkGray);
        jLabel142.setText("Reservas");
        panel_consultas_reservas.add(jLabel142);
        jLabel142.setBounds(10, 60, 60, 19);

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel143.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel143.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel143.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel143.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        panel_consultas_reservas.add(jLabel143);
        jLabel143.setBounds(970, 530, 45, 46);

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
        panel_consultas_reservas.add(cmb_reservasI);
        cmb_reservasI.setBounds(90, 60, 120, 20);

        jLabel145.setBackground(java.awt.Color.darkGray);
        jLabel145.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel145.setForeground(java.awt.Color.darkGray);
        jLabel145.setText("Fecha de Creacion");
        panel_consultas_reservas.add(jLabel145);
        jLabel145.setBounds(10, 100, 130, 19);

        jLabel147.setBackground(java.awt.Color.darkGray);
        jLabel147.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel147.setForeground(java.awt.Color.darkGray);
        jLabel147.setText("Servicios y promociones asociados");
        panel_consultas_reservas.add(jLabel147);
        jLabel147.setBounds(10, 220, 230, 19);

        jScrollPane17.setViewportView(jList_reservasR);

        panel_consultas_reservas.add(jScrollPane17);
        jScrollPane17.setBounds(10, 250, 290, 320);

        lbl_ffin.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_ffin.setText("Fecha fin");
        panel_consultas_reservas.add(lbl_ffin);
        lbl_ffin.setBounds(310, 390, 70, 17);

        lbl_finicio.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_finicio.setText("Fecha inicio");
        panel_consultas_reservas.add(lbl_finicio);
        lbl_finicio.setBounds(310, 340, 90, 17);

        txt_cantidadR.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_reservas.add(txt_cantidadR);
        txt_cantidadR.setBounds(380, 290, 120, 23);

        txt_finicio.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_reservas.add(txt_finicio);
        txt_finicio.setBounds(400, 340, 120, 23);

        txt_ffin.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        panel_consultas_reservas.add(txt_ffin);
        txt_ffin.setBounds(380, 390, 120, 23);

        txt_creacionR.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_creacionR.setBorder(null);
        panel_consultas_reservas.add(txt_creacionR);
        txt_creacionR.setBounds(140, 100, 140, 23);

        txt_precioR.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_precioR.setBorder(null);
        txt_precioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioRActionPerformed(evt);
            }
        });
        panel_consultas_reservas.add(txt_precioR);
        txt_precioR.setBounds(90, 140, 140, 17);

        txt_estadoR.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_estadoR.setBorder(null);
        panel_consultas_reservas.add(txt_estadoR);
        txt_estadoR.setBounds(60, 180, 140, 17);

        jLabel221.setBackground(java.awt.Color.darkGray);
        jLabel221.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel221.setForeground(java.awt.Color.darkGray);
        jLabel221.setText("Precio total");
        panel_consultas_reservas.add(jLabel221);
        jLabel221.setBounds(10, 140, 90, 19);

        jButton9.setText("Seleccionar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        panel_consultas_reservas.add(jButton9);
        jButton9.setBounds(310, 250, 110, 23);

        lbl_cantidadR1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_cantidadR1.setText("Cantidad");
        panel_consultas_reservas.add(lbl_cantidadR1);
        lbl_cantidadR1.setBounds(310, 290, 70, 20);

        getContentPane().add(panel_consultas_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 180, 110));
        getContentPane().remove(panel_consultas_reservas);
        getContentPane().add(panel_consultas_reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_reservas.setVisible(false);

        panel_consultas_clientes.setBackground(java.awt.Color.white);
        panel_consultas_clientes.setLayout(null);

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel184.setText("jLabel4");
        jLabel184.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel184.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel184.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel184MouseClicked(evt);
            }
        });
        panel_consultas_clientes.add(jLabel184);
        jLabel184.setBounds(997, 1, 30, 30);

        jLabel185.setBackground(new java.awt.Color(33, 33, 33));
        jLabel185.setOpaque(true);
        panel_consultas_clientes.add(jLabel185);
        jLabel185.setBounds(-2, 0, 1310, 30);

        jLabel186.setBackground(java.awt.Color.darkGray);
        jLabel186.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel186.setForeground(java.awt.Color.darkGray);
        jLabel186.setText("Reservas vinculadas al cliente");
        panel_consultas_clientes.add(jLabel186);
        jLabel186.setBounds(10, 250, 280, 30);

        jLabel187.setBackground(java.awt.Color.darkGray);
        jLabel187.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel187.setForeground(java.awt.Color.darkGray);
        jLabel187.setText("Clientes");
        panel_consultas_clientes.add(jLabel187);
        jLabel187.setBounds(10, 50, 60, 20);

        jLabel188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel188.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel188.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel188.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel188.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel188.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel188MouseClicked(evt);
            }
        });
        panel_consultas_clientes.add(jLabel188);
        jLabel188.setBounds(980, 530, 45, 46);

        ListaCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaCli.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListaCliItemStateChanged(evt);
            }
        });
        panel_consultas_clientes.add(ListaCli);
        ListaCli.setBounds(80, 50, 280, 20);

        Articulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArticuloMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(Articulo);

        panel_consultas_clientes.add(jScrollPane13);
        jScrollPane13.setBounds(380, 410, 450, 170);

        jLabel214.setBackground(java.awt.Color.darkGray);
        jLabel214.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel214.setForeground(java.awt.Color.darkGray);
        jLabel214.setText("Fecha Nacimiento");
        panel_consultas_clientes.add(jLabel214);
        jLabel214.setBounds(10, 170, 150, 19);

        AnioCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        AnioCli.setBorder(null);
        AnioCli.setDisabledTextColor(java.awt.Color.white);
        AnioCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnioCliActionPerformed(evt);
            }
        });
        panel_consultas_clientes.add(AnioCli);
        AnioCli.setBounds(290, 170, 70, 30);

        jLabel215.setBackground(java.awt.Color.darkGray);
        jLabel215.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel215.setForeground(java.awt.Color.darkGray);
        jLabel215.setText("Nombre");
        panel_consultas_clientes.add(jLabel215);
        jLabel215.setBounds(10, 90, 60, 20);

        NomCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        NomCli.setBorder(null);
        NomCli.setDisabledTextColor(java.awt.Color.white);
        panel_consultas_clientes.add(NomCli);
        NomCli.setBounds(80, 90, 300, 30);

        jLabel216.setBackground(java.awt.Color.darkGray);
        jLabel216.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel216.setForeground(java.awt.Color.darkGray);
        jLabel216.setText("Apellido");
        panel_consultas_clientes.add(jLabel216);
        jLabel216.setBounds(10, 130, 60, 19);

        ApeCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        ApeCli.setBorder(null);
        ApeCli.setDisabledTextColor(java.awt.Color.white);
        panel_consultas_clientes.add(ApeCli);
        ApeCli.setBounds(80, 130, 300, 30);

        DiaCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        DiaCli.setBorder(null);
        DiaCli.setDisabledTextColor(java.awt.Color.white);
        panel_consultas_clientes.add(DiaCli);
        DiaCli.setBounds(150, 170, 70, 30);

        MesCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        MesCli.setBorder(null);
        MesCli.setDisabledTextColor(java.awt.Color.white);
        panel_consultas_clientes.add(MesCli);
        MesCli.setBounds(220, 170, 70, 30);

        jLabel217.setBackground(java.awt.Color.darkGray);
        jLabel217.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel217.setForeground(java.awt.Color.darkGray);
        jLabel217.setText("E-mail");
        panel_consultas_clientes.add(jLabel217);
        jLabel217.setBounds(10, 210, 40, 20);

        EmailCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        EmailCli.setBorder(null);
        EmailCli.setDisabledTextColor(java.awt.Color.white);
        panel_consultas_clientes.add(EmailCli);
        EmailCli.setBounds(80, 210, 300, 30);

        jLabel219.setText("Aqui se mostrara imagen");
        panel_consultas_clientes.add(jLabel219);
        jLabel219.setBounds(380, 50, 450, 240);

        jLabel222.setBackground(java.awt.Color.darkGray);
        jLabel222.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel222.setForeground(java.awt.Color.darkGray);
        jLabel222.setText("Precio total");
        panel_consultas_clientes.add(jLabel222);
        jLabel222.setBounds(380, 350, 120, 20);

        jLabel223.setBackground(java.awt.Color.darkGray);
        jLabel223.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel223.setForeground(java.awt.Color.darkGray);
        jLabel223.setText("Fecha de Creacion");
        panel_consultas_clientes.add(jLabel223);
        jLabel223.setBounds(380, 320, 130, 20);

        jLabel224.setBackground(java.awt.Color.darkGray);
        jLabel224.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel224.setForeground(java.awt.Color.darkGray);
        jLabel224.setText("Servicios y promociones asociados");
        panel_consultas_clientes.add(jLabel224);
        jLabel224.setBounds(380, 380, 250, 20);

        PrecioCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        PrecioCli.setBorder(null);
        panel_consultas_clientes.add(PrecioCli);
        PrecioCli.setBounds(460, 350, 150, 17);

        FCCli.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        FCCli.setBorder(null);
        panel_consultas_clientes.add(FCCli);
        FCCli.setBounds(510, 320, 170, 17);

        ReservasCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservasCliMouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(ReservasCli);

        panel_consultas_clientes.add(jScrollPane20);
        jScrollPane20.setBounds(10, 290, 350, 290);

        MesCli1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        MesCli1.setBorder(null);
        panel_consultas_clientes.add(MesCli1);
        MesCli1.setBounds(290, 200, 50, 17);

        getContentPane().add(panel_consultas_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 160, 110));
        getContentPane().remove(panel_consultas_clientes);
        getContentPane().add(panel_consultas_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_clientes.setVisible(false);

        panel_consultas_proveedores.setBackground(java.awt.Color.white);
        panel_consultas_proveedores.setLayout(null);

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/salir.png"))); // NOI18N
        jLabel179.setText("jLabel4");
        jLabel179.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel179.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel179.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel179MouseClicked(evt);
            }
        });
        panel_consultas_proveedores.add(jLabel179);
        jLabel179.setBounds(995, 5, 40, 40);

        jLabel180.setBackground(new java.awt.Color(33, 33, 33));
        jLabel180.setOpaque(true);
        panel_consultas_proveedores.add(jLabel180);
        jLabel180.setBounds(-2, 0, 1310, 40);

        jLabel181.setBackground(java.awt.Color.darkGray);
        jLabel181.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel181.setForeground(java.awt.Color.darkGray);
        jLabel181.setText("Servicios vinculados al proveedor");
        panel_consultas_proveedores.add(jLabel181);
        jLabel181.setBounds(10, 320, 280, 40);

        jLabel182.setBackground(java.awt.Color.darkGray);
        jLabel182.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel182.setForeground(java.awt.Color.darkGray);
        jLabel182.setText("Proveedores");
        panel_consultas_proveedores.add(jLabel182);
        jLabel182.setBounds(10, 50, 80, 20);

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel183.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel183.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel183.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel183.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel183.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel183MouseClicked(evt);
            }
        });
        panel_consultas_proveedores.add(jLabel183);
        jLabel183.setBounds(970, 520, 45, 46);

        cmb_proveedorP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_proveedorP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_proveedorPItemStateChanged(evt);
            }
        });
        panel_consultas_proveedores.add(cmb_proveedorP);
        cmb_proveedorP.setBounds(100, 50, 280, 20);

        jList_ServiciosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ServiciosPMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(jList_ServiciosP);

        panel_consultas_proveedores.add(jScrollPane11);
        jScrollPane11.setBounds(10, 360, 370, 180);

        jLabel189.setBackground(java.awt.Color.darkGray);
        jLabel189.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel189.setForeground(java.awt.Color.darkGray);
        jLabel189.setText("- Destino");
        panel_consultas_proveedores.add(jLabel189);
        jLabel189.setBounds(410, 140, 80, 40);

        jLabel190.setBackground(java.awt.Color.darkGray);
        jLabel190.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel190.setForeground(java.awt.Color.darkGray);
        jLabel190.setText("Descripcion");
        panel_consultas_proveedores.add(jLabel190);
        jLabel190.setBounds(390, 200, 100, 40);

        jLabel191.setBackground(java.awt.Color.darkGray);
        jLabel191.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel191.setForeground(java.awt.Color.darkGray);
        jLabel191.setText("Imagenes");
        panel_consultas_proveedores.add(jLabel191);
        jLabel191.setBounds(390, 330, 90, 40);

        jLabel193.setBackground(java.awt.Color.darkGray);
        jLabel193.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel193.setForeground(java.awt.Color.darkGray);
        jLabel193.setText("- Origen");
        panel_consultas_proveedores.add(jLabel193);
        jLabel193.setBounds(410, 110, 80, 40);

        txt_DescripcionP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jScrollPane12.setViewportView(txt_DescripcionP);

        panel_consultas_proveedores.add(jScrollPane12);
        jScrollPane12.setBounds(390, 240, 630, 90);

        jLabel194.setBackground(java.awt.Color.gray);
        jLabel194.setText("Aqui se mostrara imagen");
        jLabel194.setOpaque(true);
        panel_consultas_proveedores.add(jLabel194);
        jLabel194.setBounds(820, 370, 200, 120);

        jLabel195.setBackground(java.awt.Color.gray);
        jLabel195.setText("Aqui se mostrara imagen");
        jLabel195.setOpaque(true);
        panel_consultas_proveedores.add(jLabel195);
        jLabel195.setBounds(410, 370, 190, 120);

        jLabel196.setBackground(java.awt.Color.gray);
        jLabel196.setText("Aqui se mostrara imagen");
        jLabel196.setOpaque(true);
        panel_consultas_proveedores.add(jLabel196);
        jLabel196.setBounds(610, 370, 200, 120);

        jLabel197.setBackground(java.awt.Color.darkGray);
        jLabel197.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel197.setForeground(java.awt.Color.darkGray);
        jLabel197.setText("Ciudad");
        panel_consultas_proveedores.add(jLabel197);
        jLabel197.setBounds(390, 80, 60, 40);

        jLabel198.setBackground(java.awt.Color.darkGray);
        jLabel198.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel198.setForeground(java.awt.Color.darkGray);
        jLabel198.setText("Fecha Nacimiento");
        panel_consultas_proveedores.add(jLabel198);
        jLabel198.setBounds(10, 170, 120, 19);

        tex_anio.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_anio.setBorder(null);
        panel_consultas_proveedores.add(tex_anio);
        tex_anio.setBounds(290, 170, 50, 17);

        jLabel200.setBackground(java.awt.Color.darkGray);
        jLabel200.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel200.setForeground(java.awt.Color.darkGray);
        jLabel200.setText("Nombre");
        panel_consultas_proveedores.add(jLabel200);
        jLabel200.setBounds(10, 90, 50, 20);

        txt_NombreP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_NombreP.setBorder(null);
        panel_consultas_proveedores.add(txt_NombreP);
        txt_NombreP.setBounds(100, 90, 280, 17);

        jLabel201.setBackground(java.awt.Color.darkGray);
        jLabel201.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel201.setForeground(java.awt.Color.darkGray);
        jLabel201.setText("Apellido");
        panel_consultas_proveedores.add(jLabel201);
        jLabel201.setBounds(10, 130, 60, 19);

        txt_ApellidoP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_ApellidoP.setBorder(null);
        panel_consultas_proveedores.add(txt_ApellidoP);
        txt_ApellidoP.setBounds(100, 130, 280, 17);

        tex_dia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_dia.setBorder(null);
        panel_consultas_proveedores.add(tex_dia);
        tex_dia.setBounds(150, 170, 50, 17);

        tex_mes.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_mes.setBorder(null);
        panel_consultas_proveedores.add(tex_mes);
        tex_mes.setBounds(220, 170, 50, 17);

        jLabel202.setBackground(java.awt.Color.darkGray);
        jLabel202.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel202.setForeground(java.awt.Color.darkGray);
        jLabel202.setText("E-mail");
        panel_consultas_proveedores.add(jLabel202);
        jLabel202.setBounds(10, 200, 50, 40);

        txt_emailP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_emailP.setBorder(null);
        panel_consultas_proveedores.add(txt_emailP);
        txt_emailP.setBounds(60, 210, 280, 17);

        jLabel73.setText("Aqui se mostrara imagen de usuario");
        panel_consultas_proveedores.add(jLabel73);
        jLabel73.setBounds(790, 50, 220, 140);

        jLabel204.setBackground(java.awt.Color.darkGray);
        jLabel204.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel204.setForeground(java.awt.Color.darkGray);
        jLabel204.setText("Nombre empresa");
        panel_consultas_proveedores.add(jLabel204);
        jLabel204.setBounds(10, 250, 110, 30);

        txt_NombreEmpresaP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_NombreEmpresaP.setBorder(null);
        panel_consultas_proveedores.add(txt_NombreEmpresaP);
        txt_NombreEmpresaP.setBounds(130, 260, 240, 20);

        txt_LinkEmpresaP.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txt_LinkEmpresaP.setBorder(null);
        panel_consultas_proveedores.add(txt_LinkEmpresaP);
        txt_LinkEmpresaP.setBounds(110, 300, 240, 17);

        jLabel205.setBackground(java.awt.Color.darkGray);
        jLabel205.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel205.setForeground(java.awt.Color.darkGray);
        jLabel205.setText("Link empresa");
        panel_consultas_proveedores.add(jLabel205);
        jLabel205.setBounds(10, 290, 150, 30);

        tex_destino.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_destino.setBorder(null);
        panel_consultas_proveedores.add(tex_destino);
        tex_destino.setBounds(500, 150, 150, 17);

        tex_origen.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        tex_origen.setBorder(null);
        tex_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_origenActionPerformed(evt);
            }
        });
        panel_consultas_proveedores.add(tex_origen);
        tex_origen.setBounds(500, 120, 150, 17);

        getContentPane().add(panel_consultas_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, 180, 90));
        getContentPane().remove(panel_consultas_proveedores);
        getContentPane().add(panel_consultas_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 1030, 590));
        panel_consultas_proveedores.setVisible(false);

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/Help4Travelling-logo1.png"))); // NOI18N
        jLabel124.setText("jLabel124");
        getContentPane().add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 440, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                        ImageIcon img = new ImageIcon("Help4Travelling.jpg");
                this.setIconImage(img.getImage());

    }//GEN-LAST:event_formWindowOpened

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained

    }//GEN-LAST:event_jLabel9FocusGained

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        panel_izq_acerca_de.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq.setVisible(true);
        lbl_menu.setText("          Registros");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained

    }//GEN-LAST:event_jLabel11FocusGained

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        lbl_mostrar_registros.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        lbl_mostrar_consultas.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        lbl_mostrar_modificaciones.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        lbl_mostrar_eliminaciones.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        lbl_mostrar_registros.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        lbl_mostrar_consultas.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        lbl_mostrar_modificaciones.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        lbl_mostrar_eliminaciones.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        lbl_menu.setText(" ");
        panel_izq.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void ingreso_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseEntered
        ingreso_usuarios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_usuariosMouseEntered

    private void ingreso_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseExited
        ingreso_usuarios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_usuariosMouseExited

    private void ingreso_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseEntered
        ingreso_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_reservasMouseEntered

    private void ingreso_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseExited
        ingreso_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_reservasMouseExited

    private void ingreso_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseEntered
        ingreso_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_serviciosMouseEntered

    private void ingreso_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseExited
        ingreso_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_serviciosMouseExited

    private void ingreso_promocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseEntered
        ingreso_promociones.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_promocionesMouseEntered

    private void ingreso_promocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseExited
        ingreso_promociones.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_promocionesMouseExited

    private void ingreso_categoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseEntered
        ingreso_categorias.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_ingreso_categoriasMouseEntered

    private void ingreso_categoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseExited
        ingreso_categorias.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ingreso_categoriasMouseExited

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        lbl_menu.setText(" ");
        panel_izq_acerca_de.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked

    private void panel_izq_acerca_deComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panel_izq_acerca_deComponentShown

    }//GEN-LAST:event_panel_izq_acerca_deComponentShown

    private void eliminacion_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseExited
        eliminacion_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_eliminacion_reservasMouseExited

    private void eliminacion_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseEntered
        eliminacion_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_eliminacion_reservasMouseEntered

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        panel_izq_eliminaciones.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel34MouseClicked

    private void actualizacion_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseExited
        actualizacion_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_actualizacion_reservasMouseExited

    private void actualizacion_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseEntered
        actualizacion_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_actualizacion_reservasMouseEntered

    private void actualizacion_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseExited
        actualizacion_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_actualizacion_serviciosMouseExited

    private void actualizacion_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseEntered
        actualizacion_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_actualizacion_serviciosMouseEntered

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        panel_izq_actualizaciones.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_actualizaciones.setVisible(true);
        lbl_menu.setText("          Modificaciones");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_eliminaciones.setVisible(true);
        lbl_menu.setText("          Eliminaciones");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void consultar_proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseExited
        consultar_proveedores.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_proveedoresMouseExited

    private void consultar_proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseEntered
        consultar_proveedores.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_proveedoresMouseEntered

    private void consultar_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseExited
        consultar_clientes.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_clientesMouseExited

    private void consultar_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseEntered
        consultar_clientes.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_clientesMouseEntered

    private void consultar_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseExited
        consultar_servicios.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_serviciosMouseExited

    private void consultar_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseEntered
        consultar_servicios.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_serviciosMouseEntered

    private void consultar_promocionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseExited
        consultar_promociones.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_promocionesMouseExited

    private void consultar_promocionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseEntered
        consultar_promociones.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_promocionesMouseEntered

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        panel_izq_consultas.setVisible(false);
        lbl_menu.setText(" ");
    }//GEN-LAST:event_jLabel66MouseClicked

    private void consultar_reservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseExited
        consultar_reservas.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_consultar_reservasMouseExited

    private void consultar_reservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseEntered
        consultar_reservas.setBackground(new Color(48,48,48));
    }//GEN-LAST:event_consultar_reservasMouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        panel_izq.setVisible(false);
        panel_izq_acerca_de.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        lbl_menu.setText("          Consultas");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void ingreso_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_usuariosMouseClicked
        panel_ingreso_usuarios.setVisible(true);
        lbl_menu.setText("          Registrar usuario");
        panel_izq.setVisible(false);
        panel_ingreso_usuarios.setVisible(true);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_ingreso_usuariosMouseClicked

    private void jLabel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_usuarios.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
        txt_nickname.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_nombreEmpresa.setText("");
        txt_email.setText("");
        txt_linkEmpresa.setText("");
    }//GEN-LAST:event_jLabel81MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ingreso_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_serviciosMouseClicked
        list2.clear();
        panel_ingreso_servicios.setVisible(true);
        lbl_menu.setText("          Registrar servicio");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
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
        

    }//GEN-LAST:event_ingreso_serviciosMouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_categorias.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
        txt_categoria.setText("");
        chek_padre.setState(false);

    }//GEN-LAST:event_jLabel93MouseClicked

    private void ingreso_categoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_categoriasMouseClicked
        panel_ingreso_categorias.setVisible(true);
        lbl_menu.setText("          Registrar categoria");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        //listar categorias!
        //devuelve arry list dtcategoria
        ArrayList<DtCategoria> listdtcat = new ArrayList();
        listdtcat = ICCategoria.listarCategorias();
        ArrayList<String> lista = new ArrayList();
        listdtcat.forEach(i -> lista.add(((DtCategoria)i).getNombre()));
        //cmb_categoria = new JComboBox(lista.toArray();
        cmb_categoria.setModel(new DefaultComboBoxModel(lista.toArray()));
        lab_categoria.setVisible(false);
        cmb_categoria.setVisible(false);

    }//GEN-LAST:event_ingreso_categoriasMouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_promociones.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel101MouseClicked

    private void ingreso_promocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_promocionesMouseClicked
        panel_ingreso_promociones.setVisible(true);
        lbl_menu.setText("          Registrar promocion");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        cmb_ing_prom.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
    }//GEN-LAST:event_ingreso_promocionesMouseClicked

    private void ingreso_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso_reservasMouseClicked
        panel_ingreso_reservas.setVisible(true);
        lbl_menu.setText("          Registrar reserva");
        panel_izq.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        cmb_cliente.setModel(new DefaultComboBoxModel(ICUsuario.listarClientes().toArray()));
        cmb_proveedor.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
        //cmb_proveedor.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
        
        cmb_cantidad.setSelectedItem(1);
        tex_precio.setText("");
        tex_precioU.setText("");
        list2.clear();
        //for (int i = 0; i < .size(); i++){
         //   list2.addElement(.get(i).getNombre());
        //}
        
        ArrayList<DtServicio> listdtServ = new ArrayList();
        listdtServ = ICArticulo.ListarServicios();
        
        ArrayList<String> lista = new ArrayList();
        
        listdtServ.forEach(i -> lista.add(((DtServicio)i).getNombre()));
        cmb_servicio.setModel(new DefaultComboBoxModel(lista.toArray()));
        
        ArrayList<DtPromocion> listdtProm = new ArrayList();
        listdtProm = ICArticulo.listarPromociones();
        
        ArrayList<String> listaP = new ArrayList();
        listdtProm.forEach(i -> listaP.add(((DtPromocion)i).GetNombre()));
        cmb_promocion.setModel(new DefaultComboBoxModel(listaP.toArray()));
        
        
        
        
    }//GEN-LAST:event_ingreso_reservasMouseClicked

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        if(img_actualizar_servicios.isVisible()){
            img_actualizar_servicios.setVisible(false);
        }
        else{
            lbl_menu.setText("          Modificaciones");
            panel_actualizar_servicio.setVisible(false);
            panel_izq_actualizaciones.setVisible(true);
            jLabel9.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            lbl_acercaDe.setVisible(true);
        }
    }//GEN-LAST:event_jLabel110MouseClicked

    private void actualizacion_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_serviciosMouseClicked
        panel_actualizar_servicio.setVisible(true);
        lbl_menu.setText("          Modificar servicio");
        panel_izq_actualizaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        List<String> c = ICArticulo.listaDeCiudades();  ArrayList<DtServicio> s = ICArticulo.ListarServicios(); DefaultComboBoxModel lm = new DefaultComboBoxModel(); DefaultComboBoxModel lm2 = new DefaultComboBoxModel();
        for(int x = 0; x < s.size(); x++){
            lm.addElement(s.get(x).getNickProveedor() + ", " + s.get(x).getNombre());
        }
        cmb_actualizar_servicio.setModel(lm);
        for(int e = 0; e < c.size(); e++){
            lm2.addElement(c.get(e));
        }
        cmb_origen.setModel(lm2);
        cmb_destino.setModel(lm2);
        DefaultMutableTreeNode tree = new DefaultMutableTreeNode("todas");
        ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();

        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }
        HashMap<String, DefaultMutableTreeNode> tree2 = new HashMap();
        tree2.put("todas", tree);
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
        DefaultTreeModel modeloTree = new DefaultTreeModel(tree);
        tree_actualizar_servicios.setModel(modeloTree);
        
        

    }//GEN-LAST:event_actualizacion_serviciosMouseClicked

    private void actualizacion_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizacion_reservasMouseClicked
        panel_actualizar_reserva.setVisible(true);
        lbl_menu.setText("          Modificar reserva");
        panel_izq_actualizaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);

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

    }//GEN-LAST:event_actualizacion_reservasMouseClicked

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
        lbl_menu.setText("          Modificaciones");
        panel_actualizar_reserva.setVisible(false);
        panel_izq_actualizaciones.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);

    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel132MouseClicked
        lbl_menu.setText("          Eliminaciones");
        panel_eliminar_reserva.setVisible(false);
        panel_izq_eliminaciones.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel132MouseClicked

    private void eliminacion_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminacion_reservasMouseClicked
        panel_eliminar_reserva.setVisible(true);
        lbl_menu.setText("          Eliminar reserva");
        panel_izq_eliminaciones.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
    }//GEN-LAST:event_eliminacion_reservasMouseClicked

    private void consultar_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_clientesMouseClicked
        panel_consultas_clientes.setVisible(true);
        lbl_menu.setText("          Consultar cliente");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        
        ListaCli.setModel(new DefaultComboBoxModel(ICUsuario.listarClientes().toArray()));
        
        NomCli.setVisible(false);
        ApeCli.setVisible(false);
        AnioCli.setVisible(false);
        MesCli.setVisible(false);
        DiaCli.setVisible(false);
        EmailCli.setVisible(false);
        FCCli.setVisible(false);
        PrecioCli.setVisible(false);
        list2.clear();
        
        NomCli.setEnabled(false);
        ApeCli.setEnabled(false);
        AnioCli.setEnabled(false);
        MesCli.setEnabled(false);
        DiaCli.setEnabled(false);
        EmailCli.setEnabled(false);
        FCCli.setEnabled(false);
        PrecioCli.setEnabled(false);
        
        NomCli.setText("");
        ApeCli.setText("");
        AnioCli.setText("");
        MesCli.setText("");
        DiaCli.setText("");
        EmailCli.setText("");
        FCCli.setText("");
        PrecioCli.setText("");
        list3.clear();
        Articulo.setModel(list3);
    }//GEN-LAST:event_consultar_clientesMouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_servicios.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel144MouseClicked

    private void consultar_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_serviciosMouseClicked
        panel_consultas_servicios.setVisible(true);
        lbl_menu.setText("          Consultar servicio");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);

        DefaultMutableTreeNode tree = new DefaultMutableTreeNode("todas");
        ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();

        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }
        HashMap<String, DefaultMutableTreeNode> tree2 = new HashMap();
        tree2.put("todas", tree);
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

        DefaultTreeModel modeloTree = new DefaultTreeModel(tree);
        tree_servicios.setModel(modeloTree);

    }//GEN-LAST:event_consultar_serviciosMouseClicked

    private void jLabel162MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel162MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_servicios.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel162MouseClicked

    private void consultar_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_reservasMouseClicked
        //222
        panel_consultas_reservas.setVisible(true);
        lbl_menu.setText("          Consultar reserva");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        jLabel143.setVisible(false);
        
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
        
    }//GEN-LAST:event_consultar_reservasMouseClicked

    private void jLabel148MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel148MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_promociones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel148MouseClicked

    private void consultar_promocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_promocionesMouseClicked
        panel_consultas_promociones.setVisible(true);
        lbl_menu.setText("          Consultar promociones");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        
        ArrayList<DtPromocion> promos = ICArticulo.listarPromociones();
        DefaultComboBoxModel listModel = new DefaultComboBoxModel();
        for(int x = 0; x < promos.size(); x++){
            listModel.addElement(promos.get(x).getNickProv() + ", " + promos.get(x).GetNombre());
        }
        cmb_consultar_promociones.setModel(listModel);
        
    }//GEN-LAST:event_consultar_promocionesMouseClicked

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_promociones.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel163MouseClicked

    private void consultar_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_proveedoresMouseClicked
        panel_consultas_proveedores.setVisible(true);
        lbl_menu.setText("          Consultar proveedor");
        panel_izq_consultas.setVisible(false);
        jLabel9.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        lbl_acercaDe.setVisible(false);
        cmb_proveedorP.setModel(new DefaultComboBoxModel(ICUsuario.listarProveedores().toArray()));
        txt_NombreP.setEnabled(false);
        txt_ApellidoP.setEnabled(false);
        txt_emailP.setEnabled(false);
        txt_NombreEmpresaP.setEnabled(false);
        txt_LinkEmpresaP.setEnabled(false);
        txt_DescripcionP.setEnabled(false);
        tex_anio.setEnabled(false);
        tex_mes.setEnabled(false);
        tex_dia.setEnabled(false);
        tex_origen.setEnabled(false);
        tex_destino.setEnabled(false);
        list2.clear();
        txt_NombreP.setText("");
        txt_ApellidoP.setText("");
        txt_emailP.setText("");
        txt_NombreEmpresaP.setText("");
        txt_LinkEmpresaP.setText("");
        txt_DescripcionP.setText("");
        tex_anio.setText("");
        tex_mes.setText("");
        tex_dia.setText("");
        tex_origen.setText("");
        tex_destino.setText("");
        
        txt_NombreP.setVisible(false);
        txt_ApellidoP.setVisible(false);
        txt_emailP.setVisible(false);
        txt_NombreEmpresaP.setVisible(false);
        txt_LinkEmpresaP.setVisible(false);
        txt_DescripcionP.setVisible(false);
        tex_anio.setVisible(false);
        tex_mes.setVisible(false);
        tex_dia.setVisible(false);
        tex_origen.setVisible(false);
        tex_destino.setVisible(false);
    }//GEN-LAST:event_consultar_proveedoresMouseClicked

    private void lbl_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseEntered
        lbl_mostrar_cerrar.setVisible(true);
    }//GEN-LAST:event_lbl_cerrarMouseEntered

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        lbl_mostrar_cerrar.setVisible(false);
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void lbl_acercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseEntered
        lbl_mostrar_acercaDe.setVisible(true);
    }//GEN-LAST:event_lbl_acercaDeMouseEntered

    private void lbl_acercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseExited
        lbl_mostrar_acercaDe.setVisible(false);
        panel_izq_acerca_de.setLocation(220, 90);
        panel_izq_acerca_de.repaint();
    }//GEN-LAST:event_lbl_acercaDeMouseExited

    private void lbl_acercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_acercaDeMouseClicked
        panel_izq_acerca_de.setLocation(220, 90);
        panel_izq_acerca_de.repaint();
        panel_izq.setVisible(false);
        panel_izq_eliminaciones.setVisible(false);
        panel_izq_actualizaciones.setVisible(false);
        panel_izq_consultas.setVisible(false);
        panel_izq_acerca_de.setVisible(true);
        lbl_menu.setText("          Acerca de");
    }//GEN-LAST:event_lbl_acercaDeMouseClicked

    private void chk_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_clienteActionPerformed
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteActionPerformed

    private void chk_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_proveedorActionPerformed
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorActionPerformed

    private void chk_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_clienteMouseClicked
        txt_nombreEmpresa.setVisible(false);
        txt_linkEmpresa.setVisible(false);
        lbl_nombreEmpresa.setVisible(false);
        lbl_linkEmpresa.setVisible(false);
    }//GEN-LAST:event_chk_clienteMouseClicked

    private void chk_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_proveedorMouseClicked
        txt_nombreEmpresa.setVisible(true);
        txt_linkEmpresa.setVisible(true);
        lbl_nombreEmpresa.setVisible(true);
        lbl_linkEmpresa.setVisible(true);
    }//GEN-LAST:event_chk_proveedorMouseClicked

    private void jLabel71KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel71KeyPressed

    }//GEN-LAST:event_jLabel71KeyPressed

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
            //String nick,nomb,apell,empr,emai,link;
            if(chk_cliente.isSelected())
                chk_cliente.setSelected(true);
            else
                chk_proveedor.setSelected(true);

            if (chk_cliente.isSelected() && !txt_nickname.getText().isEmpty() && !txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty()  && !txt_email.getText().isEmpty()){
                //Es un cliente
                DtFecha nacimiento = new DtFecha(Integer.valueOf(cmb_anio_u.getSelectedItem().toString().trim()),Integer.valueOf(cmb_mes.getSelectedItem().toString().trim()),Integer.valueOf(cmb_dia.getSelectedItem().toString().trim()));
                ICUsuario.AltaCliente(new DtCliente (txt_nickname.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_email.getText(), nacimiento,null,null));
                //procedimiento
                txt_nickname.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_email.setText("");
                JOptionPane.showMessageDialog(null, "Usuario ingresado");
            }
            else if(chk_proveedor.isSelected() && !txt_nickname.getText().isEmpty() && !txt_nombre.getText().isEmpty() && !txt_apellido.getText().isEmpty() && !txt_email.getText().isEmpty() && !txt_linkEmpresa.getText().isEmpty() && !txt_nombreEmpresa.getText().isEmpty()){
                DtFecha nacimiento = new DtFecha(Integer.valueOf(cmb_anio_u.getSelectedItem().toString().trim()),Integer.valueOf(cmb_mes.getSelectedItem().toString().trim()),Integer.valueOf(cmb_dia.getSelectedItem().toString().trim()));
                ICUsuario.AltaProveedor(new DtProveedor (txt_nickname.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_email.getText(),nacimiento,null,txt_nombreEmpresa.getText(),txt_linkEmpresa.getText(), null));
                txt_nickname.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_nombreEmpresa.setText("");
                txt_email.setText("");
                txt_linkEmpresa.setText("");
                JOptionPane.showMessageDialog(null, "Usuario ingresado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Faltan atributos sin completar, verifique y vuelva a intentar.","Compos sin completar",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
      chk_cliente.setSelected(true);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        if(txt_categoria.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para la categoria, verifique y vuelva a intentar.","Compos sin completar",JOptionPane.WARNING_MESSAGE);
        }else if(chek_padre.getState()){
            ICCategoria.IngresarCategoria(txt_categoria.getText(), cmb_categoria.getSelectedItem().toString());
            txt_categoria.setText("");
            JOptionPane.showMessageDialog(null, "Categoria ingresado");
            chek_padre.setState(false);
            lab_categoria.setVisible(false);
            cmb_categoria.setVisible(false);
        }
        else{
            ICCategoria.IngresarCategoria(txt_categoria.getText());
            txt_categoria.setText("");
            JOptionPane.showMessageDialog(null, "Categoria ingresado");
            chek_padre.setState(false);
            lab_categoria.setVisible(false);
            cmb_categoria.setVisible(false);
        }
    }//GEN-LAST:event_jLabel74MouseClicked

    private void cmb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoriaActionPerformed

    private void chek_padreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chek_padreMouseClicked
        if (chek_padre.getState()){
            lab_categoria.setVisible(true);
            cmb_categoria.setVisible(true);
        }
        else{
            lab_categoria.setVisible(false);
            cmb_categoria.setVisible(false);
        }
    }//GEN-LAST:event_chek_padreMouseClicked

    private void chek_padreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chek_padreItemStateChanged
        if (chek_padre.getState()){
            lab_categoria.setVisible(true);
            cmb_categoria.setVisible(true);
        }
        else{
            lab_categoria.setVisible(false);
            cmb_categoria.setVisible(false);
        }
    }//GEN-LAST:event_chek_padreItemStateChanged

    private void tree_serviciosValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_serviciosValueChanged
        lbl_proveedor1.setText("");
        lbl_nombre1.setText("");
        lbl_origen1.setText("");
        lbl_destino1.setText("");
        lbl_desc1.setText("");
        cmb_serviciosXcat.removeAllItems();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree_servicios.getLastSelectedPathComponent();
        String nameCat = (String)node.getUserObject();
        ArrayList<DtServicio> servs = ICCategoria.listarServicios(nameCat);
        if(!servs.isEmpty() || servs == null){
            cmb_serviciosXcat.removeAllItems();
            int x = servs.size();
            for(int e = 0; e < x; e++){
                cmb_serviciosXcat.addItem(servs.get(e).getNickProveedor() + "," + servs.get(e).getNombre());
            }


        }
    }//GEN-LAST:event_tree_serviciosValueChanged

    private void tree_serviciosTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_tree_serviciosTreeExpanded
        cmb_serviciosXcat.removeAllItems();
        lbl_nombre1.setText("");
        lbl_proveedor1.setText("");
        lbl_origen1.setText("");
        lbl_destino1.setText("");
        lbl_desc1.setText("");
    }//GEN-LAST:event_tree_serviciosTreeExpanded

    private void cmb_serviciosXcatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatItemStateChanged
        String nickP, nombreA;
        if(cmb_serviciosXcat.getModel().getSize() != 0){
            nickP = cmb_serviciosXcat.getSelectedItem().toString().substring(0, cmb_serviciosXcat.getSelectedItem().toString().lastIndexOf(","));
            nombreA = cmb_serviciosXcat.getSelectedItem().toString().substring(cmb_serviciosXcat.getSelectedItem().toString().lastIndexOf(",")+1);
            DtServicio ret = ICArticulo.datosServicio(nombreA, nickP);
            lbl_nombre1.setText(ret.getNombre());
            lbl_origen1.setText(ret.getCiudadOrigen());
            lbl_destino1.setText(ret.getCiudadDestino());
            lbl_desc1.setText(ret.getDescripcion());
        }
    }//GEN-LAST:event_cmb_serviciosXcatItemStateChanged

    private void table_reservasCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_table_reservasCaretPositionChanged

    }//GEN-LAST:event_table_reservasCaretPositionChanged

    private void table_reservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reservasMouseClicked
        int i = table_reservas.getSelectedRow();
        TableModel md = table_reservas.getModel();
        int idSel = (int)md.getValueAt(i, 1);
        DtReserva actual = ICReserva.ObtenerDatosReserva(idSel);
        lbl_estadoActual.setText(actual.GetEstado().toString());
    }//GEN-LAST:event_table_reservasMouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
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
    }//GEN-LAST:event_jLabel42MouseClicked

    private void cmb_serviciosXcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_serviciosXcatMouseClicked

    private void cmb_serviciosXcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_serviciosXcatActionPerformed

    private void jLabel106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel106MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_reservas.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel106MouseClicked

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked

        if(table_ingreso_reservas.getModel().getRowCount() != 0){
            ArrayList<DtInfoReserva> res = new ArrayList();
            for(int x = 0; x < table_ingreso_reservas.getModel().getRowCount(); x++){
                res.add(new DtInfoReserva(new DtFecha(table_ingreso_reservas.getValueAt(x,3).toString().trim()), new DtFecha(table_ingreso_reservas.getValueAt(x,4).toString().trim()), Integer.valueOf(table_ingreso_reservas.getValueAt(x,0).toString().trim()), table_ingreso_reservas.getValueAt(x,1).toString().trim(), table_ingreso_reservas.getValueAt(x,2).toString().trim(), Float.valueOf(table_ingreso_reservas.getValueAt(x,5).toString().trim()))); 
            } //                                                       FECHA INI                                              FECHA FIN                                                             CANTIDAD                                                                    NOMBRE ARTICULO                                          NICK PROVEEDOR                                               PRECIO TOTAL POR ARTICULO
            DtReserva ing = new DtReserva(Estado.Registrada, new DtFecha(Integer.valueOf(Year.now().toString()), YearMonth.now().getMonthValue(),MonthDay.now().getDayOfMonth()), res ,cmb_cliente.getSelectedItem().toString().trim(), Float.valueOf(tex_precio.getText().trim()));
            ManejadorSQL.GetInstance().agregarReserva(ing);
            tex_precioU.setText("");
            cmb_cantidad.setSelectedItem(1);
            tex_precio.setText("");
            list2.clear();
            JOptionPane.showMessageDialog(null, "Reserva ingresada correctamente!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos un articulo ingresado!");
        }
    }//GEN-LAST:event_jLabel76MouseClicked

    private void cmb_proveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_proveedorItemStateChanged
        if (!cmb_proveedor.getSelectedItem().toString().isEmpty()){
            cmb_servicio.setEnabled(true);
            cmb_promocion.setEnabled(true);
            cmb_servicio.removeAllItems();
            cmb_promocion.removeAllItems();
            cmb_cantidad.setSelectedItem(1);
            tex_precio.setText("");
            ((DefaultTableModel)table_ingreso_reservas.getModel()).setRowCount(0);
            ArrayList<DtServicio> ret =  ICArticulo.ListarServiciosProv(cmb_proveedor.getSelectedItem().toString());
            for(int i = 0; i < ret.size(); i++){
                cmb_servicio.addItem(ret.get(i).getNombre());
            }
            ArrayList<DtPromocion> ret2 =  ICArticulo.listarPromocionesProv(cmb_proveedor.getSelectedItem().toString());
            for(int i = 0; i < ret2.size(); i++){
                cmb_promocion.addItem(ret2.get(i).GetNombre());
            }
            for(int e = 0; e < table_ingreso_reservas.getModel().getRowCount(); e++){
                ((DefaultTableModel)table_ingreso_reservas.getModel()).removeRow(e);
            }
        }
    }//GEN-LAST:event_cmb_proveedorItemStateChanged

    private void tex_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_precioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cmb_servicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_servicioItemStateChanged
            if (cmb_servicio.getSelectedItem() != null){
                DtServicio serv = ICArticulo.datosServicio(cmb_servicio.getSelectedItem().toString(), cmb_proveedor.getSelectedItem().toString());
                tex_precioU.setText(""+serv.getPrecio());
            }
            
    }//GEN-LAST:event_cmb_servicioItemStateChanged

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        ((DefaultTableModel)table_ingreso_reservas.getModel()).setRowCount(0);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if(table_ingreso_reservas.getSelectedRowCount() == 1){
            ((DefaultTableModel)table_ingreso_reservas.getModel()).removeRow(table_ingreso_reservas.getSelectedRow());
            float precioT = 0;
            for(int x = 0; x < table_ingreso_reservas.getRowCount(); x++){
                precioT += (float)table_ingreso_reservas.getValueAt(x, 6);
            }
            tex_precio.setText(""+precioT);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(cmb_servicio.isEnabled()){
            DtFecha ini, fin;
            ini = new DtFecha(cmb_anio1.getSelectedItem().toString().trim() + "/" + cmb_mes1.getSelectedItem().toString().trim() + "/" + cmb_dia1.getSelectedItem().toString().trim());
            fin = new DtFecha(cmb_anio2.getSelectedItem().toString().trim() + "/" + cmb_mes2.getSelectedItem().toString().trim() + "/" + cmb_dia2.getSelectedItem().toString().trim());
            DefaultTableModel tm = (DefaultTableModel)table_ingreso_reservas.getModel();
            Object[] row = new Object[7];
            row[0] = Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim());
            row[1] = cmb_servicio.getSelectedItem().toString().trim();
            row[2] = cmb_proveedor.getSelectedItem().toString().trim();
            row[3] = (ini.getAnio() + "/" + ini.getMes() + "/" + ini.getDia());
            row[4] = (fin.getAnio() + "/" + fin.getMes() + "/" + fin.getDia());
            DtServicio selected = ICArticulo.datosServicio(cmb_servicio.getSelectedItem().toString().trim(), cmb_proveedor.getSelectedItem().toString().trim());
            row[5] = selected.getPrecio();
            row[6] = (Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim())*selected.getPrecio());

            boolean exists = false;
            for (int i = 0; i < table_ingreso_reservas.getRowCount(); i++) {
                if (Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim()).equals(Integer.valueOf(table_ingreso_reservas.getValueAt(i, 0).toString().trim())) && cmb_servicio.getSelectedItem().toString().trim().equals(table_ingreso_reservas.getValueAt(i, 1).toString().trim()) && cmb_proveedor.getSelectedItem().toString().trim().equals(table_ingreso_reservas.getValueAt(i, 2).toString().trim())){
                    if((ini.getAnio() + "/" + ini.getMes() + "/" + ini.getDia()).equals(table_ingreso_reservas.getValueAt(i, 3).toString().trim()) && (fin.getAnio() + "/" + fin.getMes() + "/" + fin.getDia()).equals(table_ingreso_reservas.getValueAt(i, 4).toString().trim())){
                        float f1, f2, f3;
                        f1 = Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim())*selected.getPrecio();
                        f2 = Float.valueOf(table_ingreso_reservas.getValueAt(i, 6).toString().trim());
                        f3 = Float.valueOf(table_ingreso_reservas.getValueAt(i, 5).toString().trim());
                        if((Float.compare(f3, selected.getPrecio()) == 0) && (Float.compare(f1, f2) == 0)){
                            exists = true;
                        }
                    }
                }
            }
            if(!exists){
                tm.addRow(row);
                float precioT = 0;
                for(int x = 0; x < table_ingreso_reservas.getRowCount(); x++){
                    precioT += Float.valueOf(table_ingreso_reservas.getValueAt(x, 6).toString().trim());
                }
                tex_precio.setText(""+precioT);
            }
        }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        lbl_menu.setText("          Registros");
        panel_ingreso_servicios.setVisible(false);
        panel_izq.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
        txt_nombreS.setText("");
        txt_precioS.setText("");
    }//GEN-LAST:event_jLabel92MouseClicked

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
                for(int i=0;i==list2.size();i++){
                    cats.add(list2.getElementAt(i));
                }
                DtServicio Serv = new DtServicio(txt_nombreS.getText(),cmb_proveedorS.getSelectedItem().toString(),Float.parseFloat(txt_precioS.getText()),txt_descripcionS.getText(),cats,cmb_origenS.getSelectedItem().toString(),cmb_destinoS.getSelectedItem().toString());

                if(!ICArticulo.insertarServicio(Serv))
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el servicio.","Error",JOptionPane.WARNING_MESSAGE);
                else
                JOptionPane.showMessageDialog(null, "Servicio Ingresado");
                //(String nombre, String nickProv, float precio, String descripcion, ArrayList<String> categorias, String ciudadOrigen, String ciudadDestino)
            }
            else{
                //ciudadO
                ArrayList<String> cats = new ArrayList<String>();
                for(int i=0;i==list2.size();i++){
                    cats.add(list2.getElementAt(i));
                }
                DtServicio Serv = new DtServicio(txt_nombreS.getText(),cmb_proveedorS.getSelectedItem().toString(),Float.parseFloat(txt_precioS.getText()),txt_descripcionS.getText(),cats,cmb_origenS.getSelectedItem().toString(),null);;
                if(!ICArticulo.insertarServicio(Serv))
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el servicio.","Error",JOptionPane.WARNING_MESSAGE);
                else
                JOptionPane.showMessageDialog(null, "Servicio Ingresado");
            }
        }

        txt_nombreS.setText("");
        txt_precioS.setText("");
        txt_descripcionS.setText("");
        list2.clear();
    }//GEN-LAST:event_jLabel72MouseClicked

    private void tree_servicios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tree_servicios2MouseClicked

    }//GEN-LAST:event_tree_servicios2MouseClicked

    private void tree_servicios2ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_servicios2ValueChanged

        DefaultMutableTreeNode Arbol = (DefaultMutableTreeNode)tree_servicios2.getLastSelectedPathComponent();
        String sel = (String) Arbol.getUserObject();
        //tex_lista.setText(sel)

        //setText(listaCategoria.get());

    }//GEN-LAST:event_tree_servicios2ValueChanged

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

    private void jLabel134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_reservas.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel134MouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_reservas.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);

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

    private void txt_precioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioRActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:

        DtReserva dtRes = ICReserva.ObtenerDatosReserva(this.idReserva);

        String nomart = jList_reservasR.getSelectedValue();

        List<DtInfoReserva> lir = new ArrayList<DtInfoReserva>(dtRes.GetInfoReservas());

        

        for(DtInfoReserva i: lir){
            if(i.GetNombreArticulo().equals(nomart)){
                txt_cantidadR.setText(Integer.toString(i.GetCantidad()));
                txt_finicio.setText(Integer.toString(i.GetFechaIni().getDia()) + "/" + Integer.toString(i.GetFechaIni().getMes()) + "/" + Integer.toString(i.GetFechaIni().getAnio()));
                txt_ffin.setText(Integer.toString(i.GetFechaFin().getDia()) + "/" + Integer.toString(i.GetFechaFin().getMes()) + "/" + Integer.toString(i.GetFechaFin().getAnio()));
        }
    }//GEN-LAST:event_jButton9MouseClicked
    }
    private void jLabel184MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_clientes.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel184MouseClicked

    private void jLabel188MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_clientes.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel188MouseClicked

    private void ListaCliItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListaCliItemStateChanged

        NomCli.setVisible(true);
        ApeCli.setVisible(true);
        AnioCli.setVisible(true);
        MesCli.setVisible(true);
        DiaCli.setVisible(true);
        EmailCli.setVisible(true);
        FCCli.setVisible(true);
        PrecioCli.setVisible(true);

        list2.clear();

        NomCli.setText("");
        ApeCli.setText("");
        AnioCli.setText("");
        MesCli.setText("");
        DiaCli.setText("");
        EmailCli.setText("");
        FCCli.setText("");
        PrecioCli.setText("");

        String clie = ListaCli.getSelectedItem().toString();
        DtCliente DtCli = ICUsuario.datosCliente(clie);

        NomCli.setText(DtCli.getNombre());
        ApeCli.setText(DtCli.getApellido());
        AnioCli.setText(Integer.toString(DtCli.getFechaN().getAnio()));
        MesCli.setText(Integer.toString(DtCli.getFechaN().getMes()));
        DiaCli.setText(Integer.toString(DtCli.getFechaN().getDia()));
        EmailCli.setText(DtCli.getEmail());
        //FCCli.setText(DtCli.);
        //PrecioCli.setText();

        //txt_DescripcionP.setText(DtProv.)
        // java.util.List<DtServicio> listdtServ = new ArrayList();
        //listdtServ = Dtcli.getServicio();
        java.util.List<Integer> listnrores = new ArrayList();
        listnrores= DtCli.getReservas();

        //java.util.List<String> lista = new ArrayList();

        //listnrores.forEach(i -> lista.add(((DtServicio)i).getNombre()));

        //if(!list2.contains(jList_ServiciosP.getSelectedValue())){
            listnrores.forEach(i -> list2.addElement(Integer.toString(i)));
            //}
        ReservasCli.setModel(list2);
        list3.clear();
        Articulo.setModel(list3);
    }//GEN-LAST:event_ListaCliItemStateChanged

    private void ArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArticuloMouseClicked

    }//GEN-LAST:event_ArticuloMouseClicked

    private void ReservasCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservasCliMouseClicked
        String cli = ListaCli.getSelectedItem().toString();

        String NroRes = ReservasCli.getSelectedValue().toString();

        DtReserva DtRes = ICReserva.ObtenerDatosReserva(Integer.parseInt(NroRes));

        FCCli.setText(Integer.toString(DtRes.GetFecha().getDia()) +"/"+ DtRes.GetFecha().getMes()+"/"+ DtRes.GetFecha().getAnio());

        PrecioCli.setText(Float.toString(DtRes.getPrecio()));

        ArrayList<DtInfoReserva> ListInfoRes = DtRes.GetInfoReservas();

        list3.clear();
        ListInfoRes.forEach(i -> list3.addElement(i.GetNombreArticulo()));
        Articulo.setModel(list3);
    }//GEN-LAST:event_ReservasCliMouseClicked

    private void jLabel179MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel179MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_proveedores.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel179MouseClicked

    private void jLabel183MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseClicked
        lbl_menu.setText("          Consultas");
        panel_consultas_proveedores.setVisible(false);
        panel_izq_consultas.setVisible(true);
        jLabel9.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        lbl_acercaDe.setVisible(true);
    }//GEN-LAST:event_jLabel183MouseClicked

    private void cmb_proveedorPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_proveedorPItemStateChanged
        txt_NombreP.setText("");
        txt_ApellidoP.setText("");
        txt_emailP.setText("");
        txt_NombreEmpresaP.setText("");
        txt_LinkEmpresaP.setText("");
        txt_DescripcionP.setText("");
        tex_anio.setText("");
        tex_mes.setText("");
        tex_dia.setText("");
        tex_origen.setText("");
        tex_destino.setText("");
        list2.clear();

        String prov = cmb_proveedorP.getSelectedItem().toString();
        DtProveedor DtProv = ICUsuario.datosProveedor(prov);

        txt_NombreP.setVisible(true);
        txt_ApellidoP.setVisible(true);
        txt_emailP.setVisible(true);
        txt_NombreEmpresaP.setVisible(true);
        txt_LinkEmpresaP.setVisible(true);

        tex_anio.setVisible(true);
        tex_mes.setVisible(true);
        tex_dia.setVisible(true);
        txt_NombreP.setText(DtProv.getNombre());
        txt_ApellidoP.setText(DtProv.getApellido());
        txt_emailP.setText(DtProv.getEmail());
        txt_NombreEmpresaP.setText(DtProv.getNombreEmpresa());
        txt_LinkEmpresaP.setText(DtProv.getUrl());
        tex_anio.setText(Integer.toString(DtProv.getFechaN().getAnio()));
        tex_mes.setText(Integer.toString(DtProv.getFechaN().getMes()));
        tex_dia.setText(Integer.toString(DtProv.getFechaN().getDia()));

        //txt_DescripcionP.setText(DtProv.)
        java.util.List<DtServicio> listdtServ = new ArrayList();
        listdtServ = DtProv.getServicio();

        java.util.List<String> lista = new ArrayList();

        //listdtServ.forEach(i -> lista.add(((DtServicio)i).getNombre()));
        if(!list2.contains(jList_ServiciosP.getSelectedValue())){
            listdtServ.forEach(i -> list2.addElement(((DtServicio)i).getNombre()));
        }
        //cmb_servicio.setModel(new DefaultComboBoxModel(lista.toArray()));
        //list2.addElement(lista);
        jList_ServiciosP.setModel(list2);
    }//GEN-LAST:event_cmb_proveedorPItemStateChanged

    private void jList_ServiciosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ServiciosPMouseClicked
        txt_DescripcionP.setText("");
        tex_origen.setText("");
        tex_destino.setText("");
        tex_origen.setVisible(true);
        tex_destino.setVisible(true);
        txt_DescripcionP.setVisible(true);
        String NameServ = jList_ServiciosP.getSelectedValue();
        String prov = cmb_proveedorP.getSelectedItem().toString();
        DtServicio DtServ = ICArticulo.datosServicio(NameServ, prov);
        txt_DescripcionP.setText(DtServ.getDescripcion());
        tex_origen.setText(DtServ.getCiudadOrigen());

        tex_destino.setText(DtServ.getCiudadDestino());
    }//GEN-LAST:event_jList_ServiciosPMouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if(cmb_promocion.isEnabled()){
            if(cmb_promocion.getSelectedItem() != null){
                DtFecha ini, fin;
                ini = new DtFecha(cmb_anio1.getSelectedItem().toString().trim() + "/" + cmb_mes1.getSelectedItem().toString().trim() + "/" + cmb_dia1.getSelectedItem().toString().trim());
                fin = new DtFecha(cmb_anio2.getSelectedItem().toString().trim() + "/" + cmb_mes2.getSelectedItem().toString().trim() + "/" + cmb_dia2.getSelectedItem().toString().trim());
                DefaultTableModel tm = (DefaultTableModel)table_ingreso_reservas.getModel();
                Object[] row = new Object[7];
                row[0] = Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim());
                row[1] = cmb_promocion.getSelectedItem().toString().trim();
                row[2] = cmb_proveedor.getSelectedItem().toString().trim();
                row[3] = (ini.getAnio() + "/" + ini.getMes() + "/" + ini.getDia());
                row[4] = (fin.getAnio() + "/" + fin.getMes() + "/" + fin.getDia());
                DtPromocion selected = ICArticulo.datosPromociones(cmb_promocion.getSelectedItem().toString().trim(), cmb_proveedor.getSelectedItem().toString().trim());
                row[5] = selected.GetPrecio();
                row[6] = (Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim())*selected.GetPrecio());
                boolean exists = false;
                for (int i = 0; i < table_ingreso_reservas.getRowCount(); i++) {
                    if (Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim()).equals(Integer.valueOf(table_ingreso_reservas.getValueAt(i, 0).toString().trim())) && cmb_promocion.getSelectedItem().toString().trim().equals(table_ingreso_reservas.getValueAt(i, 1).toString().trim()) && cmb_proveedor.getSelectedItem().toString().trim().equals(table_ingreso_reservas.getValueAt(i, 2).toString().trim())){
                        if((ini.getAnio() + "/" + ini.getMes() + "/" + ini.getDia()).equals(table_ingreso_reservas.getValueAt(i, 3).toString().trim()) && (fin.getAnio() + "/" + fin.getMes() + "/" + fin.getDia()).equals(table_ingreso_reservas.getValueAt(i, 4).toString().trim())){
                            float f1, f2, f3;
                            f1 = Integer.valueOf(cmb_cantidad.getSelectedItem().toString().trim())*selected.GetPrecio();
                            f2 = Float.valueOf(table_ingreso_reservas.getValueAt(i, 6).toString().trim());
                            f3 = Float.valueOf(table_ingreso_reservas.getValueAt(i, 5).toString().trim());
                            if((Float.compare(f3, selected.GetPrecio()) == 0) && (Float.compare(f1, f2) == 0)){
                                exists = true;
                            }
                        }
                    }
                }
                if(!exists){
                    tm.addRow(row);
                    float precioT = 0;
                    for(int x = 0; x < table_ingreso_reservas.getRowCount(); x++){
                        precioT += Float.valueOf(table_ingreso_reservas.getValueAt(x, 6).toString().trim());
                    }
                    tex_precio.setText(""+precioT);
                }
            }
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cmb_promocionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_promocionMouseClicked
        if (cmb_promocion.getSelectedItem() != null){
                DtPromocion prom = ICArticulo.datosPromociones(cmb_promocion.getSelectedItem().toString(), cmb_proveedor.getSelectedItem().toString());
                tex_precioU1.setText(""+prom.GetPrecio());
        }
    }//GEN-LAST:event_cmb_promocionMouseClicked

    private void cmb_consultar_promocionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_consultar_promocionesItemStateChanged
        String nickP, nombreA;
        if(!cmb_consultar_promociones.getSelectedItem().toString().trim().isEmpty()){
            nickP = cmb_consultar_promociones.getSelectedItem().toString().substring(0, cmb_consultar_promociones.getSelectedItem().toString().lastIndexOf(","));
            nombreA = cmb_consultar_promociones.getSelectedItem().toString().substring(cmb_consultar_promociones.getSelectedItem().toString().lastIndexOf(",")+1);
            DtPromocion prom = ManejadorSQL.GetInstance().devolverPromocion(nickP, nombreA);
            lbl_prov.setText(nickP);
            lbl_nom.setText(nombreA);
            lbl_desc.setText(""+prom.GetDescuento());
            lbl_precioP.setText(""+prom.GetPrecio());
            DefaultListModel lm = new DefaultListModel();
            for(int x = 0; x < prom.GetServicios().size(); x++){
                lm.addElement(prom.GetServicios().get(x));
            }
            list_servs.setModel(lm);
        }
    }//GEN-LAST:event_cmb_consultar_promocionesItemStateChanged

    private void cmb_ing_promItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_ing_promItemStateChanged
        if(cmb_ing_prom.getSelectedItem()!= null){
            ArrayList<DtServicio> s = ICArticulo.ListarServiciosProv(cmb_ing_prom.getSelectedItem().toString().trim());
            DefaultListModel lm = new DefaultListModel();
            for(int x = 0; x < s.size(); x++){
                lm.addElement(s.get(x).getNombre());
            }
            list_serviciosProv.setModel(lm);
        }
    }//GEN-LAST:event_cmb_ing_promItemStateChanged

    private void btn_addPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addPMouseClicked
        if(list_serviciosProv.getModel().getSize() != 0){
            System.out.println("2"); 
            if(!list_serviciosProv.getSelectedValue().isEmpty()){
                System.out.println("3"); 
                //if(list3.contains(list_serviciosProv.getSelectedValue())){
                    System.out.println("4"); 
                    ((DefaultListModel)list_serviciosInc.getModel()).addElement(list_serviciosProv.getSelectedValue());
                //}   
            }
        }  
    }//GEN-LAST:event_btn_addPMouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        ((DefaultListModel)list_serviciosInc.getModel()).setSize(0);
    }//GEN-LAST:event_jButton11MouseClicked

    private void btn_rmPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rmPMouseClicked
        if(!list_serviciosInc.getSelectedValue().isEmpty() && (list_serviciosInc.getSelectedValue() != null)){
            ((DefaultListModel)list_serviciosInc.getModel()).removeElement(list_serviciosInc.getSelectedValue());  
        }
    }//GEN-LAST:event_btn_rmPMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cmb_actualizar_servicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_actualizar_servicioItemStateChanged
        String nickP, nombreA;
        list3.clear();
        if(cmb_actualizar_servicio.getModel().getSize() != 0){
            if(!cmb_actualizar_servicio.getSelectedItem().toString().trim().isEmpty()){
                nickP = cmb_actualizar_servicio.getSelectedItem().toString().substring(0, cmb_actualizar_servicio.getSelectedItem().toString().lastIndexOf(","));
                nombreA = cmb_actualizar_servicio.getSelectedItem().toString().substring(cmb_actualizar_servicio.getSelectedItem().toString().lastIndexOf(",")+1);
                DtServicio ret = ICArticulo.datosServicio(nombreA.trim(), nickP.trim());
                if(cmb_origen.getModel().getSize() != 0){
                    for(int x = 0; x < cmb_origen.getModel().getSize(); x++){
                        if(cmb_origen.getModel().getElementAt(x).trim().equals(ret.getCiudadOrigen().trim())){
                            cmb_origen.setSelectedItem(ret.getCiudadOrigen().trim());
                        }
                    }
                }
                if(cmb_destino.getModel().getSize() != 0){
                    for(int x = 0; x < cmb_destino.getModel().getSize(); x++){
                        if(ret.getCiudadDestino() != null){
                            if(cmb_destino.getModel().getElementAt(x).trim().equals(ret.getCiudadDestino().trim())){
                                cmb_destino.setSelectedItem(ret.getCiudadDestino());
                            }
                        }
                    }
                }
                txt_desc.setText(ret.getDescripcion());
                txt_p.setText(""+ret.getPrecio());
                for(int x = 0; x < ret.getCategorias().size(); x++){
                    list3.addElement(ret.getCategorias().get(x).trim());
                }
                
            }
        }
        list_catServicio.setModel(list3);
    }//GEN-LAST:event_cmb_actualizar_servicioItemStateChanged

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel77MouseClicked
        if((!txt_desc.getText().isEmpty()) && (!txt_desc.getText().isEmpty()) && (list_catServicio.getModel().getSize() != 0) ){
            String nickP, nombreA;
            nickP = cmb_actualizar_servicio.getSelectedItem().toString().substring(0, cmb_actualizar_servicio.getSelectedItem().toString().lastIndexOf(","));
            nombreA = cmb_actualizar_servicio.getSelectedItem().toString().substring(cmb_actualizar_servicio.getSelectedItem().toString().lastIndexOf(",")+1);
            ArrayList<String> categorias = new ArrayList();
            for(int e = 0; e < list_catServicio.getModel().getSize(); e++){
                categorias.add(list_catServicio.getModel().getElementAt(e).trim());
            }
            DtServicio mod = new DtServicio(nombreA.trim(), nickP.trim(), Float.valueOf(txt_p.getText().trim()), txt_desc.getText(), categorias, cmb_origen.getSelectedItem().toString().trim(), cmb_destino.getSelectedItem().toString().trim());
            ICArticulo.ModificarServicio(mod);
            JOptionPane.showMessageDialog(null, "Servicio actualizado correctamente!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error!. Compruebe que los campos mínimos requeridos no esten vacíos.");
        }
    }//GEN-LAST:event_jLabel77MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        img_actualizar_servicios.setVisible(true);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        img_actualizar_servicios.setVisible(true);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        img_actualizar_servicios.setVisible(true);
    }//GEN-LAST:event_jButton15MouseClicked

    private void btn_addP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addP1MouseClicked
        System.out.println("ACA NO EXPLOTA!");
        if((DefaultMutableTreeNode)tree_actualizar_servicios.getLastSelectedPathComponent() != null){
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree_actualizar_servicios.getLastSelectedPathComponent();
            String nameCat = node.getUserObject().toString().trim();
            list3.clear();
            list3.addElement(nameCat);
            
        } 
    }//GEN-LAST:event_btn_addP1MouseClicked

    private void btn_rmP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rmP1MouseClicked
        if(list_catServicio.getSelectedValue() != null){
            ((DefaultListModel)list_catServicio.getModel()).removeElementAt(list_catServicio.getSelectedIndex());
        }
    }//GEN-LAST:event_btn_rmP1MouseClicked

    private void tex_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_origenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_origenActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        if(list_catServicio.getModel().getSize() != 0)
            ((DefaultListModel)list_catServicio.getModel()).removeAllElements();
    }//GEN-LAST:event_jButton16MouseClicked

    private void tree_actualizar_serviciosTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_tree_actualizar_serviciosTreeExpanded
        // TODO add your handling code here:
    }//GEN-LAST:event_tree_actualizar_serviciosTreeExpanded

    private void tree_actualizar_serviciosValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_actualizar_serviciosValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tree_actualizar_serviciosValueChanged

    private void btn_addP1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addP1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addP1MouseEntered

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

    private void AnioCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnioCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnioCliActionPerformed

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(() -> {
            new Help4Travelling().setVisible(true);
        });




    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnioCli;
    private javax.swing.JTextField ApeCli;
    private javax.swing.JList<String> Articulo;
    private javax.swing.JTextField DiaCli;
    private javax.swing.JTextField EmailCli;
    private javax.swing.JTextField FCCli;
    private javax.swing.JComboBox<String> ListaCli;
    private javax.swing.JTextField MesCli;
    private javax.swing.JTextField MesCli1;
    private javax.swing.JTextField NomCli;
    private javax.swing.JTextField PrecioCli;
    private javax.swing.JList<String> ReservasCli;
    private javax.swing.JPanel actualizacion_reservas;
    private javax.swing.JPanel actualizacion_servicios;
    private javax.swing.JLabel btn_addP;
    private javax.swing.JLabel btn_addP1;
    private javax.swing.JLabel btn_rmP;
    private javax.swing.JLabel btn_rmP1;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Checkbox chek_destinoS;
    private java.awt.Checkbox chek_padre;
    private javax.swing.JRadioButton chk_cliente;
    private javax.swing.JRadioButton chk_proveedor;
    private javax.swing.JComboBox<String> cmb_actualizar_servicio;
    private javax.swing.JComboBox<String> cmb_anio1;
    private javax.swing.JComboBox<String> cmb_anio2;
    private javax.swing.JComboBox<String> cmb_anio_u;
    private javax.swing.JComboBox<String> cmb_cantidad;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_cliente;
    private javax.swing.JComboBox<String> cmb_consultar_promociones;
    private javax.swing.JComboBox<String> cmb_destino;
    private javax.swing.JComboBox<String> cmb_destinoS;
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_dia1;
    private javax.swing.JComboBox<String> cmb_dia2;
    private javax.swing.JComboBox<String> cmb_estadoSel;
    private javax.swing.JComboBox<String> cmb_ing_prom;
    private javax.swing.JComboBox<String> cmb_mes;
    private javax.swing.JComboBox<String> cmb_mes1;
    private javax.swing.JComboBox<String> cmb_mes2;
    private javax.swing.JComboBox<String> cmb_origen;
    private javax.swing.JComboBox<String> cmb_origenS;
    private javax.swing.JComboBox<String> cmb_promocion;
    private javax.swing.JComboBox<String> cmb_proveedor;
    private javax.swing.JComboBox<String> cmb_proveedorP;
    private javax.swing.JComboBox<String> cmb_proveedorS;
    private javax.swing.JComboBox<String> cmb_reservasI;
    private javax.swing.JComboBox<String> cmb_servicio;
    private javax.swing.JComboBox<String> cmb_serviciosXcat;
    private javax.swing.JPanel consultar_clientes;
    private javax.swing.JPanel consultar_promociones;
    private javax.swing.JPanel consultar_proveedores;
    private javax.swing.JPanel consultar_reservas;
    private javax.swing.JPanel consultar_servicios;
    private javax.swing.JPanel eliminacion_reservas;
    private javax.swing.JFileChooser img_actualizar_servicios;
    private javax.swing.JPanel ingreso_categorias;
    private javax.swing.JPanel ingreso_promociones;
    private javax.swing.JPanel ingreso_reservas;
    private javax.swing.JPanel ingreso_servicios;
    private javax.swing.JPanel ingreso_usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList_ServiciosP;
    private javax.swing.JList<String> jList_reservasR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JLabel lab_cantidad1;
    private javax.swing.JLabel lab_cantidad2;
    private javax.swing.JLabel lab_cantidad3;
    private javax.swing.JLabel lab_categoria;
    private javax.swing.JLabel lab_destinoS;
    private javax.swing.JLabel lab_origenS;
    private javax.swing.JLabel lbl_acercaDe;
    private javax.swing.JLabel lbl_cantidadR1;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_desc1;
    private javax.swing.JLabel lbl_destino1;
    private javax.swing.JLabel lbl_estadoActual;
    private javax.swing.JLabel lbl_ffin;
    private javax.swing.JLabel lbl_finicio;
    private javax.swing.JLabel lbl_linkEmpresa;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_mostrar_acercaDe;
    private javax.swing.JLabel lbl_mostrar_cerrar;
    private javax.swing.JLabel lbl_mostrar_consultas;
    private javax.swing.JLabel lbl_mostrar_eliminaciones;
    private javax.swing.JLabel lbl_mostrar_modificaciones;
    private javax.swing.JLabel lbl_mostrar_registros;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_nombreEmpresa;
    private javax.swing.JLabel lbl_origen1;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_precioN;
    private javax.swing.JLabel lbl_precioP;
    private javax.swing.JLabel lbl_precioProm;
    private javax.swing.JLabel lbl_prov;
    private javax.swing.JLabel lbl_proveedor1;
    private javax.swing.JList<String> lis_categoria;
    private javax.swing.JList<String> lis_categoriaS;
    private javax.swing.JList<String> list_catServicio;
    private javax.swing.JList<String> list_serviciosInc;
    private javax.swing.JList<String> list_serviciosProv;
    private javax.swing.JList<String> list_servs;
    private javax.swing.JPanel panel_actualizar_reserva;
    private javax.swing.JPanel panel_actualizar_servicio;
    private javax.swing.JPanel panel_consultas_clientes;
    private javax.swing.JPanel panel_consultas_promociones;
    private javax.swing.JPanel panel_consultas_proveedores;
    private javax.swing.JPanel panel_consultas_reservas;
    private javax.swing.JPanel panel_consultas_servicios;
    private javax.swing.JPanel panel_eliminar_reserva;
    private javax.swing.JPanel panel_ingreso_categorias;
    private javax.swing.JPanel panel_ingreso_promociones;
    private javax.swing.JPanel panel_ingreso_reservas;
    private javax.swing.JPanel panel_ingreso_servicios;
    private javax.swing.JPanel panel_ingreso_usuarios;
    private javax.swing.JPanel panel_izq;
    private javax.swing.JPanel panel_izq_acerca_de;
    private javax.swing.JPanel panel_izq_actualizaciones;
    private javax.swing.JPanel panel_izq_consultas;
    private javax.swing.JPanel panel_izq_eliminaciones;
    private javax.swing.JTable table_ingreso_reservas;
    private javax.swing.JTable table_reservas;
    private javax.swing.JTextField tex_anio;
    private javax.swing.JTextField tex_destino;
    private javax.swing.JTextField tex_dia;
    private javax.swing.JTextField tex_mes;
    private javax.swing.JTextField tex_origen;
    private javax.swing.JTextField tex_precio;
    private javax.swing.JTextField tex_precioU;
    private javax.swing.JTextField tex_precioU1;
    private javax.swing.JTree tree_actualizar_servicios;
    private javax.swing.JTree tree_servicios;
    private javax.swing.JTree tree_servicios2;
    private javax.swing.JTextField txt_ApellidoP;
    private javax.swing.JTextPane txt_DescripcionP;
    private javax.swing.JTextField txt_LinkEmpresaP;
    private javax.swing.JTextField txt_NombreEmpresaP;
    private javax.swing.JTextField txt_NombreP;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cantidadR;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_creacionR;
    private javax.swing.JTextPane txt_desc;
    private javax.swing.JTextPane txt_descripcionS;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emailP;
    private javax.swing.JTextField txt_estadoR;
    private javax.swing.JTextField txt_ffin;
    private javax.swing.JTextField txt_finicio;
    private javax.swing.JTextField txt_linkEmpresa;
    private javax.swing.JTextField txt_nickname;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreEmpresa;
    private javax.swing.JTextField txt_nombreS;
    private javax.swing.JTextField txt_p;
    private javax.swing.JTextField txt_precioR;
    private javax.swing.JTextField txt_precioS;
    // End of variables declaration//GEN-END:variables
}
