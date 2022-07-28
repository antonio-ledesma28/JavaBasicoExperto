
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
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
    
    private void colocarCajasTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Hola...");
        System.out.println("Texto en la caja "+cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    private void colocarAreasTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba su texto: ");
        areaTexto.append("\nEscribe por aquí...");//Este método añade más texto al área de texto
        areaTexto.setEditable(true); //Validación para editar o no el texto
        System.out.println("El texto es: "+areaTexto.getText());
        panel.add(areaTexto);
        
        //Barras de desplazamineto
        JScrollPane barraDesplazamineto1 = new JScrollPane
        (areaTexto, //Barras de texto en el área de texto
        ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, //barra vertical
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Barra horizontal
        //Constructor con las barras en el área de texto
        
        barraDesplazamineto1.setBounds(20, 20, 300, 200);
        
        /*
        barraDesplazamineto1.setVerticalScrollBarPolicy //Barra de desplazamiento vertical
        (ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); //Sólo si es necesario
        barraDesplazamineto1.setHorizontalScrollBarPolicy //Barra de desplazamiento horizontal
        (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Sólo si es necesario
        */
        
        panel.add(barraDesplazamineto1);
        
    }
    
    private void colocarCasillasVerificacion(){
        JCheckBox casillaVerificacion1 = new JCheckBox("Leche",true);
        casillaVerificacion1.setBounds(20, 20, 100, 40);
        casillaVerificacion1.setEnabled(false);
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2 = new JCheckBox("Galletas");
        casillaVerificacion2.setBounds(20, 50, 100, 40);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3 = new JCheckBox("Yogurt");
        casillaVerificacion3.setBounds(20, 80, 100, 40);
        panel.add(casillaVerificacion3);
        
        JCheckBox casillaVerificacion4 = new JCheckBox("Cereal");
        casillaVerificacion4.setBounds(20, 110, 100, 40);
        panel.add(casillaVerificacion4);
    }
    
    private void colocarListasDesplegables(){
        /*String[] paises = {"Default","Perú", "Colombia","Paragua","Ecuador"};
        JComboBox listaDesplegable1 = new JComboBox(paises);
        listaDesplegable1.setBounds(20, 20, 100, 30);
        listaDesplegable1.addItem("Argentina"); //Agrega objeto al JComboBox
        listaDesplegable1.setSelectedItem("Paragua"); //Selecciona el primer objeto visto
        panel.add(listaDesplegable1);
        */
        Persona persona1 = new Persona("Alejandro Taboada", 21, "Peruana");
        Persona persona2 = new Persona("Tania Bustamante", 22, "Argentina");
        Persona persona3 = new Persona("Antonio Ledesma", 20, "Mexicana");
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(persona1);
        modelo.addElement(persona2);
        modelo.addElement(persona3);
        JComboBox listaDesplegable = new JComboBox(modelo);
        listaDesplegable.setBounds(20, 20, 300, 30);
        listaDesplegable.setSelectedItem(persona3);
        panel.add(listaDesplegable);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesActivacion();
        //colocarCajasTexto();
        //colocarAreasTexto();
        //colocarCasillasVerificacion();
        colocarListasDesplegables();
    }
}
