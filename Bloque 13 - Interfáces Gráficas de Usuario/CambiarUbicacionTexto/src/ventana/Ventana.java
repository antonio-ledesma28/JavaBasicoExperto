
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(400,400));
        this.setTitle("El mejor título");
        iniciarComponente();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void iniciarComponente(){
        JPanel panel = new JPanel();
        panel.setLayout(null); //Quitamos el diseño predeterminado del panel
        this.add(panel);
        
        JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER); //Texto y posición horizontal del texto
        //etiqueta.setText("Hola"); Establecemos el texto
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); Posición horizontal del texto
        
        etiqueta.setBounds(10, 10, 50, 20);
        etiqueta.setOpaque(true); //Permitimos que se coloree el fondo de la etiqueta
        etiqueta.setBackground(Color.black);
        etiqueta.setForeground(Color.white);
        panel.add(etiqueta); //Agregamos la etiqueta al panel
        
        
        
    }
}
