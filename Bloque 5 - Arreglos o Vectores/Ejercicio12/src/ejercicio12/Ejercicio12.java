/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros y una 
              posición (entre 0 y 9). Eliminar el elemento situado en la 
              posición dada sin dejar hueco.
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        int posicion;
        
        System.out.println("Digita 10 números para el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextInt();
        }
        for (int i : arreglo) {
            System.out.println(i);
        }
        do{
        System.out.print("\nDigita una posición entre 0 y 9: ");
        posicion = entrada.nextInt();
        if(posicion <0 || posicion>9){
            System.out.println("La posición es incorrecta. Vuelve a digitarla");
        }
        }while (posicion <0 || posicion>9);
        for (int i = posicion; i <9; i++) {
            arreglo[i]=arreglo[i+1];
        }
        arreglo[9]=0;
        for (int i : arreglo) {
            System.out.println(i);
        }
        
    }
    
}
