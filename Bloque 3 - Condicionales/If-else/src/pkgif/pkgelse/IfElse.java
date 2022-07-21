
package pkgif.pkgelse;

import javax.swing.JOptionPane;


public class IfElse {

    public static void main(String[] args) {
        int numero,dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número es distinto a 5");
        }
        //Operador de igualdad "==". Operador de desigualdad "!=".
        //Operador de mayor a ">". Operador de menor a "<"
        //Operador de mayor o igual ">=". Operador de menor o igual "<="
    }
    
}
