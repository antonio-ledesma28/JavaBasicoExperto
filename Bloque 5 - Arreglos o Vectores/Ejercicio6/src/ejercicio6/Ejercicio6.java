/*
Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos
             numéricos, y mezclarlos en una tercera de la forma: 
             3 de la tabla A, otros 3 de la B, etc.
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];
        int j=0,k=0,l=0;
        boolean cambio= false;
        
        System.out.println("Digita los valores de la tabla A"); 
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Número: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Digita los valores de la tabla B");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Número: ");
            b[i] = entrada.nextInt();
        }
        
        //Combinamos las tablas de 3 en 3
        for (int i = 0; i < 24; i++) {
            
            if(cambio == false){
            c[i]=a[j];
            j++;
            l++;
            if(l==3){
              cambio=true;
              l=0;
             }
            }
            else{
            c[i]=b[k];
            k++;
            l++;
            if(l==3){
                cambio=false;
                l=0;
            }
            }
        }
        
        System.out.println("El nuevo arreglo es");
        for (int i = 0; i < 24; i++) {
            if(i==23){
                System.out.print(c[i]+ ".\n");
            }
            else{
                System.out.print(c[i]+ " , ");
            }
        }
    }
    
}
