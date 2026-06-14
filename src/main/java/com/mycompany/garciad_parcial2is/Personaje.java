package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Personaje extends Elemento {
    
    protected int vida;
    protected int energia;
    protected int nivel;
    protected int capacidadOfensiva;
    protected List<String> habilidades;

    public Personaje(double x, double y, double ancho, double alto, String textura, int vida, int energia, int capacidadOfensiva) {
        super(x, y, ancho, alto, textura);
        this.vida = vida;
        this.energia = energia;
        this.nivel = 1;
        this.capacidadOfensiva = capacidadOfensiva;
        this.habilidades = new ArrayList<>();
    }

    public void caminar() {/*todo*/}
    public void correr() {/*todo*/}
    public void saltar() {/*todo*/}
    public void disparar() {/*todo*/}
    public void recibirDano(int d) { this.vida -= d; }
    public void subirNivel() { this.nivel++; }
}
