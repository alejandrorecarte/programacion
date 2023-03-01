package Practica3_Alejandro_Recarte_Rebollo.Apartado1;

public abstract class Electrodomestico {

    //DECLARACIÓN DE CONSTANTES
    protected final int PESO_DEFECTO = 5;
    protected final String COLOR_DEFECTO = "blanco";
    protected final char CONSUMO_DEFECTO = 'F';
    protected final double PRECIO_DEFECTO = 100;
    protected enum COLORES {blanco, negro, rojo, azul, gris};

    //DECLARACIÓN DE VARIABLES
    protected double precioBase;
    protected double precioFinal;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    //CONSTRUCTORES

    protected Electrodomestico(){
        this.precioBase= PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.peso = PESO_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
    }

    protected Electrodomestico(double precioBase, int peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    protected Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) throws Exception {
        this(precioBase, peso);
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.precioFinal = precioFinal();
    }

    //GETTERS y SETTERS

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal){
        this.precioFinal=precioFinal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico){
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    //CONTROL DE EXCEPCIONES
    private void comprobarConsumoEnergetico(char letra) throws Exception{
        switch (letra) {
            case 'A':
                if (precioBase >= 100) return;
                break;
            case 'B':
                if (precioBase >= 80 || precioBase < 100) return;
                break;
            case 'C':
                if (precioBase >= 60 || precioBase < 80) return;
                break;
            case 'D':
                if (precioBase >= 50 || precioBase < 60) return;
                break;
            case 'E':
                if (precioBase >= 30 || precioBase < 50) return;
                break;
            case 'F':
                if (precioBase >= 10 || precioBase < 30) return;
                break;
            }
        //throw new ProductoIncorrecto("No es correcto la letra con precio");
    }

    private void comprobarColor(String color) throws Exception{
        boolean encontrado = false;
        for (int i = 0; i < COLORES.values().length; i++) {
            if (COLORES.values()[i].toString().equals(color)) encontrado = true;
        }
        if (encontrado == false) {
            //throw new ProductoIncorrecto("El color no está dentro de la gama");
        }
    }

    //MÉTODOS
    protected double precioFinal() {
        double precio = precioBase;
            switch (getConsumoEnergetico()) {
                case 'A':
                    precio += 100;
                    break;
                case 'B':
                    precio += 80;
                    break;
                case 'C':
                    precio += 60;
                    break;
                case 'D':
                    precio += 50;
                    break;
                case 'E':
                    precio += 30;
                    break;
                case 'F':
                    precio += 10;
                    break;
            }
            if (getPeso() >= 0 && getPeso() < 20) {
                precio += 10;
            } else if (getPeso() >= 20 && getPeso() < 50) {
                precio += 50;
            } else if (getPeso() >= 50 && getPeso() < 80) {
                precio += 80;
            } else if (getPeso() > 80) {
                precio += 100;
            }
            return precio;
    }
}
