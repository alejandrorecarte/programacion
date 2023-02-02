package Libreria;

public class Main {

    public static void main(String[] args) {
        Editorial editorial1 = new Editorial(1, "Planeta", 2020);
        Libro libro1 = new Libro("1A", "La metamorfosis", 2023, 25, editorial1);
        System.out.println("El nombre del libro es: "+libro1.getTitulo());
        System.out.println("El año de publicación es: "+libro1.getAnioPublicacion());
        System.out.println("El nombre de la editorial es: "+editorial1.getNombre());

    }
}
