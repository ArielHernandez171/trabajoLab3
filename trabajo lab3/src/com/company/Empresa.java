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


    public String mostrarTipoavion (Usuario u){  // esto en teoria revisaria la LISTA DE VUELOS DEL USUARIO
        int a = 0;                               // y se fijaria de que tipo es, dependiendo de eso, devuelve el mas alto. -Tommy
        String aux = new String();


        for(int i=0;i<u.historialVuelos.size();i++)
        {
            if (u.historialVuelos.get(i) instanceof Bronze && a<=1){
                a=1;
            }else if (u.historialVuelos.get(i) instanceof Silver && a<=2){
                a=2;
            }else if (u.historialVuelos.get(i) instanceof Gold && a<=3){
                a=3;
            }
        }

        if (a == 1){
            aux= "Bronze";
        }else if (a == 2){
            aux= "Silver";
        }else if (a == 3){
            aux= "Gold";
        }

        return aux;
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
