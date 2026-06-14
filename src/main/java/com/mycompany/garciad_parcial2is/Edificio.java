package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Edificio extends ObjetoInmovil {

    private int vida;

    public Edificio(double x, double y, double ancho, double alto, String textura, int resistencia, int vida) {
        super(x, y, ancho, alto, textura, resistencia);
        this.vida = vida;
    }
}
