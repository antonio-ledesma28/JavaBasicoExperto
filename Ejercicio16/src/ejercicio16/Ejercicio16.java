/*
Ejercicio 16: Queremos desarrollar una aplicación que nos ayude a gestionar las 
              notas de un centro educativo. Cada grupo (o clase) está compuesto
              por 5 alumnos. Se pide leer las notas del primer, segundo y tercer 
              trimestre de un grupo. Debemos mostrar al final: la nota media del
              grupo en cada trimestre, y la media del alumno que se encuentre en
              la posición N (N se lee por teclado).
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        float primer[],segundo[],tercero[];
        float mediaPrimer, mediaSegundo, mediaTercero, mediaAlumno;
        float sumaPrimer=0, sumaSegundo=0, sumaTercero=0;
        int n;
        
        primer= new float[5];
        segundo = new float[5];
        tercero = new float[5];
        
        System.out.println("Bienvenido. Ingresa las notas de tus alumnos");
        
        
//Ingresamos las calificaciones de cada alumno por trimestre
        System.out.println("\nPrimer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno "+(i+1)+": ");
            primer[i] = entrada.nextFloat();
            sumaPrimer+=primer[i];
        }
        System.out.println("\nSegundo trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno "+(i+1)+": ");
            segundo[i] = entrada.nextFloat();
            sumaSegundo+=segundo[i];
        }
        System.out.println("\nTercer trimestre");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno "+(i+1)+": ");
            tercero[i] = entrada.nextFloat();
            sumaTercero+=tercero[i];
        }
       
        
//Calculamos la media por trimestre del grupo
        mediaPrimer = sumaPrimer/5;
        mediaSegundo = sumaSegundo/5;
        mediaTercero = sumaTercero/5;
        

//Imprimimos las calificaciones de cada alumno por trimestre
        System.out.println("\nLa notas del primer trimestre del grupo son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno "+(i+1)+": "+primer[i]);
        }
        System.out.println("\nLa notas del segundo trimestre del grupo son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno "+(i+1)+": "+segundo[i]);
        }
        System.out.println("\nLa notas del tercer trimestre del grupo son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno "+(i+1)+": "+tercero[i]);
        }
         
//Mostramos las notas medias por trimestre
        System.out.println("\nLa nota media del primer trimestredel grupo es: "+mediaPrimer);
        System.out.println("La nota media del segundo trimestre del grupo es: "+mediaSegundo);
        System.out.println("La nota media del tercero trimestre del grupo es: "+mediaTercero);      
        
//Pedimos el número de alumno que quieran saber sus nota media de los 3 trimestres
        do{
            System.out.print("\nDigita el número (1-5) del alumno que deseas saber"
                    + " su nota media de los 3 trimestres: ");
            n = entrada.nextInt();
            
            if(n<=0 || n>5){
                System.out.println("El número de alumno que introdujiste"
                        + "no es válido");
            }
        }while(n<=0 || n>5);
        
        mediaAlumno = (primer[n-1]+segundo[n-1]+tercero[n-1])/3;
        
//Imprimimos la media del alumno
System.out.println("\nLa media del alumno "+n+" es: "+mediaAlumno);
    }
    
}
