/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrar en el siguiente orden: el primero, el último, el segundo, 
el penúltimo, el tercero, etc
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int arreglo[]=new int[10],auxiliar=0,j =0,k=9;
        
        System.out.println("Ingresa 10 números");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Ingresa el número: ");
            arreglo[i] = entrada.nextInt();   
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if(auxiliar%2==0){
                System.out.println(arreglo[j]);
                j++;      
                auxiliar++;
            }
            else{
                System.out.println(arreglo[k]);
                k--;
                auxiliar++;
            }
        }
        
    }
    
}
