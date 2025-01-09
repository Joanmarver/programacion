package Arrays;
import java.util.Scanner;

public class Myarray {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[] array = {1,2,3};
        int[] array2 = {1,2,3};
        System.out.println("1.Imprimir array\n" + "2.Maximo array\n" + "3.Minimo array\n" + "4.Media array\n" + "5.Elemento Existente\n" + "6.Suma Vectores\n" +"7.Resta de vectores\n"+ "8.Producto vectores\n"+ "9.Invertir array\n"+ "10.capicua");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                array =CrearArray(array);
                ImprimirArray(array);

                break;
            }
            case 2:{
                array =CrearArray(array);
                int total = MaxArray(array);
                System.out.println(total);
                break;
            }
            case 3:{
                array =CrearArray(array);
                int total = MinArray(array);
                System.out.println(total);
                break;
            }
            case 4:{
                array =CrearArray(array);
                double total = MediaArray(array);
                System.out.println(total);
                break;
            }
            case 5: {
                System.out.println("dime un numero ");
                respuesta= userprint.nextInt();
                boolean total = SINOArray(array,respuesta);
                System.out.println(total);
                break;
            }
            case 6:{
                array =CrearArray(array);
               array2 = CrearArray(array);
                int total= SumarVectores(array, array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 7:{
                array =CrearArray(array);
                array2 = CrearArray(array2);
                int total= RestarVectores(array, array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 8:{
                array =CrearArray(array);
                array2 = CrearArray(array2);
                int total= ProductoVectores(array, array2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 9:{
                array =CrearArray(array);
                ImprimirArray(array);
               InvertirArray(array);
                break;
            }
            case 10:{
                array =CrearArray(array);
                boolean total =Capicua(array);
                System.out.println("capicua:" + total);
                break;
            }
        }

    }

public static int[]CrearArray(int[] array){
        Scanner userprint = new Scanner(System.in);
    System.out.println("dime la cantidad de celdas");
    int respuesta = userprint.nextInt();
    array = new int [respuesta];
    for (int i = 0; i < respuesta; i++) {
        System.out.print("Ingrese el valor para la celda " + (i + 1) + ": ");
        array[i] = userprint.nextInt(); // Asignar valor a cada celda
    }
return array;
}

    // Método para imprimir los elementos de un array
    public static void ImprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
    }
}
    public static int MaxArray(int[] array){
        int maximo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo){
                maximo = array[i];
            }
        }
        return maximo;
    }
    public static int MinArray(int[] array){
        int minimo = MaxArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        return minimo;
    }
    public static double MediaArray(int[] array){
        int total = 0;

        for (int i = 0; i < array.length; i++) {
                total = total + array[i];
            }
        return (double)total / array.length;

        }
    public static boolean SINOArray(int[] array, int A){
        boolean result;
        result = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == A){
                result = true;
            }
        }
        return  result;
    }
    public  static int SumarVectores(int[]array, int[] array2){
       int totalA1 = 0;
       int totalA2 = 0;
        for (int i = 0; i < array.length; i++){
            totalA1 = totalA1 + array[i];
       }
        for (int i = 0; i < array2.length; i++){
            totalA2= totalA2 + array2[i];
        }
        totalA1 = totalA2 + totalA1;
        return totalA1;
    }
    public static int RestarVectores(int[]array, int[] array2){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < array.length; i++){
            totalA1 = totalA1 + array[i];
        }
        for (int i = 0; i < array2.length; i++){
            totalA2= totalA2 + array2[i];
        }
        totalA1 = totalA1 - totalA2;
        return totalA1;
    }
    public static int ProductoVectores(int[]array, int[]array2){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < array.length; i++){
            totalA1 = totalA1 + array[i];
        }
        for (int i = 0; i < array2.length; i++){
            totalA2= totalA2 + array2[i];
        }
        totalA1 = totalA1 * totalA2;
        return totalA1;
    }
    public static void InvertirArray(int[] array) {
        int inicio = 0;
        int finali= array.length - 1;

        while (inicio < finali) {

            int temp = array[inicio];
            array[inicio] = array[finali];
            array[finali] = temp;


            inicio++;
            finali--;
        }
        ImprimirArray(array);
    }
    public static boolean Capicua(int[] array){
        int inicio = 0;
        int finali= array.length -1;
        while (inicio < finali) {
            if (array[inicio] != array[finali]) {
                return false;
            }
            finali--;
            inicio++;
        }

        return true;
    }
}


