/*
Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma
(a+b)^2 = a^2+b^2+2ab
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float a,b,c,c1;
        System.out.println("Calcularemos el cuadrado de una suma\n");
        System.out.print("Digite el primer valor: ");
        a=entrada.nextFloat();
        System.out.print("Digite el segundo valor: ");
        b=entrada.nextFloat();
        
        c=(float)Math.pow(a+b, 2); //Primera forma
        c1=(float)(Math.pow(a, 2)+Math.pow(b, 2)+2*a*b); //Segunda forma
        System.out.println("El cuadrado de la suma es: "+c);//Primer resultado
        System.out.println("El cuadrado de la suma es: "+c1);//Segundo resultado
        
        
        
    }
    
}
