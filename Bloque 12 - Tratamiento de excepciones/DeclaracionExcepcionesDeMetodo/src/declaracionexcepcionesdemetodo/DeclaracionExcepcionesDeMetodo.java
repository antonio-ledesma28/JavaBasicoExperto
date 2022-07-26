// Declaración de las excepciones de un método
package declaracionexcepcionesdemetodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclaracionExcepcionesDeMetodo {

    public void leerArchivo() throws FileNotFoundException { //Se utiliza cuando se desea capturar el error en otro método
        File archivo = new File("c:\\Prueba\\Prueba.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException {//Se utiliza cuando se desea capturar el error en otro método
        leerArchivo();
    }

    public static void main(String[] args) {

    }

}
