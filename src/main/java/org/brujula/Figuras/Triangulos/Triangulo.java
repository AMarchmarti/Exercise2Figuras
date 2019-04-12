package org.brujula.Figuras.Triangulos;

import org.brujula.Figuras.Figura;

public class Triangulo extends Figura {

    //Constructor
    public Triangulo(){
        super();
    }

    public Triangulo(String nombre){
        super(nombre);
    }

    //Método a aplicar
    public void pintar(){
        System.out.println(getNombre());
    }
}
