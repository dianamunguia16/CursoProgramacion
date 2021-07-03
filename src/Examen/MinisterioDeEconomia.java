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
                System.out.println("Ingrese el nombre completo de la provincia donde se ubican sus trabajadores");
                provincia= nombr.nextLine();
                Scanner canttrabajador = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de trabajadores que han tenido covid 19");
                canttrabajcovid = nombr.nextBoolean();
                Scanner ingreso = new Scanner(System.in);
                System.out.println("Ingrese el monto ingreso promedio por mes");
                ingresopromedio= ingreso.nextDouble();
                Scanner credi = new Scanner(System.in);
                System.out.println("Su empresa cuenta con creditos actualmente");
                creditos = credi.nextBoolean();
                
                 break;
                 
                 
            case 2:
                 System.out.println("Sus datos corresponden a:"+nombre+provincia+ canttrabajcovid+ingresopromedio+creditos);
        }

    }
}
