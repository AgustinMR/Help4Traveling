/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.util.Set;
import java.util.HashSet;        

/**
 *
 * @author tecnoinf
 */
public class help5test {

    /**
     * @param args the command line arguments
     */
    
    public static void TestRealizarReserva(int idReserva){
        //Preparacion para caso Alta Reserva**********************
        
        //Creacion DtReserva
        Estado es = Estado.Registrada;
        String nickCliente = "Pmoretto";
        DtReserva dr = new DtReserva(idReserva, es, nickCliente);
        
        //Creacion usuario-cliente
        Cliente c = new Cliente("Pmoretto", "Pedro");
        c.setNombre("Pedro");
        c.setApellido("Moretto");
        c.setNick("Pmoretto");        
                        
        //Insertar cliente
        ManejadorUsuario manUsu = ManejadorUsuario.getinstance();
        manUsu.InstertarCliente(c);
        
        //Obtener cliente de coleccion
        Cliente cli = manUsu.ObtenerCliente("Pmoretto");
        System.out.println(cli.getNick());
        
        //Creo Articulo
        float precio = 200.0f;
        Servicio sertest = new Servicio("Vuelo", "rapido", precio);
        
        //Inserto Articulo
        ManejadorArticulo manArt = ManejadorArticulo.GetInstance();
        manArt.AgregarServicio(sertest);        
        
        //Creo InfoReserva
        DtInfoReserva dtretest = new DtInfoReserva(idReserva, "Vuelo", 2);
        
        //Test de Caso Alta Reserva*******************************        
        System.out.println("Arranca caso 1");        
        
        //Primera operacion
        ControladorReserva CR = new ControladorReserva();
        CR.CrearReserva(dr);
        
        //Segunda operacion
        CR.ReservarArticulo(dtretest);
        
        //Tercera operacion
        CR.ConfirmarReserva(true);
        
        //Verificacion de caso Alta Reserva
        ManejadorReserva manRes = ManejadorReserva.GetInstance();
        Reserva restest = manRes.ObtenerReserva(idReserva);
        System.out.println(restest.GetEstado());
        System.out.println(restest.GetCliente().getNick());
        
        System.out.println("Insercion de InfoReserva");
        Set infoset = restest.GetInfoReservas();
        infoset.forEach(i -> System.out.println(((infoReserva)i).GetCantidad()));
    } 
    
    public static void TestMostrarDatosReserva(int idReserva){
        //Test de Mostrar Datos Reserva
        
        //Test de operacion 1
        ControladorReserva CR = new ControladorReserva();
        Set keysReser;
        keysReser = CR.ListarNroReservas();
        
        System.out.println("idReservas"); 
        keysReser.forEach(System.out::println);

        //Test de operacion 2
        DtReserva datosReserva = CR.ObtenerDatosReserva(idReserva);
        System.out.println(datosReserva.GetCliente());
        
        //Test de operacion 3
        System.out.println("op3---");
        Set arRes = CR.ObtenerInfoArticulosReservados();
        System.out.println("op3---2");
        arRes.forEach(i -> System.out.println(((DtInfoReserva)i).GetNombreArticulo()));
    }
    
    public static void TestAltaServicio(String nombre){
        //Creo DtServicio con los datos para crear el servicio
        DtServicio dtSer = new DtServicio(nombre, 11.0f, "hardcoderino");
        
        //Test de crear servicio
        ControladorArticulo CA = new ControladorArticulo();
        CA.CrearServicio(dtSer);
        
        //Verificar que este insertado Servicio
        System.out.println("Test AltaSer1:");
        Servicio sertest = ManejadorArticulo.GetInstance().BuscarServicio("Anta");
        System.out.println(sertest.GetNombre());
    }
    
    public static void main(String[] args) {
        //TestRealizarReserva(1);
        //TestRealizarReserva(2);
        
        //TestMostrarDatosReserva(1);
        
        //TestAltaServicio("Anta");
    }
}