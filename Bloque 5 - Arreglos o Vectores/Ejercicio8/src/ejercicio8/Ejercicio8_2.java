/*
Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
             enteros. Leer mediante el teclado 8 números. Después se debe pedir 
             un número y una posición, insertarlo en la posición indicada, 
             desplazando los que estén detrás.
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, posicion;
        int arreglo[] = new int[10];
        
        //Ingreso de valores del arreglo
        System.out.println("Escribe 8 valores del arreglo:");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+". Número:");
            arreglo[i]=entrada.nextInt();
        }
        //Se pide el número
        System.out.println("\nDigita un número y la posición del arreglo que"
                + " deseas colocarlo");
        System.out.print("Digita el número: ");
        num = entrada.nextInt();
        
        //Se pide la posición y se condiciona para no digitar un valor fuera de rango
        do{
        System.out.print("Digita la posición (entre 0 y 7): ");
        posicion = entrada.nextInt();
        if(posicion<0 || posicion>7){
            System.out.println("Dígito fuera de rango. Ingresa un valor válido");
        }
        }while(posicion<0 || posicion>7);
        
        //Se modifica el arreglo con el número y la posición digitada
        for (int i = 7; i >= posicion; i--) {
            arreglo[i+1]=arreglo[i];     
        }
        arreglo[posicion] = num;
        
        for (int i : arreglo) {
            System.out.println(i);
        }
    }
}
