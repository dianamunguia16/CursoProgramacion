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
public class CondicionalesDOWHILEpractica {
    public static void main(String[]args)
    { int repetir = 0;
    do{
        
        int numentero;
        Scanner evaluar = new Scanner(System.in);
        System.out.println("Introduzca un numero para evaluar su aplicación");
        
        numentero = evaluar.nextInt();
        
        if(numentero % 2 == 0)
            System.out.println("Felicidades su numero aplica para este concurso");
        else
            System.out.println("Lo sentimos usted no aplica a este concurso");
          } while (repetir == 0);
                   
    
        
}
    }
