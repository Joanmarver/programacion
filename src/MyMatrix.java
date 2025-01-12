package matrices;
import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[][] matriz;
        int[][] matriz2;
        System.out.println("1.Imprimir matriz\n" + "2.Maximo matriz\n" + "3.Minimo matriz\n" + "4.Media matriz\n" + "5.Elemento Existente\n" + "6.Suma matrices\n" +"7.Resta de matrices\n"+ "matriz unidad\n");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                matriz = CrearMatriz();
                ImprimirMatriz(matriz);

                break;
            }
            case 2:{
                matriz =CrearMatriz();
                int total = maxmatriz(matriz);
                System.out.println(total);
                break;
            }
            case 3:{
                matriz=CrearMatriz();
                int total = minmatriz(matriz);
                System.out.println(total);
                break;
            }
            case 4:{
                matriz =CrearMatriz();
                double total = mediamatriz(matriz);
                System.out.println(total);
                break;
            }
            case 5: {
                matriz =CrearMatriz();
                System.out.println("dime un numero ");
                respuesta= userprint.nextInt();
                boolean total = sinomatriz(matriz,respuesta);
                System.out.println(total);
                break;
            }
            case 6:{
                matriz = CrearMatriz();
                matriz2 = CrearMatriz();
                int total= Sumarmatrices(matriz, matriz2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 7:{
                matriz=CrearMatriz();
                matriz2 = CrearMatriz();
                int total= restarmatrices(matriz, matriz2);
                System.out.println("resultado total:" + total);
                break;
            }
            case 8:{
                matriz=CrearMatriz();
                boolean result = matrizunidad( matriz);
                System.out.println("matriz unidad: " + result);
            }
        }

    }

    public static int[][] CrearMatriz(){
        Scanner userprint = new Scanner(System.in);
        System.out.println("dime la cantidad de filas");
        int respuesta = userprint.nextInt();
        System.out.println("dime la cantidad de columnas");
        int respuesta2= userprint.nextInt();
        System.out.println();
        int[][] matriz = new int [respuesta][respuesta2];
        for (int i = 0; i < respuesta; i++) {
            for (int j = 0 ; j < respuesta2;j++){
                System.out.println("ingrese el valor para cada celda");
                matriz[i][j]= userprint.nextInt();
            }
        }
        return matriz;
    }

    // Método para imprimir los elementos de un array
    public static void ImprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0;j< matriz[i].length;i++){
                System.out.print(matriz[i][j]);
            }
        }
    }
    public static int maxmatriz(int[][] matriz){
        int maximo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0;i<matriz[i].length;j++)
            if (matriz[i][j] > maximo){
                maximo = matriz[i][j];
            }
        }
        return maximo;
    }
    public static int minmatriz(int[][]matriz){
        int minimo = maxmatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j =0; i<matriz[i].length;i++){
                if (matriz[i][j] < minimo){
                    minimo = matriz[i][j];
                }
            }

        }
        return minimo;
    }
    public static double mediamatriz(int[][] matriz){
        int total = 0;
        int contfilas=0;
        int contcolumnas=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j<matriz[i].length; j++){
            total = total + matriz[i][j];
            contcolumnas++;
            }
            contfilas++;
        }
        int totalt = contfilas+contcolumnas;
        return (double)total / totalt;

    }
    public static boolean sinomatriz(int[][] matriz, int A){
        boolean result;
        result = false;
        for (int i = 0; i < matriz.length; i++){
            for (int j=0;j < matriz[i].length; i++){
                if (matriz[i][j] == A){
                    result = true;
                }
            }
        }
        return  result;
    }
    public  static int Sumarmatrices(int[][]matriz, int[][] matriz2){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0 ; i<matriz[i].length; i++){
                totalA1 = totalA1 + matriz[i][j];
            }

        }
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0 ; i<matriz2[i].length;j++)
            totalA2= totalA2 + matriz2[i][j];
        }
        totalA1 = totalA2 + totalA1;
        return totalA1;
    }
    public static int restarmatrices(int[][]matriz, int[][]matriz2 ){
        int totalA1 = 0;
        int totalA2 = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0 ; i<matriz[i].length; i++){
                totalA1 = totalA1 + matriz[i][j];
            }

        }
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0 ; i<matriz2[i].length;j++)
                totalA2= totalA2 + matriz2[i][j];
        }
        totalA1 = totalA1-totalA2;
        return totalA1;
    }
    public static boolean matrizunidad(int[][]matriz){
        boolean result = true;
        int contfilas=matriz.length;
        int contcolumnas=matriz[0].length;

        if (contfilas == contcolumnas){
            for (int i=0; i<matriz.length;i++){
                for (int j=0; j<matriz[i].length;j++){
                    if(i==j){
                        if (matriz[i][j] !=1){
                            result = false;
                        }
                    }else {
                        if (matriz[i][j]!=0){
                            result=false;
                        }
                    }
                }
            }
        }else {
            result=false;
        }
        return result;

    }

}
