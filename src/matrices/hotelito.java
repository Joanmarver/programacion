package matrices;

import java.util.Scanner;

public class hotelito {
    public static void main(String[] args) {
        int[][] habitaciones = new int[12][5];
        matriz0(habitaciones);
        cobertura(habitaciones);
        mostrarmatriz(habitaciones);
    }

    public static void cobertura(int[][] habitaciones) {
        Scanner userprint = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Selecciona la planta de la habitación (del 1 al 12):");
        int planta = userprint.nextInt() - 1;
        System.out.println("Selecciona el número de la habitación (del 1 al 5):");
        int habitacion = userprint.nextInt() - 1;
        System.out.println("Selecciona la potencia del router:");
        int potencia = userprint.nextInt();

        // Colocar el router en la habitación seleccionada
        habitaciones[planta][habitacion] = potencia;

        // Aplicar la cobertura del router
        for (int i =0; i < habitaciones.length; i++){
            for(int j =0; j < habitaciones[i].length;j++){
                int distancia = Math.abs(i - planta) + Math.abs(j - habitacion);
                if (distancia <= potencia){
                    int cobertura = potencia - distancia;
                    habitaciones[i][j]= Math.max(habitaciones[i][j], cobertura);
                }
            }
        }
    }

    public static void mostrarmatriz(int[][] habitaciones) {
        // Mostrar la matriz
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                System.out.print(habitaciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matriz0(int[][] habitaciones) {
        // Inicializar todas las habitaciones con valor 0
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                habitaciones[i][j] = 0;
            }
        }
    }
}


