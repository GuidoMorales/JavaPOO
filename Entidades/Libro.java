/*
1) Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidades;

public class Libro {
    private int ISBN, numpag;
    private String Titulo, Autor;

    public Libro() {
    }

    public Libro(int ISBN, int numpag, String Titulo, String Autor) {
        this.ISBN = ISBN;
        this.numpag = numpag;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }
   
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", numpag=" + numpag + ", Titulo=" + Titulo + ", Autor=" + Autor + '}';
    }
    
    
    
}
