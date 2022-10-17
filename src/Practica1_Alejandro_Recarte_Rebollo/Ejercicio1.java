package Practica1_Alejandro_Recarte_Rebollo;

import java.util.Scanner;

/**
 * @author Alejandro Recarte Rebollo
 * @version 1.0
 */

public class Ejercicio1 {

    private static Scanner scr;
    private static double precioVivienda;

    public static void main(String[] args) {
        scr = new Scanner (System.in);
        if(tieneTrabajo()){
            precioVivienda = escribirDinero();
            if(dineroSolicitadoNoExcede()){
                if(dineroAhorradoSuficiente()){
                    System.out.println("El cliente puede solicitar el préstamo");
                }
            }
        }
    }

    /**
     * Método que devuelve si el cliente tiene o no trabajo
     * @return true si tiene trabajo, y false si no lo tiene
     */

    private static boolean tieneTrabajo(){
        System.out.println("¿El cliente tiene trabajo?");
        String tieneTrabajoString = scr.nextLine();
        if(tieneTrabajoString.equals("s")){
            return true;
        }else if(tieneTrabajoString.equals("n")){
            System.out.println("El cliente no puede solicitar el préstamo.");
            return false;
        }else{
            System.out.println("Introduzca un valor válido.");
            return (tieneTrabajo());
        }
    }

    /**
     * Método que devuelve si el dinero que solicita excede el 80% del precio de la vivienda
     * @return true si no excede y false si excede
     */

    private static boolean dineroSolicitadoNoExcede(){
        System.out.println("Introduzca el dinero que solicita el cliente.");
        double dineroSolicita;
        dineroSolicita = scr.nextDouble();
        if(dineroSolicita < 0.8*precioVivienda) {
            return true;
        }
        System.out.println("El cliente no puede solicitar el préstamo");
        return false;
    }

    /**
     * Método que devuelve si el dinero que tiene ahorrado es menor o igual del 20% del precio de la vivienda
     * @return true si tiene suficiente dinero ahorrado y false si no lo tiene
     */

    private static boolean dineroAhorradoSuficiente(){
        System.out.println("Introduzca el dinero que tiene ahorrado el cliente.");
        double dineroAhorrado;
        dineroAhorrado = escribirDinero();
        if(dineroAhorrado >= 0.2*precioVivienda) {
            return true;
        }
        System.out.println("El cliente no puede solicitar el préstamo.");
        return false;
    }

    /**
     * Método que devuelve lo que ha escrito el usuario por teclado evitando posibles errores en la escritura
     * @return El dinero que escribe el usuario tipo double
     */

    private static double escribirDinero(){
        try{
            return Double.parseDouble(scr.nextLine());
        } catch(NumberFormatException e){
            System.out.println("Introduce un valor válido");
            return escribirDinero();
        }
    }
}
