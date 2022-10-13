/*

 */
package javapoo;

import Entidades.OperacionNum;
import Servicios.OperacionServ;

public class Operacion {

    public static void main(String[] args) {
        OperacionServ LC = new OperacionServ();
        OperacionNum valor = LC.cargarNumero1();        
        LC.sumar(valor);
        LC.restar(valor);
        LC.multiplicacion(valor);
        LC.dividir(valor);
        
        
    }

}
