package Practica3_Alejandro_Recarte_Rebollo.Apartado2;

public class UsoFigura {

    public static void main(String[] args) {
        try {
            Cuadrado cuadrado = new Cuadrado(7);
            System.out.println(cuadrado.getArea());
            System.out.println(cuadrado.getVolumen());
            cuadrado.dibujar();
        }catch(Exception e){
            System.out.println("Error al instanciar la clase");
            e.printStackTrace();
        }
    }
}
