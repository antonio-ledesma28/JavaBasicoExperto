/*
Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000.
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float sueldo,suma=0;
        int contador=0;
        
        System.out.println("Ingrese 10 sueldos");
        
        for(int i=0;i<10;i++){
            System.out.print("Ingrese el sueldo "+(i+1)+": ");
            sueldo= entrada.nextFloat();
            System.out.println("Sueldo "+(i+1)+" : "+sueldo);
            suma+=sueldo;
            if(sueldo>1000){
                contador++;
            }             
        }
        System.out.println("\nLa suma de todos los sueldos es: "+suma);
        System.out.println("Los sueldos mayores a $1000 son: "+contador);
    }
    
}
