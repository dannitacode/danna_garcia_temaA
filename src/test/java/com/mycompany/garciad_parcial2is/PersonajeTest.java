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
        // heroe con 20 de ataque, enem con 100 de vida
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 20);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 100, 100, 10, "comun");
        // el heroe golpea al enemigo
        heroe.atacar(enemigo); // tiene que restar 20 a los 100 de vida
        // la vida reducida debe ser 80
        assertEquals(80, enemigo.getVida(), "la vida del enemigo deberia haber bajado a 80");
    }

    @Test
    public void testGolpeMataEnemigo() {
        // heroe con 30 de ataque, enemigo con 30 de vida
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 30);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 30, 100, 10, "comun");
        heroe.atacar(enemigo);
        //la vida debe llegar a 0
        assertEquals(0, enemigo.getVida(), "el enemigo tendria q haber muerto con 0 de vida");
    }

    @Test
    public void testGolpeExcesivoNoBajaDeCero() {
        // heroe con 50 de ataque, Enemigo con 10 de vida
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 100, 100, 50);
        Enemigo enemigo = new Enemigo(0, 0, 1, 1, "abcdef", 10, 100, 10, "comun");
        heroe.atacar(enemigo);
        //el sistema tiene q garantizar que el minimo sea 0, no -40
        assertEquals(0, enemigo.getVida(), "la vida no debe ser negativa, el limite inferior es 0");
    }

    @Test
    public void testCurarVida() {
        // heroe con 30 de vida, comida (Manzana) que cura 15
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 30, 100, 10);
        Comida manzana = new Comida(0, 0, 1, 1, "manzanaroja", 15, 1);
        //el heroe consume la comida
        manzana.consumir(heroe);
        //30 + 15 = 45 puntos de vida esperados
        assertEquals(45, heroe.getVida(), "la vida del heroe deberia ser de 45 puntos dsp de comer");
    }

    @Test
    public void testNoPuedeCurarse() {
        //heroe intenta consumir una comida que es null
        Heroe heroe = new Heroe(0, 0, 1, 1, "abcdef", 30, 100, 10);
        Comida comidanull = null;

        //se espera que tire un npe al intentar usar un objeto null
        assertThrows(NullPointerException.class, () -> {
            comidanull.consumir(heroe);
        }, "deberia lanzar un npe si la comida no existe");
    }
}