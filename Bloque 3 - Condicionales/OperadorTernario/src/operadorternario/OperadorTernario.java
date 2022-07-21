
package operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        mensaje=(numero%2==0) ? "Es par" : "Es impar"; //?Operador ternario
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
