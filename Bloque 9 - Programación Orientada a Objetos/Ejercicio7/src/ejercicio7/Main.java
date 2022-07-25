/*
    Ejercicio 7: Hacer un programa sencillo para realizar gestiones en un 
                 banco para lo cual tendremos 2 clases (Cliente y Cuenta). 
                 Considerar que un cliente se caracteriza por su nombre,
                 apellido, DNI. El cliente puede consultar saldo, así como
                 ingresar y retirar dinero de sus cuentas. Además cada cuenta
                 se caracteriza por un número de cuenta y un saldo.
 */
package ejercicio7;

import java.util.Scanner;

public class Main {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        while (i < cuentas.length && encontrado == false) {

            //Búsqueda secuencial
            if (cuentas[i].getNumeroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo, cantidad;
        Cuenta cuentas[];
        Cliente cliente;

        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el DNI del cliente: ");
        dni = entrada.nextLine();
        System.out.print("Ahora, digite cuántas cuentas tiene: ");
        nCuentas = entrada.nextInt();

        cuentas = new Cuenta[nCuentas]; //Se crea el número de cuentas que el usuario digite
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos para la cuenta " + (i + 1));
            System.out.print("Digite el número de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);

        }
        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.println("");
            System.out.println("\t.:MENÚ:.\n"
                    + "1. Ingresar dinero de la cuenta\n"
                    + "2. Retirar dinero de la cuenta\n"
                    + "3. Consultar saldo de la cuenta\n"
                    + "4. Salir\n");
            System.out.print("Digite la opción de menú:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta ingresado no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();
                        cliente.ingresarDinero(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl número de cuenta no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a retirar: ");
                        cantidad = entrada.nextDouble();

                        if (indiceCuenta != -1) {
                            if (cantidad <= cliente.consultarSaldo(indiceCuenta)) {
                                cliente.retirarDinero(indiceCuenta, cantidad);
                                System.out.println("\nRetiro realizado correctamente");
                                System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
                            } else {
                                System.out.println("\nRetiro fallido. La cantidad"
                                        + " que deseas retirar supera a su saldo"
                                        + " disponible");
                            }
                        } else {
                            System.out.println("\nEl número de cuenta no existe");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite el número de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    
                    if(indiceCuenta != -1){

                    System.out.println("\nSu saldo actual es: "
                            + cliente.consultarSaldo(indiceCuenta));
                    }
                    else{
                        System.out.println("\nEl número de cuenta no existe");
                    }
                    break;
                case 4:
                    System.out.println("\nSaliendo del programa");
                    break;
                default:
                    System.out.println("\nError. Opción no válida");
            }
        } while (opcion != 4);

    }

}
