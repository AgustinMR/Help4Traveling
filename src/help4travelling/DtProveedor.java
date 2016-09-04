package help4travelling;

import java.sql.Blob;
import java.util.ArrayList;

public class DtProveedor {
 
    private String nick;
    private String nombre;
    private String apellido;
    private String email;
    private DtFecha fechaN;
    private Blob[] avatar;
    private String nombreEmpresa;
    private String url;
    private ArrayList<DtServicio> servicio;
    
     
     public DtProveedor(String nick, String nombre, String apellido, String email, DtFecha fechaN, Blob[] avatar, String nombreEmpresa, String url, ArrayList<DtServicio> servicio){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.avatar=avatar; 
        this.nombreEmpresa=nombreEmpresa; 
        this.url=url;
        this.servicio=servicio;
    }
     
    public DtProveedor(String nick, String nombre, String apellido, String email, DtFecha fechaN, String nombreEmpresa, String url, ArrayList<DtServicio> servicio){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.fechaN=fechaN;
        this.nombreEmpresa=nombreEmpresa; 
        this.url=url;
        this.servicio=servicio;
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
    
     public String getNombreEmpresa(){
        return this.nombreEmpresa;
    }
     
      public String getUrl(){
        return this.url;
    }
         
    public ArrayList<DtServicio> getServicio() {
        return servicio;
    }
}
