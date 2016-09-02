/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

/**
 *
 * @author Agustin
 */
public class DtFecha {
    private int anio;
    private int mes;
    private int dia;
    
    DtFecha(int anio, int mes, int dia){
        this.anio = anio;
        this.mes = mes;
        this.dia =  dia;
    }
    
    //Contruye la fecha con un string de esta forma "yyyy/mm/dd"
    DtFecha(String bdformato){
        String[] parts = bdformato.split("/");
        this.anio = Integer.parseInt(parts[0]);
        this.mes = Integer.parseInt(parts[1]);
        this.dia = Integer.parseInt(parts[2]);
    }

    public int getAnio() {
        return this.anio;
    }

    public int getMes() {
        return this.mes;
    }

    public int getDia() {
        return this.dia;
    }    
}
