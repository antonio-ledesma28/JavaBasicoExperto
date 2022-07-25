/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos,
             implemente el siguiente menú:

             1. Sumar dos números complejos
             2. Multiplicar 2 números complejos.
             3. Comparar 2 números complejos(iguales o no).
             4. Multiplicar un número complejo por un entero.
 */
package ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
            numer1 = a + bi;
            numero2 = c + di;
        */
        NumeroComplejo numero1,numero2,suma,mult;
        double a,b,c,d;
        int opcion, numero;
        
        do{
            System.out.println("\t.:Operaciones con Números Complejos:.");
            System.out.println("1. Sumar dos números complejos\n"
                    + "2. Multiplicar 2 números complejos.\n"
                    + "3. Comparar 2 números complejos(iguales o no).\n"
                    + "4. Multiplicar un número complejo por un entero.\n"
                    + "5. Salir del programa\n");
            System.out.print("Digite la opción del menú: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite el segundo número complejo: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la segunda parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    suma = numero1.suma(numero2);
                    System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i\n");
                    break;
                case 2: 
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite el segundo número complejo: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la segunda parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    mult = numero1.producto(numero2);
                    System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i\n");
                    break;
                    
                case 3: 
                    System.out.println("\nDigite el primer número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite el segundo número complejo: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la segunda parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);
                    
                    if(numero1.igualdad(numero2)){
                        System.out.println("\nLos números complejos son iguales\n");
                    }
                    else{
                        System.out.println("\nLos números complejos no son iguales\n");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nDigite el número complejo: ");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite el entero: ");
                    numero = entrada.nextInt();
                    
                    numero1 = new NumeroComplejo(a, b);
                    mult = numero1.multiplicarEntero(numero);
                    System.out.println("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i\n");
                    break;
                case 5:
                    System.out.println("\nSaliendo del programa\n");
                    break;
            }
        }while(opcion !=5);
    }
    
}
