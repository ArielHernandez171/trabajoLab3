package com.company;

public class Bronze extends Aviones {


    public Bronze() {
    }

    public Bronze(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, boolean catering, boolean wifi) {
        super(capacidadDeCombustible, costoPorKM, capacidadMaxDePasajeros, velocidadMaxima, tipoDePropulsor, tarifaTipoAvion, false, false);
    }



}
