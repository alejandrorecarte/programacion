package Medicos;

public class Paciente {

    private String dni;
    private String nombre;
    private String apellidos;
    private String enfermedad;

    public Paciente(String dni, String nombre, String apellidos, String enfermedad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.enfermedad = enfermedad;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String showInfo() {
        return "Paciente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", enfermedad='" + enfermedad + '\'' +
                '}';
    }
}
