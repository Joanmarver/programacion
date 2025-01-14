package matrices;

import java.util.Scanner;

public class hoteles {
    public static void main(String[] args) {
        int[][] habitaciones = new int[12][5];
        mostrarmatriz(habitaciones);

    }
    public static int[][] cobertura(int[] []habitaciones){

        Scanner userprint = new Scanner(System.in);
        System.out.println("Selecciona la planta de la habitacion (del 0 al 11)");
        int respuesta = userprint.nextInt();
        System.out.println("selecciona el numero de la habitación (del 0 al 4)");
        int respuestados= userprint.nextInt();
        System.out.println("selecciona la potencia del router");
        int respuestatres = userprint.nextInt();
        habitaciones[respuesta][respuestados]=respuestatres;
        int asce = 1;
        for (int i = 0; i < respuestatres; i++){
            if (respuesta - asce >= 0) {
                habitaciones[respuesta - asce][respuestados] = respuestatres - asce;
            }
            if (respuesta + asce < habitaciones.length) {
                habitaciones[respuesta + asce][respuestados] = respuestatres - asce;
            }
            if (respuestados - asce >= 0) {
                habitaciones[respuesta][respuestados - asce] = respuestatres - asce;
            }
            if (respuestados + asce < habitaciones[0].length) {
                habitaciones[respuesta][respuestados + asce] = respuestatres - asce;
            }

            asce++;

            asce++;
        }
        return habitaciones;
    }
    public static void mostrarmatriz(int [][] habitaciones){
        matriz0(habitaciones);
        cobertura(habitaciones);
        for (int i = 0; i< habitaciones.length; i++ )
            for (int j=0; j< habitaciones[i].length;j++){
            System.out.print(habitaciones[i][j] + ",");
            }

    }
    public static void matriz0(int[][]habitaciones){
        for (int i = 0; i<habitaciones.length;i++){
            for (int j=0;j<habitaciones[i].length;j++){
                habitaciones[i][j]=0;
            }
        }
    }
}

