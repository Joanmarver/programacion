package ProgramacinEstructura;

import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);

        int elegirper;
        int velocidad1,velocidad2,ataque1,ataque2,defensa1,defensa2,vida1,vida2,total1,total2,totalata;
        boolean confirmar,inicio;
        int randomplus,totalata2;
        int plus;
        int totalataque;
        String espacio;
        confirmar = true;
        inicio = true;
        total1= 0;
        total2=0;

        int cont1, cont2,contF;
        cont1 = 1;
        cont2 = 1;
        contF = 1;
        Random random = new Random();
        while (inicio) {
        System.out.println("\n" +
                "\n" +
                "▗▄▄▖  ▗▄▖ ▗▖ ▗▖▗▄▄▄▖▗▖  ▗▖ ▗▄▖ ▗▖  ▗▖    ▗▄▄▄▖▗▄▄▄▖ ▗▄▄▖▗▖ ▗▖▗▄▄▄▖     ▗▄▄▖▗▄▄▄▖▗▖  ▗▖▗▖ ▗▖▗▖    ▗▄▖ ▗▄▄▄▖ ▗▄▖ ▗▄▄▖ \n" +
                "▐▌ ▐▌▐▌ ▐▌▐▌▗▞▘▐▌   ▐▛▚▞▜▌▐▌ ▐▌▐▛▚▖▐▌    ▐▌     █  ▐▌   ▐▌ ▐▌  █      ▐▌     █  ▐▛▚▞▜▌▐▌ ▐▌▐▌   ▐▌ ▐▌  █  ▐▌ ▐▌▐▌ ▐▌\n" +
                "▐▛▀▘ ▐▌ ▐▌▐▛▚▖ ▐▛▀▀▘▐▌  ▐▌▐▌ ▐▌▐▌ ▝▜▌    ▐▛▀▀▘  █  ▐▌▝▜▌▐▛▀▜▌  █       ▝▀▚▖  █  ▐▌  ▐▌▐▌ ▐▌▐▌   ▐▛▀▜▌  █  ▐▌ ▐▌▐▛▀▚▖\n" +
                "▐▌   ▝▚▄▞▘▐▌ ▐▌▐▙▄▄▖▐▌  ▐▌▝▚▄▞▘▐▌  ▐▌    ▐▌   ▗▄█▄▖▝▚▄▞▘▐▌ ▐▌  █      ▗▄▄▞▘▗▄█▄▖▐▌  ▐▌▝▚▄▞▘▐▙▄▄▖▐▌ ▐▌  █  ▝▚▄▞▘▐▌ ▐▌\n");
        espacio = userprint.nextLine();
        System.out.println("EXPLICACIÓN BASICA DE LAS REGLAS :" + "\n" + "CADA POKEMON TENDRÁ LOS SIGUIENTES ATRIBUTOS" );
        System.out.println("- VELOCIDAD"+"\n"+"-  ATAQUE"+"\n"+"-  DEFENSA"+"\n" + "-  PUNTOS DE VIDA");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
        espacio = userprint.nextLine();
        System.out.println("TENDRÁS LA OPCIÓN DE ELEGIR EL POKEMON O CREARTE U POKEMON PERSONALIZADO");
        System.out.println("SI DECIDES CREARTE UN POKEMON PERSONALIZADO TIENES QUE TEN EN CUENTA LO SIGUIENTE : ");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
            espacio = userprint.nextLine();
        System.out.println("LA SUMA DE LOS ATRIBUTOS DE UN JUGADOR NO PODRÁ SER SUPERIOR A 500.");
        System.out.println("CADA UNO DE LOS ATRIBUTOS DEBE TENER UN VALOR ENTRE 1 Y 200.");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
        espacio = userprint.nextLine();
        System.out.println("EN CADA UNO DE LOS TURNOS EL JUGADOR CON MAYOR VELOCIDAD HACE UN PRIMER ATAQUE\n" +
                "A CONTINUACIÓN, EL SEGUNDO JUGADOR (SI SU VIDA NO HA LLEGADO A 0)REALIZA SU ATAQUE\n");
        System.out.println("CADA ATAQUE QUITA PUNTOS DE VIDA AL CONTRINCANTE");
        System.out.println("CUANDO UNO DE LOS DOS JUGADORES VÉ REDUCIDA SU VIDA A 0 PIERDE LA PARTIDA\n" +
                "POR TANTO , GANA EL OTRO JUGADOR"+"\n");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
        espacio = userprint.nextLine();
        System.out.println("SI LO HABEIS ENTENDIDO PULSA '1' SI NO PULSA'2'");
        int conf = userprint.nextInt();
        if (conf == 1) {
            for (int i=0; i < 100; i++){
                System.out.println();
            }
            System.out.println("¡EMPEZAMOS!");

        } else if (conf == 2) {
            for (int i=0; i < 50; i++){
                System.out.println();
            }
            System.out.println("No os preocupeis, Os pongo otra vez las normas");
            continue;
        } else {
            System.out.println("ERROR, ELIGE UN NUMERO VALIDO");
            continue;
        };
            System.out.println("JUGADOR 1 :");
            System.out.println("SI DESEAS ELEGIR UN POKEMON PULSA '1'\n" + " SI DESEAS PERSONALIZAR TU PROPIO POKEMON PULSA '2'");
            elegirper = userprint.nextInt();
            if (elegirper == 1) {
                System.out.println("");
            }
            do {
                do {
                    System.out.println("VELOCIDAD");
                    velocidad1 = userprint.nextInt();
                    if (velocidad1 < 1 || velocidad1 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (velocidad1 < 1 || velocidad1 > 200);
                do {
                    System.out.println("ATAQUE");
                    ataque1 = userprint.nextInt();
                    if (ataque1 < 1 || ataque1 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (ataque1 < 1 || ataque1 > 200);
                do {
                    System.out.println("DEFENSA");
                    defensa1 = userprint.nextInt();
                    if (defensa1 < 1 || defensa1 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (defensa1 < 1 || defensa1 > 200);
                do {
                    System.out.println("VIDA:");
                    vida1= userprint.nextInt();
                    if (vida1 < 1 || vida1 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (vida1 < 1 || vida1 > 200);
                total1 = velocidad1 + ataque1 + defensa1 + vida1;
                if (total1 > 500) System.out.println("¡ERROR! los atributos no pueden pasar de 500, vuelve a comenzar");
            } while (total1 > 500);
 //-------------------------------------------------------------------------------------------------------------------------------------------------------
            System.out.println("AHORA ELEGIREMOS LOS ATRIBUTOS DEL JUGADOR 2");
            do {
                do {
                    System.out.println("VELOCIDAD");
                    velocidad2 = userprint.nextInt();
                    if (velocidad2 < 1 || velocidad2 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (velocidad2 < 1 || velocidad2 > 200);
                do {
                    System.out.println("ATAQUE");
                    ataque2 = userprint.nextInt();
                    if (ataque2 < 1 || ataque2 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (ataque2 < 1 || ataque2 > 200);
                do {
                    System.out.println("DEFENSA");
                    defensa2 = userprint.nextInt();
                    if (defensa2 < 1 || defensa2 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (defensa2 < 1 || defensa2 > 200);
                do {
                    System.out.println("VIDA:");
                    vida2= userprint.nextInt();
                    if (vida2 < 1 || vida2 > 200) {
                        System.out.println("VALOR INCORRECTO");
                    }
                }while (vida2 < 1 || vida2 > 200);
                total2 = velocidad2 + ataque2 + defensa2 + vida2;
                if (total2 > 500) System.out.println("¡ERROR! los atributos no pueden pasar de 500, vuelve a comenzar");
            } while (total2 > 500);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
// INICIAMOS RONDA
            System.out.println("LOS VALORES DE LOS JUGADORES ESTÁN PREDEFINIDOS");
            System.out.println("PARA COMENZAR PULSA ENTER");
            espacio = userprint.nextLine();
            espacio = userprint.nextLine();



            do {
                if (espacio.isEmpty()){
                    if (velocidad1 > velocidad2) {
                        if (cont1 == contF && cont2==contF){
                            System.out.println("COMENZAMOS LA RONDA" + contF);
                        }
                        System.out.println("ATACA EL JUGADOR 1");
                        cont1++;
                        contF++;
                        espacio = userprint.nextLine();
                        total1=ataque1 - defensa2;
                        if (total1 > 0) {
                            randomplus = random.nextInt(total1);
                            totalata = random.nextInt(ataque1);
                            totalataque = totalata +  randomplus;
                            System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE " + totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio = userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                            espacio = userprint.nextLine();
                        }else {
                            total1 = total1 * (-1);
                            randomplus = random.nextInt(total1);
                            totalata = random.nextInt(ataque1);
                            totalataque = totalata - randomplus;
                            if (totalataque < 0){
                                totalataque = 0;
                            }
                            System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                            espacio= userprint.nextLine();
                        }
                        if (vida1 <= 0) {
                            System.out.println("GANA EL JUGADOR 2");
                            continue;

                        } else if (vida2 <= 0) {
                            System.out.println("GANA EL JUGADOR 1");
                            inicio = false;
                            continue;

                        } else {
                            System.out.println("TURNO DEL siguiente jugador");
                            espacio = userprint.nextLine();
                        }

                        if (cont1 == contF && cont2==contF){
                            System.out.println("COMENZAMOS LA RONDA" + contF);
                        }
                        System.out.println("ATACA EL JUGADOR 2");
                        cont2++;

                        espacio = userprint.nextLine();
                        total2=ataque2 - defensa1;
                        if (total2 > 0) {
                            randomplus = random.nextInt(total2);
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata +  randomplus;
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE " + totalataque + " DAÑO");
                            vida1 = vida1 - totalataque;
                            espacio = userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio = userprint.nextLine();
                        }else if (total2 != 0){
                            total2 = total2 * (-1);
                            randomplus = random.nextInt(total2);
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata - randomplus;
                            if (totalataque < 0){
                                totalataque = 0;
                            }
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio= userprint.nextLine();
                        } else {
                            randomplus = 0;
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata - randomplus;
                            if (totalataque < 0){
                                totalataque = 0;
                            }
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio= userprint.nextLine();

                        }
                        if (vida1 <= 0) {
                            System.out.println("GANA EL JUGADOR 2");
                            inicio = false;
                            continue;

                        } else if (vida2 <= 0) {
                            System.out.println("GANA EL JUGADOR 1");
                            inicio = false;
                            continue;

                        } else {
                            System.out.println("TURNO DEL siguiente jugador");
                            espacio = userprint.nextLine();
                        }

                    }else {
                        if (cont1 == contF && cont2==contF){
                            System.out.println("COMENZAMOS LA RONDA" + contF);
                        }
                        System.out.println("ATACA EL JUGADOR 2");
                        cont1++;
                        contF++;
                        espacio = userprint.nextLine();
                        total2=ataque2 - defensa1;
                        if (total2 > 0) {
                            randomplus = random.nextInt(total2);
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata +  randomplus;
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE " + totalataque + " DAÑO");
                            vida1 = vida1 - totalataque;
                            espacio = userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio = userprint.nextLine();
                        }else if (total2 != 0){
                            total2 = total2 * (-1);
                            randomplus = random.nextInt(total2);
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata - randomplus;
                            if (totalataque < 0){
                                totalataque = 0;
                            }
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio= userprint.nextLine();
                        } else {
                            randomplus = 0;
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata - randomplus;
                            System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida2);
                            espacio= userprint.nextLine();

                        }
                        if (vida1 <= 0) {
                            System.out.println("GANA EL JUGADOR 2");
                            inicio = false;
                            continue;

                        } else if (vida2 <= 0) {
                            System.out.println("GANA EL JUGADOR 1");
                            inicio = false;
                            continue;

                        } else {
                            System.out.println("TURNO DEL siguiente jugador");
                            espacio = userprint.nextLine();
                        }
                        if (cont1 == contF && cont2==contF){
                            System.out.println("COMENZAMOS LA RONDA" + contF);
                        }
                        System.out.println("ATACA EL JUGADOR 1");
                        cont1++;
                        espacio = userprint.nextLine();
                        total1=ataque1 - defensa2;
                        if (total1 > 0) {
                            randomplus = random.nextInt(total1);
                            totalata = random.nextInt(ataque1);
                            totalataque = totalata +  randomplus;
                            System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE " + totalataque + " DAÑO");
                            vida1 = vida1 - totalataque;
                            espacio = userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                            espacio = userprint.nextLine();
                        }else if (total1 != 0){
                            total1 = total1 * (-1);
                            randomplus = random.nextInt(total1);
                            totalata = random.nextInt(ataque1);
                            totalataque = totalata - randomplus;
                            if (totalataque < 0) totalataque=0;
                            System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                            espacio= userprint.nextLine();
                        } else {
                            randomplus = 0;
                            totalata = random.nextInt(ataque2);
                            totalataque = totalata - randomplus;
                            System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                            vida2 = vida2 - totalataque;
                            espacio= userprint.nextLine();
                            System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                            espacio= userprint.nextLine();

                        }
                        if (vida1 <= 0) {
                            System.out.println("GANA EL JUGADOR 2");
                            inicio = false;
                            continue;

                        } else if (vida2 <= 0) {
                            System.out.println("GANA EL JUGADOR 1");
                            inicio = false;
                            continue;

                        } else {
                            System.out.println("TURNO DEL siguiente jugador");
                            espacio = userprint.nextLine();
                        }
                    }
                }
            }while (inicio);
            }

        }}



