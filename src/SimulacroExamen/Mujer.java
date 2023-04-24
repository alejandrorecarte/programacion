package SimulacroExamen;

public class Mujer extends Persona{

    private boolean luz;

    public Mujer(String dni, String nombre, String apellido1, int edad, double altura, double peso, boolean luz) {
        super(dni, nombre, apellido1, edad, altura, peso);
        this.luz = luz;
    }

    public boolean isLuz(){
        return luz;
    }

    public Categoria calcularCategoria(){
        if(imc < 18.5) return Categoria.ANOREXIA;
        else if (imc >= 18.5 && imc < 24.9) return Categoria.IDEAL;
        else return Categoria.SOBREPESO;
    }
}
