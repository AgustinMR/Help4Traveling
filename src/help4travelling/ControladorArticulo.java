package help4travelling;

import java.util.ArrayList;
import java.util.Set;

/**
 * @author Antares
 */

public class ControladorArticulo implements IControladorArticulo{    
    private Promocion prom;
    private Servicio serv;
    
    public ControladorArticulo(){}
    
    public void CrearServicio(DtServicio DtServ){
        Servicio serv = new Servicio(DtServ);
        ManejadorArticulo.GetInstance().AgregarServicio(serv);
    }
    
    public boolean CrearPromocion(DtPromocion DtProm){
        String nameProm = DtProm.GetNombre();
        ManejadorArticulo manArt = ManejadorArticulo.GetInstance();
        boolean ok = manArt.IsPromocion(nameProm);
        
        //Si la instancia no existe ya en el sistema puedo crearla
        if(ok == false){
            Promocion p = new Promocion(DtProm);
            manArt.AgregarPromocion(p);
        }
        
        return !ok;
    }
    
    public ArrayList<String> listarPromociones(){
        return ManejadorArticulo.GetInstance().listarPromociones();
    }
    
    public Set<DtServicio> ListarServicios()
    {
        return ManejadorArticulo.GetInstance().ListarServicios();
    }
    
    public void PublicarServicio(String nameServ){
        Servicio ser = ManejadorArticulo.GetInstance().BuscarServicio(nameServ);
        this.prom.AgregarServicio(ser);
        this.prom = null;
    }
    
    public DtPromocion datosPromociones(String nombreProm){
        return ManejadorArticulo.GetInstance().datosPromociones(nombreProm);
    }
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorArticulo.GetInstance().datosServicio(nombreServ);
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
}
