
package help4travelling;

import java.util.HashSet;
import java.util.Set;

public class DtReserva {
    private int id;
    private DtFecha date;
    private Estado estado;
    private Set infoReserva = new HashSet<DtInfoReserva>();
    private String cli;
    private float precio;
    public DtReserva(int id, Estado estado, String nickCli){
        this.id = id;
        this.estado = estado;
        this.cli = nickCli;
    }
    
    public DtReserva(Reserva res){
        this.id = res.GetId();
        this.estado = res.GetEstado();
        this.date = res.GetFecha();
        this.cli = res.GetCliente().getNick();
        this.infoReserva = res.GetInfoReservas();
        this.precio = res.getPrecio();
    }

    public float getPrecio() {
        return precio;
    }
    
    public int GetId(){
        return this.id;
    }
    
    public DtFecha GetFecha(){
        return this.date;
    }
    
    public Estado GetEstado(){
        return this.estado;
    }
    
    public Set GetInfoReservas(){
        return this.infoReserva;
    }
    
    public String GetCliente(){
        return this.cli;
    }
}
