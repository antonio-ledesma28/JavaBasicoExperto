/*
Jerarquía de Excepciones

Throwable (Clase padre)
    -Error (Clase que hereda de Throwable y que se genera por fallas en el hardware)
    -Exception (Clase que hereda de Throwable y que se genera en la ejecución del programa)
        +IOException (Clase hija de Exception: Excepción Verificada
                      Excepción que el programador puede evadir, ya que
                      depende del usuario, si daña o retira algún archivo)
        +RunTimeException (Clase hija de Exception: Excepción no Verificada
                           Excepción que el programador no puede evadir, ya que
                           él puede solucionar el error)
 */
package jerarquíaexcepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JerarquíaExcepciones {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Lectura de un archivo de texto (.txt)
        /*BufferedReader bf = new BufferedReader(new FileReader("c:\\Prueba\\Prueba.txt"));
        String linea;
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);

        }
        */

        //Excepciones No verificadas (RunTimeException)
            //División entre cero
            int num1=5, num2=0,resultado;
            
            resultado = num1/num2;
            
            System.out.println(resultado);
    }
}
