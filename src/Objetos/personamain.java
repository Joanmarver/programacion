package Objetos;

import java.util.Scanner;

public class personamain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //pedir datos persona1
        //LETRA DNI
        System.out.println("DATOS PERSONA \n" + "Letra DNI:");
        String letra = scanner.nextLine();
        //NUM DNI
        System.out.println("NUMERO DNI:");
        int dni = scanner.nextInt();
        // apellidos
        System.out.println("Apellidos");
        scanner.nextLine();
        String apellidos = scanner.nextLine();
        // nombre
        System.out.println("Nombre");
        String nombre =scanner.nextLine();

        // edad
        System.out.println("edad:");
        int edad = scanner.nextInt();
       Persona personauno = new Persona(letra,dni,apellidos,edad,nombre);
        // mostrar información de la persona
        personauno.print();
        // saber si es menor o mayor de edad
        personauno.isAdult();
        // saber si está jubilado
        personauno.isRetired();

        //pedir datos persona2
        //LETRA DNI
        System.out.println("DATOS PERSONA \n" + "Letra DNI:");
        scanner.nextLine();
        String letrados = scanner.nextLine();

        //NUM DNI
        System.out.println("NUMERO DNI:");
        int dnidos = scanner.nextInt();

        // apellidos
        System.out.println("Apellidos");
        scanner.nextLine();
        String apellidosdos = scanner.nextLine();

        // nombre
        System.out.println("Nombre");
        String nombredos =scanner.nextLine();

        // edad
        System.out.println("edad:");
        int edaddos = scanner.nextInt();
        Persona personados = new Persona(letrados,dnidos,apellidosdos,edaddos,nombredos);
        int diferenciaedad= personauno.ageDifference(personados);
        System.out.println("la diferencia de edad es: "+ diferenciaedad);
    }
}
