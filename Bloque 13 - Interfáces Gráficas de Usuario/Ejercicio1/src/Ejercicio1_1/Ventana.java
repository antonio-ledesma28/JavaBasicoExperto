
package Ejercicio1_1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JLabel etiqueta;
    private JPanel panel;
    private JButton boton;
    int contador = 0;
    
    public Ventana(){
        this.setSize(500, 500);
        this.setTitle("Contador 2");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        colocarComponentes();
    }
    
    public void colocarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    
    public void colocarPanel(){
        panel= new JPanel();
        panel.setSize(500, 500);
        panel.setLayout(null);
        this.add(panel);
    }
    
    public void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(100, 80, 300, 50);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setText("CLICKEA EL BOTÓN");
        Font fuente = new Font("Arial", 1, 30);
        etiqueta.setFont(fuente);
        panel.add(etiqueta);
    }
    
    public void colocarBoton(){
        boton = new JButton();
        boton.setBounds(150,300,180,60);
        boton.setText("Presióname");
        Font fuente = new Font("Arial", 1, 25);
        boton.setFont(fuente);
        panel.add(boton);
        accion();
        
    }
    
    private void accion(){
        MouseListener accion = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                contador++;
                if(contador==1){
                    etiqueta.setText("Clickeado 1 vez");
                }
                else{
                    etiqueta.setText("Clickeado "+contador+ " veces");
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
        boton.addMouseListener(accion);
    }
}
