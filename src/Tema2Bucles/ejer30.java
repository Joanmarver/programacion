package Tema2Bucles;
import java.util.Scanner;

public class ejer30 {
    public static void main(String[] args) {
        // ejercio importante!!
        Scanner usernum = new Scanner(System.in);
        String operacion;
        //
        while (true) {
            // Pedir primer número. Lo guardamos como string para que si usa la palabra "exit" pueda salir del programa
            System.out.print("Ingresa el primer número: ");
            String user = usernum.nextLine();
            // el if significa que si el usuario pone la palabra "exit" , salga el programa
            // "input.equalsIgnoreCase" significa que compara las striings sin tener en cuenta que estan en mayusculas o minusculas
            if (user.equalsIgnoreCase("exit")) break;
            // creamos la variable numero 1 para almacenar lo que hemos recibido
            double numero1;
            // comando try y catch : sirven para capturar errores. lo que estoy diciendo es que mire si lo que ha puesto es correcto.
            // ponemos el catch para que si hay algo incorrecto, decirle al usuario que su valor es invalido
            try {
                // le decimos que el valor string de la variable input, se almacene como double en "numero1"
                numero1 = Double.parseDouble(user);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                // el continue es para que si hay algun error , ignoremos todo lo demás y vuelva al principio
                continue;
            }

            // Pedir operación
            System.out.print("Ingresa una operación (+, -, *, /, %): ");
            operacion = usernum.nextLine();
            if (operacion.equalsIgnoreCase("exit")) break;
            // usamos el metodo matches para que compruebe si coincide o no con los caracteres de la variable operación
            // en este caso como delante de la variable esta el "!" significa que si no coincide , muestre el mensaje
            if (!operacion.matches("[+*/%]")) {
                System.out.println("Operación inválida. Intenta nuevamente.");
                continue;
            }

            // Pedir segundo número , igual  que el primero
            System.out.print("Ingresa el segundo número: ");
            user = usernum.nextLine();
            if (user.equalsIgnoreCase("exit")) break;

            double numero2;
            try {
                numero2 = Double.parseDouble(user);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta nuevamente.");
                continue;
            }

            // swith basico sobre la variable operación
            double resultado;
            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 == 0) {
                        System.out.println("Error: División entre cero.");
                        continue;
                    }
                    resultado = numero1 / numero2;
                    break;
                case "%":
                    if (numero2 == 0) {
                        System.out.println("Error: División entre cero.");
                        continue;
                    }
                    resultado = numero1 % numero2;
                    break;
                default:
                    System.out.println("Operación no reconocida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        usernum.close();
    }
}
