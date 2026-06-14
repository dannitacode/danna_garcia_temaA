package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Heroe extends Personaje {

    private Mochila mochila;
    private Armadura armor;

    public Heroe(double x, double y, double ancho, double alto, String textura, int vida, int energia, int capacidadOfensiva) {
        super(x, y, ancho, alto, textura, vida, energia, capacidadOfensiva);
        this.mochila = new Mochila();
    }

    public void recogerObjeto(ObjetoMovil obj) {
        this.mochila.guardar(obj);
    }

    public void interactuarConObjeto(ObjetoMovil obj) {
        // todo (segun instancia, es como interactuara)
    }

    public void atacar(Enemigo e) {
        int nuevaVida = e.getVida() - this.capacidadOfensiva;
        if (nuevaVida < 0) {
            nuevaVida = 0;
        }
        e.setVida(nuevaVida);
    }

    public void equiparArmor(Armadura a) {
        this.armor = a;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Mochila getMochila() {
        return mochila;
    }
}
