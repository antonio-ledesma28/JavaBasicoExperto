/*
¿Qué son las excepciones?

Cuando un programa Java viola las restricciones semánticas del lenguaje
(Se produce un error). La máquina virtual Java comunica este hecho al programa 
mediante una excepción.

Muchas clases de errores pueden provocar una excepción, desde un desbordamiento
de memoria o un disco duro estropeado, un intento de dividir por cero o intentar
acceder a un vector fuera de sus límites. Cuando esto ocurre, la máquina
virtual Java crea un objeto de la clase exception.
 */
package conceptoexcepciones;

import java.util.Scanner;

public class ConceptoExcepciones {

    public static void main(String[] args) {
     /*  int num1 = 5, num2 = 0;
       int resultado = num1/num2;
       
        System.out.println("El resultado es: "+resultado);
        System.out.println("Hola mundo");
    */
     
     Scanner entrada = new Scanner(System.in);
     int numero = entrada.nextInt();
        System.out.println(numero);
    }
    
}
