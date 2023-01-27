package Persona;

import java.util.Scanner;

public class UsoPersona {

    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu DNI");
        p.setDni(sc.next());
        System.out.println("Escribe tu nombre");
        p.setNombre(sc.next());
        System.out.println("Escribe tus apellidos");
        p.setApellidos(sc.next());
        System.out.println("Escribe tu edad");
        p.setEdad(sc.nextInt());
        System.out.println("TUS DATOS:" +
                "\nDNI: "+p.getDni()+
                "\nNombre: "+p.getNombre()+
                "\nApellidos: "+p.getApellidos()+
                "\nEdad: "+p.getEdad());
    }
}
