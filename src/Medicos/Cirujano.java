package Medicos;

public class Cirujano extends Medico{

    private String hospital;
    private int num_box;


    public Cirujano(String nombre, String apellidos, int num_colegiado, Paciente[] pacientes, String hospital, int num_box) {
        setNombre(nombre);
        setApellidos(apellidos);
        setNum_colegiado(num_colegiado);
        setPacientes(pacientes);
        this.hospital = hospital;
        this.num_box = num_box;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNum_box() {
        return num_box;
    }

    public void setNum_box(int num_box) {
        this.num_box = num_box;
    }

    public boolean trabajaEnHospital(String hospital){
        if(this.hospital.equals(hospital)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String showInfo() {
        return "Cirujano{" +
                "nombre=" + getNombre() +'\'' +
                ", apellidos=" + getApellidos() + '\'' +
                ", num_colegaido=" + getNum_colegiado() + '\'' +
                ", hospital='" + hospital + '\'' +
                ", num_box=" + num_box +
                '}';
    }
}
