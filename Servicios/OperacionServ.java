/*

 */
package Servicios;

import Entidades.OperacionNum;
import java.util.Scanner;

public class OperacionServ {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public OperacionNum cargarNumero1() {
        OperacionNum valorNum = new OperacionNum();
        System.out.println("Ingrese el número 1");
        valorNum.setNumero1(teclado.nextDouble());
        System.out.println("Ingrese el número 2");
        valorNum.setNumero2(teclado.nextDouble());

        return valorNum;
    }

    public void sumar(OperacionNum valorNum) {
        System.out.println("La suma de los dos numeros es = " + (valorNum.getNumero1() + valorNum.getNumero2()));
    }

    public void restar(OperacionNum valorNum) {
        System.out.println("La resta de los dos numeros es = " + (valorNum.getNumero1() - valorNum.getNumero2()));

    }
    
    public void multiplicacion(OperacionNum valorNum){
     
     if((valorNum.getNumero1() == 0) || (valorNum.getNumero2() ==0) ){
         System.out.println("ERROR: UNO DE LOS DOS NUMERO ES IGUAL A '0'");
     }else{
        System.out.println("La multiplicacion de los  numeros es = " + (valorNum.getNumero1() * valorNum.getNumero2()) );
     }
    }
 
 public void dividir(OperacionNum valorNum){
     
     if((valorNum.getNumero1() == 0) || (valorNum.getNumero2() ==0) ){
         System.out.println("ERROR: UNO DE LOS DOS NUMERO ES IGUAL A '0'");
     }else{
        System.out.println("La division de los  numeros es = " + (valorNum.getNumero1() / valorNum.getNumero2()) );
     }
    }

}

