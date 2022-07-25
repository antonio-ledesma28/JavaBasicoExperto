/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos,
             implemente el siguiente menú:

             1. Sumar dos números complejos
             2. Multiplicar 2 números complejos.
             3. Comparar 2 números complejos(iguales o no).
             4. Multiplicar un número complejo por un entero.
 */
package ejercicio6;

public class NumeroComplejo {
    //Número complejo: 3 + 4i
    private double a; //Parte real
    private double b;  //Parte imaginaria
    
    public NumeroComplejo(double a, double b){    
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    /*
        numero1 = 3 + 4i;
        numero2 = 2 + 5i;
    
        suma = 5 + 9i;
    
        NumeroComplejo numero1 = new NumeroComplejo(3,4);
        numero1.suma(numero2);
    */
    
    public NumeroComplejo suma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(),b+c.getB());
        return suma;       
    }
    /*
        numero1 = 3 + 4i;
        numero2 = 2 + 5i;
    
        mult = (3*2 - 4*5) + (3*5 + 4*2)i
    */
    
    public NumeroComplejo producto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo(a*c.getA()- b*c.getB(), a*c.getB()+b*c.getA());
        return mult;
    }
    
    /*
        numero1 = 3 + 4i;
        numero2 = 2 + 5i;
    */
    
    public boolean igualdad(NumeroComplejo c){
        boolean igualdad = false;
        if(a==c.getA() && b == c.getB()){
            igualdad = true;        
        }
        return igualdad;
    }
    /*
        numeroComplejo = 3+4i;
        entero = 2;
    
        mult = 6 + 8i;
    */
    
    public NumeroComplejo multiplicarEntero(int x){
        NumeroComplejo mult = new NumeroComplejo(a*x, b*x);
        return mult;
    }
}
