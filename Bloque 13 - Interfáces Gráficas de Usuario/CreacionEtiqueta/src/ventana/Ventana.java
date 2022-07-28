package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
    
    public Ventana() {
        this.setSize(500, 500);
        this.setMinimumSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.inciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void inciarComponentes() {
        JPanel panel = new JPanel();
        //panel.setBackground(Color.GREEN);
        panel.setLayout(null); //Desactivamos el layout por defecto para que se vea el texto
        this.getContentPane().add(panel);

        /*JLabel etiqueta = new JLabel("Hola"); //Etiqueta con un texto
        panel.add(etiqueta);
         */
        JLabel etiqueta = new JLabel(); //Segunda forma
        etiqueta.setText("Hola");
        etiqueta.setBounds(10, 10, 40, 10);
        panel.add(etiqueta);
    }
}
