package Vehiculos;

public class UsoVehiculo {

    public static void main(String[] args) {
        Moto motomami = new Moto(0, "1111BBB", 125);
        Coche seatibizaflamigero = new Coche (189000, "9526CMW", 3, 100);
        Camion scaniabacanito = new Camion (400000, "1112BBB", 6);

        System.out.println(motomami.showInfo());
        System.out.println(seatibizaflamigero.showInfo());
        System.out.println(scaniabacanito.showInfo());
    }
}
