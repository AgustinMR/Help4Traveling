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
    
    private Map ciudades = new HashMap<String, Ciudad>();
    private static ManejadorCiudad instance = null;
    
    public static ManejadorCiudad GetInstance(){
        if (instance==null)
            instance = new ManejadorCiudad();
        return instance;
    }
    
    public Ciudad BuscarCiudad(String City){
        return (Ciudad)this.ciudades.get(City);
    }
}
