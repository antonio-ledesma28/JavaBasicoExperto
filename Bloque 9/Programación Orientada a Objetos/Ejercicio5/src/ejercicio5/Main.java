/*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. 
             Para ello defina los atributos necesarios que se requieren,
             proporcione métodos de consulta, un método constructor e implemente
             métodos para calcular el perímetro y el área de un triángulo,
             además, implementar un método que a partir de un arreglo de
             triángulos devuelva el área del triángulo de mayor suferficie.
 */
package ejercicio5;

import java.util.Scanner;

public class Main {
    public static double mayorSuperficie(TrianguloIsosceles tri[]){
        double superficie;
        
        superficie = tri[0].area();
        for (int i = 1; i < tri.length; i++) {
            if(tri[i].area()> superficie){
                superficie = tri[i].area();
            }
        }
        return superficie;
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, base;
        int nTriangulos,indice;
        
        System.out.println("BIENVENIDO. Calcularemos el área y perímetro"
                + " de tus triángulos");
        System.out.print("Ingresa el número de triángulos que quieres calcular: ");
        nTriangulos = entrada.nextInt();
        
        //Instanciamos el arreglo de la clase TrianguloIsosceles
        TrianguloIsosceles tri[] = new TrianguloIsosceles[nTriangulos];
        
        for (int i = 0; i < tri.length; i++) {
            System.out.println("\nIngresa los valores del triángulo "+(i+1));
            System.out.print("Ingresa la base del triángulo: ");
            base = entrada.nextDouble();
            System.out.print("Ingresa el lado del triángulo: ");
            lado = entrada.nextDouble();
            
            tri[i] = new TrianguloIsosceles(base, lado);
            System.out.println("El perímetro es: "+tri[i].perimetro());
            System.out.println("El área es: "+tri[i].area());
        }
        System.out.println("\nEl área del triángulo de mayor superficie es:  "+
                mayorSuperficie(tri));
    }
    
}
