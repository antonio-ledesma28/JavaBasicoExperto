/*
Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados (=4) y suspensos.
 */
package ejercicio19;

import javax.swing.JOptionPane;

public class Ejercicio19 {

    public static void main(String[] args) {
        int alumnosAprovados=0,alumnosSuspenso=0,alumnosCondicionados=0,notas;
        
        
        for(int i=1;i<=6;i++){
        do{
            notas=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota"
                + "del alumno "+i));
           
        if(notas<0 || notas>10){
            System.out.println("Nota no válida");
        }
        
        }while(notas<0 || notas>10);
        switch(notas){
            case 0:
            case 1:
            case 2:
            case 3:
                alumnosSuspenso++;
                break;
            case 4:
                alumnosCondicionados++;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                alumnosAprovados++;
                        
            
        }
    }
        System.out.println("Los alumnos aprovados son: "+alumnosAprovados);
        System.out.println("Los alumnos condicionados son: "+alumnosCondicionados);
        System.out.println("Los alumnos suspensos son: "+alumnosSuspenso);
    }
    
}
