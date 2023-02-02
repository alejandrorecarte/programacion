package Libreria;

public class Libro{

    private String isbn;
    private String titulo;
    private int anio;
    private int precio;

    private Editorial editorial;


    public Libro(){

    }

    public Libro(String isbn, String titulo, int anio, int precio, Editorial editorial){
        this.editorial = editorial;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anio;
    }

    public int getPrecio() {
        return precio;
    }

    public Editorial getEditorial(){
        return editorial;
    }
}
