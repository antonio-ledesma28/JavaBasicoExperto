
package ventana;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JLabel etiqueta,imagen1,imagen2,imagen3,imagen4;
    private JPanel panel;
    private JRadioButton rb1,rb2,rb3,rb4;
    private ButtonGroup grupoBoton;
    
    public Ventana(){
        this.setSize(800, 500);
        this.setTitle("Deporte favorito");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        colocarComponentes();
    }
    
    public void colocarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBotones();
        colocarImagenes();
    }
    
    public void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(800, 500);
        this.add(panel);
    }
    public void colocarEtiqueta(){
        etiqueta = new JLabel();
        etiqueta.setBounds(0, 10, 400, 30);
        Font font = new Font("Arial", 1, 20);
        etiqueta.setFont(font);
        etiqueta.setText("Selecciona tu deporte favorito");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    }
    
    public void colocarBotones(){
        rb1 = new JRadioButton();
        rb1.setBounds(30, 100, 100, 20);
        Font font = new Font("Arial", 1, 20);
        rb1.setFont(font);
        rb1.setText("Béisbol");
        panel.add(rb1);
        
        rb2 = new JRadioButton();
        rb2.setBounds(30, 200, 100, 20);
        rb2.setFont(font);
        rb2.setText("Fútbol");
        panel.add(rb2);
        
        rb3 = new JRadioButton();
        rb3.setBounds(30, 300, 150, 20);
        rb3.setFont(font);
        rb3.setText("Básquetbol");
        panel.add(rb3);
        
        rb4 = new JRadioButton();
        rb4.setBounds(30, 400, 150, 20);
        rb4.setFont(font);
        rb4.setText("Hockey");
        panel.add(rb4);
        colocarGrupo();
        
    }
    
    public void colocarGrupo(){
        grupoBoton = new ButtonGroup();
        grupoBoton.add(rb1);
        grupoBoton.add(rb2);
        grupoBoton.add(rb3);
        grupoBoton.add(rb4);
    }
    
    public void colocarImagenes(){
        imagen1 = new JLabel();
        imagen1.setBounds(200, 80, 550, 350);
        panel.add(imagen1);
        
        imagen2 = new JLabel();
        imagen2.setBounds(200, 80, 550, 350);
        panel.add(imagen2);
        
        imagen3 = new JLabel();
        imagen3.setBounds(200, 80, 550, 350);
        panel.add(imagen3);
        
        imagen4 = new JLabel();
        imagen4.setBounds(200, 80, 550, 350);
        panel.add(imagen4); 
        
        final ImageIcon imagenBeisbol = new ImageIcon(getClass().getResource("/imagenes/béisbol.jpg"));
        final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/imagenes/fútbol.jpg"));
        final ImageIcon imagenBasquetbol = new ImageIcon(getClass().getResource("/imagenes/básquetbol.jpg"));
        final ImageIcon imagenHockey = new ImageIcon(getClass().getResource("/imagenes/hockey.png"));
        
        ActionListener accion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen1.setIcon(new ImageIcon(imagenBeisbol.getImage().
                        getScaledInstance
                        (imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_SMOOTH)));
                }
        };
        
        ActionListener accion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen2.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_SMOOTH)));
                }
        };
        
        ActionListener accion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen3.setIcon(new ImageIcon(imagenBasquetbol.getImage().
                        getScaledInstance
                        (imagen3.getWidth(), imagen3.getHeight(), Image.SCALE_SMOOTH)));
                }
        };
        
        ActionListener accion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen4.setIcon(new ImageIcon(imagenHockey.getImage().getScaledInstance(imagen4.getWidth(), imagen4.getHeight(), Image.SCALE_SMOOTH)));
                }
        };
        
        rb1.addActionListener(accion1);
        rb2.addActionListener(accion2);
        rb3.addActionListener(accion3);
        rb4.addActionListener(accion4);
    }
    
}
