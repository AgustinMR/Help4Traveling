package help4travelling;

import java.util.List;

public class ControladorUsuario implements IControladorUsuario{

    public void ingresarUsuario( DtCliente cliente){
      //  ManejadorUsuario.getinstance().InstertarUsuario(cliente);
    }

    public void ingresarUsuario( DtProveedor proveedor){
        //ManejadorUsuario.getinstance().InstertarUsuario(proveedor);
     }

    public List<String> listarClientes(){
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.listarClientes();
    }

    public List<String> listarProveedores(){
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.listarProveedores();
    }

    @Override
    public DtCliente datosCliente(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.ObtenerCliente(nick).getDtCliente();
    }

    @Override
    public DtProveedor datosProveedor(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
       // return manejuser.obtenerDtProveedor(nick);
       return null;
    }

    @Override
    public DtReserva datosReserva(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DtServicio datosServicio(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
