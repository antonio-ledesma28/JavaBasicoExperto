/*
Ejercicio 21: Pedir 10 números y mostrar al final si se ha introducido alguno negativo
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean negativo=false;
        int num;
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+". Ingresa un valor: ");
            num = entrada.nextInt();
            
            if(num<0){
                negativo=true;
            }
        }
        if (negativo==true){
            System.out.println("\nSe introdujo algún valor negativo");
        }
        else{
            System.out.println("\nNo se introdujo un valor negativo");
        }
    }
    
}
