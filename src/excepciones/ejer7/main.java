package excepciones.ejer7;

import excepciones.ejerseis.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Gato> arrayGato=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        boolean bucle = true;
        int cont=0;
        while (bucle){
            System.out.println("dime el nombre");
            String nombre=scanner.next();
            System.out.println("dime la edad");
            int edad= scanner.nextInt();
            try {
              Gato gato=new Gato(nombre,edad);
              arrayGato.add(gato);
              cont++;
            }catch (Exception e){
                System.out.println("error:"+ e.getMessage());
            }
            if (cont>=5){
                bucle=false;
            }
        }
        mostrar(arrayGato);
    }
    public static void mostrar(List<Gato> arrayGato){
        for (Gato gato:arrayGato){
            System.out.println(gato.toString());
        }
    }
}
