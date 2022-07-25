/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y
             Rectángulos). El programa debe ser capaz de almacenar en un 
             arreglo N triángulos y rectángulos, y al final mostrar el área y 
             los datos de cada uno. Para ello se tendrá lo siguiente:

             -Una super clase llamada Polígono
             -Una sub clase llamada Rectángulo
             -Una sub clase llamada Triángulo
 */
package paquete2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    //Arreglo dinámico de objetos de tipo Poligono
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    public static void main(String[] args) {
        menu();
        mostrarResultados();
        finPrograma();

    }

    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.print("Ingresa el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingresa el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        System.out.print("Ingresa el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingresa el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Ingresa el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }

    public static void menu() {
        int opcion;
        char caracter;
        System.out.println("¡¡¡BIENVENIDO A LA CALCULADORA DE POLÍGONOS!!!\n");
        do {
            do {
                System.out.println("\nIngrese la figura que desea calcular\n"
                        + "1.Triángulo.\n"
                        + "2.Rectángulo.\n"
                        + "3.Salir");
                System.out.print("\nOpción: ");
                opcion = entrada.nextInt();
                if(opcion < 1 || opcion > 3){
                    System.out.println("\nOpción erronea. Vuelve a digitar");
                }
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;

            }
            if(opcion !=3){
            System.out.print("\n¿Desea introducir otro polígono? (S/N): ");
            caracter = entrada.next().charAt(0);
            }
            else{
                caracter = 'N';
            }
        } while (caracter == 's' || caracter == 'S');

    }

    public static void finPrograma() {
        System.out.println("\nPrograma finalizado");
    }

    public static void mostrarResultados() {
        for (Poligono pol : poligono) {
            System.out.println("");
            System.out.println(pol.toString());
            System.out.println("El área es: " + pol.area());
        }

    }

}
