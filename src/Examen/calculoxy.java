/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class calculoxy {
    
    public static void main(String[]args){
        Scanner kk = new Scanner(System.in);
        System.out.println("Favor digite el valor de X: ");
        int x =kk.nextInt();
         System.out.println("Favor digite el valor de y como exponente:");
        int y =kk.nextInt();
        int resultado = 1;
       for (int i = 1; i<=y; i++) {
       resultado = resultado * x;
       
       
        System.out.println("El resultado de su operación es:"+resultado);
}
 }}       
        
        
        
        
        
    
    
    
    
    
    

