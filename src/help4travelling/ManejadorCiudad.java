/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Nacho
 */
public class ManejadorCiudad {
    
    private static HashMap<String, Ciudad> ciudades = new HashMap<String, Ciudad>();
    private static ManejadorCiudad instance = null;
    
    public static ManejadorCiudad GetInstance(){
        if (instance==null){
            instance = new ManejadorCiudad();
        }
        ciudades.clear();
        ArrayList<String> arrayCiu = ManejadorSQL.GetInstance().cargarCiudades();
        for (int i = 0; i < arrayCiu.size(); i++) {
            ciudades.put(arrayCiu.get(i),new Ciudad(arrayCiu.get(i)));
        }
        return instance;
    }
    
    public Ciudad BuscarCiudad(String City){
        return (Ciudad)this.ciudades.get(City);
    }
    
    public ArrayList<String> listaDeCiudades(){
        ArrayList<String> arrayCiu = new ArrayList<String>();
        for (String name: ciudades.keySet()) { 
            arrayCiu.add(name);
        }
        return arrayCiu;
    }
}
