/*
Ejercicio 3: Crear y cargar una matriz de 3x3. Transponerla y mostrarla.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][]=new int[3][3];
        int aux;
        
        //Se ingresan los valores de la matriz 3x3
        System.out.println("Ingresa los valores de una matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"] :");
                matriz[i][j]=entrada.nextInt();
            }
            System.out.println("");
        }
        
        //Transponemos la matriz
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < i; j++) {
                    aux=matriz[i][j];
                    matriz[i][j]=matriz[j][i];
                    matriz[j][i]=aux;
            }
        }
        
        //Mostramos la matriz transpuesta
        System.out.println("\nLa matriz transpuesta es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
}
