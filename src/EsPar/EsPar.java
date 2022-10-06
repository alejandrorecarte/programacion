package EsPar;

import java.util.Scanner;

public class EsPar {

    private static Scanner sc;

    public static void main (String[] args){

        sc = new Scanner(System.in);
        System.out.println("Introduzca un número");

        if(sc.nextInt()%2 == 0){
            System.out.println("Su número es PAR");
        }else{
            System.out.println("Su numero es IMPAR");
        }
    }
}
