
package help4travelling;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class ManejadorUsuario {
    private static ManejadorUsuario instancia=null;
    private static HashMap<String, Usuario> usuarios;
    
     private ManejadorUsuario(){
       usuarios=new HashMap<String, Usuario>();
    }
     
     public static ManejadorUsuario getinstance(){
        if (instancia==null){
            instancia = new ManejadorUsuario();
            //cargar HashMap usuarios de la base de datos
        }
        usuarios.clear();
        ArrayList<String> arrayUsu = ManejadorSQL.GetInstance().cargarClientes();
        for (int i = 0; i < arrayUsu .size(); i++) {
            Usuario u = new Cliente(arrayUsu.get(i));
            usuarios.put(u.getNickCliente(),u);
        }
        return instancia;
    }
     
     public List<String> listarClientes(){
         //Creo la lista a para devolver
         List<String> userCi = new ArrayList<String>();      
         //creo un iterador para recorrer las claves del mapa
         Iterator it = usuarios.keySet().iterator();
         
         while(it.hasNext())
            {
                //pide elemento
                String key = it.next().toString();
                //si es null lo descarta, si es algo lo guarda
                if(null==usuarios.get(key).getNickCliente())
                {
                    //nada
                }else {
                    userCi.add(usuarios.get(key).getNickCliente());
                    //agrega a la lista
                }

                }
         
      return  userCi;
  }
     
     public List<String> listarProveedores(){
         //Creo la lista a para devolver
         List<String> userCi = new ArrayList<String>();      
         //creo un iterador para recorrer las claves del mapa
         Iterator it = usuarios.keySet().iterator();
         
         while(it.hasNext())
            {
                //pide elemento
                String key = it.next().toString();
                //si es null lo descarta, si es algo lo guarda
                if(null==usuarios.get(key).getNickProveedor())
                {
                    //nada
                }else {
                    userCi.add(usuarios.get(key).getNickProveedor());
                    //agrega a la lista
                }

                }
         
      return  userCi;
  }
    public Cliente ObtenerCliente(String nameCli){
        return (Cliente)this.usuarios.get(nameCli);         
    }
    
   /* public void InstertarUsuario(Usuario u){
        this.usuarios.put(u.getNickCliente(), u);
    }*/
    
   /* public void InstertarProveedor(DtProveedor p){
        Proveedor newprov = new Proveedor(p);
        this.usuarios.put(p.getNick(), newprov);
        ManejadorSQL.GetInstance().agregarUsuario(p);
    }*/
    
    public void InstertarProveedor(DtProveedor p){
        Proveedor newprov = new Proveedor(p.getNick());
        this.usuarios.put(p.getNick(), newprov);
        ManejadorSQL.GetInstance().agregarUsuario(p);
    }
     
    /*public void InstertarCliente(DtCliente c){
        Cliente newcli = new Cliente(c);
        this.usuarios.put(c.getNick(), newcli);
        ManejadorSQL.GetInstance().agregarUsuario(c);
    }*/
    
    public void InstertarCliente(DtCliente c){
        Cliente newcli = new Cliente(c.getNick());
        this.usuarios.put(c.getNick(), newcli);
        ManejadorSQL.GetInstance().agregarUsuario(c);
    }
    
     public boolean ExisteUsuario(String nickUsu, String email){
         return this.usuarios.containsKey(nickUsu);
     }
    
}
