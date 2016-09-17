package help4travelling;

import java.util.List;

public class ControladorUsuario implements IControladorUsuario{
    
    private Usuario usuMem;

    @Override
    public List<String> listarClientes(){
        List<String> manejuser = ManejadorUsuario.getinstance().listarClientes();
        return manejuser;
    }

    @Override
    public List<String> listarProveedores(){
        List<String> manejuser = ManejadorUsuario.getinstance().listarProveedores();
        return manejuser;
    }

    @Override
    public DtCliente datosCliente(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.ObtenerCliente(nick).getDtCliente();
    }

    @Override
    public DtProveedor datosProveedor(String nick) {
        ManejadorUsuario manejuser = ManejadorUsuario.getinstance();
        return manejuser.ObtenerProveedor(nick).getDtProveedor();
    }

    @Override
    public DtReserva datosReserva(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DtServicio datosServicio(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean VerificarUsuario(String nickUsaurio, String email){
        return ManejadorUsuario.getinstance().ExisteUsuario(nickUsaurio, email);
    }
    
    @Override
    public void AltaCliente(DtCliente dataCli){
        ManejadorUsuario.getinstance().InstertarCliente(dataCli);
    }
    
    @Override
    public void AltaProveedor(DtProveedor dataProv){
        ManejadorUsuario.getinstance().InstertarProveedor(dataProv);
    }

    @Override
    public boolean chequearNick(String nick){
        return ManejadorUsuario.getinstance().chequearNick(nick);
    }
    
    @Override
    public boolean chequearEmail(String email){
        return ManejadorUsuario.getinstance().chequearEmail(email);
    }
}
