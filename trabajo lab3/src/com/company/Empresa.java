package com.company;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Avion> aviones;
    ArrayList<Usuario> usuarios;

    public Empresa() {
        aviones = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public String listarAviones() // Metodo que lista TODOS los aviones .-Lautaro
    {
        StringBuilder a = new StringBuilder();
        for(Avion avion : aviones)
        {
            a.append(avion.toString());
        }
        return a.toString();
    }

    public String listarUsuarios() // Metodo que lista TODOS los usuarios .-Lautaro
    {
        StringBuilder a = new StringBuilder();
        for(Usuario usuario : usuarios)
        {
            a.append(usuario.toString());
        }
        return a.toString();
    }
}
