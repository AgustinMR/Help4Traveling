package help4travelling;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author Antares
 */

public class ManejadorReserva {
    private int id=0;
    private static Map<Integer,Reserva> reservas = new HashMap<Integer,Reserva>();
    private static ManejadorReserva instance = null;    
    
    public static ManejadorReserva GetInstance(){
        if (instance==null){
            instance = new ManejadorReserva();  
        }
        reservas.clear();
        ArrayList<Integer> arrayRes = ManejadorSQL.GetInstance().cargarReservas();
        for (int i = 0; i < arrayRes.size(); i++) {          
            reservas.put(arrayRes.get(i),new Reserva(arrayRes.get(i)));
        }
        return instance;
    }
    
    public Reserva CrearReserva(DtReserva dtRes, Cliente c){
        return new Reserva(dtRes.GetId());
    }
    
   /* public void AgregarReserva(Reserva r){
        this.reservas.put(r.GetId(),r);
    }
    */
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
    
    public ArrayList<DtReserva> listarReservas(){
        ArrayList<DtReserva> arrayRes = new ArrayList<>();
        for (Integer name: reservas.keySet()) { 
            arrayRes.add(reservas.get(name).GetDtReserva());
        }
        return arrayRes;
    }
    
    public boolean modReserva(Estado e , int idRes){
        return ManejadorSQL.GetInstance().actualizarEstado(idRes, e.toString());
    }    
    
     public boolean GuardarReserva(Reserva res, infoReserva infoRes){
        reservas.put(res.GetId(),res);
        infoRes.EnlazarReserva(res);
        return true;
    }
     
     public boolean eliminarReserva(String id){
        return ManejadorSQL.GetInstance().eliminarReserva(id);
    }
     
     public ArrayList<DtInfoReserva> ObtenerInfoArticulosReservados(int id){
        return ManejadorSQL.GetInstance().devolverInfoReserva(id);
    }

    ArrayList<Integer> listarReservasXcli(String nickU) {
        return ManejadorSQL.GetInstance().cargarReservasXcli(nickU);
    }
}
