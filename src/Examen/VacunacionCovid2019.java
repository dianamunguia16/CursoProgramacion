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
public class VacunacionCovid2019 {

    public static void main(String[] args) {

        System.out.println("Favor digite su nombre");
        Scanner nom = new Scanner(System.in);
        String nombre = nom.nextLine();

        System.out.println("Favor digite su apellido");
        Scanner ap = new Scanner(System.in);
        String apellido = ap.nextLine();

        System.out.println("Favor digite su edad");
        Scanner ed = new Scanner(System.in);
        int edad = ed.nextInt();

        System.out.println("Favor digite 1 si usted es positivo en covid y dos si es negativo");
        Scanner salud = new Scanner(System.in);
        int covid = salud.nextInt();
    }
}
