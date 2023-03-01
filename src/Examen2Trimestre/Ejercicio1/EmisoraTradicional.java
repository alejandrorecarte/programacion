package Examen2Trimestre.Ejercicio1;

public class EmisoraTradicional extends Emisora{

    //ATRIBUTOS

    private Frecuencia frecuencia;
    private double num_frecuencia;

    //CONSTRUCTOR

    public EmisoraTradicional(int identificador, String nombre, int anyo_creacion, int num_oyentes, int num_frecuencia) throws CreacionInvalida, IllegalArguments {
        super(identificador, nombre, anyo_creacion, num_oyentes);
        if(!((num_frecuencia >= 540 && num_frecuencia <= 1600) || (num_frecuencia >= 88.1 && num_frecuencia <= 108.1))){
            throw new IllegalArguments("El número de frecuencia introducido es incorrecto");
        }
        this.num_frecuencia = num_frecuencia;
        if(num_frecuencia >= 540 && num_frecuencia <= 1600){
            this.frecuencia = Frecuencia.AM;
        }else{
            this.frecuencia = Frecuencia.FM;
        }
    }

    //GETTERS Y SETTERS

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }

    public void setNum_frecuencia(double num_frecuencia) {
        this.num_frecuencia = num_frecuencia;
    }

    //METODOS

    @Override
    public double ganancias() {
        return getNum_oyentes()*0.023;
    }

    @Override
    public void iniciarEmision() throws OpcionInvalida {
        if(estaEmitiendo() == true){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando la emisión de "+getNombre()+" en "+ num_frecuencia);
        setEmitiendo(true);
    }

    @Override
    public void finalizarEmision() throws OpcionInvalida {
        if(estaEmitiendo() == false){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando la emisión de "+getNombre()+" en "+ num_frecuencia);
        setEmitiendo(false);
    }
}
