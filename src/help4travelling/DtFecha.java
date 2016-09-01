package help4travelling;

public class DtFecha {
    
    private int dia, mes, anio;
    
    public DtFecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public DtFecha(DtFecha otra) {
        this.anio = otra.getAnio();
        this.mes = otra.getMes();
        this.dia = otra.getDia();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
}
