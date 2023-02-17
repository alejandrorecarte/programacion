package Instrumentos;

public abstract class Instrumento {

    protected String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void tocar(){
        System.out.println("Pues tócame esta bobolón");
    }
}
