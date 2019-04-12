package org.brujula;

import org.brujula.Figuras.Cuadrados.Cuadrado;
import org.brujula.Figuras.Cuadrados.Rectangulo;
import org.brujula.Figuras.Cuadrados.Rombo;
import org.brujula.Figuras.Figura;
import org.brujula.Figuras.Triangulos.Triangulo;
import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void rectanguloRomboTest(){
        Figura rombo = new Rombo();
        Cuadrado romboide = new Rombo("nombre");
        Rombo romboloide = new Rombo("nombre");
        assertTrue(romboloide instanceof Figura);
        assertTrue(romboloide instanceof Cuadrado);
        assertEquals("nombre", romboloide.getNombre());
        assertEquals("nombre", romboide.getNombre());
        rombo.setNombre("rombo");
        assertEquals("rombo", rombo.getNombre());
        rombo.pintar(); //Debería dar rombo
        romboide.pintar(); //Debería dar nombre
        romboloide.pintar(); // Debería dar nombre

        //-----------------------Rectangulo--------------------------
        Figura rectangulo = new Rectangulo();
        Rectangulo rectan = new Rectangulo("rectangulo");
        Cuadrado rect = new Rectangulo();
        assertTrue(rectan instanceof Figura);
        assertTrue(rectan instanceof Cuadrado);
        assertEquals("rectangulo", rectan.getNombre());
        rectangulo.setNombre("cuadrado1");
        rect.setNombre("cuadrado");
        assertEquals("cuadrado1", rectangulo.getNombre() );
        assertEquals("cuadrado", rect.getNombre());
        rect.pintar(); //Debería salir cuadrado
        rectan.pintar(); //Debería salir rectangulo
        rectangulo.pintar(); //Debería salir cuadrado1
    }

    @Test
    public void trianguloTest(){
        Figura triangulo = new Triangulo();
        Triangulo piramide = new Triangulo("Triangulo");
        assertTrue(piramide instanceof Figura);
        assertTrue(triangulo instanceof Triangulo);
        triangulo.setNombre("triangulo");
        assertEquals("triangulo", triangulo.getNombre());
        assertEquals("Triangulo", piramide.getNombre());
        piramide.setNombre("piramide");
        assertEquals("piramide", piramide.getNombre());
        triangulo.pintar(); //Debería salir triangulo
        piramide.pintar(); //Debería salir piramide
    }
}
