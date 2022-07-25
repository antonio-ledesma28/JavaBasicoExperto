
package paquete1;

public class Cuadrado extends FiguraCerrada{
    
    final double area;

    public Cuadrado(double area, int nLados, double tamaño) {
        super(nLados, tamaño);
        this.area = area;
    }
    
    public void dibujar(){
        System.out.println("Dibujando un cuadrado");
    }
}
