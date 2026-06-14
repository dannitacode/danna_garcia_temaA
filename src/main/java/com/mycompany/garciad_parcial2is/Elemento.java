package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public abstract class Elemento {

    protected double x;
    protected double y;
    protected double ancho;
    protected double alto;
    protected String textura;

    public Elemento(double x, double y, double ancho, double alto, String textura) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.textura = textura;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "Elemento{" + "x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto + ", textura=" + textura + '}';
    }
    
}
