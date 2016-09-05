package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author Antares
 */
public class Promocion extends Articulo {
    private float descuento;
    private float precioTotal;
    private ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    
    public Promocion(DtPromocion DtProm){
        String name = DtProm.GetNombre();
        this.SetNombre(name);
        this.descuento = DtProm.GetDescuento();
        this.precioTotal = DtProm.GetPrecio();
    }
    
    public Promocion(String nick, String nombre){
        this.nombre = nombre;
        this.prov = nick;
    }
    
    public boolean isPromocion(){
        return true;
    }
    
      public boolean IsServicio(){
        return false;
    }
    
    public DtPromocion getDtPromocion(){
        return ManejadorSQL.GetInstance().devolverPromocion(this.getProv(), this.GetNombre());
    }
    
    public DtServicio getDatosServProm(String nombreServ, String nombreProv){
        for (int i = 0; i < servicios.size(); i++) {
              if (servicios.get(i).GetNombre() == nombreServ && servicios.get(i).getProv() == nombreProv);
                    return servicios.get(i).GetDtServicio();                    
        }
        return null;
    }
    
    public DtServicio GetDtServicio(){
        return null;
    }
    
    public void AgregarServicio(Servicio ser){
        servicios.add(ser);
    }
    
    public Float getPrecio(){
        float precioT = 0;
        for (int i = 0; i < servicios.size(); i++) {
               precioT = precioT + servicios.get(i).getPrecio();
        }
        return (descuento*precioT)/100;
    }
    
}
