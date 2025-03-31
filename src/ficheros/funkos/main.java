package ficheros.funkos;

import ficheros.serializacionejer.ejerfour.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String funkocsv="resources/funko/funkos.csv";
        List<Funko> stock = new ArrayList<>();
        stockfunkos(stock,funkocsv);


    }
    public static void leercsv(List<Funko> stock, String archivocsv){
        String linea;
        try(BufferedReader br= new BufferedReader(new FileReader(archivocsv))){
          br.readLine();
            while ((linea= br.readLine()) != null){
              String[] valores = linea.split(",");

              String codigo= valores[0];
              String nombre= valores[1];
              String modelo= valores[2];
              double precio= Double.parseDouble(valores[3]);
              String anio= valores[4];
              stock.add(new Funko(codigo,nombre,modelo,precio,anio));


          }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    public static void stockfunkos (List<Funko> stock, String archivocsv){
        leercsv(stock, archivocsv);
        for (Funko funko: stock){
            System.out.println(funko);
        }
    }
    public static void aniadirFunko(List<Funko> stock){
        System.out.println("dime");
    }
}
