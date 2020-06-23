package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Avion extends Empresa{
    private int capacidadDeCombustible;
    private int costoPorKM;           //aca pondria rand entre 150 y 300 o pondria un "precio" mediante un calculo .-Tommy
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private int tipoDePropulsor;  //lo cambie por un int y con un metodo determine cual es dependiendo de si es 1 2 o 3 (falta el metodo).-Tommy
    private int idAvion; // Esto va a servir para poder identificar el avion cuando se esta haciendo el cuestionario y otras cosas
    private int tarifaTipoAvion;


     Usuario usuario;


    public Avion() {
    }

    public Avion(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima, int tarifaTipoAvion) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = ThreadLocalRandom.current().nextInt(150,300+1); //en teoria esto deberia ser un rand entre 150 y 300 -Tommy
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = ThreadLocalRandom.current().nextInt(1,3+1);
        this.tarifaTipoAvion = tarifaTipoAvion;

    }


    public Avion getAvionPorid (int id, ArrayList<Avion> aviones){       //busca el avion por id -Tommy
        Avion a =new Avion();
        Avion aux = new Avion();                  //tira warning diciendo que es redundante pero si saco el new avion tira error xd -Tommy

        for (int i=0;i < aviones.size(); i++){
            aux = aviones.get(i);  // estoy seguro de que esto esta mal
            if (id == aux.getIdAvion() ){
                a=aux;
            }
        }

        return a;
    }

    public String mostrarTipoavion (Usuario u, Empresa e){          //muestra el tipo de avion mas alto -Tommy
        int j=0;
        int id= 0;
        Avion a = new Avion();
        String aux = new String();
        Cuestionario c = new Cuestionario();

        for(int i=0;i<u.historialVuelos.size();i++)
        {
            c= u.historialVuelos.get(i);              //algo me dice que estas 3 lineas estan mal -Tommy
            id= c.getIdAvion();
            a=getAvionPorid(id, e.aviones);

            if (a instanceof Bronze && j<=1){
                j=1;
            }else if (a instanceof Silver && j<=2){
                j=2;
            }else if (a instanceof Gold && j<=3){
                j=3;
            }
        }

        if (j == 1){
            aux= "Bronze";
        }else if (j == 2){
            aux= "Silver";
        }else if (j == 3){
            aux= "Gold";
        }

        return aux;
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

    public int getTipoDePropulsor() {
        return tipoDePropulsor;
    }

    public void setTipoDePropulsor(int tipoDePropulsor) {
        this.tipoDePropulsor = tipoDePropulsor;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    public int getTarifaTipoAvion() {
        return tarifaTipoAvion;
    }

    public void setTarifaTipoAvion(int tarifaTipoAvion) {
        this.tarifaTipoAvion = tarifaTipoAvion;
    }

    @Override
    public String toString() {
        return "Capacidad combustible: " + capacidadDeCombustible + " | Costo por km: " + costoPorKM + " | Max pasajeros: " + capacidadMaxDePasajeros + " | Velocidad max: " + velocidadMaxima + " | Tipo de propulsor: " + tipoDePropulsor;
    }



}