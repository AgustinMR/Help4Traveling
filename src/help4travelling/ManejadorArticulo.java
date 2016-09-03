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
    
    private ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    private Articulo promo;
    private static ManejadorArticulo instance = null;
    
    
    public static ManejadorArticulo GetInstance(){
        if (instance==null)
            instance = new ManejadorArticulo();
        return instance;
    }
    
    public void AgregarPromocion(Promocion p){
        this.articulos.add(p);
    }
    
    public void AgregarServicio(Servicio s){
        this.articulos.add(s);
    }
    
    public boolean IsPromocion(String name, String nomProv){
        for (int i = 0; i < articulos.size(); i++) {
             if (articulos.get(i).GetNombre() == name && articulos.get(i).getProv() == nomProv && articulos.get(i).isPromocion())
                return true;
        }
        return false;
    }
    
     public ArrayList<String> listarPromociones(){
        ArrayList<String> ArrayPromociones = new ArrayList<String>();
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).isPromocion())
                ArrayPromociones.add(articulos.get(i).GetNombre());
        }
        return ArrayPromociones;
    }
     
    public ArrayList<DtServicio> ListarServicios(){
        ArrayList<DtServicio> ret = new ArrayList<DtServicio>();
        for (int i = 0; i < articulos.size(); i++) {
            if(articulos.get(i).IsServicio()){
                ret.add(articulos.get(i).GetDtServicio());
            }
        }
        return ret;
    }
     
     
    public DtPromocion datosPromociones(String nombreProm, String nomProv){
         for (int i = 0; i < articulos.size(); i++) {
             if (articulos.get(i).GetNombre() == nombreProm && articulos.get(i).getProv() == nomProv)
                 promo = articulos.get(i);
         }
         return promo.getDtPromocion();
    }
    
    public DtServicio datosServicio(String nombreServ, String nomProv){
         return promo.getDatosServProm(nombreServ, nomProv);
    }
    
    public Servicio BuscarServicio(String nameServ, String nomProv){
        Articulo serv = null; 
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).GetNombre() == nameServ && articulos.get(i).IsServicio())
                serv = articulos.get(i);
        }
        return (Servicio)serv;
    }
    
    public Servicio ModificarServicio(DtServicio modSer){
        Servicio serv = null; 
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).GetNombre() == modSer.getNombre() && articulos.get(i).getProv() == modSer.getNickProveedor() && articulos.get(i).IsServicio())
                serv = (Servicio)articulos.get(i);
        }
        //Servicio ser = (Servicio)this.articulos.get(modSer.getNombre());
        serv.ModificarDatosServicio(modSer);
        return serv;
    }
    
    public Articulo ObtenerArticulo(String nameArti, String nomProv){
        Articulo Art = null; 
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).GetNombre() == nameArti && articulos.get(i).getProv() == nomProv )
                Art = articulos.get(i);
        }
        return Art;
    }
    
    public boolean insertarServicio(DtServicio DtServ, Ciudad ciudadO, Ciudad ciudadD){
       for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).GetNombre() == DtServ.getNombre() && articulos.get(i).getProv() == DtServ.getNickProveedor() )
                return false;
       }
       Servicio serv = new Servicio(DtServ.getNombre(), DtServ.getNickProveedor(), DtServ.getDescripcion(), ciudadO, ciudadD, DtServ.getPrecio());
       articulos .add((Articulo)serv);
       //mandar datos a la base de datos
       return ManejadorSQL.GetInstance().agregarServicio(DtServ, DtServ.getNickProveedor(), DtServ.getCategorias());
    }
}
