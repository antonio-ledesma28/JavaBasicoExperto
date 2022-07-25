
package paquete1;
public class FiguraCerrada extends Figura{
    
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
    public void dibujar(){
        System.out.println("Dibujando una figura cerrada");
    }
}
