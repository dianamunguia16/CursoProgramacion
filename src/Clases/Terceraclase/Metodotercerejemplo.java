package Clases.Terceraclase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Metodotercerejemplo {
       
    /**
     *En este metodo calcularemos la suma de dos numeros enteros
     * @param numero1
     * @param numero2
     * @return suma de numeros enteros
     */

       public static int sumar(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
                }
     
    /**
     * En este método calcularemos la suma de dos numeros flotantes
     * @param numero1
     * @param numero2
     * @return la suma de los nomeros tipo float
     */
  
       public static float sumar (float numero1, float numero2){
        float resultado;
        resultado = numero1 + numero2;
        return resultado;
                }

    /**
     *En este metodo calcularemos la multiplicacion de numeros enteros
     * @param numero1
     * @param numero2
     * @param numero3
     * @return el resultado de la multiplicacion de numeros enteros
     */
    public static int multiplicar  (int numero1, int numero2, int numero3){
          int resultado;
          resultado= numero1 * numero2 * numero3;
          return resultado;
        }
        
   public static void main(String[]args){
       int salarioBase = (int) 1231231.22f;
       int bonoVentas = (int) 2343453.22f;
          
          float resultadoJefe;
          
          resultadoJefe = sumar(salarioBase,bonoVentas);
   System.out.println(resultadoJefe); 
   }   
    
}

