/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MispracticasDOWHILE_WHILE_CONT_FOR;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class condicionalespractica  {
    public static void main(String[]args)
    { 
        
        int numentero;
        Scanner evaluar = new Scanner(System.in);
        System.out.println("Introduzca un numero para evaluar su aplicación");
        
        numentero = evaluar.nextInt();
        
        if((numentero % 2 == 0)||(numentero % 3 == 0))
            System.out.println("Felicidades su numero aplica ya que es multiplo de 2 o de 3");
        else
            System.out.println("Lo sentimos usted no aplica a este concurso, este numero no es multiplo ni de 2 ni de 3");
          }
  
                   
    }

