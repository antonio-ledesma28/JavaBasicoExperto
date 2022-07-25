/*
***Fallas
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un 
                 banco para lo cual tendremos 2 clases (Cliente y Cuenta). 
                 Considerar que un cliente se caracteriza por su nombre,
                 apellido, DNI. El cliente puede consultar saldo, así como
                 ingresar y retirar dinero de sus cuentas. Además cada cuenta
                 se caracteriza por un número de cuenta y un saldo.
 */
package paquete2;


public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingresarDinero(double cantidad){
        saldo+=cantidad;    
    }
    public void retirarSaldo(double cantidad){
        saldo+=cantidad;
    }
    
    
}
