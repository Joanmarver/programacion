package ficheros.funkos;

import ficheros.serializacionejer.ejerfour.Persona;
import jdk.swing.interop.SwingInterOpUtils;

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
    public static void aniadirFunko(List<Funko> stock, Scanner scanner){
        try{
            System.out.println("dime el codigo del funko");
            String codigo = scanner.nextLine();
           if (!validar(stock,codigo)){
               System.out.println("Nombre del funko:");
               String nombre = scanner.nextLine();
               System.out.println("dime el modelo:");
               String modelo =  scanner.nextLine();
               System.out.println("dime el precio");
               int precio= scanner.nextInt();
               System.out.println("dime el año :");
               scanner.nextLine();
               String anio= scanner.nextLine();
               stock.add(new Funko(codigo,nombre,modelo,precio,anio));
           }else {
               System.out.println("el funko ya existe o has colocado mas el codigo");
           }



        }catch (Exception e){
            System.out.println("error en la entrada de datos");

        }

    }
    public  static void eliminarFunko(List<Funko> stock, Scanner scanner){
        try{
            System.out.println("dime el codigo del funko");
            String codigo = scanner.nextLine();
            for (Funko funko : stock){
                if (funko.getCodigo().equals(codigo)){
                    stock.remove(funko);
                    System.out.println("funko eliminado");

                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    public static boolean validar(List<Funko> stock, String codigo){
        for (Funko funko : stock){
            if (funko.getCodigo().equals(codigo)){
                return true;

            }
        }
        return false;
    }
    public static double mediaFunkos(List<Funko> stock){
        double total=0;
        for (Funko funko: stock){
            total += funko.getPrecio();
        }
        double media = total / stock.size();
        return media;
    }
}
