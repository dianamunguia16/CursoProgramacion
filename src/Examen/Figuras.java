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

//Haga un programa que permita a un usuario calcular el área de:

	//Un cuadrado A= L*L
	//Un rectángulo A=(b*h)/2
	//Un círculo A= (PI*R)2



//1.1.	Identifique las variables requeridas para el cálculo del área 
public class Figuras {
    public int cuadrado(int lado1,int lado2){
        int resultado;
        resultado = lado1*lado2;
        return resultado;
    }
    
    
    //1.3.	Defina un método para el cálculo del área (areaRect (int lado, int ancho))
    public double rectangulo(double base,double altura){
        double resultado;
        resultado= (base*altura)/2;
        return resultado;}
    
    }
    
    //1.4.	Defina un método para el cálculo del área de un círculo
    /*public double circulo(double pi, double radio){
        int resultado;
        pi=3.14;
        radio=*/
    

