
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para pedir al usuario que digite dos números
    public void leerNumeros(){
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));
    }
    
    //Método que suma los 2 números
    public void sumar(){
        suma=numero1+numero2;
    }
    
    //Método que resta los 2 números
    public void restar(){
        resta=numero1-numero2;
    }
    
    //Método que multiplica los 2 números
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    
    //Método que divide los 2 números
    public void dividir(){
        division=numero1/numero2;
    }
    
    //Método para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
    
    
}
