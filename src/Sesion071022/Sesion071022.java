package Sesion071022;

import java.util.Scanner;

public class Sesion071022 {

    private static String nombre;
    private static Scanner scr;
    private static String[] cartas;
    private static String[] palos = {"Picas", "Corazones", "Diamantes", "Treboles"};
    private static         String[] unicode = {"\uD83C\uDCA1", "\uD83C\uDCA2","\uD83C\uDCA3","\uD83C\uDCA4","\uD83C\uDCA5","\uD83C\uDCA6","\uD83C\uDCA7","\uD83C\uDCA8","\uD83C\uDCA9","\uD83C\uDCAA","\uD83C\uDCAB","\uD83C\uDCAD","\uD83C\uDCAE"
            ,"\uD83C\uDCB1", "\uD83C\uDCB2","\uD83C\uDCB3","\uD83C\uDCB4","\uD83C\uDCB5","\uD83C\uDCB6","\uD83C\uDCB7","\uD83C\uDCB8","\uD83C\uDCB9","\uD83C\uDCBA","\uD83C\uDCBB","\uD83C\uDCBD","\uD83C\uDCBE"
            ,"\uD83C\uDCC1", "\uD83C\uDCC2","\uD83C\uDCC3","\uD83C\uDCC4","\uD83C\uDCC5","\uD83C\uDCC6","\uD83C\uDCC7","\uD83C\uDCC8","\uD83C\uDCC9","\uD83C\uDCCA","\uD83C\uDCCB","\uD83C\uDCCD","\uD83C\uDCCE"
            ,"\uD83C\uDCD1", "\uD83C\uDCD2","\uD83C\uDCD3","\uD83C\uDCD4","\uD83C\uDCD5","\uD83C\uDCD6","\uD83C\uDCD7","\uD83C\uDCD8","\uD83C\uDCD9","\uD83C\uDCDA","\uD83C\uDCDB","\uD83C\uDCDD","\uD83C\uDCDE"};

    public static void main(String[] args) {
        scr = new Scanner(System.in);
        cartas = new String[52];
        int contador = 0;
        for(int i = 1; i <= 4; i++){
            for(int j=1; j<=13; j++) {
                String carta = null;
                if(palos[i-1].equals("Corazones") || palos[i-1].equals("Diamantes")){
                    carta = "\033[31m";
                }
                if(palos[i-1].equals("Picas") || palos[i-1].equals("Treboles")){
                    carta = "\033[37m";
                }
                if (j<=10){
                    carta = carta + j + " de " + palos[i-1] + " " + unicode[contador];
                }
                else if(j == 11){
                    carta = carta + "J de "+ palos[i-1] + " " + unicode[contador];
                }
                else if(j == 12){
                    carta = carta + "Q de "+ palos[i-1] + " " + unicode [contador];
                }
                else if (j == 13) {
                    carta = carta + "K de "+ palos[i-1] + " " + unicode [contador];
                }
                cartas[contador] = carta;
                contador++;
            }
        }
        boolean salir = false;
        while (salir == false) {

            System.out.println(cartas[(int) (Math.random() * 52)]);
            if(scr.nextLine().equals("EXIT")){
                salir = true;
            }
        }
    }
}
