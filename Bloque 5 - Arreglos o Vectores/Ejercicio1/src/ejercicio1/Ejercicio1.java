/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden 
             introducido
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[5];
        System.out.println("Digita 5 números:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i+1+". Digita un valor:");
            arreglo[i]=entrada.nextInt();
        }
        System.out.println("\nLos valores ingresados son");
        for (int i : arreglo) {
            System.out.println(i);
            
        }
        
        
    }
    
}
