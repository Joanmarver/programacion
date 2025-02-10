package colecciones.ejerdos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapa {
    public static void main(String[] args) {
        boolean inicio=true;
        Scanner userprint= new Scanner(System.in);
        Map<String,Usuario> usuarios= new HashMap<>();
        System.out.println("bienvenido");
        while (inicio){
        System.out.println("1.darse de alta/baja\n" + "2.mostrar datos de un Usuario\n" + "3.modificar usuarios\n" + "4 salir");
        int respuesta = userprint.nextInt();
        switch (respuesta){
            case 1:{
                System.out.println("1. dar de alta\n"+ "2. dar de baja");
                respuesta = userprint.nextInt();
                switch (respuesta){
                    case 1:{
                        alta(userprint,usuarios);
                        break;
                    }
                    case 2:{
                        baja(userprint,usuarios);
                    }
                    default:
                        System.out.println("opción no valida");
                }

                break;
            }
            case 2:{
                mostrarusuario(userprint,usuarios);
                break;
            }
            case 3:{
                modificaruser(userprint,usuarios);
                break;
            }
            case 4: {
                inicio=false;
            }
            default:
                System.out.println(" error");
        }
        }
    }
    public static void alta(Scanner userprint, Map<String,Usuario> usuarios){
        System.out.println("dime tu nombre ");
        userprint.nextLine();
        String name= userprint.nextLine();
        System.out.println("dime tu edad");
        int age= userprint.nextInt();
        System.out.println("dime tu dni");
        userprint.nextLine();
        String dni= userprint.nextLine();
        Usuario client=new Usuario(name,age);
        if (usuarios.containsKey(dni)){
            System.out.println("usuario ya existe con este dni");
        }else {
            System.out.println("usuario creado");
            usuarios.put(dni,client);
        }

    }
    public  static void baja(Scanner userprint, Map<String,Usuario> usuarios){
        System.out.println("dime tu DNI");
        userprint.nextLine();
        String dni= userprint.nextLine();
        if (usuarios.containsKey(dni)){
            usuarios.remove(dni);
            System.out.println("usuario eliminado correctamente");
        }else {
            System.out.println("no existe el usuario");
        }
    }
    public static void mostrarusuario(Scanner userprint, Map<String,Usuario> usuarios){
        System.out.println("dime tu DNI");
        userprint.nextLine();
        String dni= userprint.nextLine();
        if (usuarios.get(dni)!=null){
            System.out.println(usuarios.get(dni));

        }else {
            System.out.println("usuario no encontrado");

        }
    }
    public static void modificaruser(Scanner userprint,Map<String,Usuario> usuarios){
        System.out.println("dime tu DNI");
        userprint.nextLine();
        String dni= userprint.nextLine();
        if (usuarios.containsKey(dni)){
            Usuario user= usuarios.get(dni);
            System.out.println(" dime el nombre nuevo");
            String name = userprint.nextLine();
            System.out.println(" dime la edad ");
            int age=userprint.nextInt();
            user.setNombre(name);
            user.setEdad(age);
            System.out.println("datos cambiados");
        }
    }

}
