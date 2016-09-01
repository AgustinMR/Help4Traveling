package help4travelling;

/**
 *
 * @author Bruno
 */
public class Factory {
    
   private static Factory instance; //Singleton
   private Factory(){}  //Creator
   
   public static Factory GetInstance(){
       if (instance == null){
           instance = new Factory();
       }
       return instance;
   }
   
    public IControladorArticulo getIControladorArticulo() {
      return new ControladorArticulo();
    }

    public IControladorCategoria getIControladorCategoria() {
      return new ControladorCategoria();
    }

    public IControladorReserva getIControladorReserva() {
      return new ControladorReserva();
    }

    public IControladorUsuario getIControladorUsuario() {
      return new ControladorUsuario();
    }


 }
