package Libreria;

public class Editorial {

    private int codigo;
    private String nombre;
    private int anio;

    public Editorial(){

    }

    public Editorial(int codigo, String nombre, int anio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnio() {
        return anio;
    }
}
