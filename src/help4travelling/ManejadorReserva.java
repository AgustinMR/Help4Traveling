package help4travelling;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Antares
 */

public class ManejadorReserva {
    private int id=0;
    private Map reservas = new HashMap<Integer,Reserva>();
    private static ManejadorReserva instance = null;    
    
    public static ManejadorReserva GetInstance(){
        if (instance==null)
            instance = new ManejadorReserva();
        return instance;
    }
    
    public Reserva CrearReserva(DtReserva dtRes, Cliente c){
        id += 1;
        return new Reserva(dtRes, c, this.id);
    }
    
    public void AgregarReserva(Reserva r){
        this.reservas.put(r.GetId(),r);
    }
    
    public Reserva ObtenerReserva(int num){
        return (Reserva)this.reservas.get(num);
    }
    
    public Set DevolverKeyReservas(){
        return this.reservas.keySet();
    }
    
    public DtReserva ObtenerDatosReserva(int idReserva){
        Reserva resRet = (Reserva)this.reservas.get(idReserva);
        return resRet.GetDtReserva();
    }
        
}
