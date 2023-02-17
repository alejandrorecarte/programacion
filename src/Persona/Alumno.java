package Persona;

public class Alumno extends Persona{

    private int beca;


    public Alumno (String dni, String nombre, String apellidos, int edad, int beca){
        super();
        this.beca = beca;
    }

    public int getBeca() {
        return beca;
    }

    public void setBeca(int beca) {
        this.beca = beca;
    }

    @Override
    public String toString(){
        return "Alumno -> DNI: "+ dni + " Nombre:"+ nombre;
    }
}
