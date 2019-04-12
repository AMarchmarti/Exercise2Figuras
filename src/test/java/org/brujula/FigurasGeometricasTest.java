package org.brujula;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        Figura figura = new Figura();
        Figura figuraGeometrica = new Figura("nombre");
        figura.setNombre("Cuadrado");
        assertEquals("Cuadrado", figura.getNombre());
        assertEquals("nombre", figuraGeometrica.getNombre());
        Probar si el metodo pintar funcionará, lugo lo convertiremos en abstracto.
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
        cuadradoC.setNombre("rectamgulo");
        assertEquals("recatngulo", cuadradoC.getNombre());
        cuadrado.pintar();
        cuadradoC.pintar();
    }
}
