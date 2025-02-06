package Objetos;

import java.util.Scanner;

public class mainbanco {
    public static void main(String[] args) {
        PersonasCuenta clienteuno;
        PersonasCuenta[] arrayclientes=new PersonasCuenta[9];
        boolean inicio=true;
        Scanner scaner= new Scanner(System.in);
        System.out.println("bienvenido a tu banco. Porfavor elija la opción que mas desea");
        System.out.println("1. Registrarte en tu banco\n" + "2. Crearte una cartera (cuentas corrientes)\n" + "3. Mostrar tus datos\n" + "4. Recibir nomina mensual\n" + "5.Hacer un pago\n" + "6. Realizar transferencia\n" + "7.Imprimir personas morosas\n" + "8.salir" );
        int userprint= scaner.nextInt();
        while(inicio) {
            switch (userprint) {
                case 1: {
                    registrar(arrayclientes);
                    break;
                }
                case 2: {
                    registrarcuenta();
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8:{
                    inicio=false;
                    break;
                }
            }
        }
    }
    public static void registrar(PersonasCuenta[] arrayclientes){
        Scanner scaner=new Scanner(System.in);

        System.out.println("bienvenido");
        System.out.println("dime tu numero de DNI");
        int DNI = scaner.nextInt();
        System.out.println("dime tu Letra de DNI");
        scaner.nextLine();
        String letraDNI = scaner.nextLine();
        PersonasCuenta personauno= new PersonasCuenta(DNI,letraDNI);
        for (int i =0; i<arrayclientes.length;i++){
            if (arrayclientes[i]==null){
                arrayclientes[i]=personauno;
                i+= arrayclientes.length+1;
            }
        }
        System.out.println("has quedado registrado");

    }
    public static void registrarcuenta (PersonasCuenta[] arryclientes){
        registrar(arryclientes);


    }
}
