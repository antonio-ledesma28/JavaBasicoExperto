package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

    public Ventana (){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(400,400));
        this.setTitle("El mejor título");
        this.iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Creación del panel
        panel.setLayout(null); //Quitamos los valores determinados del panel para mover la etiqueta
        this.add(panel);  //Ponemos el panel en la ventana
        JLabel etiqueta = new JLabel();  //Creación del JLabel
        etiqueta.setText("Hola");  //Asignamos el texto de la etiqueta
        etiqueta.setForeground(Color.white);//Color de la letra
        etiqueta.setOpaque(true); // Damos permiso para que pinte el fondo de la etiqueta
        etiqueta.setBackground(Color.black); //Cambiamos el color del fondo de la etiqueta
        panel.add(etiqueta);  //Agregamos la etiqueta al panel
        etiqueta.setBounds(10, 10, 30, 20);
    }
}
