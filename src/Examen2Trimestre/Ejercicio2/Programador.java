package Examen2Trimestre.Ejercicio2;

public final class Programador {

    //ATRIBUTOS

    private String nombre;
    private String dni;
    private double salarioBase;
    private int retencion;
    private double salarioNeto;
    private String lenguajeProgramacion;
    private String categoria;

    public Programador() {
    }

    //CONSTRUCTOR
    public Programador(String nombre, String dni, int retencion, String lenguajeProgramacion, String categoria) throws IllegalArguments, RetencionIncorrecta, DniInvalido {

        //CONTROL EXCEPCION POR CATEGORIA

        boolean encontrado = false;
        for(int i = 0; i < Categoria.values().length; i++){
            if (Categoria.values()[i].toString().equals(categoria.toLowerCase())) encontrado = true;
        }
        if (encontrado == false){
            throw new IllegalArguments("La categoría no es correcta");
        }
        this.categoria = categoria.toLowerCase();

        //ASIGNACION DE SUELDO BASE

        switch (categoria.toLowerCase()){
            case "junior": this.salarioBase = 18000; break;
            case "senior": this.salarioBase = 27000; break;
            case "jefe_proyecto": this.salarioBase = 35000; break;
        }

        //CONTROL EXCEPCION POR RETENCION

        if (retencion < 0 || retencion > 50){
            throw new RetencionIncorrecta("La retencion debe estar comprendida entre 0 y 50");
        }
        this.retencion = retencion;

        //CONTROL EXCEPCION POR DNI

        if (verificar_dni(dni.toUpperCase()) == false){
            throw new DniInvalido("La letra del dni no corresponde con la numeración");
        }
        this.dni = dni.toUpperCase();

        this.nombre = nombre.toLowerCase();
        this.lenguajeProgramacion = lenguajeProgramacion.toUpperCase();

        //CALCULO SUELDO NETO

        this.salarioNeto = calcularsalarioNeto();
    }

    //GETTERS Y SETTERS

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

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //METODOS
    public double calcularsalarioNeto(){
        return (salarioBase-salarioBase*(retencion * 0.001));
    }
    private boolean verificar_dni(String dni){

        //ALGORITMO PARA SEPARAR NUMERACION (INT) Y LETRA (CHAR)
        char[] dniChar = dni.toCharArray();
        char letra = dniChar[dniChar.length-1];
        int numero = 0;

        char[] dniCharSinLetra = new char[dniChar.length-1];
        for(int i = 0; i < dniChar.length-1; i++){
            dniCharSinLetra[i] = dniChar[i];
        }

        numero = Integer.parseInt(String.valueOf(dniCharSinLetra));

        //VERIFICACION LETRA

        numero = numero % 23;
        switch(numero){
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

    public String toString(){
        return "El empleado "+ nombre + " con dni " + dni + " con perfil " + categoria + " programando en " + lenguajeProgramacion +
                " tiene un salario base de " + salarioBase + " euros que al aplicarle la retención del " + retencion +
                "% le supone un salario neto de " + salarioNeto + " euros";
    }
}
