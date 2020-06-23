package com.company;

public class Silver extends Avion{

    private boolean catering;

    public Silver() {
    }

    public Silver(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima, int tarifaTipoAvion, boolean catering) {
        super(capacidadDeCombustible, capacidadMaxDePasajeros, velocidadMaxima, tarifaTipoAvion);
        this.catering = catering;
    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Catering: " +catering+ " | SILVER \n";
    }
}
