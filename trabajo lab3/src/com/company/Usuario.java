package com.company;

import java.util.ArrayList;

public class Usuario extends Empresa {

    private int tarifaxPersona;
    private String nombre;
    private int edad;
    private int dni;
    private String apellido;
    ArrayList<Cuestionario> historialVuelos;

    public Usuario(){
        tarifaxPersona=0;
        nombre="";
        edad=0;
        apellido="";
        dni=0;
    }
    public Usuario(String nombre, int edad, int dni, String apellido) {
        this.tarifaxPersona = 3500;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        historialVuelos = new ArrayList<>();
    }

    public int getTarifaxPersona() {
        return tarifaxPersona;
    }

    public void setTarifaxPersona(int tarifaxPersona) {
        this.tarifaxPersona = tarifaxPersona;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verHistorial() // Era de tipo Avion pero la cambie por una de tipo "Reserva" ya que ahi van los datos .-Lautaro
    {
        StringBuilder a = new StringBuilder();
        for(Cuestionario cuestionario : historialVuelos)
        {
            a.append(cuestionario.toString());
        }
        return a.toString();
    }

}
