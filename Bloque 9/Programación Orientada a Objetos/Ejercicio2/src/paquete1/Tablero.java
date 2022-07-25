/*
*Ejercicio 2: Construir un programa que permite el movimiento de un objeto
              dentro de un tablero y actualice su posición dentro del mismo.
              Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA.
              Tras cada movimiento el programa mostrará la nueva dirección
              elegida y las coordenadas de situación del objeto del tablero.
*/
package paquete1;


public class Tablero {
    private int x;
    private int y;
    
    //Método constuctor
    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int incremento){
        y+=incremento;
    }
    public void moverAbajo(int incremento){
        y-=incremento;
    }
    public void moverIzquierda(int incremento){
        x-=incremento;
    }
    public void moverDerecha(int incremento){
        x+=incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
