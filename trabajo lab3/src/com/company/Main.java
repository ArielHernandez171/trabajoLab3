package com.company;

public class Main {

    public static void main(String[] args) {

        // Ni idea si los datos estan bien en los atributos, meti random, despues los checkeamos
        Empresa aeroTaxi = new Empresa();
        Gold avionGold = new Gold (1000, 100,50,1000, "Motor a reaccion",300, "BsAs", "Cordoba", "23/06/2020", true, true);
        Silver avionSilver = new Silver(1000, 250, 30, 700, "Motor Helice",250, "BsAs", "Santiago", "24/06/2020", true);
        Bronze avionBronze = new Bronze(600, 100, 15, 600, "Motor de pistones", 100, "BsAs", "Montevideo", "02/07/2020");

        aeroTaxi.aviones.add(avionGold);
        aeroTaxi.aviones.add(avionSilver);
        aeroTaxi.aviones.add(avionBronze);
        System.out.println(aeroTaxi.listarAviones());
    }
}
