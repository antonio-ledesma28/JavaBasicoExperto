/*
Ejercicio 1 = Hacer un programa que calcule e imprima la suma de tres 
calificaciones
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float cal1, cal2, cal3;
        float suma;
        System.out.println("Digite las 3 calificaciones: \n");
        System.out.print("Calificación 1: ");
        cal1 = entrada.nextFloat();
        System.out.print("Calificacion 2: ");
        cal2 = entrada.nextFloat();
        System.out.print("Calificación 3: ");
        cal3 = entrada.nextFloat();
        System.out.println();
        suma = cal1+cal2+cal3;
        System.out.print("La suma de las tres calidicaciones es: "+suma+"\n");
    }
    
}
