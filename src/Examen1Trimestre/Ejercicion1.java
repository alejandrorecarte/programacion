package Examen1Trimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicion1 {

    private static Scanner sc = new Scanner(System.in);
    private static float[] arrayDecimales;
    private static boolean inicializado = false;

    public static void main(String[] args) {
        arrayDecimales = new float[solicitarDimension()];
        int opcion = 0;
        do {
            System.out.println("Introduzca una de las siguientes opciones\n" +
                    "0. Salir\n" +
                    "1. Inicializar\n" +
                    "2. Imprimir el valor máximo y su posición\n" +
                    "3. Buscar la posición de un parámetro\n" +
                    "4. Mostrar media\n" +
                    "5. Imprimir array\n" +
                    "Esperando opción...");
            opcion = sc.nextInt();
            switch(opcion){
                case 0: System.out.println("Gracias por usar el programa"); break;
                case 1: incializar(); break;
                case 2:
                    if(inicializado){
                        imprimir_resultado(buscar_maximo(arrayDecimales));
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras oparaciones");
                    break;
                case 3:
                    if(inicializado){
                        System.out.println("Introduzca el parámetro que desea buscar: ");
                        float parametro = sc.nextFloat();
                        System.out.println("El valor de la posición indicada es "+buscar_posicion(arrayDecimales, parametro));
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
                case 4:
                    if(inicializado){
                        System.out.println("La media es: "+calcular_media(arrayDecimales));
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
                case 5:
                    if(inicializado){
                        imprimir(arrayDecimales);
                    }else System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                    break;
            }
        }while(opcion != 0);
    }
    public static int solicitarDimension(){
        int n = 0;
        while(n <= 0 || n >10){
            System.out.println("Introduzca la dimensión: ");
            n = sc.nextInt();
        }
        return n;
    }

    public static void incializar(){
        for (int i = 0; i < arrayDecimales.length; i++){
            System.out.println("Introduce el valor del "+ Ordinales.values()[i]);
            arrayDecimales[i] = sc.nextFloat();
        }
        inicializado = true;
    }

    public static int buscar_posicion(float[] arrayDecimales, float parametro){
        //Se inicializa en -1 para verificación de errores
        int posicion = -1;
        for (int i = 0; i < arrayDecimales.length; i++){
            if(arrayDecimales[i] == parametro){
                posicion = i;
            }
        }
        return posicion;
    }

    public static float[] buscar_maximo(float[] arrayDecimales){
        //Se inicializa en -1 para verificación de errores
        float[] maximoYPosicion = {-1,-1};
        for (int i = 0; i < arrayDecimales.length; i++){
            if(arrayDecimales[i] > maximoYPosicion[0]){
                maximoYPosicion[0] = arrayDecimales[i];
                maximoYPosicion[1] = i;
            }
        }
        return maximoYPosicion;
    }

    public static void imprimir (float[] arrayDecimales){
        System.out.println(Arrays.toString(arrayDecimales));
    }

    public static float calcular_media (float[] arrayDecimales){
        float resultado = 0;
        for (int i = 0; i < arrayDecimales.length; i++){
            resultado += arrayDecimales[i];
        }
        return resultado/(arrayDecimales.length);
    }

    public static void imprimir_resultado (float[] maximoYPosicion){
        System.out.println("El máximo es "+maximoYPosicion[0]+ " y se encuentra en la posición "+ (int) maximoYPosicion[1]);
    }
}
