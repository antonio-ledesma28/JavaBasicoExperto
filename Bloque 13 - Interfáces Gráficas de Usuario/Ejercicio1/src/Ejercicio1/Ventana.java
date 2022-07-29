package Ejercicio1;

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


public class Ventana extends JFrame {
    private JPanel panel;
    private JButton boton;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private int contador = 0;

    public Ventana() {
        this.setSize(400, 400);
        this.setTitle("Contador de clicks");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        colocarComponentes();
        
    }

    public void colocarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }

    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(400, 400);
        this.add(panel);
    }
    
    public void colocarBoton(){
        boton = new JButton();
        boton.setBounds(150, 200, 100, 50);
        boton.setText("Click");
        panel.add(boton);
        oyenteDeRaton();      
        
    }
    public void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 20, 400, 200);
        Font fuente = new Font("arial", 0, 20);
        etiqueta.setText("Pulsa el botón");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Centrar de manera horizontal
        etiqueta.setFont(fuente);
        panel.add(etiqueta);
    }
    
    
    private void oyenteDeRaton(){
       ActionListener oyente = new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                if (contador !=0){
                    etiqueta.setText("Número de clicks: "+contador);
                }
                }
            
        };
       boton.addActionListener(oyente);
    }

}
