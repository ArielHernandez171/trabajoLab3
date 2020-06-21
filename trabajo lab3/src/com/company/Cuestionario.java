package com.company;

import java.util.Scanner;

public class Cuestionario {
    private String fecha;
    private String origen;
    private String destino;
    private int cantAcomp;
    private int idAvion;
    private int idContrato; // ID del contrato, o sea de la compra del vuelo
    private float costoVuelo;

    public Cuestionario() {
    }

    public Cuestionario(String fecha, String origen, String destino, int cantAcomp, int idAvion, int idContrato, float costoVuelo) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantAcomp = cantAcomp;
        this.idAvion = idAvion;
        this.idContrato = idContrato;
        this.costoVuelo = costoVuelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public int getCantAcomp() {
        return cantAcomp;
    }

    public void setCantAcomp(int cantAcomp) {
        this.cantAcomp = cantAcomp;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public float getCostoVuelo() {
        return costoVuelo;
    }

    public void setCostoVuelo(float costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public void contratarAvion() // Este es el metodo para contratar un avion, un vuelo, btw mañana pregunto si se pueden meter Prints en los metodos
    {
        // El metodo lo hice void momentaneamente pero tiene que ser de tipo Cuestionario
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la fecha deseada para el vuelo: ");
        fecha = scan.nextLine(); // Esto no se si esta bien, tipo el "fecha" quizas tiene que ser "setFecha" o algo así, Lo mismo para las demas cosas
        System.out.println("Ingrese el origen: ");
        origen = scan.nextLine();
        System.out.println("Ingrese el destino: ");
        destino = scan.nextLine();

        // aca ahora deberia buscar los aviones disponibles para la fecha y SUPONGO que tambien que coincida con el destino y origen

        // Despues aca vendria llamar al metodo para calcular el costo, mañana lo hago gg, seria algo como "costoVuelo = calcularCosto" y se llama al metodo
    }

    @Override
    public String toString()
    {
        return "Origen: " +origen+ " | Destino: " +destino+ " | Cantidad de acompañantes: " +cantAcomp+ " | ID Avion: " +idAvion+ " | ID Contrato: " +idContrato +"\n";
    }
}
