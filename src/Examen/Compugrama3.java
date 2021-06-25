/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author diana
 */
public class Compugrama3 {

    public static void main(String[] args) {

        
        for (int hola = 0; hola < 5; hola++) {
            for (int hola1 = 0; hola1 < 5; hola1++) {
                if(hola==0||hola1==0){
                    
                    System.out.print("*");
                }
                else if (hola==4||hola1==4){
                        System.out.print("*");
                        }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            }
}}
