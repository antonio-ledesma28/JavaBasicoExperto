/*
Clases Y Métodos final

Final en los métodos hace que no se pueda tener un método en la clase hija con
el mismo nombre en la clase padre.

Final las clase hace que esa clase ya no pueda hacer herencia(No tenga hijos)
*/
package paquete1;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(15.6,4,10);
        
        cuadrado.dibujar();
    }
}
