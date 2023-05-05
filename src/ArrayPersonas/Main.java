package ArrayPersonas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("1A", "Recarte Rebollo", "Alejandro", 'H', 21, 95));
        personas.add(new Persona("2B", "Cervera Jimenez", "Sergio", 'H', 20, 70));
        personas.add(new Persona("3C", "Trigo Rodrigues", "Inés", 'M', 24, 50));

        ListadoPersonas listadoPersonas = new ListadoPersonas(personas);

        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        while(salir == true) {
            System.out.println("MENÚ" +
                    "0. Buscar por el dni" +
                    "1. Elmimiar una persona" +
                    "2. Ordenar por apellidos" +
                    "3. Ordenar por sexo" +
                    "4. Imprimir el array" +
                    "5. Salir");
            switch (sc.nextInt()){
                case 0: System.out.println(listadoPersonas.dniSearch(sc.next()).toString());
            }
        }
    }
}
