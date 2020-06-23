package com.company;

public class Main {

    public static void main(String[] args) {

        // Ni idea si los datos estan bien en los atributos, meti random, despues los checkeamos
        Empresa aeroTaxi = new Empresa();
        Gold avionGold = new Gold (1000,50,1000, true, true);
        Silver avionSilver = new Silver(1000, 30, 700, true);
        Bronze avionBronze = new Bronze(600, 15, 600);
        Menu menu = new Menu();
        aeroTaxi.aviones.add(avionGold);
        aeroTaxi.aviones.add(avionSilver);
        aeroTaxi.aviones.add(avionBronze);
        System.out.println(aeroTaxi.listarAviones());

        menu.mostrarOpcionesMenuPrincipal();

    }
}
