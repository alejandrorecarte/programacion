package ArrayPersonas;

public class Persona {

    private String dni;
    private String apellidos;
    private String nombres;
    private char sexo;
    private int edad;
    private double peso;

    public Persona(String dni, String apellidos, String nombres, char sexo, int edad, double peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombres='" + nombres + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
