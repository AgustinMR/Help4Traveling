package help4travelling;

import java.util.ArrayList;

/**
 * @author Antares
 */

public class DtPromocion {
    private String nombre;
    private float descuento;
    private float precioTotal;
    private ArrayList<String> servicios;
        
    
     public DtPromocion(String nombre, float descuento, float precioTotal, ArrayList<String> servicios){
        this.nombre=nombre;
        this.descuento=descuento;
        this.precioTotal=precioTotal;
        this.servicios=servicios;
     }
    
    public String GetNombre() {
        return this.nombre;
    }
    
    public float GetDescuento() {
        return this.descuento;
    }     
    
     public float GetPrecioTotal() {
        return this.precioTotal;
    }    
}
