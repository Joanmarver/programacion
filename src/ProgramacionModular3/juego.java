package ProgramacionModular3;

import java.util.Random;
import java.util.Scanner;

public class juego{
    public static void main(String[] args) {
        Scanner userprint = new Scanner(System.in);
        int[] valoresjugadoruno= new int[4];
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
        metodomenu();
        eleccionpersonajes(valoresjugadoruno);
        
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
                                System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 140");
                                System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                elegirper = userprint.nextInt();
                                if (elegirper == 1){
                                    bucleout = 1;
                                    velocidad1 = 80;
                                    ataque1 = 200;
                                    defensa1 = 80;
                                    vida1 = 140;
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
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 140");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad2 = 80;
                                            ataque2 = 200;
                                            defensa2 = 80;
                                            vida2 = 140;
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
                        }
                    }

                    System.out.println("▗▄▄▄▖ ▗▖ ▗▖▗▄▄▄▖     ▗▄▄▖ ▗▄▖ ▗▖  ▗▖▗▄▄▄▖▗▄▄▄▖▗▖  ▗▖ ▗▄▄▖▗▄▄▄▖    ▗▖    ▗▄▖     ▗▄▄▖  ▗▄▖▗▄▄▄▖▗▄▖ ▗▖   ▗▖    ▗▄▖ \n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▌       ▐▌   ▐▌ ▐▌▐▛▚▞▜▌  █  ▐▌   ▐▛▚▖▐▌▐▌   ▐▌       ▐▌   ▐▌ ▐▌    ▐▌ ▐▌▐▌ ▐▌ █ ▐▌ ▐▌▐▌   ▐▌   ▐▌ ▐▌\n" +
                            "▐▌ ▐▌ ▐▌ ▐▌▐▛▀▀▘    ▐▌   ▐▌ ▐▌▐▌  ▐▌  █  ▐▛▀▀▘▐▌ ▝▜▌▐▌   ▐▛▀▀▘    ▐▌   ▐▛▀▜▌    ▐▛▀▚▖▐▛▀▜▌ █ ▐▛▀▜▌▐▌   ▐▌   ▐▛▀▜▌\n" +
                            "▐▙▄▟▙▖▝▚▄▞▘▐▙▄▄▖    ▝▚▄▄▖▝▚▄▞▘▐▌  ▐▌▗▄█▄▖▐▙▄▄▖▐▌  ▐▌▝▚▄▄▖▐▙▄▄▖    ▐▙▄▄▖▐▌ ▐▌    ▐▙▄▞▘▐▌ ▐▌ █ ▐▌ ▐▌▐▙▄▄▖▐▙▄▄▖▐▌ ▐▌\n");

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
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    espacio= userprint.nextLine();
                                    if (vida1 < 0) vida1 = 0;
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
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    if (vida1 < 0) vida1 = 0;
                                    espacio= userprint.nextLine();
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida1 = vida1 - totalataque;
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida2 = vida2 - totalataque;
                                    espacio = userprint.nextLine();
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida2 < 0) vida2 = 0;
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida2 = vida2 - totalataque;
                                    espacio= userprint.nextLine();
                                    if (vida2 < 0) vida2 = 0;
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
                                        System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 140");
                                        System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                                        elegirper = userprint.nextInt();
                                        if (elegirper == 1){
                                            bucleout = 1;
                                            velocidad1 = 80;
                                            ataque1 = 200;
                                            defensa1 = 80;
                                            vida1 = 140;
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
                            break;

                        }
                        case 2 : {
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
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    if (vida1 < 0) vida1 = 0;
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
                                    vida1 = vida1 - totalataque;
                                    espacio= userprint.nextLine();
                                    if (vida1 < 0) vida1 = 0;
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 1 : " + vida1);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 2 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida1 = vida1 - totalataque;
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
                                    vida2 = vida2 - totalataque;
                                    espacio = userprint.nextLine();
                                    if (vida2 < 0) vida2 = 0;
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
                                    if (vida2 < 0) vida2 = 0;
                                    System.out.println("VIDA RESTANTE DEL JUGADOR 2 : " + vida2);
                                    espacio= userprint.nextLine();
                                } else {
                                    randomplus = 0;
                                    totalata = random.nextInt(ataque2);
                                    totalataque = totalata - randomplus;
                                    System.out.println("EL JUGADOR 1 LANZA UN ATAQUE DE : " +totalataque + " DAÑO");
                                    vida2 = vida2 - totalataque;
                                    espacio= userprint.nextLine();
                                    if (vida2 < 0) vida2 = 0;
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


            }

        }
    public static void metodomenu(){
        Scanner userprint = new Scanner(System.in);
        boolean inicio=false;


        while (inicio == false) {
            System.out.println("\n" +
                    "\n" +
                    "▗▄▄▖  ▗▄▖ ▗▖ ▗▖▗▄▄▄▖▗▖  ▗▖ ▗▄▖ ▗▖  ▗▖    ▗▄▄▄▖▗▄▄▄▖ ▗▄▄▖▗▖ ▗▖▗▄▄▄▖     ▗▄▄▖▗▄▄▄▖▗▖  ▗▖▗▖ ▗▖▗▖    ▗▄▖ ▗▄▄▄▖ ▗▄▖ ▗▄▄▖ \n" +
                    "▐▌ ▐▌▐▌ ▐▌▐▌▗▞▘▐▌   ▐▛▚▞▜▌▐▌ ▐▌▐▛▚▖▐▌    ▐▌     █  ▐▌   ▐▌ ▐▌  █      ▐▌     █  ▐▛▚▞▜▌▐▌ ▐▌▐▌   ▐▌ ▐▌  █  ▐▌ ▐▌▐▌ ▐▌\n" +
                    "▐▛▀▘ ▐▌ ▐▌▐▛▚▖ ▐▛▀▀▘▐▌  ▐▌▐▌ ▐▌▐▌ ▝▜▌    ▐▛▀▀▘  █  ▐▌▝▜▌▐▛▀▜▌  █       ▝▀▚▖  █  ▐▌  ▐▌▐▌ ▐▌▐▌   ▐▛▀▜▌  █  ▐▌ ▐▌▐▛▀▚▖\n" +
                    "▐▌   ▝▚▄▞▘▐▌ ▐▌▐▙▄▄▖▐▌  ▐▌▝▚▄▞▘▐▌  ▐▌    ▐▌   ▗▄█▄▖▝▚▄▞▘▐▌ ▐▌  █      ▗▄▄▞▘▗▄█▄▖▐▌  ▐▌▝▚▄▞▘▐▙▄▄▖▐▌ ▐▌  █  ▝▚▄▞▘▐▌ ▐▌\n");
            userprint.nextLine();
            System.out.println("EXPLICACIÓN BASICA DE LAS REGLAS :" + "\n" + "CADA POKEMON TENDRÁ LOS SIGUIENTES ATRIBUTOS" );
            System.out.println("- VELOCIDAD"+"\n"+"-  ATAQUE"+"\n"+"-  DEFENSA"+"\n" + "-  PUNTOS DE VIDA");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
            userprint.nextLine();
            System.out.println("TENDRÁS LA OPCIÓN DE ELEGIR EL POKEMON O CREARTE U POKEMON PERSONALIZADO");
            System.out.println("SI DECIDES CREARTE UN POKEMON PERSONALIZADO TIENES QUE TEN EN CUENTA LO SIGUIENTE : ");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
            userprint.nextLine();
            System.out.println("LA SUMA DE LOS ATRIBUTOS DE UN JUGADOR NO PODRÁ SER SUPERIOR A 500.");
            System.out.println("CADA UNO DE LOS ATRIBUTOS DEBE TENER UN VALOR ENTRE 1 Y 200.");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
            userprint.nextLine();
            System.out.println("EN CADA UNO DE LOS TURNOS EL JUGADOR CON MAYOR VELOCIDAD HACE UN PRIMER ATAQUE\n" +
                    "A CONTINUACIÓN, EL SEGUNDO JUGADOR (SI SU VIDA NO HA LLEGADO A 0)REALIZA SU ATAQUE\n");
            System.out.println("CADA ATAQUE QUITA PUNTOS DE VIDA AL CONTRINCANTE");
            System.out.println("CUANDO UNO DE LOS DOS JUGADORES VÉ REDUCIDA SU VIDA A 0 PIERDE LA PARTIDA\n" +
                    "POR TANTO , GANA EL OTRO JUGADOR"+"\n");
            System.out.println("====================================================================================");
            System.out.println("====================================================================================");
            userprint.nextLine();
            System.out.println("SI LO HABEIS ENTENDIDO PULSA '1' SI NO PULSA'2'");
            int conf = userprint.nextInt();
            if (conf == 1) {
                for (int i=0; i < 100; i++){
                    System.out.println();
                }
                System.out.println("¡EMPEZAMOS!");
                inicio = true;
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
    }
    }
    public static void eleccionpersonajes(int[] valoresjugadoruno){
        Scanner userprint= new Scanner(System.in);
        System.out.println("SI DESEAS ELEGIR UN POKEMON PULSA '1'\n" + "SI DESEAS PERSONALIZAR TU PROPIO POKEMON PULSA '2'");
        int elegirper = userprint.nextInt();
        int bucleout=0;
        switch (elegirper){
            case 1: {
                do {


                    System.out.println("PARA ELEGIR EL POKEMON ESCRIBE EL NUMERO AL QUE ESTAN ASOCIADOS. ESTOS SON LOS POKEMONS DISPONIBLES:");
                    userprint.nextLine();
                    userprint.nextLine();
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
                                valoresjugadoruno[0]= 200;
                                valoresjugadoruno[1]=100;
                                valoresjugadoruno[2]=75;
                                valoresjugadoruno[3]=125;
                                bucleout = 1;
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
                                valoresjugadoruno[0]= 100;
                                valoresjugadoruno[1]=130;
                                valoresjugadoruno[2]=170;
                                valoresjugadoruno[3]=100;
                                bucleout = 1;

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
                                valoresjugadoruno[0]= 180;
                                valoresjugadoruno[1]=120;
                                valoresjugadoruno[2]=120;
                                valoresjugadoruno[3]=80;
                                bucleout = 1;

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
                                valoresjugadoruno[0]= 120;
                                valoresjugadoruno[1]=200;
                                valoresjugadoruno[2]=80;
                                valoresjugadoruno[3]=100;
                            }
                            else bucleout = 0;
                            break;
                        }
                        case 5 : {
                            System.out.println("HAS ELEGIDO A GYARADOS");
                            System.out.println("GYARADOS TIENE LAS SIGUIENTES CARACTERISTICAS");
                            System.out.println("VELOCIDAD : 80\n" + "ATAQUE : 200\n" + "DEFENSA : 80\n" + "VIDA : 140");
                            System.out.println("PARA CONFIRMAR PULSA 1, O PULSA '2' PARA VOLVER A ELEGIR EL PERSONAJE");
                            elegirper = userprint.nextInt();
                            if (elegirper == 1){
                                bucleout = 1;
                                valoresjugadoruno[0]= 80;
                                valoresjugadoruno[1]=200;
                                valoresjugadoruno[2]=80;
                                valoresjugadoruno[3]=140;
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
                                valoresjugadoruno[0]= 180;
                                valoresjugadoruno[1]=150;
                                valoresjugadoruno[2]=100;
                                valoresjugadoruno[3]=70;
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
                                valoresjugadoruno[0]= 80;
                                valoresjugadoruno[1]=200;
                                valoresjugadoruno[2]=120;
                                valoresjugadoruno[3]=100;
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
                                valoresjugadoruno[0]= 200;
                                valoresjugadoruno[1]=150;
                                valoresjugadoruno[2]=75;
                                valoresjugadoruno[3]=75;
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
                                valoresjugadoruno[0]= 130;
                                valoresjugadoruno[1]=100;
                                valoresjugadoruno[2]=170;
                                valoresjugadoruno[3]=100;;
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
                                valoresjugadoruno[0]= 120;
                                valoresjugadoruno[1]=140;
                                valoresjugadoruno[2]=90;
                                valoresjugadoruno[3]=150;
                            }
                            else bucleout = 0;
                            break;
                        }
                        default: {
                            System.out.println("ERROR");
                        }
                    }

                }while (bucleout == 0);
    }
}}}







