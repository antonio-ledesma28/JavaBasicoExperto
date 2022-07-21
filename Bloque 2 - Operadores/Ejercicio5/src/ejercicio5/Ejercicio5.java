/*
Ejercicio 5: La calificación final de un estudiante de informática se calcula
con base en las calificaciones de cuatro aspectos de su rendimiento académico:
parcipación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con
ponderaciones de 10%, 25%, 25%, y 40%. Hacer un programa que calcule e imprima
la calificación final obtenida por un estudiante.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int participacion;
        float examenPP,examenSP, examenF,calFinal;
        System.out.println("Calcularemos la calificación final de tu alumno");
        System.out.print("Digita las participaciones: ");
        participacion  = entrada.nextInt();
        System.out.print("Digite la calificación del primer parcial: ");
        examenPP =entrada.nextFloat();
        System.out.print("Digite la calificación del segundo parcial: ");
        examenSP =entrada.nextFloat();
        System.out.print("Digite la calificación del examen final: ");
        examenF =entrada.nextFloat();
        
        calFinal = (participacion*0.10f)+((examenPP+examenSP)*0.25f)+(examenF*0.40f);
        System.out.println("La calificación final es: "+calFinal);
    }
    
}
