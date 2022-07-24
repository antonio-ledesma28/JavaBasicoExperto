/*
Ordenamiento: Por inserción
 */
package insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos,pos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el "+
        "número de elementos del arreglo:"));
        
        arreglo = new int[nElementos];
        System.out.println("Digite el arreglo:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+" .Digite un número: ");
            arreglo[i] = entrada.nextInt();          
        }
        
        //Ordenamiento por inserción
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];     
        
        while((pos>0 && arreglo[pos-1]> aux)){
            arreglo[pos]= arreglo[pos-1];
            pos--;
        }
        arreglo[pos] = aux;
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
