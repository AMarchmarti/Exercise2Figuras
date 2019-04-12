package org.brujula.Figuras.Cuadrados;

import org.brujula.Figuras.Figura;

public class Cuadrado extends Figura {

    //Construcor
    public Cuadrado(){
        super();
    }

    public Cuadrado(String nombre){
        super(nombre);
    }

    //Método que queremos aplicar
    public void pintar(){
        System.out.println(getNombre());
    }
}
