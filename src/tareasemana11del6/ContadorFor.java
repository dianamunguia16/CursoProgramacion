/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasemana11del6;

/**
 *
 * @author diana
 */
public class ContadorFor {
    public static void main (String []args ){
        
        //Según se indica el ejemplo for a diferencia del while el encamnbezado cuenta con  la inicialización
        // condición para continuar el ciclo y el incremento, todo esto en la misma linea
        
        for( int contador = 1; contador <=10; contador++  ) // recordar que tambien podemos usar +1 en vez de ++ ya que es lo 
            // mismo.
            System.out.printf("%d ", contador);
        {
             System.out.println();  
    }
        
       
    }

}