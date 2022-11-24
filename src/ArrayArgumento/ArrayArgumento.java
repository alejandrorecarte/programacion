package ArrayArgumento;

import java.util.Arrays;

public class ArrayArgumento {
    public static void main(String[] args) {

        int[] arrayorigen = {1,2,3,4,5};
        int longitud = calcular_longitud(arrayorigen);
        imprimirarray(arrayorigen, longitud);

    }

    public static void imprimirarray(int[] arrayorigen, int longitud){

      System.out.println("El array "+ Arrays.toString(arrayorigen)+ " tiene una longitud de "+longitud);

    }

    private static int calcular_longitud(int[] arrayorigen){

        int resulta = -1;
        resulta = arrayorigen.length;
        return resulta;

    }
}
