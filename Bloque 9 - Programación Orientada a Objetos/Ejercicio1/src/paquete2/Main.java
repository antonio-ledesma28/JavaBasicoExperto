/*
*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un
              cuadrilátero dada la longitud de sus dos lados. Los valores de la 
              longitud deberán introducirse por línea de ordenes. Si es un 
              cuadrado, sólo se proporcionará la longitud de uno de los lados 
              al constructor.
*/
package paquete2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2;
        Cuadrilatero c1;
        
        System.out.print("Ingresa el primer lado del cuadrilátero: ");
        num1 = entrada.nextFloat();
        System.out.print("Ingresa el segundo lado del cuadrilátero: ");
        num2 = entrada.nextFloat();
        
        if(num1 == num2){
            c1 = new Cuadrilatero(num1);
        }
        else{
            c1 = new Cuadrilatero(num1, num2);
        }
        
        System.out.println("\nEl perímetro del cuadrilátero es: "+c1.perimetro());
        System.out.println("El área del cuadrilátero es: "+c1.area());
    }
}
