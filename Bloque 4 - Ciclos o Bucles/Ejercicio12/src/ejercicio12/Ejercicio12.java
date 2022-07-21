/*
Ejercicio 12: Pedir un número y calcular su factorial

N! = 1*2*3...*N
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial=1;
        int num;
        System.out.print("Digita el número del cual quieras calcular el"
                + " factorial: ");
        num=entrada.nextInt();
        for(int i =1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
    
}
