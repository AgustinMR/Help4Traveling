package help4travelling;

import java.util.ArrayList;

public interface IControladorCategoria {
     public abstract ArrayList<DtCategoria> listarCategorias();
     public abstract ArrayList<DtServicio> listarServicios(String nombre);
     public abstract DtServicio datosServicio(String nombreServ);
     public abstract void IngresarCategoria(String nombre);
    public abstract void IngresarCategoria(String nombre, String padre);
}
