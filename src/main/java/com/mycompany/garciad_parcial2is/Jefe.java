package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Jefe extends Enemigo {

    private int cantEvoluciones;
    private int potenciaSuperpoder;
    private boolean vuela;

    public Jefe(double x, double y, double ancho, double alto, String textura, int vida, int energia, int capacidadOfensiva, String tipo, int cantEvoluciones, int potenciaSuperpoder, boolean vuela) {
        super(x, y, ancho, alto, textura, vida, energia, capacidadOfensiva, tipo);
        this.cantEvoluciones = cantEvoluciones;
        this.potenciaSuperpoder = potenciaSuperpoder;
        this.vuela = vuela;
    }

    public void evolucionar() {
        this.cantEvoluciones++;
    }

    public void lanzarSuperpoder() {
    // todo
    }

    public void volar() {
    // todo
    }
}
