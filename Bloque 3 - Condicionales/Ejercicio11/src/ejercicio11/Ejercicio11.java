/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una
calculadora que puede realizar las cuatro operaciones aritméticas básicas 
(suma,resta,multiplicación y división) con valores numéricos enteros.
El usuario debe especificar la operación con el primer caracter del primer
parámetro de la línea de comandos: S o s para la suma,R o r para la resta,
P,p,M o m para el producto y D o d para la división.
 */
package ejercicio11;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {
        int num,num2,operacion;
        char caracter;
        caracter = JOptionPane.showInputDialog("Digita la letra para la operación"
                + "que desees realizar\nSUMA: 'S' o 's'\n"
                + "RESTA: 'R' o 'r'\nMULTIPLICACIÓN: 'P', 'p', 'M' o 'm'\n"
                + "DIVISIÓN: 'D' o 'd'.").charAt(0);
     
        switch(caracter){
            case 's':
            case 'S':
                JOptionPane.showMessageDialog(null, "Digite los dos números que desea sumar");
                num= Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
                num2= Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));
                operacion = num+num2;
                JOptionPane.showMessageDialog(null, "La suma es: "+operacion);
                break;
            case 'r':
            case 'R':
                JOptionPane.showMessageDialog(null, "Digite los dos números que desea restar");
                num= Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
                num2= Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));
                operacion = num-num2;
                JOptionPane.showMessageDialog(null, "La resta es: "+operacion);
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                JOptionPane.showMessageDialog(null, "Digite los dos números que desea multiplicar");
                num= Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
                num2= Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));
                operacion = num*num2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+operacion);
                break;
            case 'D':
            case 'd':
                  JOptionPane.showMessageDialog(null, "Digite los dos números que desea dividir");
                num= Integer.parseInt(JOptionPane.showInputDialog("Primer número:"));
                num2= Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));
                operacion = num/num2;
                JOptionPane.showMessageDialog(null, "La división es: "+operacion);
                break; 
            default:
                JOptionPane.showMessageDialog(null, "Caracter inválido");
        }
                
    }
    
}
