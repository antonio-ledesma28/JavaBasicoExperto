/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que 
se introduzca un número negativo
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float num,cuadrado;
        do{
            System.out.print("Digite un número para sacar su cuadrado: ");
                num = entrada.nextFloat();
            if(num>=0){
                cuadrado =(float) Math.pow(num, 2);
                System.out.println("El cuadrado de: "+num+" es: "+cuadrado);    
            }
            else{
                System.out.println("\nSe introdujo un número negativo.\n"
                        + "Fin del programa.");
            }
        
        }while(num>=0);
        
    }
    
}
