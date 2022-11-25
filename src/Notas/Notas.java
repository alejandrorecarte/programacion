package Notas;

import java.util.Scanner;

public class Notas {
    static double[][] tabla;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        tabla = new double[2][3];

        System.out.println("Introduzca práctica 1 de programación");
        tabla[0][0] = sc.nextDouble();

        System.out.println("Introduzca práctica 2 de programación");
        tabla[0][1] = sc.nextDouble();

        System.out.println("Introduzca nota examen de programación");
        tabla[0][2] = sc.nextDouble();

        System.out.println("Introduzca práctica 1 de bd");
        tabla[1][0] = sc.nextDouble();

        System.out.println("Introduzca práctica 2 de bd");
        tabla[1][1] = sc.nextDouble();

        System.out.println("Introduzca nota examen de bd");
        tabla[1][2] = sc.nextDouble();

        menu();
    }

    public static void menu(){
        System.out.println("1- Media de una asignatura\n2- Media de ambas asignaturas");
        switch(sc.nextInt()){
            case 1: media_asignatura(); break;
            case 2: media_total(); break;
            default: System.out.println("Opción incorrecta, vuelva a intentarlo"); menu();
        }
    }

    public static void media_asignatura(){
        System.out.println("1- Media de programación\n2- Media de bd");
        switch(sc.nextInt()){
            case 1: System.out.println("La media de programación es: "+((tabla[0][0]+tabla[0][1]+tabla[0][2])/3)); break;
            case 2: System.out.println("La media de bd es: "+((tabla[1][0]+tabla[1][1]+tabla[1][2])/3)); break;
            default: System.out.println("Opción incorrecta, vuelva a intentarlo"); menu();
        }
        menu();
    }

    public static void media_total(){
        double suma = 0;
        for(int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                suma += tabla[i][j];
            }
        }
        System.out.println("La media total es: "+ suma/6);
    }

}
