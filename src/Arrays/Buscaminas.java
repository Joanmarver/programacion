package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        int[] buscaminas= new int[20];
        juego1(buscaminas);
    }
    public static void minas(int[] buscaminas){
        Random random= new Random();
        int minastotales=6;
        int cont=0;
        int mina = -1;
        while (cont < minastotales){
            int numale= random.nextInt(20);

            if (buscaminas[numale] != mina){
                buscaminas[numale]= mina;
                cont++;
            }
        }


    }
    public static void posicionnum(int[] buscaminas){
        minas(buscaminas);


        for (int i= 0; i< buscaminas.length; i++){
            int cont=0;
            if (buscaminas[i]==-1)continue;
            if(i > 0 && buscaminas[i - 1] == -1) cont++;
            if(i < 19  && buscaminas[i + 1]== -1) cont++;
            buscaminas[i] = cont;
        }



    }
    public static void juego(int[]buscaminas){
        Boolean result = false;
        Scanner userprint= new Scanner(System.in);
        posicionnum(buscaminas);
        System.out.println("BIENVENIDO AL BUSCA MINAS");

        System.out.println("elige la primera celda");
        int respuesta = userprint.nextInt();
        if (buscaminas[respuesta] == -1){
            System.out.println("FALLASTES . HAS PERDIDO");
        }else {
            System.out.println("SEGUIMOS");


        }
    }
    public static void juego1(int[]buscaminas){
        posicionnum(buscaminas);
        Scanner userprint= new Scanner(System.in);
        boolean todasReveladas = false;
        boolean perdio = false;
        boolean[] visibles= new boolean[20];

        while (!todasReveladas && !perdio) {
            // Mostrar el tablero actual
            System.out.println("\nTablero:");
            for (int i = 0; i < 20; i++) {
                if (visibles[i]) {
                    if (buscaminas[i] == -1) {
                        System.out.print("*\t"); // Mina
                    } else {
                        System.out.print(buscaminas[i] + "\t"); // Número
                    }
                } else {
                    System.out.print("?\t"); // Casilla no revelada
                }
            }
            System.out.println();

            // Pedir al jugador que seleccione una posición
            System.out.print("Selecciona una posición (0-19): ");
            int posicion = userprint.nextInt();

            // Verificar si la posición es válida
            if (posicion < 0 || posicion >= 20 || visibles[posicion]) {
                System.out.println("Posición inválida o ya revelada. Intenta de nuevo.");
                continue;
            }

            // Revelar la posición seleccionada
            visibles[posicion] = true;
            if (buscaminas[posicion] == -1) {
                System.out.println("HAS PERDIDO");
                perdio = true; // Si es una mina, pierde
            }


            todasReveladas = true;
            for (int i = 0; i < 20; i++) {
                if (buscaminas[i] != -1 && !visibles[i]) {
                    todasReveladas = false;
                    break;
                }
            }
        }
        if (todasReveladas==true) System.out.println("HAS GANADO");
    }

}
