package ControladorPersonas;

import Modelo.SQL;
import Excepciones.PersonaException;
import Excepciones.SQLPersonasException;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class ControladorPersonas {

    private static SQL sql;

    public static void darDeAlta(Persona p) throws PersonaException, SQLPersonasException {
        sql = new SQL();
        if (sql.DNIyaexistente(p.getDNI())) {
            throw new PersonaException("Ya existe una persona con este DNI");
        } else {
            if (p instanceof Cliente) {
                if (sql.idClienteExistente(((Cliente) p).getIdCliente())) {
                    throw new PersonaException("Este ID de cliente ya está siendo usado por otro cliente.");
                } else {
                    sql.insertPersona(p);
                }
            } else if (p instanceof Empleado) {
                if (sql.idEmpleadoExistente(((Empleado) p).getIdEmpleado())) {
                    throw new PersonaException("Este ID de empleado ya está siendo usado por otro empleado.");
                } else {
                    sql.insertPersona(p);
                }
            }
        }
    }

    public static void insertarVehiculo(Vehiculo v) throws SQLPersonasException {
        sql = new SQL();
        sql.insertVehiculo(v);
    }

    public static boolean matriculaExistente(String matricula) throws SQLPersonasException {
        sql = new SQL();
        return sql.matriculaExistente(matricula);
    }

    public static Vehiculo getVehiculoByMatricula(String matricula) throws SQLPersonasException {
        sql = new SQL();
        return sql.getVehiculoByMatricula(matricula);
    }

    public static ArrayList<String> ObtenerDNIS() throws SQLPersonasException {
        sql = new SQL();
        return sql.mostrarDNIS();
    }
    
    public static void darDeBaja(String dni) throws SQLPersonasException {
        sql = new SQL();
        sql.delete(dni);
    }

    public static Persona mostrar(Persona p) throws SQLPersonasException {
        sql = new SQL();
        return sql.readByDNI(p);
    }
    
    public static List<Persona> buscar(String nombre) throws SQLPersonasException {
        sql = new SQL();
        return sql.readByName(nombre);
    }
    
    public static void updatePersonas(Persona p) throws SQLPersonasException {
        sql = new SQL();
        sql.updatePersonas(p);
    }
    
    public static void updateVehiculos(Vehiculo v) throws SQLPersonasException {
        sql = new SQL();
        sql.updateVehiculo(v);
    }

}
