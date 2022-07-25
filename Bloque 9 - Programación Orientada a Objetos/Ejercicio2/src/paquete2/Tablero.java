/*
*Ejercicio 2: Construir un programa que permite el movimiento de un objeto
              dentro de un tablero y actualice su posición dentro del mismo.
              Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA, DERECHA.
              Tras cada movimiento el programa mostrará la nueva dirección
              elegida y las coordenadas de situación del objeto del tablero.
*/
package paquete2;

public class Tablero {
    private int x;
    private int y;
    
    public Tablero(int x, int y){
        this.x = x;
        this.y = y; 
        
    }
    
    public void arriba(int incremento){
        y+= incremento;
    }
    public void abajo(int incremento){
        y-= incremento;
    }
    public void derecha(int incremento){
        x+= incremento;
    }
    public void izquierda(int incremento){
        y-= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
