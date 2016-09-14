package help4travelling;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Set;

public class DtCliente {
    
    private String nick;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;
    private DtFecha fechaN;
    private Blob[] avatar;
    private ArrayList<Integer> reservas;
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Integer> r){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.avatar=avatar;
        this.reservas=r;
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, ArrayList<Integer> r, String clave){
        this.nick=nick;
        this.clave=clave;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.avatar=avatar;
        this.reservas=r;
    }
    
    public DtCliente(String nick, String nombre, String apellido, String email, DtFecha fechaN, ArrayList<Integer> r){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.reservas=r;
    }

    public ArrayList<Integer> getReservas() {
        return reservas;
    }
    
    public String getNick(){
        return this.nick;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public DtFecha getFechaN(){
        return this.fechaN;
    }
    
    public Blob[] getAvatar(){
        return this.avatar;
    }

    public String getClave() {
        return clave;
    }
    
}
