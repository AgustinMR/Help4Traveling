package help4travelling;

/*
 * @author Antares
 */

import java.sql.Blob;
import java.util.Set;
import java.util.HashSet;

public abstract class Articulo {
    
    protected String nombre; 
    protected Set infoReservas = new HashSet<infoReserva>();
    protected String prov;    // "
    //private InfoReserva info; //Luego de crearse InfoReserva decomentar
    
    public String GetNombre(){
        return this.nombre;
    }
    
    public void SetNombre(String name){
        this.nombre = name;
    }
    
    public abstract boolean isPromocion();
    
    public abstract boolean IsServicio();
    
    public abstract DtPromocion getDtPromocion();
    
    public abstract DtServicio GetDtServicio();
    
    public abstract DtServicio getDatosServProm(String nombreServ, String nomProv);

    public void EnlazarReserva(infoReserva ar){
        this.infoReservas.add(ar);
    }    

    public Set getInfoReservas() {
        return infoReservas;
    }

    public void setInfoReservas(Set infoReservas) {
        this.infoReservas = infoReservas;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }
    
     public abstract Float getPrecio();
    
}
