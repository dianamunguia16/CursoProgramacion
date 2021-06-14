/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class EjercicioLab {
    public String factorriesgocovid (){
        String resultado;
        int factoresderiesgo;
            Scanner escaner = new Scanner(System.in);

        System.out.println("Favor ingrese su factor de riesgo con respecto al COVID-2019 (1,2,3)");
      factoresderiesgo = escaner.nextInt();
        
   if (factoresderiesgo==1){
   resultado=("Su cita será atendida dentro de una semana");// resultado
   }
   else if (factoresderiesgo ==2){
   resultado=("Su cita será atendida en 3 días");
   }
   else {
   resultado=("Su cita será atendida el día de mañana");
   }
   
    return resultado;
}

}
