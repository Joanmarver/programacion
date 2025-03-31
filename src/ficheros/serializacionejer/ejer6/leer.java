package ficheros.serializacionejer.ejer6;

import ficheros.serializacionejer.ejerfour.Persona;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class leer {
    public static void main(String[] args) {
        List<Persona> datospersona= new ArrayList<>();
        String filename= "personas.dat";
        try(ObjectInputStream ObjectIS= new ObjectInputStream(new FileInputStream(filename))){
            datospersona= (List<Persona>) ObjectIS.readObject();
            for (Persona dato: datospersona){
            System.out.println(dato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
    }
}}
