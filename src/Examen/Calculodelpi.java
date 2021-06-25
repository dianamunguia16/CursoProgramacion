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
public class Calculodelpi {

    public static void main(String[] args) {
        double resultado = Pi(5);
        System.out.println("El calculo de Pi corresponde a  " + resultado);

        //Utilizamos metodo main
    }

    public static boolean denominador(int num1) {
        boolean resultado = num1 % 2 != 0;
        return resultado;
    }
    

    public static double Pi(double valor) {
        double pi = 0;
        for (int i = 1; i <= 101; i++) {
            boolean resultadoesimpar = denominador(i);
            if (resultadoesimpar) {
                if (i == 3 || i == 7) {
                    pi = pi - (valor / i);
                } else {
                    pi = pi + (valor / i);
                }

            }

        }
        return pi;
    }
}
