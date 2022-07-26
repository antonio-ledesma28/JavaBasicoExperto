//Try catch para excepciones no verificadas

package trycatchenoverificadas;

import javax.swing.JOptionPane;

public class TryCatchENoVerificadas {
    
    public void operaciones(){
        int num1 = 5, num2 = 0;
        int res = num1/num2;
        
        System.out.println(res);
    }
    
    public void operaciones2(){
        
        try{
          operaciones();  
        } catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Error, ha intentado dividir "
                    + "un número entero entre 0");
        }
        
        System.out.println("Programa terminado");
    }

    public static void main(String[] args) {
        TryCatchENoVerificadas prueba = new TryCatchENoVerificadas();
        prueba.operaciones2();
    }
    
}
