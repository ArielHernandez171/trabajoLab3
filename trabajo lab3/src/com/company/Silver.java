package com.company;

public class Silver extends Aviones{

    public Silver() {
    }

    public Silver(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, boolean catering, boolean wifi) {
        super(capacidadDeCombustible, costoPorKM, capacidadMaxDePasajeros, velocidadMaxima, tipoDePropulsor, tarifaTipoAvion, true, false);

    }
}
