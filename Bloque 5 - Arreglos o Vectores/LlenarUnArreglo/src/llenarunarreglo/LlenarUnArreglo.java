/*
Llenar un arreglo
 */
package llenarunarreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LlenarUnArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + " la cantidad de elementos:"));
        char letras[] = new char[nElementos]; //Creación de arreglo con N elementos
        
        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(i+1+". Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
            
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]+" ");
        }
    }
    
}
