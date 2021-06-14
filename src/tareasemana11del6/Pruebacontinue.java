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
public class Pruebacontinue
 {
 public static void main(String[] args)
 {
 for (int cuenta = 1; cuenta <= 10; cuenta++) // itera 10 veces
 {
 if (cuenta == 5)
 continue; // omite el resto del código en el ciclo si cuenta es 5

 System.out.printf("%d" , cuenta);
 }

 System.out.println("%nSe uso continue para omitir imprimir 5%n");
 } 
 } 
