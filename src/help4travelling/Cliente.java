package help4travelling;

import java.sql.Blob;
import java.util.HashMap;
import java.util.ArrayList;

public class Cliente extends Usuario{

    private HashMap<String, Reserva> reservas = new HashMap<String, Reserva>();

    public Cliente (DtCliente u){
        this.nick= u.getNick();
        this.nombre= u.getNombre();
        this.apellido= u.getApellido();
        this.email= u.getEmail();
        this.fechaN= u.getFechaN();
        this.avatar= u.getAvatar();
    }

    public DtCliente getDtCliente(){
        ArrayList<Reserva> ArrayReservas = new ArrayList<Reserva>();
        for (String name: reservas.keySet()) {
            ArrayReservas.add(reservas.get(name));
        }
        return new DtCliente(nick, nombre, apellido, email, fechaN, avatar, ArrayReservas);
    }

    public Cliente() {
        
    }
    
    public Cliente(String nick, String nombre){
        this.nick = nick;
        this.nombre = nombre;
    }
    
    public HashMap<String, Reserva> getReservas() {
        return reservas;
    }

    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public DtFecha getFechaN() {
        return fechaN;
    }

    public Blob[] getAvatar() {
        return avatar;
    }

    public void setReservas(HashMap<String, Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaN(DtFecha fechaN) {
        this.fechaN = fechaN;
    }

    public void setAvatar(Blob[] avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getNickCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNickProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
