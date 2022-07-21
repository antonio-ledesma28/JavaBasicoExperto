
package entradadedatos;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Cleamos un objeto de la clase Scanner
        int numero;
        System.out.print("Digite un número: ");
        numero = entrada.nextInt(); //Al objeto entrada se llama el método nextInt
        System.out.print("El número es: "+numero+"\n");
        
        float numero1;
        System.out.print("Digite un número: ");
        numero1 = entrada.nextFloat(); //Al objeto entrada se llama el método nextFloat
        System.out.print("El número es: "+numero+"\n");
        
        double numero2;
        System.out.print("Digite un número: ");
        numero2 = entrada.nextDouble(); //Al objeto entrada se llama el método nextDouble
        System.out.print("El número es: "+numero+"\n");
        
        String cadena;
        System.out.print("Digite una cadena: ");
        cadena = entrada.next(); //Next guarda la cadena antes de un espacio
        System.out.print("El número es: "+cadena+"\n");
        
        String cadena1;
        System.out.print("Digite una cadena: ");
        cadena1 = entrada.nextLine(); //NextLine guarda la cadena de toda la línea
        System.out.print("El número es: "+cadena+"\n");
        
        char caracter;
        System.out.print("Digite una cadena: ");
        caracter = entrada.next().charAt(0); //De la primer palabra guarda el caracter en la posición 0
        System.out.print("El número es: "+cadena+"\n");
    }
    
}
