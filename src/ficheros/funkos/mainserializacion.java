package ficheros.funkos;

import ficheros.funkos.funkosnormal.Funko;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class mainserializacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String funkocsv="resources/funko/funkos.csv";
        Path filePath = Paths.get(funkocsv);
        List<Funko> stock = new ArrayList<>();
        leercsv(stock,funkocsv);
        boolean inicio=true;
        while (inicio){
            System.out.println("1. Añadir Funko\n"+"2.Borrar funko\n"+"3.Mostrar funkos\n"+ "4.Mostrar Funko mas caro\n"+"5.Mostrar media de precios\n"+ "6.Mostrar funkos por modelos\n"+ "7.Funkos 2023\n" +"8.salir");
            int respuesta=scanner.nextInt();
            switch (respuesta){
                case 1:{
                    aniadirFunko(stock,scanner);
                    break;
                }
                case 2:{
                    eliminarFunko(stock,scanner);
                    break;
                }
                case 3:{
                    stockfunkos(stock,funkocsv);
                    break;
                }
                case 4:{
                    funkCaro(stock);
                    break;
                }
                case 5:{
                    double media = mediaFunkos(stock);
                    System.out.println(media);
                    break;
                }
                case 6:{
                    funkosPorModelo(stock);
                    break;
                }
                case 7:{
                    funkos2023(stock);
                    break;
                }
                case 8:{
                    inicio=false;
                    break;
                }
            }
            escribircsv(stock,filePath);
        }




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
                LocalDate anio= LocalDate.parse(valores[4]);
                stock.add(new Funko(codigo,nombre,modelo,precio,anio));


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void stockfunkos (List<Funko> stock, String archivocsv){

        for (Funko funko: stock){
            System.out.println(funko);
        }
    }
    public static void aniadirFunko(List<Funko> stock, Scanner scanner){
        try{
            System.out.println("dime el codigo del funko");
            scanner.nextLine();
            String codigo = scanner.nextLine();
            if (!validar(stock,codigo)){
                System.out.println("Nombre del funko:");
                String nombre = scanner.nextLine();
                System.out.println("dime el modelo:");
                String modelo =  scanner.nextLine();
                System.out.println("dime el precio");
                double precio= scanner.nextDouble();
                System.out.println("dime el año :");
                scanner.nextLine();
                LocalDate anio= LocalDate.parse(scanner.nextLine());
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
            scanner.nextLine();
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
    public static void funkCaro(List<Funko> stock){
        double funkoCaro=0;
        for (Funko funko : stock){
            if (funkoCaro<funko.getPrecio()){
                funkoCaro=funko.getPrecio();
            }
        }
        System.out.println("funkos mas caros :");
        for (Funko funko: stock){
            if (funko.getPrecio()==funkoCaro){
                System.out.println(funko);
            }
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
        return total / stock.size();

    }
    public static void funkosPorModelo(List<Funko>stock){
        Map<String,List<Funko>> funkosModelo= new HashMap<>();
        for (Funko funko: stock){
            funkosModelo.putIfAbsent(funko.getModelo(), new ArrayList<>());
            funkosModelo.get(funko.getModelo()).add(funko);
        }
        for (String modelo: funkosModelo.keySet()){
            System.out.println("modelo: " + modelo);
            for (Funko funko : funkosModelo.get(modelo)){
                System.out.println(funko.getNombre());
            }
        }
    }
    public static void funkos2023(List<Funko> stock){
        List<Funko>funkofiltrado=new ArrayList<>();
        for (Funko funko: stock){
            if (funko.getAnio().getYear()==2023){
                funkofiltrado.add(funko);
            }
        }
        for (Funko funko: funkofiltrado){
            System.out.println(funko);
        }
    }
    public static void escribircsv(List<Funko> stock, Path archivocsv){
        String filename= "resources/Documentos/funkos/funkos.dat";

        try(ObjectOutputStream ObjectIS= new ObjectOutputStream(new FileOutputStream(filename))){
            for (Funko funko: stock){
                ObjectIS.writeObject(funko);
            }
            System.out.println("serializado correctamente");
        } catch (IOException e) {

    }
}
}
