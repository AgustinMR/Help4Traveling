package help4travelling;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Antares
 */
public interface IControladorArticulo {
    public abstract boolean CrearPromocion(DtPromocion DtProm);
    public abstract ArrayList<String> listarPromociones();
    public abstract Set<DtServicio> ListarServicios();
    public abstract void PublicarServicio(String nameServ);
    public abstract DtPromocion datosPromociones(String nombreProm);
    public abstract DtServicio datosServicio(String nombreServ);
    public abstract Servicio ModificarServicio(DtServicio modSer);
    public abstract void AgregarCategoria(String catName);
    public abstract void QuitarCategoria(String catName);
}
