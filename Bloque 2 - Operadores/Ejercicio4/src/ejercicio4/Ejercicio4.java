/*
Ejercicio 4: Una compañía de ventas de carros usados, paga a su personal de
ventas un salario de $1000 mensuales, más una comisión de $150 por cada carro
vendido, más el 5% del valor de la venta del carro. Cada mes el capturista de la
empresa ingresa en la computadora los datos pertinentes. Hacer un programa que
calcule e imprima el salario mensual de un vendedor dado.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float salarioFijo=1000f,salarioAutoVendido= 150f;
        float salarioTotal,valorAutos,numAutosVendidos;
        
        System.out.println("Calcularemos el salario del vendedor\n");
        System.out.print("¿Cuántos autos vendió?: ");
        numAutosVendidos=entrada.nextInt();
        System.out.print("¿Cuál es el valor de los autos?: ");
        valorAutos = entrada.nextFloat();
      
        salarioTotal = (salarioFijo+(numAutosVendidos*salarioAutoVendido)+(0.05f*numAutosVendidos*valorAutos));
        System.out.println("\nEl salario total de tu empleado es: "+salarioTotal);
        
        
    }
    
}
