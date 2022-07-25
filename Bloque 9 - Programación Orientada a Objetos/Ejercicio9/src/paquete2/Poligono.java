
package paquete2;

public abstract class Poligono {
    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    @Override
    public abstract String toString();
    
    
    public abstract double area();
}
