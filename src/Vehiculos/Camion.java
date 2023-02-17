package Vehiculos;

public class Camion extends Vehiculo{

    private int num_ejes;


    public Camion(int km_realizados, String matricula , int num_ejes) {
        super(km_realizados,matricula);
        this.num_ejes = num_ejes;
    }

    public int getNum_ejes() {
        return num_ejes;
    }

    public void setNum_ejes(int num_ejes) {
        this.num_ejes = num_ejes;
    }

    public String showInfo(){
        return(super.showInfo()+ "Camion{" +
                "num_ejes= "+ num_ejes
                + "}");
    }
}
