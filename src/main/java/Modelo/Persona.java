package Modelo;

public class Persona {

    final private String DNI;
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    private Vehiculo v;

    public Persona(String DNI, String nombre, char genero, int edad, String direccion, Vehiculo v) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.v = v;
    }

    public Persona(String DNI) {
        this.DNI = DNI;
    }   
    
    
// GETTERS AND SETTERS --------------------------------------------------------------------------------
    public String getDNI() {
        return DNI;
    }
//-----------------------------------------------------------------------------------------------------    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
//-----------------------------------------------------------------------------------------------------
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
//-----------------------------------------------------------------------------------------------------
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
//-----------------------------------------------------------------------------------------------------
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
//-----------------------------------------------------------------------------------------------------
    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(obj instanceof Persona) {
            Persona other = (Persona) obj;
            return other.DNI.equals(this.DNI);
        } else {
            return false;
        }
    }

    @Override
    /*System.out.println(persona);*/
    public String toString() {
        return "DNI: " + DNI + 
                "\nNombre: " + nombre + 
                "\nGenero: " + genero + 
                "\nEdad: " + edad + 
                "\nDireccion: " + direccion + 
                "\nVehículo: " + v;
    }
    
}
