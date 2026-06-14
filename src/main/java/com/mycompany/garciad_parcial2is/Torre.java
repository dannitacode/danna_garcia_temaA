package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Torre extends ObjetoInmovil {

    private int alcance;
    private int potenciaDisparo;

    public Torre(double x, double y, double ancho, double alto, String textura, int resistencia, int alcance, int potenciaDisparo) {
        super(x, y, ancho, alto, textura, resistencia);
        this.alcance = alcance;
        this.potenciaDisparo = potenciaDisparo;
    }

    public void disparar() {/*todo*/}
}
