package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    JPanel panel;

    public Ventana() {
        this.setSize(500, 500); //Tamaño de la ventana
        this.setLocationRelativeTo(null); //Centrar la ventana en pantalla
        this.setMinimumSize(new Dimension(400, 400)); //Tamaño mínimo de la ventana
        this.setTitle("El mejor título"); //Título de la ventana
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cerrar con la "X" de la ventana
    }
    

    private void colocarPaneles() {
        panel = new JPanel(); //Se crea un panel para almacenar nuestros elementos
        panel.setLayout(null); //Se quita el diseño por defecto del panel 
        this.add(panel); //Agregamos el componente a la ventana
        this.getContentPane().add(panel); //Se agrega el contenido del panel
    }
    

    private void colocarEtiquetas() {
        //Creación de las etiquetas
        JLabel etiqueta = new JLabel("Mundial 2018", SwingConstants.CENTER);
        //Se alinea al centro el texto
        etiqueta.setBounds(85, 10, 300, 30);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("cooper black", 0, 40)); //Fuente de letra

        panel.add(etiqueta); //Agregamos la etiqueta de texto al panel

        //Etiqueta 2 para una imagen
        ImageIcon imagen = new ImageIcon("Gears.jpg"); //Se crea un objeto ImageIcon y
        //se toma la imagen.

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(10, 80, 470, 300); //Tamaño y posición de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance
        (etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        //Se ajusta la imagen a la etiqueta

        panel.add(etiqueta2);
    }
    
    
    private void colocarBotones(){
        JButton boton1 = new JButton("Click");
        boton1.setText("Click"); //Establecemos un texto al botón
        boton1.setBounds(100, 100, 100, 40); //Tamaño y posición del botón
        //boton1.setEnabled(true); //Habilitar o deshabilitar las funciones del botón
        boton1.setMnemonic('a'); //Establecemos el alt+letra y el botón funciona
        panel.add(boton1);
        
    }
    
    

    private void iniciarComponentes() {
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }
}
