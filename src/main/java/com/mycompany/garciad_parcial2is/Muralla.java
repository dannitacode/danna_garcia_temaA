package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Muralla extends ObjetoInmovil {

    private int nivelRecuperacion;
    private int mejoraDefensas;

    public Muralla(double x, double y, double ancho, double alto, String textura, int resistencia, int nivelRecuperacion, int mejoraDefensas) {
        super(x, y, ancho, alto, textura, resistencia);
        this.nivelRecuperacion = nivelRecuperacion;
        this.mejoraDefensas = mejoraDefensas;
    }

    public void recuperar() {
    // todo
    }

    public void mejorarDefensas() {
    // todo
    }
}
