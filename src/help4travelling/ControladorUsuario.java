package help4travelling;

import java.util.List;

public class ControladorUsuario implements IControladorUsuario{
    
    private Usuario usuMem;

    public List<String> listarClientes(){
        List<String> manejuser = ManejadorUsuario.getinstance().listarClientes();
        return manejuser;
    }

    public List<String> listarProveedores(){
        List<String> manejuser = ManejadorUsuario.getinstance().listarProveedores();
        return manejuser;
    }

    public DtCliente datosCliente(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.ObtenerCliente(nick).getDtCliente();
    }

    public DtProveedor datosProveedor(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.ObtenerProveedor(nick).getDtProveedor();
    }

    public DtReserva datosReserva(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DtServicio datosServicio(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean VerificarUsuario(String nickUsaurio, String email){
        return ManejadorUsuario.getinstance().ExisteUsuario(nickUsaurio, email);
    }
    
    public void AltaCliente(DtCliente dataCli){
        ManejadorUsuario.getinstance().InstertarCliente(dataCli);
    }
    
    public void AltaProveedor(DtProveedor dataProv){
        ManejadorUsuario.getinstance().InstertarProveedor(dataProv);
    }

   /* public void ingresarUsuario(DtCliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ingresarUsuario(DtProveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
