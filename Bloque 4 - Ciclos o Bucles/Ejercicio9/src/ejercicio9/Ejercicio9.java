/*
Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7 
 */
package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("El programa te mostrará los números del 100 al 0\n"
                + "Reduciendo de 7 en 7");
        for(int i=100;i>=0;i-=7){
            System.out.println("Número: "+i);
        }
    }
    
}
