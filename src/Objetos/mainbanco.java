package Objetos;

import java.util.Scanner;

public class mainbanco {
    public static void main(String[] args) {
        PersonasCuenta clienteuno;
        PersonasCuenta[] arrayclientes=new PersonasCuenta[9];
        boolean inicio=true;
        Scanner scaner= new Scanner(System.in);
        while(inicio) {
        System.out.println("bienvenido a tu banco. Porfavor elija la opción que mas desea");
        System.out.println("1. Registrarte en tu banco\n" + "2. Crearte una cartera (cuentas corrientes)\n" + "3. Mostrar tus datos\n" + "4. Recibir nomina mensual\n" + "5.Hacer un pago\n" + "6. Realizar transferencia\n" + "7.Imprimir personas morosas\n" + "8.salir" );
        int userprint= scaner.nextInt();

            switch (userprint) {
                case 1: {
                    registrar(arrayclientes);
                    break;
                }
                case 2: {
                    registrarcuenta(arrayclientes);
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
        boolean userduplicado=false;

        for (int i = 0; i < arrayclientes.length&& !userduplicado ; i++  ) {
            if (arrayclientes[i] != null && arrayclientes[i].getletraDNI().equals(letraDNI) && arrayclientes[i].getNumDNI() == DNI) {
                System.out.println("Usuario duplicado");
                userduplicado=true;
            }
        }
        boolean userregistrado=false;
        for (int i = 0; i < arrayclientes.length && !userregistrado; i++) {
            if (arrayclientes[i] == null) {
                arrayclientes[i] = personauno;
                System.out.println("Usuario registrado con éxito.");

            }
        }


        System.out.println("has quedado registrado");

    }
    public static void registrarcuenta (PersonasCuenta[] arrayclientes){
        Scanner scanner= new Scanner(System.in);
        System.out.println("dime tu letra de DNI");
        String letraDNI= scanner.nextLine();
        System.out.println("dime tu numero de DNI");
        int numDNI= scanner.nextInt();
        boolean usercreado=false;
        for (int i =0; i< arrayclientes.length && !usercreado;i++){
            if (arrayclientes[i]!=null&& arrayclientes[i].getNumDNI()== numDNI && arrayclientes[i].getletraDNI()==letraDNI){
                System.out.println("vamos a añadir una cuenta asociada a tu cartera");
               arrayclientes[i].añadircuenta(arrayclientes[i].getCuentascorrientes(),arrayclientes[i]);
                System.out.println("cuenta agregada a tu cartera");
                usercreado=true;

            }
        }
        if (!usercreado){
            System.out.println("usuario no encontrado");
        }



    }
    public static void mostrardatos(){

    }
}

