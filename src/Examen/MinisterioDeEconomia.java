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
        
        int contatrabco=0;
        double poblacion=0;
        System.out.println("Seleccione la opcion de su interes\n1-Ingrese su informacion\2-Conozca su informacion\n"
                + "3-cantidad de personas por provincia\n4-conozca su limite de credito");
        int opc = economi.nextInt();

        switch (opc) {

            case 1:
                
                System.out.println("Ingrese el nombre completo de su empresa");
                nombre = economi.nextLine();
                System.out.println("Ingrese el nombre completo de la provincia donde se ubican sus trabajadores");
                provincia= economi.nextLine();
                Scanner canttrabajador = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de trabajadores que han tenido covid 19");
                canttrabajcovid = economi.nextBoolean();
                if(canttrabajcovid)
                    contatrabco++; // ESTO ES PARA CUENTE LOS TRABAJADORES CON COVID
 
                System.out.println("Ingrese el monto ingreso promedio por mes");
                ingresopromedio= economi.nextDouble();
                System.out.println("Su empresa cuenta con creditos actualmente");
                creditos = economi.nextBoolean();
                
                 break;
                 
                 
            case 2:
                 System.out.println("Sus datos corresponden a:"+nombre+provincia+ canttrabajcovid+ingresopromedio+creditos);
                 if(contatrabco==20)
                     System.out.println("ALERTA ESTO PODRIA EXPONER LA SALUD DE SUS TRABAJADORES");
                     
                 break;
                 
            case 3:
                provincias(provincia,poblacion);
                 
                break;
            case 4:
                
                double limitcredit=0;
                while(limitcredit<1000){
                    double totalcredito= (contatrabco/cantidadtrabajadores*poblacion);
                     }
           case 5: 
                    
                    if(canttrabajcovid>10&&<0)
                    
                
                break;
                
                 }
        }
        

    //PRIMER METODO QUE APLIC
        public static void provincias(String provincia,double poblacion){
    
                if(provincia=="Alajuela"){
                    poblacion =848146;
                
                }
                else if (provincia=="San Jose"){
                    poblacion = 1404242;
                }
                
                else if (provincia=="Cartago"){
                    poblacion = 490903;
                }
                else if (provincia=="Heredia"){
                    poblacion = 433677;
                }
                else if (provincia=="Guanacaste"){
                    poblacion = 326953;
                }
                else if (provincia=="Puntarenas"){
                    poblacion = 410929;
                }
                 else if (provincia=="Limon"){
                    poblacion = 386862;
                }
                 else{ 
                 System.out.println("EL DATO SELECCIONADO ES INVALIDO");
                 }
    
    
    }

 }

 
