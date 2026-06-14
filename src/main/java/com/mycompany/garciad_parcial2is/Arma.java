package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
public class Arma extends ObjetoMovil {

    private int potencia;
    private int cadenciaDisparo;
    private int velocidadDisparo;
    private int factorPotenciador;
    private int disparosRestantes;
    private Proyectil proyectilEquipado;

    public Arma(double x, double y, double ancho, double alto, String textura, int potencia, int cadenciaDisparo, int velocidadDisparo, int factorPotenciador) {
        super(x, y, ancho, alto, textura);
        this.potencia = potencia;
        this.cadenciaDisparo = cadenciaDisparo;
        this.velocidadDisparo = velocidadDisparo;
        this.factorPotenciador = factorPotenciador;
        this.disparosRestantes = 30;
    }

    public void disparar() {
        if (disparosRestantes > 0) {
            disparosRestantes--;
        }
    }

    public void equiparProyectil(Proyectil p) {
        this.proyectilEquipado = p;
    }
}
