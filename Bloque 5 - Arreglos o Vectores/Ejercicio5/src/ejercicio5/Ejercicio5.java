/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en 
una tercera de la forma: el 1° de B, el 2° de A, el segundo de B°, etc.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[]= new int[20];
        int k=0,j=0;
        
        System.out.println("Ingresa los números del primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo1[i]=entrada.nextInt();
        }
        
        System.out.println("Ingresa los números del segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo2[i]=entrada.nextInt();
        }
        
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                arreglo3[i]=arreglo1[j];
                j++;
            }
            else{
                arreglo3[i]=arreglo2[k];
                k++;
            }
        }
        System.out.println("\nLos valores intercalados de los dos arreglos son:");
        for (int i = 0; i < 20; i++) {
            if(i==19){
                System.out.print(arreglo3[i]+". ");
            }else{
                System.out.print(arreglo3[i]+" , ");  
            }
            
        }
        
    }
    
}
