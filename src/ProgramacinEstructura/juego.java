package ProgramacinEstructura;

import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);


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
        int cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        Random random = new Random();
        while (inicio) {
        System.out.println("Hola, bienvenidos a FIGHT SIMULATOR4");
        System.out.println("Explicación basica de las reglas :" + "\n" + "Tendremos los siguientes atributos:" );
        System.out.println("-  Velocidad"+"\n"+"-  Ataque"+"\n"+"-  Defensa"+"\n" + "-  Puntos de vida");
        System.out.println("La suma de los atributos de un jugador no podrá ser superior a 500");
        System.out.println("ada uno de los atributos debe tener un valor entre 1 y 200 ");
        System.out.println("En cada uno de los turnos el jugador con mayor velocidad hace un primer\n" +
                "ataque, a continuación el segundo jugador (si su vida no ha llegado a cero)\n" +
                "realiza su ataque.");
        System.out.println("Cada ataque quita puntos de vida al contrincante");
        System.out.println("Cuando uno de los dos jugadores vé reducida su vida a cero pierde la\n" +
                "partida, por tanto gana el otro jugador"+"\n");
        System.out.println("Si lo habeis entendo pulsa '1' si no pulsa '2'");
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
            System.out.println("Vamos a elegir los atributos de los personajes. Emezaremos con los atributos del juegador 1: ");
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

            if (espacio.isEmpty()) {
                if (velocidad1 > velocidad2) {
                    System.out.println("ATACA EL JUGADOR 1");
                    cont1++;
                    espacio = userprint.nextLine();
                    System.out.println("HASTA AQUI BIEN");
                    total1 = ataque1 - defensa2;
                    if (total1 > 0) {
                        randomplus = random.nextInt(0, total1);
                        totalata = random.nextInt(ataque1);
                        totalataque = totalata + 10;
                        System.out.println("EL JUGADOR 1 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida2 = vida2 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 2 " + vida2);
                        espacio = userprint.nextLine();
                    } else {
                        total1 = total1 * (-1);
                        totalata = random.nextInt(ataque1);
                        totalata = totalata - 10;
                        if (totalata < 0) totalata = 0;
                        System.out.println("EL JUGADOR 1 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida2 = vida2 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 2 " + vida2);
                        espacio = userprint.nextLine();

                    }

                } else {
                    System.out.println("ATACA EL JUGADOR 2");
                    espacio = userprint.nextLine();
                    cont2++;
                    total1 = ataque2 - defensa1;
                    if (total1 > 0) {

                        totalata = random.nextInt(ataque2);
                        totalata = totalata + 10;
                        System.out.println("EL JUGADOR 2 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida1 = vida1 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                        espacio = userprint.nextLine();
                    } else {

                        totalata = random.nextInt(ataque2);
                        totalata = totalata - 10;
                        if (totalata < 0) totalata = 0;
                        System.out.println("EL JUGADOR 2 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida1 = vida1 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                        espacio = userprint.nextLine();
                    }
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


                if (cont1 < cont2) {
                    System.out.println("ATACA EL JUGADOR 1");
                    espacio = userprint.nextLine();
                    total1 = ataque1 - defensa2;
                    cont1++;
                    if (total1 >= 0) {
                        totalata = random.nextInt(ataque1);
                        totalata = totalata + 10;
                        System.out.println("EL JUGADOR 1 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida2 = vida2 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 2 " + vida2);
                        espacio = userprint.nextLine();
                    } else {
                        totalata = random.nextInt(10, ataque1);
                        totalata = totalata - 10;
                        if (totalata < 0) totalata = 0;
                        System.out.println("EL JUGADOR 1 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida2 = vida2 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 2 " + vida2);
                        espacio = userprint.nextLine();

                    }

                } else {
                    System.out.println("ATACA EL JUGADOR 2");
                    espacio = userprint.nextLine();
                    total1 = ataque2 - defensa1;
                    cont2++;
                    if (total1 >= 0) {
                        totalata = random.nextInt(ataque2);
                        totalata = totalata + 10;
                        System.out.println("EL JUGADOR 2 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida1 = vida1 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                        espacio = userprint.nextLine();
                    } else {
                        totalata = random.nextInt(10, ataque2);
                        totalata = totalata - 10;
                        if (totalata < 0) totalata = 0;
                        System.out.println("EL JUGADOR 2 LANZA UN  ATAQUE DE " + totalata + " DAÑO");
                        vida1 = vida1 - totalata;
                        espacio = userprint.nextLine();
                        System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                        espacio = userprint.nextLine();
                    }
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
                    System.out.println("SIGUIENTE RONDA");
                    espacio = userprint.nextLine();
                }
            }
            continue;




              /*  switch (totalvel){
                    case 0: {
                        Random random = new Random();
                        if (velocidad1 > velocidad2) {
                        totalvel = random.nextInt(ataque1);
                        }else {
                            totalvel = random.nextInt(ataque2);
                        }
                    }
                    case 1:{
                        Random random = new Random();
                        if (velocidad1 > velocidad2) {
                            totalvel = random.nextInt(ataque1) + 10;
                        }else {
                            totalvel = random.nextInt(ataque2) + 10;
                        }
                    }
                    case 2:{
                        Random random = new Random();
                        if (velocidad1 > velocidad2) {
                            totalvel = random.nextInt(ataque1) + 20;
                        }else {
                            totalvel = random.nextInt(ataque2) + 20;
                        }



               */

                }while (vida1 > 0 || vida2 > 0);
            }

        }}



