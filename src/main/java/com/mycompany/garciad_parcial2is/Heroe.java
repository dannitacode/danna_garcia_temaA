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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void recogerObjeto(ObjetoMovil obj) {
        if (obj instanceof Comida) {
            Comida comida = (Comida) obj;
            this.mochila.guardar(obj);
        }
    }

    public void interactuarConObjeto(ObjetoMovil obj) {
        if (obj == null) {
            throw new NullPointerException("el objeto es nulo");
        }
        if (!this.mochila.getObjetos().contains(obj)) {
            throw new NullPointerException("el objeto no se encuentra en la mochila");
        }
        if (obj instanceof Comida) {
            Comida comida = (Comida) obj;
            comida.consumir(this);
            if (comida.getCantUsos() <= 0) {
                this.mochila.getObjetos().remove(comida);
            }
        }
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
}
