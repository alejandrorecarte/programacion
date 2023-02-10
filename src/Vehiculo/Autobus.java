package Vehiculo;

public class Autobus extends Vehiculo{

    private int numeroPlazas;



    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
