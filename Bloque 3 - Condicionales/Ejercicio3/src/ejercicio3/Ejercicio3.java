/*
 Ejercicio 3: Programa que lea un caracter por teclado y compruebe si es una
letra mayúscula
 */
package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        char caracter;
        caracter = JOptionPane.showInputDialog("Escribe un caracter: ").charAt(0);
        if(Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null,"El caracter es mayúscula" );
        }
        else{
            JOptionPane.showMessageDialog(null, "El caracter es minúscula");
        }
    }
    
}
