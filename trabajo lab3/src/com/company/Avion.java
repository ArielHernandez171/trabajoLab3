package com.company;

public class Avion {
    private int capacidadDeCombustible;
    private int costoPorKM;           //aca pondria rand entre 150 y 300 o pondria un "precio" mediante un calculo .-Tommy
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private String tipoDePropulsor;  //cambiaria esto por un int y con un metodo determine cual es dependiendo de si es 1 2 o 3.-Tommy
    private int tarifaTipoAvion;

    private String origen;           //las variables de aca para abajo estan como place holder mas que nada por el uml.-Tommy
    private String destino;          //estan en sus respectivos construcctores -Tommy

    private String fecha;            //fecha creo que va aca porque despues pid mostrar aviones disponibles por fecha, asi es mas facil

    private Ususario ususario;


    public Avion() {
    }

    public Avion(int capacidadDeCombustible, int costoPorKM, int capacidadMaxDePasajeros, int velocidadMaxima, String tipoDePropulsor, int tarifaTipoAvion, String origen, String destino, String fecha) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = costoPorKM;
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = tipoDePropulsor;
        this.tarifaTipoAvion = tarifaTipoAvion;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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