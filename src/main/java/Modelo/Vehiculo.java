package Modelo;

public class Vehiculo {

    final private String matricula;
    private String color;
    private String tipo;

    public Vehiculo(String matricula, String color, String tipo) {
        this.matricula = matricula;
        this.color = color;
        this.tipo = tipo;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

// GETTERS AND SETTERS --------------------------------------------------------------------------------
    public String getMatricula() {
        return matricula;
    }
//----------------------------------------------------------------------------------------------------
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
//-----------------------------------------------------------------------------------------------------
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo 
                + " | matricula: " + matricula 
                + " | color: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return other.matricula.equals(this.matricula);
    }

}
