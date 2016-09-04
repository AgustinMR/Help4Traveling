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
 *
 * @author Nacho
 */
public class ManejadorCategoria {
    
    private HashMap<String, Categoria> categorias = new HashMap<String, Categoria>();
    private Categoria categ;
    private static ManejadorCategoria instance = null;
    
    public static ManejadorCategoria GetInstance(){
        if (instance==null){
            instance = new ManejadorCategoria();
            ManejadorSQL.GetInstance().cargarCategorias();
        }
        return instance;
    }
    
    public void IngresarCategoria (String nombre){
        Categoria catpad = this.BuscarCategoria("todas");
        if(catpad!=null){
            Categoria cat = new Categoria(nombre);
            categorias.put(cat.getNombre(), cat);
            catpad.AgregarCatHija(cat);
            ManejadorSQL.GetInstance().agregarCategoria(nombre, "todas");
        }
        Categoria cat = new Categoria(nombre);
        categorias.put(cat.getNombre(), cat);
    }
    
    public void IngresarCategoria (String nombre, String padre){
        Categoria catpad = this.BuscarCategoria(padre);
        if(catpad!=null){
            Categoria cat = new Categoria(nombre);
            categorias.put(cat.getNombre(), cat);
            catpad.AgregarCatHija(cat);
            ManejadorSQL.GetInstance().agregarCategoria(nombre, padre);
        }
    }

    public void IngresarCategoriaBD (String nombre, String padre){
        Categoria catpad = this.BuscarCategoria(padre);
        if(catpad==null){
            catpad = new Categoria(padre);
            categorias.put(catpad.getNombre(), catpad);
        }
        Categoria cat = this.BuscarCategoria(nombre);
        if(cat==null){
            cat = new Categoria(nombre);
            categorias.put(cat.getNombre(), cat); 
        }
        catpad.AgregarCatHija(cat);      
    }      
    
    public Categoria BuscarCategoria (String nombre){
        Categoria ret = null;
        boolean enc=false;
        if(this.categorias!=null){
            Iterator it = this.categorias.entrySet().iterator();
            while(it.hasNext()&&(enc==false)){
                Map.Entry e = (Map.Entry)it.next();
                if(e.getKey().equals(nombre)){
                    enc = true;
                    ret = (Categoria) e.getValue();
                }
            }
            if(enc==false){
                return null;
            }
        }else{
            return null;
        }
        return ret;
    }
    
     public ArrayList<DtCategoria> listarCategorias(){
        return listarCategoriasAux("todas", 0);        
    }
     
    public ArrayList<DtCategoria> listarCategoriasAux(String padre, int nivel){
        if (categorias.get(padre).getHijos() != null){
           ArrayList<DtCategoria> ArrayCategorias = new ArrayList<DtCategoria>();
           ArrayList<Categoria> ArrayHijos = categorias.get(padre).getHijos();
           for (int i = 0; i < ArrayHijos.size(); i++) {
               ArrayCategorias.add(new DtCategoria(ArrayHijos.get(i).getNombre(),padre,nivel));
               ArrayList<DtCategoria> hijo = listarCategoriasAux(ArrayHijos.get(i).getNombre(), nivel+1);
               if (hijo != null){
                   for (int j = 0; j < hijo.size(); j++) {
                       ArrayCategorias.add(hijo.get(j));
                   }
               }
           }        
           return ArrayCategorias;
        }else{
            return null;
        }
       
    }
    
    public ArrayList<DtServicio> listarServicios(String nombre){
        categ = categorias.get(nombre);
        return categ.listarServicios();
    }
     
    public DtServicio datosServicio(String nombreServ){
         return categ.listarServicios(nombreServ);
    }
    
    public void QuitarCategoria(String catName){
        //proximamente
    }
}
