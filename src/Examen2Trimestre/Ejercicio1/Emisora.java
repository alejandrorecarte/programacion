package Examen2Trimestre.Ejercicio1;

public abstract class Emisora implements Emitible{

    //ATRIBUTOS

    private static int num_emisoras;
    private int identificador;
    private String nombre;
    private int anyo_creacion;
    private boolean emitiendo;
    private int num_oyentes;

    //CONSTRUCTOR

    protected Emisora(int identificador, String nombre, int anyo_creacion, int num_oyentes) throws CreacionInvalida {
        this.identificador = identificador;
        this.nombre = nombre.toUpperCase();
        if(anyo_creacion < 1879){
            throw new CreacionInvalida("El año de creación de la radio debe ser igual o superior a 1879");
        }
        this.anyo_creacion = anyo_creacion;
        this.emitiendo = false;
        this.num_oyentes = num_oyentes;
        System.out.println("Se ha creado la emisora número "+this.num_emisoras);
        this.num_emisoras++;
    }

    //GETTERS Y SETTERS

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo_creacion() {
        return anyo_creacion;
    }

    public void setAnyo_creacion(int anyo_creacion) {
        this.anyo_creacion = anyo_creacion;
    }

    public void setEmitiendo(boolean emitiendo) {
        this.emitiendo = emitiendo;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
    }

    //METODOS

    public abstract double ganancias();
    public boolean estaEmitiendo(){
        return emitiendo;
    }
}
