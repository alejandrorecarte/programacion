package Aeropuerto;

public final class Aeropuerto {

    private final double GANANCIAS_MULT = 6.25;
    private String nombre;
    private String pais;
    private String provincia;
    private double beneficios_anuales;
    private int num_viajeros;
    private int num_terminales;

    public Aeropuerto(String nombre, String pais, String provincia, int num_viajeros, int num_terminales) {
        this.nombre = nombre;
        this.pais = pais;
        this.provincia = provincia;
        this.num_viajeros = num_viajeros;
        this.num_terminales = num_terminales;
        this.beneficios_anuales = obtenerGanancia();
    }

    public double obtenerGanancia(){
        return num_viajeros * num_terminales + GANANCIAS_MULT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getBeneficios_anuales() {
        return beneficios_anuales;
    }

    public void setBeneficios_anuales(double beneficios_anuales) {
        this.beneficios_anuales = beneficios_anuales;
    }

    public int getNum_viajeros() {
        return num_viajeros;
    }

    public void setNum_viajeros(int num_viajeros) {
        this.num_viajeros = num_viajeros;
    }

    public int getNum_terminales() {
        return num_terminales;
    }

    public void setNum_terminales(int num_terminales) {
        this.num_terminales = num_terminales;
    }
}
