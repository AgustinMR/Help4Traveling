package help4travelling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Antares
 */

public class ControladorArticulo implements IControladorArticulo{    
    private Promocion prom;
    private Servicio serv;
    
    public ControladorArticulo(){}
    
    public boolean insertarServicio(DtServicio DtServ){
        Ciudad ciudadO = ManejadorCiudad.GetInstance().BuscarCiudad(DtServ.getCiudadOrigen());
        if (DtServ.getCiudadDestino() != null){
            Ciudad ciudadD = ManejadorCiudad.GetInstance().BuscarCiudad(DtServ.getCiudadDestino());
            return ManejadorArticulo.GetInstance().insertarServicio(DtServ, ciudadO, ciudadD);
        }else{
            return ManejadorArticulo.GetInstance().insertarServicio(DtServ, ciudadO, null);
        }
    }
    
    public boolean CrearPromocion(DtPromocion DtProm){
        String nameProm = DtProm.GetNombre();
        ManejadorArticulo manArt = ManejadorArticulo.GetInstance();
        boolean ok = manArt.IsPromocion(nameProm, DtProm.getNickProv());
        
        //Si la instancia no existe ya en el sistema puedo crearla
        if(ok == false){
            Promocion p = new Promocion(DtProm);
            manArt.AgregarPromocion(p);
        }
        
        return !ok;
    }
    
    public ArrayList<DtPromocion> listarPromociones(){
        return ManejadorArticulo.GetInstance().listarPromociones();
    }
    
    public ArrayList<DtServicio> ListarServicios(){
        return ManejadorArticulo.GetInstance().ListarServicios();
    }
    
    public ArrayList<DtPromocion> listarPromocionesProv(String nick){
        return ManejadorArticulo.GetInstance().listarPromocionesProv(nick);
    }
    
    public ArrayList<DtServicio> ListarServiciosProv(String nick){
        return ManejadorArticulo.GetInstance().ListarServiciosProv(nick);
    }
    
    public void PublicarServicio(String nameServ, String nameProv){
        Servicio ser = ManejadorArticulo.GetInstance().BuscarServicio(nameServ, nameProv);
        this.prom.AgregarServicio(ser);
        this.prom = null;
    }
    
    public DtPromocion datosPromociones(String nombreProm, String nameProv){
        return ManejadorArticulo.GetInstance().datosPromociones(nombreProm, nameProv);
    }
    
    public DtServicio datosServicio(String nombreServ, String nameProv){
        return ManejadorArticulo.GetInstance().datosServicio(nombreServ, nameProv);
    }
    
    public Servicio ModificarServicio(DtServicio modSer){
        Servicio ser = ManejadorArticulo.GetInstance().ModificarServicio(modSer);
        this.serv = ser;
        return ser;
    }
    
    public void CambiarCiudadOrigen(String City){
        Ciudad ciu = ManejadorCiudad.GetInstance().BuscarCiudad(City);
        this.serv.CambiarOrigen(ciu);
    }
    
    public void CambiarCiudadDestino(String City){
        Ciudad ciu = ManejadorCiudad.GetInstance().BuscarCiudad(City);
        this.serv.CambiarDestino(ciu);
    }
    
    public void AgregarCategoria(String catName){
        Categoria cat = ManejadorCategoria.GetInstance().BuscarCategoria(catName);
        this.serv.AgregarCategoria(cat);
    }
    
    public void QuitarCategoria(String catName){
        ManejadorCategoria.GetInstance().QuitarCategoria(catName);
    }   
    
    public List<String> listaDeCiudades(){
        return ManejadorCiudad.GetInstance().listaDeCiudades();
    }
}
