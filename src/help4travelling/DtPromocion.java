package help4travelling;

import java.util.ArrayList;

/**
 * @author Antares
 */

public class DtPromocion {
    private String nombre;
    private String nickProv;
    private float descuento;
    private float precio;
    private ArrayList<String> servicios;
        
    
     public DtPromocion(String nombre, String nickProv, float descuento, float precio, ArrayList<String> servicios){
        this.nombre=nombre;
        this.nickProv=nickProv;
        this.descuento=descuento;
        this.precio=precio;
        this.servicios=servicios;
     }
    
    public String GetNombre() {
        return this.nombre;
    }
    
    public float GetDescuento() {
        return this.descuento;
    }     
    
    public float GetPrecio() {
        return this.precio;
    }

    public ArrayList<String> GetServicios() {
        return this.servicios;
    } 
    
      public String getNickProv() {
        return nickProv;
    }
}
