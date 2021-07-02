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
public class MinisterioDeEconomia {

    public static void main(String[] args) {

        String nombre = "";
        String provincia = "";
        int cantidadtrabajadores = 0;
        boolean canttrabajcovid = true;
        double ingresopromedio = 0;
        boolean creditos = true;

        Scanner economi = new Scanner(System.in);

        System.out.println("Seleccione la opcion de su interes\n1-Ingrese su informacion\2-Conozca su informacion");
        int opc = economi.nextInt();

        switch (opc) {

            case 1:
                Scanner nombr = new Scanner(System.in);
                System.out.println("Ingrese el nombre completo de su empresa");
                nombre = nombr.nextLine();
                Scanner prov = new Scanner(System.in);
                System.out.println("Ingrese el nombre completo de su empresa");
                nombre = nombr.nextLine();
                Scanner canttrabajador = new Scanner(System.in);
                System.out.println("Ingrese el nombre completo de su empresa");
                canttrabajcovid = nombr.nextBoolean();

        }

    }
}
