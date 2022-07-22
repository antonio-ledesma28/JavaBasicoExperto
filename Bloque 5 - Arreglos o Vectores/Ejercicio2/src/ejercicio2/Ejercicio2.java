/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el
             orden inverso al introducido
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglo[]= new float[5];
        System.out.println("Digta 5 valores");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(i+1+". Ingresa un valor:");
            arreglo[i] = entrada.nextFloat();           
        }
        System.out.println("Los números digitados de manera inversa son");
        for (int i = 5; i >0; i--) {
            System.out.println("Posición "+i+" Número :"+arreglo[i-1]);
        }
            
    }
    
}
