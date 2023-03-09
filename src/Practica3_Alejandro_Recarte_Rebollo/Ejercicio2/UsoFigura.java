package Practica3_Alejandro_Recarte_Rebollo.Ejercicio2;

public class UsoFigura {

    public static void main(String[] args) {
        try {
            Cuadrado cuadrado1 = new Cuadrado (1);
            Cuadrado cuadrado2 = new Cuadrado(2);
            Cuadrado cuadrado3 = new Cuadrado(3);

            //EXCEPCIONES

            //Lado < 0
            //Cuadrado cuadradoException = new Cuadrado (-1);

            System.out.println(cuadrado1.getArea());
            System.out.println(cuadrado1.getVolumen());
            cuadrado1.dibujar();
            System.out.println(cuadrado2.getArea());
            System.out.println(cuadrado2.getVolumen());
            cuadrado2.dibujar();
            System.out.println(cuadrado3.getArea());
            System.out.println(cuadrado3.getVolumen());
            cuadrado3.dibujar();

        }catch(Exception e){
            System.out.println("Error al instanciar la clase");
            e.printStackTrace();
        }
    }
}
