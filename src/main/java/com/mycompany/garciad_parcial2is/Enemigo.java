package com.mycompany.garciad_parcial2is;

import java.util.List;

/**
 *
 * @author dannita
 */
public class Enemigo extends Personaje {

    private String tipo;

    public Enemigo(double x, double y, double ancho, double alto, String textura, int vida, int energia, int capacidadOfensiva, String tipo) {
        super(x, y, ancho, alto, textura, vida, energia, capacidadOfensiva);
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Heroe h) {
    // todo
    }

    public void soltarPieza() {
    // todo
    }
}
