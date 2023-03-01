package Examen2Trimestre.Ejercicio2;

public class Inicio {
    public static void main(String[] args) {
        try {
            Programador programador1 = new Programador("Alejandro Recarte", "47581525E", 2, "Java", "Junior");
            Programador programador2 = new Programador("Sergio Cervera", "5M", 15, "Python", "Senior");
            Programador programador3 = new Programador("Inés Trigo", "9D", 30, "C++", "JEFE_PROYECTO");
            Programador programador4 = new Programador("Elías Kendil", "15S", 50, "Pascal", "junior");

            //EXCEPCIONES

            //IllegalArguments
            //Programador programadorIllegalArguments = new Programador ("Nose", "9D", 15, "Java", "Master");

            //RetencionIncorrecta
            //Programador programadorRetencionIncorrecta = new Programador ("Nose", "9D", 75, "Java", "Junior");
            //Programador programadorRetencionIncorrecta = new Programador ("Nose", "9D", -15, "Java", "Junior");

            //DniInvalido
            //Programador progrmadorDniInvalido = new Programador ("Nose", "9A", 20, "Java", "Junior");;

            Programador[] programadores = new Programador[]{programador1,programador2,programador3,programador4};
            for (int i = 0; i < programadores.length; i++){
                System.out.println(programadores[i].toString());
            }
        }catch (Exception e){
            System.out.println("Error instanciando las clases");
        }
    }
}
