package com.company;

public class Aviones {
    private int capacidadDeCombustible;
    private int costoPorKM;
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private String tipoDePropulsor;
    private int tarifaTipoAvion;
    private boolean catering;
    private boolean wifi;

    public Aviones() {
    }

    public Aviones(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, boolean catering, boolean wifi) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = costoPorKM;
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = tipoDePropulsor;
        this.tarifaTipoAvion = tarifaTipoAvion;
        this.catering = catering;
        this.wifi = wifi;
    }



    public int getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(int capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public int getCostoPorKM() {
        return costoPorKM;
    }

    public void setCostoPorKM(int costoPorKM) {
        this.costoPorKM = costoPorKM;
    }

    public int getCapacidadMaxDePasajeros() {
        return capacidadMaxDePasajeros;
    }

    public void setCapacidadMaxDePasajeros(int capacidadMaxDePasajeros) {
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoDePropulsor() {
        return tipoDePropulsor;
    }

    public void setTipoDePropulsor(String tipoDePropulsor) {
        this.tipoDePropulsor = tipoDePropulsor;
    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "Aviones{" + "capacidadDeCombustible=" + capacidadDeCombustible + ", costoPorKM=" + costoPorKM +
                ", capacidadMaxDePasajeros=" + capacidadMaxDePasajeros +
                ", velocidadMaxima=" + velocidadMaxima +
                ", tipoDePropulsor='" + tipoDePropulsor + '\'' +
                '}';
    }

}
