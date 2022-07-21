/*
Ejercicio 22: Pedir 5 calificaciones y decir al final si hay algún suspenso
 */
package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);       
        int calificacion;
        boolean suspenso = false;
        
        System.out.println("Ingresa 5 calificaciones");
        
        for (int i = 1; i <= 5; i++) {
            do{
            System.out.print(i+". Calificación: ");
            calificacion = entrada.nextInt();
            if(calificacion<0 || calificacion >10){
                System.out.println("Calificación fuera de rango.\n"
                        + "Vuelve a digitarla");
            }
            }while(calificacion<0 || calificacion >10);
            
            switch(calificacion){
                case 0:
                case 1:
                case 2:
                case 3:
                    suspenso= true;
                    break;
            }    
        }
        if(suspenso==true){
            System.out.println("Hay algún alumno suspendido");
        }
        else{
            System.out.println("NO hay ningún alumno suspendido");
        }
    }
    
}
