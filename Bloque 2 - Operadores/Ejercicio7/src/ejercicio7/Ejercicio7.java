/*
Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve
el número de semanas, días y horas equivalentes. Por ejemplo, dado un total de
1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas,semanas,dias,horasRestantes,diasRestantes;
       
        System.out.println("Programa que transforma el número de horas a"
                + "semanas días y horas\n");
        System.out.print("Digite el número de horas: ");
        horas=entrada.nextInt();
        dias = horas/24;
        horasRestantes=horas%24;
        semanas = dias/7;
        diasRestantes = dias%7;
        
        System.out.println("Las "+horas+" es igual a: \n");
        System.out.println("Las semanas son: "+semanas);
        System.out.println("Los días son: "+diasRestantes);
        System.out.println("Las horas son: "+horasRestantes);
        
        
    }
    
}
