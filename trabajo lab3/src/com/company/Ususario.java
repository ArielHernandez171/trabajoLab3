package com.company;

import java.util.HashSet;

public class Ususario {

    private int tarifaxPersona;
    private String nombre;
    private int edad;
    private int dni;
    private String apellido;
    HashSet<Avion> aviones = new HashSet<>();


    public Ususario() {
    }

    public Ususario(int tarifaxPersona, String nombre, int edad, int dni, String apellido) {
        this.tarifaxPersona = 3500;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
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

    public void setAviones(Avion avion){               //basicamente mete un avion en la "lista" de aviones activados que tiene el user.-Tommy
            aviones.add(avion);
    }


}
