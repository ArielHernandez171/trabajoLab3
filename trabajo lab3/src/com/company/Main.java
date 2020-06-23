package com.company;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void pasarArchivoAArrayUsuarios(File f,Usuario A){
        ObjectMapper mapper = new ObjectMapper();
        try{
            A= mapper.readValue(f,Usuario.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void pasarArryUsuarioAFile(File f, ArrayList<Usuario> user){//Esto iria dentro de una funcion
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(f,user);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void pasarArchivoAArrayAviones(File f,Avion A){
        ObjectMapper mapper = new ObjectMapper();
        try{
            A= mapper.readValue(f,Avion.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void pasarArryAvionesAFile(File f,Avion a){//Esto iria dentro de una funcion
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(f,a);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        // Ni idea si los datos estan bien en los atributos, meti random, despues los checkeamos
        Empresa aeroTaxi = new Empresa();
        Gold avionGold = new Gold (1000, 100,50,1000, "Motor a reaccion",300, "BsAs", "Cordoba", "23/06/2020", true, true);
        Silver avionSilver = new Silver(1000, 250, 30, 700, "Motor Helice",250, "BsAs", "Santiago", "24/06/2020", true);
        Bronze avionBronze = new Bronze(600, 100, 15, 600, "Motor de pistones", 100, "BsAs", "Montevideo", "02/07/2020");

        aeroTaxi.aviones.add(avionGold);
        aeroTaxi.aviones.add(avionSilver);
        aeroTaxi.aviones.add(avionBronze);
        System.out.println(aeroTaxi.listarAviones());
    }
}
