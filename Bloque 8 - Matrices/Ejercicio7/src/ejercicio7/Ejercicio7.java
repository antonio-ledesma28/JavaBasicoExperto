/*
Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos sus elementos 
             deben ser 0 salvo los de los bordes que deben de ser 1. Mostrarlo
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        boolean bordes, dentro;
        
        //Pedimos los valores de la matriz marco
        System.out.println("Ingresa los valores de una matriz marco de 5x5");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                do{
                    bordes=true; dentro=true;
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = input.nextInt();
                
                if(((i==0 || i==4) && (matriz[i][j]!=1))){
                    bordes = false;
                    System.out.println("El número digitado no es 1.\n"
                            + "Vuelve a digitar");
                }
                else if((j==0 || j==4) && (matriz[i][j]!=1)){
                    bordes = false;
                    System.out.println("El número digitado no es 1.\n"
                            + "Vuelve a digitar");
                }
                else if(((i>0 && i<4) && (j>0 && j<4) && (matriz[i][j]!=0))){
                    dentro = false;
                    System.out.println("El número digitado no es 0.\n"
                            + "Vuelve a digitar");
                    
                }
                
               
                
            }while(bordes==false || dentro == false);
        }
        }
        
        //Imprimimos la matriz
        System.out.println("\nLa matriz marco es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
