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
public class TesterFiguras {

    public static void main(String[] args) {
        for (int hola = 0; hola < 5; hola++) {
            Scanner fig = new Scanner(System.in);
            System.out.println("Seleccione 1 si desea el área del cuadrado, "
                    + "2 si desea el área del rectagunlo +"
                    + "3 si desea el area del circulo"
                    + "4 si desea salir del ejercicio");
            int figuradeseada = fig.nextInt();

            switch (figuradeseada) {
                case 1:
                    Figuras a = new Figuras();
                    int resultado = a.cuadrado(2, 4);
                    System.out.println("El area de su figura corresponde a " + resultado);

                    break;

                case 2:
                    Figuras b = new Figuras();
                    double result = b.rectangulo(5, 2);
                    System.out.println("El area de su figura corresponde a " + result);

                    break;

                case 4:
                    System.out.println("Muchas gracias por su atención");
                    break;

                default:
                    System.out.println("El dato seleccionado es inválido");
            }
        }
    }

}

//Figuras k= new Figuras();
//int area= k.cuadrado(2, 3);
//System.out.println("El resultado del área del cuadrado es"+area);
//double arearec=k.rectangulo(3, 1);
//System.out.println("El resultado del área del réctagulo es"+arearec);

