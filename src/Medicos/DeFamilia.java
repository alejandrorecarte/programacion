package Medicos;

public class DeFamilia extends Medico{

    private String centroDeSalud;


    public DeFamilia(String nombre, String apellidos, int num_colegiado, Paciente[] pacientes, String centroDeSalud) {
        setNombre(nombre);
        setApellidos(apellidos);
        setNum_colegiado(num_colegiado);
        setPacientes(pacientes);
        this.centroDeSalud = centroDeSalud;
    }


    public String getCentroDeSalud() {
        return centroDeSalud;
    }

    public void setCentroDeSalud(String centroDeSalud) {
        this.centroDeSalud = centroDeSalud;
    }

    @Override
    public String showInfo() {
        return "DeFamilia{" +
                "nombre=" + getNombre() +'\'' +
                ", apellidos=" + getApellidos() + '\'' +
                ", num_colegaido=" + getNum_colegiado() + '\'' +
                ", centroDeSalud='" + centroDeSalud + '\'' +
                '}';
    }
}
