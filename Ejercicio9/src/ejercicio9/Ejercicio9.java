/*
Ejercicio 9: Crear un programa que lea por teclado una tabla de de 10 números 
             enteros y la desplace una posición hacia abajo: el primero pasa
             a ser el segundo, el segundo pasa a ser el tercero y así
             sucesivamente. El último pasa a ser el primero.
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int auxiliar;
        
        //Ingreso de valores del arreglo
        System.out.println("Escribe 10 valores del arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+". Número:");
            arreglo[i]=entrada.nextInt();
        }
        
        //Guardamos el último elemento para no perderlo
        auxiliar=arreglo[9];
        //Acomodamos en el orden correspondiente el arreglo
        for (int i = 8; i >=0; i--) {
            arreglo[i+1]= arreglo[i];
        }
        arreglo[0]=auxiliar;
        
        //Imprimimos el nuevo arreglo
        System.out.println("\nEl arreglo nuevo es: ");
        for (int i : arreglo) {
            System.out.println(i);
        }
    }
}
