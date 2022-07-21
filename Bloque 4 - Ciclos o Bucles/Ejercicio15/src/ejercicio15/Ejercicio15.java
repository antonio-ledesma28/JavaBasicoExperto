/*
Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la
estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de 
alumnos que miden más de 1.75
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad,conteoEdadMayor=0,conteoEstaturaMayor=0;
        float estatura, edadMedia, estaturaMedia,sumaEdad=0,sumaEstatura=0;
        
        System.out.println("Ingrese los datos de 5 alumnos");
        for(int i =1;i<=5;i++){
            System.out.print("Ingrese la edad del alumno "+i+" : ");
            edad = entrada.nextInt();
            System.out.print("Ingrese la estatura del alumno "+i+" : ");
            estatura = entrada.nextFloat();
            
            sumaEdad+=edad;
            sumaEstatura+=estatura;
            
            if(estatura>1.75){
                conteoEstaturaMayor++;
            }
            if(edad>18){
                conteoEdadMayor++;
            }
        }
        edadMedia=sumaEdad/5;
        estaturaMedia=sumaEstatura/5;
        
        System.out.println("\nLa edad media de los 5 alumnos es: "+edadMedia);
        System.out.println("La estatura media de los 5 alumnos es: "+estaturaMedia);
        System.out.println("La cantidad de alumnos mayores de 18 años es de: "
                + ""+conteoEdadMayor);
        System.out.println("La cantidad de alumnos que miden más de 1.75 es de: "
                + ""+conteoEstaturaMayor);
    }
    
    
}
