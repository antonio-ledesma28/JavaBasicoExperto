/*
Matrices
 */
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matriz2[][],nFilas,nColumnas;
        
        //Imprimimos la primer matriz
        for (int i = 0; i < 3; i++) { //Número de filas
            for (int j = 0; j < 3; j++) {  //Número de columnas
                System.out.print(matriz[i][j]);   
            }
            System.out.println("");
        }
            
            //Segunda matriz
            
            //Pedimos el número de filas y el número de columnas
            nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el"
                    + " número de filas del arreglo:"));
            nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el"
                    + " número de columnas del arreglo:"));
            
            //Pedimos todos los valores de la matriz
            matriz2 = new int[nFilas][nColumnas];
            System.out.println("Digita la matriz");
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    System.out.print("Matriz ["+i+"]["+j+"] :");
                    matriz[i][j] = entrada.nextInt();
                    
                }
            }
            //Imprimimos la matriz
            System.out.println("\nLa matriz es");
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            
        }
    }
        
        
    
}
