package com.mycompany.garciad_parcial2is;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dannita
 */
public class PersonajeTest {
    
    @Test
    public void testGolpeRestaVidaSinMorir() {
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 20);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 100, 100, 10, "comun");
        heroe.atacar(enemigo);
        assertEquals(80, enemigo.getVida(), "la vida del enemigo deberia haber bajado a 80");
    }

    @Test
    public void testGolpeMataEnemigo() {
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 30);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 30, 100, 10, "comun");
        heroe.atacar(enemigo);
        assertEquals(0, enemigo.getVida(), "el enemigo tendria q haber muerto con 0 de vida");
    }

    @Test
    public void testGolpeExcesivoNoBajaDeCero() {
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 50);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 10, 100, 10, "comun");
        heroe.atacar(enemigo);
        assertEquals(0, enemigo.getVida(), "la vida no debe ser negativa, el limite inferior es 0");
    }

    @Test
    public void testCurarVida() {
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 30, 100, 10);
        Comida manzana = new Comida(0, 0, 1, 1, "manzanaroja", 15, 1);
        heroe.recogerObjeto(manzana);
        heroe.interactuarConObjeto(manzana);
        assertEquals(45, heroe.getVida(), "la vida del heroe deberia ser de 45 puntos dsp de comer");
    }

    @Test
    public void testNoPuedeCurarse() {
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 30, 100, 10);
        Comida comidanull = null;
        assertThrows(NullPointerException.class, () -> {
            heroe.interactuarConObjeto(comidanull);
        }, "deberia lanzar un npe si la comida no existe");
    }
}