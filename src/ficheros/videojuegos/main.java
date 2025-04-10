package ficheros.videojuegos;

import ficheros.funkos.funkosnormal.Funko;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Videojuego>ranking= new ArrayList<>();
        boolean inicio=true;
        System.out.println("1.Añadir Videojuego\n "+ "2.Mostrar ranking completo\n" + "3. Eliminar videojuego\n"+ "4. Guardar ranking\n"+ "5. Cargar ranking desde fichero\n" + "6. Exportar ranking a texto\n" + "7. salir");
        int respuesta= scanner.nextInt();
        while (inicio){

        switch (respuesta){
            case 1:{
                break;
            }
            case 2:{
                break;
            }
            case 3:{
                break;
            }
            case 4:{
                break;

            }
            case 5:{
                break;
            }
            case 6:{
                break;
            }
            case 7:{
                inicio=false;
                break;
            }
        }
        }

    }
    public static void añadirVideojuego(List<Videojuego> ranking, Scanner scanner){
        Estado estadoJuego;
        System.out.println("videojuego a añadir :");
        System.out.println("1. Videojuego Fisico\n" + "2. Videojuego Digital");
        int game= scanner.nextInt();
        System.out.println("titulo :");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        System.out.println("plataforma : ");
        String plataforma= scanner.nextLine();
        System.out.println("nota :");
        int nota = scanner.nextInt();
        if (game==1){
            System.out.println("tienda de compra :");
            String tiendaDeCompra= scanner.nextLine();
            System.out.println("1. Juego Nuevo\n" + "2. Juego usado");
            int estado=scanner.nextInt();
            if (estado==1){
                estadoJuego= Estado.NUEVO;
                VideojuegoFisico juego= new VideojuegoFisico(titulo,plataforma,nota,tiendaDeCompra,estadoJuego);
                ranking.add(juego);

            }else if (estado ==2){
                System.out.println("tamañoGB:");
                double tamanio= scanner.nextDouble();
                estadoJuego= Estado.USADO;
                VideojuegoFisico juego= new VideojuegoFisico(titulo,plataforma,nota,tiendaDeCompra,estadoJuego);
                ranking.add(juego);
            }else {
                System.out.println("error al añadir juego");
            }

        }else if (game==2){
            System.out.println("tienda online :");
            String tiendaOnline= scanner.nextLine();
            System.out.println("tamañoGB:");
            double tamanio= scanner.nextDouble();
            VideojuegoDigitale juego= new VideojuegoDigitale(plataforma,titulo,nota,tiendaOnline,tamanio);
            ranking.add(juego);
        }
    }
    public static void mostrarVideoJuegos(List<Videojuego> ranking){
        ranking.sort(Comparator.comparingInt(Videojuego::getNota).reversed());
         for (Videojuego juego : ranking){
             System.out.println(juego);
         }

    }
    public static void guardarEnArchivo(List<Videojuego> ranking){
        String filename= "resources/Documentos/Videojuego/videojuego.dat";

        try(ObjectOutputStream ObjectIS= new ObjectOutputStream(new FileOutputStream(filename))){
            for (Videojuego videojuego: ranking){
                ObjectIS.writeObject(videojuego);
            }
            System.out.println("serializado correctamente");
        } catch (IOException e) {

        }
    }
    public static void cargarRanking (List<Videojuego>ranking){
        String filename= "resources/Documentos/Videojuego/videojuego.dat";

        try(ObjectInputStream ObjectIS= new ObjectInputStream(new FileInputStream(filename))){
            while (true){
                try{
                    Videojuego juego = (Videojuego) ObjectIS.readObject();
                    ranking.add(juego);
                } catch (EOFException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Videojuego juego:ranking){
            System.out.println(juego);
        }
    }

    public static void eliminarVideojuego(Scanner scanner, List<Videojuego>ranking){
        System.out.println("dime el nombre del videojuego");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (Videojuego juego: ranking){
            if (juego.getTitulo().equals(name)){
                ranking.remove(juego);
            }
        }

    }
    public static void ficherotxt(List<Videojuego> ranking ){
        Path path= Paths.get("resources/documentos/Videojuego/videojuego.txt");
        try {
            for (Videojuego juego: ranking){
                Files.writeString(path, juego.toString(), StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
