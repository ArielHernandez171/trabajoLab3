package com.company;

public class Silver extends Avion{

    private boolean catering;

    public Silver() {
    }

    public Silver(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, boolean catering) {
        super(capacidadDeCombustible, costoPorKM, capacidadMaxDePasajeros, velocidadMaxima, tipoDePropulsor, 4000);

    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }
}
