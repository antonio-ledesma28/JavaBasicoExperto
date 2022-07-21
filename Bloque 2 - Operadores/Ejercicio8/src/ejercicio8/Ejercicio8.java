/*
Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raíces
de la ecuación de segundo grado de coeficientes reales.
ax^2+bx+c=0
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float a,b,c,x1,x2,raiz;
        System.out.println("Mostraremos las raices de tu la ecuación ax^2 +bx + c = 0");
        System.out.print("Digita el valor de a = ");
        a = entrada.nextFloat();
        System.out.print("Digita el valor de b = ");
        b = entrada.nextFloat();
        System.out.print("Digita el valor de c = ");
        c = entrada.nextFloat();
        
        raiz =(float) Math.sqrt(Math.sqrt(b)-(4*a*c));
        x1 = (-b+raiz)/(2*a);
        x2 = (-b-raiz)/(2*a);
        
        System.out.println("Las raices son: "+x1+" y "+x2);
        
       
        
    }
    
}
