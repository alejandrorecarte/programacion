package CopyofRange;

public class CopyofRange {

    public static void main(String[] args) {
        String ejemplo= "El patio de mi casa no es particular";
        String[] ejemploArray = eliminarNodo(ejemplo.split(" "), 5);
        for (int i=0; i < ejemploArray.length; i++){
            System.out.print(ejemploArray[i]+" ");
        }
    }

    public static String[] eliminarNodo (String[] stringArray, int posicion){
        String[] resultString = new String[stringArray.length-1];
        int contador1 = 0;
        int contador2 = 0;
        while (contador1 < stringArray.length){
            if (contador1 == posicion){
                contador1++;
            }
            resultString[contador2] = stringArray[contador1];
            contador2++;
            contador1++;
        }
        return resultString;
    }
}
