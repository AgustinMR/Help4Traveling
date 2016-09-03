
package help4travelling;

import java.util.ArrayList;

public class DtReserva {
    private int id;
    private DtFecha date;
    private Estado estado;
    private ArrayList<DtInfoReserva> infoReserva = new ArrayList<DtInfoReserva>();
    private String cli;
    private float precio;
    
    public DtReserva(int id, Estado estado, DtFecha date, ArrayList<DtInfoReserva> infoReserva ,String nickCli, float precio){
        this.id = id;
        this.estado = estado;
        this.date = date;
        this.infoReserva = infoReserva;
        this.cli = nickCli;
        this.precio = precio;
    }    
    
     public DtReserva(Estado estado, DtFecha date, ArrayList<DtInfoReserva> infoReserva ,String nickCli, float precio){
        this.id = id;
        this.estado = estado;
        this.date = date;
        this.infoReserva = infoReserva;
        this.cli = nickCli;
        this.precio = precio;
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
    
    public ArrayList<DtInfoReserva> GetInfoReservas(){
        return this.infoReserva;
    }
    
    public String GetCliente(){
        return this.cli;
    }
}
