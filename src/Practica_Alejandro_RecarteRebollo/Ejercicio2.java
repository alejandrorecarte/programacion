package Practica_Alejandro_RecarteRebollo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    //VARIABLES
    private static String[] lista;
    private static Scanner sc;

    //MAIN
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la lista");
        lista = new String[sc.nextInt()];
        menu();
    }

    //MÉTODOS
    /**
     * menu permite imprimir por pantalla el menú para que el usuario seleccione la opción que estime a través de un Scanner
     */
    private static void menu(){
        System.out.println("\nIntroduzca una opción:\n" +
                "0.- Salir\n" +
                "1.- Hacer la lista de la compra\n" +
                "2.- Número de items de la compra\n" +
                "3.- Imprimir lista de la compra\n" +
                "4.- Comprobar si existe elemento y en que posición de la lista está\n" +
                "5.- Comprobar número de veces que se repite un elemento de la lista de la compra introducido por teclado\n" +
                "6.- Número de vocales en un producto introducido por teclado\n" +
                "7.- Eliminar el producto de la lista introducido por teclado\n" +
                "8.- Introducir un nuevo elemento en la lista");

        switch(sc.nextInt()){
            case 0: salir(); break;
            case 1:
                lista = hacer_lista(lista);
                System.out.println("La lista se ha rellenado correctamente");
                menu();
                break;
            case 2:
                if(lista[0] != null) {
                    System.out.println("El número de items de la lista es: " + tamano_lista(lista));
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 3:
                if(lista[0] != null) {
                    System.out.println("Los elementos de la lista son: ");
                    imprimir_lista(lista);
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 4:
                if(lista[0] != null) {
                    System.out.println("Introduce el elemento que quieres comprobar");
                    int[] posiciones = buscar_elemento(lista, sc.next());
                    System.out.print("El elemento se encuentra en las posiciones ");
                    for (int i = 0; i < posiciones.length; i++) {
                        System.out.print(posiciones[i]);
                        if (i != posiciones.length - 1) {
                            System.out.print(", ");
                        }
                    }
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 5:
                if (lista[0] != null) {
                    System.out.println("Introduce el elemento que quieres contar");
                    System.out.println("El elemento está " + cuantas_veces(lista, sc.next()) + " veces");
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 6:
                if(lista[0] != null) {
                    System.out.println("Introduce el elemento de cuyas vocales quieres conocer");
                    String elemento = sc.next();
                    int[] contadores;
                    if (cuantas_veces(lista, elemento) > 0) {
                        contadores = cuantas_vocales(elemento);
                    } else contadores= cuantas_vocales("");
                    System.out.println("La palabra " +elemento+ " tiene las siguientes vocales\n" +
                            "a --> "+contadores[0]+"\n" +
                            "e --> "+contadores[1]+"\n" +
                            "i --> "+contadores[2]+"\n" +
                            "o --> "+contadores[3]+"\n" +
                            "u --> "+contadores[4]);
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 7:
                if(lista[0] != null) {
                    System.out.println("Introduce el elemento que quieres eliminar");
                    lista = eliminar_elemento(lista, sc.next());
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            case 8:
                if(lista[0] != null) {
                    System.out.println("Introduce el elemento que quieres añadir");
                    lista = anadir_elemento(lista, sc.next());
                }else System.out.println("Primero debes inicializar el array usando la opción 1");
                menu();
                break;
            default: System.out.println("El dato introducido es erróneo, vuelva a intentarlo"); menu(); break;
        }
    }

    //MÉTODOS
    /**
     * salir imprime por pantalla que estamos saliendo del programa
     */
    private static void salir(){
        System.out.println("Saliendo del programa...");
    }

    //FUNCIONES
    /**
     * hacer_lista devuelve una lista llena de datos que introduzce el usuario por teclado usando la lista que se pase como argumento
     * @param lista
     * @return String[] lista
     */
    private static String[] hacer_lista(String[] lista){
        for(int i = 0; i < lista.length; i++){
            System.out.println("Introduce el elemento nº "+i);
            lista[i] = sc.next();
        }
        return lista;
    }
    /**
     * tamano_lista devuelve el tamaño de la lista que se le pasa como argumento
     * @param lista
     * @return lista.length
     */
    private static int tamano_lista(String[] lista){
        int longitud = 0;
        longitud = lista.length;
        return longitud;
    }

    /**
     * buscar_elemento devuelve una lista de las posiciones que ocupan en un array un elemento
     * @param lista
     * @param elemento
     * @return int[] posiciones
     */
    private static int[] buscar_elemento(String[] lista, String elemento){
        int[] posiciones = new int[0];
        for (int i = 0; i < lista.length; i++){
            if (lista[i].equals(elemento)){
                posiciones = Arrays.copyOf(posiciones, posiciones.length+1);
                posiciones[posiciones.length-1] = i;
            }
        }
        return posiciones;
    }

    /**
     * cuantas_veces devuelve el número de veces que se encuentra un elemento en un array
     * @param lista
     * @param elemento
     * @return int contador
     */
    private static int cuantas_veces(String[] lista, String elemento){
        int contador = 0;
        for(int i = 0; i < lista.length; i++){
            if (elemento.equals(lista[i])){
                contador++;
            }
        }
        return contador;
    }

    /**
     * cuantas_vocales devuelve un array de enteros donde las posiciones son
     * 0 -> numero de 'a'
     * 1 -> numero de 'e'
     * 2 -> numero de 'i'
     * 3 -> numero de 'o'
     * 4 -> numero de 'u'
     * @param elemento
     * @return int[] contadores
     */
    private static int[] cuantas_vocales(String elemento) {
        char[] elementoCharArray = elemento.toCharArray();
        int[] contadores = {0, 0, 0, 0, 0};
        for (int i = 0; i < elementoCharArray.length; i++) {
            switch (elementoCharArray[i]) {
                case 'a':
                    contadores[0]++;
                    break;
                case 'e':
                    contadores[1]++;
                    break;
                case 'i':
                    contadores[2]++;
                    break;
                case 'o':
                    contadores[3]++;
                    break;
                case 'u':
                    contadores[4]++;
                    break;
            }
        }
        return contadores;
    }

    /**
     * eliminar_elemento devuelve un array sin los elementos que se le pasen como argumento
     * @param lista
     * @param elemento
     * @return String[] lista
     */
    private static String[] eliminar_elemento (String[] lista, String elemento){
        String[] lista_resultado = new String[lista.length-cuantas_veces(lista, elemento)];
        int j = 0;
        for(int i = 0; i < lista.length; i++){
            if (!lista[i].equals(elemento)) {
                lista_resultado[j] = lista[i];
                j++;
            }
        }
        System.out.println("La nueva lista es: ");
        imprimir_lista(lista_resultado);
        return lista_resultado;
    }

    /**
     * añadir_elemento devuelve un array añadiendo el elemento que se le pase como array
     * @param lista
     * @param elemento
     * @return String[] lista
     */
    private static String[] anadir_elemento (String[] lista, String elemento){
        lista = Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1] = elemento;
        System.out.println("La nueva lista es: ");
        imprimir_lista(lista);
        return lista;
    }

    //MÉTODOS AUXILIARES
    /**
     * imprimir_lista permite imprimir por pantalla la lista que se le pasa como argumento
     * @param lista
     */
    private static void imprimir_lista (String[] lista){
        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i]);
            if(i != lista.length-1){
                System.out.print(", ");
            }
        }
    }
}
