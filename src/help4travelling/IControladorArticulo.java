package help4travelling;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

/**
 * @author Antares
 */
public abstract interface IControladorArticulo {
    public abstract boolean CrearPromocion(DtPromocion DtProm);
    public abstract ArrayList<DtPromocion> listarPromociones();
    public abstract ArrayList<DtServicio> ListarServicios();
    public abstract void PublicarServicio(String nameServ, String nameProv);
    public abstract DtPromocion datosPromociones(String nombreProm, String nameProv);
    public abstract DtServicio datosServicio(String nombreServ, String nameProv);
    public abstract Servicio ModificarServicio(DtServicio modSer);
    public abstract void AgregarCategoria(String catName);
    public abstract void QuitarCategoria(String catName);
    public abstract boolean insertarServicio(DtServicio DtServ);
    public abstract List<String> listaDeCiudades();
    public abstract ArrayList<DtPromocion> listarPromocionesProv(String nick);
    public abstract ArrayList<DtServicio> ListarServiciosProv(String nick);
}
