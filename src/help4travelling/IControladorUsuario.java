package help4travelling;

import java.util.List;

/**
 *
 * @author Bruno
 */
public interface IControladorUsuario {
  
  public void ingresarUsuario( DtCliente cliente);
  public void ingresarUsuario( DtProveedor proveedor);
  public List<String> listarClientes();
  public List<String> listarProveedores();
  public DtCliente datosCliente(String nick);
  public DtProveedor datosProveedor(String nick);
  public DtReserva datosReserva(int num);
  public DtServicio datosServicio(int num);
  
}
