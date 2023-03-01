package Examen2Trimestre.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        try {
            EmisoraTradicional emisora1 = new EmisoraTradicional(123, "Radio Patio", 2001, 15, 550);
            EmisoraTradicional emisora2 = new EmisoraTradicional(124, "RockFM", 2012, 16000, 90);
            EmisoraTradicional emisora3 = new EmisoraTradicional(125, "Los 40 Classic", 2018, 25000, 570);
            EmisoraOnLine emisora4 = new EmisoraOnLine(127, "Radio Móstoles", 1976, 650, "www.mostoles.radio.com");
            EmisoraOnLine emisora5 = new EmisoraOnLine(128, "Radio3", 1980,20000, "www.rtve.radio3.radio.com");
            Emisora[] emisoras = new Emisora[]{emisora1, emisora2, emisora3, emisora4, emisora5};

            //EXCEPCIONES

            //Excepcion IllegalArguments
            //EmisoraTradicional emisoraExcepcionFrecuencia = new EmisoraTradicional(222, "Radio Excepciones", 2000, 1, 10);

            //Excpecion CreacionInvalida
            //EmisoraOnLine emsiroaExcepcionAnyo = new EmisoraOnLine(223, "Radio ExcepcionesOnLine", 1800, 1, "www.excepciones.radio.com");

            //Excepcion OpcionInvalida
            //emisora1.iniciarEmision();
            //emisora1.iniciarEmision();
            //emisora1.finalizarEmision();
            //emisora1.finalizarEmision();

            for(int i = 0; i < emisoras.length; i++){
                System.out.println("La "+ emisoras[i].getClass().getSimpleName()+ " " + emisoras[i].getNombre() + " tiene " + emisoras[i].getNum_oyentes() + " oyentes con ganancias " + emisoras[i].ganancias() + "euros");
            }
        }catch(Exception e){
            System.out.println("Error instanciando las clases");
        }
    }
}