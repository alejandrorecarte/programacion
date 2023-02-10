package Practica2_Alejandro_Recarte_Rebollo;

import java.util.Scanner;

public class Ejercicio1 {

    //VARIABLES
    private static float[] temperaturas;
    private static Scanner sc;

    //MAIN
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        menu();
    }

    //METODOS
    /**
     * menu permite imprimir por pantalla el menú para que el usuario seleccione la opción que estime a través de un Scanner
     */
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
                salir();
                break;
            case 1:
                temperaturas=inicializar_array(temperaturas);
                System.out.println("La lista se ha inicialzado correctamente");
                menu();
                break;
            case 2:
                if(temperaturas != null) {
                    System.out.println("La mayor temperatura del año ha sido en " + mayor_temperatura(temperaturas));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 3:
                if(temperaturas != null) {
                    System.out.println("La menor temperatura del año ha sido en " + menor_temperatura(temperaturas));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 4:
                if (temperaturas != null) {
                    System.out.println("Escribe el mes del que quieres saber la temperatura: ");
                    int mes = sc.nextInt();
                    System.out.println("La temperatura media fue de: " + sacar_temperaturas(mes, temperaturas));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 5:
                if (temperaturas != null) {
                    System.out.println("La temperatura emdia de verano es: " + sacar_temperaturas_media_verano(temperaturas));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 6:
                if (temperaturas != null) {
                    System.out.println("La tempreatura media de invierno es: " + sacar_temperaturas_media_invierno(temperaturas));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 7:
                if (temperaturas != null) {
                    System.out.println("Introduce el primer mes que quieres comparar: ");
                    Meses mes2 = Meses.valueOf(sc.next().toUpperCase());
                    System.out.println("Introduce el segundo mes que quieres comparar: ");
                    Meses mes1 = Meses.valueOf(sc.next().toUpperCase());
                    if (comparar_temperaturas(mes1, mes2, temperaturas) == true) {
                        System.out.println("Los meses comparados tienen la misma temperatura");
                    } else {
                        System.out.println("Los meses comparados tienen distinta temperatura");
                    }
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            default: System.out.println("El dato introducido es erróneo, vuelva a intentarlo"); menu(); break;
        }
    }

    //METODOS
    /**
     * salir imprime por pantalla que se está saliendo del programa
     */
    private static void salir(){
        System.out.println("Saliendo del programa...");
    }

    //FUNCIONES
    /**
     * inicializar_array permite inicializar y llenar de datos el array que se le pasa como argumento
     * @param temperaturas
     * @return
     */
    private static float[] inicializar_array(float[] temperaturas){
        temperaturas = new float[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce la temperatura media de "+ sacar_mes(i));
            temperaturas[i] = sc.nextFloat();
        }
        return temperaturas;
    }

    /**
     * mayor_temperatura devuelve el mes del año con mayor temperatura media
     * @param temperaturas
     * @return Meses mes
     */
    private static Meses mayor_temperatura(float[] temperaturas){
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

    /**
     * menor_temperatura devuelve el mes del año con menor temperatura media
     * @param temperaturas
     * @return Meses mes
     */
    private static Meses menor_temperatura(float[] temperaturas){
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

    /**
     * sacar_temperaturas devuelve la temperatura de un mes introducido con su indice
     * @param mes
     * @param temperaturas
     * @return float temperatura
     */
    private static float sacar_temperaturas(int mes, float[] temperaturas){
        float temperatura = 0;
        temperatura = temperaturas[mes-1];
        return temperatura;
    }

    /**
     * sacar_temperaturas_media_verano devuelve la temperatura media de los meses de julio, agosto y septiembre
     * @param temperaturas
     * @return float temperatura_ media
     */
    private static float sacar_temperaturas_media_verano(float[] temperaturas){
        float media_verano = 0;
        media_verano = (temperaturas[6]+temperaturas[7]+temperaturas[8])/3;
        return media_verano;
    }

    /**
     * sacar_temperaturas_media_invierno devuelve la temperatura media de los meses de enero, febrero y marzo
     * @param temperaturas
     * @return floar temperatura_media
     */
    private static float sacar_temperaturas_media_invierno(float[] temperaturas){
        float media_invierno = 0;
        media_invierno = (temperaturas[0]+temperaturas[1]+temperaturas[2])/3;
        return media_invierno;
    }

    /**
     * comparar_temperaturas permite devolver true o false en función de si la temperatura de dos meses son iguales
     * @param mes1
     * @param mes2
     * @param temperaturas
     * @return misma_temperatura
     */
    public static boolean comparar_temperaturas(Meses mes1, Meses mes2, float[] temperaturas) {
        boolean comparacion = false;
        if (temperaturas[sacar_indice(mes1)] == temperaturas[sacar_indice(mes2)]) {
            comparacion = true;
        }
        return comparacion;
    }

    //FUNCIONES AUXILIARES
    /**
     * sacar_indice permite devolver un numero entero con la índice del mes que se le introduce como argumento
     * @param mes
     * @return int indice
     */
    public static int sacar_indice (Meses mes){
        int indice = -1;
        for(int i = 0; i < Meses.values().length; i++){
            if(mes.equals(Meses.values()[i])){
                indice = i;
            }
        }
        return indice;
    }

    /**
     * sacar_mes permite devolver el mes del que se le pasa el indice como argumento
     * @param i
     * @return Meses mes
     */
    public static Meses sacar_mes (int i){
        return Meses.values()[i];
    }
}
