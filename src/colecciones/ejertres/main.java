package colecciones.ejertres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<usuario> cola= new ArrayList<>();
        boolean inicio=true;
        while(inicio) {
            System.out.println("1. añadir a la cola\n" + "2. eliminar persona ya atendida\n" + "3. eliminar persona\n" + "4. mostrar cola\n" + "5. salir");
            int respuesta = scanner.nextInt();
            switch (respuesta) {
                case 1: {
                    añadir(scanner, cola);
                    break;
                }
                case 2: {
                    eliminarprimero(scanner, cola);
                    break;
                }
                case 3: {
                    eliminarpersona(scanner, cola);
                    break;
                }
                case 4: {
                    mostrarcola(cola);
                    break;
                }
                default: inicio=false;
            }
        }
    }
    public static void añadir( Scanner userprint ,List<usuario> cola){
        System.out.println("nombre : ");
        userprint.nextLine();
        String name = userprint.nextLine();
        System.out.println("dni : ");
        String dni = userprint.nextLine();
        dni = dni.toUpperCase();
        System.out.println("edad");
        int age = userprint.nextInt();
        if (cola.contains(dni)){
            System.out.println("usuario ya registrado");
        }else {
            cola.add(new usuario(age, name, dni));
        }
    }
    public static void eliminarprimero( Scanner userprint , List<usuario> cola){
        System.out.println("si esta persona ya ha sido atendida pulse 1");
        userprint.nextLine();
        int respuesta= userprint.nextInt();
        if (respuesta ==1){
            cola.removeFirst();
        }

    }
    public static void eliminarpersona(Scanner userprint, List<usuario> cola){
        System.out.println("dime el dni:");
        userprint.nextLine();
        String dni= userprint.nextLine();
        for (int i =0; i < cola.size();i++){
            if (cola.get(i).getDni().equalsIgnoreCase(dni)){
                cola.remove(i);
            }
        }
    }
    public static void mostrarcola(List<usuario> cola){
        for (usuario user:cola){
            System.out.println(user.toString());
        }
    }
}
