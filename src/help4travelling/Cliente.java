package help4travelling;

import java.sql.Blob;
import java.util.HashMap;
import java.util.ArrayList;

public class Cliente extends Usuario{

    private HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();

    /*public Cliente (DtCliente u){
        this.nick= u.getNick();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar();
    }*/
    
    public Cliente (DtCliente u){
        this.nick= u.getNick();
        this.clave = u.getClave();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar();
    }
    
    
    public Cliente (String nick){
        this.nick= nick;
    }

    public DtCliente getDtCliente(){
        return ManejadorSQL.GetInstance().devolverCliente(this.nick);
    }
    
    public Cliente(String nick, String nombre){
        this.nick = nick;
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setReservas(HashMap<String, Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getNickCliente() {
        return this.nick;
    }

    public String getNickProveedor() {
        return null;
    }
  
}
