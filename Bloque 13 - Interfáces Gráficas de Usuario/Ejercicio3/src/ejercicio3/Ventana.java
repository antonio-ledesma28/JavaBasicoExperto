
package ejercicio3;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class Ventana extends JFrame{
    private JLabel etiqueta;
    private JButton boton1, boton2, boton3;
    private JPanel panel;
    private ScrollListener rueda;
           
    public Ventana(){
        this.setSize(800, 500);
        this.setTitle("Colores");
        this.setLocationRelativeTo(null);
        colocarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void colocarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        crearBotones();
    }
    
    public void colocarPanel(){
        panel = new JPanel();
        panel.setSize(800, 500);
        panel.setLayout(null);
        this.add(panel);
    }
    
    public void colocarEtiqueta(){
        etiqueta = new JLabel();
        Font font = new Font("Arial", 1, 30);
        etiqueta.setFont(font);
        etiqueta.setText("COLORES (ROJO,VERDE,AZUL)");
        etiqueta.setBounds(0, 20, 700, 40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
       
    }
    
    public void crearBotones(){
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        
        boton1.setBounds(10, 350, 200, 50);
        boton1.setText("ROJO");
        panel.add(boton1);
        
        boton2.setBounds(280, 350, 200, 50);
        boton2.setText("VERDE");
        panel.add(boton2);
        
        boton3.setBounds(550, 350, 200, 50);
        boton3.setText("AZUL");
        panel.add(boton3);
        
        accionesBotones();
    }
    
    public void accionesBotones(){
        //rueda = new ScrollListener();
    }
}
