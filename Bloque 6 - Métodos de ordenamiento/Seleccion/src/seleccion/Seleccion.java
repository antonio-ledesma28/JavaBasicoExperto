/*
Ordenamiento: Por selección
 */
package seleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos,min,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el "+
        "número de elementos del arreglo:"));
        
        arreglo = new int[nElementos];
        System.out.println("Digite el arreglo:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+" .Digite un número: ");
            arreglo[i] = entrada.nextInt();          
        }
        
        //Ordenamiento por selección
        for (int i = 0; i < nElementos; i++) {
            min = i;
            for (int j = i+1; j < nElementos; j++) {
                if(arreglo[j]<arreglo[min]){
                    min=j;
                }    
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] =aux;
            
        }
        
        //Orden ascendente
        System.out.println("\nEl arreglo ordenado en forma creciente es: ");
        for (int i = 0; i < nElementos; i++) {
            if(i!=nElementos-1){
            System.out.print(arreglo[i]+" , ");
            }
            else{
                System.out.print(arreglo[i]+".\n ");
            }
                
                }
        
        //Mostrando el arreglo de forma decreciente
        System.out.println("\nEl arreglo ordenado de forma decreciente es:");
        for (int i = (nElementos-1); i >= 0; i--) {
            if(i!=0){
            System.out.print(arreglo[i]+" , ");
            }
            else{
                System.out.print(arreglo[i]+".\n ");
            } 
            
        }
    }
    
}
