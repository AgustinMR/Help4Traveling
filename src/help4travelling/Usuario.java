package help4travelling;

import java.io.Serializable;
import java.sql.Blob;

public abstract class Usuario implements Serializable {
    
     protected String nick;
     protected String clave;
     protected String nombre; 
     protected String apellido;
     protected String email; 
     protected DtFecha fechaN; 
     protected Blob[] avatar; 
     
     public abstract String getNickCliente();
     public abstract String getNickProveedor();
    
}
