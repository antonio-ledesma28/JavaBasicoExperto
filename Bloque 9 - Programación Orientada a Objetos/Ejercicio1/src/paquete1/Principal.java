/*
*Ejercicio 1: Construir un programa que calcule el área y el perímetro de un
              cuadrilátero dada la longitud de sus dos lados. Los valores de la 
              longitud deberán introducirse por línea de ordenes. Si es un 
              cuadrado, sólo se proporcionará la longitud de uno de los lados 
              al constructor.
*/
package paquete1;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1;
        float lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }
        else{
            c1=new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perímetro es: "+c1.getPerimetro());
        System.out.println("El área es: "+c1.getArea());
    }
}
