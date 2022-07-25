/*
*Ejercicio 2: Construir un programa que permite el movimiento de un objeto
              dentro de un tablero y actualice su posición dentro del mismo.
              Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA.
              Tras cada movimiento el programa mostrará la nueva dirección
              elegida y las coordenadas de situación del objeto del tablero.
 */
package paquete2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, posicion, movimiento, incremento;

        System.out.print("Ingresa la posición inicial de tu objeto en x: ");
        x = entrada.nextInt();
        System.out.print("Ingresa la posición inicial de tu objeto en y:");
        y = entrada.nextInt();

        Tablero tb = new Tablero(x, y);

        do{
        System.out.print("Ingresa Hacia dónde quieres mover el objeto: ");
        movimiento = entrada.nextInt();
        System.out.println(
                "1. ARRIBA\n"
                + "2. ABAJO\n"
                + "3. IZQUIERDA\n"
                + "4. DERECHA\n"
                + "5. SALIR");

        switch (movimiento) {
            case 1:
                System.out.print("Cuántos espacios quieres mover ese "
                        + "elemento hacia arriba:");
                incremento = entrada.nextInt();
                tb.abajo(incremento);
                break;
            case 2:
                System.out.print("Cuántos espacios quieres mover ese "
                        + "elemento hacia abajo:");
                incremento = entrada.nextInt();
                tb.abajo(incremento);
                break;
            case 3:
                System.out.print("Cuántos espacios quieres mover ese "
                        + "elemento hacia izquierda:");
                incremento = entrada.nextInt();
                tb.abajo(incremento);
                break;
            case 4:
                System.out.print("Cuántos espacios quieres mover ese "
                        + "elemento hacia derecha:");
                incremento = entrada.nextInt();
                tb.abajo(incremento);
                break;
            case 5:
                System.out.print("Saliendo del programa:");
                break;
            default:
                System.out.println("Valor fuera de rango. Digita un valor válido");
        }
        System.out.println("\nLas coordenadas actuales del objeto son: ");
        System.out.println("Objeto (x,y): ("+tb.getX()+","+tb.getY()+")");
        }while(movimiento != 5);
    }
}
