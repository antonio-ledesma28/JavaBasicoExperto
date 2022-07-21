/*
 Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un
número aleatorio entre 0-100, y luego ir pidiendo números indicando
"es mayor" o "es menor" segun sea mayor o menor con respecto a N. El proceso
termina cunado el usuario acierta y mostrar el número de intrentos.
 */
package ejercicio5;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num,introducido,contador=0;
        num=(int) (Math.random()*100);
        introducido = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido "
                + "al juego:\nIntroduce un valor"
                + " en el rango de 0 a 100:"));
        do{
            if(introducido<num){
                System.out.println("Tu número es menor. Digita uno mayor");
            }
            else{
                System.out.println("Tu número es mayor. Digita uno menor");
                
            }
        introducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor"
                + " en el rango de 0 a 100:"));
        contador++;
            
        }while(introducido!=num);
        System.out.println("Felicidades. Has ganado\nEl número es: "+num+" Tus"
                + " intentos fueron: "+contador);
    }
    
}
