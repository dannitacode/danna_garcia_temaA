package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Proyectil {

    private int cantidad;
    private int dano;
    private String efecto; // "hielo", "fuego", "acido"

    public Proyectil(int cantidad, int dano, String efecto) {
        this.cantidad = cantidad;
        this.dano = dano;
        this.efecto = efecto;
    }
}
