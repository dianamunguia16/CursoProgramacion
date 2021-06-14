/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_trabajo_en_clase_primera_segunda_semanas;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class Concatenar2 {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Universidad Latina de Costa Rica");
        System.out.println("Ingieneria en sistemas");
        System.out.println("Programacion");
        System.out.println();
        System.out.println("Favor digite un numero ");

        int num2 = escaner.nextInt();
        System.out.println("Favor digite otro numero ");

        int box1 = escaner.nextInt();

        System.out.println("resultado: ");
        String nombre = "Diana Munguia";

        // OJO AQUI ETAMOS DECLARANDO ESTA VARIABLE PERO SE PUEDE NO USAR String resultado = nombre +" "+ num2 + " "+ box1;
        System.out.println(nombre + " " + num2 + " " + box1);
    }

}

