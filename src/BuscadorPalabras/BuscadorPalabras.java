package BuscadorPalabras;

public class BuscadorPalabras {

    public static void main(String[] args) {
    }

    public static int buscadorString(String[] lista, String busqueda){
        int resultado = -1;
        for (int i = 0; i < lista.length; i++){
            if(lista[i].equals(busqueda)){
                resultado = i;
            }
        }
        return resultado;
    }
}
