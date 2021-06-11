/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class ImpuestoRenta {
   
    static Scanner escaner = new Scanner(System.in);     
    public static void main(String[] args) {
        int vContinua = 0; //Variable para saber si el programa debe de seguir ejecutandose :) 0 Se ejecuta 1 no se ejecuta
        try{
        do{
      double vSalario = 0;
      int vDependientes = 0;
      
      System.out.println("Favor ingrese el numero de dependientes");
      vDependientes = escaner.nextInt();
      
      System.out.println("Favor ingrese el salario");
      vSalario = escaner.nextDouble();
      
       System.out.println("El IR que debe de pagar es de : " + calcularImpuesto(vDependientes,vSalario));   
       System.out.println("\n\nDigite un 0 para ingresar oro registro o un 1 para salir"); 
       vContinua = escaner.nextInt();
        }while (vContinua == 0);
        }catch (Exception e){
            e.printStackTrace();
           }
    } 
      
     static public double calcularImpuesto(int numDependientes, double salario){  
      double impuesto,gravable;
      gravable = salario * devuelve_porcentage_gravable(numDependientes);
      impuesto = gravable * devuelve_porcentage_ir(gravable);
      return impuesto;   
     }
      static public double devuelve_porcentage_ir (double gravable) {
      double vIr;
          if (gravable < 200000){
              vIr = 0;
          }
          else if (gravable <= 200000 && gravable < 400000) {
          vIr = 0.1;
          }
          else if (gravable <= 400000 && gravable < 600000) {
          vIr = 0.15;
          }
          else if (gravable <= 600000 && gravable < 800000) {
          vIr = 0.2;
          }
          else{
          vIr = 0.3;
          }
          return vIr;
      }
     static public double devuelve_porcentage_gravable (int numDependientes) {
     double Porcentaje[] = {1,0.9,0.7,0.6,0.4};
     int vPosicion;
     vPosicion = switch (numDependientes) {
            case 1 -> 0;
            case 2 -> 1;
            case 3 -> 2;
            case 4 -> 3;
            default -> 4;
        };
     
    /* if (numDependientes == 1){
     vPosicion = 0;
     }
     else if (numDependientes == 2){
      vPosicion = 1;
     }
       else if (numDependientes == 3){
      vPosicion = 2;
     }
       else if (numDependientes == 4){
      vPosicion = 3;
     }
       else{
            vPosicion = 4;
       }*/
     return Porcentaje[vPosicion];
     }

}
