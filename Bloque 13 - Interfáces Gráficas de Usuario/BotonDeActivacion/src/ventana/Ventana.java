
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
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
        //Botón 1 - botón de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");
        boton1.setBounds(100, 100, 100, 40);
        boton1.setFont(new Font("cooper black",3, 20));
        boton1.setForeground(Color.blue);
        panel.add(boton1);
        
        //Botón 2 - botón de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon click = new ImageIcon("boton.jpg");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance
        (boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE); //Color de fondo del botón
        
        panel.add(boton2);
        
        //Botón 3 - botón de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        //boton3.setBorder(BorderFactory.createLineBorder(Color.blue));
        //boton3.setBorder(BorderFactory.createLineBorder(Color.red,3));
        boton3.setBorder(BorderFactory.createLineBorder(Color.green,4,true));
        panel.add(boton3);
        
    }
    
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opción 1",false);
        radioBoton1.setBounds(50, 100, 200, 50);
        radioBoton1.setEnabled(false);
        radioBoton1.setText("Programación");
        radioBoton1.setFont(new Font("cooper black", 0, 20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opción 2",true);
        radioBoton2.setBounds(50, 150, 100, 50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opción 3",true);
        radioBoton3.setBounds(50, 200, 100, 50);
        panel.add(radioBoton3);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarBotonesActivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opción 1", true);
        botonActivacion1.setBounds(50, 100, 100, 40);
        panel.add(botonActivacion1);
        
        JToggleButton botonActivacion2 = new JToggleButton("Opción 2", false);
        botonActivacion2.setBounds(50, 150, 100, 40);
        panel.add(botonActivacion2);
        
        JToggleButton botonActivacion3 = new JToggleButton("Opción 3", true);
        botonActivacion3.setBounds(50, 200, 100, 40);
        panel.add(botonActivacion3);
        
        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
        
    }
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        colocarBotonesActivacion();
    }
}
