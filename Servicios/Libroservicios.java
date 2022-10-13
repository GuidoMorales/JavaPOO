/*
1) Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class Libroservicios {
    Scanner teclado = new Scanner(System.in);
    
    public Libro CargarLibro(){
        Libro libroCompleto = new Libro();
        System.out.println("Ingrese el número de ISBN del libro");
        libroCompleto.setISBN(teclado.nextInt());
        System.out.println("Ingrese el número de páginas");
        libroCompleto.setNumpag(teclado.nextInt());
        System.out.println("Ingrese el Autor del libro");
        libroCompleto.setAutor(teclado.next());
        System.out.println("Ingrese el Título del libro");
        libroCompleto.setTitulo(teclado.next());
        
        return libroCompleto;
    }
    
    
}
