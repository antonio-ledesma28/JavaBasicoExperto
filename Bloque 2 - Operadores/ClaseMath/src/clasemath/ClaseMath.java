
package clasemath;

import java.util.Scanner;

public class ClaseMath {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raiz = Math.sqrt(9); //sqrt de clase Math te devuelve un Double
        System.out.println(raiz);
        int raiz1 = (int) Math.sqrt(9); //El resultado lo convertimos en un valor entero
        System.out.println(raiz1);
        
        double base = 5,exponente = 2;
        double resultado = Math.pow(base, exponente);
        //Pow es el método para elevar. Math.pow (número,potencia)
        System.out.println(resultado);
        float numero = 4.56f;
        // long resultado1 = Math.round(numero);
        
        //Round es para redondear el número
        int resultado1 = Math.round(numero);
        System.out.println(resultado1);
        
        double num = Math.random();
        System.out.println(num);
        
        
    }
    
}
