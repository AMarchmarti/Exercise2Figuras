package org.brujula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.brujula.Figuras.Cuadrados.Cuadrado;
import org.brujula.Figuras.Figura;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FigurasGeometricasTest
{
    @Test
    public void figuraTest(){
        /*
        Probamos si la clase funcionará, al confirmado queda constancia del uso de casos test para ver el funcionamiento
        Figura figura = new Figura();
        Figura figuraGeometrica = new Figura("nombre");
        figura.setNombre("Cuadrado");
        assertEquals("Cuadrado", figura.getNombre());
        assertEquals("nombre", figuraGeometrica.getNombre());
        figura.pintar();
        figuraGeometrica.pintar();
         */
    }

    @Test
    public void figurasCuadradoTest(){
        Figura cuadrado = new Cuadrado();
        Cuadrado cuadradoC = new Cuadrado("Cuadrado");
        cuadrado.setNombre("cuadrado");
        assertEquals("cuadrado", cuadrado.getNombre());
        assertEquals("Cuadrado", cuadradoC.getNombre());
        cuadradoC.setNombre("rectangulo");
        assertEquals("rectangulo", cuadradoC.getNombre());
        cuadrado.pintar(); //Debería salir cuadrado
        cuadradoC.pintar(); //Debería salir rectangulo
    }
}
