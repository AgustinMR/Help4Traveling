/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Reserva {
    private int id;
    private DtFecha date;
    private Estado estado;
    private ArrayList<infoReserva> infoReserva = new  ArrayList<infoReserva>();
    private String cli;;
    private float precio;

    public Reserva(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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
    
    public ArrayList<infoReserva> GetInfoReservas(){
        return this.infoReserva;
    }
    
    public String GetCliente(){
        return this.cli;
    }  
    
    
    public infoReserva ReservarArticulo(DtInfoReserva dtir, Articulo a){
        return new infoReserva(a.getProv(), a.GetNombre(), dtir.GetIdReserva());
    }
    
    public void EnlazarReserva(infoReserva ir){
        this.infoReserva.add(ir);
    }
    
    public void DesenlazarReserva(infoReserva ar){
        ar.DesenlazarInfoReserva();
        this.infoReserva.remove(ar);
    }
    
    public DtReserva GetDtReserva(){
        /*ArrayList<DtInfoReserva> arrayDtInfo = new ArrayList<DtInfoReserva>();
        for (int i = 0; i < infoReserva.size(); i++) {
            arrayDtInfo.add(infoReserva.get(i).GetDtInfoReserva());
        }*/
        return ManejadorSQL.GetInstance().devolverReserva(this.id);
        //return new DtReserva(this.id, this.estado, this.date, arrayDtInfo , this.cli, this.precio);
    }
    
    public Set<DtInfoReserva> GetArticulosReservados(){
        Set<DtInfoReserva> ret = new HashSet<DtInfoReserva>();
        System.out.println("bandera 3");
        infoReserva.forEach( i -> ret.add( ((infoReserva)i).GetDtInfoReserva() ) );
        return ret;
    }
}
