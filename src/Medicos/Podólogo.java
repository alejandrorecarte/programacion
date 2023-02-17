package Medicos;

public class Podólogo extends Medico{

    private String hospital;
    private int planta;


    public Podólogo(String nombre, String apellidos, int num_colegiado, Paciente[] pacientes, String hospital, int planta) {
        setNombre(nombre);
        setApellidos(apellidos);
        setNum_colegiado(num_colegiado);
        setPacientes(pacientes);
        this.hospital = hospital;
        this.planta = planta;
    }


    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
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
        return "Podólogo{" +
                "nombre=" + getNombre() +'\'' +
                ", apellidos=" + getApellidos() + '\'' +
                ", num_colegaido=" + getNum_colegiado() + '\'' +
                ", hospital='" + hospital + '\'' +
                ", planta=" + planta +
                '}';
    }
}
