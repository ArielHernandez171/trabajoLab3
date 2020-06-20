package com.company;

public class Silver extends Avion{

    private boolean catering;

    public Silver() {
    }

    public Silver(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, String origen, String destino, String fecha, boolean catering) {
        super(capacidadDeCombustible, costoPorKM, capacidadMaxDePasajeros, velocidadMaxima, tipoDePropulsor, 4000, origen, destino, fecha);
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
