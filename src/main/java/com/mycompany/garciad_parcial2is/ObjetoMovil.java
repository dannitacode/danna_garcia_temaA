package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public abstract class ObjetoMovil extends Elemento {

    protected boolean estadoMapa; // true si está en el mapa, false si esta en mochila

    public ObjetoMovil(double x, double y, double ancho, double alto, String textura) {
        super(x, y, ancho, alto, textura);
        this.estadoMapa = true;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
