/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
              tabla. Se debe mostrar la posición en que se encuentra. 
              Si no está, indicarlo con un mensaje
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int creciente=0;
        int num,posicion,veces=0;
        
        
//Se piden los 10 números del arreglo
        do{
        System.out.println("Ingresa 10 números de manera creciente");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Número: ");
            arreglo[i]=entrada.nextInt();
        }
//Se comprueba que estén de manera ascendente
            for (int i = 0; i < 9; i++) {
                if(arreglo[i+1]>arreglo[i]){
                    creciente++;
                }
            }
            if(creciente!=9){
            System.out.println("\nLa tabla no está ordenada de manera creciente.\n"
                    + "Vuelve a digitarla\n");
        }           
        }while(creciente !=9);
        

//Se pide un número para buscarlo en el arreglo
        System.out.print("\nEscribe el número que deseas encontrar en el arreglo: ");
        num = entrada.nextInt(); 
        
        //Se comienza a buscar el número
        int j=0;
        while(j<10 && arreglo[j]<num){
            j++;
        }
        if(j==10){
            System.out.println("\nEl número digitado no se encuentra en el arreglo");
        }
        else if(arreglo[j]== num){
            System.out.println("\nEl número se encuentra en la posición: "+j);
        }
        else{
            System.out.println("\nEl número digitado no se encuentra en el arreglo");
        }
        
    }
    
}
