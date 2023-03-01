package Practica3_Alejandro_Recarte_Rebollo.Apartado1;

public class Lavadora extends Electrodomestico{

    //DECLARACIÓN DE CONSTANTES

    private final int CARGA_DEFECTO = 5;

    //DECLARACIÓN DE VARIABLES

    private int carga;

    //CONSTRUCTORES

    public Lavadora(){
        super();
        this.carga = CARGA_DEFECTO;
        precioFinal();
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) throws Exception {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
        setPrecioFinal(precioFinal());
    }

    //GETTERS

    public int getCarga() {
        return carga;
    }

    //MÉTODOS

    @Override
    public double precioFinal() {
        if(carga > 30){
            return super.precioFinal()+50;
        }
        else return super.precioFinal();
    }
}
