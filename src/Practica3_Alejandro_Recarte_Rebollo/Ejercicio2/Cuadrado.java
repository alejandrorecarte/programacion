package Practica3_Alejandro_Recarte_Rebollo.Ejercicio2;

public class Cuadrado extends Figura{

    private int lado;

    //CONSTRUCTOR

    /**
     * Constructor parametrizado, lanza la excepción si no cumple con los requisitos.
     * @param lado
     * @throws ExcepcionCuadrado
     */
    public Cuadrado(int lado) throws ExcepcionCuadrado {
        if(lado <= 0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor que 0");
        }
        this.lado = lado;
        this.area = lado*lado;
        this.volumen = lado*lado*lado;
    }

    //GETTERS y SETTERS

    /**
     * Devuelve el valor de lado
     * @return lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * Cambia el valor de lado
     * @param lado
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    //METODOS

    /**
     * Imprime por pantalla el cuadrado con el lado que tenga como atributo.
     */
    @Override
    public void dibujar() {
        if(lado == 1) System.out.println("▢");
        else if(lado == 2) System.out.println("┌ ┐\n└ ┘ ");
        else {
            String[][] dibujo = new String[lado][lado];

            for (int i = 0; i < dibujo.length; i++) {
                for (int j = 0; j < dibujo.length; j++) {
                    dibujo[i][j] = "   ";
                }
            }

            for (int i = 0; i < dibujo[0].length; i++) {
                dibujo[0][i] = " — ";
                dibujo[lado - 1][i] = " — ";
            }

            for (int i = 0; i < dibujo.length; i++) {
                dibujo[i][0] = "| ";
                dibujo[i][lado - 1] = " |";
            }

            dibujo[0][0] = "┌ ";
            dibujo[0][lado - 1] = " ┐";
            dibujo[lado - 1][0] = "└ ";
            dibujo[lado - 1][lado - 1] = " ┘";

            for (int i = 0; i < dibujo.length; i++) {
                for (int j = 0; j < dibujo.length; j++) {
                    System.out.print(dibujo[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}
