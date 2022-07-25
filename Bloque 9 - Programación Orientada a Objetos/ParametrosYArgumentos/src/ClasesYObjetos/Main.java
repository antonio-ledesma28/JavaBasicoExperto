
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Asiganomos dos valores mediante ventana emergente
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otor número: "));
        
        //Creamos un objeto de la clase Operacion
        Operacion op = new Operacion();
        
        //Llamamos a los métodos de Operacion e insertamos los argumentos
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarResultados();
    }
}
