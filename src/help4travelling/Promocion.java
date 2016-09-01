package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Antares
 */
public class Promocion extends Articulo {
    private float descuento;
    private float precioTotal;
    private HashMap<String, Servicio> servicios = new HashMap<String, Servicio>();
    
    public Promocion(DtPromocion DtProm){
        String name = DtProm.GetNombre();
        this.SetNombre(name);
        this.descuento = DtProm.GetDescuento();
        this.precioTotal = DtProm.GetPrecioTotal();
    }
    
    public boolean isPromocion(){
        return true;
    }
    
      public boolean IsServicio(){
        return false;
    }
    
    public DtPromocion getDtPromocion(){
        ArrayList<String> ArrayServicios = new ArrayList<String>();
        float precioT = 0;
        for (String name: servicios.keySet()) {
            precioT = precioT + servicios.get(name).getPrecio();
            ArrayServicios.add(servicios.get(name).GetNombre());
        }
        return new DtPromocion(nombre, descuento, precioT, ArrayServicios);
    }
    
    public DtServicio getDatosServProm(String nombreServ){
        return servicios.get(nombreServ).getDtServicio();
    }
    
    public DtServicio GetDtServicio(){
        return null;
    }
    
    public void AgregarServicio(Servicio ser){
        servicios.put(ser.GetNombre(), ser);
    }
    
}
