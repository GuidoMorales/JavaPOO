/*
1ero llamas al Service
2do siguiendo la Sintaxis para crear el objeto es: "Entidad" "nombre de variable que quieras" = new "Entidad"
3ero Lo mostras con un sout
 */
package javapoo;

import Entidades.Libro;
import Servicios.Libroservicios;


public class JAVAPOO {

    public static void main(String[] args) {
        Libroservicios cargar = new Libroservicios();
        Libro libroCompleto = cargar.CargarLibro();
        System.out.println(libroCompleto);
    }
    
}
