/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:

a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServ {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cuenta = new CuentaBancaria();
    double ingreso, retirar, retirar20;
    
    public void crearCuenta() {
        
        System.out.println(" Ingrese el número de cuenta ");
        cuenta.setNumCuenta(teclado.nextInt());
        System.out.println(" Ingrese el número de DNI ");
        cuenta.setDNI(teclado.nextLong());
        System.out.println(" Ingrese el saldo actual ");
        cuenta.setSaldoactual(teclado.nextInt());
        
    }
    
    public void ingresar() {
        System.out.println(" Ingrese la cantidad de dinero a ingresar ");
        ingreso = teclado.nextDouble();
        cuenta.setSaldoactual(cuenta.getSaldoactual() + (int) ingreso);
        
    }
    
    public void retirar() {
        System.out.println(" Ingrese la cantidad de dinero a retirar ");
        retirar = teclado.nextDouble();
        if (retirar > cuenta.getSaldoactual()) {
            System.out.println(" Solo puede retirar : " + cuenta.getSaldoactual());
            cuenta.setSaldoactual(0);
            
        } else {
            System.out.println(" Usted esta retirando: " + retirar);
            cuenta.setSaldoactual(cuenta.getSaldoactual() - (int) retirar);
        }
        
    }
    
    public void extraccionRapida() {
        System.out.println(" Cuanto desea retirar? (no puede retirar solo el 20%: " + cuenta.getSaldoactual() * 0.20);
        retirar20 = teclado.nextDouble();
        if (retirar20 > cuenta.getSaldoactual() * 0.20) {
            System.out.println(" Usted puede retirar extraccion rapida el 20% de su saldo actual: " + cuenta.getSaldoactual() * 0.20);
            
        } else {
            System.out.println(" Usted está retirando el 20% del saldo actual: " + retirar20);
            retirar20 = cuenta.getSaldoactual() * 0.20;
            cuenta.setSaldoactual(cuenta.getSaldoactual() - (int) retirar20);
        }
    }
    public void consultarSaldo() {
        System.out.println(" Su saldo actual es: " + cuenta.getSaldoactual());
    }
    public void consultarDatos() {
        System.out.println(" Su número de cuenta es: " + cuenta.getNumCuenta());
        System.out.println(" Su número de DNI es: " + cuenta.getDNI());
    }
    
}
