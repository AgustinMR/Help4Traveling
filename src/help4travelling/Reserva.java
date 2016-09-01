/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.Set;
import java.util.HashSet;

public class Reserva {
    private int id;
    private DtFecha date;
    private Estado estado;
    private Set infoReserva;
    private Cliente cli;;
    
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
    
    public Cliente GetCliente(){
        return this.cli;
    }
    
    public Reserva(DtReserva dtres, Cliente c, int id){
        this.id = id;
        this.date = dtres.GetFecha();
        this.estado = dtres.GetEstado();
        this.infoReserva = dtres.GetInfoReservas();
        this.cli = c;        
    }
    
    public infoReserva ReservarArticulo(DtInfoReserva dtir, Articulo a){
        return new infoReserva(dtir, a, this);
    }
    
    public void EnlazarReserva(infoReserva ir){
        this.infoReserva.add(ir);
    }
    
    public void DesenlazarReserva(infoReserva ar){
        this.infoReserva.remove(ar);
    }
    
    public DtReserva GetDtReserva(){
        return new DtReserva(this);
    }
    
    public Set<DtInfoReserva> GetArticulosReservados(){
        Set<DtInfoReserva> ret = new HashSet<DtInfoReserva>();
        System.out.println("bandera 3");
        infoReserva.forEach( i -> ret.add( ((infoReserva)i).GetDtInfoReserva() ) );
        return ret;
    }
}
