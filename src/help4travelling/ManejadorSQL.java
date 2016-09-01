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
    
    public static void init(String ip){
        try{
            DriverManager.getConnection("jdbc:mysql://"+ip+"3306/bd_help4traveling?useSSL=false", "root", "tecnoDBweb2016");
        }catch(SQLException err){
            System.out.println("\33[31mError\33[39m: IP o Puerto incorrecto");
        }        
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
        // agregar fecha en formato que le gusta a mysql.
        String sql1 = "INSERT INTO USUARIOS(nickname, nombre, apellido, email, fechaNac) VALUES (" + c.getNick() + "," + c.getNombre() + "," + c.getApellido() + "," + c.getEmail() + " );";
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
        String sql1 = "INSERT INTO RESERVAS(precioTotal, fechaCreacion, estado, nicknameCliente) VALUES (" + r.getPrecio() + ", " + r.Get + ", " + r.GetEstado() + ", " + r.GetCliente() + " );";
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
    
    // DEVOLVER USUARIO
    public static boolean devolverCliente(String nickUsuario){
        String sql1 = "SELECT nombre, apellido, email, fechaNac FROM USUARIOS WHERE nickname = " + nickUsuario + ";";
        String sql2 = "SELECT INTO USUARIOS(nickname, nombre, apellido, email) VALUES (" + p.getNick() + "," + p.getNombre() + "," + p.getApellido() + "," + p.getEmail() + " );";
        
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
    
    // DEVOLVER SERVICIOS
    public static boolean devolverServicio(String nickProveedor, String nombre){
        String sql1 = "SELECT descripcion, precio, ciudadO, ciudadD FROM USUARIOS WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String sql2 = "SELECT nombreCategoria FROM POSEEN WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        
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