/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un 
                 banco para lo cual tendremos 2 clases (Cliente y Cuenta). 
                 Considerar que un cliente se caracteriza por su nombre,
                 apellido, DNI. El cliente puede consultar saldo, así como
                 ingresar y retirar dinero de sus cuentas. Además cada cuenta
                 se caracteriza por un número de cuenta y un saldo.
 */
package paquete2;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuenta[]; //Arreglo de objetos de la clase cuenta

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuenta = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuenta;
    }
    public void ingresarDinero(int n,double cantidad){
        cuenta[n].ingresarDinero(cantidad);      
    }
    public void retirarDinero (int n, double cantidad){
        cuenta[n].retirarSaldo(cantidad);
    }
    public double consultarSaldo(int n){
        return cuenta[n].getSaldo();
    }
    
}
