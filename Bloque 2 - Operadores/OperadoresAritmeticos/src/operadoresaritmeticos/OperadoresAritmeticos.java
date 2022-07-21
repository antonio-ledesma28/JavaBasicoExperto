
package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        float num1,num2,suma,resta,multiplicacion,division,modulo;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digita dos números: ");
        num1 = entrada.nextFloat();
        num2= entrada.nextFloat();
        
        suma = num1+num2;
        resta=num1-num2;
        multiplicacion = num1*num2;
        division = num1/num2;
        modulo = num1%num2;
        
        System.out.print("La suma es : "+suma);
        System.out.print("\nLa resta es : "+resta);
        System.out.print("\nLa multiplicación es : "+multiplicacion);
        System.out.print("\nLa división es : "+division);
        System.out.print("\nEl módulo es : "+modulo);
        System.out.println();
    }
    
}
