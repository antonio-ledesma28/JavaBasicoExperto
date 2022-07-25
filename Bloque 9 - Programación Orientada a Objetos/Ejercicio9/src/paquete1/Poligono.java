
package paquete1;

public abstract class Poligono {
    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    @Override
    public String toString() {
        return "El polígono tiene "+nLados+" lados";
    }
    
    public abstract double area();
    
}
