package com.company;

import java.util.Scanner;

public class Cuestionario {
    private String fecha;
    private String origen;
    private String destino;
    private int cantAcomp;
    private Avion avion;
    private int idAvion;
    private int idContrato; // ID del contrato, o sea de la compra del vuelo
    private float costoVuelo;
    Usuario usuario;

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

    public int calculoDestino (){             //dependiendo de los strings va a ser un valor u otro, es llamada por calculo costo -Tommy
        int rta= 0;
        int i;
        int j;
        String bs = new String("BsAs");
        String cor= new String("Cordiba");
        String san = new String("Santiago");
        String monte = new String("Montevideo");

        if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(cor)) == 0 ){
            rta = 695;
        }else if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 1400;
        }else if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(monte)) == 0 ){
            rta = 950;
        }else if ( (i=origen.compareTo(cor)) == 0 && (j=destino.compareTo(monte)) == 0 ){
            rta = 1190;
        }else if ( (i=origen.compareTo(cor)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 1050;
        }else if ( (i=origen.compareTo(monte)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 2100;
        }

        return rta;
    }


    public int calculoCosto (Avion a, int acomp){                       // calcula el costo final del vuelo -Tommy
        int destino=calculoDestino();


        int i= ((destino* a.getCostoPorKM()) + (acomp * 3500) + a.getTarifaTipoAvion());


        return i;
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
        System.out.println("Ingrese cantidad de acompañantes: ");
        cantAcomp = scan.nextInt();

                                                    // aca voy a poner una llamada a un metodo que cree un avion con datos rand -Tommy
        costoVuelo=calculoCosto(avion, cantAcomp);

        // aca ahora deberia buscar los aviones disponibles para la fecha y SUPONGO que tambien que coincida con el destino y origen

        // Despues aca vendria llamar al metodo para calcular el costo, mañana lo hago gg, seria algo como "costoVuelo = calcularCosto" y se llama al metodo
    }

    @Override
    public String toString()
    {
        return "Origen: " +origen+ " | Destino: " +destino+ " | Cantidad de acompañantes: " +cantAcomp+ " | ID Avion: " +idAvion+ " | ID Contrato: " +idContrato +"\n";
    }
}
