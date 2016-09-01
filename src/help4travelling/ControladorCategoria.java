package help4travelling;

import java.util.ArrayList;

/**
 *
 * @author Nacho
 */
public class ControladorCategoria implements IControladorCategoria{
    
    public ArrayList<DtCategoria> listarCategorias(){
        return ManejadorCategoria.GetInstance().listarCategorias();
    }
    
    public ArrayList<String> listarServicios(String nombre){
        return ManejadorCategoria.GetInstance().listarServicios(nombre);
    }
    
    public DtServicio datosServicio(String nombreServ){
        return ManejadorCategoria.GetInstance().datosServicio(nombreServ);
    }
    
    public void IngresarCategoria(String nombre){
        ManejadorCategoria man = ManejadorCategoria.GetInstance();
        man.IngresarCategoria(nombre);
    }
    
    public void IngresarCategoria(String nombre, String padre){
        ManejadorCategoria man = ManejadorCategoria.GetInstance();
        man.IngresarCategoria(nombre, padre);
    }
    
    public Categoria BuscarCategoria(String nombre){
        ManejadorCategoria man = ManejadorCategoria.GetInstance();
        Categoria c = man.BuscarCategoria(nombre);
        return c;
    }
    
    
}
