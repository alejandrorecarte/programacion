package Practica_Alejandro_RecarteRebollo;

import java.util.Scanner;

public class Ejercicio1 {

    private static float[] temperaturas;
    private static Scanner sc;
    enum meses {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        menu();
    }

    public static void menu(){
        System.out.println("0.- Salir" +
                "\n1.- Inicializar un array que recoja la temperatura media de cada mes del año" +
                "\n2.- Mostrar el mes(enumerado) con mayor temperatura" +
                "\n3.- Mostrar el mes(enumerado) con menor temperatura" +
                "\n4.- Imprimir la temperatura del mes introducido(de 1 a 12) por teclado" +
                "\n5.- Sacar temperatura media de los meses de verano" +
                "\n6.- Sacar temperatura media de los meses de invierno" +
                "\n7.- Comparar si temperatura de dos meses(enumerados) introducidos son iguales");

        switch(sc.nextInt()){
            case 0: break;
            case 1: inicializar_array(); menu(); break;
            case 2: mayor_temperatura(); menu(); break;
            case 3: menor_temperatura(); menu(); break;
            case 4: sacar_temperaturas(); menu(); break;
            case 5: sacar_temperaturas_media_verano(); menu(); break;
            case 6: sacar_temperaturas_media_invierno(); menu(); break;
            case 7: comparar_temperaturas(); break;
            default: System.out.println("El dato introducido es erróneo, vuelva a intentarlo"); menu(); break;
        }
    }

    public static void inicializar_array(){
        temperaturas = new float[12];
        for (int i = 0; i < meses.values().length; i++) {
            System.out.println("Introduce la temperatura media de "+ meses.values()[i]);
            temperaturas[i] = sc.nextFloat();
        }
    }

    public static void mayor_temperatura(){
        float mayorTemp = 0;
        int mes = 0;
        for(int i = 0; i < 12; i++){
            if(mayorTemp < temperaturas[i]){
                mayorTemp = temperaturas[i];
                mes = i;
            }
        }
        System.out.println("La mayor temperatura del año ha sido: "+ mayorTemp + " en " + meses.values()[mes]);
    }

    public static void menor_temperatura(){
        float menorTemp = 0;
        int mes = 0;
        for(int i = 0; i < 12; i++){
            if(menorTemp > temperaturas[i]){
                menorTemp = temperaturas[i];
                mes = i;
            }
        }
        System.out.println("La menor temperatura del año ha sido: "+ menorTemp + " en " + meses.values()[mes]);
    }

    public static void sacar_temperaturas(){
        System.out.println("Escribe el mes del que quieres saber la temperatura: ");
        int mes = sc.nextInt();
        System.out.println("En " + meses.values()[mes]+ " la temperatura media fue de: "+ temperaturas[mes]);
    }

    public static void sacar_temperaturas_media_verano(){
        System.out.println((temperaturas[7]+temperaturas[8]+temperaturas[9])/3);
    }

    public static void sacar_temperaturas_media_invierno(){
        System.out.println((temperaturas[1]+temperaturas[2]+temperaturas[3])/3);
    }

    public static void comparar_temperaturas(){
        String mes1 = sc.nextLine();
    }


}
