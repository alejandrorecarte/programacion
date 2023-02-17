package Vehiculos;

public class Moto extends Vehiculo{

    private int cilindrada;


    public Moto(int km_realizados, String matricula, int cilindrada) {
        super(km_realizados, matricula);
        this.cilindrada = cilindrada;
    }


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String showInfo(){
        return(super.showInfo()+ "Moto{" +
                "cilindrada= "+cilindrada
                + "}");
    }
}
