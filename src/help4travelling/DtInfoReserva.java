package help4travelling;

public class DtInfoReserva {
    private DtFecha fechaIni;
    private DtFecha fechaFin;
    private int cantidad;
    private String nameArticulo;
    private String nickProveedor;
    private int idReserva;
    private float precioArticulo;

    public DtInfoReserva(DtFecha fechaIni, DtFecha fechaFin, int cantidad, String nameArticulo, String nickProveedor, int idReserva, float precioArticulo) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantidad = cantidad;
        this.nameArticulo = nameArticulo;
        this.nickProveedor = nickProveedor;
        this.idReserva = idReserva;
        this.precioArticulo = precioArticulo;
    }
      
    public DtInfoReserva(String nombreArticulo, int cantidad, String nickProv, DtFecha fechaFin, DtFecha fechaIni, float precio){
        this.nameArticulo = nombreArticulo;
        this.cantidad = cantidad;
        this.nickProveedor = nickProv;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }
    
    public DtFecha GetFechaIni(){
        return this.fechaIni;
    }
    
    public DtFecha GetFechaFin(){
        return this.fechaFin;
    }
    
    public int GetCantidad(){
        return this.cantidad;
    }
    
    public String GetNombreArticulo(){
        return this.nameArticulo;
    }
    
    public int GetIdReserva(){
        return this.idReserva;
    }

    public String getNickProveedor() {
        return nickProveedor;
    }
    
    public float getPrecioArticulo() {
        return this.precioArticulo;
    }
    
    
}
