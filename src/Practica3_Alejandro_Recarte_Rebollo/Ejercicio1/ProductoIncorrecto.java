package Practica3_Alejandro_Recarte_Rebollo.Ejercicio1;


public class ProductoIncorrecto extends Exception{

    /**
     * Imprime por pantalla el mensaje que se le da como parámetro
     * @param mensaje
     */
    public ProductoIncorrecto(String mensaje) throws Exception{
        System.out.println(mensaje);
    }
}
