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
public class Testercalculadoraavanzada {
    public static void main(String[] args) {
        CalculadoraAvanzada D= new CalculadoraAvanzada();
        int Diosayuda = D.Calculofactorial(5);
        System.out.println("El resultado de su calculo factorial es"+Diosayuda);
    
    
    
   // public static void main(String[] args) {
     //   CalculadoraAvanzada r= new CalculadoraAvanzada();
       int Diosayuda2 = D.numeromaximo(4);
       System.out.println("El numero máximo es "+Diosayuda);
         D.invertirnum(8);
         

}
}