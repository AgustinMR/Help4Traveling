package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;

import java.sql.Blob;

/*
 * @author Antares
 */

public class Servicio extends Articulo{   
    private Blob[] image;
    private String descripcion;
    private Float precio;
    private HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    //private Promocion[] prom;
    
    public Servicio(String nombre, String descripcion, Float precio){
        this.SetNombre(nombre);
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public Servicio(DtServicio dtSer){
        this.nombre = dtSer.getNombre();
        this.descripcion = dtSer.getDescripcion();
        this.precio = dtSer.getPrecio();
    }
    
    public void AddImage(Blob Image){}
    
    public DtServicio getDtServicio(){
        ArrayList<String> ArrayCategorias = new ArrayList<String>();
        for (String name: categorias.keySet()) {
            ArrayCategorias.add(categorias.get(name).getNombre());
        }
        return new DtServicio(nombre, precio,image, descripcion, ArrayCategorias, ciudadOrigen.getNombre(), ciudadDestino.getNombre());
    }
    
      public Blob[] GetImage(){
        return this.image;
    }
    
    public String GetDescripcion(){
        return this.descripcion;
    }
    
    public Float GetFloat(){
        return this.precio;
    }
    
    public boolean isPromocion(){
        return false;
    }
    
    public boolean IsServicio(){
        return true;
    }
    
    public Float getPrecio(){
        return this.precio;
    }
    
    public DtPromocion getDtPromocion(){
        return null;
    }
    
    public DtServicio GetDtServicio(){
        return new DtServicio(this);        
    }
    
    public DtServicio getDatosServProm(String nombreServ){
        return null;
    }    
    
    public void ModificarDatosServicio(DtServicio modSer){
        this.nombre = modSer.getNombre();
        this.precio = modSer.getPrecio();
        this.descripcion = modSer.getDescripcion();
    }
    
    public void CambiarOrigen(Ciudad ori){
        this.ciudadOrigen = ori;
    }
            
    public void CambiarDestino(Ciudad dest){
        this.ciudadDestino = dest;
    }
    
    public void AgregarCategoria(Categoria cat){
        this.categorias.put(cat.getNombre(),cat);
    }
    
    public void QuitarCategoriai(Categoria cat){
        this.categorias.remove(cat.getNombre());
    }
}
