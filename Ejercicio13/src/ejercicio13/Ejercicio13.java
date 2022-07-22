/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos 
pares de la primera, y a continuación los elementos impares.
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int arreglo2[] = new int[10];
        
        //Guardamos los 10 valores en la primer tabla
        System.out.println("Ingresa 10 números");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Agregamos los números pares a la segunda tabla
        int j=0,k=0;
        while(j<10){
            if(arreglo[j]%2==0){
                arreglo2[k]=arreglo[j];
                k++;
            }
            j++;
        }
        j=0;
        while(j<10){
            if(arreglo[j]%2!=0){
                arreglo2[k]=arreglo[j];
                k++;
            }
            j++;
        }
        
        //Imprimimos la tablas
        System.out.println("\n La nueva tabla es:");
        for (int i = 0; i < 10; i++) {
            if(i!=9){
            System.out.print(arreglo2[i]+" , ");
            }
            else{
              System.out.print(arreglo2[i]+".\n");  
            }
        }
    }    
    
}
