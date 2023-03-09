package CorreccionExamen2Trimestre;

public final class Programador {

    private String nombre;
    private String dni;
    private double salarioBase;
    private int retencion;
    private double salarioNeto;
    private String lenguaje_programacion;
    private Categoria categoria;

    public Programador(){}

    public Programador(String nombre, String dni, int retencion, String lenguaje_programacion, String categoria) throws DniInvalido, RetencionIncorrecta {
        this.nombre = nombre.toLowerCase();

        if (!verificar_dni(dni.toUpperCase())){
            throw new DniInvalido("La letra del dni no se corresponde con la numeracion");
        }
        this.dni = dni.toUpperCase();

        if (retencion < 0 || retencion > 50){
            throw new RetencionIncorrecta("La retencion tiene estar comprendida entre 0 y 50");
        }
        this.retencion = retencion;

        this.lenguaje_programacion = lenguaje_programacion.toUpperCase();

        try{
            this.categoria = Categoria.valueOf(categoria);
        }catch (Exception e) {
            throw new IllegalArgumentException("La categoría no es correcta");
        }

        switch(this.categoria){
            case junior: salarioBase = 18000; break;
            case senior: salarioBase = 27000; break;
            case jefe_proyecto: salarioBase = 35000; break;
        }

        this.salarioNeto = calcularSalarioNeto();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public String getLenguaje_programacion() {
        return lenguaje_programacion;
    }

    public void setLenguaje_programacion(String lenguaje_programacion) {
        this.lenguaje_programacion = lenguaje_programacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private double calcularSalarioNeto(){
        return salarioBase-salarioBase*(retencion*0.01);
    }

    private boolean verificar_dni (String dni){
        Integer numero= Integer.parseInt(dni.substring(0, dni.length()-1));
        char letra = dni.charAt(dni.length());
        numero = numero % 23;

        switch (numero){
            case 0:
                if (letra == 'T') return true;
            case 1:
                if (letra == 'R') return true;
            case 2:
                if (letra == 'W') return true;
            case 3:
                if (letra == 'A') return true;
            case 4:
                if (letra == 'G') return true;
            case 5:
                if (letra == 'M') return true;
            case 6:
                if (letra == 'Y') return true;
            case 7:
                if (letra == 'F') return true;
            case 8:
                if (letra == 'P') return true;
            case 9:
                if (letra == 'D') return true;
            case 10:
                if (letra == 'X') return true;
            case 11:
                if (letra == 'B') return true;
            case 12:
                if (letra == 'N') return true;
            case 13:
                if (letra == 'J') return true;
            case 14:
                if (letra == 'Z') return true;
            case 15:
                if (letra == 'S') return true;
            case 16:
                if (letra == 'Q') return true;
            case 17:
                if (letra == 'V') return true;
            case 18:
                if (letra == 'H') return true;
            case 19:
                if (letra == 'L') return true;
            case 20:
                if (letra == 'C') return true;
            case 21:
                if (letra == 'K') return true;
            case 22:
                if (letra == 'E') return true;
        }
        return false;
    }
}
