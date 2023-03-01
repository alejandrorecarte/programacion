package Practica3_Alejandro_Recarte_Rebollo.Apartado2;

public abstract class Figura implements IAcciones{

    private double volumen;
    private double area;

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
