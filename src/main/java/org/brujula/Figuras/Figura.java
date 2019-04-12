package org.brujula.Figuras;

public abstract class Figura {

    //Atributos
    private String nombre = null;

    //Constructores
    public Figura(){}

    public Figura(String nombre){
        this.nombre = nombre;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    //Método que requiere el ejercicio
    public abstract void pintar();
}
