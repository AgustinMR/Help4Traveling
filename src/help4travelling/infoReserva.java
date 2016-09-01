package help4travelling;

public class infoReserva {
    private DtFecha fechaIni;
    private DtFecha fechaFin;
    private int cantidad;
    private Articulo art;
    private Reserva res;
    
    public infoReserva(DtInfoReserva dtir, Articulo a, Reserva r){
        this.fechaIni = dtir.GetFechaIni();
        this.fechaFin = dtir.GetFechaFin();
        this.cantidad = dtir.GetCantidad();
        this.art = a;
        this.res = r;
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
}
