package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Comida extends ObjetoMovil {

    private int cantCuracion;
    private int cantUsos;

    public Comida(double x, double y, double ancho, double alto, String textura, int cantCuracion, int cantUsos) {
        super(x, y, ancho, alto, textura);
        this.cantCuracion = cantCuracion;
        this.cantUsos = cantUsos;
    }

    public void consumir(Heroe heroe) {
        int nuevaVida = heroe.getVida() + this.cantCuracion;
        heroe.setVida(nuevaVida);
        this.cantUsos--;
    }

    public int getCantCuracion() {
        return cantCuracion;
    }

    public int getCantUsos() {
        return cantUsos;
    }
}
