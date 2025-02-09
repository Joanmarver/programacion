package Objetos;

import java.util.Random;
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
                    mostrardatos(arrayclientes);
                    break;
                }
                case 4: {
                    nomina(arrayclientes);
                    break;
                }
                case 5: {
                    pago(arrayclientes);
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
        letraDNI=letraDNI.toUpperCase();
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
                userregistrado=true;

            }
        }



    }
    public static void registrarcuenta (PersonasCuenta[] arrayclientes){
        Scanner scanner= new Scanner(System.in);
        System.out.println("dime tu letra de DNI");
        String letraDNI= scanner.nextLine();
        letraDNI=letraDNI.toUpperCase();
        System.out.println("dime tu numero de DNI");
        int numDNI= scanner.nextInt();
        boolean usercreado=false;
        for (int i =0; i< arrayclientes.length && !usercreado;i++){
            if (arrayclientes[i]!=null&& arrayclientes[i].getNumDNI()== numDNI && arrayclientes[i].getletraDNI().equals(letraDNI)){
                System.out.println("vamos a añadir una cuenta asociada a tu cartera");
                System.out.println();
                System.out.println();
               arrayclientes[i].añadircuenta(arrayclientes[i].getCuentascorrientes(),arrayclientes[i]);
                System.out.println("para mostrar el numero de cuenta y sus datos pulse la opión numero 3");
                System.out.println("cuenta agregada a tu cartera");
                usercreado=true;

            }
        }
        if (!usercreado){
            System.out.println("usuario no encontrado");
        }



    }
    public static void mostrardatos(PersonasCuenta[] arrayclientes){
        Scanner scanner= new Scanner(System.in);
        System.out.println("dime tu letra de DNI");
        String letraDNI= scanner.nextLine();
        letraDNI=letraDNI.toUpperCase();
        System.out.println("dime tu numero de DNI");
        int numDNI= scanner.nextInt();
        for (PersonasCuenta persona:arrayclientes){
            if ( persona!=null&& persona.getNumDNI()== numDNI&& persona.getletraDNI().equals(letraDNI)){
                persona.Mostrardatos(persona);
            }
        }

    }
    public static void nomina(PersonasCuenta[] arrayclientes){
        Scanner scanner= new Scanner(System.in);
        System.out.println("dime tu letra de DNI");
        String letraDNI= scanner.nextLine();
        letraDNI=letraDNI.toUpperCase();
        System.out.println("dime tu numero de DNI");
        int numDNI= scanner.nextInt();
        System.out.println("numero de cuenta:");
        int numcuenta= scanner.nextInt();
        for (PersonasCuenta persona: arrayclientes){
            if ( persona!=null&& persona.getNumDNI()== numDNI&& persona.getletraDNI().equals(letraDNI)){
                for (Cuenta cuenta: persona.cuentascorrientes){
                    if ( cuenta!=null&&cuenta.getNumerocuenta()==numcuenta ){
                        cuenta.nomina(persona);
                    }
                }
            }
        }

    }
    public static void pago(PersonasCuenta[] arrayclientes){
        Random random =new Random();
        Scanner scanner= new Scanner(System.in);
        System.out.println("dime tu letra de DNI");
        String letraDNI= scanner.nextLine();
        letraDNI=letraDNI.toUpperCase();
        System.out.println("dime tu numero de DNI");
        int numDNI= scanner.nextInt();
        System.out.println("numero de cuenta:");
        int numcuenta= scanner.nextInt();
        for (PersonasCuenta persona: arrayclientes){
            if ( persona!=null&& persona.getNumDNI()== numDNI&& persona.getletraDNI().equals(letraDNI)){
                for (Cuenta cuenta: persona.cuentascorrientes){
                    if ( cuenta!=null&&cuenta.getNumerocuenta()==numcuenta ){
                        int paguita= random.nextInt(1000);
                        System.out.println("has recibido el siguiente pago : "+ paguita );
                        cuenta.abonos(paguita);
                    } else {
                        System.out.println("cuenta no encontrada");
                    }
                }
            } else {
                System.out.println("dni no encontrado");
            }
        }
    }
    public static void transferencia(PersonasCuenta[] arrayclientes){



            Scanner scanner = new Scanner(System.in);

            // Pedir datos de la cuenta de origen
            System.out.println("🔹 Introduce los datos de la cuenta que debe transferire");
            System.out.print("numero DNI : ");
            int DNInum = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            System.out.print("Letra del DNI : ");
            String letraDNI = scanner.nextLine().toUpperCase();

            System.out.print("Número de cuenta : ");
            int cuentaabono = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Pedir datos de la cuenta de destino
            System.out.println("\n🔹 Introduce los datos de la cuenta que debe recibir");
            System.out.print("numero DNI : ");
            int dniNUMdestino = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Letra del DNI : ");
            String letraDNIDestino = scanner.nextLine().toUpperCase();

            System.out.print("Número de cuenta del destinatario: ");
            int cuentaDestino = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Pedir monto a transferir
            System.out.print("\n💰 cantidad a transferir : ");
            int monto = scanner.nextInt();

            Cuenta cuentaSalida = null;
            Cuenta cuentaEntrada = null;

            // Buscar las cuentas en el array de clientes
            for (PersonasCuenta persona : arrayclientes) {
                if (persona != null) {
                    // Buscar cuenta de origen
                    if (persona.getNumDNI() == DNInum && persona.getletraDNI().equalsIgnoreCase(letraDNI)) {
                        for (Cuenta cuenta : persona.getCuentascorrientes()) {
                            if (cuenta != null && cuenta.getNumerocuenta() == cuentaabono) {
                                cuentaSalida = cuenta;
                            }
                        }
                    }

                    // Buscar cuenta de destino
                    if (persona.getNumDNI() == dniNUMdestino && persona.getletraDNI().equalsIgnoreCase(letraDNIDestino)) {
                        for (Cuenta cuenta : persona.getCuentascorrientes()) {
                            if (cuenta != null && cuenta.getNumerocuenta() == cuentaDestino) {
                                cuentaEntrada = cuenta;
                            }
                        }
                    }
                }
            }

            // Validaciones
            if (cuentaSalida == null) {
                System.out.println(" La cuenta de origen no existe.");
                return;
            }
            if (cuentaEntrada == null) {
                System.out.println(" La cuenta de destino no existe.");
                return;
            }
            if (cuentaSalida.getSaldodisponible() < monto) {
                System.out.println(" Saldo insuficiente en la cuenta de origen.");
                return;
            }

            // Realizar la transferencia
            cuentaSalida.recibos(monto);  // Restar dinero de la cuenta de origen
            cuentaEntrada.abonos(monto);  // Sumar dinero a la cuenta de destino

            System.out.println("Transferencia de " + monto + " realizada con éxito.");
            System.out.println("Nuevo saldo en cuenta origen (" + cuentaabono + "): " + cuentaSalida.getSaldodisponible());
            System.out.println("Nuevo saldo en cuenta destino (" + cuentaDestino + "): " + cuentaEntrada.getSaldodisponible());
        }

    }


