/*
Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números 
              enteros y desplace N posiciones en el arreglo (N es digitado 
              por el usuario.
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        int arreglo2[]=new int[10];
        int desplazamiento,aux;
        
        //Se asignan los 10 números
        System.out.println("Ingresa 10 números enteros");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextInt();
        }
            
        //Pedirmos el número de posiciones a desplazar 
            System.out.print("Digita el número de espacios que deseas"
                    + "desplazar en el arreglo: ");
            desplazamiento = entrada.nextInt();
            
        //Movemos una posición en el arreglo      
            for (int vuelta = 1; vuelta <=desplazamiento; vuelta++) {
               aux=arreglo[9]; 
                for (int i = 8; i >= 0; i--) {
                    arreglo[i+1]=arreglo[i];
                    
                }
                    arreglo[0]=aux;
                }
             
            System.out.println("EL Nuevo arreglo es:");
            
            for (int i = 0; i < 10; i++) {
                System.out.println(arreglo[i]);
        
            }
        
    }
    
}
