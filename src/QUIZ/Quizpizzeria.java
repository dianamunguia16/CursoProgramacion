/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class Quizpizzeria {

    public static void main(String[] args) 
    {
      
        
        System.out.println("Digite 1 si desea agregar peperoni en su pedido y 2 si no lo desea en su orden");
        Scanner pizzaingre = new Scanner(System.in);
        int peperoni = pizzaingre.nextInt();

        System.out.println("Digite 1 si desea agregar quesochedar en su pedido y 2 si no lo desea en su orden");
        Scanner pizzaingre2 = new Scanner(System.in);
        int quesochedar = pizzaingre2.nextInt();

        System.out.println("Digite 1 si desea agregar jamón en su pedido y 2 si no lo desea en su orden");
        Scanner pizzaingre3 = new Scanner(System.in);
        int jamón = pizzaingre3.nextInt();

        System.out.println("Digite 1 si desea pizza grande o 2 si desea pizza pequeña");
        Scanner tamaño = new Scanner(System.in);
        int tamañopizza = tamaño.nextInt();
        
        peperoni=1200;
        quesochedar=1520;
        jamón=1500;
        tamañopizza=0;
        double precioppizzagrande = 12000;
        double preciopizzapequena=10000;
        if(tamañopizza==1){
            preciopizzagrande*0.40
                    
                
        }
    }
    

}
