/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;        
import java.util.List;

/**
 *
 * @author tecnoinf
 */
public class help5test {

    /**
     * @param args the command line arguments
     */
                 
    public static void TestAltaUsuario(String nick){
        //1)La interfaz debe preguntarle al admin si quiere ingresar un cliente o proveedor
        //2)Recuperar todos los datos que ingrese el admin a travez de la interfaz
        //2.5)Recuperar la imagen y pasarla a tipo blob puede llegar a ser complicado, en ese caso postergar
        //3)Contruir un DtCliente o DtProveedor a partir de los datos recuperados
        //4)uso la funcion VerificarUsuario del ControladorUsuario, si devuelve true tiene que salir un aviso al admin
        //5)si al verificar devolvio true es porque ya existe otro usuario con ese nick creado antes, el usuario puede modificar los campos en la interfaz o cancelar
        //5)si corrigio los campos se corre el verificar devuelta
        //6)si verificar devolvio false uso la funcion AltaCliente o AltaProveedor del ControladorUsuario con el DataType de parametro para ingrear el usuario
        //7)al usar la funcion AltaCliente se debe persistir en la base de datos el objeto
        
        
        //optional)esta la funcion ModificarUsuario que despues de dar un alta, modifica ese mismo usuario con el DataType que le pasas por parametro
        
        //nora) la funcion AltaUsuario necesita dos parametros, pero el email enrealidad esta pintado, esta ahi porque la letra dice que es unico en el usuario pero aun no esta implementado eso (y no creo que se vaya a implementar...)
        
        //Mini test
        
        //A)Creo un DtCliente para pasarle de parametro a la funcion que hace el alta ( usar un contructor completo, no este)
        
        
        DtFecha fech = new DtFecha(2016,11,2);
        System.out.println(fech.getAnio());
        DtCliente dataCli = new DtCliente(nick, "nombre", "apellido", "email", fech ,null);
        ControladorUsuario CU = new ControladorUsuario();
        
        //B)Verifico que no exista el usuario antes
        if (CU.VerificarUsuario(dataCli.getNick(), dataCli.getEmail()) == false){
            System.out.println("El no existe en el sistema");
        }
        
        //C)Doy el alta a un cliente
        CU.AltaCliente(dataCli);
        
        //D)Verifico que fuera insertado efectivamente el cliente de la parte C
        if (CU.VerificarUsuario(dataCli.getNick(), dataCli.getEmail()) == true){
            System.out.println("El usuario ya existe en el sistema");
        }
        
        //E)Creo otro dt para modificar el ingresado en la parte C)
       /* DtCliente dataCli2 = new DtCliente("nick2", "nombre2", "apellido2", "email2", new DtFecha(2017,10,3),null);
        
        //F)Modifico el usuario en memoria ingresado en la parte C
        CU.ModificarUsuario(dataCli2);
        */
    }
    
    
     public static void TestAltaProvedor(String nick){
        DtFecha fech = new DtFecha(1997,1,3);
        System.out.println(fech.getAnio());
        DtProveedor dataProv = new DtProveedor(nick, "nombre2", "apellido2", "email2", fech ,null, "nombreEmpresa", "url", null);
        ControladorUsuario CU = new ControladorUsuario();
        
        //B)Verifico que no exista el usuario antes
        if (CU.VerificarUsuario(dataProv.getNick(), dataProv.getEmail()) == false){
            System.out.println("El no existe en el sistema");
        }
        
        //C)Doy el alta a un cliente
        CU.AltaProvedor(dataProv);
        
        //D)Verifico que fuera insertado efectivamente el cliente de la parte C
        if (CU.VerificarUsuario(dataProv.getNick(), dataProv.getEmail()) == true){
            System.out.println("El usuario ya existe en el sistema");
        }
    }
     
     public static void TestAltaCategoria(String nombre, String nombrePadre){
        ControladorCategoria CC = new ControladorCategoria();
        //CC.IngresarCategoria(nombre, nombrePadre);
        ArrayList<DtCategoria> ac = CC.listarCategorias();
        for (int i = 0; i < ac.size(); i++) {
            System.out.println(ac.get(i).getNombre() + " " + ac.get(i).getNombrePadre());
        }
    }
    
    public static void TestVerInfoCliente(String nick){
        //Sigo estrictamente el DSS Ver informacion proveedor y cliente
        //La interfaz puede verificar si existe el usuario con la funcion VerificarUsuario del controladorUsuario
        
        //inserto algunos clientes para probar
        
        
        TestAltaUsuario("ale");
        
        TestAltaUsuario("ale2");
        TestAltaUsuario("ale3");
        
        //Op 1
        ControladorUsuario CU = new ControladorUsuario();
        List<String> lcli;
        lcli = CU.listarClientes();
        
        //test de Op1
        System.out.println("Usuarios en el sistema: ");
        lcli.forEach(i -> System.out.println(i));
        
        //Op 2
        DtCliente datac = CU.datosCliente(nick);
        
        //test de Op 2
        System.out.println("Datos de usuario elegido:");
        System.out.println("Nick Cliente: " + datac.getNick());
        System.out.println("Nombre Cliente: " + datac.getNombre());
        System.out.println("Apellido Cliente: " + datac.getApellido());
        System.out.println("Avatar Cliente: " + datac.getAvatar());
        
        //op3
        //depende de otros casos de uso, 
        
    }
    /*
    public static void TestVerInfoProveedor(String nick){
        //Sigo el DSS de TestVerInfoCliente
        
        //Creo un proveedor
        ControladorUsuario CU = new ControladorUsuario();
        DtProveedor dataPro = new DtProveedor(nick, "Raz", "Puti", "mail@gmail.com", new DtFecha(01,01,2016), null, "evil corps", "Deep web", null);
        CU.AltaProvedor(dataPro);
        
        List<String> lpro;
        System.out.println("Proveedores en el sistema: ");
        lpro = CU.listarProveedores();
        lpro.forEach(i -> System.out.println(i));
        
        DtProveedor retPro = CU.datosProveedor(nick);
        System.out.println("Datos de usuario elegido:");
        System.out.println("Nick Proveedor " + retPro.getNick());
        System.out.println("Nombre Provee: " + retPro.getNombre());
        System.out.println("Apellido Prove: " + retPro.getApellido());
        System.out.println("Avatar Prov: " + retPro.getAvatar());        
    
        //Usa otro caso de uso asi que la wea fome 50%
    }
*/
    
    public static void main(String[] args) {
        
        if (ManejadorSQL.GetInstance().init("192.168.10.132") == true)
             System.out.println("init");
        
        //TestAltaUsuario("ale4");
        
        //TestAltaProvedor("ale5");
        
        TestAltaCategoria("holaaaa", "todas");
        
        // TestVerInfoProveedor("Mr Proveedor");
        
        
    }
}