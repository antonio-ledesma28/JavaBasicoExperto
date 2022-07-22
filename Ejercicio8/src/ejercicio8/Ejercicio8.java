/*
Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
             enteros. Leer mediante el teclado 8 números. Después se debe pedir 
             un número y una posición, insertarlo en la posición indicada, 
             desplazando los que estén detrás.
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int num, posicion;
        
        System.out.println("Ingresa 8 números al arreglo");
        for (int i = 0; i < 8; i++) {
            System.out.print("Posición "+(i)+": ");
            arreglo[i]=entrada.nextInt();
        }
        
        
        System.out.println("\nDigita otro valor y la posición en la"
                + " que quieres colocarlos");
        System.out.print("Digite el primer número: ");
        num = entrada.nextByte();
        
        do{
        System.out.print("Digita la posición entre 0 y 7: ");
        posicion = entrada.nextInt();
        
        if(num<0 || num>7){
            System.out.println("Posición fuera de rango, vuelve a digitarla");
        }
        }while(num<0 || num>7);
        
        for (int i = 7; i >= posicion; i--) {
            arreglo[i+1]=arreglo[i];
        }
        arreglo[posicion]=num;
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posición "+i+": " +arreglo[i]);
            
        }
    }
    
}
