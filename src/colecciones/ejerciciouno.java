package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ejerciciouno {
    public static void main(String[] args) {
        boolean bucle=true;
        Set<String> listacompra= new HashSet<>();
        Scanner userprint= new Scanner(System.in);
        System.out.println("bienvenido a tu lista de la compra. Agrega los productos necesarios. para salir pulsa 1");
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
}
