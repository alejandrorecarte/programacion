package Password;

public class Password {

    private int longitud = 8;
    private String contrasenya;

    public Password(){}

    public Password(int longitud, String contrasenya){
        this.longitud = longitud;
        this.contrasenya = contrasenya;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public boolean esFuerte(String contrasenya){
        char[] contrasenyaChar = contrasenya.toCharArray();

        for(int i = 0; i < contrasenyaChar.length; i++){
        }

        return false;
    }

    public String generarPassword(int longitud) {
        char[] contrasenya = new char[longitud];

        for (int i = 0; i < contrasenya.length; i++) {
            int asciiValue = (int) (Math.random()*255);
            contrasenya[i] = (char) asciiValue;
        }
        return contrasenya.toString();
    }
}
