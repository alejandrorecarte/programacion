package Practica_Alejandro_RecarteRebollo;

import java.util.Scanner;

public class Ejercicio1 {

    private static float[] temperaturas;
    private static Scanner sc;

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
            case 0:
                break;
            case 1:
                temperaturas=inicializar_array(temperaturas);
                menu();
                break;
            case 2:
                System.out.println("La mayor temperatura del año ha sido en " + mayor_temperatura(temperaturas));
                menu();
                break;
            case 3:
                System.out.println("La menor temperatura del año ha sido en " + menor_temperatura(temperaturas));
                menu();
                break;
            case 4:
                System.out.println("Escribe el mes del que quieres saber la temperatura: ");
                int mes = sc.nextInt();
                System.out.println("La temperatura media fue de: "+ sacar_temperaturas(mes, temperaturas));
                menu();
                break;
            case 5:
                System.out.println("La temperatura emdia de verano es: "+sacar_temperaturas_media_verano(temperaturas));
                menu();
                break;
            case 6:
                System.out.println("La tempreatura media de invierno es: " + sacar_temperaturas_media_invierno(temperaturas)); menu(); break;
            case 7:
                System.out.println("Introduce el primer mes que quieres comparar: ");
                Meses mes2 = Meses.valueOf(sc.next().toUpperCase());
                System.out.println("Introduce el segundo mes que quieres comparar: ");
                Meses mes1 = Meses.valueOf(sc.next().toUpperCase());
                if(comparar_temperaturas(mes1, mes2, temperaturas) == true){
                    System.out.println("Los meses comparados tienen la misma temperatura");
                }else{
                    System.out.println("Loes meses comparados tienen distinta tempreatura");
                }
                menu();
                break;
            default: System.out.println("El dato introducido es erróneo, vuelva a intentarlo"); menu(); break;
        }
    }

    public static float[] inicializar_array(float[] temperaturas){
        temperaturas = new float[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce la temperatura media de "+ sacar_mes(i));
            temperaturas[i] = sc.nextFloat();
        }
        return temperaturas;
    }

    public static Meses mayor_temperatura(float[] temperaturas){
        float mayorTemp = temperaturas[0];
        int mes = 0;
        for(int i = 0; i < 12; i++){
            if(mayorTemp < temperaturas[i]){
                mayorTemp = temperaturas[i];
                mes = i;
            }
        }
         return sacar_mes(mes);
    }

    public static Meses menor_temperatura(float[] temperaturas){
        float menorTemp = temperaturas[0];
        int mes = 0;
        for(int i = 0; i < 12; i++){
            if(menorTemp > temperaturas[i]){
                menorTemp = temperaturas[i];
                mes = i;
            }
        }
        return sacar_mes(mes);
    }

    public static float sacar_temperaturas(int mes, float[] temperaturas){
        return temperaturas[mes];
    }

    public static float sacar_temperaturas_media_verano(float[] temperaturas){
        return(temperaturas[7]+temperaturas[8]+temperaturas[9])/3;
    }

    public static float sacar_temperaturas_media_invierno(float[] temperaturas){
        return(temperaturas[1]+temperaturas[2]+temperaturas[3])/3;
    }

    public static boolean comparar_temperaturas(Meses mes1, Meses mes2, float[] temperaturas) {
        if (temperaturas[sacar_indice(mes1)] == temperaturas[sacar_indice(mes2)]) {
            return true;
        } else {
            return false;
        }
    }

    public static int sacar_indice (Meses mes){
        int indice = -1;
        for(int i = 0; i < Meses.values().length; i++){
            if(mes.equals(Meses.values()[i])){
                indice = i;
            }
        }
        return indice;
    }

    public static Meses sacar_mes (int i){
        return Meses.values()[i];
    }
}
