package STrings;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        char[] palabraarray= new char[0];
        char[] arrayvisible= new char[0];
        char[] intentopalabraarray= new char[0];
        menujuego(palabraarray,arrayvisible,intentopalabraarray);

    }
    public static void menujuego(char[] palabraarray, char[] arrayvisible, char[] intentopalabraarray){
        int cont =0;
        boolean inicio=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("dime la palabra a adivinar (solo 5 letras)");
        String palabrabuena= scanner.nextLine();
        borrarpalabra();
        System.out.println("EMPECEMOS");
        while (inicio==true) {
            System.out.println("intenta adivinar la palabra:");

            String intentopalabra = scanner.nextLine();
            comprobación(palabraarray, arrayvisible, intentopalabraarray, palabrabuena, intentopalabra);


            cont++;
            if (cont>=5){
                inicio=false;
            }
        }
    }
    public static void borrarpalabra(){
        for (int i =0; i < 200; i++){
            System.out.println();
        }
    }
    public static void comprobación(char[]palabraarray,char[] arrayvisible, char[] intentopalabraarray  ,String palabrabuena, String intentopalabra){
        palabraarray = palabrabuena.toCharArray();
        arrayvisible = palabraarray;
        intentopalabraarray= intentopalabra.toCharArray();

        for (int i =0; i < palabraarray.length;i++){
            for (int j =0; j< intentopalabraarray.length; j++){
                if (palabraarray[i]== intentopalabraarray[j]){
                    if (i!=j){
                        intentopalabraarray[j]='*';
                    }else {
                        intentopalabraarray[j]= palabraarray[i];
                    }

                }
            }
        }
        for (int i =0; i < palabraarray.length;i++){
            for (int j =0; j< intentopalabraarray.length; j++){
                if (intentopalabraarray[j]!= palabraarray[i]&& intentopalabraarray[j]!='*' && j==i ){
                    intentopalabraarray[j]='_';
                }
            }
        }
        salida(intentopalabraarray,palabraarray,intentopalabra);


    }
    public static void salida(char[] intentopalabraarray,char[] palabraarray, String intentopalabra){
        boolean result = true;
        System.out.println("try: " + intentopalabra);

        System.out.print("hint: ");
        for (int i =0; i<intentopalabraarray.length;i++){
            System.out.print(intentopalabraarray[i]);
        }
        System.out.println();
        for (int i=0; i < palabraarray.length;i++){
            if (palabraarray[i]!=intentopalabraarray[i]){
                result=false;
            }
        }
        if (result==true){
            System.out.println("has ganado");
        }

    }
}
