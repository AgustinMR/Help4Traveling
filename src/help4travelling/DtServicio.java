package help4travelling;

import java.sql.Blob;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class DtServicio {
 
    private String nombre;
    private Float precio;
    private Blob[] imagen;
    private String descripcion;
    private ArrayList<String> categorias;
    private String ciudadOrigen;
    private String ciudadDestino;
    
     public DtServicio(String nombre, Float precio, Blob[] imagen, String descripcion, ArrayList<String> categorias, String ciudadOrigen, String ciudadDestino){
        this.nombre=nombre;
        this.precio=precio;
        this.imagen=imagen;
        this.descripcion=descripcion;
        this.categorias=categorias; 
        this.ciudadOrigen=ciudadOrigen; 
        this.ciudadDestino=ciudadDestino;
    }
    
    public DtServicio(String nombre, Float precio, String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
    }
     
    public DtServicio(Servicio serv){
        this.nombre = serv.GetNombre();
        this.precio = serv.getPrecio();
        this.imagen = serv.GetImage();
        this.descripcion = serv.GetDescripcion();
     }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Float getPrecio(){
        return this.precio;
    }
    
    public Blob[] getImagen(){
        return this.imagen;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public ArrayList<String> getCategorias(){
        return this.categorias;
    }
    
     public String getCiudadOrigen(){
        return this.ciudadOrigen;
    }
     
      public String getCiudadDestino(){
        return this.ciudadDestino;
    }

}
