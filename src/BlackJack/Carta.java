package BlackJack;

public class Carta {

    private String nombreCarta;
    private int valor;

    public Carta(String nombreCarta, int valor){
        this.nombreCarta = nombreCarta;
        this.valor = valor;
    }

    //GETTERS

    /**
     * Método que devuelve el nombre de la carta
     * @return nombreCarta
     */

    public String getNombreCarta(){
        return nombreCarta;
    }

    /**
     * Método que devuelve el valor de la carta
     * @return valor
     */

    public int getValor() {
        return valor;
    }
}
