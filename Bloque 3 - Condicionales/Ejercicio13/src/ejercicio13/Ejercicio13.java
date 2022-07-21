/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo
inicial de 1000 Dólares, con el siguinete menú de opciones:
1.Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir.
 */
package ejercicio13;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        final float saldoInicial = 1000;
        float total,monto;
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cuenta."
                + " Usted cuenta con un saldo de $1000.\nSelecciones la operación"
                + "que desea realizar.\n"
                + "\n1. Ingresar dinero a la cuenta."
                + "\n2.Retirar dinero de la cuenta."
                + "\n3. Salir."));
        total=saldoInicial;
        switch(num){
            case 1:
                monto= Float.parseFloat(JOptionPane.showInputDialog("Digite "
                        + "el monto que desea ingresar"));
                total = saldoInicial+monto;
                break;
            case 2:
                monto= Float.parseFloat(JOptionPane.showInputDialog("Digite "
                        + "el monto que desea Retirar"));
                if(monto>saldoInicial){
                    JOptionPane.showMessageDialog(null,"Operación inválida\n"
                            + "No cuenta con el suficiente dinero para retirar.");
                }
                else{
                    total = saldoInicial-monto;
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Saliendo del programa");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción no válida");
                break;
                
           
        }
        JOptionPane.showMessageDialog(null,"Su saldo final es de: $"+total);     
    }
    
}
