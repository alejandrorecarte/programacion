package Excepciones;

public class Cuenta {

    private int cuenta;
    private String nombre;
    private double cantidad;

    public Cuenta(){}

    public Cuenta(int cuenta, String nombre, double cantidad) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar (double cantidad) {
        try{
            if(cantidad < 0){
                throw new Exception();
            }
            this.cantidad += cantidad;
        }catch (Exception e){
            System.out.println("No se puede ingresar una cantidad negativa");
        }
    }

    public void retirar (double cantidad) {
        try{
            if (this.cantidad - cantidad < 0){
                throw new Exception();
            }
            this.cantidad -= cantidad;
        }catch (Exception e){
            System.out.println("No se puede retirar una cantidad negativa");
        }
    }

    @Override
    public String toString() {
        return "La cuenta con número " + cuenta +
                "tiene como titular a " + nombre + " con un saldo discponible de " + cantidad + "euros";
    }
}
