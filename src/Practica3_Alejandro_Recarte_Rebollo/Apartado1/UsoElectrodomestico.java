package Practica3_Alejandro_Recarte_Rebollo.Apartado1;

public class UsoElectrodomestico {

    public static void main(String[] args) {
        try {
            Electrodomestico[] electrodomesticos = new Electrodomestico[5];
            Lavadora lavadora1 = new Lavadora(150, "blanco", 'A', 50, 40);
            Lavadora lavadora2 = new Lavadora(80, "negro", 'B', 50, 20);
            Lavadora lavadora3 = new Lavadora(70, "azul", 'C', 20, 30);
            Television television1 = new Television(40, "rojo", 'E', 10, 50, true);
            Television television2 = new Television(20, "gris", 'F', 5, 20, false);
            electrodomesticos[0] = lavadora1;
            electrodomesticos[1] = lavadora2;
            electrodomesticos[2] = lavadora3;
            electrodomesticos[3] = television1;
            electrodomesticos[4] = television2;

            //EXCEPCIONES

            //Letra con precio
            //Lavadora lavadoraLetraPrecio = new Lavadora (20, "blanco", 'A', 50, 40);

            //Color dentro de la gama
            //Lavadora lavadoraColorGama = new Lavadora (150, "verde", 'A', 50, 40);

            double precioTotal = 0;

            for (int i = 0; i < electrodomesticos.length; i ++){
                if(electrodomesticos[i] instanceof Lavadora){
                    System.out.println("El precio de la lavadora es: "+ electrodomesticos[i].getPrecioFinal());
                    precioTotal += electrodomesticos[i].getPrecioFinal();
                }
                else if(electrodomesticos[i] instanceof Television){
                    System.out.println("El precio de la television es: "+ electrodomesticos[i].getPrecioFinal());
                    precioTotal += electrodomesticos[i].getPrecioFinal();
                }
            }
            System.out.println("El precio total de todos los electrodomésticos es: "+ precioTotal);
        } catch (Exception e){
            System.out.println("Error instanciando las clases");
        }
    }
}
