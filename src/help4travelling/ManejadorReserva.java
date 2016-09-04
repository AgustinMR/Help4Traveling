package help4travelling;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import javafx.util.Pair;

/**
 * @author Antares
 */

public class ManejadorReserva {
    private int id=0;
    private static Map<Pair<Integer,String>,Reserva> reservas = new HashMap<Pair<Integer,String>,Reserva>();
    private static ManejadorReserva instance = null;    
    
    public static ManejadorReserva GetInstance(){
        if (instance==null){
            instance = new ManejadorReserva();  
        }
        reservas.clear();
        Map<Pair<Integer,String>,Reserva> arrayRes = ManejadorSQL.GetInstance().cargarReservas();
        for (Pair<Integer,String> name: arrayRes.keySet()) {          
            reservas.put(name,new Reserva(name.getKey(),name.getValue()));
        }
        return instance;
    }
    
    public Reserva CrearReserva(DtReserva dtRes, Cliente c){
        return new Reserva(dtRes.GetId(), c.getNick());
    }
    
    public void AgregarReserva(Reserva r){
        this.reservas.put(new Pair(r.GetId(),r.GetCliente()),r);
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
    
     public boolean GuardarReserva(Reserva res, infoReserva infoRes){
        reservas.put(new Pair(res.GetId(),res.GetCliente()),res);
        infoRes.EnlazarReserva(res);
        return true;
    }
        
}
