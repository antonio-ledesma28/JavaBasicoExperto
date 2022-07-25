
package ClasesYObjetos;

public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método que suma los 2 números
    public void sumar(int numero1, int numero2){
        suma = numero1+numero2;
    }
    
    //Método que resta los 2 números
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }
    
    //Método que multiplica los 2 números
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1*numero2;
    }
    
    //Método que divide los 2 números
    public void dividir(int numero1, int numero2){
        division = numero1/numero2;
    }
    
    //Método para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}