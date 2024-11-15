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
        int bucleout = 0;
        velocidad1 = 0;
        velocidad2 = 0;
        ataque1 = 0;
        ataque2 = 0;
        defensa1 = 0;
        defensa2 = 0;
        vida1 = 0;
        vida2 = 0;

        int cont1, cont2,contF;
        cont1 = 1;
        cont2 = 1;
        contF = 1;
        Random random = new Random();
        // esto es el MENÚ
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
            //ELECCIÓN DE PERSONAJES
            System.out.println("SI DESEAS ELEGIR UN POKEMON PULSA '1'\n" + "SI DESEAS PERSONALIZAR TU PROPIO POKEMON PULSA '2'");
            elegirper = userprint.nextInt();

            switch (elegirper){
                case 1: {
                    do {


                    System.out.println("PARA ELEGIR EL POKEMON ESCRIBE EL NUMERO AL QUE ESTAN ASOCIADOS. ESTOS SON LOS POKEMONS DISPONIBLES:");
                    espacio = userprint.nextLine();
                    espacio = userprint.nextLine();
                    System.out.println("1.MEWTWO \n" + "2.ZAMAZENTA \n" + "3.MOLTRES\n" + "4.ETERNATUS\n" + "5.GYARADOS\n" + "6.ZAPDOS\n" + "7.CHARIZARD\n" + "8.ARTICUNO\n" + "9.ARCEUS\n" + "10.LUCARIO");
                    elegirper = userprint.nextInt();

                    switch (elegirper) {
                        case 1: {
                            System.out.println("HAS ELEGIDO A MEWTWO");
                            System.out.println("MEWTWO TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 100\n" + "DEFENSA : 75\n" + "VIDA : 125");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 200;
                                ataque1 = 100;
                                defensa1 = 75;
                                vida1 = 125;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 2 : {
                            System.out.println("HAS ELEGIDO A ZAMAZENTA");
                            System.out.println("ZAMAZENTA TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 100\n" + "ATAQUE : 130\n" + "DEFENSA : 170\n" + "VIDA : 100");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 100;
                                ataque1 = 130;
                                defensa1 = 170;
                                vida1 = 100;
                            }
                            else bucleout = 0;
                            break;

                        }
                        case 3 : {
                            System.out.println("HAS ELEGIDO A MOLTRES");
                            System.out.println("MOLTRES TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 120\n" + "DEFENSA : 120\n" + "VIDA : 80");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 180;
                                ataque1 = 120;
                                defensa1 = 120;
                                vida1 = 80;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 4 : {
                            System.out.println("HAS ELEGIDO A ETERNATUS");
                            System.out.println("ETERNATUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 100");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 120;
                                ataque1 = 200;
                                defensa1 = 80;
                                vida1 = 100;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 5 : {
                            System.out.println("HAS ELEGIDO A GYARADOS");
                            System.out.println("GYARADOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 220\n" + "DEFENSA : 80\n" + "VIDA : 120");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 80;
                                ataque1 = 220;
                                defensa1 = 80;
                                vida1 = 120;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 6 : {
                            System.out.println("HAS ELEGIDO A ZAPDOS");
                            System.out.println("ZAPDOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 150\n" + "DEFENSA : 100\n" + "VIDA : 70");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 180;
                                ataque1 = 150;
                                defensa1 = 100;
                                vida1 = 70;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 7 : {
                            System.out.println("HAS ELEGIDO A CHARIZARD");
                            System.out.println("CHARIZARD TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 120\n" + "VIDA : 100");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 80;
                                ataque1 = 200;
                                defensa1 = 120;
                                vida1 = 100;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 8 : {
                            System.out.println("HAS ELEGIDO A ARTICUNO");
                            System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 150\n" + "DEFENSA : 75\n" + "VIDA : 75");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 200;
                                ataque1 = 150;
                                defensa1 = 75;
                                vida1 = 75;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 9: {
                            System.out.println("HAS ELEGIDO A ARCEUS");
                            System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 130\n" + "ATAQUE : 100\n" + "DEFENSA : 170\n" + "VIDA : 100");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 130;
                                ataque1 = 100;
                                defensa1 = 170;
                                vida1 = 100;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 10: {
                            System.out.println("HAS ELEGIDO A LUCARIO");
                            System.out.println("LUCARIO TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 140\n" + "DEFENSA : 90\n" + "VIDA : 150");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                velocidad1 = 120;
                                ataque1 = 140;
                                defensa1 = 90;
                                vida1 = 150;
                            }
                            else bucleout = 0;
                            break;
                        }
                        default: {
                            System.out.println("ERROR");
                        }
                    }

                    }while (bucleout == 0);

                    System.out.println("TURNO DEL JUGADOR 2");
                    System.out.println("SI DESEAS ELEGIR UN POKEMON PULSA '1'\n" + "SI DESEAS PERSONALIZAR TU PROPIO POKEMON PULSA '2'");
                    elegirper = userprint.nextInt();
                    switch (elegirper){
                        case 1 : {
                            do {


                                System.out.println("PARA ELEGIR EL POKEMON ESCRIBE EL NUMERO AL QUE ESTAN ASOCIADOS. ESTOS SON LOS POKEMONS DISPONIBLES:");
                                espacio = userprint.nextLine();
                                espacio = userprint.nextLine();
                                System.out.println("1.MEWTWO \n" + "2.ZAMAZENTA \n" + "3.MOLTRES\n" + "4.ETERNATUS\n" + "5.GYARADOS\n" + "6.ZAPDOS\n" + "7.CHARIZARD\n" + "8.ARTICUNO\n" + "9.ARCEUS\n" + "10.LUCARIO");
                                elegirper = userprint.nextInt();

                                switch (elegirper) {
                                    case 1: {
                                        System.out.println("HAS ELEGIDO A MEWTWO");
                                        System.out.println("MEWTWO TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 100\n" + "DEFENSA : 75\n" + "VIDA : 125");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 200;
                                            ataque2 = 100;
                                            defensa2 = 75;
                                            vida2 = 125;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 2 : {
                                        System.out.println("HAS ELEGIDO A ZAMAZENTA");
                                        System.out.println("ZAMAZENTA TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 100\n" + "ATAQUE : 130\n" + "DEFENSA : 170\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 100;
                                            ataque2 = 130;
                                            defensa2 = 170;
                                            vida2 = 100;
                                        }
                                        else bucleout = 0;
                                        break;

                                    }
                                    case 3 : {
                                        System.out.println("HAS ELEGIDO A MOLTRES");
                                        System.out.println("MOLTRES TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 120\n" + "DEFENSA : 120\n" + "VIDA : 80");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 180;
                                            ataque2 = 120;
                                            defensa2 = 120;
                                            vida2 = 80;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 4 : {
                                        System.out.println("HAS ELEGIDO A ETERNATUS");
                                        System.out.println("ETERNATUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 120;
                                            ataque2 = 200;
                                            defensa2 = 80;
                                            vida2 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 5 : {
                                        System.out.println("HAS ELEGIDO A GYARADOS");
                                        System.out.println("GYARADOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 220\n" + "DEFENSA : 80\n" + "VIDA : 120");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 80;
                                            ataque2 = 220;
                                            defensa2 = 80;
                                            vida2 = 120;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 6 : {
                                        System.out.println("HAS ELEGIDO A ZAPDOS");
                                        System.out.println("ZAPDOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 150\n" + "DEFENSA : 100\n" + "VIDA : 70");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 180;
                                            ataque2 = 150;
                                            defensa2 = 100;
                                            vida2 = 70;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 7 : {
                                        System.out.println("HAS ELEGIDO A CHARIZARD");
                                        System.out.println("CHARIZARD TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 120\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 80;
                                            ataque2 = 200;
                                            defensa2 = 120;
                                            vida2 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 8 : {
                                        System.out.println("HAS ELEGIDO A ARTICUNO");
                                        System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 150\n" + "DEFENSA : 75\n" + "VIDA : 75");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 200;
                                            ataque2 = 150;
                                            defensa2 = 75;
                                            vida2 = 75;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 9: {
                                        System.out.println("HAS ELEGIDO A ARCEUS");
                                        System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 130\n" + "ATAQUE : 100\n" + "DEFENSA : 170\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 130;
                                            ataque2 = 100;
                                            defensa2 = 170;
                                            vida2 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 10: {
                                        System.out.println("HAS ELEGIDO A LUCARIO");
                                        System.out.println("LUCARIO TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 140\n" + "DEFENSA : 90\n" + "VIDA : 150");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 120;
                                            ataque2 = 140;
                                            defensa2 = 90;
                                            vida2 = 150;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    default:
                                }

                        }while (elegirper == 0);
                          break;
                        }
                        case 2 : {
                            System.out.println("EXCELENTE  ELECCIÓN. ES HORA DE ELEGIR LA CANTIDAD DE CADA ATRIBUTO DE TU POKEMON");
                            do {
                                do {
                                    System.out.println("VELOCIDAD");
                                    velocidad1 = userprint.nextInt();
                                    if (velocidad2 < 1 || velocidad2 > 200) {
                                        System.out.println("VALOR INCORRECTO");
                                    }
                                }while (velocidad2 < 1 || velocidad2 > 200);
                                do {
                                    System.out.println("ATAQUE");
                                    ataque1 = userprint.nextInt();
                                    if (ataque2 < 1 || ataque2 > 200) {
                                        System.out.println("VALOR INCORRECTO");
                                    }
                                }while (ataque2 < 1 || ataque2 > 200);
                                do {
                                    System.out.println("DEFENSA");
                                    defensa1 = userprint.nextInt();
                                    if (defensa2 < 1 || defensa2 > 200) {
                                        System.out.println("VALOR INCORRECTO");
                                    }
                                }while (defensa2 < 1 || defensa2 > 200);
                                do {
                                    System.out.println("VIDA:");
                                    vida1= userprint.nextInt();
                                    if (vida2 < 1 || vida2 > 200) {
                                        System.out.println("VALOR INCORRECTO");
                                    }
                                }while (vida2 < 1 || vida2 > 200);
                                total2 = velocidad2 + ataque2 + defensa2 + vida2;
                                if (total1 > 500) System.out.println("¡ERROR! los atributos no pueden pasar de 500, vuelve a comenzar");
                            } while (total1 > 500);
                        }
                    }

                    System.out.println("▗▄▄▄▖ ▗▖ ▗▖▗▄▄▄▖     ▗▄▄▖ ▗▄▖ ▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖▗▄▄▄▖    ▗▖    ▗▄▖     ▗▄▄▖  ▗▄▖▗▄▄▄▖▗▄▖ ▗▖   ▗▖    ▗▄▖ \n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▌       ▐▌   ▐▌ ▐▌▐▛▚▞▜▌  █  ▐▌   ▐▛▚▖▐▌▐▌   ▐▌       ▐▌   ▐▌ ▐▌    ▐▌ ▐▌▐▌ ▐▌ █ ▐▌ ▐▌▐▌   ▐▌   ▐▌ ▐▌\n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▛▀▀▘    ▐▌   ▐▌ ▐▌▐▌  ▐▌  █  ▐▛▀▀▘▐▌ ▝▜▌▐▌   ▐▛▀▀▘    ▐▌   ▐▛▀▜▌    ▐▛▀▚▖▐▛▀▜▌ █ ▐▛▀▜▌▐▌   ▐▌   ▐▛▀▜▌\n" +
                            "▐▙▄▟▙▖▝▚▄▞▘▐▙▄▄▖    ▝▚▄▄▖▝▚▄▞▘▐▌  ▐▌▗▄█▄▖▐▙▄▄▖▐▌  ▐▌▝▚▄▄▖▐▙▄▄▖    ▐▙▄▄▖▐▌ ▐▌    ▐▙▄▞▘▐▌ ▐▌ █ ▐▌ ▐▌▐▙▄▄▖▐▙▄▄▖▐▌ ▐▌\n");


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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida2 = vida2 - totalataque;
                                    espacio= userprint.nextLine();
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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

                    break;
            }   case 2: {
                    System.out.println("EXCELENTE  ELECCIÓN. ES HORA DE ELEGIR LA CANTIDAD DE CADA ATRIBUTO DE TU POKEMON");
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

                    System.out.println("TURNO DEL JUGADOR 2");
                    System.out.println("SI DESEAS ELEGIR UN POKEMON PULSA '1'\n" + "SI DESEAS PERSONALIZAR TU PROPIO POKEMON PULSA '2'");
                    elegirper = userprint.nextInt();

                    switch (elegirper) {
                        case 1 : {
                            do {


                                System.out.println("PARA ELEGIR EL POKEMON ESCRIBE EL NUMERO AL QUE ESTAN ASOCIADOS. ESTOS SON LOS POKEMONS DISPONIBLES:");
                                espacio = userprint.nextLine();
                                espacio = userprint.nextLine();
                                System.out.println("1.MEWTWO \n" + "2.ZAMAZENTA \n" + "3.MOLTRES\n" + "4.ETERNATUS\n" + "5.GYARADOS\n" + "6.ZAPDOS\n" + "7.CHARIZARD\n" + "8.ARTICUNO\n" + "9.ARCEUS\n" + "10.LUCARIO");
                                elegirper = userprint.nextInt();

                                switch (elegirper) {
                                    case 1: {
                                        System.out.println("HAS ELEGIDO A MEWTWO");
                                        System.out.println("MEWTWO TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 100\n" + "DEFENSA : 75\n" + "VIDA : 125");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 200;
                                            ataque1 = 100;
                                            defensa1 = 75;
                                            vida1 = 125;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 2 : {
                                        System.out.println("HAS ELEGIDO A ZAMAZENTA");
                                        System.out.println("ZAMAZENTA TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 100\n" + "ATAQUE : 130\n" + "DEFENSA : 170\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 100;
                                            ataque1 = 130;
                                            defensa1 = 170;
                                            vida1 = 100;
                                        }
                                        else bucleout = 0;
                                        break;

                                    }
                                    case 3 : {
                                        System.out.println("HAS ELEGIDO A MOLTRES");
                                        System.out.println("MOLTRES TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 120\n" + "DEFENSA : 120\n" + "VIDA : 80");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 180;
                                            ataque1 = 120;
                                            defensa1 = 120;
                                            vida1 = 80;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 4 : {
                                        System.out.println("HAS ELEGIDO A ETERNATUS");
                                        System.out.println("ETERNATUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 120;
                                            ataque1 = 200;
                                            defensa1 = 80;
                                            vida1 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 5 : {
                                        System.out.println("HAS ELEGIDO A GYARADOS");
                                        System.out.println("GYARADOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 220\n" + "DEFENSA : 80\n" + "VIDA : 120");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 80;
                                            ataque1 = 220;
                                            defensa1 = 80;
                                            vida1 = 120;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 6 : {
                                        System.out.println("HAS ELEGIDO A ZAPDOS");
                                        System.out.println("ZAPDOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 180\n" + "ATAQUE : 150\n" + "DEFENSA : 100\n" + "VIDA : 70");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 180;
                                            ataque1 = 150;
                                            defensa1 = 100;
                                            vida1 = 70;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 7 : {
                                        System.out.println("HAS ELEGIDO A CHARIZARD");
                                        System.out.println("CHARIZARD TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 120\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 80;
                                            ataque1 = 200;
                                            defensa1 = 120;
                                            vida1 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 8 : {
                                        System.out.println("HAS ELEGIDO A ARTICUNO");
                                        System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 200\n" + "ATAQUE : 150\n" + "DEFENSA : 75\n" + "VIDA : 75");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 200;
                                            ataque1 = 150;
                                            defensa1 = 75;
                                            vida1 = 75;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 9: {
                                        System.out.println("HAS ELEGIDO A ARCEUS");
                                        System.out.println("ARCEUS TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 130\n" + "ATAQUE : 100\n" + "DEFENSA : 170\n" + "VIDA : 100");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 130;
                                            ataque1 = 100;
                                            defensa1 = 170;
                                            vida1 = 100;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    case 10: {
                                        System.out.println("HAS ELEGIDO A LUCARIO");
                                        System.out.println("LUCARIO TIENE LAS SIGUIENTES CARACTERISTICAS");
                                        System.out.println("VELOCIDAD : 120\n" + "ATAQUE : 140\n" + "DEFENSA : 90\n" + "VIDA : 150");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 120;
                                            ataque1 = 140;
                                            defensa1 = 90;
                                            vida1 = 150;
                                        }
                                        else bucleout = 0;
                                        break;
                                    }
                                    default:
                                }

                            }while (elegirper == 0);


                        }
                    }
                    System.out.println("▗▄▄▄▖ ▗▖ ▗▖▗▄▄▄▖     ▗▄▄▖ ▗▄▖ ▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖▗▄▄▄▖    ▗▖    ▗▄▖     ▗▄▄▖  ▗▄▖▗▄▄▄▖▗▄▖ ▗▖   ▗▖    ▗▄▖ \n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▌       ▐▌   ▐▌ ▐▌▐▛▚▞▜▌  █  ▐▌   ▐▛▚▖▐▌▐▌   ▐▌       ▐▌   ▐▌ ▐▌    ▐▌ ▐▌▐▌ ▐▌ █ ▐▌ ▐▌▐▌   ▐▌   ▐▌ ▐▌\n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▛▀▀▘    ▐▌   ▐▌ ▐▌▐▌  ▐▌  █  ▐▛▀▀▘▐▌ ▝▜▌▐▌   ▐▛▀▀▘    ▐▌   ▐▛▀▜▌    ▐▛▀▚▖▐▛▀▜▌ █ ▐▛▀▜▌▐▌   ▐▌   ▐▛▀▜▌\n" +
                            "▐▙▄▟▙▖▝▚▄▞▘▐▙▄▄▖    ▝▚▄▄▖▝▚▄▞▘▐▌  ▐▌▗▄█▄▖▐▙▄▄▖▐▌  ▐▌▝▚▄▄▖▐▙▄▄▖    ▐▙▄▄▖▐▌ ▐▌    ▐▙▄▞▘▐▌ ▐▌ █ ▐▌ ▐▌▐▙▄▄▖▐▙▄▄▖▐▌ ▐▌\n");
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida2 = vida2 - totalataque;
                                    espacio= userprint.nextLine();
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
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

            } default: {
                    System.out.println("error");
                }

            /*do {
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
            }while (inicio);*/
            }

        }}}



