package help4travelling;

public class infoReserva {
    private DtFecha fechaIni;
    private DtFecha fechaFin;
    private int cantidad;
    private String provArt;
    private String nombreArt;
    private int idRes;
    
    /*public infoReserva(DtInfoReserva dtir, Articulo a, Reserva r){
        this.fechaIni = dtir.GetFechaIni();
        this.fechaFin = dtir.GetFechaFin();
        this.cantidad = dtir.GetCantidad();
        this.art = a;
        this.res = r;
    }*/
    
    public infoReserva(String provArt, String nombreArt, int idRes){
        this.provArt = provArt;
        this.nombreArt = nombreArt;
        this.idRes = idRes;
    }
    
    public int GetCantidad(){
        return this.cantidad;
    }
    
   /* public Articulo GetArticulo(){
        return this.art;
    }
    
    public Reserva GetReserva(){
        return this.res;
    }*/
    
    public DtFecha GetFechaIni(){
        return this.fechaIni;
    }
    
    public DtFecha GetFechaFin(){
        return this.fechaFin;
    }
    
    public void EnlazarReserva(Articulo a){
        this.provArt = a.prov;
        this.nombreArt = a.nombre;
    }    
    
    public void EnlazarReserva(Reserva r){
        this.idRes = r.GetId();
    }
    
    public DtInfoReserva GetDtInfoReserva(){
        return ManejadorSQL.GetInstance().devolverInfoReserva(this.idRes, this.nombreArt, this.provArt);
    }

    public String getNickProveedor() {
        return this.provArt;
    }
    
     public String getNombreArt() {
        return nombreArt;
    }

    public int getIdRes() {
        return idRes;
    }
       
     public void DesenlazarInfoReserva(){
        this.provArt = null;
        this.idRes = 0;
     }
}
