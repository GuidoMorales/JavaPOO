/*
1ero llamas al Service
2do siguiendo la Sintaxis para crear el objeto es: "Entidad" "nombre de variable que quieras" = new "Entidad"
3ero Lo mostras con un sout
 */
package javapoo;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicio;

public class CircunferenciaMain {
   
    public static void main(String[] args) {
        CircunferenciaServicio datoscompletos = new CircunferenciaServicio();
        Circunferencia valor = datoscompletos.cargarRadio();
        System.out.println("Area = " + datoscompletos.area(valor));
        System.out.println("Perimetro = " + datoscompletos.perimetro(valor));   
        
    }
    
}
