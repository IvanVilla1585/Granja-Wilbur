
package Conexion;

import java.sql.*;

/**
 * Clase pública encapsulada que guardara los datos de la tabla Reservaciones
 * consultados a la base de datos de la empresa Oncaribean, contiene sobre carga
 * de métodos en los constructores.
 *
 * Variable <code>private</code> a las que se accederan por
 * medio de los metodos <code>get</code>: codReserv de tipo <code>int</code>, la
 * cual se le asignara el código de la reserva; paquete de tipo
 * <code>int</code>, la cual se le asignara el código del paquete reservado;
 * cliente de tipo <code>int</code>, la cual se le asignara el número de
 * identificación del cliente reservante; nombres de tipo <code>String</code>,
 * la cual se le asignara los nombres y apelllidos del cliente reservante;
 * destino de tipo <code>String</code>, la cual se le asignara la ciudad de
 * destino del paquete reservado; fechaIni de tipo <code>java.sql.Date</code>,
 * la cual se le asignara la fecha de partida del viaje reservado; fechaFin de
 * tipo <code>java.sql.Date</code>, la cual se le asignara la fecha de regreso
 * del viaje reservado.
 *
 * @version 1.0
 * @author Juan Esteban Acevedo Gallego.
 */
public class Reservas {

    private int codReserv;    
    private int paquete;
    private int cliente;
    private String nombres;
    private String destino;
    private Date fechaIni;
    private Date fechaFin;

    /**
     * Constructor sin parametros.
     */
    public Reservas()
    {
    }
    
    /**
     * Constructor, instancia un objeto de la clase recibiendo como parámetro
     * los valores reales de la tabla reservaciones de la base de datos de la
     * empresa Oncaribean.
     *
     * @param codReserv de tipo <code>int</code>.
     *
     * @param fechaIni de tipo <code>java.sql.Date</code>.
     *
     * @param fechaFin de tipo <code>java.sql.Date</code>.
     *
     * @param paquete de tipo <code>int</code>.
     *
     * @param cliente de tipo <code>int</code>.
     */
    public Reservas(int codReserv, Date fechaIni, Date fechaFin, int paquete, int cliente)
    {
        this.codReserv = codReserv;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.paquete = paquete;
        this.cliente = cliente;
    }
    
    /**
     * Constructor, instancia un objeto de la clase recibiendo como parámetro
     * los valores consultados mediante Inner Join de la tabla reservaciones de
     * la base de datos de la empresa Oncaribean.
     *
     * @param codReserv de tipo <code>int</code>.
     *
     * @param fechaIni de tipo <code>java.sql.Date</code>.
     *
     * @param fechaFin de tipo <code>java.sql.Date</code>.
     *
     * @param destino de tipo <code>String</code>.
     *
     * @param nombres de tipo <code>String</code>.
     */
    public Reservas(int codReserv, Date fechaIni, Date fechaFin, String destino, String nombres)
    {
        this.codReserv = codReserv;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.destino = destino;
        this.nombres = nombres;
    }
    
    public int getCodReserv() {
        return codReserv;
    }

    public void setCodReserv(int codReserv) {
        this.codReserv = codReserv;
    }

    public int getPaquete() {
        return paquete;
    }

    public void setPaquete(int paquete) {
        this.paquete = paquete;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
