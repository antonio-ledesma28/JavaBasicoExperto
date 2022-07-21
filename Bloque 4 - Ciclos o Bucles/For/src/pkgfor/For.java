/*
For
for(inicialización;condición;aumento o decremento){
    Instrucciones
}
 */
package pkgfor;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        System.out.print("Digite la cantidad de términos: ");
        contador = entrada.nextInt();
        
        for(int i=0;i<=contador;i+=2){
            System.out.println(i);
        }
    }
    
}
