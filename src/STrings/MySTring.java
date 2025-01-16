package STrings;

import java.util.Scanner;

public class MySTring {
    public static void main(String[] args) {
        Scanner userprint= new Scanner(System.in);
        System.out.println("1.cadena invertida y mayusculas\n" + "2.Numero vocales\n" + "3.mayor longitud\n" + "4.");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1: {
                String palabrafinal=mayus();
                System.out.println(palabrafinal);
            }
        }
    }
    public static String invertir(String palabra) {

            char[] caracteres = palabra.toCharArray(); // Convertir a arreglo de caracteres
            int decrec = palabra.length() - 1; // Ultimo indice

            for (int i = 0; i < decrec; i++) {
                char temp = caracteres[i];
                caracteres[i] = caracteres[decrec];
                caracteres[decrec] = temp;
                decrec--;
            }
            return new String(caracteres); // Convertir de nuevo a cadena

    }
    public static String mayus(){
        Scanner userprint= new Scanner(System.in);
        System.out.println("dime una palabra");
        String respuesta = userprint.next();

        String palabra= invertir(respuesta);
        palabra=palabra.toUpperCase();
    return palabra;
    }
}
