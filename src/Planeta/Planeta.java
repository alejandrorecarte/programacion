package Planeta;

public class Planeta {

    private String nombre;
    private int satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaAlSol;
    private Tamanio tamanio;
    private boolean observable;

    public Planeta(){
        observable=false;
    }
    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaAlSol, Tamanio tamanio, boolean observable){
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.tamanio = tamanio;
        this.observable =  observable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void setDistanciaAlSol(int distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double getVolumen() {
        return volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public boolean isObservable() {
        return observable;
    }

    public double getDensidad(){return (masa/volumen);}

    public boolean esExterior(){
        if(distanciaAlSol>149597870*2.75){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", satelites=" + satelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaAlSol=" + distanciaAlSol +
                ", tamanio=" + tamanio +
                ", observable=" + observable +
                '}';
    }
}
