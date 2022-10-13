
package javapoo;

import Entidades.Rectangulo;
import Servicios.RectanguloServ;

/**
 *
 * @author gmorales
 */
public class RectanguloMain {

    public static void main(String[] args) {
        RectanguloServ GM = new RectanguloServ();
        Rectangulo BM = GM.CrearRectangulo();
        
        GM.superficie(BM);
        GM.perimetro(BM);
        GM.dibujar(BM);
    }
    
}
