package Medicos;

public class UsoMedico {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente ("11111111A", "Sergio", "Cervera", "Cáncer de pulmón");
        Paciente paciente2 = new Paciente ("11111112B", "Alejandro", "Recarte", "Hidroplosión dental instantánea");
        Paciente paciente3 = new Paciente ("11111113C", "Ángel David", "Arellano M(loquesea)", "No Dar Una Con La Marshall");
        Paciente[] pacientes = {paciente1, paciente2, paciente3};
        Cirujano drHouse = new Cirujano ("Gregory", "House", 1, pacientes, "Hospital Universitario de Móstoles", 1);
        DeFamilia mayte = new DeFamilia("Mayte", "Ramirez Bidnt", 2, pacientes,"CMS Dr. Luengo Tapia");
        Podólogo ines = new Podólogo("Inés", "Trigo Rodrigues", 3, pacientes, "Hospital de Getafe supongo", 2);

        System.out.println(drHouse.showInfo());
        System.out.println(mayte.showInfo());
        System.out.println(ines.showInfo());

        Paciente paciente4 = new Paciente ("11111114D", "Elías", "Kendil Mohamed", "Ser el delegado");
        System.out.println("El DrHouse trata a paciente4: "+drHouse.trataPaciente(paciente4));
        System.out.println("El DrHouse trata a paciente3: "+drHouse.trataPaciente(paciente3));

        System.out.println("Trabaja Inés en Hospital de Móstoles: " + ines.trabajaEnHospital("Hospital de Móstoles"));
        System.out.println("Trabaja Inés en Hospital de Getafe supongo: " + ines.trabajaEnHospital("Hospital de Getafe supongo"));
    }
}
