/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.Terceraclase;

/**
 *
 * @author diana
 */
import java.util.Scanner;
        
public class Calculadora {
    
       
public static int sumar(int a, int b){
int resultado;
resultado = a + b;
return resultado;
  }


 public static void main(String []args){
      int numero1;
      int numero2;
      int resultado;          
     Scanner Diana = new Scanner(System.in);
    
                
     System.out.println("Favor digite el primer número: ");
           numero1 = Diana.nextInt();
     System.out.println("Favor digite el segundo numero");
            numero2= Diana.nextInt();
           resultado = sumar(numero1, numero2);
           
           System.out.println("Resultado es; " + resultado);  
}
   
   
}
