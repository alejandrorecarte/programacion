package Practica3_Alejandro_Recarte_Rebollo.Ejercicio2;

public abstract class Figura implements IAcciones{

    protected double volumen;
    protected double area;

    /**
     * Devuelve el valor de volumen
     * @return volumen
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * Cambia el valor de volumen
     * @param volumen
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Devuelve el valor de area
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * Cambia el valor de area
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }
}
