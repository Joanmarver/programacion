package ficheros.videojuegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        System.out.println("videojuego a añadir :");
        System.out.println("1. Videojuego Digital\n" + "2. Videojuego Fisico");
        int game= scanner.nextInt();
        System.out.println("plataforma : ");
        String plataforma= scanner.nextLine();
        System.out.println("nota :");
        int nota = scanner.nextInt();
        if (game==1)
    }
}
