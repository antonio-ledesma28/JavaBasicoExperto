/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un 
                 banco para lo cual tendremos 2 clases (Cliente y Cuenta). 
                 Considerar que un cliente se caracteriza por su nombre,
                 apellido, DNI. El cliente puede consultar saldo, así como
                 ingresar y retirar dinero de sus cuentas. Además cada cuenta
                 se caracteriza por un número de cuenta y un saldo.
 */
package paquete2;

import java.util.Scanner;

public class Main {
    public static int encontrarNumCuenta(Cuenta cuentas[], int numeroCuenta){
        boolean encontrado=false;
        int indice=0, i=0;
        
        while(i<cuentas.length && encontrado == false){
            if(cuentas[i].getNumeroCuenta() == numeroCuenta){
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre,apellido,dni;
    double cantidad, saldoInicial;
    Cuenta cuenta[];
    Cliente cliente;
    int nCuentas, numeroCuenta,opcion,indiceCuenta;
    
    
        System.out.println("Bienvenido a tu Banco:\n");
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingresa tu apellido: ");
        apellido = entrada.nextLine();
        System.out.print("Ingresa tu DNI: ");
        dni = entrada.nextLine();
        
        //Pedimos el número de cuentas del usuario
        System.out.print("Digite la cantidad de cuentas que usted posee: ");
        nCuentas = entrada.nextInt();
        cuenta = new Cuenta[nCuentas];
        for (int i = 0; i < nCuentas; i++) {
            System.out.print("Digite su número de cuenta de la cuenta "+(i+1)+" :");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite su saldo inicial: ");
            saldoInicial = entrada.nextDouble();
            
            cuenta[i] = new Cuenta(nCuentas, saldoInicial);    
        }
        cliente= new Cliente(nombre, apellido, dni, cuenta);
        
        System.out.println("\n.:MENÚ:.\n"
                + "1. Ingresar dinero a la cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Consultar dinero de la cuenta\n"
                + "4. Salir");
        
        do{
            System.out.print("\nIngresa la opción: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("\nIngrese su número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = encontrarNumCuenta(cuenta, numeroCuenta);
                    
                    if(indiceCuenta != -1){
                        System.out.print("Ingrese el monto que desea ingresar: ");
                        cantidad = entrada.nextDouble();
                        cliente.ingresarDinero(indiceCuenta, cantidad);
                        System.out.println("\nOperación exitosa");
                        System.out.println("Su saldo actual es: "+
                                cliente.consultarSaldo(indiceCuenta));
                    }
                    else{
                        System.out.println("\nNúmero de cuenta no válido");
                    }
                    break;
                
                case 2:
                   System.out.print("\nIngrese su número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = encontrarNumCuenta(cuenta, numeroCuenta);
                    
                    if(indiceCuenta != -1){
                        System.out.print("Ingrese el monto que desea retirar: ");
                        cantidad = entrada.nextDouble();
                        if(cantidad<= cliente.consultarSaldo(indiceCuenta)){
                            cliente.retirarDinero(indiceCuenta, cantidad);
                            System.out.println("\nOperación exitosa");
                            System.out.println("Su saldo actual es: "+
                                    cliente.consultarSaldo(indiceCuenta));
                        }
                        else{
                            System.out.println("\nOperación fallida");
                            System.out.println("Usted no dispone del saldo "
                                    + "suficiente para retirar");
                        }   
                    }
                    else{
                        System.out.println("\nNúmero de cuenta no válido");
                    }
                    break;
                case 3:
                    System.out.print("\nIngrese su número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = encontrarNumCuenta(cuenta, numeroCuenta);
                    
                    System.out.println("\nOperación exitosa");
                    System.out.println("Su saldo actual es: "+
                                    cliente.consultarSaldo(indiceCuenta));
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa");
            }
            
        }while(opcion!=4);
    }
}
