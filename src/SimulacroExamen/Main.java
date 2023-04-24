package SimulacroExamen;

public class Main {

    public static void main(String[] args) {
        Hombre h1 = new Hombre("1A", "Alejandro", "Recarte", 22, 1.7, 96, false);
        Hombre h2 = new Hombre("1A", "Alejandro", "Recarte", 22, 1.7, 80, true);
        Hombre h3 = new Hombre("1A", "Alejandro", "Recarte", 22, 1.7, 60, true);
        Mujer m1 = new Mujer("1A", "Alejandro", "Recarte", 22, 1.7, 75, false);
        Mujer m2 = new Mujer("1A", "Alejandro", "Recarte", 22, 1.7, 120, true);
        Mujer m3 = new Mujer("1A", "Alejandro", "Recarte", 22, 1.7, 40, false);

        Filtrados.add(h1);
        Filtrados.add(m1);
        Filtrados.add(m2);
        Filtrados.printArray(Filtrados.lista);
    }


}
