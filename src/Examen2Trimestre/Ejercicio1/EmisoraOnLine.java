package Examen2Trimestre.Ejercicio1;

public class EmisoraOnLine extends Emisora{

    //ATRIBUTOS

    private String url;

    //CONSTRUCTOR

    public EmisoraOnLine(int identificador, String nombre, int anyo_creacion, int num_oyentes, String url) throws CreacionInvalida {
        super(identificador, nombre, anyo_creacion, num_oyentes);
        this.url = url;
    }

    //GETTERS Y SETTERS

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //METODOS

    @Override
    public double ganancias() {
        return getNum_oyentes()*0.015;
    }

    @Override
    public void iniciarEmision() throws OpcionInvalida {
        if(estaEmitiendo() == true){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando la emisión de "+getNombre()+" en "+url);
        setEmitiendo(true);
    }

    @Override
    public void finalizarEmision() throws OpcionInvalida {
        if(estaEmitiendo() == false){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando la emisión de "+getNombre()+" en "+url);
        setEmitiendo(false);
    }
}
