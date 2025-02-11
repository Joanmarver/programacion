package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejerciciouno {
    public static void main(String[] args) {
        boolean bucle=true;
        Set<String> listacompra= new HashSet<>();
        Set<String> carrocompra=new HashSet<>();
        Scanner userprint= new Scanner(System.in);
        System.out.println("bienvenido a tu compra\n"+ "1. añadir productos a la lista de la compra\n" + "2.añadir productos al carro de la compra"+ "3. que falta por comprar");
        int respuesta= userprint.nextInt();
        switch (respuesta){
            case 1:{
                productoslista(userprint,listacompra);
                break;
            }
            case 2:{
                productoscarro(userprint,listacompra);
                break;
            }
            case 3:{
                break;
            }
            default:
                System.out.println("opcion invalido");
        }
    }
    public static void productoslista(Scanner userprint , Set<String> listacompra){
        boolean bucle=true;
        System.out.println("para salir pulse 1");
        while (bucle) {

            String producto = userprint.nextLine();
            if (producto.equals("1")) {
                bucle = false;
            }
            if (listacompra.contains(producto)){
                System.out.println("producto duplicado");
            }else {
                listacompra.add(producto);
            }

        }
    }
    public static void productoscarro(Scanner userprint ,Set<String> carrocompra){
        boolean bucle=true;
        System.out.println("para salir pulse 1");
        while (bucle) {

            String producto = userprint.nextLine();
            if (producto.equals("1")) {
                bucle = false;
            }
            if (carrocompra.contains(producto)){
                System.out.println("producto duplicado");
            }else {
                carrocompra.add(producto);
            }

        }
    }
    public static void productosnocomprados(Set<String> carrocompra, Set<String> listacompra){
        Set<String>productosfaltan= new HashSet<>(listacompra);
        productosfaltan.removeAll(carrocompra);
        if (productosfaltan.isEmpty()){
            System.out.println("no te falta ningun producto");
        }else {
            System.out.println("te faltan los siguientes productos:");
            for (String producto : productosfaltan){
                System.out.println("-" + producto);
            }
        }
    }
}
