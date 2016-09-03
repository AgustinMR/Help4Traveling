package help4travelling;

public class DtInfoReserva {
    private DtFecha fechaIni;
    private DtFecha fechaFin;
    private int cantidad;
    private String nameArticulo;
    private String nickProveedor;
    private int idReserva;
    float precioArticulo;
    
    public DtInfoReserva(int idReserva, String nombreArticulo, int cantidad, String nickProv){
        this.idReserva = idReserva;
        this.nameArticulo = nombreArticulo;
        this.cantidad = cantidad;
        this.nickProveedor = nickProv;
    }
    
    public DtInfoReserva(infoReserva infoRes){
        this.idReserva = infoRes.GetReserva().GetId();
        this.nameArticulo = infoRes.GetArticulo().GetNombre();
        this.cantidad = infoRes.GetCantidad();
        this.fechaIni = infoRes.GetFechaIni();
        this.fechaFin = infoRes.GetFechaFin();
        this.nickProveedor = infoRes.getNickProveedor();
    }
    
    public DtFecha GetFechaIni(){
        return this.fechaIni;
    }
    
    public float getPrecioArticulo() {
        return precioArticulo;
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
    
    
}
