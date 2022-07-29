
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
    private JPanel panel;
    private JLabel etiqueta, imagen1, imagen2, imagen3, imagen4;
    private JRadioButton rb1, rb2, rb3, rb4;
    
    
    public Ventana(){
        this.setSize(800, 500);
        this.setTitle("Deportes");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        colocarComponentes();
    }
    
    public void colocarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    public void colocarPanel(){
        panel = new JPanel(null);
        panel.setSize(800, 500);
        this.add(panel);
    }
    public void colocarEtiqueta(){
        etiqueta = new JLabel("SELECCIONA TU DEPORTE FAVORITO");
        Font fuente = new Font("Arial", 1, 20);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
         etiqueta.setBounds(200, 10, 400, 40);
        etiqueta.setFont(fuente);
        panel.add(etiqueta);
    }
    public void colocarRadioBotones(){
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb3 = new JRadioButton();
        rb4 = new JRadioButton();
        
        Font fuente = new Font("arial", 0, 20);
        
        rb1.setText("BÉISBOL");
        rb1.setBounds(10, 100, 180, 40); 
        rb1.setFont(fuente);
        panel.add(rb1);
        
        rb2.setText("FÚTBOL");
        rb2.setBounds(10, 200, 180, 40);
        rb2.setFont(fuente);
        panel.add(rb2);
        
        rb3.setText("BÁSQUETBOL");
        rb3.setBounds(10, 300, 180, 40);
        rb3.setFont(fuente);
        panel.add(rb3);
        
        rb4.setText("HOCKEY");
        rb4.setBounds(10, 400, 180, 40);
        rb4.setFont(fuente);
        panel.add(rb4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        
        colocarImagen();
  
    }
    
    public void colocarImagen(){
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
        
        rb1.addActionListener(accion1);
        rb2.addActionListener(accion2);
        rb3.addActionListener(accion3);
        rb4.addActionListener(accion4);
    }
    
        ImageIcon imagenBeisbol = new ImageIcon(getClass().getResource("/imagenes/béisbol.jpg"));
        ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/imagenes/fútbol.jpg"));
        ImageIcon imagenBasquetbol = new ImageIcon(getClass().getResource("/imagenes/básquetbol.jpg"));
        ImageIcon imagenHockey = new ImageIcon(getClass().getResource("/imagenes/hockey.png"));
        
        
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
                imagen2.setIcon(new ImageIcon(imagenFutbol.getImage().
                        getScaledInstance
                        (imagen2.getWidth(), imagen2.getHeight(), Image.SCALE_SMOOTH)));
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
                imagen4.setIcon(new ImageIcon(imagenHockey.getImage().
                        getScaledInstance
                        (imagen4.getWidth(), imagen4.getHeight(), Image.SCALE_SMOOTH)));
                }
        };
         
}
