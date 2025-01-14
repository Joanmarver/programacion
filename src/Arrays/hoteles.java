package Arrays;

import java.util.Scanner;

public class hoteles {
    public static void main(String[] args) {
        int[] habitaciones = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        mostrararray(habitaciones);

    }
    public static int[] cobertura(int[] habitaciones){

        Scanner userprint = new Scanner(System.in);
        System.out.println("Selecciona el  numero de habitacion");
        int respuesta = userprint.nextInt();
        System.out.println("selecciona la potencia del router");
        int respuestados = userprint.nextInt();
        habitaciones[respuesta]=respuestados;
        int asce = 1;
        for (int i = 0; i < respuestados; i++){

            habitaciones[respuesta + asce]= respuestados - asce;
            habitaciones[respuesta - asce]= respuestados - asce;

            asce++;
        }
        return habitaciones;
    }
    public static void mostrararray(int [] habitaciones){
        cobertura(habitaciones);
        for (int i = 0; i< habitaciones.length; i++ )
            System.out.print(habitaciones[i ] + ",");

    }
}
