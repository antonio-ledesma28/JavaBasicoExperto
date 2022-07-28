
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        this.setSize(500, 500);
        this.setMinimumSize(new Dimension (400,400));
        this.setTitle("El mejor título");
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        //Etiqueta 1 para texto
        JPanel panel= new JPanel();
        this.add(panel);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        JLabel etiqueta = new JLabel("Mundial 2018", SwingConstants.CENTER);
        etiqueta.setBounds(85, 10, 300, 30);
        //etiqueta.setOpaque(true);
        //etiqueta.setBackground(Color.black);
        etiqueta.setForeground(Color.black);
        
        etiqueta.setFont(new Font("cooper black",0,40)); //Establecemos la fuente del texto
        
        panel.add(etiqueta);
        
        
        //Etiqueta dos para imagen
        ImageIcon imagen = new ImageIcon("Gears.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10,80,470,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance
        (etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        //Escalado suave
        panel.add(etiqueta2);
        
        
        
    }
}
