/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Agustin
 */
public class DtReserva {
    private int id;
    private DtFecha date;
    private Estado estado;
    private Set infoReserva = new HashSet<DtInfoReserva>();
    private String cli;
    
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
