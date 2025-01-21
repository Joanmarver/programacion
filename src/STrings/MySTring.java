package STrings;

import java.util.Locale;
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
            case 2: {
                System.out.println("dime una palabra");
                userprint.nextLine();
                String palabra= userprint.nextLine();
                int numvocales=numvocales(palabra);
                System.out.println(numvocales);
            }
            case 3: {
                System.out.println("dime una frase y te diré la palabra mas alta");
                userprint.nextLine();
                String frase = userprint.nextLine();
                String palabramasgrande= mayorlong(frase);
                System.out.println(palabramasgrande);
            }
            case 4:{
                System.out.println("dime una cadena");
                userprint.nextLine();
                String cadenauno = userprint.nextLine();
                System.out.println("dime la cadena que quieres buscar dentro de la primera");
                String cadenados = userprint.nextLine();
                int result = Cadenaincluida(cadenauno,cadenados);
                System.out.println("numero de veces que se repite la cadena: " + result);
            }
            case 5:{
                System.out.println("dime un cadena");
                userprint.nextLine();
                String cadena=userprint.nextLine();
                int result= numerodepalabra(cadena);
                System.out.println("numero de palabras: "+ result);

            }
            case 6:{
                System.out.println("dime tu numero de telefono");
                userprint.nextLine();
                String tel= userprint.nextLine();
                String result = numerotel(tel);
                System.out.println(result);
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
    public static int numvocales(String palabra){
        palabra = palabra.toLowerCase();
        int contvocales=0;

        for (int i =0; i< palabra.length();i++){

            if (palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='o' || palabra.charAt(i)=='u'){
                contvocales++;
            }
        }
        return contvocales;
    }
    public static String mayorlong(String palabra){
        String palabramayor;
        palabramayor=" ";
        String[] array=palabra.split(" ");
        for (int i = 0 ; i< array.length;i++){
            if (palabramayor.length() < array[i].length()){
                palabramayor=array[i];
            }
        }
        return palabramayor;
    }
    public static int Cadenaincluida(String fraseuno, String frasedos){
        int posicion = 0;
        int cont = 0;
        while ( (posicion= fraseuno.indexOf(frasedos, posicion)) != -1){
            cont++;
            posicion= posicion+frasedos.length();
        }
        return cont;
    }
    public static int numerodepalabra(String cadena){
        String[] array= cadena.split(" ");
        return array.length;
    }
    public static String numerotel(String numero){
        String codigopais,prefijo,restonumero;
        String num = String.valueOf(numero);
        codigopais ="(+" + num.substring(0,2) + ")";
        prefijo = "-" + num.substring(2,4)+ "-";
        restonumero = num.substring(5,10);
        String numerototal = codigopais + prefijo + restonumero;
        return numerototal;
    }
}

