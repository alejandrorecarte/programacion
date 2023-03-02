package Practica3_Alejandro_Recarte_Rebollo.Apartado2;

public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(int lado) throws ExcepcionCuadrado {
        if(lado <= 0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor que 0");
        }
        this.lado = lado;
        setArea(lado*lado);
        setVolumen(lado*lado*lado);
    }

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
