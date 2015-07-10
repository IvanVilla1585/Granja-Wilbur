package Conexion;

import Utilidades.AsignarPerfil;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase pública, con la cual se administrara el CRUD de la tabla Reservaciones
 * perteneciente a la base de datos de la empresa Oncaribean.
 *
 * @version 1.0
 * @author Juan Esteban Acevedo Gallego.
 */
public class Conexion {

    /**
     * Variable conexion con atributos privada y estática de tipo
     * <code>Connection</code> con la cual se hará la conexión a la base de
     * datos de la empresa Oncarbean.
     */
    private static Connection conexion;

    /**
     * Variable statement con atributos privada y estática de tipo
     * <code>Statement</code> con la cual se harán las peticiones SQL a la base
     * de datos de la empresa Oncaribean.
     */
    private static Statement statement;

    /**
     * Variable resultSet con atributos privada y estática de tipo
     * <code>ResultSet</code> a la cual se le asignara el resultado arrojado por
     * la bas de datos de la empresa Oncaribean.
     */
    private static ResultSet resultSet;

    /**
     * Variable cantFilas con atributos privada y estática de tipo
     * <code>int</code> con la cual se hará la conexión a la base de datos de la
     * empresa Oncaribean.
     */
    private int cantFilas;

    /**
     * Constructor sin parámetros.
     *
     */
    public Conexion() {
    }

    /**
     * Método con el cual se hará la conexión con la base de datos Oracle de la empresa
     * Oncaribean.
     * 
     */
    public void conectar() {
        /**
         * Variable url de tipo <code>String</code> en la cual se
         * cargara la dirección del host local para la conexión a la base de
         * datos de la empresa Oncaribean.
         */
        String url;

        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            url = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion = DriverManager.getConnection(url, "jeag", "1234");
            statement = conexion.createStatement();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
    }
    
    public void cerrarConexion()    {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int validarUsuario(String user, String pass){
        String sql;

        try {
            
            conectar();
            
            sql = ("SELECT PERFIL FROM ASIG_PERFIL WHERE NOMBRE_USER = '"
                    + user + "' AND CONTRASENA = '" + pass + "'");

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                return resultSet.getInt("PERFIL");
            }
            
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return 0;
    }

    /**
     * Método para la inserción de datos nuevos a la base de datos de la empresa
     * Oncaribean.
     *
     * @param newReserva recibe un objeto de tipo <code>Reservas</code> con el
     * contenido de los datos a insertar.
     * @see <code>Reservas</code>
     */
    public void ingresarDatosTablaReservaciones(Reservas newReserva) {
        
        try {
            
            conectar();
            
            /**
             * Variable insertarDatos de tipo <code>PreparedStatement</code> en
             * la cual se cargara la petición a la base de datos para insertar
             * los datos.
             */
            PreparedStatement insertarDatos;

            insertarDatos = conexion.prepareStatement("INSERT INTO RESERVACIONES (COD_RESERV, FECHA_INI, "
                    + "FECHA_FIN, PAQUETE, CLIENTE) VALUES(?, ?, ?, ?, ?)");

            insertarDatos.setInt(1, newReserva.getCodReserv());
            insertarDatos.setDate(2, newReserva.getFechaIni());
            insertarDatos.setDate(3, newReserva.getFechaFin());
            insertarDatos.setInt(4, newReserva.getPaquete());
            insertarDatos.setInt(5, newReserva.getCliente());
            insertarDatos.executeUpdate();

            conexion.close();
            
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
    }

    /**
     * Método para modificar los datos existentes de un registro almacenado en
     * la base de datos de la empresa Oncaribean.
     *
     * @param modificarReserva recibe un objeto de tipo <code>Reservas</code>
     * con el contenido de los datos modificados para actualizar en la base de
     * datos.
     * @see <code>Reservas</code>
     */
    public void modificarDatosTablaReservaciones(Reservas modificarReserva) {
        
        try {
            
            conectar();
            
            /**
             * Variable modificarSQL de tipo <code>String</code> en
             * la cual se cargara la petición a la base de datos para insertar
             * los datos.
             */
            String modificarSQL;

            modificarSQL = ("UPDATE RESERVACIONES SET "
                    + "FECHA_INI = TO_DATE('" + modificarReserva.getFechaIni() + "','YYYY-MM-DD'), "
                    + "FECHA_FIN = TO_DATE('" + modificarReserva.getFechaFin() + "','YYYY-MM-DD'), "
                    + "PAQUETE = " + modificarReserva.getPaquete() + ", "
                    + "CLIENTE = " + modificarReserva.getCliente()
                    + "WHERE COD_RESERV = " + modificarReserva.getCodReserv());

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(modificarSQL);

            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
    }

    /**
     * Método para eliminar un registro especifico almacenado en la base de
     * datos de la empresa Oncaribean.
     *
     * @param codReserva recibe un dato <code>int</code> con el número
     * de la reserva a eliminar de la base de datos.
     */
    public void eliminarRegistro(int codReserva) {
        
        try {
            
            conectar();
            
            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM RESERVACIONES WHERE COD_RESERV = " + codReserva);

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(eliminarSQL);

            conexion.close();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
    }

    /**
     * Método para solicitar el número consecutivo inmediatamente siguiente al
     * último registro.
     *
     * @return un <code>int</code> con el numero para el nuevo registro.
     */
    public int codigoNuevoRegistro() {
        
        try {
            
            //SECUENCIA EN ORACLE *CONSULTAR*
            conectar();

            resultSet = statement.executeQuery("SELECT count(*) FROM RESERVACIONES");

            if (resultSet.next()) {
                cantFilas = resultSet.getInt("count(*)");
            } else {
                cantFilas = 0;
            }

            return cantFilas + 1;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
            
            return 0;
        }
    }

    public AsignarPerfil obtenerUsuarioPerf(int numDoc, int tDoc) {
        
        String nombres;
        String sql;
        AsignarPerfil usuario;
        
        try {            
            conectar();
            
            usuario = null;

            /*sql = ("SELECT AP.NUM_DOC, AP.NOMBRE_USER, AP.CONTRASENA, TD.NOM_TDOC, P.NOM_PERFIL, U.NOMBRES, U.APELLIDO1, "
                    + "U.APELLIDO2 FROM ASIG_PERFIL AP INNER JOIN TIPO_DOCUMENTO TD ON AP.TIPO_DOC = TD.COD_TDOC "
                    + "INNER JOIN PERFILES P ON AP.PERFIL = P.COD_PERF INNER JOIN USUARIOS U ON AP.NUM_DOC = U.NUM_DOC "
                    + "AND AP.TIPO_DOC = U.TIPO_DOC  WHERE AP.NUM_DOC = " + numDoc + " AND AP.TIPO_DOC = " + tDoc);*/
            
            sql = ("SELECT AP.NUM_DOC, AP.NOMBRE_USER, AP.CONTRASENA, AP.TIPO_DOC, AP.PERFIL, U.NOMBRES, U.APELLIDO1, "
                    + "U.APELLIDO2 FROM ASIG_PERFIL AP INNER JOIN USUARIOS U ON AP.NUM_DOC = U.NUM_DOC "
                    + "AND AP.TIPO_DOC = U.TIPO_DOC  WHERE AP.NUM_DOC = " + numDoc + " AND AP.TIPO_DOC = " + tDoc);
            
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                if (resultSet.getString("APELLIDO2") == null) {
                    nombres = resultSet.getString("NOMBRES") + " " + resultSet.getString("APELLIDO1");
                } else {
                    nombres = resultSet.getString("NOMBRES") + " " + resultSet.getString("APELLIDO1")
                            + " " + resultSet.getString("APELLIDO2");
                }

                usuario = new AsignarPerfil(
                        resultSet.getInt("NUM_DOC"),
                        resultSet.getInt("TIPO_DOC"),
                        nombres,
                        resultSet.getInt("PERFIL"),
                        resultSet.getString("CONTRASENA"));
            }

            return usuario;
            
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public ResultSet obtenerTipoDocumento(){
        
        String sql;
                
        try {
            conectar();
            
            sql = ("SELECT * FROM TIPO_DOCUMENTO ORDER BY NOM_TDOC");

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
           
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return resultSet;
    }
    
    public ResultSet obtenerPerfiles(){
        
        String sql;
                
        try {
            conectar();
            
            sql = ("SELECT * FROM PERFILES ORDER BY NOM_PERFIL");

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
           
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return resultSet;
    }
    
    public int obtenerCodigoTipoDocumento(String tDoc){
        return 0;
    }
    
    public int obtenerCodigoPerfil(String perfil){
        return 0;
    }

    /**
     * Método que retorna el resultado de una consulta a la base de datos de la
     * empresa Oncaribean.
     *
     * @return un <code>ResultSet</code> con la información consultada a la base
     * de datos.
     */
    public ResultSet listarReservas() {
        
        /**
         * Variable consultaSQL de tipo <code> String</code> a la cual se le
         * asignara la petición para la base de datos.
         */
        String consultaSQL;
                
        try {
            conectar();
            
            consultaSQL = ("SELECT R.COD_RESERV, R.FECHA_INI, R.FECHA_FIN, C.NOMBRE_CLI, C.APELLIDO1_CLI, "
                          + "C.APELLIDO2_CLI, CI.NOM_CIUDAD FROM RESERVACIONES R INNER JOIN CLIENTE C "
                          + "ON CLIENTE = ID_CLIENTE INNER JOIN PAQUETE P ON R.PAQUETE = P.COD_PAQUETE "
                          + "INNER JOIN HOTELES H ON P.HOTEL = H.COD_HOTEL INNER JOIN CIUDAD CI ON "
                          + "H.UBICACION = CI.COD_CIUDAD ORDER BY COD_RESERV");

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(consultaSQL);

            //conexion.close();
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return resultSet;
    }
}
