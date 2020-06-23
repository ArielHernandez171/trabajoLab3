package com.company;

public class Gold extends Avion {

    private boolean catering;
    private boolean wifi;

    public Gold() {
    }

    public Gold(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima, boolean catering, boolean wifi) {
        super(capacidadDeCombustible, capacidadMaxDePasajeros, velocidadMaxima, 6000);
        this.catering = catering;
        this.wifi = wifi;
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
    public String toString()
        {
            return super.toString() + " | Catering: " +catering+ " | Wifi: " +wifi+ " | GOLD \n";
        }
}
