/*
Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]=new int[3][3];
        int matriz2[][]=new int[3][3];
        int matriz3[][]=new int[3][3];
       
        System.out.println("Digita los valores de las dos matrices 3x3\n");
        //Pedimos los valores de la primer matriz
        System.out.println("Matriz 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 1 ["+i+"]["+j+"] :");
                matriz[i][j]=entrada.nextInt();
            }
            System.out.println("");
        }
        //Pedimos los valores de la segunda matriz
        System.out.println("\nMatriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz 2 ["+i+"]["+j+"] :");
                matriz2[i][j]=entrada.nextInt();
            }
            System.out.println("");
            
        }
        //Hacemos la suma de las dos matrices en una tercera
        System.out.println("\nLa suma de las matrices es:");        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j]=(matriz[i][j]+matriz2[i][j]);
            }
        }
        //Imprimimos la matriz 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3[i][j]);
            }
            System.out.println("");
            
        }
    }
    
}
