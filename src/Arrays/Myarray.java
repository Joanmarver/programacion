package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Myarray {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[] Array = {1,2,3};
        int[] Array2 = {1,2,3};
        System.out.println("1.Imprimir Array\n" + "2.Maximo Array\n" + "3.Minimo Array\n" + "4.Media Array\n" + "5.Elemento Existente\n" + "6.Suma Vectores\n" +"7.Resta de vectores\n"+ "8.Producto vectores");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                Array=CrearArray(Array);
                ImprimirArray(Array);

                break;
            }
            case 2:{
                Array=CrearArray(Array);
                int total = MaxArray(Array);
                System.out.println(total);
                break;
            }
            case 3:{
                Array=CrearArray(Array);
                int total = MinArray(Array);
                System.out.println(total);
                break;
            }
            case 4:{
                Array=CrearArray(Array);
                double total = MediaArray(Array);
                System.out.println(total);
                break;
            }
            case 5: {
                System.out.println("dime un numero ");
                respuesta= userprint.nextInt();
                boolean total = SINOArray(Array,respuesta);
                System.out.println(total);
                break;
            }
            case 6:{
                Array=CrearArray(Array);
               Array2= CrearArray(Array);
                int total= SumarVectores(Array,Array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 7:{
                Array=CrearArray(Array);
                Array2= CrearArray(Array2);
                int total= RestarVectores(Array,Array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 8:{
                Array=CrearArray(Array);
                Array2= CrearArray(Array2);
                int total= ProductoVectores(Array,Array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 9:{
                Array=CrearArray(Array);
                ImprimirArray(Array);
               InvertirArray(Array);
                break;
            }
            case 10:{

            }
        }

    }

public static int[]CrearArray(int[] Array){
        Scanner userprint = new Scanner(System.in);
    System.out.println("dime la cantidad de celdas");
    int respuesta = userprint.nextInt();
    Array = new int [respuesta];
    for (int i = 0; i < respuesta; i++) {
        System.out.print("Ingrese el valor para la celda " + (i + 1) + ": ");
        Array[i] = userprint.nextInt(); // Asignar valor a cada celda
    }
return Array;
}

    // Método para imprimir los elementos de un array
    public static void ImprimirArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
    }
}
    public static int MaxArray(int[] Array){
        int maximo = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > maximo){
                maximo = Array[i];
            }
        }
        return maximo;
    }
    public static int MinArray(int[] Array){
        int minimo = MaxArray(Array);
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < minimo){
                minimo = Array[i];
            }
        }
        return minimo;
    }
    public static double MediaArray(int[] Array){
        int total = 0;

        for (int i = 0; i < Array.length; i++) {
                total = total + Array[i];
            }
        return (double)total / Array.length;

        }
    public static boolean SINOArray(int[] Array, int A){
        boolean result;
        result = false;
        for (int i = 0; i < Array.length; i++){
            if (Array[i] == A){
                result = true;
            }
        }
        return  result;
    }
    public  static int SumarVectores(int[]Array, int[] Array2){
       int totalA1 = 0;
       int totalA2 = 0;
        for (int i = 0; i < Array.length; i++){
            totalA1 = totalA1 + Array[i];
       }
        for (int i = 0; i < Array2.length; i++){
            totalA2= totalA2 + Array2[i];
        }
        totalA1 = totalA2 + totalA1;
        return totalA1;
    }
    public static int RestarVectores(int[]Array, int[] Array2){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < Array.length; i++){
            totalA1 = totalA1 + Array[i];
        }
        for (int i = 0; i < Array2.length; i++){
            totalA2= totalA2 + Array2[i];
        }
        totalA1 = totalA1 - totalA2;
        return totalA1;
    }
    public static int ProductoVectores(int[]Array, int[]Array2){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < Array.length; i++){
            totalA1 = totalA1 + Array[i];
        }
        for (int i = 0; i < Array2.length; i++){
            totalA2= totalA2 + Array2[i];
        }
        totalA1 = totalA1 * totalA2;
        return totalA1;
    }
    public static void InvertirArray(int[] Array) {
        int inicio = 0;
        int finali= Array.length - 1;

        while (inicio < finali) {

            int temp = Array[inicio];
            Array[inicio] = Array[finali];
            Array[finali] = temp;


            inicio++;
            finali--;
        }
        ImprimirArray(Array);
    }
    public static boolean Capicua(int[]Array){
        boolean capicua = true;
        int inicio = 0;
        int finali= Array.length-1;
        for (int i= 0; i< finali;i ++) {
            if (Array[inicio] != Array[finali]) {
                capicua = false;
            }
            finali--;
        }
        return capicua;
    }
}


