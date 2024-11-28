package ProgramacionModular;

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        System.out.println("1.Muestra el signo de un numero introducido por el usuario.");
        System.out.println("2.indica si el usuario es mayor de edad o no.");
        System.out.println("3.Calcula el area y el perimetro de un circulo");
        System.out.println("4.Conversor de euros a dolares y de dolares a euros");
        System.out.println("5.Mostrar la tabla de multiplicar de un numero");
        System.out.println("6.Mostrar tablas de multiplicar del 1 al 10. ");
        System.out.println("7.Comprobador de numeros primos");
        System.out.println("8.comprobador de fechas");
        System.out.println("9.dibujar triangulo");

        int respuesta = userprint.nextInt();
        switch(respuesta){
            case 1:{
                double fin;
                System.out.println("dime un numero");
                double num = userprint.nextInt();
                fin = ejer1.numberSign(num);
                if (fin == -1) System.out.println("es negativo");
                if (fin==1) System.out.println("es postivio");
                if (fin==0) System.out.println("es 0");
                break;
            }
            case 2:{
                boolean func;
                System.out.println("dime tu edad");
                int edad= userprint.nextInt();
                func=ejer2.isAdult(edad);
                if (func == true) System.out.println("es mayor de edad");
                if (func == false)System.out.println("es menor de edad");
                break;

            }
            case 3: {
                System.out.println("dime un radio valido");
                int rad = userprint.nextInt();
                boolean radioval;
                double perimetro;
                double area;
                perimetro = ejer3.calculateCirclePerimeter(rad);
                radioval = ejer3.validRadius(rad);
                area = ejer3.calculateCircleArea(rad);
                if (radioval == true) {
                    System.out.println("el perimetro es " + perimetro);
                    System.out.println("el area  es " + area);
                }else System.out.println("parametro invalido");
                break;

            }
            case 4: {
                double euros, dolares;
                System.out.println("Pulsa '1' para pasar de euros a dolares\n" + "Pulsa '2' para pasar de dolares a euros");
                double num = userprint.nextDouble();
                if (num == 1) {
                    System.out.println("dime la cantidad");
                    num = userprint.nextDouble();
                    dolares = ejer4.euro2dollar(num);
                    System.out.println("son " + dolares + " dolares");

                } else if (num==2) {
                    System.out.println("dime la cantidad");
                    num = userprint.nextDouble();
                    euros = ejer4.dollar2euro(num);
                    System.out.println("son "+ euros + " euros");

                }else System.out.println("numero invalido");
                break;

            }
            case 5: {

                System.out.println("dime un numero");
                double numero = userprint.nextDouble();
                ejer5.Tablamultiplicar(numero);
                break;

            }
            case 6: {
                int num=1;
                ejer6.tablas(num);
                break;

            }
            case 7: {

                boolean iniciobucle;
                iniciobucle = true;
                System.out.println("dime un numero. para salir pulsa '0'");
                while (iniciobucle){
                    double num = userprint.nextDouble();
                    if (num == 0) iniciobucle=false;
                    else ejer7.numeroprimo(num);


                }
                break;

            }
            case 8: {
                System.out.println("dime el dia");
                int dia = userprint.nextInt();
                System.out.println("dime el mes");
                int mes = userprint.nextInt();
                System.out.println("dime el año");
                int ano = userprint.nextInt();
                ejer8.FechaCorrecta(dia,mes,ano);
                break;

            }
            case 9:{

                System.out.println("dime el caracter");
                userprint.nextLine();
                String caracter = userprint.nextLine();
                System.out.println("dime el numero de lineas del triangulo");
                int lineas = userprint.nextInt();
                ejer9.Triangulo(caracter,lineas);
                break;

            }
            default:
                System.out.println("caracter incorrecto");
        }

    }
}

