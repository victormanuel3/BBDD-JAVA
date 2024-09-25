package Modelo;

import java.time.LocalDate;

public class Cliente extends Persona {
    final private int idCliente;
    private LocalDate fechaRegistro ;
    private boolean vip;

    public Cliente(int idCliente, LocalDate fechaRegistro, boolean vip, String DNI, String nombre, char genero, int edad, String direccion, Vehiculo v) {
        super(DNI, nombre, genero, edad, direccion, v);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Cliente(String DNI, int idCliente) {
        super(DNI);
        this.idCliente = idCliente;
    }
    
// GETTERS AND SETTERS --------------------------------------------------------------------------------
    public int getIdCliente() {
        return idCliente;
    }
 //-----------------------------------------------------------------------------------------------------       
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
        
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
//-----------------------------------------------------------------------------------------------------    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    public boolean isVip() {
        return vip;
    }
    
    
    
    @Override
    public String toString() {
        return "Persona (Cliente): " + 
                super.toString() +
                "\nID Cliente: " + idCliente + 
                "\nFecha de registro: " + fechaRegistro +
                "\nVIP: " + (vip ? "Sí" : "No");
    }    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Cliente) {
            Cliente other = (Cliente) obj;
            return this.idCliente == other.idCliente;
        } else {
            return false;
        }
    }
    
    
}
