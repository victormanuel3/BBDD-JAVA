package Modelo;

import Excepciones.SQLPersonasException;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import Modelo.Vehiculo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class SQL {

    //Variables para la conexión segura contra el servidor (sin especificar DDBB)
    private final String JDBC_URL = "jdbc:mysql://localhost:3306";
    private final String JDBC_COMMU_OPT = "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private final String JDBC_USER = "root";
    private final String JDBC_PASSWORD = "";

    //Especificamos la base de Datos
    private final String JDBC_DDBB = "personasBBDD";
    private final String JDBC_TABLE_PERSONAS = "personas";
    private final String JDBC_TABLE_VEHICULOS = "vehiculos";
    private final String JDBC_DDBB_TABLE_PERSONAS = JDBC_DDBB + "." + JDBC_TABLE_PERSONAS;
    private final String JDBC_DDBB_TABLE_VEHICULOS = JDBC_DDBB + "." + JDBC_TABLE_VEHICULOS;

    //Variables para las consultas SQL
    // INSERT PERSONA
    private final String SQL_INSERT_PERSONA = "INSERT INTO " + JDBC_DDBB_TABLE_PERSONAS
            + " (DNI, id_cliente, id_empleado, nombre, genero, edad, direccion, fechaRegistro, vip, sueldo, vehiculo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    // INSERT VEHICULO
    private final String SQL_INSERT_VEHICULO = "INSERT INTO " + JDBC_DDBB_TABLE_VEHICULOS
            + " (matricula, tipo, color) VALUES (?, ?, ?);";

    //--------------------------------------------------------------------------------------------
    //UPDATE CLIENTE
    private final String SQL_UPDATE_CLIENTE = "UPDATE " + JDBC_DDBB_TABLE_PERSONAS + " SET nombre = ?, genero = ?, edad = ?, direccion = ?, vip = ?, vehiculo = ? WHERE (DNI = ?);";
    //UPDATE EMPLEADO
    private final String SQL_UPDATE_EMPLEADO = "UPDATE " + JDBC_DDBB_TABLE_PERSONAS + " SET nombre = ?, genero = ?, edad = ?, direccion = ?, sueldo = ?, vehiculo = ? WHERE (DNI = ?);";
    //UPDATE VEHICULO
    private final String SQL_UPDATE_VEHICULO = "UPDATE " + JDBC_DDBB_TABLE_VEHICULOS + " SET color = ?, tipo = ? WHERE (matricula = ?);";
    //--------------------------------------------------------------------------------------------
    private final String SQL_DELETE = "DELETE FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE DNI = ?";
    //--------------------------------------------------------------------------------------------
    //Buscar por nombre
    private final String SQL_SELECT_NOMBRE = "SELECT * FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE nombre = ?";
    //Buscar por DNI
    private final String SQL_SELECT_DNI = "SELECT * FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE DNI = ?";
    //Verificar si el DNI ya existe
    private final String SQL_SELECT_DNI_EXISTENTE = "SELECT COUNT(*) FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE DNI = ?";
    //Verificar si el ID_CLIENTE ya existe
    private final String SQL_SELECT_ID_CLIENTE_EXISTENTE = "SELECT COUNT(*) FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE id_cliente = ?";
    //Verificar si el ID_EMPLEADO ya existe
    private final String SQL_SELECT_ID_EMPLEADO_EXISTENTE = "SELECT COUNT(*) FROM " + JDBC_DDBB_TABLE_PERSONAS + " WHERE id_empleado = ?";
    //Verificar si la matrícula ya existe
    private final String SQL_SELECT_MATRICULA_EXISTENTE = "SELECT COUNT(*) FROM " + JDBC_DDBB_TABLE_VEHICULOS + " WHERE matricula = ?";

    //-------------------------------------------------------------------------------------------------------------------------------------
    private void createDB(Connection conn) throws SQLException {
        //Sentencia SQL que crea la BBDD si no existe en el servidor
        String instruction = "create database if not exists " + JDBC_DDBB + ";";
        Statement stmt = null;
        stmt = conn.createStatement();
        //La clase Statemen nos permite ejecutar sentencias SQL
        stmt.executeUpdate(instruction);
        //Liberamos los recursos de la comunicación   
        stmt.close();
    }

    private void createTableVehiculos(Connection conn) throws SQLException {
        String query = "create table if not exists " + JDBC_DDBB + "." + JDBC_TABLE_VEHICULOS + "("
                + "matricula varchar(7) primary key not null,"
                + "tipo varchar(50),"
                + "color varchar(50)"
                + ");";
        Statement stmt = null;
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
        //Liberamos los recursos de la comunicación   
        //stmt.close();
    }

    private void createTablePersonas(Connection conn) throws SQLException {
        String query = "create table if not exists " + JDBC_DDBB + "." + JDBC_TABLE_PERSONAS + "("
                + "DNI char(9) primary key not null,"
                + "id_cliente int(3),"
                + "id_empleado int(3),"
                + "nombre varchar(50),"
                + "genero char(1),"
                + "edad int,"
                + "direccion varchar(50),"
                // -------------------------
                + "fechaRegistro date,"
                + "vip boolean,"
                // -------------------------
                + "sueldo double,"
                // -------------------------
                + "vehiculo varchar(7),"
                + "FOREIGN KEY (vehiculo) REFERENCES " + JDBC_DDBB_TABLE_VEHICULOS + "(matricula)"
                + ");";

        Statement stmt = null;
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
        //Liberamos los recursos de la comunicación   
        stmt.close();
    }

    public Connection connect() throws SQLPersonasException {
        Connection conn = null;
        try {
            //Esta línea no es necesaria, excepto en algunas aplicaciones WEB
            //En aplicaciones locales como esta no sería necesaria
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //getConnection necesita la BBDD, el usuario y la contraseña
            conn = DriverManager.getConnection(JDBC_URL + JDBC_COMMU_OPT, JDBC_USER, JDBC_PASSWORD);
            createDB(conn);
            createTableVehiculos(conn);
            createTablePersonas(conn);
//        } catch (ClassNotFoundException ex) {
//           ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            System.out.println((ex.getMessage()));
            //ex.printStackTrace(System.out);
            throw new SQLPersonasException("Can not connect or create database with tables: " + JDBC_DDBB);
        }
        return conn;
    }

    public void disconnect(Connection conn) throws SQLPersonasException {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                throw new SQLPersonasException("Can not disconnect from database " + JDBC_DDBB);
            }
        }
    }

    public boolean idEmpleadoExistente(int idEmpleado) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        boolean existe = false;

        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_SELECT_ID_EMPLEADO_EXISTENTE);
            instruction.setInt(1, idEmpleado);
            rs = instruction.executeQuery();

            if (rs.next()) {
                existe = rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Error checking Empleado ID in the database");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Error closing resources after checking Empleado ID");
            }
        }
        return existe;
    }

    public boolean idClienteExistente(int idCliente) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        boolean existe = false;

        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_SELECT_ID_CLIENTE_EXISTENTE);
            instruction.setInt(1, idCliente);
            rs = instruction.executeQuery();

            if (rs.next()) {
                existe = rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Error checking Cliente ID in the database");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Error closing resources after checking Cliente ID");
            }
        }
        return existe;
    }

    public boolean DNIyaexistente(String DNI) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        boolean existe = false;

        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_SELECT_DNI_EXISTENTE);
            instruction.setString(1, DNI);
            rs = instruction.executeQuery();

            if (rs.next()) {
                existe = rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Error checking DNI in the database");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Error closing resources after checking DNI");
            }
        }
        return existe;
    }

    public int insertPersona(Persona p) throws SQLPersonasException {
        Connection conn = null;
        //La clase PreparedStatement también permite ejecutar sentencias SQL
        //pero con mayor flexibilidad
        PreparedStatement instruction = null;
        int registers = 0;
        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_INSERT_PERSONA);
            if (p instanceof Cliente) {
                instruction.setString(1, p.getDNI());
                instruction.setInt(2, ((Cliente) p).getIdCliente());
                instruction.setNull(3, Types.INTEGER);
                instruction.setString(4, p.getNombre());
                instruction.setString(5, String.valueOf(p.getGenero()));
                instruction.setInt(6, p.getEdad());
                instruction.setString(7, p.getDireccion());
                // OBTENGO LA FECHA REGISTRO ------------------------------------------------
                LocalDate fechaRegistro = ((Cliente) p).getFechaRegistro();
                java.sql.Date fechaRegistroSQL = java.sql.Date.valueOf(fechaRegistro);
                //---------------------------------------------------------------------------
                instruction.setDate(8, fechaRegistroSQL);
                instruction.setBoolean(9, ((Cliente) p).isVip());
                instruction.setNull(10, Types.DOUBLE);
                if (p.getV() != null) {
                    instruction.setString(11, p.getV().getMatricula());
                } else {
                    instruction.setNull(11, Types.VARCHAR);
                }
            } else if (p instanceof Empleado) {
                instruction.setString(1, p.getDNI());
                instruction.setNull(2, Types.INTEGER);
                instruction.setInt(3, ((Empleado) p).getIdEmpleado());
                instruction.setString(4, p.getNombre());
                instruction.setString(5, String.valueOf(p.getGenero()));
                instruction.setInt(6, p.getEdad());
                instruction.setString(7, p.getDireccion());
                instruction.setNull(8, Types.DATE);
                instruction.setNull(9, Types.BOOLEAN);
                instruction.setDouble(10, ((Empleado) p).getSueldo());
                if (p.getV() != null) {
                    instruction.setString(11, p.getV().getMatricula());
                } else {
                    instruction.setNull(11, Types.VARCHAR);
                }
            }
            registers = instruction.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new SQLPersonasException("Can not write to database (DAO_Controller.DAOSQL.insert)");
        } finally {
            try {
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database write process (DAO_COntroller.DAOSQL.insert)");
            }
        }
        //Devolvemos la cantidad de registros afectados, en nuestro caso siempre uno
        return registers;
    }

    public int insertVehiculo(Vehiculo v) throws SQLPersonasException {
        Connection conn = null;
        //La clase PreparedStatement también permite ejecutar sentencias SQL
        //pero con mayor flexibilidad
        PreparedStatement instruction = null;
        int registers = 0;
        try {
            conn = connect();
            //instruction = conn.prepareStatement(SQL_INSERT); <-----------------------
            instruction = conn.prepareStatement(SQL_INSERT_VEHICULO);
            instruction.setString(1, v.getMatricula());
            instruction.setString(2, v.getTipo());
            instruction.setString(3, v.getColor());

            registers = instruction.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLPersonasException("Can not write to database (DAO_COntroller.DAOSQL.insert)");
        } finally {
            try {
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database write process (DAO_COntroller.DAOSQL.insert)");
            }
        }
        //Devolvemos la cantidad de registros afectados, en nuestro caso siempre uno
        return registers;
    }

    public boolean matriculaExistente(String matricula) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        boolean existe = false;
        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_SELECT_MATRICULA_EXISTENTE);
            instruction.setString(1, matricula);
            rs = instruction.executeQuery();
            if (rs.next()) {
                existe = rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Error checking if vehicle exists (DAO_Controller.DAOSQL.matriculaExistente)");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Can not close database read process (DAO_Controller.DAOSQL.matriculaExistente)");
            }
        }
        return existe;
    }

    public Vehiculo getVehiculoByMatricula(String matricula) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        Vehiculo v = null;
        try {
            conn = connect();
            instruction = conn.prepareStatement("SELECT * FROM " + JDBC_DDBB_TABLE_VEHICULOS + " WHERE matricula = ?");
            instruction.setString(1, matricula);
            rs = instruction.executeQuery();
            if (rs.next()) {
                v = new Vehiculo(rs.getString("matricula"), rs.getString("tipo"), rs.getString("color"));
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Error retrieving vehicle by matricula (DAO_Controller.DAOSQL.getVehiculoByMatricula)");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Can not close database read process (DAO_Controller.DAOSQL.getVehiculoByMatricula)");
            }
        }
        return v;
    }

    public Persona readByDNI(Persona p) throws SQLPersonasException {
        Persona persona = null;
        Vehiculo v = null;
        // ejecutar query personas
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        try {
            conn = connect();
            String PersonaQuery = SQL_SELECT_DNI;
            instruction = conn.prepareStatement(PersonaQuery);
            instruction.setString(1, p.getDNI());
            rs = instruction.executeQuery();
            while (rs.next()) {
                String DNI = rs.getString("DNI");
                String nombre = rs.getString("nombre");
                char genero = rs.getString("genero").charAt(0);
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String vehiculoMatricula = rs.getString("vehiculo"); //VEHICULO
                //  Obtenemos el vehiculo --------------------------------------------------------------------------------
                if (vehiculoMatricula != null && !vehiculoMatricula.isEmpty()) {
                    v = getVehiculoByMatricula(vehiculoMatricula);
                }
                // ----------------------------------------------------------------------------------------------------
                if (rs.getInt("id_cliente") != 0) {
                    int id_cliente = rs.getInt("id_cliente");
                    boolean vip = rs.getBoolean("vip");
                    Date fechaRegistroSQL = rs.getDate("fechaRegistro");
                    LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
                    //-----------------------------------------------------
                    persona = new Cliente(id_cliente, fechaRegistro, vip, DNI, nombre, genero, edad, direccion, v);
                } else if (rs.getInt("id_empleado") != 0) {
                    int id_empleado = rs.getInt("id_empleado");
                    double sueldo = rs.getDouble("sueldo");
                    //-----------------------------------------------------
                    persona = new Empleado(id_empleado, sueldo, DNI, nombre, genero, edad, direccion, v);
                }

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new SQLPersonasException("Can not read from database (DAO_COntroller.DAOSQL.read)");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database read process (DAO_COntroller.DAOSQL.read)");
            }
        }
        return persona;
    }

    public List<Persona> readByName(String buscar) throws SQLPersonasException {
        ArrayList<Persona> personas = new ArrayList<>();
        Persona persona = null;
        Vehiculo v = null;
        // ejecutar query personas
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;
        try {
            conn = connect();
            String PersonaQuery = SQL_SELECT_NOMBRE;
            instruction = conn.prepareStatement(PersonaQuery);
            instruction.setString(1, buscar);
            rs = instruction.executeQuery();
            while (rs.next()) {
                String DNI = rs.getString("DNI");
                String nombre = rs.getString("nombre");
                char genero = rs.getString("genero").charAt(0);
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String vehiculoMatricula = rs.getString("vehiculo"); //VEHICULO
                //  Obtenemos el vehiculo --------------------------------------------------------------------------------
                if (vehiculoMatricula != null && !vehiculoMatricula.isEmpty()) {
                    v = getVehiculoByMatricula(vehiculoMatricula);
                }
                // ----------------------------------------------------------------------------------------------------
                if (rs.getInt("id_cliente") != 0) {
                    int id_cliente = rs.getInt("id_cliente");
                    boolean vip = rs.getBoolean("vip");
                    Date fechaRegistroSQL = rs.getDate("fechaRegistro");
                    LocalDate fechaRegistro = fechaRegistroSQL.toLocalDate();
                    //-----------------------------------------------------
                    persona = new Cliente(id_cliente, fechaRegistro, vip, DNI, nombre, genero, edad, direccion, v);
                    personas.add(persona);
                } else if (rs.getInt("id_empleado") != 0) {
                    int id_empleado = rs.getInt("id_empleado");
                    double sueldo = rs.getDouble("sueldo");
                    //-----------------------------------------------------
                    persona = new Empleado(id_empleado, sueldo, DNI, nombre, genero, edad, direccion, v);
                    personas.add(persona);
                }

            }
        } catch (SQLException ex) {
            //ex.printStackTrace(System.out);
            throw new SQLPersonasException("Can not read from database (DAO_COntroller.DAOSQL.read)");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database read process (DAO_COntroller.DAOSQL.read)");
            }
        }
        return personas;
    }

    public ArrayList<String> mostrarDNIS() throws SQLPersonasException {
        ArrayList<String> dnis = new ArrayList<>();
        Connection conn = null;
        PreparedStatement instruction = null;
        ResultSet rs = null;

        try {
            conn = connect();
            String query = "SELECT DNI FROM " + JDBC_DDBB_TABLE_PERSONAS;
            instruction = conn.prepareStatement(query);
            rs = instruction.executeQuery();

            while (rs.next()) {
                dnis.add(rs.getString("DNI"));
            }
        } catch (SQLException ex) {
            throw new SQLPersonasException("Cannot read from database (SQL.getAllDNI)");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                throw new SQLPersonasException("Cannot close database read process (SQL.getAllDNI)");
            }
        }

        return dnis;
    }

    public int delete(String dni) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruccion = null;
        int registers = 0;
        try {
            conn = connect();
            instruccion = conn.prepareStatement(SQL_DELETE);
            instruccion.setString(1, dni);
            //cada vez que modificamos una base de datos llamamos a executeUpdate()
            registers = instruccion.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new SQLPersonasException("Can not write to database (DAO_Controller.DAOSQL.delete)");

        } finally {
            try {
                if (instruccion != null) {
                    instruccion.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database write process (DAO_COntroller.DAOSQL.delete)");
            }
        }
        //Devolvemos la cantidad de registros afectados
        return registers;
    }

    public int updatePersonas(Persona p) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        int registers = 0;
        try {
            conn = connect();
            if (p instanceof Cliente) {
                instruction = conn.prepareStatement(SQL_UPDATE_CLIENTE);
                instruction.setString(7, p.getDNI());
                //----------------------------------------------------------
                instruction.setString(1, p.getNombre());
                instruction.setString(2, String.valueOf(p.getGenero()));
                instruction.setInt(3, p.getEdad());
                instruction.setString(4, p.getDireccion());
                instruction.setBoolean(5, ((Cliente) p).isVip());
                if (p.getV() != null) {
                    instruction.setString(6, p.getV().getMatricula());
                } else {
                    instruction.setNull(6, java.sql.Types.VARCHAR);
                }
//              private final String SQL_UPDATE_CLIENTE = "UPDATE " + JDBC_DDBB_TABLE_PERSONAS + " SET nombre = ?, SET genero = ?, SET edad = ?, SET direccion = ?, SET vip = ?, SET vehiculo = ? WHERE (DNI = ?);";
//              private final String SQL_UPDATE_EMPLEADO = "UPDATE " + JDBC_DDBB_TABLE_PERSONAS + " SET nombre = ?, SET genero = ?, SET edad = ?, SET direccion = ?, SET sueldo = ?, SET vehiculo = ? WHERE (DNI = ?);";
            } else if (p instanceof Empleado) {
                instruction = conn.prepareStatement(SQL_UPDATE_EMPLEADO);
                instruction.setString(7, p.getDNI());
                //----------------------------------------------------------
                instruction.setString(1, p.getNombre());
                instruction.setString(2, String.valueOf(p.getGenero()));
                instruction.setInt(3, p.getEdad());
                instruction.setString(4, p.getDireccion());
                instruction.setDouble(5, ((Empleado) p).getSueldo());
                if (p.getV() != null) {
                    instruction.setString(6, p.getV().getMatricula());
                } else {
                    instruction.setNull(6, java.sql.Types.VARCHAR);
                }
            }
            //cada vez que modificamos una base de datos llamamos a executeUpdate()
            registers = instruction.executeUpdate();
        } catch (SQLException ex) {
            //ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
            throw new SQLPersonasException("Can not write to database (DAO_COntroller.DAOSQL.update)");
        } finally {
            try {
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database write process (DAO_COntroller.DAOSQL.update)");
            }
        }
        //Devolvemos la cantidad de registros afectados
        return registers;
    }

    public int updateVehiculo(Vehiculo v) throws SQLPersonasException {
        Connection conn = null;
        PreparedStatement instruction = null;
        int registers = 0;
        try {
            conn = connect();
            instruction = conn.prepareStatement(SQL_UPDATE_VEHICULO);
            instruction.setString(3, v.getMatricula());
            //----------------------------------------------------------
            instruction.setString(1, v.getColor());
            instruction.setString(2, v.getTipo());
            //cada vez que modificamos una base de datos llamamos a executeUpdate()
            registers = instruction.executeUpdate();
        } catch (SQLException ex) {
            //ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
            throw new SQLPersonasException("Can not write to database (DAO_COntroller.DAOSQL.update)");
        } finally {
            try {
                if (instruction != null) {
                    instruction.close();
                }
                disconnect(conn);
            } catch (SQLException ex) {
                //ex.printStackTrace(System.out);
                throw new SQLPersonasException("Can not close database write process (DAO_COntroller.DAOSQL.update)");
            }
        }
        //Devolvemos la cantidad de registros afectados
        return registers;
    }
}
