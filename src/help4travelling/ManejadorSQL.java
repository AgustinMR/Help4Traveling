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
    
    private String ip;
    private static ManejadorSQL instance = null;
    
    public static ManejadorSQL GetInstance(){
        if (instance==null)
            instance = new ManejadorSQL();
        return instance;
    }    
    
    public boolean init(String ip){
        this.ip = ip;
        return true;
    }            
    
    // CARGAR USUARIOS
    public ArrayList<String> cargarUsuarios(){
        String sql = "SELECT nickname FROM USUARIOS;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ret.add(rs.getString("nickname"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // CARGAR PROVEEDORES
    public ArrayList<String> cargarProveedores(){
        String sql = "SELECT nicknameProveedor FROM PROVEEDORES;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ret.add(rs.getString("nicknameProveedor"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // CARGAR CLIENTES
    public ArrayList<String> cargarClientes(){
        String sql = "SELECT nicknameCliente FROM PROVEEDORES;";
        Statement usuarios;
        ArrayList<String> ret = new ArrayList<String>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ret.add(rs.getString("nicknameCliente"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // CARGAR CIUDADES POR PAISES
    public HashMap<String, String> cargarCiudades(){
        String sql = "SELECT nombrePais, nombre FROM CIUDADES;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(usuarios.getResultSet().next()){
                ret.put(rs.getString("nombrePais"),rs.getString("nombre"));
            } 
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // CARGAR SERVICIOS
    public HashMap<String, String> cargarServicios(){
        String sql = "SELECT nicknameProveedor, nombreArticulo FROM SERVICIOS;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(usuarios.getResultSet().next()){
                ret.put(rs.getString("nicknameProveedor"),rs.getString("nombreArticulo"));
            } 
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // CARGAR PROMOCIONES
    public HashMap<String, String> cargarPromociones(){
        String sql = "SELECT nicknameProveedor, nombreArticulo FROM PROMOCIONES;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ret.put(rs.getString("nicknameProveedor"), rs.getString("nombreArticulo"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
     
    }
    
    // CARGAR RESERVAS
    public HashMap<String, String> cargarReservas(){
        String sql = "SELECT nicknameCliente, id FROM RESERVAS;";
        Statement usuarios;
        HashMap<String, String> ret = new HashMap<>();
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ret.put(rs.getString("nicknameCliente"),rs.getString("id"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
     // CARGAR CATEGORIAS
    public void cargarCategorias(){
        String sql = "SELECT nombre, nombreCategoriaPadre FROM HEREDA;";
        Statement usuarios;
        try {
            Connection conex = getConex();
            usuarios = conex.createStatement();
            ResultSet rs = usuarios.executeQuery(sql);
            while(rs.next()){
                ManejadorCategoria.GetInstance().IngresarCategoriaBD(rs.getString("nombre"),rs.getString("nombreCategoriaPadre"));
            }
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ALTA DE CLIENTE
    public boolean agregarUsuario(DtCliente c){
        String sql1 = "INSERT INTO USUARIOS(nickname, nombre, apellido, email, fechaNac) VALUES ('" + c.getNick() + "','" + c.getNombre() + "','" + c.getApellido() + "','" + c.getEmail()+ "','" + c.getFechaN().getAnio() + "/" + c.getFechaN().getMes() + "/" + c.getFechaN().getDia() + "');";
        String sql2 = "INSERT INTO CLIENTES(nicknameCliente) VALUES ('" + c.getNick() + "' );";
        Statement usuario;
        boolean ret = false;
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
            usuario.executeUpdate(sql2);
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE PROVEEDOR.
    public boolean agregarUsuario(DtProveedor p){
        String sql1 = "INSERT INTO USUARIOS(nickname, nombre, apellido, email, fechaNac) VALUES ('" + p.getNick() + "','" + p.getNombre() + "','" + p.getApellido() + "','" + p.getEmail()+ "','" + p.getFechaN().getAnio() + "/" + p.getFechaN().getMes() + "/" + p.getFechaN().getDia() + "');";
        String sql2 = "INSERT INTO PROVEEDORES(nicknameProveedor, nombreEmp, linkEmp) VALUES ('" + p.getNick() + "','" + p.getNombreEmpresa() + "','" + p.getUrl() + "');";
        System.out.println("PRov");
        Statement usuario;
        boolean ret = false;
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
            usuario.executeUpdate(sql2);
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE SERVICIO.
    public boolean agregarServicio(DtServicio s, String nickProveedor, ArrayList<String> categorias){
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
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1); // ingreso en articulos
            usuario.executeUpdate(sql2); // ingreso en servicios
            for(int x = 0; x < categorias.size(); x++){
                sql3 = "INSERT INTO POSEEN(nicknameProveedor, nombreArticulo, nombreCategoria) VALUES ( " + nickProveedor + ", " + s.getNombre() + ", " + categorias.get(x) + " );";
                usuario.executeUpdate(sql3); // ingreso las categorias, asumo que estas ya existen debido a que fueron seleccionadas.
            }
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE CATEGORIA.
    public boolean agregarCategoria(String nombre, String nombrePadre){
        String sql1 = "INSERT INTO CATEGORIAS(nombre) VALUES ('" + nombre + "');";
        String sql2 = "INSERT INTO HEREDA(nombre, nombreCategoriaPadre) VALUES ('" + nombre + "','" + nombrePadre + "');";
        Statement usuario;
        boolean ret = false;
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
            usuario.executeUpdate(sql2);
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // ALTA DE PROMOCION.
    public boolean agregarPromocion(DtPromocion p, String nickProveedor, ArrayList<String> servicios){
        String sql1 = "INSERT INTO ARTICULOS(nicknameProveedor, nombre) VALUES (" + nickProveedor + "," + p.GetNombre()+ " );";
        String sql2 = "INSERT INTO PROMOCIONES(nicknameProveedor, nombreArticulo, descuento, precio) VALUES (" + nickProveedor + ", " + p.GetNombre() + ", " + p.GetDescuento() + ", " + p.GetPrecioTotal() + " );";
        String sql3;
        Statement usuario;
        boolean ret = false;
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
            usuario.executeUpdate(sql2);
            for(int x = 0; x < servicios.size(); x++){
                sql3 = "INSERT INTO COMPUESTOS(nicknameProvServ, nombreArticuloServ, nicknameProvProm, nombreArticuloProm) VALUES (" + nickProveedor + ", " + servicios.get(x) + ", " + nickProveedor + ", " + p.GetNombre() + " );";
                usuario.executeUpdate(sql3); // ingreso las categorias, asumo que estas ya existen debido a que fueron seleccionadas.
            }
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ALTA DE RESERVAS
    public boolean agregarReserva(DtReserva r){
        boolean ret = false;
        Statement usuario;
        String sql1 = "INSERT INTO RESERVAS(precioTotal, fechaCreacion, estado, nicknameCliente) VALUES ('" + r.getPrecio() + "', '" + r.GetFecha().getAnio() + "/" + r.GetFecha().getMes() + "/" + r.GetFecha().getDia() + "', '" + r.GetEstado() + "', '" + r.GetCliente() + "' );";
        // NO BORRAR -- String sql2 = "SELECT id FROM RESERVAS WHERE precioTotal = " + r.getPrecio() + " AND fechaCreacion = " + r.GetFecha().getAnio() + "/" + r.GetFecha().getMes() + "/" + r.GetFecha().getDia() + " AND estado = " + r.GetEstado() + " AND nickaname = " + r.GetCliente() + ";";
        String sql3;
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            int id = usuario.getGeneratedKeys().getInt("id");
            DtInfoReserva inf = null;
            for(int x = 0; x < r.GetInfoReservas().size(); x++){
                inf = (DtInfoReserva) r.GetInfoReservas().get(x);
                sql3 = "INSERT INTO INFO_RESERVA(id, cantArticulos, nicknameProveedor, nombreArticulo, fechaIni, fechaFin, precioUnitario, precioTotal)";
                sql3 += " VALUES ('" + id + "', '" + inf.GetCantidad() + "', '" + inf.getNickProveedor() + "', '" + inf.GetNombreArticulo() + "', '";
                sql3 += inf.GetFechaIni().getAnio() + "/" + inf.GetFechaIni().getMes() + "/" + inf.GetFechaIni().getDia() + "', '";
                sql3 += inf.GetFechaFin().getAnio() + "/" + inf.GetFechaFin().getMes() + "/" + inf.GetFechaFin().getDia() + "', '";
                sql3 += (inf.GetCantidad()*inf.getPrecioArticulo()) + "', '" + inf.getNickProveedor() + "', '" + inf.GetNombreArticulo() + "', ";
            }
            conex.close();
            ret = true;
        } catch(SQLException ex){
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // ACTUALIZAR ESTADO DE RESERVA
    public boolean actualizarEstado(String idReserva, String nickCliente, String estadoNuevo){
        Statement usuario;
        boolean ret = false;
        String sql1 = "UPDATE RESERVAS SET estado = " + estadoNuevo + " WHERE id = " + idReserva + " AND nicknameCliente = " + nickCliente + ";";
        try {
            Connection conex = getConex();
            usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
            ret = true;
            conex.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // DEVOLVER USUARIO
    public DtCliente devolverCliente(String nickUsuario){
        DtCliente ret = null;
        String sql1 = "SELECT nombre, apellido, email, fechaNac FROM USUARIOS WHERE nickname = '" + nickUsuario + "';";
        String sql2 = "SELECT id FROM RESERVAS WHERE nicknameCliente = '" + nickUsuario + "';";
        String name, ap, email, fechaN;
        ArrayList<Integer> ids = new ArrayList<Integer>();
        try {
            Connection conex = getConex();
            Statement usuario = conex.createStatement();
            ResultSet rs = usuario.executeQuery(sql1);
            rs.next();
            name = rs.getString("nombre");
            ap = rs.getString("apellido");
            email = rs.getString("email");
            fechaN = rs.getDate("fechaNac").toString();
            DtFecha nac = new DtFecha(fechaN);
            rs = usuario.executeQuery(sql2);
            while(rs.next()){
                ids.add(usuario.getResultSet().getInt("id"));
            }
            ret = new DtCliente(nickUsuario, name, ap, email, nac, ids);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
        // DEVOLVER PROVEEDOR
    public DtProveedor devolverProveedor(String nickUsuario){
        DtProveedor ret = null;
        String sql1 = "SELECT nombre, apellido, email, fechaNac FROM USUARIOS WHERE nickname = '" + nickUsuario + "';";
        String sql2 = "SELECT nombreEmp, linkEmp FROM PROVEEDORES WHERE nicknameProveedor = '" + nickUsuario + "';";
        String sql3 = "SELECT nombreArticulo FROM SERVICIOS WHERE nicknameProveedor = '" + nickUsuario + "';";
        String name, ap, email, fechaN, nombreE, linkE;
        ArrayList<DtServicio> nombreA = new ArrayList<DtServicio>();
        try {
            Connection conex = getConex();
            Statement usuario = conex.createStatement();
            ResultSet rs = usuario.executeQuery(sql1);
            rs.next();
            name = rs.getString("nombre");
            ap = rs.getString("apellido");
            email = rs.getString("email");
            fechaN = rs.getDate("fechaNac").toString();
            DtFecha nac = new DtFecha(fechaN);
            rs = usuario.executeQuery(sql2);
            rs.next();
            nombreE = rs.getString("nombreEmp");
            linkE = rs.getString("linkEmp");
            rs = usuario.executeQuery(sql3);
            while(rs.next()){
                nombreA.add(new DtServicio(rs.getString("nombreArticulo")));
            }
            ret = new DtProveedor(nickUsuario, name, ap, email, nac, nombreE, linkE, nombreA);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    // DEVOLVER SERVICIOS
    public DtServicio devolverServicio(String nickProveedor, String nombre){
        String sql1 = "SELECT descripcion, precio, ciudadO, ciudadD FROM SERVICIOS WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String sql2 = "SELECT nombreCategoria FROM POSEEN WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String desc, co, cd;
        float p;
        ArrayList<String> categorias = new ArrayList<String>();
        Statement usuario;
        DtServicio ret = null;
        try{
            try (Connection conex = getConex()) {
                usuario = conex.createStatement();
                ResultSet rs = usuario.executeQuery(sql1);
                desc = rs.getString("descripcion");
                p = rs.getFloat("precio");
                co = rs.getString("ciudadO");
                cd = rs.getString("ciudadD");
                rs = usuario.executeQuery(sql2);
                while(rs.next()){
                    categorias.add(rs.getString("nombreCategoria"));
                }
                ret = new DtServicio(nombre,nickProveedor, p, desc, categorias, co, cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }

        // DEVOLVER PROMOCIONES
    public DtServicio devolverPromocion(String nickProveedor, String nombre){
        String sql1 = "SELECT descripcion, precio, ciudadO, ciudadD FROM SERVICIOS WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String sql2 = "SELECT nombreCategoria FROM POSEEN WHERE nicknameProveedor = " + nickProveedor + " AND nombreArticulo = "+ nombre + ";";
        String desc, co, cd;
        float p;
        ArrayList<String> categorias = new ArrayList<String>();
        Statement usuario;
        DtServicio ret = null;
        try{
            try (Connection conex = getConex()) {
                usuario = conex.createStatement();
                ResultSet rs = usuario.executeQuery(sql1);
                desc = rs.getString("descripcion");
                p = rs.getFloat("precio");
                co = rs.getString("ciudadO");
                cd = rs.getString("ciudadD");
                rs = usuario.executeQuery(sql2);
                while(rs.next()){
                    categorias.add(rs.getString("nombreCategoria"));
                }
                ret = new DtServicio(nombre,nickProveedor, p, desc, categorias, co, cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public Connection getConex() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://"+ this.ip +":3306/bd_help4traveling?useSSL=false", "root", "tecnoDBweb2016");
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void setForeignKeysOff(){
        try {
            String sql1 = "SET FOREIGN_KEY_CHECKS=0;";
            Connection conex = getConex();
            Statement usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setForeignKeysOn(){
        try {
            String sql1 = "SET FOREIGN_KEY_CHECKS=1;";
            Connection conex = getConex();
            Statement usuario = conex.createStatement();
            usuario.executeUpdate(sql1);
        } catch (SQLException ex) {
            Logger.getLogger(ManejadorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ManejadorSQL getInstance() {
        return instance;
    }
    
    
}