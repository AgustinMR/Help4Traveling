package help4travelling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejadorSQL {
    
    private static final Connection conex = null;
    private final Statement consulta = null;
    private final ResultSet respuesta = null;
    private static ManejadorSQL instance = null;
    
    public static ManejadorSQL GetInstance(){
        if (instance==null)
            instance = new ManejadorSQL();
        return instance;
    }    
    
    public static boolean init(String ip){
        boolean ret;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://"+ip+":3306/bd_help4traveling?useSSL=false", "root", "tecnoDBweb2016");
            ret = true;
        }catch(ClassNotFoundException | SQLException ex) {
               Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
               ret = false;
        }
        return ret;
    }            
    
    // CARGAR USUARIOS
    public static ArrayList<String> cargarUsuarios(){
        String sql = "SELECT nickname FROM USUARIOS;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.add(usuarios.getResultSet().getString("nickname"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // CARGAR PROVEEDORES
    public static ArrayList<String> cargarProveedores(){
        String sql = "SELECT nicknameProveedor FROM PROVEEDORES;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.add(usuarios.getResultSet().getString("nicknameProveedor"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
            // CARGAR CLIENTES
    public static ArrayList<String> cargarClientes(){
        String sql = "SELECT nicknameCliente FROM PROVEEDORES;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.add(usuarios.getResultSet().getString("nicknameCliente"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // CARGAR SERVICIOS
    public static HashMap<String, String> cargarServicios(){
        String sql = "SELECT nicknameProveedor, nombreArticulo FROM SERVICIOS;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.put(usuarios.getResultSet().getString("nicknameProveedor"),usuarios.getResultSet().getString("nombreArticulo"));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // CARGAR PROMOCIONES
    public static HashMap<String, String> cargarPromociones(){
        String sql = "SELECT nicknameProveedor, nombreArticulo FROM PROMOCIONES;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.put(usuarios.getResultSet().getString("nicknameProveedor"),usuarios.getResultSet().getString("nombreArticulo"));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // CARGAR RESERVAS
    public static HashMap<String, String> cargarReservas(){
        String sql = "SELECT nicknameCliente, id FROM RESERVAS;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            usuarios = ManejadorSQL.getConex().createStatement();
            usuarios.execute(sql);
            while(usuarios.getResultSet().next()){
                ret.put(usuarios.getResultSet().getString("nicknameCliente"),usuarios.getResultSet().getString("id"));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE CLIENTE
    public static boolean agregarUsuario(DtCliente c){
        String sql1 = "INSERT INTO USUARIOS(nickname, nombre, apellido, email, fechaNac) VALUES (" + c.getNick() + "," + c.getNombre() + "," + c.getApellido() + "," + c.getEmail()+ c.getFechaN().getAnio() + "/" + c.getFechaN().getMes() + "/" + c.getFechaN().getDia() + " );";
        String sql2 = "INSERT INTO CLIENTES(nicknameCliente) VALUES (" + c.getNick() + " );";
        Statement usuario;
        boolean ret = false;
        try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            usuario.execute(sql2);
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE PROVEEDOR.
    public static boolean agregarUsuario(DtProveedor p){
        String sql1 = "INSERT INTO USUARIOS(nickname, nombre, apellido, email) VALUES (" + p.getNick() + "," + p.getNombre() + "," + p.getApellido() + "," + p.getEmail() + " );";
        String sql2 = "INSERT INTO PROVEEDOR(nicknameProveedor, nombreEmp, linkEmp) VALUES (" + p.getNick() + ", " + p.getNombreEmpresa() + ", " + p.getUrl() + " );";
        Statement usuario;
        boolean ret = false;
        try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            usuario.execute(sql2);
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE SERVICIO.
    public static boolean agregarArticulo(DtServicio s, String nickProveedor, ArrayList<String> categorias){
        String sql1 = "INSERT INTO ARTICULOS(nicknameProveedor, nombre) VALUES (" + nickProveedor + "," + s.getNombre() + " );";
        String sql2, sql3;
        if(s.getCiudadDestino().isEmpty())
            sql2 = "INSERT INTO SERVICIOS(nicknameProveedor, nombreArticulo, descripcion, precio, ciudadO) VALUES (" + nickProveedor + ", " + s.getNombre() + ", " + s.getDescripcion() + ", " + s.getPrecio() + ", " + s.getCiudadOrigen() + " );";
        else
            sql2 = "INSERT INTO SERVICIOS(nicknameProveedor, nombreArticulo, descripcion, precio, ciudadO, ciudadD) VALUES (" + nickProveedor + ", " + s.getNombre() + ", " + s.getDescripcion() + ", " + s.getPrecio() + ", " + s.getCiudadOrigen() + ", " + s.getCiudadDestino() + " );";
        Statement usuario;
        // para cuando se considere las imagenes, hacer un alter table por cada imagen. de esa manera, no hay que hacer if anidados, por ambos casos.
        boolean ret = false;
        try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1); // ingreso en articulos
            usuario.execute(sql2); // ingreso en servicios
            for(int x = 0; x < categorias.size(); x++){
                sql3 = "INSERT INTO POSEEN(nicknameProveedor, nombreArticulo, nombreCategoria) VALUES ( " + nickProveedor + ", " + s.getNombre() + ", " + categorias.get(x) + " );";
                usuario.execute(sql3); // ingreso las categorias, asumo que estas ya existen debido a que fueron seleccionadas.
            }
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // ALTA DE PROMOCION.
    public static boolean agregarPromocion(DtPromocion p, String nickProveedor, ArrayList<String> servicios){
        String sql1 = "INSERT INTO ARTICULOS(nicknameProveedor, nombre) VALUES (" + nickProveedor + "," + p.GetNombre()+ " );";
        String sql2 = "INSERT INTO PROMOCIONES(nicknameProveedor, nombreArticulo, descuento, precio) VALUES (" + nickProveedor + ", " + p.GetNombre() + ", " + p.GetDescuento() + ", " + p.GetPrecioTotal() + " );";
        String sql3;
        Statement usuario;
        boolean ret = false;
        try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            usuario.execute(sql2);
            for(int x = 0; x < servicios.size(); x++){
                sql3 = "INSERT INTO COMPUESTOS(nicknameProvServ, nombreArticuloServ, nicknameProvProm, nombreArticuloProm) VALUES (" + nickProveedor + ", " + servicios.get(x) + ", " + nickProveedor + ", " + p.GetNombre() + " );";
                usuario.execute(sql3); // ingreso las categorias, asumo que estas ya existen debido a que fueron seleccionadas.
            }
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE RESERVAS
    public static boolean agregarReserva(DtReserva r){
        Statement usuario;
        String sql1 = "INSERT INTO RESERVAS(precioTotal, fechaCreacion, estado, nicknameCliente) VALUES (" + r.getPrecio() + ", " + r.GetFecha().getAnio() + "/" + r.GetFecha().getMes() + "/" + r.GetFecha().getDia() + ", " + r.GetEstado() + ", " + r.GetCliente() + " );";
        // NO BORRAR -- String sql2 = "SELECT id FROM RESERVAS WHERE precioTotal = " + r.getPrecio() + " AND fechaCreacion = " + r.GetFecha().getAnio() + "/" + r.GetFecha().getMes() + "/" + r.GetFecha().getDia() + " AND estado = " + r.GetEstado() + " AND nickaname = " + r.GetCliente() + ";";
        String sql3;
     /*   try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            String id = usuario.getGeneratedKeys().getString("id");
            for(int x = 0; x < r.GetInfoReservas().size(); x++){
                sql3 = "INSERT INTO INFO_RESERVA(id, cantArticulos, nicknameProveedor, nombreArticulo, fechaIni, fechaFin, precioUnitario, precioTotal)";
                sql3 += " VALUES (" + id + ", " + r.GetInfoReservas(). + ", " + p.GetDescuento() + ", " + p.GetPrecioTotal() + " );";

            }
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        
        boolean ret = false;

        return ret;
    }
    
    // ACTUALIZAR ESTADO DE RESERVA
    public static boolean actualizarEstado(String idReserva, String nickCliente, String estadoNuevo){
        Statement usuario;
        boolean ret = false;
        String sql1 = "UPDATE RESERVAS SET estado = " + estadoNuevo + " WHERE id = " + idReserva + " AND nicknameCliente = " + nickCliente + ";";
        try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // DEVOLVER USUARIO
    public static DtCliente devolverCliente(String nickUsuario){
        DtCliente ret = null;
        String sql1 = "SELECT nombre, apellido, email, fechaNac FROM USUARIOS WHERE nickname = " + nickUsuario + ";";
        String sql2 = "SELECT id FROM RESERVAS WHERE nicknameCliente = " + nickUsuario + ";";
        String name, ap, email, fechaN;
        ArrayList<Integer> ids = new ArrayList<Integer>();
        Statement usuario;
     /*   try {
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            name = usuario.getResultSet().getString("nombre");
            ap = usuario.getResultSet().getString("apellido");
            email = usuario.getResultSet().getString("email");
            fechaN = usuario.getResultSet().getDate("fechaNac").toString();
            usuario.execute(sql2);
            while(!usuario.getResultSet().isAfterLast()){
                ids.add(usuario.getResultSet().getInt("id"));
                usuario.getResultSet().next();
            }
            DtCliente ret = new DtCliente(nickUsuario, name, ap, email,);
            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        return ret;
    
    }
    
    // DEVOLVER SERVICIOS
    public static DtServicio devolverServicio(String nickProveedor, String nombre){
        String sql1 = "SELECT descripcion, precio, ciudadO, ciudadD FROM SERVICIOS WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String sql2 = "SELECT nombreCategoria FROM POSEEN WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String desc, co, cd;
        float p;
        ArrayList<String> categorias = new ArrayList<String>();
        Statement usuario;
        DtServicio ret = null;
        try{
            usuario = ManejadorSQL.getConex().createStatement();
            usuario.execute(sql1);
            desc = usuario.getResultSet().getString("descripcion");
            p = usuario.getResultSet().getFloat("precio");
            co = usuario.getResultSet().getString("ciudadO");
            cd = usuario.getResultSet().getString("ciudadD");
            usuario.execute(sql2);
            while(!usuario.getResultSet().isAfterLast()){
                categorias.add(usuario.getResultSet().getString("nombreCategoria"));
                usuario.getResultSet().next();
            }
            ret = new DtServicio(nombre, p, desc, categorias, co, cd);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

    public static Connection getConex() {
        return conex;
    }

    public Statement getConsulta() {
        return consulta;
    }

    public ResultSet getRespuesta() {
        return respuesta;
    }

    public static ManejadorSQL getInstance() {
        return instance;
    }
    
    
}