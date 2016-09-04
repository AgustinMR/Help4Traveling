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
import java.util.Calendar;
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
        CU.AltaProveedor(dataProv);
        
        //D)Verifico que fuera insertado efectivamente el cliente de la parte C
        if (CU.VerificarUsuario(dataProv.getNick(), dataProv.getEmail()) == true){
            System.out.println("El usuario ya existe en el sistema");
        }
    }
     
     public static void TestAltaReserva(){
        ArrayList<DtInfoReserva> arrayInfoRes = new ArrayList<DtInfoReserva>();
        DtFecha fech2 = new DtFecha(2016,1,7);
        DtFecha fech21 = new DtFecha(2017,1,7);
        arrayInfoRes.add(new DtInfoReserva("Euro-Car-2", 2, "moody", fech21, fech2, 500f));
        DtFecha fech3 = new DtFecha(2017,1,25);
        DtFecha fech31 = new DtFecha(2017,1,20);
        arrayInfoRes.add(new DtInfoReserva("Euro-Car-3", 1, "moody", fech31, fech3, 600f));
        
        
        Calendar calendario = Calendar.getInstance();
        DtFecha fech = new DtFecha(calendario.get(Calendar.YEAR),calendario.get(Calendar.MONTH)+1,calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(fech.getAnio() + " " + fech.getMes() + " " + fech.getDia());
        
        
        DtReserva dataProv = new DtReserva(Estado.Registrada, fech, arrayInfoRes , "eWatson", 2600);
        ControladorReserva CR = new ControladorReserva();
        
        //System.out.println(arrayInfoRes.get(0).getPrecioArticulo());
        
        CR.CrearReserva(dataProv);
        System.out.println("Crear 1");
        CR.ReservarArticulo(arrayInfoRes.get(0));
        System.out.println("Crear 2");
        CR.ReservarArticulo(arrayInfoRes.get(1));
        System.out.println("Crear 3");
        CR.ConfirmarReserva(true);
        System.out.println("Done");
        
    }
     
     
     
     public static void TestAltaServicio (){
        ControladorArticulo CA = new ControladorArticulo();
        //CC.IngresarCategoria(nombre, nombrePadre);
        ArrayList<String> arrayCat = new ArrayList<String>();
        arrayCat.add("Automóviles");
        arrayCat.add("Cruceros");
        DtServicio serv = new DtServicio("nombre4", "tCook", 500, "hola que tal", arrayCat, "Montevideo", "Valencia");
        boolean b = CA.insertarServicio(serv);
        System.out.println(b);
        for (int i = 0; i < CA.ListarServicios().size(); i++) {
            System.out.println(CA.ListarServicios().get(i).getNombre());
        }
    }
     
     public static void TestAltaCategoria (){
        ControladorCategoria CC = new ControladorCategoria();
        //CC.IngresarCategoria("holaaaaaaa", "todas");
        ArrayList<DtCategoria> ac = CC.listarCategorias();
        for (int i = 0; i < ac.size(); i++) {
            System.out.println(ac.get(i).getNombre() + " " + ac.get(i).getNombrePadre());
        }
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
    public static void TestActualizarReserva (){
        ControladorReserva CR = new ControladorReserva();
        ArrayList<DtReserva> ar = CR.listarReservas();
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).GetId() + " " + ar.get(i).getPrecio());
        }
        CR.actualizarEstado(Estado.Facturada, ar.get(1).GetId());
    }
    
      public static void TestVerInfoCliente(){
        ControladorUsuario CU = new ControladorUsuario();
        List<String> listCli = CU.listarClientes();
        
        DtCliente datosCli = CU.datosCliente(listCli.get(0));
        System.out.println("Nick Proveedor " + datosCli.getNick());
        System.out.println("Nombre Provee: " + datosCli.getNombre());
        System.out.println("Apellido Prove: " + datosCli.getApellido());
        System.out.println("Email: " + datosCli.getEmail());
        
        System.out.println("Reservas: " + datosCli.getReservas());
        
       /* System.out.println("\nURL " + datosCli.getUrl());
        System.out.println("Nombre Emp: " + datosCli.getNombreEmpresa());
        System.out.println("Nombre serv 1: " + datosCli.getServicio().get(0).getNombre());
        */
        
        ControladorReserva CR = new ControladorReserva();
        DtReserva dtRes = CR.datosReservas(datosCli.getReservas().get(0));
        
        System.out.println("Reserva" + datosCli.getReservas().get(0) + " : " + dtRes.GetId());
        System.out.println("Reserva" + datosCli.getReservas().get(0) + " : " + dtRes.GetCliente());
        System.out.println("Reserva" + datosCli.getReservas().get(0) + " : " + dtRes.GetEstado());
        System.out.println("Reserva" + datosCli.getReservas().get(0) + " : " + dtRes.getPrecio());
        System.out.println("Reserva" + datosCli.getReservas().get(0) + " : " + dtRes.GetFecha().getAnio() + "/" + dtRes.GetFecha().getMes() + "/" + dtRes.GetFecha().getDia());
        
        
        ArrayList<DtInfoReserva> arrayInfoRes= CR.ObtenerInfoArticulosReservados(datosCli.getReservas().get(1));
        
        for (int i = 0; i < arrayInfoRes.size(); i++) {
            System.out.println("InfoRes  " + arrayInfoRes.get(i).GetNombreArticulo() + " : " + arrayInfoRes.get(i).GetNombreArticulo());
            System.out.println("InfoRes  " + arrayInfoRes.get(i).GetNombreArticulo() + " : " + arrayInfoRes.get(i).GetCantidad());
            System.out.println("InfoRes  " + arrayInfoRes.get(i).GetNombreArticulo() + " : " + arrayInfoRes.get(i).getNickProveedor());
            System.out.println("InfoRes  " + arrayInfoRes.get(i).GetNombreArticulo() + " : " + arrayInfoRes.get(i).getPrecioArticulo());
        }
        
    }
      
    public static void TestVerInfoProveedor(){
        ControladorUsuario CU = new ControladorUsuario();
        List<String> listCli = CU.listarProveedores();
        
        DtProveedor datosCli = CU.datosProveedor(listCli.get(0));
        System.out.println("Nick: " + datosCli.getNick());
        System.out.println("Nombre: " + datosCli.getNombre());
        System.out.println("Apellido: " + datosCli.getApellido());
        System.out.println("Email: " + datosCli.getEmail());
        
        //System.out.println("Reservas: " + datosCli.getReservas());
        
        System.out.println("\nURL " + datosCli.getUrl());
        System.out.println("Nombre Emp: " + datosCli.getNombreEmpresa());
        System.out.println("Nombre serv 1: " + datosCli.getServicio().get(0).getNombre());
        
        ControladorArticulo CA = new ControladorArticulo();
        
        for (int i = 0; i < datosCli.getServicio().size(); i++) {
            System.out.println("\nServicios" );
            DtServicio dtServ = CA.datosServicio(datosCli.getServicio().get(i).getNombre(), datosCli.getNick());
            System.out.println(dtServ.getNombre());
            System.out.println(dtServ.getDescripcion());
            System.out.println(dtServ.getPrecio());
            System.out.println(dtServ.getCiudadOrigen());
            System.out.println(dtServ.getCiudadDestino());
        }
        
        
    }
    
    public static void TestVerInfoServicio(){
        ControladorCategoria CU = new ControladorCategoria();    
    }
    
    
    public static void main(String[] args) {
        
        if (ManejadorSQL.GetInstance().init("192.168.10.132") == true)
             System.out.println("init");
        
        //CASO1//ok//TestAltaUsuario("ale4");
        //CASO1//ok//TestAltaProvedor("ale5");
        
        //CASO2//ok//TestAltaCategoria();
        
        //CASO3//ok//TestAltaServicio();
        
        //CASO6//ok//TestAltaReserva();
        
        //CASO7//ok//TestActualizarReserva();
        
        //CASO9//ok//TestVerInfoCliente();
        
        //CASO10//ok//TestVerInfoProveedor();
        
        //CASO11//
        TestVerInfoServicio();
        
        
        // TestVerInfoProveedor("Mr Proveedor");
        
        
        /*ManejadorCiudad.GetInstance();
        System.out.println(ManejadorCiudad.GetInstance().BuscarCiudad("Montevideo").getNombre());
*/
        
    }
}