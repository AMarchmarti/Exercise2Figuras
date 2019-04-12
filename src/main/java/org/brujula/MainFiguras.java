package org.brujula;


import org.brujula.Figuras.Cuadrados.Cuadrado;
import org.brujula.Figuras.Cuadrados.Rectangulo;
import org.brujula.Figuras.Cuadrados.Rombo;
import org.brujula.Figuras.Figura;
import org.brujula.Figuras.Triangulos.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras
{
    public static void main( String[] args )
    {
        List<Figura> listaFiguras = new ArrayList<>();

        listaFiguras.add(new Triangulo("Triangulo"));
        listaFiguras.add(new Rectangulo("Rectangulo"));
        listaFiguras.add(new Triangulo("Piramide"));
        listaFiguras.add(new Rectangulo("Cuadrado"));
        listaFiguras.add(new Rombo("Rombo"));

        listaFiguras.stream().filter(figura -> figura instanceof Cuadrado).forEach(figura -> figura.pintar());
        listaFiguras.stream().filter(figura -> figura instanceof Triangulo).forEach(figura -> figura.pintar());

    }
}
