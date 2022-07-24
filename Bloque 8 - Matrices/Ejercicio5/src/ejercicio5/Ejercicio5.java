/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de 
             cada fila y de cada columna.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][],filas,columnas;
        int aFilas[],aColumnas[];
        int totalFilas=0,totalColumnas=0;
        
        //Pedimos el número de filas y columnas
        System.out.print("Digita el número de filas que tendrá tu matriz: ");
        filas= input.nextInt();
        System.out.print("Digita el número de columnas que tendrá tu matriz: ");
        columnas=input.nextInt();
        
        //Creamos el arreglo y lo llenamos
        matriz=new int[filas][columnas];
        
        System.out.println("\nDigita los valores de tu matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz ["+i+"]["+j+"] :");
                matriz[i][j]=input.nextInt();
            }
            System.out.println("");
        }
        
        //Imprimimos la matriz
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        //Hacemos la suma de cada fila y cada columna
        aFilas=new int[filas];
        aColumnas=new int[columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aFilas[i]+=matriz[i][j];
            }     
        }
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                aColumnas[j]+=matriz[i][j];
            }     
        }
        
        //Imprimimos la suma de las filas 
        System.out.println("\nLa suma de las filas es");
        for (int i = 0; i < filas; i++) {
            System.out.println("Fila "+i+" : "+aFilas[i]);
        }
        
        for (int i = 0; i < aFilas.length; i++) {
            totalFilas+=aFilas[i];
        }
        System.out.println("Total: "+totalFilas);
        
        //Imprimimos la suma de las columnas
        System.out.println("\nLa suma de las columnas es");
        for (int i = 0; i < aColumnas.length; i++) {
            System.out.println("Columna "+i+" : "+aColumnas[i]);
        }
       
        for (int i = 0; i < columnas; i++) {
            totalColumnas+=aColumnas[i];
        }
        System.out.println("Total: "+totalColumnas);
    }
    
}
