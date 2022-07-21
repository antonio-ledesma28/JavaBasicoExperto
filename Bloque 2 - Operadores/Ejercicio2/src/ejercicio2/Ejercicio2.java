/*
Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un 
empleado a partir de sus horas semanales trabajadas y de su salario por hora
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioSemanal,salarioPorHora,horasSemanales;
        
        System.out.println("Calcularemos el salario semanal de tu empreado \n");
        System.out.print("Salario por hora de tu empleado: ");
        salarioPorHora = entrada.nextFloat();
        System.out.print("Horas de trabajo semanales de tu empleado: ");
        horasSemanales = entrada.nextFloat();
        
        salarioSemanal = salarioPorHora * horasSemanales;
        System.out.print("\nEl salario semanal de tu empleado es de: "+salarioSemanal+" \n");
    }
    
}
