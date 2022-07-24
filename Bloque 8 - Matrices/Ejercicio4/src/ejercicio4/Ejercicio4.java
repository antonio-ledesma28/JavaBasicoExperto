/*
Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los 
             elementos de la diagonal principal sean 1 y el resto 0.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]=new int[7][7];
        boolean diagonal, resto;
        
        //Pedimos los valores de la matriz
       
        System.out.println("Digita los valores de matriz 7x7 de manera que la"
                + " diagonal principal sean 1's y los demás sean 0's");
         
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {               
                do{
                diagonal=true; resto=true;
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
                
                if(i==j && matriz[i][j]!=1){
                    diagonal = false;
                    System.out.println("El valor digitado no es 1. Digita de nuevo");
                }
                if(i!=j && matriz[i][j]!=0){
                    resto=false;
                    System.out.println("El valor digitado no es 0. Digita de nuevo");
                }
                }while(diagonal== false || resto==false);
            }     
        }
       
        
        //Mostramos los valores
        System.out.println("\nLa matriz es:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    
}
