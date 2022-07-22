/*
Ejercicio 5: Leer 5 elementos numéricos que se introducirán ordenados de forma
             creciente. Éstos los guardaremos en una tabla de tamaño 10.
             Leer el número N, e insertarlo en el lugar adecuado para que la 
             tabla continúe ordenada.
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int creciente=0,n;
        
        //Guardamos 5 números en el arreglo de manera creciente
    do{
        System.out.println("Ingresa 5 números enteros de forma creciente");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextInt();
        }
        
        //Comprobamos que todos los números sean crecientes
        for (int i = 0; i <4; i++) {
            if(arreglo[i]<arreglo[i+1] || arreglo[i]==arreglo[i+1]){
                creciente++;
            }
            else{
                break;
            }
        }  
        if(creciente!=4){
            System.out.println("\nLos números no están ordenados de forma creciente.\n"
                    + "Vuelve a digitarlos.");
        }
    }while(creciente!=4); 
    
    
    //Pedimos el número
        System.out.println("\nIngresa un número para acomodarlo en el arreglo");
        System.out.print("Número: ");
        n = entrada.nextInt();
        
    //Verificamos el lugar en el que debe ir el número
        int j=0;
        int posicion=0;
        while(arreglo[j]<n && j<5){
            posicion++;
            j++;         
        }
    
    //Colocamos el número en la posición correspondiente en el arreglo
        for (int i = 4; i >= posicion; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[posicion]=n;
        System.out.println("El nuevo arreglo es:");
        for (int i = 0; i < 10; i++) {
            if(i==9){
                System.out.print(arreglo[i]+".\n");  
                      }
            else{
                System.out.print(arreglo[i]+" , ");
            }
        }
        
}
}
