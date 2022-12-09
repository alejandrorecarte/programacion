package Examen1Trimestre;

import java.util.Scanner;

public class Ejercicion2 {

    private enum letras {A,B};
    private static String[][] propietarios = new String[3][2];
    //Se declara aquí para facilitar modificaciones en un futuro
    private static float[] cuotasPorPiso = {50.25F,78.15F,96.4F};
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializar();
        imprimir();
        System.out.println("La comunidad paga en cuotas "+cuotas_comunidad());
        System.out.println("¿Quiere saber si hay vecinos que se llaman igual? S/N");
        if(sc.next().toUpperCase().equals("S")){
            System.out.println("Dígame el nombre");
            String nombre = sc.next();
            System.out.println("El número de vecinos llamad@s "+ nombre +" es de " +buscar_vecino(propietarios, nombre));
        }
    }

    public static void inicializar(){
        for (int i = 0; i < propietarios.length; i++){
            for (int j = 0; j < propietarios[i].length; j++){
                System.out.println("Introduzcame el nombre del "+ Ordinales.values()[i]+" "+letras.values()[j]);
                propietarios[i][j] = sc.next().toUpperCase();
            }
        }
    }

    public static void imprimir(){
        for(int i = 0; i < propietarios.length; i++){
            for(int j = 0; j < propietarios[i].length; j++){
                System.out.println("El nombre del propietario del "+ Ordinales.values()[i]+ " "+letras.values()[j]+ " es "+propietarios[i][j]);
            }
        }
    }

    public static float cuotas_comunidad(){
        float cuota = 0;
        for(int i = 0; i < propietarios.length; i++){
            for(int j = 0; j < propietarios[i].length; j++){
                cuota +=  cuotasPorPiso[i];
            }
        }
        return cuota;
    }

    public static int buscar_vecino (String[][] propietarios, String parametro){
        int contador = 0;
        for (int i = 0; i < propietarios.length; i++){
            for (int j = 0; j < propietarios[i].length; j++){
                if(propietarios[i][j].toUpperCase().equals(parametro.toUpperCase())){
                    contador++;
                }
            }
        }
        return contador;
    }
}
