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
public class PruebaBreak
 {
 public static void main(String[] args)
 {
 int cuenta; // l a variable de control también se usa cuando termina el ciclo

 for (cuenta = 1; cuenta <= 10; cuenta++) // itera 10 veces
 {
        if ( cuenta == 5 ){
            break; // termina el ciclo si cuenta es 5
        }
 System.out.printf("%d ", cuenta);
 }

 System.out.printf("%nSalio del ciclo en cuenta = %d%n", cuenta);
 }
 } 