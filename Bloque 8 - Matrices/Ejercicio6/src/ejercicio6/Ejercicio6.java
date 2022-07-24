/*
Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera 
             y transponerla en la segunda
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][]=new int[5][9];
        int matriz2[][]=new int[9][5];
        
        //Pedimos los valores de la matriz
        System.out.println("Ingresa los valores de una matriz 5x9");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=input.nextInt();
            }
        }
        
        //Tranponemos la matriz
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j]=matriz[j][i];
            }
        }
        
        //Imprimimos la primer matriz
        System.out.println("\nLa matriz digitada es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Imprimimos la matriz transpuesta
        System.out.println("\nLa matriz transpuesta es:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j]+" ");             
            }
            System.out.println("");
            
        }
        
    }
    
}
