//Uso de throw para excepciones personalizadas

package throwexcepcionespersonalizadas;

import java.util.Scanner;

public class ThrowExcepcionesPersonalizadas {
    private int numero;
    private Scanner entrada;
    
    public void introducirNumeros() throws Excepcion0{
        entrada = new Scanner(System.in);
        do{
            System.out.print("Digite un número: ");
            numero = entrada.nextInt();
            
            if(numero==0){//Quiero que se produzca una excepción personalizada
                throw new Excepcion0();
            }
            
        }while(numero!=0 && numero != 1);
    }
    

    public static void main(String[] args) throws Excepcion0{
        ThrowExcepcionesPersonalizadas prueba = new ThrowExcepcionesPersonalizadas();
        
        try{
          prueba.introducirNumeros();  
        }catch(Excepcion0 e){
            System.out.println("Se ha introducido el número 0");
        }
        System.out.println("Programa terminado");
    }
    
}
