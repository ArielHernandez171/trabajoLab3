package com.company;

public class Avion {
    private int capacidadDeCombustible;
    private int costoPorKM;
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private String tipoDePropulsor;
    private int tarifaTipoAvion;
    private Ususario ususario;


    public Avion() {
    }

    public Avion(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = costoPorKM;
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = tipoDePropulsor;
        this.tarifaTipoAvion = tarifaTipoAvion;
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

    public int getTarifaTipoAvion() {
        return tarifaTipoAvion;
    }

    public void setTarifaTipoAvion(int tarifaTipoAvion) {
        this.tarifaTipoAvion = tarifaTipoAvion;
    }

    public Ususario getUsusario() {
        return ususario;
    }

    public void setUsusario(Ususario ususario) {
        this.ususario = ususario;
    }

    @Override
    public String toString() {
        return "Avion{" + "capacidadDeCombustible=" + capacidadDeCombustible + ", costoPorKM=" + costoPorKM +
                ", capacidadMaxDePasajeros=" + capacidadMaxDePasajeros +
                ", velocidadMaxima=" + velocidadMaxima +
                ", tipoDePropulsor='" + tipoDePropulsor + '\'' +
                '}';
    }


}