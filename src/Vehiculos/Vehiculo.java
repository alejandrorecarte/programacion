package Vehiculos;

public class Vehiculo {

    private int km_realizados;
    private String matricula;

    public Vehiculo(int km_realizados, String matricula) {
        this.km_realizados = km_realizados;
        this.matricula = matricula;
    }


    public int getKm_realizados() {
        return km_realizados;
    }

    public void setKm_realizados(int km_realizados) {
        this.km_realizados = km_realizados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void run (int km){
        this.km_realizados += km;
    }

    public String showInfo(){
        return("Vehiculo{" +
                "km_realizados= " + km_realizados +
                ", matricula= " + matricula +
                "}");
    }
}
