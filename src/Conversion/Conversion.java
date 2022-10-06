package Conversion;



public class Conversion {



    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Convertir un integer a byte de manera explicita");

        b = (byte) i;
        System.out.print("i = "+i+", b = "+b);
    }
}
