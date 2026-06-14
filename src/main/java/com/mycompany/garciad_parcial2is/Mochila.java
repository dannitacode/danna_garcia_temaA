package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
import java.util.List;
import java.util.ArrayList;

public class Mochila {

    private int capacidad;
    private List<ObjetoMovil> objetos;

    public Mochila() {
        this.capacidad = 3;
        this.objetos = new ArrayList<>();
    }

    public boolean guardar(ObjetoMovil obj) {
        if (objetos.size() < capacidad) {
            objetos.add(obj);
            obj.estadoMapa = false;
            return true;
        }
        System.out.println("mochila llena");
        return false;
    }

    public void usar(ObjetoMovil obj) {
        //todo
    }

    public void tirar(ObjetoMovil obj) {
        if (objetos.remove(obj)) {
            obj.estadoMapa = true;
        }
    }

    public void ampliarCapacidad() {
        this.capacidad++;
    }

    public List<ObjetoMovil> getObjetos() {
        return objetos;
    }
}
