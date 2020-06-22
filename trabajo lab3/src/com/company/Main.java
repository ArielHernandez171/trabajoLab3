package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  Usuario crearUsuario() {
        Usuario user;
        String nombre;
        String apellido;
        int edad;
        int dni;
        Scanner scan=new Scanner(System.in);
        Scanner scann=new Scanner(System.in);
        System.out.println("\nNombre: ");
        nombre=scan.nextLine();
        System.out.println("\nApellido: ");
        apellido=scan.nextLine();
        System.out.println("\nDNI: ");
        dni=scann.nextInt();
        System.out.println("\nEdad: ");
        edad=scann.nextInt();
        user=new Usuario(nombre,edad,dni,apellido);
        return user;
    }
    public static Usuario busquedaDeUsuarios(int dni, ArrayList<Usuario> u){
        int i=u.size();
        int b=0;
        int a=0;///variable encontrado
        Usuario user=new Usuario();
        while (b<i&&a<1){
            if (u.get(b).getDni()==dni){
                user=u.get(b);
                a=1;
            }
            else {
                b++;
            }
        }
        return user;
    }
    public static Usuario buscarUsuario(ArrayList<Usuario>u){
        Scanner scan=new Scanner(System.in);
        int i;
        Usuario user=new Usuario();
        System.out.println("\nIndique el dni: ");
        i=scan.nextInt();
        user=busquedaDeUsuarios(i,u);
        return user;
    }
    public static void comprarVuelo(Usuario user,ArrayList<Avion> a){
        int posVuelo=0;
        //Elegir el vuelo
        //user.historialVuelos.add(a.clone());
    }
    public static void cancelarVuelo(String fecha,Usuario user){
        int index=0;
        //Funcion buscar vuelo
        user.historialVuelos.remove(index);
    }

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
