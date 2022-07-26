// Declaración de las excepciones de un método
package trycatcheverificadas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class TryCatchEVerificadas {

    public void leerArchivo() throws FileNotFoundException, IOException { //Se utiliza cuando se desea capturar el error en otro método
        File archivo = new File("c:\\Prueba\\Prueba.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine()) != null){
        System.out.println(linea);
    }
    }

    public void leerArchivo2() {//Se utiliza cuando se desea capturar el error en otro método
        try{
           leerArchivo(); 
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo "
                    + "deseado, por favor verifique la ruta");
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
        }
        finally{ //Siempre se ejecuta, ya sea que el try sea exitoso o no
            
        }
        
        System.out.println("Programa terminado");
        
    }

    public static void main(String[] args) {
        TryCatchEVerificadas objeto = new TryCatchEVerificadas();
        objeto.leerArchivo2();
    }

}