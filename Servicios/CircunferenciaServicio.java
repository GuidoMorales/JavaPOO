/*
 
 */
package Servicios;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

public class CircunferenciaServicio {
    Scanner teclado = new Scanner(System.in);    
    
    public Circunferencia cargarRadio() {
        Circunferencia valorRadio = new Circunferencia();
        System.out.println("Ingrese el radio");
        valorRadio.setRadio(teclado.nextDouble());
        
        return valorRadio;        
    }
    
    public double area(Circunferencia valorRadio) {
        double area = PI * (valorRadio.getRadio() * valorRadio.getRadio());      
        
        return area;        
    }
    
    public double perimetro(Circunferencia valorRadio) {
      double peri = 2 * PI * Math.pow(valorRadio.getRadio(), 2);     
       
      return peri;
    }
}

    

