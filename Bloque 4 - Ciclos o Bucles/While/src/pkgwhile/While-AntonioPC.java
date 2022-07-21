/*
While
 */
package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1,contador;
        System.out.print("Digite cuántos números quiere en pantalla: \n");
        contador = entrada.nextInt();
        while(i<=contador){
            System.out.println(i);
            i++;
        }
    }
    
}
