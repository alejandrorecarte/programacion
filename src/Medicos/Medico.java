package Medicos;

public abstract class Medico {

    private String nombre;
    private String apellidos;
    private int num_colegiado;
    private Paciente[] pacientes = new Paciente[3];

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

    public int getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(int num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public boolean trataPaciente (Paciente paciente){
        for(int i = 0; i < pacientes.length; i++){
            if(pacientes[i] == paciente) return true;
        }
        return false;
    }
    public abstract String showInfo();
}
