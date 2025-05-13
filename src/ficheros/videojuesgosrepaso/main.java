package ficheros.videojuesgosrepaso;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Videojuego> videojuegos= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean inicio = true;
        while(inicio){
        System.out.println("1. Añadir videojuego" +
                "\n 2. Mostrar ranking" +
                "\n 3. GUardar ranking" +
                "\n 4. Cargar ranking" +
                "\n 5. Eliminar Videojuego" +
                "\n 6. Exportar a texto " +
                "\n 0. Salir");
        int respuesta = scanner.nextInt();
        switch (respuesta){
            case 1:{
                aniadirVideojuego(scanner,videojuegos);
                break;
            }
            case 2:{
                mostrarRanking(videojuegos);
                break;
            }
            case 3:{
                guardarenbinario(videojuegos);
                break;
            }
            case 4:{
                cargaranking(videojuegos);
                break;
            }
            case 5:{

                eliminarVideojuego(scanner,videojuegos);
                break;
            }
            case 6 : {
                exportartexto(videojuegos);
                break;
            }
            case 0:{
                inicio = false;
                break;
            }
            default:
                System.out.println(" opción invalida");
        }

        }
    }
    public static void aniadirVideojuego(Scanner scanner ,ArrayList<Videojuego> videojuegos) throws BotaInvalidaException{
        String tiendacompra="";
        boolean inicio = true;
        System.out.println("titulo : ");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        System.out.println("plataforma :");
        String plataforma = scanner.nextLine();
        System.out.println("nota :");

        int nota = scanner.nextInt();
        if (nota < 1 || nota > 10){
            throw new BotaInvalidaException(" nota invalida");
        }
        while (inicio){
        System.out.println("1. fisico" +
                "\n 2. Digital");
        int respuesta = scanner.nextInt();
            if (respuesta == 1){
                System.out.println(" tienda de compra : ");
                scanner.nextLine();
                tiendacompra= scanner.nextLine();
                System.out.println("1. NUEVO " +
                        "\n 2. USADO");
                if (scanner.nextInt() == 1){
                    VideojuegoFisico videojuego = new VideojuegoFisico(titulo,plataforma,nota,tiendacompra,Estado.NUEVO);
                    videojuegos.add(videojuego);
                    inicio=false;
                }else if (scanner.nextInt() == 2){
                    VideojuegoFisico videojuego = new VideojuegoFisico(titulo,plataforma,nota,tiendacompra,Estado.USADO);
                    videojuegos.add(videojuego);
                    inicio= false;
                }else {
                    System.out.println("error al crear el videojuego ");
                }
            }else if (respuesta == 2){
                System.out.println("tienda online : ");
                scanner.nextLine();
                tiendacompra = scanner.nextLine();
                System.out.println("tamaño :");
                double tamanioGB = scanner.nextDouble();
                VideojuegoDigital videojuego = new VideojuegoDigital(titulo,plataforma,nota,tiendacompra,tamanioGB);
                videojuegos.add(videojuego);
                inicio= false;
            }else{
                System.out.println("opción invalida");
            }
        }
    }

    public static void mostrarRanking(ArrayList<Videojuego> videojuegos){
       for (Videojuego juego : videojuegos){
           System.out.println(juego.toString());
       }
    }
    public static void eliminarVideojuego (Scanner scanner, ArrayList<Videojuego> videojuegos ) throws  JuegoNoencontradoesceptionn{
        int juegoelimando= -1;
        System.out.println("titulo : ");
        scanner.nextLine();
        String titulo = scanner.nextLine();
        for (int i=0; i <videojuegos.size(); i++){
            if (videojuegos.get(i).getTitulo().equals(titulo)){
            juegoelimando = i;
            }else {
                throw new JuegoNoencontradoesceptionn("juego no encontrado");
            }
        }
        videojuegos.remove(juegoelimando);
    }
    public static void guardarenbinario (ArrayList<Videojuego> videojuegos){
        String filename= "resources/Documentos/Videojuego/videojuegorepaso/videojuego.dat";
        try(ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(filename))){
            for (Videojuego juego : videojuegos){
                os.writeObject(juego);
            }
            System.out.println("serializado correctamente");
        } catch (IOException e) {
            System.out.println("error al serializar " + e.getMessage());
        }
    }
    public static void cargaranking(ArrayList<Videojuego> videojuegos ){
        String filename="resources/Documentos/Videojuego/videojuegorepaso/videojuego.dat";
        boolean inicio= true;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            while (inicio){
                try{
                    Videojuego juego = (Videojuego) ois.readObject();
                    videojuegos.add(juego);
                } catch (EOFException e) {
                    inicio= false;
                } catch (ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("error al cargar ranking "+ e.getMessage());
        }
    }

    public static void exportartexto (ArrayList<Videojuego> videojuegos){
        String espacio = "\n ";
        try{
        Path file = Path.of("resources/Documentos/Videojuego/videojuegorepaso/videojuego.txt");
        for (Videojuego juego : videojuegos){
            Files.writeString(file,juego.toString());

        }} catch (IOException e) {
            System.out.println("error escribir en fichero" + e.getMessage());
        }
    }
}

