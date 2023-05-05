package Alumno;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Sergio Cervera", 15));
        alumnos.add(new Alumno("Alejandro Recarte", 9));
        alumnos.add(new Alumno("Inés Trigo", 10));
        alumnos.add(new Alumno("Ángel David Arellano", 12));

        alumnos.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(alumnos.toString());
        alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(alumnos.toString());
        alumnos.sort(Comparator.comparing(Alumno::getNota));
        System.out.println(alumnos.toString());
        alumnos.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(alumnos.toString());
        alumnos.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getNota));
        System.out.println(alumnos.toString());
        alumnos.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getNota).reversed());
        System.out.println(alumnos.toString());

    }
}
