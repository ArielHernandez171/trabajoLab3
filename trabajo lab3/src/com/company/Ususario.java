package com.company;

public class Ususario {
    private String nombre;
    private int edad;
    private int dni;
    private String apellido;
    private int tarifa;

    public Ususario() {
        nombre = "";
        edad = 0;
        dni = 0;
        apellido = "";
        tarifa=3500;
    }
    public Ususario(String nombre, int edad, int dni, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        tarifa=3500;
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

    @Override
    public String toString() {
        return "Ususario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}
