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
public class Bisiestoyear {
    
    public static void main(String[]args){
        //primero le pedimos al usuario el año deseado
      Scanner year =new Scanner(System.in);
      System.out.println("Ingrese el año deseado");
      int knowyear =year.nextInt();
      
      //Ahora aplicamos condicionales para que pueda ejecutar nuestro código
      if (knowyear%4==0&& knowyear%100!=0||knowyear%400==0){
          
          System.out.println("El año ingresado si es bisiesto");
      }
      else{
          
    }       System.out.println("El año ingresado no es bisiesto");
      
    
}}
