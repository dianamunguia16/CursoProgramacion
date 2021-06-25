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
public class CalculadoraAvanzada {

    //primera parte
    public static float calcularpromedio(int a, int b, int c) {
        float total;
        total = a + b + c;
        total = total / 3;

        return total;
    }

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        float total;
        Scanner calcu = new Scanner(System.in);

        System.out.println("Favor digite el primer número: ");
        numero1 = calcu.nextInt();
        System.out.println("Favor digite el segundo numero");
        numero2 = calcu.nextInt();
        System.out.println("Favor digite el tercer número: ");
        numero3 = calcu.nextInt();

        total = calcularpromedio(numero1, numero2, numero3);
        System.out.println("El total de su calculo es" + total);
    }
    //segunda parte

    public int Calculofactorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    //tercera parte

    public int numeromaximo(int max) {

        Scanner maximos = new Scanner(System.in);
        String usuario = "";

        int resultado = 0;
        int valormax = 0;
        int totalnumeros = 0;
        for (int i = 0; i < max; i++) {
            System.out.println("Por favor, digite un numero:");

            int numerousuario = maximos.nextInt();

            if (i == 0) {
                valormax = numerousuario;
            } else {
                if (numerousuario > valormax) {
                    valormax = numerousuario;
                }
            }
            usuario += ("|" + valormax);
            totalnumeros = totalnumeros + numerousuario;
        }
        resultado = valormax;
        System.out.println("Los numeros digitados y promedio correspondiente son " + (totalnumeros / max));
        System.out.println(usuario);
        return resultado;
    }

    public void invertirnum(int numerousuario) {
        String ordennormal="";
        String ordeninvertido="";
        Scanner inv= new Scanner(System.in);
        for(int k=0; k< numerousuario; k++){
            
            int usuariodigita=inv.nextInt();
            
            ordennormal=ordennormal+"-"+usuariodigita;
            ordeninvertido=usuariodigita+"-"+ordeninvertido;
        }
        System.out.println("Los números ordenados de la manera correcta son"+ordennormal);
        System.out.println("Los números ordenados de manera invertida son"+ordeninvertido);
    }
}
