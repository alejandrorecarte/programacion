package Examen1Trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicion3 {

    private static int[] arrayEnteros;
    private static final int MAXIMO = 200;
    private static final int MINIMO = -200;
    private static boolean inicializado = false;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        arrayEnteros = new int[solicitardimension()];
        int opcion = 0;
        do{
            System.out.println("Introduzca una de las siguientes opciones\n" +
                    "0. Salir\n" +
                    "1. Inicializar array aleatoriamente\n" +
                    "2. Comprobar si es múltiplo de 3 y 5 a la vez\n" +
                    "3. Indicar el número de negativos en el array\n" +
                    "4. Verificar si es capicúa el array\n" +
                    "Esperando opción...");
            opcion = sc.nextInt();
            switch(opcion){
                case 0: System.out.println("Gracias por usar la app"); break;
                case 1: inicializar(); System.out.println(Arrays.toString(arrayEnteros)); break;
                case 2:
                    if(inicializado== true){
                        imprimir_multiplos();
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
                case 3:
                    if(inicializado== true){
                        System.out.println("Hay "+num_negativos(arrayEnteros)+" números negativos");
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
                case 4:
                    if(inicializado== true){
                        System.out.print("La secuencia facilitada ");
                        verificar_capicua(arrayEnteros);
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
                default: System.out.println("Marque una opción correcta");
            }
        }while(opcion != 0);
    }

    public static int solicitardimension (){
        int dimension = 0;
        do{
            System.out.println("Introduzca la dimensión del array");
            dimension = sc.nextInt();
            if (dimension <= 0) System.out.println("Introduzca una dimensión correcta");
        }while (dimension < 0);
        return dimension;
    }

    public static void inicializar(){
        for (int i = 0; i < arrayEnteros.length; i++){
            arrayEnteros[i] = (int) (Math.random()*((MAXIMO-MINIMO)+1)+MINIMO);
        }
        inicializado = true;
    }

    public static void imprimir_multiplos(){
        for (int i = 0; i < arrayEnteros.length; i++){
            float num = arrayEnteros[i];
            if((num%3) == 0 && (num%5) == 0){
                System.out.println("\u001B[31m"+num);
            }else System.out.println("\u001B[0m"+num);
        }
    }

    public static int num_negativos (int[] arrayEnteros){
        int contador = 0;
        for(int i = 0; i < arrayEnteros.length; i++){
            if(arrayEnteros[i]<0){
                contador++;
            }
        }
        return contador;
    }

    public static void verificar_capicua (int [] arrayEnteros){
        int[] arrayVolteado =  new int[arrayEnteros.length];
        int j = arrayEnteros.length-1;
        for(int i = 0; i < arrayEnteros.length; i++){
            arrayVolteado[i] = arrayEnteros[j];
            j--;
        }
        if(Arrays.equals(arrayVolteado,arrayEnteros)){
            System.out.println("es capicúa");
        }else System.out.println("no es capicúa");
    }

}
