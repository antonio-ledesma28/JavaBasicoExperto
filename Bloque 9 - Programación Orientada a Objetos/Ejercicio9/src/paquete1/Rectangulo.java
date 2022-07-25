
package paquete1;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public int getnLados() {
        return nLados;
    }
    @Override
    public double area(){
        double area = lado1*lado2;
        return area;
    }

    @Override
    public String toString() {
        return "El rectángulo tiene "+super.nLados+" lados y son: "+ lado1 + "y " + lado2;
    }
    
    
    
}
