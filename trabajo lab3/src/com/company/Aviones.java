package com.company;

public class Aviones {
    private int capacidadDeCombustible;
    private int costoPorKM;
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private String tipoDePropulsor;
    private int tarifaTipoAvion;
    public Aviones() {
        capacidadDeCombustible = 0;
        costoPorKM = 0;
        capacidadMaxDePasajeros = 0;
        velocidadMaxima = 0;
        tipoDePropulsor = "";
        tarifaTipoAvion=0;
    }
    public Aviones(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor,int tarifaTipoAvion) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = costoPorKM;
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = tipoDePropulsor;
        this.tarifaTipoAvion=tarifaTipoAvion;
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

    @Override
    public String toString() {
        return "Aviones{" +
                "capacidadDeCombustible=" + capacidadDeCombustible +
                ", costoPorKM=" + costoPorKM +
                ", capacidadMaxDePasajeros=" + capacidadMaxDePasajeros +
                ", velocidadMaxima=" + velocidadMaxima +
                ", tipoDePropulsor='" + tipoDePropulsor + '\'' +
                '}';
    }
}
