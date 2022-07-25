/*
*Ejercicio 2: Construir un programa que permite el movimiento de un objeto
              dentro de un tablero y actualice su posición dentro del mismo.
              Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA.
              Tras cada movimiento el programa mostrará la nueva dirección
              elegida y las coordenadas de situación del objeto del tablero.
*/
package paquete1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tablero t1;
        int x, y, opcion, incremento=0;
        System.out.print("Digite la coordenada inicial de x:");
        x = input.nextInt();
        System.out.print("Digite la coordenada inicial de y:");
        y = input.nextInt();
        
        //Posición inicial del objeto
        t1 = new Tablero(x, y);
        
        do{
            System.out.println("\nMENÚ:");
            System.out.println("1. Mover hacia arriba\n"
                    + "2. Mover hacia abajo\n"
                    + "3. Mover hacia la derecha\n"
                    + "4. Mover hacia la izquierda\n"
                    + "5. Salir");
            System.out.print("\nDigite la opción: ");
            opcion = input.nextInt();
            if(opcion !=5){
                System.out.print("Digite la cantidad de espacio a moverse: ");
                incremento = input.nextInt();  
            }   
            switch(opcion){
                case 1: 
                    t1.moverArriba(incremento);
                    break;
                case 2:
                    t1.moverAbajo(incremento);
                    break;
                case 3:
                    t1.moverDerecha(incremento);
                    break;
                case 4:
                    t1.moverIzquierda(incremento);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error, se equivocó de opción de menú");
                    break;
            }
            System.out.println("\nPosición actual del objeto: (X,Y): ("
                    + t1.getX()+" , "+t1.getY()+ ")");
        }while(opcion !=5);
    }
}
