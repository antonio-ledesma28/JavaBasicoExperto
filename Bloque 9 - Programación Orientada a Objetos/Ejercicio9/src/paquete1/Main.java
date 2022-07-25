/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y
             Rectángulos). El programa debe ser capaz de almacenar en un 
             arreglo N triángulos y rectángulos, y al final mostrar el área y 
             los datos de cada uno. Para ello se tendrá lo siguiente:

             -Una super clase llamada Polígono
             -Una sub clase llamada Rectángulo
             -Una sub clase llamada Triángulo
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Arreglo dinámico  
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    
   
    public static void main(String[] args) {
        //Llenar un polígono
        llenarPoligono();
        mostrarResultados();
    }
    //Mostrar los datos y el área de cada polígono
    //Recorremos el arreglo de polígonos
    public static void mostrarResultados(){
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("El área es: "+poli.area());
            System.out.println("");
        }
    }

    

//Llenar un polígono
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite qué polígono desea");
                System.out.println("1. Triángulo\n2. Rectángulo\n3. Salir\n");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);
            
            switch(opcion){
                case 1: //Llenar un triángulo
                    llenarTriangulo();
                    break;
                case 2: //Llenar un rectángulo
                    llenarRectangulo();
                    break;
            }
            System.out.print("¿Desea introducir otro polígono? S/N");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
            
        }while(respuesta =='s' || respuesta =='S');
 

    }
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        
        System.out.print("Digite el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del triángulo: ");
        lado3= entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Se almacena dentro del arreglo dinámico el objeto de la clase triángulo en un arreglo polígono
        poligono.add(triangulo);
        
    }
    
    
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("Digite el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        //Se almacena dentro del arreglo dinámico el objeto de la clase rectángulo en un arreglo polígono
        poligono.add(rectangulo);
    }
}
