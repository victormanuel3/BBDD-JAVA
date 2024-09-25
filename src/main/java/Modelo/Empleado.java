package Modelo;


public class Empleado extends Persona {
    final private int idEmpleado;
    private double sueldo;

    public Empleado(int idEmpleado, double sueldo, String DNI, String nombre, char genero, int edad, String direccion, Vehiculo v) {
        super(DNI, nombre, genero, edad, direccion, v);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(String DNI, int idEmpleado) {
        super(DNI);
        this.idEmpleado = idEmpleado;
    }

    
// GETTERS AND SETTERS --------------------------------------------------------------------------------
    public int getIdEmpleado() {
        return idEmpleado;
    }
// ----------------------------------------------------------------------------------------------------
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Persona (Empleado) - " + super.toString() + 
                "\nID empleado: " + idEmpleado + 
                "\nSueldo: " + sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(obj instanceof Empleado) {
            Empleado other = (Empleado) obj;
            return this.idEmpleado == other.idEmpleado;
        } else {
            return false;
        }
        
    }
    
    
    
}
