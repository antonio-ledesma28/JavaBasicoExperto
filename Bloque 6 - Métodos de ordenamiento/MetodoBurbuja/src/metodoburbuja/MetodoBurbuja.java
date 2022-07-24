/*
Ordenamiento: Método burbuja
 */
package metodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Número de"
                + "elementos del arreglo:"));
        
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();        
        }
                
//Utilización del método burbuja para ordenar
        for (int i = 0; i < nElementos-1; i++) {
            for (int j = 0; j < nElementos-1; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
            
        }
        
//Mostrando el arreglo ordenado en forma creciente
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
