package Practica3_Alejandro_Recarte_Rebollo.Apartado1;


public class ProductoIncorrecto extends Exception{

    public ProductoIncorrecto(String mensaje) throws Exception{
        System.out.println(mensaje);
    }
}
