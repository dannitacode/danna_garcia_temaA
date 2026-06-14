package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public abstract class ObjetoInmovil extends Elemento {

    protected int resistencia;

    public ObjetoInmovil(double x, double y, double ancho, double alto, String textura, int resistencia) {
        super(x, y, ancho, alto, textura);
        this.resistencia = resistencia;
    }
}
