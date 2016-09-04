package help4travelling;

import java.util.List;

/**
 *
 * @author Bruno
 */
public abstract interface IControladorUsuario {
  
  public abstract void ingresarUsuario( DtCliente cliente);
  public abstract void ingresarUsuario( DtProveedor proveedor);
  public abstract List<String> listarClientes();
  public abstract List<String> listarProveedores();
  public abstract DtCliente datosCliente(String nick);
  public abstract DtProveedor datosProveedor(String nick);
  public abstract DtReserva datosReserva(int num);
  public abstract DtServicio datosServicio(int num);
  
  
  public abstract boolean VerificarUsuario(String nickUsaurio, String email);
  public abstract void AltaCliente(DtCliente dataCli);
  public abstract void AltaProveedor(DtProveedor dataProv);
  
}
