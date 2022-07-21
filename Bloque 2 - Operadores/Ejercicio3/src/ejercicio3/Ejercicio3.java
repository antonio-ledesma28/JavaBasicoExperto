/*
Ejercicio 3: 
Guillermo tiene N dólares. 
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis, juan, total;
        System.out.print("Escribe la cantidad de dólares que posee Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        total = guillermo+juan+luis;
        
        System.out.println("\nLa suma de los 3 es de: "+total);
        
    }
    
}
