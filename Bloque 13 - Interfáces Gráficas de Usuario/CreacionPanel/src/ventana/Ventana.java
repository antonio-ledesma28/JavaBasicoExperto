
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public Ventana(){
        this.setSize(500, 500);
        this.setTitle("El mejor título");
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(400,400));
        //this.getContentPane().setBackground(Color.gray);
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creación de un panel
        panel.setBackground(Color.green); //Establecemos el color del panel
        this.getContentPane().add(panel); //Agregamos el panel encima de la ventana
    }
}
