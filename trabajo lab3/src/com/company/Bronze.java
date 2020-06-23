package com.company;

public class Bronze extends Avion {


    public Bronze() {
    }

    public Bronze(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima, int tarifaTipoAvion) {
        super(capacidadDeCombustible, capacidadMaxDePasajeros, velocidadMaxima, tarifaTipoAvion);
    }

    @Override
    public String toString()
    {
        return super.toString() + " | BRONZE \n";
    }
}
