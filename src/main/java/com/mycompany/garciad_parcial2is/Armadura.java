package com.mycompany.garciad_parcial2is;

/**
 *
 * @author dannita
 */
import java.util.List;
import java.util.ArrayList;

public class Armadura {

    private int duracion;
    private List<PiezaArmadura> piezas;

    public Armadura(int duracion) {
        this.duracion = duracion;
        this.piezas = new ArrayList<>();
    }

    public void agregarPieza(PiezaArmadura p) {
        if (piezas.size() < 5) {
            piezas.add(p);
        }
    }

    public void destruir() {
        piezas.clear();
    }
}
