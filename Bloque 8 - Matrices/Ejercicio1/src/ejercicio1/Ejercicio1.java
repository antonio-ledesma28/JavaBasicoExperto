/*
Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es 
             simétrica o no.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], n, m;
        boolean simetria=true;
        
        System.out.println("Ingresa los valores de una matriz");
        System.out.print("Número de filas de la matriz: ");
        n = entrada.nextInt();
        System.out.print("Número de columnas de la matriz: ");
        m = entrada.nextInt();
        
        matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Matriz ["+i+"]["+j+"] :");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        if(n==m){
            int i=0,j=0;
            while(i<n && simetria==true){
                j=0;
                while(j<i && simetria==true){
                if(matriz[i][j]!=matriz[j][i]){
                    simetria =false;
                }
                j++;
            }
                i++;
                
            }
            if(simetria==false){
                System.out.println("La matriz no simétrica");
            }
            else{
                System.out.println("La matriz es simétrica");
            }
        }
        
        else{
            System.out.println("La matriz no es simétrica ya que no es cuadrada:");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
            
        }
    }
    
}
