package SimulacroExamen;

public class Hombre extends Persona{
    private boolean barba;

    public Hombre(String dni, String nombre, String apellido1, int edad, double altura, double peso, boolean barba) {
        super(dni, nombre, apellido1, edad, altura, peso);
        this.barba = barba;
    }

    public Categoria calcularCategoria(){
        if(imc < 20) return Categoria.ANOREXIA;
        else if (imc >= 20 && imc < 26.5) return Categoria.IDEAL;
        else return Categoria.SOBREPESO;
    }
}
