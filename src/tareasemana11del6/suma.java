/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

/**
 *
 * @author diana
 */
public class suma {
    
    public static void main(String[]args){
        
        int total = 0;
                // En este procedimiento vamos a sumar el total de los enteros pares del 2 al 20
                for(int numero = 2; numero <=20; numero+=2)
                    total+=numero;
                
                System.out.printf("La suma es %d%n", total);
                
                
    }
    
}
