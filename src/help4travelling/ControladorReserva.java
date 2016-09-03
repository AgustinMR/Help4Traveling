package help4travelling;

import java.util.Set;

/**
 * @author Bruno
 */
public class ControladorReserva implements IControladorReserva{
 
    private int nroRes;
    private Reserva res;
    private Articulo artmem;
    private infoReserva irmem;
    
    public ControladorReserva(){
        
    }
         
    public boolean actualizarEstado(Estado e,String r){
        //esto es temporal con tal de evitar que el programa explote
        return true;
    }
    
    public void CrearReserva(DtReserva dtRes){        
        Cliente cli = ManejadorUsuario.getinstance().ObtenerCliente(dtRes.GetCliente());
        Reserva res = ManejadorReserva.GetInstance().CrearReserva(dtRes, cli);
        this.res = res;
    }
    
    public void ReservarArticulo(DtInfoReserva dtir){
        Articulo art = ManejadorArticulo.GetInstance().ObtenerArticulo(dtir.GetNombreArticulo(),dtir.getNickProveedor());
        infoReserva ir = res.ReservarArticulo(dtir, art);
        this.artmem = art;
        this.irmem = ir;
    }
    
    public void ConfirmarReserva(boolean ok){
        if(ok==true){
            this.res.EnlazarReserva(this.irmem);
            this.artmem.EnlazarReserva(irmem);
            this.irmem.EnlazarReserva(this.res);
            ManejadorReserva.GetInstance().AgregarReserva(res);
        }
        else{
            this.res.DesenlazarReserva(this.irmem);
        }
    }
    
    //Lista todas las key de las reservas en el sistema
    public Set ListarNroReservas(){
        return ManejadorReserva.GetInstance().DevolverKeyReservas();        
    }
    
    public DtReserva ObtenerDatosReserva(int idReserva){
        this.nroRes = idReserva;
        return ManejadorReserva.GetInstance().ObtenerDatosReserva(idReserva);
    }
    
    public Set<DtInfoReserva> ObtenerInfoArticulosReservados(){
        System.out.println("Bandera2 " + this.nroRes);
        Reserva resret = ManejadorReserva.GetInstance().ObtenerReserva(this.nroRes);
        
        Set<DtInfoReserva> test = resret.GetArticulosReservados();
        //test.foreach( i -> System.out.println(/* ((DtInfoReserva)i).GetNombreArticulo()*/ ) )
        
        return resret.GetArticulosReservados();
    }
}
