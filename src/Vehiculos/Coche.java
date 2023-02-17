package Vehiculos;

public class Coche extends Vehiculo{

    private int num_puertas;
    private int caballos;


    public Coche(int km_realizados, String matricula, int num_puertas, int caballos) {
        super(km_realizados, matricula);
        this.num_puertas = num_puertas;
        this.caballos = caballos;
    }


    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String showInfo(){
        return(super.showInfo()+ "Coche{" +
                "num_puertas= "+ num_puertas +
                ", caballos= "+ caballos
                + "}");
    }
}
