package Practica1_Alejandro_Recarte_Rebollo;

import java.util.Scanner;

/**
 * @author Alejandro Recarte Rebollo
 * @version 1.0
 */

public class Ejercicio2 {

    private static Scanner scr;

    public static void main(String[] args) {
        scr = new Scanner (System.in);
        seleccion();
    }

    /**
     * Método que permite al usuario elegir la operacion que desea realizar
     */

    public static void seleccion(){
        System.out.println("*** CÁLCULOS CÍRCULO ***\n");
        System.out.println("1.- Cálculo perímetro" +
                "\n2.- Cálculo área" +
                "\n3.- Cálculo volumen");
        int sel;
        try{
            sel = Integer.parseInt(scr.nextLine());
            System.out.println("Introduce el radio del círculo (m):");
            switch (sel){
                case 1: perimetro(Double.parseDouble(scr.nextLine())); break;
                case 2: area(Double.parseDouble(scr.nextLine())); break;
                case 3: volumen(Double.parseDouble(scr.nextLine())); break;
                default: System.out.println("Número no correspondido con ninguna opción ofrecida."); seleccion(); break;
            }

        }catch(NumberFormatException e){
            System.out.println("Introduce un valor válido.");
            seleccion();
        }
    }

    /**
     * Método que imprime el perímetro del círculo que se desea calcular
     * @param r
     */

    public static void perimetro(double r){
        System.out.println("El perímetro del círculo es: " + 2*r*Math.PI + "m");
    }

    /**
     * Método que imprime el área del círculo que se desea calcular
     * @param r
     */

    public static void area(double r){
        System.out.println("El área del círculo es: " + Math.pow(r,2)*Math.PI +"m2");
    }

    /**
     * Método que imprime el área del círculo que se desea calcular
     * @param r
     */

    public static void volumen(double r){
        System.out.println("El volumen de la esfera es: " + ((4*Math.pow(r,3))*Math.PI)/3 +"m3");
    }
}
