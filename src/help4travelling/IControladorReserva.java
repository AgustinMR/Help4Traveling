package help4travelling;

/**
 *
 * @author Bruno
 */
public abstract interface IControladorReserva {
    public abstract boolean actualizarEstado(Estado e,String r);
    public abstract boolean CrearReserva(DtReserva dtRes);
}
