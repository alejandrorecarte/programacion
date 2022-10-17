package BlackJack;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

    /**
     * @author Alejandro Recarte Rebollo
     * @version 1.1
     */

public class BlackJack {

    //LINKED LISTS
    private static LinkedList<Carta> cartasJugador;
    private static LinkedList<Carta> cartasCrupier;
    private static LinkedList<Carta> barajaShuffled;
    private static LinkedList<Carta> CARTAS;

    //VARIABLES
    private static int fichas = 1000;
    private static int fichasJuego;
    private static int valorJugador;
    private static int valorCrupier;
    private static int asesJugador;
    private static int asesCrupier;

    //SCANNER
    private static Scanner scr;

    //ARRAYS
    private static String[] PALOS = {"Picas", "Corazones", "Diamantes", "Treboles"};
    private static String[] UNICODE = {"\uD83C\uDCA1", "\uD83C\uDCA2","\uD83C\uDCA3","\uD83C\uDCA4","\uD83C\uDCA5","\uD83C\uDCA6","\uD83C\uDCA7","\uD83C\uDCA8","\uD83C\uDCA9","\uD83C\uDCAA","\uD83C\uDCAB","\uD83C\uDCAD","\uD83C\uDCAE"
            ,"\uD83C\uDCB1", "\uD83C\uDCB2","\uD83C\uDCB3","\uD83C\uDCB4","\uD83C\uDCB5","\uD83C\uDCB6","\uD83C\uDCB7","\uD83C\uDCB8","\uD83C\uDCB9","\uD83C\uDCBA","\uD83C\uDCBB","\uD83C\uDCBD","\uD83C\uDCBE"
            ,"\uD83C\uDCC1", "\uD83C\uDCC2","\uD83C\uDCC3","\uD83C\uDCC4","\uD83C\uDCC5","\uD83C\uDCC6","\uD83C\uDCC7","\uD83C\uDCC8","\uD83C\uDCC9","\uD83C\uDCCA","\uD83C\uDCCB","\uD83C\uDCCD","\uD83C\uDCCE"
            ,"\uD83C\uDCD1", "\uD83C\uDCD2","\uD83C\uDCD3","\uD83C\uDCD4","\uD83C\uDCD5","\uD83C\uDCD6","\uD83C\uDCD7","\uD83C\uDCD8","\uD83C\uDCD9","\uD83C\uDCDA","\uD83C\uDCDB","\uD83C\uDCDD","\uD83C\uDCDE"};

    public static void main(String[] args) {
        scr = new Scanner(System.in);
        CARTAS = new LinkedList();
        crearBaraja();
        comenzarBJ();
    }

    /**
     * Crea una baraja tipo LinkedList con Objetos Carta
     */

    private static void crearBaraja(){
        System.out.println("\033[32m\u22b3 Creando baraja...");
        int contador = 0;
        for(int i = 1; i <= 4; i++){
            for(int j=1; j<=13; j++) {
                String nombreCarta = null;
                int valor = j;
                if(PALOS[i-1].equals("Corazones") || PALOS[i-1].equals("Diamantes")){
                    nombreCarta = "\033[31m";
                }
                if(PALOS[i-1].equals("Picas") || PALOS[i-1].equals("Treboles")){
                    nombreCarta = "\033[37m";
                }
                if (j==1){
                    nombreCarta = nombreCarta + "A de " + PALOS[i-1] + " " + UNICODE[contador];
                }
                if (j<=10 && j>1){
                    nombreCarta = nombreCarta + j + " de " + PALOS[i-1] + " " + UNICODE[contador];
                }
                else if(j == 11){
                    nombreCarta = nombreCarta + "J de "+ PALOS[i-1] + " " + UNICODE[contador];
                    valor = 10;
                }
                else if(j == 12){
                    nombreCarta = nombreCarta + "Q de "+ PALOS[i-1] + " " + UNICODE [contador];
                    valor = 10;
                }
                else if (j == 13) {
                    nombreCarta = nombreCarta + "K de "+ PALOS[i-1] + " " + UNICODE [contador];
                    valor = 10;
                }
                Carta carta = new Carta(nombreCarta,valor);
                CARTAS.add(carta);
                contador++;
            }
        }
        System.out.println("\u22b3 Baraja creada correctamente");
    }

    /**
     * @author Alejandro Recarte Rebollo y Hugo Ekai Pérez
     * Método que hace comenzar el juego
     */

    private static void comenzarBJ(){
        cartasJugador = new LinkedList();
        cartasCrupier = new LinkedList();
        barajaShuffled = new LinkedList();
        System.out.println("\u22b3 \u25cd de \u2729JUGADOR\u2729 : "+fichas);
        System.out.println("\u22b3 Escribe cuantas \u25cd deseas apostar: ");

        //Introducción de fichas
        try{
            fichasJuego = Integer.parseInt(scr.nextLine());
        }catch(NumberFormatException e){
            System.out.println("\u22b3 Introduce un valor válido.");
            comenzarBJ();
            System.exit(0);
        }

        //Comprobación de cantidad de fichas
        if(fichas - fichasJuego < 0){
            System.out.println("\u22b3 No puedes apostar más fichas de las que tienes (En este casino no fíamos a palurdos >:V).");
            comenzarBJ();
        }
        fichas = fichas - fichasJuego;
        System.out.println("\u22b3 Has apostado: "+ fichasJuego + " \u25cd");
        System.out.println("\u22b3 Barajando cartas...");
        //Espera medio segundo
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //Barajeo de cartas
        for(int i = 0; i < CARTAS.size(); i++){
            barajaShuffled.add(CARTAS.get(i));
        }
        Collections.shuffle(barajaShuffled);
        System.out.println("\u22b3 Repartiendo...");
        //Espera medio segundo
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //Se sacan las cartas que se van a jugar en el primer turno
        cartasJugador.add(barajaShuffled.remove());
        cartasJugador.add(barajaShuffled.remove());
        cartasCrupier.add(barajaShuffled.remove());
        cartasCrupier.add(barajaShuffled.remove());
        imprimirTablero(false);
        turno();
    }

    /**
     * Método que imprime situación actual de tablero en pantalla
     * @param b false para imprimir tablero con la carta de crupier oculta, true para descubrirla
     */

    private static void imprimirTablero(boolean b){
        asesJugador = 0;
        asesCrupier = 0;
        valorJugador = 0;
        valorCrupier = 0;
        System.out.println("\n\u22b3 Apuesta actual: "+fichasJuego+" \u25cd");
        System.out.println("\033[32m\u2729 Cartas JUGADOR \u2729");
        int size = cartasJugador.size();
        for (int i = 0; i < size;i++){
            Carta cartaBuffer = cartasJugador.get(i);
            System.out.println(cartaBuffer.getNombreCarta());
            valorJugador = valorJugador + cartaBuffer.getValor();
            if (cartaBuffer.getValor()==1){
                asesJugador++;
            }
        }
        if(asesJugador != 0 && (valorJugador+(asesJugador*9))<=21){
            System.out.println("\033[32mValor\u21fe | "+valorJugador+" o "+ (valorJugador+(asesJugador*9)) +"|");
        }else{
            System.out.println("\033[32mValor\u21fe | "+valorJugador+" |");
        }


        System.out.println("\n\033[32m\u274b Cartas CRUPIER \u274b");
        size = cartasCrupier.size();
        for (int i = 0; i < size;i++) {
            Carta cartaBuffer = cartasCrupier.get(i);
            if (i == 0) {
                if (b == true) {
                    System.out.println(cartaBuffer.getNombreCarta());
                    valorCrupier = valorCrupier + cartaBuffer.getValor();
                } else {
                    System.out.println("\033[32m???");
                }
            } else {
                System.out.println(cartaBuffer.getNombreCarta());
                valorCrupier = valorCrupier + cartaBuffer.getValor();
                if (cartaBuffer.getValor() == 1) {
                    asesCrupier++;
                }
            }
        }

        if (b == true) {
            if (asesCrupier == 0 && (valorCrupier + (asesCrupier * 9) <= 21)) {
                System.out.println("\033[32mValor\u21fe | " + (valorCrupier + (asesCrupier * 9)) + " |");
            }else {
                System.out.println("\033[32mValor\u21fe | " + valorCrupier + " |");
            }
        } else {
            if (asesCrupier != 0 && (valorCrupier + (asesCrupier * 9) <= 21)) {
                System.out.println("\033[32mValor\u21fe | ??? + " + valorCrupier + " o " + (valorCrupier + (asesCrupier * 9)) + " |");
                }else{
                System.out.println("\033[32mValor\u21fe | ??? + " + valorCrupier + " |");
            }
           }
    }

    /**
     * Método que permite al jugador elegir que desea hacer en el turno.
     */

    private static void turno(){
        int sel = 0;
        System.out.println("\n\u22b3 Introduce orden (Escribe \"0\" para recordar ordenes):");
        try{
            sel = Integer.parseInt(scr.nextLine());
        }catch (java.lang.NumberFormatException e){
            System.out.println("\u22b3 Introduce un valor válido.");
            turno();
            System.exit(0);
        }
        switch(sel){
            case 0:
                System.out.println("Escribe \"1\" para pedir una carta.\nEscribe \"2\" para terminar partida.");
                break;
            case 1:
                pedirCartaJugador();
                int size = cartasCrupier.size();
                int valor = 0;
                for (int i = 0; i < size;i++) {
                    Carta cartaBuffer = cartasCrupier.get(i);
                    valor = valor + cartaBuffer.getValor();
                }
                if(valorJugador>21 || valor >21){
                    plantarse();
                }
                turno();
                break;
            case 2:
                plantarse();
                break;
        }
    }

    /**
     * Método que da una carta aleatoria al jugador
     */

    private static void pedirCartaJugador(){
        cartasJugador.add(barajaShuffled.remove());
        imprimirTablero(false);
        pedirCartaCrupier(false);
    }

    /**
     * Método que dice si el crupier coge carta o no
     * @param plantarse true si el jugador decide plantarse y false si ha pedido una carta
     */
    private static void pedirCartaCrupier(boolean plantarse){
        int ases = 0;
        int size = cartasCrupier.size();
        int valor = 0;
        for (int i = 0; i < size;i++) {
            Carta cartaBuffer = cartasCrupier.get(i);
            valor = valor + cartaBuffer.getValor();
            if(valor == 1){
                ases++;
            }
        }
        do{
            System.out.println("\u22b3 CRUPIER coge carta");
            //Esperar un segundo
            try {
                for (int i = 0; i < 2; i++) {
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            cartasCrupier.add(barajaShuffled.remove());
            imprimirTablero(false);
            for (int i = 0; i < size;i++) {
                Carta cartaBuffer = cartasCrupier.get(i);
                valor = valor + cartaBuffer.getValor();
                if (valor == 1) {
                    ases++;
                }
            }
        }while((valor < 14 || valor + (ases*9) < 14 || valor<valorJugador) && valor<21 && plantarse == true && valorJugador < 21);
    }

    /**
     * Método que termina el juego decidiendo quien pierde finalmente.
     */

    private static void plantarse(){
        pedirCartaCrupier(true);
        imprimirTablero(true);
        switch(checkVictoria()){
            case 0:
                System.out.println("\u22b3 \u2718 Jugador pierde "+ fichasJuego +" \u25cd. \u2718");break;
            case 1:
                System.out.println("\u22b3 \u2714Jugador gana "+ fichasJuego*2 + " \u25cd. \u2714");
                fichas = fichas + fichasJuego * 2;
                break;
            case 2:
                System.out.println("\u22b3 \u262d Empate, se te devuelven "+fichasJuego + " \u25cd.\u262d");
                fichas = fichas + fichasJuego;
                break;
            default:
                System.out.println("\u22b3 ERROR");break;
        }
        System.out.println("\u22b3 Actualmente dispones de: "+fichas+ "\u25cd");
        if(fichas <= 0){
            System.out.println("\u22b3 Estás en bancarrota pringa@.");
            System.exit(0);
        }
        continuar();
    }

    /**
     * Método que permite al jugador decidir si quiere seguir jugando.
     */

    private static void continuar(){
        System.out.println("\u22b3 ¿Continuar? (s/n)");
        char sel = 's';

        try{
            sel = scr.nextLine().charAt(0);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("\u22b3 Debes introducir un valor.");
        }

        if(sel == 's') {
            comenzarBJ();
        }else if (sel == 'n'){
            System.exit(0);
        }else{
            System.out.println("\u22b3 Introduce un valor válido.");
            try {
                for (int i = 0; i < 2; i++) {
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            continuar();
        }
        System.exit(0);
    }

    /**
     * Método que devuelve quien gana la partida
     * @return 0 si jugador pierde, 1 si juegador gana, 2 si hay empate
     */

    private static int checkVictoria(){
        while (asesJugador>0){
            if (valorJugador + (asesJugador * 9)<21){
                valorJugador = valorJugador + (asesJugador * 9);
            }
            asesJugador--;
        }
        while(asesCrupier > 1){
            if (valorCrupier + (asesCrupier * 9)<21){
                valorCrupier = valorCrupier + (valorCrupier * 9);
            }
            asesCrupier--;
        }
        int resultado = 2;
        if (valorJugador>21){
            return 0;
        }
        if (valorCrupier>21){
            return 1;
        }
        if(valorJugador>valorCrupier){
            return 1;
        }
        if(valorJugador<valorCrupier){
            return 0;
        }
        if(valorCrupier == valorJugador){
            return  2;
        }
        return 2;
    }
}