package com.company;

public class Main {

    public static void main(String[] args) {

        // Ni idea si los datos estan bien en los atributos, meti random, despues los checkeamos
        Empresa aeroTaxi = new Empresa();
        Gold avionGold = new Gold (1000,50,1000, 300, true, true);
        Silver avionSilver = new Silver(1000, 30, 700,250, true);
        Bronze avionBronze = new Bronze(600, 15, 600, 100);

        aeroTaxi.aviones.add(avionGold);
        aeroTaxi.aviones.add(avionSilver);
        aeroTaxi.aviones.add(avionBronze);
        System.out.println(aeroTaxi.listarAviones());
    }
}
