package com.company;

public class Gold extends Aviones {


    public Gold() {
    }

    public Gold(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, boolean catering, boolean wifi) {
        super(capacidadDeCombustible, costoPorKM, capacidadMaxDePasajeros, velocidadMaxima, tipoDePropulsor, tarifaTipoAvion, true, false);
    }



}
