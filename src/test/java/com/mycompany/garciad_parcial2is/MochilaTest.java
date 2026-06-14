package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MochilaTest {

    public MochilaTest() {
    }

    @Test
    public void testGuardarObjetosHastaLímite() {
        Mochila mochila = new Mochila();
        Comida item1 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item2 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item3 = new Comida(0, 0, 1, 1, "item", 10, 1);
        assertTrue(mochila.guardar(item1), "deberia permitir guardar el 1er obj");
        assertTrue(mochila.guardar(item2), "deberia permitir guardar el 2do obj");
        assertTrue(mochila.guardar(item3), "deberia permitir guardar el 3er obj hasta el limte");
    }

    @Test
    public void testRechazarGuardarAlSuperarLímite() {
        Mochila mochila = new Mochila();
        Comida item1 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item2 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item3 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item4 = new Comida(0, 0, 1, 1, "item", 10, 1);
        mochila.guardar(item1);
        mochila.guardar(item2);
        mochila.guardar(item3);
        // me tiene que dar fals
        boolean resultadoGuardado = mochila.guardar(item4);
        assertFalse(resultadoGuardado, "deberia rechazar el guardado retornando false");
        assertEquals(3, mochila.getObjetos().size(), "la cantidad actual de objetos debe mantenerse en 3");
    }

    @Test
    public void testGuardarAlAmpliarCapacidad() {
        Mochila mochila = new Mochila();
        Comida item1 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item2 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item3 = new Comida(0, 0, 1, 1, "item", 10, 1);
        Comida item4 = new Comida(0, 0, 1, 1, "item", 10, 1);
        mochila.guardar(item1);
        mochila.guardar(item2);
        mochila.guardar(item3);
        mochila.ampliarCapacidad();
        assertTrue(mochila.guardar(item4), "deberia poder guardar el 4to item dsp de ampliar la capacidad");
        assertEquals(4, mochila.getObjetos().size(), "la cantidad actual de objetos en la mochila debe ser 4");
    }
}
