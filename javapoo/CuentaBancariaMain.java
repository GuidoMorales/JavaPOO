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
package javapoo;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServ;
import java.util.Scanner;

public class CuentaBancariaMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaBancariaServ GM = new CuentaBancariaServ();
        int menu;

        do {
            System.out.println("---------------------\n"
                    + " Menú\n"
                    + "1. Crear cuenta\n"
                    + "2. Ingresar Saldo\n"
                    + "3. Retirar\n"
                    + "4. Extracción rápida\n"
                    + "5. Consultar Saldo\n"
                    + "6. Consultar Datos\n"
                    + "7. Salir\n"
                    + "------------------------------------- ");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    GM.crearCuenta();
                    break;
                case 2:
                    GM.ingresar();
                    break;
                case 3:
                    GM.retirar();
                    break;
                case 4:
                    GM.extraccionRapida();
                    break;
                case 5:
                    GM.consultarSaldo();
                    break;
                case 6:
                    GM.consultarDatos();
                    break;
                case 7:
                    System.out.println(" Saliendo del sistema ");
                    break;
                default:
                    System.out.println(" Ingresó la opción incorrecta ");
            }
        } while (menu != 7);
    }
}
