package Practica3_Alejandro_Recarte_Rebollo.Apartado1;

public class Television extends Electrodomestico{

    //DECLARACIÓN DE CONSTANTES

    private final int RESOLUCION_DEFECTO = 20;
    private final boolean SINTONIZADOR_TDT_DEFECTO = false;

    //DECLARAICIÓN DE VARIABLES

    private int resolucion;
    private boolean sintonizadorTDT;

    //CONSTRUCTORES

    public Television() {
        super();
        resolucion = RESOLUCION_DEFECTO;
        sintonizadorTDT=SINTONIZADOR_TDT_DEFECTO;
    }
    public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) throws Exception {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        setPrecioFinal(precioFinal());
    }

    //GETTERS y SETTERS

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //MÉTODOS
    @Override
    public double precioFinal(){
        double valorAñadido = 0;
        if (resolucion > 40){
            valorAñadido += getPrecioBase()*0.3;
        }
        if (sintonizadorTDT == true){
            valorAñadido += 50;
        }
        return super.precioFinal()+valorAñadido;
    }
}
