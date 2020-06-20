package com.company;

import java.util.HashSet;

public class Empresa {
    HashSet<Avion> aviones = new HashSet<>();
    HashSet<Ususario> usuarios = new HashSet<>();

    public Empresa() {
    }

    public void setAviones (Avion avion){
        aviones.add(avion);
    }

    public void setUsuarios(Ususario usuario){
        usuarios.add(usuario);
    }

}
