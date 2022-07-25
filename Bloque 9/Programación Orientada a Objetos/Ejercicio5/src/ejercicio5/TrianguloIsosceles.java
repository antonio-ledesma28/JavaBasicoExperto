/*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
             Para ello defina los atributos necesarios que se requieren,
             proporcione métodos de consulta, un método constructor e implemente
             métodos para calcular el perímetro y el área de un triángulo,
             además, implementar un método que a partir de un arreglo de
             triángulos devuelva el área del triángulo de mayor suferficie.
 */
package ejercicio5;

public class TrianguloIsosceles {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double perimetro(){
        double perimetro = (2*lado)+base;
        return perimetro;       
    }
    public double area(){
        double raiz = Math.sqrt(Math.pow(lado, 2)- (Math.pow(base, 2))/4);
        double area = (base/2)*raiz;
        return area;
    }
    public String mostrarDatos(){
        return "El lado es: "+lado+"\nLa base es: "+base+
                "\nEl area es: "+area()+"\nEl perímetro es: "+perimetro();
    }
    
}
