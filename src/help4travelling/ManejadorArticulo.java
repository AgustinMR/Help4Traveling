package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Antares
 */

import java.util.HashMap;
import java.util.Map;

public class ManejadorArticulo {
    
    private HashMap<String, Articulo> articulos = new HashMap<String, Articulo>();
    private Articulo promo;
    private static ManejadorArticulo instance = null;
    
    
    public static ManejadorArticulo GetInstance(){
        if (instance==null)
            instance = new ManejadorArticulo();
        return instance;
    }
    
    public void AgregarPromocion(Promocion p){
        String key = p.GetNombre();
        this.articulos.put(key, p);
    }
    
    public void AgregarServicio(Servicio s){
        String key = s.GetNombre();
        this.articulos.put(key, s);
    }
    
    public boolean IsPromocion(String name){
        return articulos.containsKey(name);
    }
    
     public ArrayList<String> listarPromociones(){
        ArrayList<String> ArrayPromociones = new ArrayList<String>();
        for (String name: articulos.keySet()) {
            if (articulos.get(name).isPromocion())
                ArrayPromociones.add(articulos.get(name).GetNombre());
        }
        return ArrayPromociones;
    }
     
    public Set<DtServicio> ListarServicios(){
        Set<DtServicio> ret = new HashSet<DtServicio>();
        for (String key: articulos.keySet()){
            if(articulos.get(key).IsServicio()){
                ret.add(articulos.get(key).GetDtServicio());
            }
        }
        return ret;
    }
     
     
    public DtPromocion datosPromociones(String nombreProm){
         promo = articulos.get(nombreProm);
         return promo.getDtPromocion();
    }
    
    public DtServicio datosServicio(String nombreServ){
         return promo.getDatosServProm(nombreServ);
    }
    
    public Servicio BuscarServicio(String nameServ){
        return (Servicio)articulos.get(nameServ);
    }
    
    public Servicio ModificarServicio(DtServicio modSer){
        Servicio ser = (Servicio)this.articulos.get(modSer.getNombre());
        ser.ModificarDatosServicio(modSer);
        return ser;
    }
    
    public Articulo ObtenerArticulo(String nameArti){
        return articulos.get(nameArti);
    }
}
