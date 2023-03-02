package Practica3_Alejandro_Recarte_Rebollo.Apartado2;

public class ExcepcionCuadrado extends Exception{

    /**
     * Imprime por pantalla el mensaje que se le da como parámetro
     * @param mensaje
     */
    public ExcepcionCuadrado(String mensaje){
        System.out.println(mensaje);
    }
}
