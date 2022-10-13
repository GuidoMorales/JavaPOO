/*
4) Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServ {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo CrearRectangulo() {
        Rectangulo valorRect = new Rectangulo();
        System.out.println(" Ingrese la base del rectangulo ");
        valorRect.setBase(teclado.nextInt());
        System.out.println(" Ingrese la altura del rectangulo ");
        valorRect.setAltura(teclado.nextInt());

        return valorRect;
    }

    public void superficie(Rectangulo valorRect) {
        System.out.println(" La superficie del rectangulo es: " + (valorRect.getBase() * valorRect.getAltura()));
    }

    public void perimetro(Rectangulo valorRect) {
        System.out.println(" El perimetro del renctangulo es: " + ((valorRect.getBase()) + valorRect.getAltura()) * 2);
    }

    public void dibujar(Rectangulo valorRect) {

        String Matriz[][] = new String[valorRect.getAltura()][valorRect.getBase()];

        for (int i = 0; i < valorRect.getAltura(); i++) {
            for (int j = 0; j < valorRect.getBase(); j++) {

                if (j == 0 || j == (valorRect.getBase() - 1)) {
                    Matriz[i][j] = "*";
                } else { 
                    if (i == 0 || i == (valorRect.getAltura() - 1)) {
                    Matriz[i][j] = "*";
                } else {
                    Matriz[i][j] = " ";
                }
            }
        }
        }
        
        for (int i = 0; i < valorRect.getAltura(); i++) {
            for (int j = 0; j < valorRect.getBase(); j++) {
                System.out.println(Matriz [i][j] + " ");                
            }
            System.out.println("");
        }

        }
    }


