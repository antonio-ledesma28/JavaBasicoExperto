/*
Ejercicio 10: Pedir 10 números y escribir la suma total
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma=0;
        for(int i=0;i<10;i++){
            System.out.print("Introduce un número: ");
            suma+=entrada.nextInt();            
        }
        System.out.println("La suma de los diez números ingresado es: "+suma);
    }
    
}
