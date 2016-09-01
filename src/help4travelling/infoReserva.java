package help4travelling;

public class infoReserva {
    private DtFecha fechaIni;
    private DtFecha fechaFin;
    private int cantidad;
    private Articulo art;
    private Reserva res;
    private String nickProveedor;
    
    public infoReserva(DtInfoReserva dtir, Articulo a, Reserva r, String nickProveedor){
        this.fechaIni = dtir.GetFechaIni();
        this.fechaFin = dtir.GetFechaFin();
        this.cantidad = dtir.GetCantidad();
        this.art = a;
        this.res = r;
        this.setNickProveedor(nickProveedor);
    }
    
    public int GetCantidad(){
        return this.cantidad;
    }
    
    public Articulo GetArticulo(){
        return this.art;
    }
    
    public Reserva GetReserva(){
        return this.res;
    }
    
    public DtFecha GetFechaIni(){
        return this.fechaIni;
    }
    
    public DtFecha GetFechaFin(){
        return this.fechaFin;
    }
    
    public void EnlazarReserva(Articulo a){
        this.art = a;
    }    
    
    public void EnlazarReserva(Reserva r){
        this.res = r;
    }
    
    public DtInfoReserva GetDtInfoReserva(){
        return new DtInfoReserva(this);
    }

    public void setNickProveedor(String nickProveedor) {
        this.nickProveedor = nickProveedor;
    }

    public String getNickProveedor() {
        return nickProveedor;
    }
    
}
